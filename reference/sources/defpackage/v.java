package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v extends z01 implements m10, x20 {
    public final o20 j;

    public v(o20 o20Var, boolean z) {
        super(z);
        Q((s01) o20Var.m(c5.Z));
        this.j = o20Var.i(this);
    }

    @Override // defpackage.z01
    public final String E() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.z01
    public final void P(a42 a42Var) {
        ls.E(this.j, a42Var);
    }

    @Override // defpackage.z01
    public String V() {
        return super.V();
    }

    @Override // defpackage.z01
    public final void Y(Object obj) {
        if (!(obj instanceof mw)) {
            h0(obj);
        } else {
            mw mwVar = (mw) obj;
            g0(mwVar.a, hi.a.getIntVolatile(mwVar, mw.b) != 0);
        }
    }

    @Override // defpackage.m10
    public final o20 e() {
        return this.j;
    }

    @Override // defpackage.x20
    public final o20 f() {
        return this.j;
    }

    @Override // defpackage.m10
    public final void g(Object obj) {
        Throwable thA = e92.a(obj);
        if (thA != null) {
            obj = new mw(thA, false);
        }
        Object objU = U(obj);
        if (objU == ie1.C) {
            return;
        }
        z(objU);
    }

    public final void i0(a30 a30Var, v vVar, zp0 zp0Var) {
        Object objF;
        int iOrdinal = a30Var.ordinal();
        j23 j23Var = j23.a;
        if (iOrdinal == 0) {
            try {
                tz0.F(ls.F(ls.v(vVar, this, zp0Var)), j23Var);
                return;
            } catch (Throwable th) {
                g(new d92(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                zp0Var.getClass();
                ls.F(ls.v(vVar, this, zp0Var)).g(j23Var);
                return;
            }
            if (iOrdinal != 3) {
                wg.n();
                return;
            }
            try {
                o20 o20Var = this.j;
                Object objE = ie1.E(o20Var, null);
                try {
                    if (zp0Var instanceof rk) {
                        t03.k(2, zp0Var);
                        objF = zp0Var.f(vVar, this);
                    } else {
                        objF = ls.b0(zp0Var, vVar, this);
                    }
                    ie1.v(o20Var, objE);
                    if (objF != y20.h) {
                        g(objF);
                    }
                } catch (Throwable th2) {
                    ie1.v(o20Var, objE);
                    throw th2;
                }
            } catch (Throwable th3) {
                g(new d92(th3));
            }
        }
    }

    public void h0(Object obj) {
    }

    public void g0(Throwable th, boolean z) {
    }
}
