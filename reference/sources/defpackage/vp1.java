package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vp1 implements rg, xp1, q33 {
    public final int h;
    public int i;
    public final Object j;

    public vp1(int i, int i2, ke0 ke0Var) {
        this.h = i;
        this.i = i2;
        this.j = new wk(new fk0(i, i2, ke0Var));
    }

    @Override // defpackage.rg
    public final void c(int i, Object obj) {
        ((rg) this.j).c(i + (this.i == 0 ? this.h : 0), obj);
    }

    @Override // defpackage.rg
    public final void d(Object obj) {
        this.i++;
        ((rg) this.j).d(obj);
    }

    @Override // defpackage.rg
    public final void e() {
        ((rg) this.j).e();
    }

    @Override // defpackage.rg
    public final void f(int i, Object obj) {
        ((rg) this.j).f(i + (this.i == 0 ? this.h : 0), obj);
    }

    @Override // defpackage.rg
    public final void h(int i, int i2, int i3) {
        int i4 = this.i == 0 ? this.h : 0;
        ((rg) this.j).h(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.rg
    public final Object i() {
        return ((rg) this.j).i();
    }

    @Override // defpackage.rg
    public final void j(int i, int i2) {
        ((rg) this.j).j(i + (this.i == 0 ? this.h : 0), i2);
    }

    @Override // defpackage.q33
    public final int k() {
        return this.i;
    }

    @Override // defpackage.o33
    public final id l(long j, id idVar, id idVar2, id idVar3) {
        return ((wk) this.j).l(j, idVar, idVar2, idVar3);
    }

    @Override // defpackage.rg
    public final void m(zp0 zp0Var, Object obj) {
        ((rg) this.j).m(zp0Var, obj);
    }

    @Override // defpackage.xp1
    public final int n(int i) {
        int iN = ((xp1) this.j).n(i);
        if (i >= 0 && i <= this.i) {
            a33.c(iN, this.h, i);
        }
        return iN;
    }

    @Override // defpackage.q33
    public final int o() {
        return this.h;
    }

    @Override // defpackage.o33
    public final id p(long j, id idVar, id idVar2, id idVar3) {
        return ((wk) this.j).p(j, idVar, idVar2, idVar3);
    }

    @Override // defpackage.rg
    public final void r() {
        if (this.i <= 0) {
            ez.a("OffsetApplier up called with no corresponding down");
        }
        this.i--;
        ((rg) this.j).r();
    }

    @Override // defpackage.xp1
    public final int s(int i) {
        int iS = ((xp1) this.j).s(i);
        if (i >= 0 && i <= this.h) {
            a33.b(iS, this.i, i);
        }
        return iS;
    }

    public vp1(rg rgVar, int i) {
        this.j = rgVar;
        this.h = i;
    }

    public vp1(xp1 xp1Var, int i, int i2) {
        this.j = xp1Var;
        this.h = i;
        this.i = i2;
    }
}
