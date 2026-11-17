package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v71 implements w61 {
    public final int a;
    public final List b;
    public final boolean c;
    public final bm d;
    public final cm e;
    public final u31 f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final p61 k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public boolean s;
    public int t = Integer.MIN_VALUE;
    public final int[] u;

    public v71(int i, List list, boolean z, bm bmVar, cm cmVar, u31 u31Var, int i2, int i3, int i4, long j, Object obj, Object obj2, p61 p61Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = bmVar;
        this.e = cmVar;
        this.f = u31Var;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = p61Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            ny1 ny1Var = (ny1) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? ny1Var.i : ny1Var.h;
            iMax = Math.max(iMax, !z2 ? ny1Var.i : ny1Var.h);
        }
        this.m = i5;
        this.r = iMax;
        this.u = new int[this.b.size() << 1];
        if (this.c) {
            this.q = this.g;
            this.o = i5;
            this.n = iMax;
            this.p = 0;
            return;
        }
        this.q = 0;
        this.o = iMax;
        this.n = i5;
        this.p = this.g;
    }

    @Override // defpackage.w61
    public final int a() {
        return this.p;
    }

    @Override // defpackage.w61
    public final long b(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.l;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i << 1;
        int[] iArr = this.u;
        return (((long) iArr[i3]) << 32) | (((long) iArr[i3 + 1]) & 4294967295L);
    }

    @Override // defpackage.w61
    public final int c() {
        return 1;
    }

    @Override // defpackage.w61
    public final int d() {
        return 0;
    }

    @Override // defpackage.w61
    public final int e() {
        return this.o;
    }

    @Override // defpackage.w61
    public final int f() {
        return this.n;
    }

    @Override // defpackage.w61
    public final void g() {
        this.s = true;
    }

    @Override // defpackage.w61
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.w61
    public final Object getKey() {
        return this.i;
    }

    @Override // defpackage.w61
    public final List h() {
        return this.b;
    }

    @Override // defpackage.w61
    public final void i(int i, int i2, int i3, int i4) {
        m(i, i3, i4);
    }

    @Override // defpackage.w61
    public final int j() {
        return this.q;
    }

    public final int k() {
        int i;
        int i2;
        if (this.c) {
            i = this.o;
            i2 = this.q;
        } else {
            i = this.n;
            i2 = this.p;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void l(my1 my1Var) {
        if (this.t == Integer.MIN_VALUE) {
            dx0.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ny1 ny1Var = (ny1) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = ny1Var.i;
            } else {
                int i3 = ny1Var.h;
            }
            long jB = b(i);
            this.k.a(i, this.i);
            long jC = ny0.c(jB, this.h);
            if (z) {
                my1.o(my1Var, ny1Var, jC);
            } else {
                vw1 vw1Var = oy1.a;
                if (my1Var.c() == u31.h || my1Var.e() == 0) {
                    my1Var.g(ny1Var);
                    ny1Var.n0(ny0.c(jC, ny1Var.l), 0.0f, vw1Var);
                } else {
                    int iE = (my1Var.e() - ny1Var.h) - ((int) (jC >> 32));
                    my1Var.g(ny1Var);
                    ny1Var.n0(ny0.c((((long) iE) << 32) | (((long) ((int) (jC & 4294967295L))) & 4294967295L), ny1Var.l), 0.0f, vw1Var);
                }
            }
        }
    }

    public final void m(int i, int i2, int i3) {
        int i4;
        this.l = i;
        boolean z = this.c;
        this.t = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ny1 ny1Var = (ny1) list.get(i5);
            int i6 = i5 << 1;
            int[] iArr = this.u;
            if (z) {
                bm bmVar = this.d;
                if (bmVar == null) {
                    throw wi0.w("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = bmVar.a(ny1Var.h, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = ny1Var.i;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                cm cmVar = this.e;
                if (cmVar == null) {
                    throw wi0.w("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = cmVar.a(ny1Var.i, i3);
                i4 = ny1Var.h;
            }
            i += i4;
        }
    }
}
