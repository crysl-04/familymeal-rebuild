package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class mb1 extends z43 {
    public static final g80 c = new g80((byte) 2);
    public final dm2 b = new dm2(0);

    @Override // defpackage.z43
    public final void d() {
        dm2 dm2Var = this.b;
        if (dm2Var.d() > 0) {
            dm2Var.e(0).getClass();
            li1.c();
            return;
        }
        int i = dm2Var.k;
        Object[] objArr = dm2Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        dm2Var.k = 0;
        dm2Var.h = false;
    }
}
