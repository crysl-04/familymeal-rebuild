package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u51 implements w61 {
    public final int a;
    public final Object b;
    public final int c;
    public final u31 d;
    public final List e;
    public final long f;
    public final Object g;
    public final p61 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p = Integer.MIN_VALUE;
    public final long q;
    public long r;
    public int s;
    public int t;
    public boolean u;

    public u51(int i, Object obj, int i2, int i3, u31 u31Var, int i4, int i5, List list, long j, Object obj2, p61 p61Var, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = u31Var;
        this.e = list;
        this.f = j;
        this.g = obj2;
        this.h = p61Var;
        this.i = i6;
        this.j = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((ny1) list.get(i8)).i);
        }
        this.k = iMax;
        this.o = i3;
        this.m = iMax;
        int i9 = this.c;
        this.l = i9;
        this.n = 0;
        this.q = (((long) i9) << 32) | (((long) iMax) & 4294967295L);
        this.r = 0L;
        this.s = -1;
        this.t = -1;
    }

    @Override // defpackage.w61
    public final int a() {
        return this.n;
    }

    @Override // defpackage.w61
    public final long b(int i) {
        return this.r;
    }

    @Override // defpackage.w61
    public final int c() {
        return this.j;
    }

    @Override // defpackage.w61
    public final int d() {
        return this.i;
    }

    @Override // defpackage.w61
    public final int e() {
        return this.m;
    }

    @Override // defpackage.w61
    public final int f() {
        return this.l;
    }

    @Override // defpackage.w61
    public final void g() {
        this.u = true;
    }

    @Override // defpackage.w61
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.w61
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.w61
    public final List h() {
        return this.e;
    }

    @Override // defpackage.w61
    public final void i(int i, int i2, int i3, int i4) {
        m(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.w61
    public final int j() {
        return this.o;
    }

    public final int k() {
        return this.m + this.o;
    }

    public final void l(my1 my1Var) {
        if (this.p == Integer.MIN_VALUE) {
            dx0.a("position() should be called first");
        }
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ny1 ny1Var = (ny1) list.get(i);
            int i2 = ny1Var.i;
            long j = this.r;
            this.h.a(i, this.b);
            my1.o(my1Var, ny1Var, ny0.c(j, this.f));
        }
    }

    public final void m(int i, int i2, int i3, int i4, int i5, int i6) {
        this.p = i4;
        if (this.d == u31.i) {
            i2 = (i3 - i2) - this.c;
        }
        this.r = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.s = i5;
        this.t = i6;
    }
}
