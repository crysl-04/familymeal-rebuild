package defpackage;

import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class pr2 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final long e;

    static {
        qv qvVar = p22.a;
        a = p22.e;
        b = 16.0f;
        c = 14.0f;
        d = 6.0f;
        e = r02.t(20);
    }

    public static final void a(final int i, final long j, final long j2, final nx nxVar, final kp0 kp0Var, dr0 dr0Var, final rg1 rg1Var, final boolean z, final boolean z2) {
        int i2;
        dr0Var.W(-1573136853);
        if ((i & 6) == 0) {
            i2 = (dr0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(kp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.f(rg1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dr0Var.e(j) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dr0Var.e(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dr0Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dr0Var.h(nxVar) ? 8388608 : 4194304;
        }
        if (dr0Var.N(i2 & 1, (4793491 & i2) != 4793490)) {
            dr0Var.S();
            if ((i & 1) != 0 && !dr0Var.x()) {
                dr0Var.Q();
            }
            dr0Var.q();
            int i3 = i2 >> 12;
            d(j, j2, z, dt.N(1128552423, new nr2(rg1Var, z, y92.a(0.0f, 2, j, true), z2, kp0Var, nxVar), dr0Var), dr0Var, (i3 & 14) | 3072 | (i3 & 112) | ((i2 << 6) & 896));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: lr2
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pr2.a(m02.A(i | 1), j, j2, nxVar, kp0Var, (dr0) obj, rg1Var, z, z2);
                    return j23.a;
                }
            };
        }
    }

    public static final void b(final int i, long j, long j2, final nx nxVar, final kp0 kp0Var, dr0 dr0Var, rg1 rg1Var, final boolean z, boolean z2) {
        final long j3;
        final long j4;
        final rg1 rg1Var2;
        final boolean z3;
        long j5;
        int i2;
        rg1 rg1Var3;
        boolean z4;
        long j6;
        nx nxVar2;
        dr0Var.W(1015017965);
        int i3 = i | (dr0Var.g(z) ? 4 : 2) | (dr0Var.h(kp0Var) ? 32 : 16) | 105581952;
        byte b2 = 1;
        if (dr0Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                j5 = ((kv) dr0Var.j(s00.a)).a;
                i2 = i3 & (-33030145);
                rg1Var3 = og1.h;
                z4 = true;
                j6 = j5;
            } else {
                dr0Var.Q();
                j5 = j;
                rg1Var3 = rg1Var;
                z4 = z2;
                i2 = i3 & (-33030145);
                j6 = j2;
            }
            dr0Var.q();
            if (nxVar == null) {
                dr0Var.V(1830899669);
                dr0Var.p(false);
                nxVar2 = null;
            } else {
                dr0Var.V(1830899670);
                nx nxVarN = dt.N(-1745256900, new p70(nxVar, (byte) 8), dr0Var);
                dr0Var.p(false);
                nxVar2 = nxVarN;
            }
            long j7 = j5;
            long j8 = j6;
            a((i2 & 14) | 12582912 | (i2 & 112) | 1575936, j7, j8, dt.N(-906085472, new d60(nxVar2, (byte) 3), dr0Var), kp0Var, dr0Var, uz0.n(rg1Var3, new tx(b2)), z, z4);
            rg1Var2 = rg1Var3;
            j3 = j7;
            j4 = j8;
            z3 = z4;
        } else {
            dr0Var.Q();
            j3 = j;
            j4 = j2;
            rg1Var2 = rg1Var;
            z3 = z2;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(i, j3, j4, nxVar, kp0Var, rg1Var2, z, z3) { // from class: kr2
                public final /* synthetic */ boolean h;
                public final /* synthetic */ kp0 i;
                public final /* synthetic */ rg1 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ nx l;
                public final /* synthetic */ long m;
                public final /* synthetic */ long n;

                {
                    this.h = z;
                    this.i = kp0Var;
                    this.j = rg1Var2;
                    this.k = z3;
                    this.l = nxVar;
                    this.m = j3;
                    this.n = j4;
                }

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pr2.b(m02.A(24577), this.m, this.n, this.l, this.i, (dr0) obj, this.j, this.h, this.k);
                    return j23.a;
                }
            };
        }
    }

    public static final void c(nx nxVar, dr0 dr0Var, int i) {
        boolean z;
        boolean z2;
        dm dmVar = c5.i;
        dr0Var.W(-1349901398);
        byte b2 = 2;
        int i2 = (dr0Var.h(nxVar) ? 4 : 2) | i | (dr0Var.h(null) ? 32 : 16);
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z3 = (i3 == 4) | ((i2 & 112) == 32);
            Object objK = dr0Var.K();
            if (z3 || objK == zy.a) {
                objK = new or2(nxVar);
                dr0Var.f0(objK);
            }
            ze1 ze1Var = (ze1) objK;
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            og1 og1Var = og1.h;
            rg1 rg1VarU = ls.U(dr0Var, og1Var);
            sy.f.getClass();
            dr0Var.Y();
            boolean z4 = dr0Var.S;
            jw0 jw0Var = l41.W;
            if (z4) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            yx yxVar = c5.F;
            h12.y(yxVar, dr0Var, ze1Var);
            yx yxVar2 = c5.E;
            h12.y(yxVar2, dr0Var, dx1VarL);
            yx yxVar3 = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar3);
            }
            yx yxVar4 = c5.D;
            h12.y(yxVar4, dr0Var, rg1VarU);
            if (nxVar != null) {
                dr0Var.V(870361332);
                rg1 rg1VarH = t03.H(s60.w(og1Var, "text"), b, 0.0f, 2);
                ze1 ze1VarC = ho.c(dmVar, false);
                int iHashCode2 = Long.hashCode(dr0Var.T);
                dx1 dx1VarL2 = dr0Var.l();
                rg1 rg1VarU2 = ls.U(dr0Var, rg1VarH);
                dr0Var.Y();
                if (dr0Var.S) {
                    dr0Var.k(jw0Var);
                } else {
                    dr0Var.i0();
                }
                h12.y(yxVar, dr0Var, ze1VarC);
                h12.y(yxVar2, dr0Var, dx1VarL2);
                if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode2))) {
                    wi0.o(iHashCode2, dr0Var, iHashCode2, yxVar3);
                }
                h12.y(yxVar4, dr0Var, rg1VarU2);
                nxVar.f(dr0Var, Integer.valueOf(i3));
                z2 = true;
                dr0Var.p(true);
                z = false;
                dr0Var.p(false);
            } else {
                z = false;
                z2 = true;
                dr0Var.V(870466081);
                dr0Var.p(false);
            }
            dr0Var.V(870557345);
            dr0Var.p(z);
            dr0Var.p(z2);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new kl0(nxVar, i, b2);
        }
    }

    public static final void d(final long j, final long j2, boolean z, final nx nxVar, dr0 dr0Var, final int i) {
        int i2;
        final boolean z2;
        boolean z3;
        zm2 zm2VarA0;
        dr0Var.W(-833145221);
        if ((i & 6) == 0) {
            i2 = (dr0Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.e(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= dr0Var.g(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.h(nxVar) ? 2048 : 1024;
        }
        if (dr0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            qz2 qz2VarS = t03.S(Boolean.valueOf(z2), null, dr0Var, i3 & 14, 2);
            lu1 lu1Var = qz2VarS.d;
            boolean zBooleanValue = ((Boolean) lu1Var.getValue()).booleanValue();
            dr0Var.V(-1069234984);
            long j3 = zBooleanValue ? j : j2;
            dr0Var.p(false);
            sv svVarE = kv.e(j3);
            boolean zF = dr0Var.f(svVarE);
            Object objK = dr0Var.K();
            if (zF || objK == zy.a) {
                s03 s03Var = new s03(wb.m, new zb(svVarE, (byte) 2));
                dr0Var.f0(s03Var);
                objK = s03Var;
            }
            s03 s03Var2 = (s03) objK;
            boolean zBooleanValue2 = ((Boolean) qz2VarS.a.g()).booleanValue();
            dr0Var.V(-1069234984);
            long j4 = zBooleanValue2 ? j : j2;
            dr0Var.p(false);
            kv kvVar = new kv(j4);
            boolean zBooleanValue3 = ((Boolean) lu1Var.getValue()).booleanValue();
            dr0Var.V(-1069234984);
            long j5 = zBooleanValue3 ? j : j2;
            dr0Var.p(false);
            kv kvVar2 = new kv(j5);
            mz2 mz2VarF = qz2VarS.f();
            dr0Var.V(1058649156);
            if (mz2VarF.c(Boolean.FALSE, Boolean.TRUE)) {
                dr0Var.V(272207019);
                zm2VarA0 = ls.a0(gh1.j, dr0Var);
                z3 = false;
                dr0Var.p(false);
            } else {
                z3 = false;
                dr0Var.V(272326989);
                zm2VarA0 = ls.a0(gh1.k, dr0Var);
                dr0Var.p(false);
            }
            dr0Var.p(z3);
            oz2 oz2VarS = t03.s(qz2VarS, kvVar, kvVar2, zm2VarA0, s03Var2, dr0Var, 0);
            ie0 ie0Var = s00.a;
            kv kvVar3 = (kv) oz2VarS.q.getValue();
            long j6 = kvVar3.a;
            ys.a(ie0Var.a(kvVar3), nxVar, dr0Var, 8 | (i3 & 112));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: mr2
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pr2.d(j, j2, z2, nxVar, (dr0) obj, m02.A(i | 1));
                    return j23.a;
                }
            };
        }
    }
}
