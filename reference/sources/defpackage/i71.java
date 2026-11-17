package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i71 implements h71 {
    public final o90 a;
    public final /* synthetic */ b81 b;
    public final /* synthetic */ boolean c;

    public i71(b81 b81Var, boolean z) {
        this.b = b81Var;
        this.c = z;
        this.a = il2.b(new i50(b81Var, (byte) 1));
    }

    @Override // defpackage.h71
    public final int a() {
        b81 b81Var = this.b;
        return (int) (b81Var.j().p == ks1.h ? b81Var.j().i() & 4294967295L : b81Var.j().i() >> 32);
    }

    @Override // defpackage.h71
    public final Object b(int i, u50 u50Var) {
        Object objL = b81.l(this.b, i, u50Var);
        return objL == y20.h ? objL : j23.a;
    }

    @Override // defpackage.h71
    public final float c() {
        b81 b81Var = this.b;
        return (b81Var.h() * 500) + b81Var.i();
    }

    @Override // defpackage.h71
    public final bv d() {
        boolean z = this.c;
        o90 o90Var = this.a;
        return z ? new bv(((Number) o90Var.getValue()).intValue(), 1) : new bv(1, ((Number) o90Var.getValue()).intValue());
    }

    @Override // defpackage.h71
    public final int e() {
        b81 b81Var = this.b;
        return (-b81Var.j().m) + b81Var.j().q;
    }

    @Override // defpackage.h71
    public final float f() {
        b81 b81Var = this.b;
        int iH = (b81Var.h() * 500) + b81Var.i();
        return b81Var.c() ? iH + 100.0f : iH;
    }
}
