package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e42 {
    public static final l30 a = hh1.b;

    public static final void a(rg1 rg1Var, long j, float f, long j2, int i, float f2, dr0 dr0Var, final int i2, final int i3) {
        rg1 rg1Var2;
        int i4;
        final long j3;
        final float f3;
        final long j4;
        final int i5;
        final float f4;
        final rg1 rg1Var3;
        rg1 rg1Var4;
        long jD;
        long j5;
        int i6;
        float f5;
        final float f6;
        Object obj;
        final float f7;
        final int i7;
        final long j6;
        final long j7;
        dr0Var.W(333154241);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            rg1Var2 = rg1Var;
        } else {
            rg1Var2 = rg1Var;
            i4 = i2 | (dr0Var.f(rg1Var2) ? 4 : 2);
        }
        int i9 = i4 | 222608;
        if (dr0Var.N(i9 & 1, (74899 & i9) != 74898)) {
            dr0Var.S();
            if ((i2 & 1) == 0 || dr0Var.x()) {
                rg1Var4 = i8 != 0 ? og1.h : rg1Var2;
                jD = rv.d(ie1.O, dr0Var);
                j5 = kv.f;
                i6 = 1;
                f5 = 4.0f;
                f6 = 4.0f;
            } else {
                dr0Var.Q();
                f6 = f;
                j5 = j2;
                i6 = i;
                f5 = f2;
                rg1Var4 = rg1Var2;
                jD = j;
            }
            dr0Var.q();
            final ko2 ko2Var = new ko2(((e90) dr0Var.j(uz.h)).A(f6), 0.0f, i6, 0, 26);
            Object objK = dr0Var.K();
            Object obj2 = zy.a;
            if (objK == obj2) {
                objK = new tv0();
                dr0Var.f0(objK);
            }
            tv0 tv0Var = (tv0) objK;
            tv0Var.a(0, dr0Var);
            final rv0 rv0VarR = cu.r(tv0Var, 0.0f, 1080.0f, new qv0(uz0.B(6000, le0.c, 2)), dr0Var);
            vw1 vw1Var = new vw1((byte) 14);
            f31 f31Var = new f31();
            vw1Var.h(f31Var);
            final rv0 rv0VarR2 = cu.r(tv0Var, 0.0f, 360.0f, new qv0(new g31(f31Var)), dr0Var);
            f31 f31Var2 = new f31();
            int i10 = i6;
            f31Var2.a = (short) 6000;
            float f8 = f5;
            f31Var2.a(Float.valueOf(0.87f), 3000).b = a;
            f31Var2.a(Float.valueOf(0.1f), 6000);
            final rv0 rv0VarR3 = cu.r(tv0Var, 0.1f, 0.87f, new qv0(new g31(f31Var2)), dr0Var);
            rg1 rg1VarI = yj2.i(tg2.a(rg1Var4, true, new vw1((byte) 15)), 40.0f);
            boolean zF = dr0Var.f(rv0VarR3) | dr0Var.f(rv0VarR) | dr0Var.f(rv0VarR2) | dr0Var.e(j5) | dr0Var.h(ko2Var) | dr0Var.e(jD);
            Object objK2 = dr0Var.K();
            if (zF || objK2 == obj2) {
                f7 = f8;
                i7 = i10;
                j6 = jD;
                j7 = j5;
                obj = new vp0() { // from class: c42
                    @Override // defpackage.vp0
                    public final Object h(Object obj3) {
                        long j8 = j7;
                        ko2 ko2Var2 = ko2Var;
                        long j9 = j6;
                        td0 td0Var = (td0) obj3;
                        float fFloatValue = ((Number) rv0VarR3.j.getValue()).floatValue() * 360.0f;
                        boolean z = i7;
                        float f9 = f7;
                        if (z && Float.intBitsToFloat((int) (td0Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (td0Var.d() >> 32))) {
                            f9 += f6;
                        }
                        float fU0 = (f9 / ((float) (((double) td0Var.u0(Float.intBitsToFloat((int) (td0Var.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) rv0VarR2.j.getValue()).floatValue() + ((Number) rv0VarR.j.getValue()).floatValue();
                        long jX = td0Var.X();
                        eg egVarF = td0Var.F();
                        long jQ = egVarF.q();
                        egVarF.g().l();
                        try {
                            ((g2) egVarF.i).L(fFloatValue2, jX);
                            e42.b(td0Var, Math.min(fFloatValue, fU0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fU0) * 2.0f), j8, ko2Var2);
                            e42.b(td0Var, 0.0f, fFloatValue, j9, ko2Var2);
                            return j23.a;
                        } finally {
                            wi0.r(egVarF, jQ);
                        }
                    }
                };
                dr0Var.f0(obj);
            } else {
                f7 = f8;
                j6 = jD;
                j7 = j5;
                obj = objK2;
                i7 = i10;
            }
            ia2.f(rg1VarI, (vp0) obj, dr0Var, 0);
            rg1Var3 = rg1Var4;
            i5 = i7;
            f4 = f7;
            f3 = f6;
            j4 = j7;
            j3 = j6;
        } else {
            dr0Var.Q();
            j3 = j;
            f3 = f;
            j4 = j2;
            i5 = i;
            f4 = f2;
            rg1Var3 = rg1Var2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(j3, f3, j4, i5, f4, i2, i3) { // from class: d42
                public final /* synthetic */ long i;
                public final /* synthetic */ float j;
                public final /* synthetic */ long k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ float m;
                public final /* synthetic */ byte n;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.n = i3;
                }

                @Override // defpackage.zp0
                public final Object f(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = m02.A(1);
                    rg1 rg1Var5 = this.h;
                    long j8 = this.i;
                    float f9 = this.j;
                    long j9 = this.k;
                    boolean z = this.l;
                    float f10 = this.m;
                    byte b = this.n;
                    e42.a(rg1Var5, j8, f9, j9, z ? 1 : 0, f10, (dr0) obj3, iA, b);
                    return j23.a;
                }
            };
        }
    }

    public static final void b(td0 td0Var, float f, float f2, long j, ko2 ko2Var) {
        float f3 = ko2Var.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (td0Var.d() >> 32)) - (2.0f * f3);
        td0Var.v0(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), ko2Var);
    }
}
