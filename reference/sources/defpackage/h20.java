package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h20 extends wg1 {
    public final hz2 h;
    public final vv2 i;
    public final p81 j;
    public final boolean k;
    public final xp1 l;
    public final kv2 m;
    public final nu0 n;
    public final gm0 o;

    public h20(hz2 hz2Var, vv2 vv2Var, p81 p81Var, boolean z, xp1 xp1Var, kv2 kv2Var, nu0 nu0Var, gm0 gm0Var) {
        this.h = hz2Var;
        this.i = vv2Var;
        this.j = p81Var;
        this.k = z;
        this.l = xp1Var;
        this.m = kv2Var;
        this.n = nu0Var;
        this.o = gm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h20) {
            h20 h20Var = (h20) obj;
            if (this.h.equals(h20Var.h) && uz0.g(this.i, h20Var.i) && this.j == h20Var.j && this.k == h20Var.k && this.l.equals(h20Var.l) && this.m == h20Var.m && uz0.g(this.n, h20Var.n) && uz0.g(this.o, h20Var.o)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        k20 k20Var = new k20();
        k20Var.x = this.h;
        k20Var.y = this.i;
        k20Var.z = this.j;
        k20Var.A = this.k;
        k20Var.B = this.l;
        kv2 kv2Var = this.m;
        k20Var.C = kv2Var;
        k20Var.D = this.n;
        k20Var.E = this.o;
        kv2Var.f = new i20(k20Var, (byte) 4);
        return k20Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        k20 k20Var = (k20) qg1Var;
        boolean z = k20Var.A;
        nu0 nu0Var = k20Var.D;
        kv2 kv2Var = k20Var.C;
        k20Var.x = this.h;
        vv2 vv2Var = this.i;
        k20Var.y = vv2Var;
        k20Var.z = this.j;
        boolean z2 = this.k;
        k20Var.A = z2;
        k20Var.B = this.l;
        kv2 kv2Var2 = this.m;
        k20Var.C = kv2Var2;
        nu0 nu0Var2 = this.n;
        k20Var.D = nu0Var2;
        k20Var.E = this.o;
        if (z2 != z || z2 != z || !uz0.g(nu0Var2, nu0Var) || !qw2.c(vv2Var.b)) {
            y02.p(k20Var);
        }
        if (kv2Var2 != kv2Var) {
            kv2Var2.f = new i20(k20Var, (byte) 0);
        }
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((((Boolean.hashCode(this.k) + ((((this.j.hashCode() + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31)) * 31) + 1237) * 31)) * 31) + 1237) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.h + ", value=" + this.i + ", state=" + this.j + ", readOnly=false, enabled=" + this.k + ", isPassword=false, offsetMapping=" + this.l + ", manager=" + this.m + ", imeOptions=" + this.n + ", focusRequester=" + this.o + ")";
    }
}
