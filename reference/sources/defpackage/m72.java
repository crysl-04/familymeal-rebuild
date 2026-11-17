package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m72 implements rg {
    public final ri1 h = new ri1();
    public final fj1 i = new fj1();
    public final Object j;

    public m72(Object obj) {
        this.j = obj;
    }

    public final void a(b23 b23Var, g82 g82Var) {
        Exception exc;
        ri1 ri1Var = this.h;
        int i = ri1Var.b;
        fj1 fj1Var = new fj1();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            fj1 fj1Var2 = this.i;
            if (i2 >= i) {
                if (i3 != fj1Var2.b) {
                    ez.a("Applier operation size mismatch");
                }
                fj1Var2.d();
                ri1Var.b = 0;
                b23Var.g();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (ri1Var.c(i2)) {
                        case 0:
                            b23Var.r();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            b23Var.d(fj1Var2.g(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            b23Var.j(ri1Var.c(i4), ri1Var.c(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    b23Var.h(ri1Var.c(i4), ri1Var.c(i7), ri1Var.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            b23Var.a();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            b23Var.c(ri1Var.c(i4), fj1Var2.g(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                ri1Var.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objG = fj1Var2.g(i3);
                            objG.getClass();
                            t03.k(2, objG);
                            i3 += 2;
                            b23Var.m((zp0) objG, fj1Var2.g(i11));
                            i2 = i4;
                            break;
                        case DatabaseUtils.STATEMENT_DDL /* 8 */:
                            Object obj = b23Var.j;
                            if (obj instanceof hy) {
                                hy hyVar = (hy) obj;
                                if (g82Var.f.j(hyVar)) {
                                    hyVar.b();
                                }
                            }
                            fj1Var.a(obj);
                            b23Var.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } catch (Throwable th) {
                b23Var.g();
                throw th;
            }
            exc = e3;
            throw new jy(fj1Var2, fj1Var, ri1Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.rg
    public final void c(int i, Object obj) {
        ri1 ri1Var = this.h;
        ri1Var.a(5);
        ri1Var.a(i);
        this.i.a(obj);
    }

    @Override // defpackage.rg
    public final void d(Object obj) {
        this.h.a(1);
        this.i.a(obj);
    }

    @Override // defpackage.rg
    public final void e() {
        this.h.a(8);
    }

    @Override // defpackage.rg
    public final void f(int i, Object obj) {
        ri1 ri1Var = this.h;
        ri1Var.a(6);
        ri1Var.a(i);
        this.i.a(obj);
    }

    @Override // defpackage.rg
    public final void h(int i, int i2, int i3) {
        ri1 ri1Var = this.h;
        ri1Var.a(3);
        ri1Var.a(i);
        ri1Var.a(i2);
        ri1Var.a(i3);
    }

    @Override // defpackage.rg
    public final Object i() {
        return this.j;
    }

    @Override // defpackage.rg
    public final void j(int i, int i2) {
        ri1 ri1Var = this.h;
        ri1Var.a(2);
        ri1Var.a(i);
        ri1Var.a(i2);
    }

    @Override // defpackage.rg
    public final void m(zp0 zp0Var, Object obj) {
        this.h.a(7);
        fj1 fj1Var = this.i;
        fj1Var.a(zp0Var);
        fj1Var.a(obj);
    }

    @Override // defpackage.rg
    public final void r() {
        this.h.a(0);
    }
}
