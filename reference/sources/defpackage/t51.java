package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t51 implements af1 {
    public final v51 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final af1 e;
    public final float f;
    public final boolean g;
    public final x20 h;
    public final e90 i;
    public final int j;
    public final vp0 k;
    public final vp0 l;
    public final int m;
    public final List n;
    public final int o;
    public final int p;
    public final int q;
    public final ks1 r;
    public final int s;
    public final int t;

    public t51(v51 v51Var, int i, boolean z, float f, af1 af1Var, float f2, boolean z2, x20 x20Var, e90 e90Var, int i2, vp0 vp0Var, vp0 vp0Var2, int i3, List list, int i4, int i5, int i6, ks1 ks1Var, int i7, int i8) {
        this.a = v51Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = af1Var;
        this.f = f2;
        this.g = z2;
        this.h = x20Var;
        this.i = e90Var;
        this.j = i2;
        this.k = vp0Var;
        this.l = vp0Var2;
        this.m = i3;
        this.n = list;
        this.o = i4;
        this.p = i5;
        this.q = i6;
        this.r = ks1Var;
        this.s = i7;
        this.t = i8;
    }

    @Override // defpackage.af1
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.af1
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.af1
    public final zp0 c() {
        return this.e.c();
    }

    @Override // defpackage.af1
    public final int d() {
        return this.e.d();
    }

    @Override // defpackage.af1
    public final vp0 e() {
        return this.e.e();
    }

    @Override // defpackage.af1
    public final vp0 f() {
        return this.e.f();
    }

    @Override // defpackage.af1
    public final int g() {
        return this.e.g();
    }

    public final t51 h(int i, boolean z) {
        v51 v51Var;
        int i2;
        if (this.g) {
            return null;
        }
        List list = this.n;
        if (list.isEmpty() || (v51Var = this.a) == null) {
            return null;
        }
        int i3 = v51Var.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        u51 u51Var = (u51) dv.x0(list);
        u51 u51Var2 = (u51) dv.F0(list);
        if (u51Var.u || u51Var2.u) {
            return null;
        }
        int i5 = this.p;
        int i6 = this.o;
        ks1 ks1Var = this.r;
        if (i < 0) {
            if (Math.min((u51Var.k() + ls.X(u51Var, ks1Var)) - i6, (u51Var2.k() + ls.X(u51Var2, ks1Var)) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - ls.X(u51Var, ks1Var), i5 - ls.X(u51Var2, ks1Var)) <= i) {
            return null;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            u51 u51Var3 = (u51) list.get(i7);
            u51Var3.getClass();
            if (u51Var3.u) {
                i2 = i4;
            } else {
                long j = u51Var3.r;
                i2 = i4;
                u51Var3.r = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = u51Var3.e.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        u51Var3.h.a(i8, u51Var3.b);
                    }
                }
            }
            i7++;
            i4 = i2;
        }
        return new t51(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, list, this.o, this.p, this.q, ks1Var, this.s, this.t);
    }

    public final long i() {
        af1 af1Var = this.e;
        return (((long) af1Var.g()) << 32) | (((long) af1Var.d()) & 4294967295L);
    }
}
