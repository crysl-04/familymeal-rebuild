package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e81 implements h71 {
    public final /* synthetic */ c61 a;

    public e81(c61 c61Var) {
        this.a = c61Var;
    }

    @Override // defpackage.h71
    public final int a() {
        c61 c61Var = this.a;
        return (int) (c61Var.g().r == ks1.h ? c61Var.g().i() & 4294967295L : c61Var.g().i() >> 32);
    }

    @Override // defpackage.h71
    public final Object b(int i, u50 u50Var) {
        k42 k42Var = c61.w;
        c61 c61Var = this.a;
        c61Var.getClass();
        Object objD = c61Var.d(ek1.h, new b61(c61Var, i, null, (byte) 0), u50Var);
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        if (objD != y20Var) {
            objD = j23Var;
        }
        return objD == y20Var ? objD : j23Var;
    }

    @Override // defpackage.h71
    public final float c() {
        c61 c61Var = this.a;
        return (c61Var.d.b.g() * 500) + c61Var.d.c.g();
    }

    @Override // defpackage.h71
    public final bv d() {
        return new bv(-1, -1);
    }

    @Override // defpackage.h71
    public final int e() {
        c61 c61Var = this.a;
        return (-c61Var.g().o) + c61Var.g().s;
    }

    @Override // defpackage.h71
    public final float f() {
        c61 c61Var = this.a;
        int iG = (c61Var.d.b.g() * 500) + c61Var.d.c.g();
        return c61Var.c() ? iG + 100.0f : iG;
    }
}
