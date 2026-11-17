package defpackage;

import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class wt {
    public static final rt1 a;

    static {
        t03.f(2);
        a = t03.f(2);
        t03.f(2);
    }

    public static final void a(final nx nxVar, final xw2 xw2Var, final long j, final long j2, final long j3, final float f, final rt1 rt1Var, dr0 dr0Var, final int i) {
        dr0Var.W(-2070754602);
        int i2 = i | (dr0Var.h(nxVar) ? 4 : 2) | (dr0Var.f(xw2Var) ? 32 : 16) | (dr0Var.e(j) ? 256 : 128) | (dr0Var.h(null) ? 2048 : 1024) | (dr0Var.h(null) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | (dr0Var.h(null) ? 131072 : 65536) | (dr0Var.e(j2) ? 1048576 : 524288) | (dr0Var.e(j3) ? 8388608 : 4194304) | (dr0Var.c(f) ? 67108864 : 33554432) | (dr0Var.f(rt1Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY);
        if (dr0Var.N(i2 & 1, (306783379 & i2) != 306783378)) {
            ys.b(new i42[]{s00.a.a(new kv(j)), gw2.a.a(xw2Var)}, dt.N(-668234218, new ut(f, rt1Var, j2, nxVar, j3), dr0Var), dr0Var, 56);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(xw2Var, j, j2, j3, f, rt1Var, i) { // from class: tt
                public final /* synthetic */ xw2 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ float m;
                public final /* synthetic */ rt1 n;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(1);
                    wt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final kp0 kp0Var, final nx nxVar, rg1 rg1Var, boolean z2, hi2 hi2Var, tf2 tf2Var, uf2 uf2Var, zn znVar, dr0 dr0Var, final int i) {
        final rg1 rg1Var2;
        final boolean z3;
        final hi2 hi2Var2;
        final tf2 tf2Var2;
        final uf2 uf2Var2;
        final zn znVarC;
        boolean z4;
        int i2;
        rg1 rg1Var3;
        dr0Var.W(-1385473344);
        int i3 = i | (dr0Var.g(z) ? 4 : 2) | (dr0Var.h(kp0Var) ? 32 : 16) | 307981312;
        if (dr0Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                hi2 hi2VarA = mi2.a(s60.w, dr0Var);
                pv pvVar = (pv) dr0Var.j(rv.a);
                tf2Var2 = pvVar.a0;
                if (tf2Var2 == null) {
                    long j = kv.f;
                    tf2 tf2Var3 = new tf2(j, rv.c(pvVar, s60.K), rv.c(pvVar, s60.O), rv.c(pvVar, s60.S), j, kv.b(s60.y, rv.c(pvVar, s60.x)), kv.b(s60.M, rv.c(pvVar, s60.L)), kv.b(s60.Q, rv.c(pvVar, s60.P)), rv.c(pvVar, s60.E), kv.b(s60.B, rv.c(pvVar, s60.A)), rv.c(pvVar, s60.J), rv.c(pvVar, s60.N), rv.c(pvVar, s60.R));
                    pvVar.a0 = tf2Var3;
                    tf2Var2 = tf2Var3;
                }
                uf2 uf2Var3 = new uf2(s60.F, s60.z);
                int i4 = i3 & (-2143289345);
                long jD = rv.d(s60.G, dr0Var);
                long j2 = kv.f;
                kv.b(s60.D, rv.d(s60.C, dr0Var));
                float f = s60.H;
                if (z) {
                    f = 0.0f;
                    jD = j2;
                }
                hi2Var2 = hi2VarA;
                uf2Var2 = uf2Var3;
                z4 = true;
                znVarC = s60.c(f, jD);
                i2 = i4;
                rg1Var3 = og1.h;
            } else {
                dr0Var.Q();
                z4 = z2;
                hi2Var2 = hi2Var;
                tf2Var2 = tf2Var;
                uf2Var2 = uf2Var;
                znVarC = znVar;
                i2 = i3 & (-2143289345);
                rg1Var3 = rg1Var;
            }
            dr0Var.q();
            c(z, rg1Var3, kp0Var, z4, nxVar, e13.a(s60.I, dr0Var), hi2Var2, tf2Var2, uf2Var2, znVarC, cu.a, a, dr0Var, (i2 & 14) | 12582960 | ((i2 << 3) & 896) | 102263808, 224256);
            rg1Var2 = rg1Var3;
            z3 = z4;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            z3 = z2;
            hi2Var2 = hi2Var;
            tf2Var2 = tf2Var;
            uf2Var2 = uf2Var;
            znVarC = znVar;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(z, kp0Var, nxVar, rg1Var2, z3, hi2Var2, tf2Var2, uf2Var2, znVarC, i) { // from class: qt
                public final /* synthetic */ boolean h;
                public final /* synthetic */ kp0 i;
                public final /* synthetic */ nx j;
                public final /* synthetic */ rg1 k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ hi2 m;
                public final /* synthetic */ tf2 n;
                public final /* synthetic */ uf2 o;
                public final /* synthetic */ zn p;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(385);
                    wt.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0221  */
    public static final void c(final boolean z, final rg1 rg1Var, final kp0 kp0Var, final boolean z2, final nx nxVar, final xw2 xw2Var, final hi2 hi2Var, final tf2 tf2Var, final uf2 uf2Var, final zn znVar, final float f, final rt1 rt1Var, dr0 dr0Var, final int i, final int i2) {
        int i3;
        int i4;
        long j;
        float f2;
        tb tbVar;
        boolean z3;
        dd ddVar;
        dr0Var.W(1786844928);
        if ((i & 6) == 0) {
            i3 = (dr0Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dr0Var.f(rg1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dr0Var.h(kp0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= dr0Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dr0Var.h(nxVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= dr0Var.f(xw2Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= dr0Var.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= dr0Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= dr0Var.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= dr0Var.f(hi2Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (dr0Var.f(tf2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dr0Var.f(uf2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dr0Var.f(znVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dr0Var.c(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dr0Var.f(rt1Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= dr0Var.f(null) ? 131072 : 65536;
        }
        int i5 = i3;
        if (dr0Var.N(i5 & 1, ((306783379 & i3) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            dr0Var.V(73215547);
            Object objK = dr0Var.K();
            Object obj = zy.a;
            if (objK == obj) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            ui1 ui1Var = (ui1) objK;
            dr0Var.p(false);
            Object objK2 = dr0Var.K();
            if (objK2 == obj) {
                objK2 = new rt((byte) 0);
                dr0Var.f0(objK2);
            }
            rg1 rg1VarA = tg2.a(rg1Var, false, (vp0) objK2);
            if (z2) {
                j = !z ? tf2Var.a : tf2Var.i;
            } else {
                j = z ? tf2Var.j : tf2Var.e;
            }
            long j2 = j;
            if (uf2Var == null) {
                dr0Var.V(73531126);
                dr0Var.p(false);
                ui1Var = ui1Var;
                i5 = i5;
                ddVar = null;
            } else {
                dr0Var.V(-828912021);
                int i6 = ((i5 >> 9) & 14) | ((i4 << 3) & 896);
                Object objK3 = dr0Var.K();
                if (objK3 == obj) {
                    objK3 = new ll2();
                    dr0Var.f0(objK3);
                }
                ll2 ll2Var = (ll2) objK3;
                Object objK4 = dr0Var.K();
                if (objK4 == obj) {
                    objK4 = rz1.x(null);
                    dr0Var.f0(objK4);
                }
                sj1 sj1Var = (sj1) objK4;
                boolean zF = dr0Var.f(ui1Var);
                Object objK5 = dr0Var.K();
                if (zF || objK5 == obj) {
                    objK5 = new op(ui1Var, ll2Var, null, (byte) 1);
                    dr0Var.f0(objK5);
                }
                h7.J((zp0) objK5, dr0Var, ui1Var);
                gz0 gz0Var = (gz0) dv.G0(ll2Var);
                if (!z2 || (gz0Var instanceof m22)) {
                    f2 = 0.0f;
                } else if (gz0Var instanceof ut0) {
                    f2 = uf2Var.a;
                } else if ((gz0Var instanceof wl0) || !(gz0Var instanceof jd0)) {
                    f2 = 0.0f;
                } else {
                    f2 = uf2Var.b;
                }
                Object objK6 = dr0Var.K();
                if (objK6 == obj) {
                    objK6 = new tb(new cc0(f2), aa3.S, null, 12);
                    dr0Var.f0(objK6);
                }
                tb tbVar2 = (tb) objK6;
                cc0 cc0Var = new cc0(f2);
                boolean zH = dr0Var.h(tbVar2) | dr0Var.c(f2) | ((((i6 & 14) ^ 6) > 4 && dr0Var.g(z2)) || (i6 & 6) == 4) | dr0Var.h(gz0Var);
                Object objK7 = dr0Var.K();
                if (zH || objK7 == obj) {
                    tbVar = tbVar2;
                    z3 = false;
                    Object ppVar = new pp(tbVar, f2, z2, gz0Var, sj1Var, (m10) null);
                    dr0Var.f0(ppVar);
                    objK7 = ppVar;
                } else {
                    tbVar = tbVar2;
                    z3 = false;
                }
                h7.J((zp0) objK7, dr0Var, cc0Var);
                ddVar = tbVar.c;
                dr0Var.p(z3);
            }
            iq2.b(z, kp0Var, rg1VarA, z2, hi2Var, j2, ddVar != null ? ((cc0) ddVar.i.getValue()).h : 0.0f, znVar, ui1Var, dt.N(-990050154, new vt(tf2Var, z2, z, nxVar, xw2Var, f, rt1Var), dr0Var), dr0Var, (i5 & 14) | ((i5 >> 3) & 112) | (i5 & 7168) | ((i5 >> 15) & 57344) | ((i4 << 21) & 1879048192), 192);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: st
                @Override // defpackage.zp0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = m02.A(i | 1);
                    int iA2 = m02.A(i2);
                    wt.c(z, rg1Var, kp0Var, z2, nxVar, xw2Var, hi2Var, tf2Var, uf2Var, znVar, f, rt1Var, (dr0) obj2, iA, iA2);
                    return j23.a;
                }
            };
        }
    }
}
