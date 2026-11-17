package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 implements re1 {
    public final int h;
    public transient Class i = null;
    public final int j;

    public w0(int i, int i2) {
        this.j = i;
        this.h = i2;
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.h;
    }

    @Override // defpackage.no2
    public int P(int i) {
        return this.j;
    }

    @Override // defpackage.no2
    public final int T() {
        return this.h;
    }

    @Override // defpackage.no2
    public int V(int i) {
        return this.h;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.j;
    }

    public final boolean a0() {
        return j().equals(Double.class);
    }

    @Override // defpackage.no2
    public final int d1() {
        return Math.min(this.j, this.h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.h != w0Var.h) {
            return false;
        }
        Class cls = this.i;
        Class cls2 = w0Var.i;
        if (cls == null) {
            if (cls2 != null) {
                return false;
            }
        } else if (!cls.equals(cls2)) {
            return false;
        }
        return this.j == w0Var.j;
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.j;
    }

    public int hashCode() {
        int i = (this.h + 31) * 31;
        Class cls = this.i;
        return ((i + (cls == null ? 0 : cls.hashCode())) * 31) + this.j;
    }

    public final Class j() {
        Class cls = this.i;
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = h0(0, 0).getClass();
        this.i = cls2;
        return cls2;
    }

    @Override // defpackage.re1
    public Comparable r0(q22 q22Var) {
        if (!a0()) {
            return super.r0(q22Var);
        }
        gy1 gy1Var = (gy1) C0().b(1L, q22Var.size());
        gy1Var.K1(q22Var, this);
        gy1 gy1Var2 = (gy1) C0().b(1L, 1L);
        gy1Var2.K1(gy1Var, q22Var);
        return gy1Var2.G(0L);
    }

    public final String toString() {
        return k1.l0(this);
    }
}
