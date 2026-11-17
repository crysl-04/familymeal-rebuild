package defpackage;

import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b5 {
    public static final rt1 a = new rt1(24.0f, 24.0f, 24.0f, 24.0f);
    public static final rt1 b;
    public static final rt1 c;
    public static final ie0 d;

    static {
        t03.g(0.0f, 0.0f, 0.0f, 16.0f, 7);
        b = t03.g(0.0f, 0.0f, 0.0f, 16.0f, 7);
        c = t03.g(0.0f, 0.0f, 0.0f, 24.0f, 7);
        d = new ie0(new r3((byte) 2), (byte) 0);
    }

    public static final void a(final nx nxVar, rg1 rg1Var, final nx nxVar2, final nx nxVar3, final hi2 hi2Var, final long j, final long j2, final long j3, final long j4, final long j5, dr0 dr0Var, final int i) {
        final rg1 rg1Var2;
        dr0Var.W(1378716401);
        int i2 = i | 48 | (dr0Var.h(null) ? 256 : 128) | (dr0Var.h(nxVar2) ? 2048 : 1024) | (dr0Var.h(nxVar3) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | (dr0Var.f(hi2Var) ? 131072 : 65536) | (dr0Var.e(j) ? 1048576 : 524288) | (dr0Var.c(0.0f) ? 8388608 : 4194304) | (dr0Var.e(j2) ? 67108864 : 33554432) | (dr0Var.e(j3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY);
        if (dr0Var.N(i2 & 1, ((306783379 & i2) == 306783378 && (((dr0Var.e(j4) ? (char) 4 : (char) 2) | (dr0Var.e(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            nx nxVarN = dt.N(-652798794, new w4(nxVar2, nxVar3, j3, j4, j5, j2, nxVar), dr0Var);
            int i3 = i2 >> 12;
            int i4 = 12582918 | (i3 & 112) | (i3 & 896) | ((i2 >> 9) & 57344);
            og1 og1Var = og1.h;
            iq2.a(og1Var, hi2Var, j, 0L, 0.0f, nxVarN, dr0Var, i4, 104);
            rg1Var2 = og1Var;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(rg1Var2, nxVar2, nxVar3, hi2Var, j, j2, j3, j4, j5, i) { // from class: s4
                public final /* synthetic */ rg1 i;
                public final /* synthetic */ nx j;
                public final /* synthetic */ nx k;
                public final /* synthetic */ hi2 l;
                public final /* synthetic */ long m;
                public final /* synthetic */ long n;
                public final /* synthetic */ long o;
                public final /* synthetic */ long p;
                public final /* synthetic */ long q;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(7);
                    b5.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void b(final float f, final float f2, final nx nxVar, dr0 dr0Var, final int i) {
        dr0Var.W(-917637668);
        if (dr0Var.N(i & 1, (i & 147) != 146)) {
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new y4(f, f2);
                dr0Var.f0(objK);
            }
            ze1 ze1Var = (ze1) objK;
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, og1.h);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ze1Var);
            h12.y(c5.E, dr0Var, dx1VarL);
            yx yxVar = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
            }
            h12.y(c5.D, dr0Var, rg1VarU);
            wi0.n(6, nxVar, dr0Var, true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(f, f2, nxVar, i) { // from class: u4
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;
                public final /* synthetic */ nx j;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(439);
                    b5.b(this.h, this.i, this.j, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void c(final kp0 kp0Var, final nx nxVar, final rg1 rg1Var, final nx nxVar2, final nx nxVar3, final nx nxVar4, final hi2 hi2Var, final long j, final long j2, final long j3, final long j4, final la0 la0Var, dr0 dr0Var, final int i, final int i2) {
        int i3;
        nx nxVar5;
        nx nxVar6;
        int i4;
        dr0Var.W(-867616355);
        if ((i & 6) == 0) {
            i3 = (dr0Var.h(kp0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            nxVar5 = nxVar;
            i3 |= dr0Var.h(nxVar5) ? 32 : 16;
        } else {
            nxVar5 = nxVar;
        }
        if ((i & 384) == 0) {
            i3 |= dr0Var.f(rg1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            nxVar6 = nxVar2;
            i3 |= dr0Var.h(nxVar6) ? 2048 : 1024;
        } else {
            nxVar6 = nxVar2;
        }
        if ((i & 24576) == 0) {
            i3 |= dr0Var.h(null) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= dr0Var.h(nxVar3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= dr0Var.h(nxVar4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= dr0Var.f(hi2Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= dr0Var.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= dr0Var.e(j2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (dr0Var.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dr0Var.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dr0Var.c(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dr0Var.f(la0Var) ? 2048 : 1024;
        }
        int i5 = i4;
        if (dr0Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            d(kp0Var, rg1Var, la0Var, dt.N(527420759, new a5(nxVar3, nxVar4, hi2Var, j, j2, j3, j4, nxVar6, nxVar5), dr0Var), dr0Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: r4
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(i | 1);
                    int iA2 = m02.A(i2);
                    b5.c(kp0Var, nxVar, rg1Var, nxVar2, nxVar3, nxVar4, hi2Var, j, j2, j3, j4, la0Var, (dr0) obj, iA, iA2);
                    return j23.a;
                }
            };
        }
    }

    public static final void d(kp0 kp0Var, rg1 rg1Var, la0 la0Var, nx nxVar, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(24925658);
        if ((i & 6) == 0) {
            i2 = (dr0Var.h(kp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.f(rg1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.f(la0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.h(nxVar) ? 2048 : 1024;
        }
        if (dr0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ((y60) dr0Var.j(d)).a(new wk(kp0Var, rg1Var, la0Var, nxVar), dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new t4(kp0Var, rg1Var, la0Var, nxVar, i);
        }
    }
}
