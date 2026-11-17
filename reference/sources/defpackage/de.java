package defpackage;

import java.util.WeakHashMap;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class de {
    public static final ie0 a = new ie0(new r3((byte) 12), (byte) 0);
    public static final float b;
    public static final float c;

    static {
        new h81(new r3((byte) 13));
        new l30(0.8f, 0.0f, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    public static final void a(final rg1 rg1Var, final nx nxVar, final xw2 xw2Var, final xw2 xw2Var2, final nx nxVar2, final nx nxVar3, final float f, final o91 o91Var, final sy2 sy2Var, dr0 dr0Var, final int i, final int i2) {
        int i3;
        nx nxVar4;
        float f2;
        int i4;
        bm bmVar = c5.u;
        dr0Var.W(-2033800111);
        if ((i & 6) == 0) {
            i3 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dr0Var.h(nxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dr0Var.f(xw2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= dr0Var.h(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dr0Var.f(xw2Var2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= dr0Var.f(bmVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= dr0Var.h(nxVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            nxVar4 = nxVar3;
            i3 |= dr0Var.h(nxVar4) ? 8388608 : 4194304;
        } else {
            nxVar4 = nxVar3;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= dr0Var.c(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i3 |= dr0Var.f(o91Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (dr0Var.f(sy2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dr0Var.f(null) ? 32 : 16;
        }
        if (dr0Var.N(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((y70) dr0Var.j(a)).a(new sj2(rg1Var, nxVar, xw2Var, xw2Var2, nxVar2, nxVar4, f2, o91Var, sy2Var), dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: ae
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    de.a(rg1Var, nxVar, xw2Var, xw2Var2, nxVar2, nxVar3, f, o91Var, sy2Var, (dr0) obj, m02.A(i | 1), m02.A(i2));
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void b(final nx nxVar, rg1 rg1Var, final nx nxVar2, nx nxVar3, float f, o91 o91Var, sy2 sy2Var, dr0 dr0Var, final int i, final int i2) {
        nx nxVar4;
        int i3;
        boolean z;
        final float f2;
        final o91 o91Var2;
        final sy2 sy2Var2;
        final nx nxVar5;
        final rg1 rg1Var2;
        e72 e72VarR;
        int i4;
        float f3;
        nx nxVar6;
        pv pvVar;
        sy2 sy2Var3;
        nx nxVar7;
        o91 o91Var3;
        float f4;
        sy2 sy2Var4;
        int i5;
        rg1 rg1Var3;
        float f5;
        dr0Var.W(1784421840);
        int i6 = i | 48;
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                nxVar4 = nxVar3;
                i6 |= dr0Var.h(nxVar4) ? 2048 : 1024;
            }
            i3 = i6 | 13197312;
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (dr0Var.N(i3 & 1, z)) {
                dr0Var.S();
                i4 = i & 1;
                f3 = rz1.h;
                if (i4 != 0 || dr0Var.x()) {
                    if (i7 != 0) {
                        nxVar6 = qx.a;
                    } else {
                        nxVar6 = nxVar4;
                    }
                    WeakHashMap weakHashMap = u83.v;
                    o91 o91Var4 = new o91(new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b), m02.h | 16);
                    pvVar = (pv) dr0Var.j(rv.a);
                    sy2Var3 = pvVar.b0;
                    if (sy2Var3 == null) {
                        sy2 sy2Var5 = new sy2(rv.c(pvVar, h7.j), rv.c(pvVar, h7.l), rv.c(pvVar, h7.k), rv.c(pvVar, h7.n), rv.c(pvVar, h7.o), rv.c(pvVar, h7.m));
                        pvVar.b0 = sy2Var5;
                        sy2Var3 = sy2Var5;
                    }
                    nxVar7 = nxVar6;
                    o91Var3 = o91Var4;
                    f4 = f3;
                    sy2Var4 = sy2Var3;
                    i5 = i3 & (-4128769);
                    rg1Var3 = og1.h;
                } else {
                    dr0Var.Q();
                    f4 = f;
                    o91Var3 = o91Var;
                    sy2Var4 = sy2Var;
                    i5 = i3 & (-4128769);
                    nxVar7 = nxVar4;
                    rg1Var3 = rg1Var;
                }
                dr0Var.q();
                xw2 xw2VarA = e13.a(aa3.h, dr0Var);
                xw2 xw2Var = xw2.d;
                if (!cc0.b(f4, Float.NaN) || cc0.b(f4, Float.POSITIVE_INFINITY)) {
                    f5 = f3;
                } else {
                    f5 = f4;
                }
                a(rg1Var3, nxVar, xw2VarA, xw2Var, nxVar2, nxVar7, f5, o91Var3, sy2Var4, dr0Var, 1797174 | ((i5 << 12) & 29360128), 48);
                rg1Var2 = rg1Var3;
                nxVar5 = nxVar7;
                o91Var2 = o91Var3;
                sy2Var2 = sy2Var4;
                f2 = f4;
            } else {
                dr0Var.Q();
                f2 = f;
                o91Var2 = o91Var;
                sy2Var2 = sy2Var;
                nxVar5 = nxVar4;
                rg1Var2 = rg1Var;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: zd
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        de.b(nxVar, rg1Var2, nxVar2, nxVar5, f2, o91Var2, sy2Var2, (dr0) obj, m02.A(i | 1), i2);
                        return j23.a;
                    }
                };
            }
        }
        i6 = i | 3120;
        nxVar4 = nxVar3;
        i3 = i6 | 13197312;
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (dr0Var.N(i3 & 1, z)) {
            dr0Var.S();
            i4 = i & 1;
            f3 = rz1.h;
            if (i4 != 0) {
                if (i7 != 0) {
                    nxVar6 = qx.a;
                } else {
                    nxVar6 = nxVar4;
                }
                WeakHashMap weakHashMap2 = u83.v;
                o91 o91Var5 = new o91(new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b), m02.h | 16);
                pvVar = (pv) dr0Var.j(rv.a);
                sy2Var3 = pvVar.b0;
                if (sy2Var3 == null) {
                    sy2 sy2Var6 = new sy2(rv.c(pvVar, h7.j), rv.c(pvVar, h7.l), rv.c(pvVar, h7.k), rv.c(pvVar, h7.n), rv.c(pvVar, h7.o), rv.c(pvVar, h7.m));
                    pvVar.b0 = sy2Var6;
                    sy2Var3 = sy2Var6;
                }
                nxVar7 = nxVar6;
                o91Var3 = o91Var5;
                f4 = f3;
                sy2Var4 = sy2Var3;
                i5 = i3 & (-4128769);
                rg1Var3 = og1.h;
            } else {
                if (i7 != 0) {
                    nxVar6 = qx.a;
                } else {
                    nxVar6 = nxVar4;
                }
                WeakHashMap weakHashMap3 = u83.v;
                o91 o91Var6 = new o91(new i23(rz1.i(dr0Var).g, rz1.i(dr0Var).b), m02.h | 16);
                pvVar = (pv) dr0Var.j(rv.a);
                sy2Var3 = pvVar.b0;
                if (sy2Var3 == null) {
                    sy2 sy2Var7 = new sy2(rv.c(pvVar, h7.j), rv.c(pvVar, h7.l), rv.c(pvVar, h7.k), rv.c(pvVar, h7.n), rv.c(pvVar, h7.o), rv.c(pvVar, h7.m));
                    pvVar.b0 = sy2Var7;
                    sy2Var3 = sy2Var7;
                }
                nxVar7 = nxVar6;
                o91Var3 = o91Var6;
                f4 = f3;
                sy2Var4 = sy2Var3;
                i5 = i3 & (-4128769);
                rg1Var3 = og1.h;
            }
            dr0Var.q();
            xw2 xw2VarA2 = e13.a(aa3.h, dr0Var);
            xw2 xw2Var2 = xw2.d;
            if (cc0.b(f4, Float.NaN)) {
                f5 = f3;
            } else {
                f5 = f3;
            }
            a(rg1Var3, nxVar, xw2VarA2, xw2Var2, nxVar2, nxVar7, f5, o91Var3, sy2Var4, dr0Var, 1797174 | ((i5 << 12) & 29360128), 48);
            rg1Var2 = rg1Var3;
            nxVar5 = nxVar7;
            o91Var2 = o91Var3;
            sy2Var2 = sy2Var4;
            f2 = f4;
        } else {
            dr0Var.Q();
            f2 = f;
            o91Var2 = o91Var;
            sy2Var2 = sy2Var;
            nxVar5 = nxVar4;
            rg1Var2 = rg1Var;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: zd
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    de.b(nxVar, rg1Var2, nxVar2, nxVar5, f2, o91Var2, sy2Var2, (dr0) obj, m02.A(i | 1), i2);
                    return j23.a;
                }
            };
        }
    }

    public static final void c(final rg1 rg1Var, final bk0 bk0Var, final long j, final long j2, final long j3, long j4, final nx nxVar, final xw2 xw2Var, final xw2 xw2Var2, final kp0 kp0Var, final nx nxVar2, nx nxVar3, final float f, dr0 dr0Var, final int i) {
        nx nxVar4;
        final long j5 = j4;
        bm bmVar = c5.u;
        dr0Var.W(126395868);
        int i2 = i | (dr0Var.f(rg1Var) ? 4 : 2) | (dr0Var.f(bk0Var) ? 32 : 16) | (dr0Var.e(j) ? 256 : 128) | (dr0Var.e(j2) ? 2048 : 1024) | (dr0Var.e(j3) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | (dr0Var.e(j5) ? 131072 : 65536) | (dr0Var.h(nxVar) ? 1048576 : 524288) | (dr0Var.f(xw2Var) ? 8388608 : 4194304) | (dr0Var.h(null) ? 67108864 : 33554432) | (dr0Var.f(xw2Var2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY);
        int i3 = 1600566 | (dr0Var.f(bmVar) ? 256 : 128) | (dr0Var.h(nxVar2) ? 131072 : 65536) | (dr0Var.c(f) ? 8388608 : 4194304);
        if (dr0Var.N(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i3) == 4793490) ? false : true)) {
            boolean z = ((i2 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608);
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (z || objK == yyVar) {
                objK = new uy2(bk0Var, f);
                dr0Var.f0(objK);
            }
            uy2 uy2Var = (uy2) objK;
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1Var);
            sy.f.getClass();
            dr0Var.Y();
            boolean z2 = dr0Var.S;
            jw0 jw0Var = l41.W;
            if (z2) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            yx yxVar = c5.F;
            h12.y(yxVar, dr0Var, uy2Var);
            yx yxVar2 = c5.E;
            h12.y(yxVar2, dr0Var, dx1VarL);
            yx yxVar3 = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar3);
            }
            yx yxVar4 = c5.D;
            h12.y(yxVar4, dr0Var, rg1VarU);
            og1 og1Var = og1.h;
            rg1 rg1VarW = s60.w(og1Var, "navigationIcon");
            float f2 = b;
            rg1 rg1VarJ = t03.J(rg1VarW, f2, 0.0f, 0.0f, 0.0f, 14);
            dm dmVar = c5.i;
            ze1 ze1VarC = ho.c(dmVar, false);
            int iHashCode2 = Long.hashCode(dr0Var.T);
            dx1 dx1VarL2 = dr0Var.l();
            rg1 rg1VarU2 = ls.U(dr0Var, rg1VarJ);
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
            ie0 ie0Var = s00.a;
            ys.a(ie0Var.a(new kv(j)), nxVar2, dr0Var, 8 | ((i3 >> 12) & 112));
            dr0Var.p(true);
            dr0Var.V(-1359701523);
            rg1 rg1VarH = t03.H(s60.w(og1Var, "title"), f2, 0.0f, 2);
            dr0Var.V(510340109);
            dr0Var.p(false);
            rg1 rg1VarC = rg1VarH.c(og1Var);
            Object objK2 = dr0Var.K();
            if (objK2 == yyVar) {
                objK2 = new be(kp0Var, (byte) 0);
                dr0Var.f0(objK2);
            }
            rg1 rg1VarI0 = h7.i0(rg1VarC, (vp0) objK2);
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
            h12.a(j2, xw2Var, nxVar, dr0Var, ((i2 >> 9) & 14) | ((i2 >> 18) & 112) | ((i2 >> 12) & 896));
            dr0Var.p(true);
            dr0Var.p(false);
            rg1 rg1VarJ2 = t03.J(s60.w(og1Var, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            ze1 ze1VarC3 = ho.c(dmVar, false);
            int iHashCode4 = Long.hashCode(dr0Var.T);
            dx1 dx1VarL4 = dr0Var.l();
            rg1 rg1VarU4 = ls.U(dr0Var, rg1VarJ2);
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            h12.y(yxVar, dr0Var, ze1VarC3);
            h12.y(yxVar2, dr0Var, dx1VarL4);
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode4))) {
                wi0.o(iHashCode4, dr0Var, iHashCode4, yxVar3);
            }
            h12.y(yxVar4, dr0Var, rg1VarU4);
            j5 = j4;
            i42 i42VarA = ie0Var.a(new kv(j5));
            nxVar4 = nxVar3;
            ys.a(i42VarA, nxVar4, dr0Var, 56);
            dr0Var.p(true);
            dr0Var.p(true);
        } else {
            nxVar4 = nxVar3;
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            final nx nxVar5 = nxVar4;
            e72VarR.d = new zp0(bk0Var, j, j2, j3, j5, nxVar, xw2Var, xw2Var2, kp0Var, nxVar2, nxVar5, f, i) { // from class: ce
                public final /* synthetic */ bk0 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ long m;
                public final /* synthetic */ nx n;
                public final /* synthetic */ xw2 o;
                public final /* synthetic */ xw2 p;
                public final /* synthetic */ kp0 q;
                public final /* synthetic */ nx r;
                public final /* synthetic */ nx s;
                public final /* synthetic */ float t;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(1);
                    de.c(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }
}
