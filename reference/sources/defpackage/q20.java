package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class q20 extends w implements m20 {
    public static final p20 i = new p20(c5.L, new rt((byte) 5));

    public q20() {
        super(c5.L);
    }

    public void e(o20 o20Var, Runnable runnable) {
        j70.k.e(o20Var, runnable);
    }

    public boolean f(o20 o20Var) {
        return !(this instanceof e23);
    }

    public q20 g(int i2) {
        ys.o(i2);
        return new q91(this, i2);
    }

    @Override // defpackage.w, defpackage.o20
    public final m20 m(n20 n20Var) {
        m20 m20Var;
        n20Var.getClass();
        if (n20Var instanceof p20) {
            p20 p20Var = (p20) n20Var;
            n20 n20Var2 = this.h;
            if ((n20Var2 == p20Var || p20Var.i == n20Var2) && (m20Var = (m20) p20Var.h.h(this)) != null) {
                return m20Var;
            }
        } else if (c5.L == n20Var) {
            return this;
        }
        return null;
    }

    @Override // defpackage.w, defpackage.o20
    public final o20 t(n20 n20Var) {
        n20Var.getClass();
        if (n20Var instanceof p20) {
            p20 p20Var = (p20) n20Var;
            n20 n20Var2 = this.h;
            if ((n20Var2 != p20Var && p20Var.i != n20Var2) || ((m20) p20Var.h.h(this)) == null) {
                return this;
            }
        } else if (c5.L != n20Var) {
            return this;
        }
        return xf0.h;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + s60.o(this);
    }
}
