package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mv0 implements ld0 {
    public final je2 h;
    public hv0 i;
    public kv0 j;
    public jv0 k;
    public iv0 l;
    public dt m;
    public xl1 n;
    public wy2 o;
    public final p4 p;
    public final p4 q;

    public mv0(je2 je2Var) {
        this.h = je2Var;
        p4 p4Var = new p4((byte) 2);
        p4Var.c = new fj1();
        this.p = p4Var;
        p4 p4Var2 = new p4((byte) 4);
        p4Var2.c = new wi1();
        this.q = p4Var2;
    }

    public static void c(mv0 mv0Var, fv0 fv0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        je2 je2Var = mv0Var.h;
        jv0 jv0Var = mv0Var.k;
        if (jv0Var == null) {
            jv0Var = new jv0();
            jv0Var.i = null;
            jv0Var.j = Long.MAX_VALUE;
            jv0Var.k = false;
            mv0Var.k = jv0Var;
        }
        jv0Var.i = fv0Var;
        jv0Var.j = j;
        wy2 wy2Var = mv0Var.o;
        ks1 ks1Var = je2Var.x;
        if (wy2Var == null) {
            mv0Var.o = new wy2(ks1Var);
        } else {
            wy2Var.a = ks1Var;
            wy2Var.b = j2;
        }
        jv0Var.k = false;
        mv0Var.m = jv0Var;
    }

    public final void a() {
        hv0 hv0Var = this.i;
        gv0 gv0Var = gv0.j;
        if (hv0Var == null) {
            hv0Var = new hv0();
            hv0Var.i = gv0Var;
            hv0Var.j = false;
            hv0Var.k = false;
            this.i = hv0Var;
        }
        hv0Var.i = gv0Var;
        hv0Var.j = false;
        hv0Var.k = false;
        this.m = hv0Var;
    }

    public final void b(fv0 fv0Var, long j, wy2 wy2Var) {
        iv0 iv0Var = this.l;
        if (iv0Var == null) {
            iv0Var = new iv0();
            iv0Var.i = null;
            iv0Var.j = Long.MAX_VALUE;
            this.l = iv0Var;
        }
        iv0Var.i = fv0Var;
        iv0Var.j = j;
        wy2Var.b = 0L;
        this.m = iv0Var;
    }

    public final xl1 d() {
        xl1 xl1Var = this.n;
        if (xl1Var != null) {
            return xl1Var;
        }
        wg.m("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(fv0 fv0Var, ev0 ev0Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = fv0Var.c;
        je2 je2Var = this.h;
        ks1 ks1Var = je2Var.x;
        ks1Var.getClass();
        int i = nd0.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (ks1Var == ks1.h ? j & 4294967295L : j >> 32))) > 2.0f) {
            xl1 xl1VarD = d();
            ks1 ks1Var2 = je2Var.x;
            p4 p4Var = this.p;
            fj1 fj1Var = (fj1) p4Var.c;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (lt.f(fv0Var)) {
                p4Var.b = 0;
                fj1Var.d();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (lt.g(fv0Var) || lt.f(fv0Var)) {
                j2 = 4294967295L;
            } else {
                if (fj1Var.b == 3) {
                    int i2 = p4Var.b;
                    p4Var.b = i2 + 1;
                    fj1Var.o(i2, fv0Var);
                } else {
                    fj1Var.a(fv0Var);
                }
                if (p4Var.b == 3) {
                    p4Var.b = 0;
                }
                Object[] objArr = fj1Var.a;
                int i3 = fj1Var.b;
                int i4 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i4 < i3) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((fv0) objArr[i4]).c >> 32));
                    i4++;
                    j4 = j4;
                }
                j2 = j4;
                int i5 = fj1Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i5;
                Object[] objArr2 = fj1Var.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((fv0) objArr2[i6]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / fj1Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
            if (ks1Var2 != null) {
                int i7 = ev0Var.a;
                if (i7 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i7 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = ks1Var2 == ks1.i ? ((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32 : ((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2;
            }
            ((id1) xl1VarD.i).a(fv0Var.b, jFloatToRawIntBits);
            p4 p4Var2 = this.q;
            wi1 wi1Var = (wi1) p4Var2.c;
            int i8 = wi1Var.b;
            if (i8 == 3) {
                int i9 = p4Var2.b;
                p4Var2.b = i9 + 1;
                if (i9 < 0 || i9 >= i8) {
                    wg.i("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = wi1Var.a;
                    long j5 = jArr[i9];
                    jArr[i9] = j;
                }
            } else {
                wi1Var.a(j);
            }
            if (p4Var2.b == 3) {
                p4Var2.b = 0;
            }
            long[] jArr2 = wi1Var.a;
            int i10 = wi1Var.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i11] >> 32));
            }
            int i12 = wi1Var.b;
            float f = fIntBitsToFloat7 / i12;
            long[] jArr3 = wi1Var.a;
            for (int i13 = 0; i13 < i12; i13++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i13] & j2)) + fIntBitsToFloat4;
            }
            je2Var.Q0(new rc0((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / wi1Var.b)) & j2), true));
        }
    }

    public final void f(fv0 fv0Var, fv0 fv0Var2, ev0 ev0Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.n == null) {
            this.n = new xl1((byte) 23);
        }
        xl1 xl1VarD = d();
        je2 je2Var = this.h;
        ks1 ks1Var = je2Var.x;
        p4 p4Var = this.p;
        fj1 fj1Var = (fj1) p4Var.c;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fv0Var.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fv0Var.c & 4294967295L));
        if (lt.f(fv0Var)) {
            p4Var.b = 0;
            fj1Var.d();
        }
        if (lt.g(fv0Var) || lt.f(fv0Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (fj1Var.b == 3) {
                int i = p4Var.b;
                p4Var.b = i + 1;
                fj1Var.o(i, fv0Var);
            } else {
                fj1Var.a(fv0Var);
            }
            if (p4Var.b == 3) {
                p4Var.b = 0;
            }
            Object[] objArr = fj1Var.a;
            int i2 = fj1Var.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((fv0) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
            }
            c = c2;
            int i4 = fj1Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = fj1Var.a;
            int i5 = 0;
            float fIntBitsToFloat5 = 0.0f;
            while (i5 < i4) {
                long j4 = j3;
                fIntBitsToFloat5 = Float.intBitsToFloat((int) (((fv0) objArr2[i5]).c & j4)) + fIntBitsToFloat5;
                i5++;
                j3 = j4;
            }
            j2 = j3;
            fIntBitsToFloat3 = fIntBitsToFloat5 / fj1Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (ks1Var != null) {
            int i6 = ev0Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = ks1Var == ks1.i ? ((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c : ((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2;
        }
        ((id1) xl1VarD.i).a(fv0Var.b, jFloatToRawIntBits);
        long jD = up1.d(lt.a0(fv0Var2, je2Var.x, ev0Var), j);
        if (((Boolean) je2Var.y.h(new f12(1))).booleanValue()) {
            je2Var.Q0(new sc0(jD));
        }
        p4 p4Var2 = this.q;
        p4Var2.b = 0;
        ((wi1) p4Var2.c).b = 0;
    }

    @Override // defpackage.ld0
    public final ks1 l() {
        return this.h.x;
    }

    @Override // defpackage.pr0
    public final String q0() {
        dt dtVar = this.m;
        if (dtVar instanceof hv0) {
            return ((hv0) dtVar).k ? "waiting" : "idle";
        }
        if ((dtVar instanceof jv0) || (dtVar instanceof iv0)) {
            return "waiting";
        }
        return dtVar instanceof kv0 ? "recognized" : "idle";
    }
}
