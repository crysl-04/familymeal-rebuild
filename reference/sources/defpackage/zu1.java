package defpackage;

import androidx.sqlite.SQLiteConnection;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zu1 implements AutoCloseable {
    public final bb2 h;
    public final String i;
    public final zp0 j;
    public final yq2 k = new yq2(new xu1(this, 0));

    public zu1(bb2 bb2Var, String str, zp0 zp0Var) {
        this.h = bb2Var;
        this.i = str;
        this.j = zp0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        yq2 yq2Var = this.k;
        if (yq2Var.i != vz1.y) {
            ((SQLiteConnection) yq2Var.getValue()).close();
        }
    }
}
