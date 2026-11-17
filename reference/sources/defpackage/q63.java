package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q63 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ String i;

    public /* synthetic */ q63(String str, byte b) {
        this.h = b;
        this.i = str;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) throws Exception {
        byte b = this.h;
        String str = this.i;
        switch (b) {
            case 0:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM weight_entry WHERE person_id = ? ORDER BY date");
                try {
                    sQLiteStatementPrepare.bindText(1, str);
                    int iM = y02.m(sQLiteStatementPrepare, "person_id");
                    int iM2 = y02.m(sQLiteStatementPrepare, "date");
                    int iM3 = y02.m(sQLiteStatementPrepare, "weight_kg");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new s63(sQLiteStatementPrepare.getText(iM), sQLiteStatementPrepare.getText(iM2), sQLiteStatementPrepare.getDouble(iM3)));
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th) {
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            case 1:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection2.prepare("SELECT * FROM weight_entry WHERE person_id = ? ORDER BY date");
                try {
                    sQLiteStatementPrepare2.bindText(1, str);
                    int iM4 = y02.m(sQLiteStatementPrepare2, "person_id");
                    int iM5 = y02.m(sQLiteStatementPrepare2, "date");
                    int iM6 = y02.m(sQLiteStatementPrepare2, "weight_kg");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList2.add(new s63(sQLiteStatementPrepare2.getText(iM4), sQLiteStatementPrepare2.getText(iM5), sQLiteStatementPrepare2.getDouble(iM6)));
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    sQLiteStatementPrepare2.close();
                    throw th2;
                }
            default:
                dh2 dh2Var = (dh2) obj;
                dh2Var.getClass();
                bh2.f(dh2Var, str);
                return j23.a;
        }
    }
}
