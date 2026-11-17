package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u71 implements af1 {
    public final v71 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final af1 e;
    public final float f;
    public final boolean g;
    public final x20 h;
    public final e90 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final ks1 p;
    public final int q;
    public final int r;

    public u71(v71 v71Var, int i, boolean z, float f, af1 af1Var, float f2, boolean z2, x20 x20Var, e90 e90Var, long j, int i2, List list, int i3, int i4, int i5, ks1 ks1Var, int i6, int i7) {
        this.a = v71Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = af1Var;
        this.f = f2;
        this.g = z2;
        this.h = x20Var;
        this.i = e90Var;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = ks1Var;
        this.q = i6;
        this.r = i7;
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

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    public final u71 h(int i, boolean z) {
        v71 v71Var;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (v71Var = this.a) == null) {
            return null;
        }
        int iK = v71Var.k();
        int i2 = this.b - i;
        if (i2 < 0 || i2 >= iK) {
            return null;
        }
        v71 v71Var2 = (v71) dv.x0(list);
        v71 v71Var3 = (v71) dv.F0(list);
        if (v71Var2.s || v71Var3.s) {
            return null;
        }
        int i3 = v71Var2.l;
        int i4 = this.n;
        int i5 = this.m;
        if (i < 0) {
            if (Math.min((v71Var2.k() + i3) - i5, (v71Var3.k() + v71Var3.l) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - i3, i4 - v71Var3.l) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            v71 v71Var4 = (v71) list.get(i6);
            boolean z2 = v71Var4.c;
            int[] iArr = v71Var4.u;
            if (!v71Var4.s) {
                v71Var4.l += i;
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = i7 & 1;
                    if (z2) {
                        if (i8 != 0) {
                            iArr[i7] = iArr[i7] + i;
                        }
                    } else if (i8 == 0) {
                        iArr[i7] = iArr[i7] + i;
                    }
                }
                if (z) {
                    int size2 = v71Var4.b.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        v71Var4.k.a(i9, v71Var4.i);
                    }
                }
            }
        }
        return new u71(this.a, i2, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final long i() {
        af1 af1Var = this.e;
        return (((long) af1Var.g()) << 32) | (((long) af1Var.d()) & 4294967295L);
    }
}
