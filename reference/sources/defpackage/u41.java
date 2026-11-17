package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u41 implements af1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af1 b;
    public final /* synthetic */ z41 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ af1 e;

    public /* synthetic */ u41(af1 af1Var, z41 z41Var, int i, af1 af1Var2, byte b) {
        this.a = b;
        this.c = z41Var;
        this.d = i;
        this.e = af1Var2;
        this.b = af1Var;
    }

    @Override // defpackage.af1
    public final Map a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[LOOP:0: B:11:0x002f->B:32:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[SYNTHETIC] */
    @Override // defpackage.af1
    public final void b() {
        byte b = this.a;
        af1 af1Var = this.e;
        int i = this.d;
        z41 z41Var = this.c;
        switch (b) {
            case 0:
                z41Var.l = i;
                af1Var.b();
                uj1 uj1Var = z41Var.t;
                mj1 mj1Var = z41Var.s;
                long[] jArr = mj1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((255 & j) < 128) {
                                    int i6 = (i2 << 3) + i5;
                                    Object obj = mj1Var.b[i6];
                                    yo2 yo2Var = (yo2) mj1Var.c[i6];
                                    int i7 = uj1Var.i(obj);
                                    if (i7 >= 0) {
                                        if (i7 >= z41Var.l) {
                                            Object obj2 = tz0.k0;
                                            Object[] objArr = uj1Var.h;
                                            Object obj3 = objArr[i7];
                                            objArr[i7] = obj2;
                                        } else {
                                            i3 = i3;
                                        }
                                    }
                                    if (z41Var.q.b(obj)) {
                                        yo2Var.a();
                                    }
                                    mj1Var.m(i6);
                                } else {
                                    i3 = i3;
                                }
                                j >>= i3;
                                i5++;
                                i3 = i3;
                            }
                            if (i4 == i3) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                z41Var.f(z41Var.k);
                break;
            default:
                z41Var.k = i;
                af1Var.b();
                if (z41Var.h.o == null) {
                    z41Var.f(z41Var.k);
                }
                break;
        }
    }

    @Override // defpackage.af1
    public final zp0 c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.c();
    }

    @Override // defpackage.af1
    public final int d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.d();
    }

    @Override // defpackage.af1
    public final vp0 e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.e();
    }

    @Override // defpackage.af1
    public final vp0 f() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.f();
    }

    @Override // defpackage.af1
    public final int g() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.g();
    }
}
