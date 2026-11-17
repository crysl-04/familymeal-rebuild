package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o40 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;

    public /* synthetic */ o40(String str, String str2, byte b) {
        this.h = b;
        this.i = str;
        this.j = str2;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) throws Exception {
        byte b = this.h;
        j23 j23Var = j23.a;
        String str = this.j;
        String str2 = this.i;
        switch (b) {
            case 0:
                bh2.f((dh2) obj, str2 + ", " + str);
                return j23Var;
            case 1:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM shopping_check WHERE plan_id = ? AND ingredient_id = ?");
                try {
                    sQLiteStatementPrepare.bindText(1, str2);
                    sQLiteStatementPrepare.bindText(2, str);
                    sQLiteStatementPrepare.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            default:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection2.prepare("DELETE FROM weight_entry WHERE person_id = ? AND date = ?");
                try {
                    sQLiteStatementPrepare2.bindText(1, str2);
                    sQLiteStatementPrepare2.bindText(2, str);
                    sQLiteStatementPrepare2.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
        }
    }
}
