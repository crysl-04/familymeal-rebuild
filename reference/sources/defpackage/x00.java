package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x00 extends qg1 implements pz, cf1 {
    public boolean B;
    public boolean D;
    public ks1 v;
    public final qe2 w;
    public boolean x;
    public un2 y;
    public final he2 z;
    public final lo A = new lo((byte) 0);
    public long C = -1;

    public x00(ks1 ks1Var, qe2 qe2Var, boolean z, un2 un2Var, he2 he2Var) {
        this.v = ks1Var;
        this.w = qe2Var;
        this.x = z;
        this.y = un2Var;
        this.z = he2Var;
    }

    public static boolean L0(x00 x00Var, r72 r72Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = x00Var.K0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jN0 = x00Var.N0(r72Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jN0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jN0 & 4294967295L))) <= 0.5f;
    }

    public final float J0(vo voVar, long j) {
        float f;
        r72 r72Var;
        int iCompare;
        long j2 = this.C;
        uj1 uj1Var = this.A.a;
        int i = uj1Var.j - 1;
        Object[] objArr = uj1Var.h;
        if (i < objArr.length) {
            r72Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                r72 r72Var2 = (r72) ((u00) objArr[i]).a.a();
                if (r72Var2 != null) {
                    long jC = r72Var2.c();
                    long jG = ou.G(K0());
                    f = 0.0f;
                    int iOrdinal = this.v.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jG & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            wg.n();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jG >> 32)));
                    }
                    if (iCompare > 0) {
                        if (r72Var != null) {
                            break;
                        }
                        r72Var = r72Var2;
                        break;
                    }
                    r72Var = r72Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            r72Var = null;
        }
        if (r72Var == null) {
            r72 r72Var3 = this.B ? (r72) this.z.a() : null;
            if (r72Var3 == null) {
                return f;
            }
            r72Var = r72Var3;
        }
        long jG2 = ou.G(j2);
        int iOrdinal2 = this.v.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = r72Var.b;
            return voVar.a(f2 - ((int) (j & 4294967295L)), r72Var.d - f2, Float.intBitsToFloat((int) (jG2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = r72Var.a;
            return voVar.a(f3 - ((int) (j >> 32)), r72Var.c - f3, Float.intBitsToFloat((int) (jG2 >> 32)));
        }
        wg.n();
        return f;
    }

    public final long K0() {
        long j = this.C;
        if (vy0.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void M0(long j) {
        vo voVar = this.y;
        if (voVar == null) {
            voVar = (vo) vs.z(this, xo.a);
        }
        vo voVar2 = voVar;
        if (this.D) {
            dx0.c("launchAnimation called when previous animation was running");
        }
        Object obj = this.y;
        if (obj == null) {
            obj = (vo) vs.z(this, xo.a);
        }
        obj.getClass();
        vo.a.getClass();
        ie1.p(x0(), null, new w00(this, new t23(uo.b), voVar2, j, null), 1);
    }

    public final long N0(r72 r72Var, long j, long j2) {
        long jG = ou.G(j);
        int iOrdinal = this.v.ordinal();
        if (iOrdinal == 0) {
            vo voVar = this.y;
            if (voVar == null) {
                voVar = (vo) vs.z(this, xo.a);
            }
            float f = r72Var.b;
            return ((long) Float.floatToRawIntBits(voVar.a(f - ((int) (j2 & 4294967295L)), r72Var.d - f, Float.intBitsToFloat((int) (jG & 4294967295L))))) & 4294967295L;
        }
        if (iOrdinal != 1) {
            wg.n();
            return 0L;
        }
        vo voVar2 = this.y;
        if (voVar2 == null) {
            voVar2 = (vo) vs.z(this, xo.a);
        }
        float f2 = r72Var.a;
        return ((long) Float.floatToRawIntBits(voVar2.a(f2 - ((int) (j2 >> 32)), r72Var.c - f2, Float.intBitsToFloat((int) (jG >> 32))))) << 32;
    }

    @Override // defpackage.cf1
    public final void c(long j) {
        int i;
        long j2;
        long jK0 = K0();
        this.C = j;
        int iOrdinal = this.v.ordinal();
        if (iOrdinal == 0) {
            i = uz0.i((int) (j & 4294967295L), (int) (jK0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                wg.n();
                return;
            }
            i = uz0.i((int) (j >> 32), (int) (jK0 >> 32));
        }
        if (i < 0) {
            if (this.x) {
                j2 = 0;
            } else {
                j2 = this.v == ks1.h ? ((long) (((int) (jK0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jK0 >> 32)) - ((int) (j >> 32)))) << 32;
            }
            long j3 = j2;
            r72 r72Var = (r72) this.z.a();
            if (r72Var == null || this.D || this.B || !L0(this, r72Var, jK0, 0L, 2) || L0(this, r72Var, 0L, j3, 1)) {
                return;
            }
            this.B = true;
            M0(j3);
        }
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
