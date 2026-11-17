package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j82 implements x20, h82 {
    public static final vq k = new vq(0);
    public final o20 h;
    public final j82 i = this;
    public volatile o20 j;

    public j82(o20 o20Var) {
        this.h = o20Var;
    }

    public final void a() {
        synchronized (this.i) {
            o20 o20Var = this.j;
            if (o20Var == null) {
                this.j = k;
            } else {
                ys.m(o20Var, new wn0((byte) 0));
            }
        }
    }

    @Override // defpackage.h82
    public final void d() {
        a();
    }

    @Override // defpackage.h82
    public final void e() {
        a();
    }

    @Override // defpackage.x20
    public final o20 f() {
        o20 o20VarI;
        o20 o20Var = this.j;
        if (o20Var == null || o20Var == k) {
            mz mzVar = (mz) this.h.m(mz.i);
            o20 i82Var = mzVar != null ? new i82(mzVar, this) : xf0.h;
            synchronized (this.i) {
                o20 o20Var2 = this.j;
                if (o20Var2 == null) {
                    o20 o20Var3 = this.h;
                    o20VarI = o20Var3.i(new u01((s01) o20Var3.m(c5.Z))).i(xf0.h).i(i82Var);
                } else if (o20Var2 == k) {
                    o20 o20Var4 = this.h;
                    u01 u01Var = new u01((s01) o20Var4.m(c5.Z));
                    u01Var.A(new wn0((byte) 0));
                    o20VarI = o20Var4.i(u01Var).i(xf0.h).i(i82Var);
                } else {
                    o20VarI = o20Var2;
                }
                this.j = o20VarI;
            }
            o20Var = o20VarI;
        }
        o20Var.getClass();
        return o20Var;
    }

    @Override // defpackage.h82
    public final void c() {
    }
}
