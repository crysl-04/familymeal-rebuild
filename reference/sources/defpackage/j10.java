package defpackage;

import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j10 {
    public static final e10 a;

    static {
        ie0 ie0Var = ca.a;
        long j = kv.c;
        long j2 = kv.b;
        a = new e10(j, j2, j2, kv.b(0.38f, j2), kv.b(0.38f, j2));
    }

    public static final void a(e10 e10Var, rg1 rg1Var, nx nxVar, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(-527864079);
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(e10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.f(rg1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(nxVar) ? 256 : 128;
        }
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            cm cmVar = g10.a;
            pa2 pa2VarA = qa2.a(4.0f);
            boolean z = cc0.a(3.0f, 0.0f) > 0;
            long j = fs0.a;
            rg1 rg1VarC = uz0.C(t03.H(uz0.D(ie1.e((cc0.a(3.0f, 0.0f) > 0 || z) ? rg1Var.c(new fi2(pa2VarA, z, j, j)) : rg1Var, e10Var.a, t03.A)), 0.0f, g10.d, 1), uz0.v(dr0Var));
            int i3 = (i2 << 3) & 7168;
            aw awVarA = yv.a(uz0.g, c5.u, dr0Var, 0);
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarC);
            sy.f.getClass();
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(l41.W);
            } else {
                dr0Var.i0();
            }
            h12.y(c5.F, dr0Var, awVarA);
            h12.y(c5.E, dr0Var, dx1VarL);
            h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
            h12.t(dr0Var);
            h12.y(c5.D, dr0Var, rg1VarU);
            nxVar.c(bw.a, dr0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha((Object) e10Var, (Object) rg1Var, (hq0) nxVar, i, (byte) 3);
        }
    }

    public static final void b(rg1 rg1Var, e10 e10Var, final vp0 vp0Var, dr0 dr0Var, final int i, final int i2) {
        int i3;
        int i4;
        dr0Var.W(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (dr0Var.f(rg1Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (dr0Var.f(e10Var) ? 32 : 16);
        }
        int i7 = i4 | (dr0Var.h(vp0Var) ? 256 : 128);
        byte b = 1;
        if (dr0Var.N(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                rg1Var = og1.h;
            }
            if (i6 != 0) {
                e10Var = a;
            }
            a(e10Var, rg1Var, dt.N(-250345048, new ng(vp0Var, e10Var, b), dr0Var), dr0Var, ((i7 >> 3) & 14) | 384 | ((i7 << 3) & 112));
        } else {
            dr0Var.Q();
        }
        final rg1 rg1Var2 = rg1Var;
        final e10 e10Var2 = e10Var;
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(e10Var2, vp0Var, i, i2) { // from class: h10
                public final /* synthetic */ e10 i;
                public final /* synthetic */ vp0 j;
                public final /* synthetic */ byte k;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.k = i2;
                }

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(1);
                    j10.b(this.h, this.i, this.j, (dr0) obj, iA, this.k);
                    return j23.a;
                }
            };
        }
    }

    public static final void c(String str, boolean z, e10 e10Var, rg1 rg1Var, aq0 aq0Var, kp0 kp0Var, dr0 dr0Var, int i) {
        int i2;
        dr0 dr0Var2 = dr0Var;
        dr0Var2.W(-2001167027);
        if ((i & 6) == 0) {
            i2 = (dr0Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var2.f(e10Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var2.f(rg1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dr0Var2.h(aq0Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dr0Var2.h(kp0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (dr0Var2.N(i3 & 1, (74899 & i3) != 74898)) {
            cm cmVar = g10.a;
            float f = g10.c;
            ah ahVar = new ah(f, new wg((byte) 0));
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objK = dr0Var2.K();
            if (z2 || objK == zy.a) {
                objK = new i10(z, kp0Var, (byte) 0);
                dr0Var2.f0(objK);
            }
            rg1 rg1VarH = t03.H(yj2.k(h7.X(rg1Var, z, str, null, (kp0) objK, 12).c(yj2.a), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            ua2 ua2VarA = ta2.a(ahVar, cmVar, dr0Var2, 54);
            int iHashCode = Long.hashCode(dr0Var2.T);
            dx1 dx1VarL = dr0Var2.l();
            rg1 rg1VarU = ls.U(dr0Var2, rg1VarH);
            sy.f.getClass();
            dr0Var2.Y();
            boolean z3 = dr0Var2.S;
            jw0 jw0Var = l41.W;
            if (z3) {
                dr0Var2.k(jw0Var);
            } else {
                dr0Var2.i0();
            }
            yx yxVar = c5.F;
            h12.y(yxVar, dr0Var2, ua2VarA);
            yx yxVar2 = c5.E;
            h12.y(yxVar2, dr0Var2, dx1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yx yxVar3 = c5.G;
            h12.y(yxVar3, dr0Var2, numValueOf);
            h12.t(dr0Var2);
            yx yxVar4 = c5.D;
            h12.y(yxVar4, dr0Var2, rg1VarU);
            if (aq0Var == null) {
                dr0Var2.V(-1597947094);
                dr0Var2.p(false);
            } else {
                dr0Var2.V(-1597947093);
                float f2 = g10.e;
                rg1 rg1VarG = yj2.g(og1.h, f2, 0.0f, f2, f2, 2);
                ze1 ze1VarC = ho.c(c5.i, false);
                int iHashCode2 = Long.hashCode(dr0Var2.T);
                dx1 dx1VarL2 = dr0Var2.l();
                rg1 rg1VarU2 = ls.U(dr0Var2, rg1VarG);
                dr0Var2.Y();
                if (dr0Var2.S) {
                    dr0Var2.k(jw0Var);
                } else {
                    dr0Var2.i0();
                }
                h12.y(yxVar, dr0Var2, ze1VarC);
                h12.y(yxVar2, dr0Var2, dx1VarL2);
                wi0.p(iHashCode2, dr0Var2, yxVar3, dr0Var2);
                h12.y(yxVar4, dr0Var2, rg1VarU2);
                aq0Var.c(new kv(z ? e10Var.c : e10Var.e), dr0Var2, 0);
                dr0Var2.p(true);
                dr0Var2.p(false);
            }
            long j = z ? e10Var.b : e10Var.d;
            tz0.b(str, new b51(1.0f, true), new xw2(j, g10.h, g10.i, g10.k, g10.b, g10.j, 16613240), 0, false, 1, 0, dr0Var2, (i3 & 14) | 1572864, 952);
            dr0Var2 = dr0Var2;
            dr0Var2.p(true);
        } else {
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new ol(str, z, e10Var, rg1Var, aq0Var, kp0Var, i);
        }
    }
}
