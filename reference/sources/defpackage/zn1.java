package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class zn1 {
    public final uj1 a = new uj1(new in1[16]);
    public final fj1 b = new fj1(10);

    public boolean a(tc1 tc1Var, t31 t31Var, ix0 ix0Var, boolean z) {
        uj1 uj1Var = this.a;
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((in1) objArr[i2]).a(tc1Var, t31Var, ix0Var, z) || z2;
        }
        return z2;
    }

    public void b(ix0 ix0Var) {
        uj1 uj1Var = this.a;
        int i = uj1Var.j;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((in1) uj1Var.h[i]).d.b == 0) {
                uj1Var.k(i);
            }
        }
    }
}
