package defpackage;

import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class xq2 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final tk2 f;

    static {
        float f2 = ie1.h0;
        a = f2;
        b = ie1.r0;
        c = ie1.o0;
        float f3 = ie1.l0;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new tk2(0);
    }

    public static final void a(final boolean z, final vp0 vp0Var, rg1 rg1Var, boolean z2, uq2 uq2Var, dr0 dr0Var, final int i) {
        final rg1 rg1Var2;
        final boolean z3;
        final uq2 uq2Var2;
        int i2;
        rg1 rg1Var3;
        uq2 uq2Var3;
        boolean z4;
        int i3;
        dr0Var.W(-263339167);
        int i4 = i | (dr0Var.g(z) ? 4 : 2) | (dr0Var.h(vp0Var) ? 32 : 16) | 1666432;
        if (dr0Var.N(i4 & 1, (599187 & i4) != 599186)) {
            dr0Var.S();
            int i5 = i & 1;
            rg1 rg1VarY = og1.h;
            if (i5 == 0 || dr0Var.x()) {
                pv pvVar = (pv) dr0Var.j(rv.a);
                uq2 uq2Var4 = pvVar.h0;
                long j = pvVar.p;
                if (uq2Var4 == null) {
                    long jC = rv.c(pvVar, ie1.g0);
                    long jC2 = rv.c(pvVar, ie1.j0);
                    long j2 = kv.f;
                    long jC3 = rv.c(pvVar, ie1.i0);
                    long jC4 = rv.c(pvVar, ie1.q0);
                    long jC5 = rv.c(pvVar, ie1.t0);
                    long jC6 = rv.c(pvVar, ie1.p0);
                    long jC7 = rv.c(pvVar, ie1.s0);
                    long jX = cu.x(kv.b(ie1.T, rv.c(pvVar, ie1.S)), j);
                    long jC8 = rv.c(pvVar, ie1.W);
                    float f2 = ie1.X;
                    uq2 uq2Var5 = new uq2(jC, jC2, j2, jC3, jC4, jC5, jC6, jC7, jX, cu.x(kv.b(f2, jC8), j), j2, cu.x(kv.b(ie1.V, rv.c(pvVar, ie1.U)), j), cu.x(kv.b(ie1.Z, rv.c(pvVar, ie1.Y)), j), cu.x(kv.b(f2, rv.c(pvVar, ie1.c0)), j), cu.x(kv.b(f2, rv.c(pvVar, ie1.d0)), j), cu.x(kv.b(ie1.b0, rv.c(pvVar, ie1.a0)), j));
                    pvVar.h0 = uq2Var5;
                    uq2Var4 = uq2Var5;
                }
                i2 = i4 & (-458753);
                rg1Var3 = rg1VarY;
                uq2Var3 = uq2Var4;
                z4 = true;
            } else {
                dr0Var.Q();
                i2 = i4 & (-458753);
                rg1Var3 = rg1Var;
                z4 = z2;
                uq2Var3 = uq2Var;
            }
            dr0Var.q();
            dr0Var.V(1768604058);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            ui1 ui1Var = (ui1) objK;
            dr0Var.p(false);
            if (vp0Var != null) {
                mt0 mt0Var = kz0.a;
                i3 = 2;
                rg1VarY = ia2.y(z, ui1Var, z4, new ba2(2), vp0Var);
            } else {
                i3 = 2;
            }
            b(yj2.f(yj2.n(rg1Var3.c(rg1VarY), i3), c, d), z, z4, uq2Var3, ui1Var, mi2.a(ie1.e0, dr0Var), dr0Var, ((i2 << 3) & 112) | 24960);
            z3 = z4;
            uq2Var2 = uq2Var3;
            rg1Var2 = rg1Var3;
        } else {
            dr0Var.Q();
            rg1Var2 = rg1Var;
            z3 = z2;
            uq2Var2 = uq2Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(z, vp0Var, rg1Var2, z3, uq2Var2, i) { // from class: vq2
                public final /* synthetic */ boolean h;
                public final /* synthetic */ vp0 i;
                public final /* synthetic */ rg1 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ uq2 l;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(1);
                    xq2.a(this.h, this.i, this.j, this.k, this.l, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public static final void b(final rg1 rg1Var, final boolean z, final boolean z2, final uq2 uq2Var, final ui1 ui1Var, final hi2 hi2Var, dr0 dr0Var, final int i) {
        int i2;
        long j;
        long j2;
        long j3;
        dr0Var.W(-670917213);
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.f(uq2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dr0Var.h(null) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dr0Var.f(ui1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dr0Var.f(hi2Var) ? 1048576 : 524288;
        }
        if (dr0Var.N(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? uq2Var.b : uq2Var.f;
            } else {
                j = z ? uq2Var.j : uq2Var.n;
            }
            if (z2) {
                j2 = z ? uq2Var.a : uq2Var.e;
            } else {
                j2 = z ? uq2Var.i : uq2Var.m;
            }
            hi2 hi2VarA = mi2.a(ie1.n0, dr0Var);
            float f2 = ie1.m0;
            long j4 = j2;
            if (z2) {
                j3 = z ? uq2Var.c : uq2Var.g;
            } else {
                j3 = z ? uq2Var.k : uq2Var.o;
            }
            rg1 rg1VarE = ie1.e(rg1Var.c(new yn(f2, new rl2(j3), hi2VarA)), j, hi2VarA);
            ze1 ze1VarC = ho.c(c5.i, false);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarE);
            sy.f.getClass();
            dr0Var.Y();
            boolean z3 = dr0Var.S;
            jw0 jw0Var = l41.W;
            if (z3) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            yx yxVar = c5.F;
            h12.y(yxVar, dr0Var, ze1VarC);
            yx yxVar2 = c5.E;
            h12.y(yxVar2, dr0Var, dx1VarL);
            yx yxVar3 = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar3);
            }
            yx yxVar4 = c5.D;
            h12.y(yxVar4, dr0Var, rg1VarU);
            rg1 rg1VarE2 = ie1.e(av0.a(s60.f().c(new px2(ui1Var, z, ls.a0(gh1.i, dr0Var))), ui1Var, y92.a(ie1.k0 / 2.0f, 4, 0L, false)), j4, hi2Var);
            ze1 ze1VarC2 = ho.c(c5.m, false);
            int iHashCode2 = Long.hashCode(dr0Var.T);
            dx1 dx1VarL2 = dr0Var.l();
            rg1 rg1VarU2 = ls.U(dr0Var, rg1VarE2);
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            h12.y(yxVar, dr0Var, ze1VarC2);
            h12.y(yxVar2, dr0Var, dx1VarL2);
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode2))) {
                wi0.o(iHashCode2, dr0Var, iHashCode2, yxVar3);
            }
            h12.y(yxVar4, dr0Var, rg1VarU2);
            dr0Var.V(1236071411);
            dr0Var.p(false);
            dr0Var.p(true);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: wq2
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xq2.b(rg1Var, z, z2, uq2Var, ui1Var, hi2Var, (dr0) obj, m02.A(i | 1));
                    return j23.a;
                }
            };
        }
    }
}
