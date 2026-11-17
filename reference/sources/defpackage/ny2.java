package defpackage;

import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ny2 {
    public static final rt1 a = new rt1(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final py2 py2Var, rg1 rg1Var, float f, hi2 hi2Var, long j, long j2, final nx nxVar, dr0 dr0Var, final int i) {
        int i2;
        rg1 rg1Var2;
        final float f2;
        final hi2 hi2Var2;
        final long j3;
        final long j4;
        long jD;
        int i3;
        hi2 hi2Var3;
        long j5;
        dr0Var.W(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dr0Var.f(py2Var) : dr0Var.h(py2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = i4 | 113246208;
        if ((805306368 & i) == 0) {
            i5 |= dr0Var.h(nxVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if (dr0Var.N(i5 & 1, (306783379 & i5) != 306783378)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                hi2 hi2VarA = mi2.a(s60.t0, dr0Var);
                jD = rv.d(s60.u0, dr0Var);
                long jD2 = rv.d(s60.s0, dr0Var);
                i3 = i5 & (-4186113);
                og1 og1Var = og1.h;
                hi2Var3 = hi2VarA;
                f2 = pz1.c;
                j5 = jD2;
                rg1Var2 = og1Var;
            } else {
                dr0Var.Q();
                i3 = i5 & (-4186113);
                rg1Var2 = rg1Var;
                f2 = f;
                hi2Var3 = hi2Var;
                jD = j;
                j5 = j2;
            }
            dr0Var.q();
            dr0Var.V(-1719831991);
            dr0Var.p(false);
            int i6 = i3 >> 9;
            iq2.a(rg1Var2, hi2Var3, j5, 0L, 0.0f, dt.N(-1573998995, new my2(f2, jD, nxVar), dr0Var), dr0Var, 12582912 | (57344 & i6) | (i6 & 458752), 72);
            j3 = jD;
            hi2Var2 = hi2Var3;
            j4 = j5;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            f2 = f;
            hi2Var2 = hi2Var;
            j3 = j;
            j4 = j2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            final rg1 rg1Var3 = rg1Var2;
            e72VarR.d = new zp0() { // from class: ky2
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ny2.a(py2Var, rg1Var3, f2, hi2Var2, j3, j4, nxVar, (dr0) obj, m02.A(i | 1));
                    return j23.a;
                }
            };
        }
    }

    public static final void b(final oy2 oy2Var, final nx nxVar, final ry2 ry2Var, rg1 rg1Var, boolean z, nx nxVar2, dr0 dr0Var, final int i) {
        nx nxVar3;
        final rg1 rg1Var2;
        final boolean z2;
        dr0Var.W(-293753984);
        int i2 = i | (dr0Var.f(oy2Var) ? 4 : 2) | (dr0Var.f(ry2Var) ? 256 : 128) | 14380032;
        byte b = 1;
        if (dr0Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            qz2 qz2VarN = t03.N(ry2Var.b, "tooltip transition", dr0Var, 48);
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = rz1.x(null);
                dr0Var.f0(objK);
            }
            sj1 sj1Var = (sj1) objK;
            Object objK2 = dr0Var.K();
            if (objK2 == yyVar) {
                new bb(sj1Var, (byte) 28);
                objK2 = new py2();
                dr0Var.f0(objK2);
            }
            nxVar3 = nxVar2;
            nx nxVarN = dt.N(-23901870, new rl(sj1Var, nxVar3, (byte) 12), dr0Var);
            og1 og1Var = og1.h;
            uz0.b(oy2Var, dt.N(-527401546, new s50(qz2VarN, nxVar, (py2) objK2, b), dr0Var), ry2Var, og1Var, nxVarN, dr0Var, (i2 & 14) | 100663344 | (i2 & 896) | 14380032);
            rg1Var2 = og1Var;
            z2 = true;
        } else {
            nxVar3 = nxVar2;
            dr0Var.Q();
            rg1Var2 = rg1Var;
            z2 = z;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            final nx nxVar4 = nxVar3;
            e72VarR.d = new zp0(nxVar, ry2Var, rg1Var2, z2, nxVar4, i) { // from class: ly2
                public final /* synthetic */ nx i;
                public final /* synthetic */ ry2 j;
                public final /* synthetic */ rg1 k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ nx m;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(100663345);
                    ny2.b(this.h, this.i, this.j, this.k, this.l, this.m, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }
}
