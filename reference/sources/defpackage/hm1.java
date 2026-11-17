package defpackage;

import java.util.WeakHashMap;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hm1 {
    public static final float a = aa3.K;
    public static final float b = 8.0f;
    public static final float c = 4.0f;
    public static final float d = 16.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;
    public static final float g = 44.0f;
    public static final ie0 h = new ie0(new jw0((byte) 19), (byte) 0);

    public static final void a(rg1 rg1Var, long j, long j2, o91 o91Var, final nx nxVar, dr0 dr0Var, final int i) {
        final rg1 rg1Var2;
        final long j3;
        final long j4;
        final o91 o91Var2;
        long j5;
        rg1 rg1Var3;
        long j6;
        o91 o91Var3;
        dr0Var.W(1054099326);
        int i2 = i | 11414;
        if (dr0Var.N(i2 & 1, (74899 & i2) != 74898)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                long jD = rv.d(aa3.D, dr0Var);
                long jA = rv.a((pv) dr0Var.j(rv.a), jD);
                WeakHashMap weakHashMap = u83.v;
                o91 o91Var4 = new o91(new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b), m02.h | 32);
                j5 = jD;
                rg1Var3 = og1.h;
                j6 = jA;
                o91Var3 = o91Var4;
            } else {
                dr0Var.Q();
                rg1Var3 = rg1Var;
                j5 = j;
                j6 = j2;
                o91Var3 = o91Var;
            }
            dr0Var.q();
            ((q70) dr0Var.j(h)).a(new im1(rg1Var3, j5, j6, o91Var3, nxVar), dr0Var, 0);
            rg1Var2 = rg1Var3;
            j3 = j5;
            j4 = j6;
            o91Var2 = o91Var3;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            j3 = j;
            j4 = j2;
            o91Var2 = o91Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(j3, j4, o91Var2, nxVar, i) { // from class: zl1
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ o91 k;
                public final /* synthetic */ nx l;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(196609);
                    hm1.a(this.h, this.i, this.j, this.k, this.l, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void b(final va2 va2Var, final boolean z, final kp0 kp0Var, final nx nxVar, rg1 rg1Var, boolean z2, final nx nxVar2, boolean z3, yl1 yl1Var, dr0 dr0Var, final int i) {
        int i2;
        final rg1 rg1Var2;
        final boolean z4;
        final boolean z5;
        final yl1 yl1Var2;
        char c2;
        yl1 yl1Var3;
        rg1 rg1Var3;
        int i3;
        yl1 yl1Var4;
        boolean z6;
        boolean z7;
        nx nxVarN;
        boolean z8;
        dr0Var.W(974293026);
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(va2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(kp0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.h(nxVar) ? 2048 : 1024;
        }
        int i4 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i4 |= dr0Var.h(nxVar2) ? 1048576 : 524288;
        }
        int i5 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i5 = 46137344 | i4;
        }
        int i6 = i5 | 805306368;
        if (dr0Var.N(i6 & 1, (306783379 & i6) != 306783378)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                pv pvVar = (pv) dr0Var.j(rv.a);
                yl1 yl1Var5 = pvVar.g0;
                if (yl1Var5 == null) {
                    long jC = rv.c(pvVar, aa3.E);
                    long jC2 = rv.c(pvVar, aa3.H);
                    long jC3 = rv.c(pvVar, aa3.F);
                    qv qvVar = aa3.I;
                    long jC4 = rv.c(pvVar, qvVar);
                    qv qvVar2 = aa3.J;
                    c2 = ' ';
                    yl1Var3 = new yl1(jC, jC2, jC3, jC4, rv.c(pvVar, qvVar2), kv.b(0.38f, rv.c(pvVar, qvVar)), kv.b(0.38f, rv.c(pvVar, qvVar2)));
                    pvVar.g0 = yl1Var3;
                } else {
                    c2 = ' ';
                    yl1Var3 = yl1Var5;
                }
                rg1Var3 = og1.h;
                i3 = i6 & (-234881025);
                yl1Var4 = yl1Var3;
                z6 = true;
                z7 = true;
            } else {
                dr0Var.Q();
                rg1Var3 = rg1Var;
                z6 = z2;
                z7 = z3;
                i3 = i6 & (-234881025);
                c2 = ' ';
                yl1Var4 = yl1Var;
            }
            dr0Var.q();
            dr0Var.V(-224963495);
            Object objK = dr0Var.K();
            Object obj = zy.a;
            if (objK == obj) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            ui1 ui1Var = (ui1) objK;
            dr0Var.p(false);
            gh1 gh1Var = gh1.j;
            boolean z9 = z7;
            zm2 zm2VarA0 = ls.a0(gh1Var, dr0Var);
            nx nxVarN2 = dt.N(-876637252, new fm1(yl1Var4, z, z6, zm2VarA0, nxVar2, z9, nxVar), dr0Var);
            if (nxVar2 == null) {
                dr0Var.V(-224036658);
                dr0Var.p(false);
                nxVarN = null;
            } else {
                dr0Var.V(-224036657);
                nxVarN = dt.N(802208206, new us1(yl1Var4, z, z6, zm2VarA0, nxVar2), dr0Var);
                dr0Var.p(false);
            }
            nx nxVar3 = nxVarN;
            Object objK2 = dr0Var.K();
            if (objK2 == obj) {
                objK2 = new iu1(0);
                dr0Var.f0(objK2);
            }
            iu1 iu1Var = (iu1) objK2;
            boolean z10 = z6;
            rg1 rg1Var4 = rg1Var3;
            yl1 yl1Var6 = yl1Var4;
            rg1 rg1VarA = va2Var.a(yj2.a(ia2.t(rg1Var4, z, ui1Var, null, z10, new ba2(4), kp0Var), Float.NaN, a), 1.0f);
            Object objK3 = dr0Var.K();
            if (objK3 == obj) {
                objK3 = new am1(iu1Var, (byte) 0);
                dr0Var.f0(objK3);
            }
            rg1 rg1VarP = uz0.p(rg1VarA, (vp0) objK3);
            ze1 ze1VarC = ho.c(c5.m, true);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarP);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, ze1VarC);
            h12.y(c5.E, dr0Var, dx1VarL);
            yx yxVar = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar);
            }
            h12.y(c5.D, dr0Var, rg1VarU);
            kn2 kn2VarA = vb.a(z ? 1.0f : 0.0f, ls.a0(gh1Var, dr0Var), dr0Var);
            kn2 kn2VarA2 = vb.a(z ? 1.0f : 0.0f, ls.a0(gh1.i, dr0Var), dr0Var);
            e90 e90Var = (e90) dr0Var.j(uz.h);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((iu1Var.g() - e90Var.R(56.0f)) / 2.0f)) << c2) | (((long) Float.floatToRawIntBits(e90Var.A(f))) & 4294967295L);
            boolean zF = dr0Var.f(ui1Var) | dr0Var.e(jFloatToRawIntBits);
            Object objK4 = dr0Var.K();
            if (zF || objK4 == obj) {
                objK4 = new ce1(ui1Var, jFloatToRawIntBits);
                dr0Var.f0(objK4);
            }
            nx nxVarN3 = dt.N(-2082182507, new p70((ce1) objK4, (byte) 5), dr0Var);
            nx nxVarN4 = dt.N(-799524251, new rl(kn2VarA, yl1Var6, (byte) 7), dr0Var);
            boolean zF2 = dr0Var.f(kn2VarA);
            Object objK5 = dr0Var.K();
            if (zF2 || objK5 == obj) {
                objK5 = new bm1(kn2VarA, (byte) 0);
                dr0Var.f0(objK5);
            }
            kp0 kp0Var2 = (kp0) objK5;
            boolean zF3 = dr0Var.f(kn2VarA2);
            Object objK6 = dr0Var.K();
            if (zF3 || objK6 == obj) {
                z8 = true;
                objK6 = new bm1(kn2VarA2, (byte) 1);
                dr0Var.f0(objK6);
            } else {
                z8 = true;
            }
            c(nxVarN3, nxVarN4, nxVarN2, nxVar3, z9, kp0Var2, (kp0) objK6, dr0Var, ((i3 >> 9) & 57344) | 438);
            z5 = z9;
            dr0Var.p(z8);
            yl1Var2 = yl1Var6;
            z4 = z10;
            rg1Var2 = rg1Var4;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            z4 = z2;
            z5 = z3;
            yl1Var2 = yl1Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: cm1
                @Override // defpackage.zp0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    hm1.b(va2Var, z, kp0Var, nxVar, rg1Var2, z4, nxVar2, z5, yl1Var2, (dr0) obj2, m02.A(i | 1));
                    return j23.a;
                }
            };
        }
    }

    public static final void c(nx nxVar, nx nxVar2, nx nxVar3, nx nxVar4, boolean z, kp0 kp0Var, kp0 kp0Var2, dr0 dr0Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        nx nxVar5 = nxVar4;
        kp0 kp0Var3 = kp0Var;
        dr0Var.W(-1019541078);
        if ((i & 6) == 0) {
            i2 = (dr0Var.h(nxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(nxVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(nxVar3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.h(nxVar5) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dr0Var.g(z) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dr0Var.h(kp0Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dr0Var.h(kp0Var2) ? 1048576 : 524288;
        }
        byte b2 = 1;
        if (dr0Var.N(i2 & 1, (599187 & i2) != 599186)) {
            tx txVar = new tx(b2);
            og1 og1Var = og1.h;
            rg1 rg1VarN = uz0.n(og1Var, txVar);
            int i3 = 57344 & i2;
            boolean z4 = ((i2 & 3670016) == 1048576) | ((i2 & 7168) == 2048) | (i3 == 16384);
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (z4 || objK == yyVar) {
                objK = new gm1(kp0Var2, nxVar5, z);
                dr0Var.f0(objK);
            }
            ze1 ze1Var = (ze1) objK;
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarN);
            sy.f.getClass();
            dr0Var.Y();
            boolean z5 = dr0Var.S;
            int i4 = i2;
            jw0 jw0Var = l41.W;
            if (z5) {
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
            nxVar.f(dr0Var, Integer.valueOf(i4 & 14));
            nxVar2.f(dr0Var, Integer.valueOf((i4 >> 3) & 14));
            rg1 rg1VarW = s60.w(og1Var, "icon");
            dm dmVar = c5.i;
            ze1 ze1VarC = ho.c(dmVar, false);
            int iHashCode2 = Long.hashCode(dr0Var.T);
            dx1 dx1VarL2 = dr0Var.l();
            rg1 rg1VarU2 = ls.U(dr0Var, rg1VarW);
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
            wi0.n((i4 >> 6) & 14, nxVar3, dr0Var, true);
            if (nxVar4 != null) {
                dr0Var.V(-660471321);
                rg1 rg1VarW2 = s60.w(og1Var, "label");
                boolean z6 = (i3 == 16384) | ((i4 & 458752) == 131072);
                Object objK2 = dr0Var.K();
                if (z6 || objK2 == yyVar) {
                    z2 = z;
                    kp0Var3 = kp0Var;
                    objK2 = new yn0(z2, kp0Var3, (byte) 2);
                    dr0Var.f0(objK2);
                } else {
                    z2 = z;
                    kp0Var3 = kp0Var;
                }
                rg1 rg1VarI0 = h7.i0(rg1VarW2, (vp0) objK2);
                ze1 ze1VarC2 = ho.c(dmVar, false);
                int iHashCode3 = Long.hashCode(dr0Var.T);
                dx1 dx1VarL3 = dr0Var.l();
                rg1 rg1VarU3 = ls.U(dr0Var, rg1VarI0);
                dr0Var.Y();
                if (dr0Var.S) {
                    dr0Var.k(jw0Var);
                } else {
                    dr0Var.i0();
                }
                h12.y(yxVar, dr0Var, ze1VarC2);
                h12.y(yxVar2, dr0Var, dx1VarL3);
                if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode3))) {
                    wi0.o(iHashCode3, dr0Var, iHashCode3, yxVar3);
                }
                h12.y(yxVar4, dr0Var, rg1VarU3);
                nxVar5 = nxVar4;
                nxVar5.f(dr0Var, Integer.valueOf((i4 >> 9) & 14));
                z3 = true;
                dr0Var.p(true);
                dr0Var.p(false);
            } else {
                nxVar5 = nxVar4;
                z2 = z;
                kp0Var3 = kp0Var;
                z3 = true;
                dr0Var.V(-660200319);
                dr0Var.p(false);
            }
            dr0Var.p(z3);
        } else {
            z2 = z;
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new bt(nxVar, nxVar2, nxVar3, nxVar5, z2, kp0Var3, kp0Var2, i);
        }
    }
}
