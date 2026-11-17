package defpackage;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l62 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ m62 i;
    public final /* synthetic */ ArrayList j;

    public /* synthetic */ l62(m62 m62Var, ArrayList arrayList, byte b) {
        this.h = b;
        this.i = m62Var;
        this.j = arrayList;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        ArrayList arrayList = this.j;
        m62 m62Var = this.i;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        switch (b) {
            case 0:
                sQLiteConnection.getClass();
                m62Var.b.P(sQLiteConnection, arrayList);
                break;
            default:
                sQLiteConnection.getClass();
                m62Var.c.P(sQLiteConnection, arrayList);
                break;
        }
        return j23Var;
    }
}
