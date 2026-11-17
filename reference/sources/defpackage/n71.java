package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n71 implements m61 {
    public final b81 a;

    public n71(b81 b81Var) {
        this.a = b81Var;
    }

    @Override // defpackage.m61
    public final int a() {
        return this.a.j().o;
    }

    @Override // defpackage.m61
    public final int b() {
        return Math.min(a() - 1, ((v71) dv.F0(this.a.j().l)).a);
    }

    @Override // defpackage.m61
    public final boolean c() {
        return !this.a.j().l.isEmpty();
    }

    @Override // defpackage.m61
    public final int d() {
        int i;
        b81 b81Var = this.a;
        if (b81Var.j().l.isEmpty()) {
            return 0;
        }
        u71 u71VarJ = b81Var.j();
        int i2 = (int) (u71VarJ.p == ks1.h ? u71VarJ.i() & 4294967295L : u71VarJ.i() >> 32);
        int iN0 = lt.n0(b81Var.j());
        if (iN0 == 0 || (i = i2 / iN0) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.m61
    public final int e() {
        return Math.max(0, this.a.h());
    }
}
