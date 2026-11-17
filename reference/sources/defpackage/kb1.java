package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class kb1 {
    public final qp1 h;
    public boolean i;
    public int j = -1;
    public final /* synthetic */ vi1 k;

    public kb1(vi1 vi1Var, qp1 qp1Var) {
        this.k = vi1Var;
        this.h = qp1Var;
    }

    public final void d(boolean z) {
        if (z != this.i) {
            this.i = z;
            int i = z ? 1 : -1;
            vi1 vi1Var = this.k;
            int i2 = vi1Var.c;
            vi1Var.c = i + i2;
            if (!vi1Var.d) {
                vi1Var.d = true;
                while (true) {
                    try {
                        int i3 = vi1Var.c;
                        if (i2 == i3) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    } catch (Throwable th) {
                        vi1Var.d = false;
                        throw th;
                    }
                }
                vi1Var.d = false;
            }
            if (this.i) {
                vi1Var.c(this);
            }
        }
    }

    public boolean g(jo0 jo0Var) {
        return false;
    }

    public boolean h() {
        return true;
    }

    public void f() {
    }
}
