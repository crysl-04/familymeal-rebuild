package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class pn1 extends ad1 implements ue1, t31 {
    public static final de1 b0 = new de1(14);
    public static final de1 c0 = new de1(15);
    public static final j92 d0 = new j92();
    public static final q31 e0 = new q31();
    public static final float[] f0 = ke1.a();
    public static final nn1 g0 = new nn1();
    public static final yy h0 = new yy(27);
    public final l41 B;
    public pn1 C;
    public pn1 D;
    public boolean E;
    public boolean F;
    public vp0 G;
    public e90 H;
    public u31 I;
    public af1 K;
    public bj1 L;
    public float N;
    public lj1 O;
    public q31 P;
    public r72 R;
    public r72 S;
    public boolean T;
    public boolean U;
    public cs0 V;
    public wq W;
    public j7 X;
    public final mn1 Y;
    public boolean Z;
    public gt1 a0;
    public float J = 0.8f;
    public long M = 0;
    public hi2 Q = t03.A;

    public pn1(l41 l41Var) {
        this.B = l41Var;
        this.H = l41Var.E;
        this.I = l41Var.F;
        r72 r72Var = r72.e;
        this.R = r72Var;
        this.S = r72Var;
        this.Y = new mn1(this, (byte) 1);
    }

    public static pn1 r1(t31 t31Var) {
        pn1 pn1Var;
        dd1 dd1Var = t31Var instanceof dd1 ? (dd1) t31Var : null;
        if (dd1Var != null && (pn1Var = dd1Var.h.B) != null) {
            return pn1Var;
        }
        t31Var.getClass();
        return (pn1) t31Var;
    }

    @Override // defpackage.ad1
    public final boolean A0() {
        return this.K != null;
    }

    @Override // defpackage.ad1, defpackage.ht1
    public final boolean B() {
        return (this.a0 == null || this.E || !this.B.I()) ? false : true;
    }

    @Override // defpackage.ad1
    public final l41 B0() {
        return this.B;
    }

    @Override // defpackage.t31
    public final boolean C() {
        return V0().u;
    }

    @Override // defpackage.ad1
    public final af1 C0() {
        af1 af1Var = this.K;
        if (af1Var != null) {
            return af1Var;
        }
        li1.g("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.ad1
    public final ad1 D0() {
        return this.D;
    }

    @Override // defpackage.t31
    public final void E(float[] fArr) {
        t6 t6VarA = o41.a(this.B);
        u1(r1(es.D(this)), fArr);
        t6VarA.q(fArr);
    }

    @Override // defpackage.ad1
    public final long E0() {
        return this.M;
    }

    @Override // defpackage.t31
    public final long G(t31 t31Var, long j) {
        if (t31Var instanceof dd1) {
            dd1 dd1Var = (dd1) t31Var;
            dd1Var.h.B.f1();
            return dd1Var.G(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        pn1 pn1VarR1 = r1(t31Var);
        pn1VarR1.f1();
        pn1 pn1VarR0 = R0(pn1VarR1);
        while (pn1VarR1 != pn1VarR0) {
            gt1 gt1Var = pn1VarR1.a0;
            if (gt1Var != null) {
                es0 es0Var = (es0) gt1Var;
                float[] fArrB = es0Var.b();
                if (!es0Var.z) {
                    j = ke1.b(j, fArrB);
                }
            }
            j = lt.Y(j, pn1VarR1.M);
            pn1VarR1 = pn1VarR1.D;
            pn1VarR1.getClass();
        }
        return L0(pn1VarR0, j);
    }

    @Override // defpackage.ad1
    public final void I0() {
        n0(this.M, this.N, this.G);
    }

    @Override // defpackage.t31
    public final void K(t31 t31Var, float[] fArr) {
        pn1 pn1VarR1 = r1(t31Var);
        pn1VarR1.f1();
        pn1 pn1VarR0 = R0(pn1VarR1);
        ke1.d(fArr);
        pn1VarR1.u1(pn1VarR0, fArr);
        t1(pn1VarR0, fArr);
    }

    public final void K0(pn1 pn1Var, lj1 lj1Var, boolean z) {
        if (pn1Var != this) {
            pn1 pn1Var2 = this.D;
            if (pn1Var2 != null) {
                pn1Var2.K0(pn1Var, lj1Var, z);
            }
            long j = this.M;
            float f = (int) (j >> 32);
            lj1Var.a -= f;
            lj1Var.c -= f;
            float f2 = (int) (j & 4294967295L);
            lj1Var.b -= f2;
            lj1Var.d -= f2;
            gt1 gt1Var = this.a0;
            if (gt1Var != null) {
                es0 es0Var = (es0) gt1Var;
                float[] fArrA = es0Var.a();
                if (!es0Var.z) {
                    if (fArrA == null) {
                        lj1Var.a = 0.0f;
                        lj1Var.b = 0.0f;
                        lj1Var.c = 0.0f;
                        lj1Var.d = 0.0f;
                    } else {
                        ke1.c(fArrA, lj1Var);
                    }
                }
                if (this.F && z) {
                    long j2 = this.j;
                    lj1Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    public final long L0(pn1 pn1Var, long j) {
        if (pn1Var == this) {
            return j;
        }
        pn1 pn1Var2 = this.D;
        return (pn1Var2 == null || uz0.g(pn1Var, pn1Var2)) ? S0(j) : S0(pn1Var2.L0(pn1Var, j));
    }

    @Override // defpackage.t31
    public final r72 M(t31 t31Var, boolean z) {
        if (!V0().u) {
            ax0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!t31Var.C()) {
            ax0.b("LayoutCoordinates " + t31Var + " is not attached!");
        }
        pn1 pn1VarR1 = r1(t31Var);
        pn1VarR1.f1();
        pn1 pn1VarR0 = R0(pn1VarR1);
        lj1 lj1Var = this.O;
        if (lj1Var == null) {
            lj1Var = new lj1();
            this.O = lj1Var;
        }
        lj1Var.a = 0.0f;
        lj1Var.b = 0.0f;
        lj1Var.c = (int) (t31Var.O() >> 32);
        lj1Var.d = (int) (t31Var.O() & 4294967295L);
        while (pn1VarR1 != pn1VarR0) {
            pn1VarR1.n1(lj1Var, z, false);
            if (lj1Var.b()) {
                return r72.e;
            }
            pn1VarR1 = pn1VarR1.D;
            pn1VarR1.getClass();
        }
        K0(pn1VarR0, lj1Var, z);
        return new r72(lj1Var.a, lj1Var.b, lj1Var.c, lj1Var.d);
    }

    public final long M0(long j) {
        float fK0;
        float fJ0;
        if (W0()) {
            r72 r72Var = this.R;
            fK0 = r72Var.c - r72Var.a;
        } else {
            fK0 = k0();
        }
        if (W0()) {
            r72 r72Var2 = this.R;
            fJ0 = r72Var2.d - r72Var2.b;
        } else {
            fJ0 = j0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fK0;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fJ0;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    public final float N0(long j, long j2) {
        if (k0() >= Float.intBitsToFloat((int) (j2 >> 32)) && j0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM0 = M0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - k0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - j0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.t31
    public final long O() {
        return this.j;
    }

    public final void O0(wq wqVar, cs0 cs0Var) {
        gs0 gs0Var;
        int i;
        boolean z;
        gt1 gt1Var = this.a0;
        if (gt1Var == null) {
            long j = this.M;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            wqVar.g(f, f2);
            P0(wqVar, cs0Var);
            wqVar.g(-f, -f2);
            return;
        }
        es0 es0Var = (es0) gt1Var;
        yq yqVar = es0Var.t;
        es0Var.g();
        es0Var.A = es0Var.h.a.p > 0.0f;
        eg egVar = yqVar.i;
        egVar.E(wqVar);
        egVar.j = cs0Var;
        cs0 cs0Var2 = es0Var.h;
        wq wqVarG = yqVar.F().g();
        cs0 cs0Var3 = (cs0) yqVar.F().j;
        gs0 gs0Var2 = cs0Var2.a;
        gs0 gs0Var3 = cs0Var2.a;
        RenderNode renderNode = gs0Var2.c;
        if (cs0Var2.s) {
            return;
        }
        long j2 = cs0Var2.h;
        Canvas canvasA = b6.a(wqVarG);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (zIsHardwareAccelerated) {
            gs0Var = gs0Var3;
        } else {
            long j3 = cs0Var2.t;
            float f3 = (int) (j3 >> 32);
            float f4 = f3 - cs0Var2.v;
            float f5 = (int) (j3 & 4294967295L);
            float f6 = f5 - cs0Var2.w;
            long j4 = cs0Var2.u;
            float f7 = f3 + ((int) (j4 >> 32)) + cs0Var2.x;
            float f8 = f5 + ((int) (j4 & 4294967295L)) + cs0Var2.y;
            gs0Var = gs0Var3;
            float f9 = gs0Var.h;
            ln lnVar = gs0Var2.j;
            int i2 = gs0Var2.i;
            if (f9 < 1.0f || i2 != 3 || lnVar != null || gs0Var2.F == 1) {
                e9 e9VarD = cs0Var2.p;
                if (e9VarD == null) {
                    e9VarD = aa3.d();
                    cs0Var2.p = e9VarD;
                }
                e9VarD.c(f9);
                e9VarD.d(i2);
                e9VarD.f(lnVar);
                canvasA.saveLayer(f4, f6, f7, f8, (Paint) e9VarD.b);
            } else {
                canvasA.save();
            }
            canvasA.translate(f4, f6);
            Matrix matrix = gs0Var2.f;
            if (matrix == null) {
                matrix = new Matrix();
                gs0Var2.f = matrix;
            }
            renderNode.getMatrix(matrix);
            matrix.preTranslate(cs0Var2.v, cs0Var2.w);
            canvasA.concat(matrix);
            cs0Var2.h = up1.d(cs0Var2.h, (((long) Float.floatToRawIntBits(cs0Var2.v)) << 32) | (((long) Float.floatToRawIntBits(cs0Var2.w)) & 4294967295L));
        }
        cs0Var2.a();
        if (!renderNode.hasDisplayList()) {
            try {
                cs0Var2.e();
            } catch (Throwable unused) {
            }
        }
        boolean z2 = gs0Var.p > 0;
        if (z2) {
            wqVarG.r();
        }
        boolean z3 = !zIsHardwareAccelerated && cs0Var2.A;
        if (z3) {
            wqVarG.l();
            ou ouVarD = cs0Var2.d();
            if (ouVarD instanceof ns1) {
                wq.k(wqVarG, ((ns1) ouVarD).g);
            } else if (ouVarD instanceof os1) {
                l9 l9VarA = cs0Var2.m;
                if (l9VarA != null) {
                    l9VarA.a.rewind();
                } else {
                    l9VarA = n9.a();
                    cs0Var2.m = l9VarA;
                }
                l9.b(l9VarA, ((os1) ouVarD).g);
                wqVarG.s(l9VarA);
            } else {
                if (!(ouVarD instanceof ms1)) {
                    wg.n();
                    return;
                }
                wqVarG.s(((ms1) ouVarD).g);
            }
        }
        if (cs0Var3 != null) {
            kt ktVar = cs0Var3.r;
            if (!ktVar.a) {
                zw0.a("Only add dependencies during a tracking");
            }
            nj1 nj1Var = (nj1) ktVar.d;
            if (nj1Var != null) {
                nj1Var.a(cs0Var2);
            } else if (((cs0) ktVar.b) != null) {
                nj1 nj1Var2 = cd2.a;
                nj1 nj1Var3 = new nj1();
                cs0 cs0Var4 = (cs0) ktVar.b;
                cs0Var4.getClass();
                nj1Var3.a(cs0Var4);
                nj1Var3.a(cs0Var2);
                ktVar.d = nj1Var3;
                ktVar.b = null;
            } else {
                ktVar.b = cs0Var2;
            }
            nj1 nj1Var4 = (nj1) ktVar.e;
            if (nj1Var4 != null) {
                i = 1;
                z = !nj1Var4.l(cs0Var2);
            } else {
                i = 1;
                if (((cs0) ktVar.c) != cs0Var2) {
                    z = true;
                } else {
                    ktVar.c = null;
                    z = false;
                }
            }
            if (z) {
                cs0Var2.q += i;
            }
        }
        a6 a6Var = (a6) wqVarG;
        if (a6Var.a.isHardwareAccelerated()) {
            a6Var.a.drawRenderNode(renderNode);
        } else {
            yq yqVar2 = cs0Var2.o;
            if (yqVar2 == null) {
                yqVar2 = new yq();
                cs0Var2.o = yqVar2;
            }
            eg egVar2 = yqVar2.i;
            e90 e90Var = cs0Var2.b;
            u31 u31Var = cs0Var2.c;
            long jG = ou.G(cs0Var2.u);
            xq xqVar = ((yq) egVar2.k).h;
            e90 e90Var2 = xqVar.a;
            u31 u31Var2 = xqVar.b;
            wq wqVarG2 = egVar2.g();
            long jQ = egVar2.q();
            cs0 cs0Var5 = (cs0) egVar2.j;
            egVar2.F(e90Var);
            egVar2.G(u31Var);
            egVar2.E(wqVarG);
            egVar2.H(jG);
            egVar2.j = cs0Var2;
            wqVarG.l();
            try {
                cs0Var2.c(yqVar2);
                wqVarG.i();
                egVar2.F(e90Var2);
                egVar2.G(u31Var2);
                egVar2.E(wqVarG2);
                egVar2.H(jQ);
                egVar2.j = cs0Var5;
            } catch (Throwable th) {
                wqVarG.i();
                egVar2.F(e90Var2);
                egVar2.G(u31Var2);
                egVar2.E(wqVarG2);
                egVar2.H(jQ);
                egVar2.j = cs0Var5;
                throw th;
            }
        }
        if (z3) {
            wqVarG.i();
        }
        if (z2) {
            wqVarG.n();
        }
        if (!zIsHardwareAccelerated) {
            canvasA.restore();
        }
        cs0Var2.h = j2;
    }

    public final void P0(wq wqVar, cs0 cs0Var) {
        pn1 pn1Var;
        wq wqVar2;
        cs0 cs0Var2;
        qg1 qg1VarX0 = X0(4);
        if (qg1VarX0 == null) {
            l1(wqVar, cs0Var);
            return;
        }
        l41 l41Var = this.B;
        l41Var.getClass();
        n41 sharedDrawScope = o41.a(l41Var).getSharedDrawScope();
        long jG = ou.G(this.j);
        sharedDrawScope.getClass();
        uj1 uj1Var = null;
        while (qg1VarX0 != null) {
            if (qg1VarX0 instanceof sd0) {
                pn1Var = this;
                wqVar2 = wqVar;
                cs0Var2 = cs0Var;
                sharedDrawScope.c(wqVar2, jG, pn1Var, (sd0) qg1VarX0, cs0Var2);
            } else {
                pn1Var = this;
                wqVar2 = wqVar;
                cs0Var2 = cs0Var;
                if ((qg1VarX0.j & 4) != 0 && (qg1VarX0 instanceof k80)) {
                    int i = 0;
                    for (qg1 qg1Var = ((k80) qg1VarX0).w; qg1Var != null; qg1Var = qg1Var.m) {
                        if ((qg1Var.j & 4) != 0) {
                            i++;
                            if (i == 1) {
                                qg1VarX0 = qg1Var;
                            } else {
                                if (uj1Var == null) {
                                    uj1Var = new uj1(new qg1[16]);
                                }
                                if (qg1VarX0 != null) {
                                    uj1Var.b(qg1VarX0);
                                    qg1VarX0 = null;
                                }
                                uj1Var.b(qg1Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                wqVar = wqVar2;
                this = pn1Var;
                cs0Var = cs0Var2;
            }
            qg1VarX0 = cu.R(uj1Var);
            wqVar = wqVar2;
            this = pn1Var;
            cs0Var = cs0Var2;
        }
    }

    public abstract void Q0();

    public final pn1 R0(pn1 pn1Var) {
        l41 l41VarU = pn1Var.B;
        l41 l41Var = this.B;
        if (l41VarU == l41Var) {
            qg1 qg1VarV0 = pn1Var.V0();
            qg1 qg1VarV1 = V0();
            if (!qg1VarV1.h.u) {
                ax0.b("visitLocalAncestors called on an unattached node");
            }
            qg1 qg1Var = qg1VarV1.h;
            while (true) {
                qg1Var = qg1Var.l;
                if (qg1Var == null) {
                    break;
                }
                if ((qg1Var.j & 2) != 0 && qg1Var == qg1VarV0) {
                    return pn1Var;
                }
            }
            return this;
        }
        while (l41VarU.v > l41Var.v) {
            l41VarU = l41VarU.u();
            l41VarU.getClass();
        }
        l41 l41VarU2 = l41Var;
        while (l41VarU2.v > l41VarU.v) {
            l41VarU2 = l41VarU2.u();
            l41VarU2.getClass();
        }
        while (l41VarU != l41VarU2) {
            l41VarU = l41VarU.u();
            l41VarU2 = l41VarU2.u();
            if (l41VarU == null || l41VarU2 == null) {
                wg.m("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (l41VarU2 != l41Var) {
            if (l41VarU != pn1Var.B) {
                return l41VarU.L.c;
            }
            return pn1Var;
        }
        return this;
    }

    @Override // defpackage.t31
    public final long S(long j) {
        if (!V0().u) {
            ax0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        f1();
        while (this != null) {
            l41 l41Var = this.B;
            if (this == l41Var.L.d && !l41Var.j) {
                long jB = o41.a(l41Var).getRectManager().b(l41Var);
                if (!ny0.a(jB, 9223372034707292159L)) {
                    return lt.Y(j, jB);
                }
            }
            gt1 gt1Var = this.a0;
            if (gt1Var != null) {
                es0 es0Var = (es0) gt1Var;
                float[] fArrB = es0Var.b();
                if (!es0Var.z) {
                    j = ke1.b(j, fArrB);
                }
            }
            j = lt.Y(j, this.M);
            this = this.D;
        }
        return j;
    }

    public final long S0(long j) {
        long j2 = this.M;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L);
        gt1 gt1Var = this.a0;
        if (gt1Var != null) {
            es0 es0Var = (es0) gt1Var;
            float[] fArrA = es0Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!es0Var.z) {
                return ke1.b(jFloatToRawIntBits, fArrA);
            }
        }
        return jFloatToRawIntBits;
    }

    public abstract cd1 T0();

    public final long U0() {
        return this.H.c0(this.B.G.g());
    }

    public abstract qg1 V0();

    public final boolean W0() {
        return this.T && !this.R.f();
    }

    public final qg1 X0(int i) {
        boolean zG = vn1.g(i);
        qg1 qg1VarV0 = V0();
        if (!zG && (qg1VarV0 = qg1VarV0.l) == null) {
            return null;
        }
        for (qg1 qg1VarY0 = Y0(zG); qg1VarY0 != null && (qg1VarY0.k & i) != 0; qg1VarY0 = qg1VarY0.m) {
            if ((qg1VarY0.j & i) != 0) {
                return qg1VarY0;
            }
            if (qg1VarY0 == qg1VarV0) {
                return null;
            }
        }
        return null;
    }

    public final qg1 Y0(boolean z) {
        qg1 qg1VarV0;
        ln1 ln1Var = this.B.L;
        if (ln1Var.d == this) {
            return ln1Var.f;
        }
        pn1 pn1Var = this.D;
        if (!z) {
            if (pn1Var != null) {
                return pn1Var.V0();
            }
            return null;
        }
        if (pn1Var == null || (qg1VarV0 = pn1Var.V0()) == null) {
            return null;
        }
        return qg1VarV0.m;
    }

    public final void Z0(qg1 qg1Var, on1 on1Var, long j, jt0 jt0Var, int i, boolean z) {
        if (qg1Var == null) {
            c1(on1Var, j, jt0Var, i, z);
            return;
        }
        if (!on1Var.c(qg1Var)) {
            Z0(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z);
            return;
        }
        int i2 = jt0Var.j;
        fj1 fj1Var = jt0Var.h;
        jt0Var.b(i2 + 1, fj1Var.b);
        jt0Var.j++;
        fj1Var.a(qg1Var);
        jt0Var.i.a(ys.c(-1.0f, z, false));
        Z0(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z);
        jt0Var.j = i2;
    }

    public final void a1(qg1 qg1Var, on1 on1Var, long j, jt0 jt0Var, int i, boolean z, float f) {
        if (qg1Var == null) {
            c1(on1Var, j, jt0Var, i, z);
            return;
        }
        if (!on1Var.c(qg1Var)) {
            a1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z, f);
            return;
        }
        int i2 = jt0Var.j;
        fj1 fj1Var = jt0Var.h;
        jt0Var.b(i2 + 1, fj1Var.b);
        jt0Var.j++;
        fj1Var.a(qg1Var);
        jt0Var.i.a(ys.c(f, z, false));
        k1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z, f, true);
        jt0Var.j = i2;
    }

    @Override // defpackage.e90
    public final float b() {
        return this.B.E.b();
    }

    public final void b1(on1 on1Var, long j, jt0 jt0Var, int i, boolean z) {
        boolean z2;
        fj1 fj1Var = jt0Var.h;
        qg1 qg1VarX0 = X0(on1Var.b());
        boolean z3 = false;
        if (!x1(j)) {
            if (i == 1) {
                float fN0 = N0(j, U0());
                if ((Float.floatToRawIntBits(fN0) & Integer.MAX_VALUE) < 2139095040) {
                    if (jt0Var.j != fj1Var.b - 1) {
                        if (lt.o(jt0Var.a(), ys.c(fN0, false, false)) <= 0) {
                            return;
                        }
                    }
                    a1(qg1VarX0, on1Var, j, jt0Var, i, false, fN0);
                    return;
                }
                return;
            }
            return;
        }
        if (qg1VarX0 == null) {
            c1(on1Var, j, jt0Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < k0() && fIntBitsToFloat2 < j0()) {
            Z0(qg1VarX0, on1Var, j, jt0Var, i, z);
            return;
        }
        float fN1 = i == 1 ? N0(j, U0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fN1) & Integer.MAX_VALUE) < 2139095040) {
            if (jt0Var.j == fj1Var.b - 1) {
                z2 = z;
            } else {
                z2 = z;
                if (lt.o(jt0Var.a(), ys.c(fN1, z2, false)) > 0) {
                }
            }
            z3 = true;
        } else {
            z2 = z;
        }
        k1(qg1VarX0, on1Var, j, jt0Var, i, z2, fN1, z3);
    }

    @Override // defpackage.t31
    public final long c(long j) {
        if (!V0().u) {
            ax0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return o41.a(this.B).r(S(j));
    }

    public void c1(on1 on1Var, long j, jt0 jt0Var, int i, boolean z) {
        pn1 pn1Var = this.C;
        if (pn1Var != null) {
            pn1Var.b1(on1Var, pn1Var.S0(j), jt0Var, i, z);
        }
    }

    public final void d1() {
        gt1 gt1Var = this.a0;
        if (gt1Var != null) {
            ((es0) gt1Var).c();
            return;
        }
        pn1 pn1Var = this.D;
        if (pn1Var != null) {
            pn1Var.d1();
        }
    }

    public final boolean e1() {
        if (this.a0 != null && this.J <= 0.0f) {
            return true;
        }
        pn1 pn1Var = this.D;
        if (pn1Var != null) {
            return pn1Var.e1();
        }
        return false;
    }

    public final void f1() {
        this.B.M.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void g1() {
        qg1 qg1VarV0;
        boolean zG = vn1.g(128);
        qg1 qg1VarY0 = Y0(zG);
        if (qg1VarY0 == null || (qg1VarY0.h.k & 128) == 0) {
            return;
        }
        uk2 uk2VarN = y02.n();
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            if (!zG) {
                qg1VarV0 = V0().l;
                if (qg1VarV0 != null) {
                }
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
            }
            qg1VarV0 = V0();
            for (qg1 qg1VarY1 = Y0(zG); qg1VarY1 != null && (qg1VarY1.k & 128) != 0; qg1VarY1 = qg1VarY1.m) {
                if ((qg1VarY1.j & 128) != 0) {
                    ?? R = qg1VarY1;
                    ?? uj1Var = 0;
                    while (R != 0) {
                        if (R instanceof cf1) {
                            ((cf1) R).c(this.j);
                        } else if ((R.j & 128) != 0 && (R instanceof k80)) {
                            qg1 qg1Var = ((k80) R).w;
                            int i = 0;
                            R = R;
                            uj1Var = uj1Var;
                            while (qg1Var != null) {
                                if ((qg1Var.j & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        uj1Var = uj1Var;
                                        R = qg1Var;
                                    } else {
                                        if (uj1Var == 0) {
                                            uj1Var = new uj1(new qg1[16]);
                                        }
                                        if (R != 0) {
                                            uj1Var.b(R);
                                            R = 0;
                                        }
                                        uj1Var.b(qg1Var);
                                    }
                                }
                                qg1Var = qg1Var.m;
                                R = R;
                                uj1Var = uj1Var;
                            }
                            if (i != 1) {
                            }
                        }
                        R = cu.R(uj1Var);
                    }
                }
                if (qg1VarY1 == qg1VarV0) {
                    break;
                }
            }
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
        } catch (Throwable th) {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            throw th;
        }
    }

    @Override // defpackage.nz0
    public final u31 getLayoutDirection() {
        return this.B.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [qg1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void h1() {
        boolean zG = vn1.g(4194304);
        qg1 qg1VarV0 = V0();
        if (zG || (qg1VarV0 = qg1VarV0.l) != null) {
            for (qg1 qg1VarY0 = Y0(zG); qg1VarY0 != null && (qg1VarY0.k & 4194304) != 0; qg1VarY0 = qg1VarY0.m) {
                if ((qg1VarY0.j & 4194304) != 0) {
                    ?? R = qg1VarY0;
                    ?? uj1Var = 0;
                    while (R != 0) {
                        if (R instanceof r31) {
                            ((r31) R).q(this);
                        } else if ((R.j & 4194304) != 0 && (R instanceof k80)) {
                            qg1 qg1Var = ((k80) R).w;
                            int i = 0;
                            R = R;
                            uj1Var = uj1Var;
                            while (qg1Var != null) {
                                if ((qg1Var.j & 4194304) != 0) {
                                    i++;
                                    if (i == 1) {
                                        uj1Var = uj1Var;
                                        R = qg1Var;
                                    } else {
                                        if (uj1Var == 0) {
                                            uj1Var = new uj1(new qg1[16]);
                                        }
                                        if (R != 0) {
                                            uj1Var.b(R);
                                            R = 0;
                                        }
                                        uj1Var.b(qg1Var);
                                    }
                                }
                                qg1Var = qg1Var.m;
                                R = R;
                                uj1Var = uj1Var;
                            }
                            if (i != 1) {
                            }
                        }
                        R = cu.R(uj1Var);
                    }
                }
                if (qg1VarY0 == qg1VarV0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.t31
    public final long i(long j) {
        if (!V0().u) {
            ax0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        t31 t31VarD = es.D(this);
        t6 t6VarA = o41.a(this.B);
        t6VarA.A();
        return G(t31VarD, up1.d(ke1.b(j, t6VarA.f0), t31VarD.S(0L)));
    }

    public final void i1() {
        this.E = true;
        this.Y.a();
        o1();
        if (ny0.a(this.M, 0L)) {
            return;
        }
        this.B.O(this);
    }

    public final void j1() {
        boolean zG = vn1.g(1048576);
        qg1 qg1VarY0 = Y0(zG);
        if (qg1VarY0 == null || (qg1VarY0.h.k & 1048576) == 0) {
            return;
        }
        qg1 qg1VarV0 = V0();
        if (zG || (qg1VarV0 = qg1VarV0.l) != null) {
            for (qg1 qg1VarY1 = Y0(zG); qg1VarY1 != null && (qg1VarY1.k & 1048576) != 0; qg1VarY1 = qg1VarY1.m) {
                if ((qg1VarY1.j & 1048576) != 0) {
                    qg1 qg1VarR = qg1VarY1;
                    uj1 uj1Var = null;
                    while (qg1VarR != null) {
                        if (qg1VarR instanceof lm0) {
                        } else if ((qg1VarR.j & 1048576) != 0 && (qg1VarR instanceof k80)) {
                            int i = 0;
                            for (qg1 qg1Var = ((k80) qg1VarR).w; qg1Var != null; qg1Var = qg1Var.m) {
                                if ((qg1Var.j & 1048576) != 0) {
                                    i++;
                                    if (i == 1) {
                                        qg1VarR = qg1Var;
                                    } else {
                                        if (uj1Var == null) {
                                            uj1Var = new uj1(new qg1[16]);
                                        }
                                        if (qg1VarR != null) {
                                            uj1Var.b(qg1VarR);
                                            qg1VarR = null;
                                        }
                                        uj1Var.b(qg1Var);
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        qg1VarR = cu.R(uj1Var);
                    }
                }
                if (qg1VarY1 == qg1VarV0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.t31
    public final long k(long j) {
        long jS = S(j);
        t6 t6VarA = o41.a(this.B);
        t6VarA.A();
        return ke1.b(jS, t6VarA.e0);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01d4 A[PHI: r3
  0x01d4: PHI (r3v18 ??) = (r3v1 ??), (r3v1 ??), (r3v20 ??) binds: [B:55:0x019e, B:57:0x01a2, B:71:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [qg1] */
    /* JADX WARN: Type inference failed for: r2v22, types: [qg1] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [uj1] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [uj1] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public final void k1(qg1 qg1Var, on1 on1Var, long j, jt0 jt0Var, int i, boolean z, float f, boolean z2) {
        char c;
        int i2;
        ?? R;
        fj1 fj1Var = jt0Var.h;
        if (qg1Var == null) {
            c1(on1Var, j, jt0Var, i, z);
            return;
        }
        if (!on1Var.c(qg1Var)) {
            k1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z, f, z2);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r2 = qg1Var;
            ?? uj1Var = 0;
            while (r2 != 0) {
                if (r2 instanceof c12) {
                    long jT = ((c12) r2).t();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    l41 l41Var = this.B;
                    u31 u31Var = l41Var.F;
                    int i5 = vy2.b;
                    long j2 = Long.MIN_VALUE & jT;
                    u31 u31Var2 = u31.h;
                    if (j2 == 0 || u31Var == u31Var2) {
                        c = 30;
                        i2 = (int) jT;
                    } else {
                        c = 30;
                        i2 = (int) (jT >> 30);
                    }
                    if (fIntBitsToFloat < (-(i2 & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= k0() + (((j2 == 0 || l41Var.F == u31Var2) ? (int) (jT >> c) : (int) jT) & 32767)) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-(((int) (jT >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= (((int) (jT >> 45)) & 32767) + j0()) {
                        break;
                    }
                    wi1 wi1Var = jt0Var.i;
                    int i7 = jt0Var.j;
                    int i8 = fj1Var.b;
                    if (i7 == i8 - 1) {
                        jt0Var.b(i7 + 1, i8);
                        jt0Var.j++;
                        fj1Var.a(qg1Var);
                        wi1Var.a(ys.c(0.0f, z, true));
                        k1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i3, z, f, z2);
                        jt0Var.j = i7;
                        return;
                    }
                    long jA = jt0Var.a();
                    int i9 = jt0Var.j;
                    if (!lt.N(jA)) {
                        if (lt.D(jA) > 0.0f) {
                            int i10 = jt0Var.j;
                            jt0Var.b(i10 + 1, fj1Var.b);
                            jt0Var.j++;
                            fj1Var.a(qg1Var);
                            wi1Var.a(ys.c(0.0f, z, true));
                            k1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z, f, z2);
                            jt0Var.j = i10;
                            return;
                        }
                        return;
                    }
                    int i11 = fj1Var.b;
                    int i12 = i11 - 1;
                    jt0Var.j = i12;
                    jt0Var.b(i11, fj1Var.b);
                    jt0Var.j++;
                    fj1Var.a(qg1Var);
                    wi1Var.a(ys.c(0.0f, z, true));
                    k1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z, f, z2);
                    jt0Var.j = i12;
                    if (lt.D(jt0Var.a()) < 0.0f) {
                        jt0Var.b(i9 + 1, jt0Var.j + 1);
                    }
                    jt0Var.j = i9;
                    return;
                }
                if ((r2.j & 16) == 0 || !(r2 instanceof k80)) {
                    R = r2;
                    uj1Var = uj1Var;
                    R = cu.R(uj1Var);
                } else {
                    qg1 qg1Var2 = ((k80) r2).w;
                    int i13 = 0;
                    while (qg1Var2 != null) {
                        if ((qg1Var2.j & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                R = r2;
                                uj1Var = uj1Var;
                                uj1Var = uj1Var;
                                R = qg1Var2;
                            } else {
                                if (uj1Var == 0) {
                                    uj1Var = new uj1(new qg1[16]);
                                }
                                if (R != 0) {
                                    uj1Var.b(R);
                                    R = 0;
                                }
                                uj1Var.b(qg1Var2);
                            }
                        } else {
                            R = r2;
                            uj1Var = uj1Var;
                        }
                        qg1Var2 = qg1Var2.m;
                        R = R;
                        uj1Var = uj1Var;
                    }
                    if (i13 == 1) {
                        R = r2;
                        uj1Var = uj1Var;
                    } else {
                        R = r2;
                        uj1Var = uj1Var;
                        R = cu.R(uj1Var);
                    }
                }
                i3 = i;
                r2 = R;
                uj1Var = uj1Var;
            }
        }
        if (z2) {
            a1(qg1Var, on1Var, j, jt0Var, i, z, f);
        } else {
            q1(qg1Var, on1Var, j, jt0Var, i, z, f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [qg1] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [qg1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // defpackage.ny1, defpackage.ue1
    public final Object l() {
        l41 l41Var = this.B;
        if (!l41Var.L.c(64)) {
            return null;
        }
        V0();
        Object objN0 = null;
        for (qg1 qg1Var = l41Var.L.e; qg1Var != null; qg1Var = qg1Var.l) {
            if ((qg1Var.j & 64) != 0) {
                ?? R = qg1Var;
                ?? uj1Var = 0;
                while (R != 0) {
                    if (R instanceof mu1) {
                        objN0 = ((mu1) R).n0(objN0);
                    } else if ((R.j & 64) != 0 && (R instanceof k80)) {
                        qg1 qg1Var2 = ((k80) R).w;
                        int i = 0;
                        R = R;
                        uj1Var = uj1Var;
                        while (qg1Var2 != null) {
                            if ((qg1Var2.j & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    uj1Var = uj1Var;
                                    R = qg1Var2;
                                } else {
                                    if (uj1Var == 0) {
                                        uj1Var = new uj1(new qg1[16]);
                                    }
                                    if (R != 0) {
                                        uj1Var.b(R);
                                        R = 0;
                                    }
                                    uj1Var.b(qg1Var2);
                                }
                            }
                            qg1Var2 = qg1Var2.m;
                            R = R;
                            uj1Var = uj1Var;
                        }
                        if (i != 1) {
                        }
                    }
                    R = cu.R(uj1Var);
                }
            }
        }
        return objN0;
    }

    public void l1(wq wqVar, cs0 cs0Var) {
        l41 l41Var = this.B;
        t6 t6VarA = o41.a(l41Var);
        uj1 uj1VarY = l41Var.y();
        Object[] objArr = uj1VarY.h;
        int i = uj1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var2 = (l41) objArr[i2];
            if (l41Var2.J()) {
                l41Var2.i(wqVar, cs0Var);
            }
        }
        if (t6VarA.getShowLayoutBounds()) {
            e9 e9Var = gx0.k0;
            long j = this.j;
            wqVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, e9Var);
        }
    }

    @Override // defpackage.t31
    public final t31 m() {
        boolean z = V0().u;
        l41 l41Var = this.B;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (l41 l41VarU = l41Var; l41VarU != null; l41VarU = l41VarU.u()) {
                sb.append("\n|");
                sb.append(l41VarU);
                sb.append(" isAttached=");
                sb.append(l41VarU.I());
                sb.append(" modifier=");
                sb.append(l41VarU.Q);
                sb.append(" tail=");
                sb.append(V0());
            }
            ax0.b(sb.toString());
        }
        f1();
        return l41Var.L.d.D;
    }

    public final void m1(long j, float f, vp0 vp0Var) {
        v1(vp0Var, false);
        boolean zA = ny0.a(this.M, j);
        l41 l41Var = this.B;
        if (!zA) {
            o41.a(l41Var).L(-4.0f);
            this.M = j;
            gt1 gt1Var = this.a0;
            if (gt1Var != null) {
                ((es0) gt1Var).d(j);
            } else {
                pn1 pn1Var = this.D;
                if (pn1Var != null) {
                    pn1Var.d1();
                }
            }
            l41Var.O(this);
            ad1.G0(this);
            t6 t6Var = l41Var.u;
            if (t6Var != null) {
                t6Var.v(l41Var);
            }
        }
        this.N = f;
        if (this == l41Var.L.d && !this.v) {
            o41.a(l41Var).getRectManager().g(l41Var);
        }
        if (this.v) {
            return;
        }
        x0(C0());
    }

    @Override // defpackage.e90
    public final float n() {
        return this.B.E.n();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    public final void n1(lj1 lj1Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        gt1 gt1Var = this.a0;
        if (gt1Var != null) {
            if (this.F) {
                if (z2) {
                    long jU0 = U0();
                    float f = lj1Var.a;
                    float f2 = lj1Var.b;
                    if (lj1Var.c >= 0.0f) {
                        long j = this.j;
                        if (f > ((int) (j >> 32)) || lj1Var.d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jU0 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU0 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (lj1Var.c - lj1Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (lj1Var.d - lj1Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.j;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jU0 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jU0 & 4294967295L);
                    lj1Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.j;
                    lj1Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (lj1Var.b()) {
                    return;
                }
            }
            es0 es0Var = (es0) gt1Var;
            float[] fArrB = es0Var.b();
            if (!es0Var.z) {
                if (fArrB == null) {
                    lj1Var.a = 0.0f;
                    lj1Var.b = 0.0f;
                    lj1Var.c = 0.0f;
                    lj1Var.d = 0.0f;
                } else {
                    ke1.c(fArrB, lj1Var);
                }
            }
        }
        long j4 = this.M;
        float f9 = (int) (j4 >> 32);
        lj1Var.a += f9;
        lj1Var.c += f9;
        float f10 = (int) (j4 & 4294967295L);
        lj1Var.b += f10;
        lj1Var.d += f10;
    }

    public final void o1() {
        if (this.a0 != null) {
            v1(null, false);
            this.B.V(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [qg1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [uj1] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [uj1] */
    public final void p1(af1 af1Var) {
        pn1 pn1Var;
        af1 af1Var2 = this.K;
        if (af1Var != af1Var2) {
            this.K = af1Var;
            l41 l41Var = this.B;
            int i = 0;
            if (af1Var2 == null || af1Var.g() != af1Var2.g() || af1Var.d() != af1Var2.d()) {
                int iG = af1Var.g();
                int iD = af1Var.d();
                gt1 gt1Var = this.a0;
                if (gt1Var != null) {
                    ((es0) gt1Var).e((((long) iG) << 32) | (((long) iD) & 4294967295L));
                } else if (l41Var.J() && (pn1Var = this.D) != null) {
                    pn1Var.d1();
                }
                o0((((long) iG) << 32) | (((long) iD) & 4294967295L));
                if (this.G != null) {
                    w1(false);
                }
                boolean zG = vn1.g(4);
                qg1 qg1VarV0 = V0();
                if (zG || (qg1VarV0 = qg1VarV0.l) != null) {
                    for (qg1 qg1VarY0 = Y0(zG); qg1VarY0 != null && (qg1VarY0.k & 4) != 0; qg1VarY0 = qg1VarY0.m) {
                        if ((qg1VarY0.j & 4) != 0) {
                            ?? R = qg1VarY0;
                            ?? uj1Var = 0;
                            while (R != 0) {
                                if (R instanceof sd0) {
                                    ((sd0) R).o0();
                                } else if ((R.j & 4) != 0 && (R instanceof k80)) {
                                    qg1 qg1Var = ((k80) R).w;
                                    int i2 = 0;
                                    R = R;
                                    uj1Var = uj1Var;
                                    while (qg1Var != null) {
                                        if ((qg1Var.j & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uj1Var = uj1Var;
                                                R = qg1Var;
                                            } else {
                                                if (uj1Var == 0) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (R != 0) {
                                                    uj1Var.b(R);
                                                    R = 0;
                                                }
                                                uj1Var.b(qg1Var);
                                            }
                                        }
                                        qg1Var = qg1Var.m;
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                R = cu.R(uj1Var);
                            }
                        }
                        if (qg1VarY0 == qg1VarV0) {
                            break;
                        }
                    }
                }
                t6 t6Var = l41Var.u;
                if (t6Var != null) {
                    t6Var.v(l41Var);
                }
                l41Var.O(this);
            }
            bj1 bj1Var = this.L;
            if ((bj1Var == null || bj1Var.e == 0) && af1Var.a().isEmpty()) {
                return;
            }
            bj1 bj1Var2 = this.L;
            Map mapA = af1Var.a();
            if (bj1Var2 != null && bj1Var2.e == mapA.size()) {
                Object[] objArr = bj1Var2.b;
                int[] iArr = bj1Var2.c;
                long[] jArr = bj1Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((e5) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            l41Var.M.p.E.f();
            bj1 bj1Var3 = this.L;
            if (bj1Var3 == null) {
                bj1 bj1Var4 = ip1.a;
                bj1Var3 = new bj1();
                this.L = bj1Var3;
            }
            bj1Var3.a();
            for (Map.Entry entry : af1Var.a().entrySet()) {
                bj1Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void q1(qg1 qg1Var, on1 on1Var, long j, jt0 jt0Var, int i, boolean z, float f) {
        int i2;
        fj1 fj1Var = jt0Var.h;
        if (qg1Var == null) {
            c1(on1Var, j, jt0Var, i, z);
            return;
        }
        if (!on1Var.c(qg1Var)) {
            q1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z, f);
            return;
        }
        if (!on1Var.a(qg1Var)) {
            k1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z, f, false);
            return;
        }
        wi1 wi1Var = jt0Var.i;
        int i3 = jt0Var.j;
        int i4 = fj1Var.b;
        if (i3 != i4 - 1) {
            long jA = jt0Var.a();
            int i5 = jt0Var.j;
            int i6 = fj1Var.b;
            int i7 = i6 - 1;
            jt0Var.j = i7;
            jt0Var.b(i6, fj1Var.b);
            jt0Var.j++;
            fj1Var.a(qg1Var);
            wi1Var.a(ys.c(f, z, false));
            k1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z, f, false);
            jt0Var.j = i7;
            long jA2 = jt0Var.a();
            if (jt0Var.j + 1 >= fj1Var.b - 1 || lt.o(jA, jA2) <= 0) {
                jt0Var.b(jt0Var.j + 1, fj1Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zN = lt.N(jA2);
                int i9 = jt0Var.j;
                jt0Var.b(i8, zN ? i9 + 2 : i9 + 1);
            }
            jt0Var.j = i5;
            return;
        }
        int i10 = i3 + 1;
        jt0Var.b(i10, i4);
        jt0Var.j++;
        fj1Var.a(qg1Var);
        wi1Var.a(ys.c(f, z, false));
        k1(ys.V(qg1Var, on1Var.b()), on1Var, j, jt0Var, i, z, f, false);
        jt0Var.j = i3;
        if (i10 == fj1Var.b - 1 || lt.N(jt0Var.a())) {
            int i11 = jt0Var.j;
            int i12 = i11 + 1;
            fj1Var.l(i12);
            if (i12 < 0 || i12 >= (i2 = wi1Var.b)) {
                wg.i("Index must be between 0 and size");
                return;
            }
            long[] jArr = wi1Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                gi.P(jArr, jArr, i12, i11 + 2, i2);
            }
            wi1Var.b--;
        }
    }

    public final r72 s1() {
        if (V0().u) {
            t31 t31VarD = es.D(this);
            lj1 lj1Var = this.O;
            if (lj1Var == null) {
                lj1Var = new lj1();
                this.O = lj1Var;
            }
            long jM0 = M0(U0());
            float f = W0() ? this.R.a : 0.0f;
            float f2 = W0() ? this.R.b : 0.0f;
            float fK0 = W0() ? this.R.c : k0();
            float fJ0 = W0() ? this.R.d : j0();
            int i = (int) (jM0 >> 32);
            lj1Var.a = f - Float.intBitsToFloat(i);
            int i2 = (int) (jM0 & 4294967295L);
            lj1Var.b = f2 - Float.intBitsToFloat(i2);
            lj1Var.c = Float.intBitsToFloat(i) + fK0;
            lj1Var.d = Float.intBitsToFloat(i2) + fJ0;
            while (this != t31VarD) {
                this.n1(lj1Var, false, true);
                if (!lj1Var.b()) {
                    this = this.D;
                    this.getClass();
                }
            }
            return new r72(lj1Var.a, lj1Var.b, lj1Var.c, lj1Var.d);
        }
        return r72.e;
    }

    @Override // defpackage.t31
    public final long t(t31 t31Var, long j) {
        return G(t31Var, j);
    }

    public final void t1(pn1 pn1Var, float[] fArr) {
        float[] fArrA;
        if (uz0.g(pn1Var, this)) {
            return;
        }
        pn1 pn1Var2 = this.D;
        pn1Var2.getClass();
        pn1Var2.t1(pn1Var, fArr);
        if (!ny0.a(this.M, 0L)) {
            float[] fArr2 = f0;
            ke1.d(fArr2);
            long j = this.M;
            ke1.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            ke1.e(fArr, fArr2);
        }
        gt1 gt1Var = this.a0;
        if (gt1Var == null || (fArrA = ((es0) gt1Var).a()) == null) {
            return;
        }
        ke1.e(fArr, fArrA);
    }

    public final void u1(pn1 pn1Var, float[] fArr) {
        while (!this.equals(pn1Var)) {
            gt1 gt1Var = this.a0;
            if (gt1Var != null) {
                ke1.e(fArr, ((es0) gt1Var).b());
            }
            long j = this.M;
            if (!ny0.a(j, 0L)) {
                float[] fArr2 = f0;
                ke1.d(fArr2);
                ke1.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                ke1.e(fArr, fArr2);
            }
            this = this.D;
            this.getClass();
        }
    }

    @Override // defpackage.t31
    public final long v(long j) {
        if (!V0().u) {
            ax0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return G(es.D(this), o41.a(this.B).F(j));
    }

    public final void v1(vp0 vp0Var, boolean z) {
        t6 t6Var;
        uj1 uj1Var;
        j7 j7Var;
        uj1 uj1Var2;
        Object obj;
        byte b = 0;
        l41 l41Var = this.B;
        boolean z2 = (!z && this.G == vp0Var && uz0.g(this.H, l41Var.E) && this.I == l41Var.F) ? false : true;
        this.H = l41Var.E;
        this.I = l41Var.F;
        boolean zI = l41Var.I();
        mn1 mn1Var = this.Y;
        if (!zI || vp0Var == null) {
            this.G = null;
            gt1 gt1Var = this.a0;
            if (gt1Var != null) {
                es0 es0Var = (es0) gt1Var;
                if (!vs.J(es0Var.b())) {
                    l41Var.O(this);
                }
                es0Var.k = null;
                es0Var.l = null;
                es0Var.n = true;
                es0Var.f(false);
                bs0 bs0Var = es0Var.i;
                if (bs0Var != null) {
                    bs0Var.a(es0Var.h);
                    t6 t6Var2 = es0Var.j;
                    k42 k42Var = t6Var2.v0;
                    while (true) {
                        Reference referencePoll = ((ReferenceQueue) k42Var.j).poll();
                        uj1Var = (uj1) k42Var.i;
                        if (referencePoll == null) {
                            break;
                        } else {
                            uj1Var.j(referencePoll);
                        }
                    }
                    uj1Var.b(new WeakReference(es0Var, (ReferenceQueue) k42Var.j));
                    t6Var2.H.k(es0Var);
                }
                this.a0 = null;
                l41Var.P = true;
                mn1Var.a();
                if (V0().u && l41Var.J() && (t6Var = l41Var.u) != null) {
                    t6Var.v(l41Var);
                }
            }
            this.Z = false;
            return;
        }
        this.G = vp0Var;
        if (this.a0 != null) {
            if (z2) {
                w1(true);
                return;
            }
            return;
        }
        t6 t6VarA = o41.a(l41Var);
        j7 j7Var2 = this.X;
        if (j7Var2 == null) {
            j7 j7Var3 = new j7(this, new mn1(this, b), (byte) 24);
            this.X = j7Var3;
            j7Var = j7Var3;
        } else {
            j7Var = j7Var2;
        }
        k42 k42Var2 = t6VarA.v0;
        while (true) {
            ReferenceQueue referenceQueue = (ReferenceQueue) k42Var2.j;
            uj1Var2 = (uj1) k42Var2.i;
            Reference referencePoll2 = referenceQueue.poll();
            if (referencePoll2 == null) {
                break;
            } else {
                uj1Var2.j(referencePoll2);
            }
        }
        do {
            int i = uj1Var2.j;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) uj1Var2.k(i - 1)).get();
        } while (obj == null);
        gt1 es0Var2 = (gt1) obj;
        if (es0Var2 != null) {
            es0 es0Var3 = (es0) es0Var2;
            bs0 bs0Var2 = es0Var3.i;
            if (bs0Var2 == null) {
                throw wi0.e("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!es0Var3.h.s) {
                ax0.a("layer should have been released before reuse");
            }
            es0Var3.h = bs0Var2.b();
            es0Var3.n = false;
            es0Var3.k = j7Var;
            es0Var3.l = mn1Var;
            es0Var3.x = false;
            es0Var3.y = false;
            es0Var3.z = true;
            ke1.d(es0Var3.o);
            float[] fArr = es0Var3.p;
            if (fArr != null) {
                ke1.d(fArr);
            }
            es0Var3.v = 4539628425446424576L;
            es0Var3.A = false;
            es0Var3.m = 9223372034707292159L;
            es0Var3.w = null;
            es0Var3.u = 0;
        } else {
            es0Var2 = new es0(t6VarA.getGraphicsContext().b(), t6VarA.getGraphicsContext(), t6VarA, j7Var, mn1Var);
        }
        es0 es0Var4 = (es0) es0Var2;
        es0Var4.e(this.j);
        es0Var4.d(this.M);
        this.a0 = es0Var2;
        w1(true);
        l41Var.P = true;
        mn1Var.a();
    }

    public final void w1(boolean z) {
        long j;
        char c;
        int i;
        boolean z2;
        l41 l41Var;
        mn1 mn1Var;
        byte b;
        mn1 mn1Var2;
        gt1 gt1Var = this.a0;
        vp0 vp0Var = this.G;
        if (gt1Var == null) {
            if (vp0Var == null) {
                return;
            }
            ax0.b("null layer with a non-null layerBlock");
            return;
        }
        if (vp0Var == null) {
            throw wi0.e("updateLayerParameters requires a non-null layerBlock");
        }
        j92 j92Var = d0;
        j92Var.a();
        l41 l41Var2 = this.B;
        j92Var.A = l41Var2.E;
        j92Var.B = l41Var2.F;
        j92Var.y = ou.G(this.j);
        t72 t72Var = new t72();
        o41.a(l41Var2).getSnapshotObserver().a.d(this, b0, new zi((Object) vp0Var, (Object) this, (Object) t72Var, (byte) 7));
        q31 q31Var = this.P;
        if (q31Var == null) {
            q31Var = new q31();
            this.P = q31Var;
        }
        q31 q31Var2 = e0;
        q31Var2.getClass();
        q31Var2.a = q31Var.a;
        q31Var2.b = q31Var.b;
        q31Var2.c = q31Var.c;
        q31Var2.d = q31Var.d;
        q31Var2.e = q31Var.e;
        q31Var2.f = q31Var.f;
        q31Var2.g = q31Var.g;
        q31Var2.h = q31Var.h;
        q31Var2.i = q31Var.i;
        q31Var.a = j92Var.i;
        q31Var.b = j92Var.j;
        q31Var.c = j92Var.l;
        q31Var.d = j92Var.m;
        q31Var.e = j92Var.q;
        q31Var.f = j92Var.r;
        q31Var.g = j92Var.s;
        q31Var.h = j92Var.t;
        q31Var.i = j92Var.u;
        es0 es0Var = (es0) gt1Var;
        t6 t6Var = es0Var.j;
        int i2 = j92Var.h | es0Var.u;
        es0Var.s = j92Var.B;
        e90 e90Var = j92Var.A;
        es0Var.r = e90Var;
        float f = 0.0f;
        if ((1048576 & i2) != 0) {
            cs0 cs0Var = es0Var.h;
            j92Var.z.getClass();
            int iR = e90Var.R(0.0f);
            j92Var.z.getClass();
            int iR2 = e90Var.R(0.0f);
            j92Var.z.getClass();
            int iR3 = e90Var.R(0.0f);
            j92Var.z.getClass();
            int iR4 = e90Var.R(0.0f);
            cs0Var.v = iR;
            cs0Var.w = iR2;
            cs0Var.x = iR3;
            cs0Var.y = iR4;
            gs0 gs0Var = cs0Var.a;
            if (iR < 0 || iR2 < 0 || iR3 < 0 || iR4 < 0) {
                StringBuilder sbK = wi0.k("Outsets cannot be negative! Left: ", iR, ", Top: ", iR2, ", Right: ");
                sbK.append(iR3);
                sbK.append(", Bottom: ");
                sbK.append(iR4);
                zw0.a(sbK.toString());
            }
            int i3 = gs0Var.x;
            if (iR != i3 || iR2 != gs0Var.y || iR3 != gs0Var.z || iR4 != gs0Var.A) {
                boolean z3 = (iR == i3 && iR2 == gs0Var.y) ? false : true;
                gs0Var.x = iR;
                gs0Var.y = iR2;
                gs0Var.z = iR3;
                gs0Var.A = iR4;
                gs0Var.e();
                if (z3) {
                    gs0Var.d();
                }
            }
            es0Var.c();
        } else {
            l41Var2 = l41Var2;
            f = 0.0f;
        }
        int i4 = i2 & 4096;
        if (i4 != 0) {
            es0Var.v = j92Var.u;
        }
        if ((i2 & 1) != 0) {
            cs0 cs0Var2 = es0Var.h;
            float f2 = j92Var.i;
            gs0 gs0Var2 = cs0Var2.a;
            if (gs0Var2.l != f2) {
                gs0Var2.l = f2;
                gs0Var2.c.setScaleX(f2);
            }
        }
        if ((i2 & 2) != 0) {
            cs0 cs0Var3 = es0Var.h;
            float f3 = j92Var.j;
            gs0 gs0Var3 = cs0Var3.a;
            if (gs0Var3.m != f3) {
                gs0Var3.m = f3;
                gs0Var3.c.setScaleY(f3);
            }
        }
        if ((i2 & 4) != 0) {
            cs0 cs0Var4 = es0Var.h;
            float f4 = j92Var.k;
            gs0 gs0Var4 = cs0Var4.a;
            if (gs0Var4.h != f4) {
                gs0Var4.h = f4;
                gs0Var4.c.setAlpha(f4);
            }
        }
        if ((i2 & 8) != 0) {
            cs0 cs0Var5 = es0Var.h;
            float f5 = j92Var.l;
            gs0 gs0Var5 = cs0Var5.a;
            if (gs0Var5.n != f5) {
                gs0Var5.n = f5;
                gs0Var5.c.setTranslationX(f5);
            }
        }
        if ((i2 & 16) != 0) {
            cs0 cs0Var6 = es0Var.h;
            float f6 = j92Var.m;
            gs0 gs0Var6 = cs0Var6.a;
            if (gs0Var6.o != f6) {
                gs0Var6.o = f6;
                gs0Var6.c.setTranslationY(f6);
            }
        }
        if ((i2 & 32) != 0) {
            cs0 cs0Var7 = es0Var.h;
            float f7 = j92Var.n;
            gs0 gs0Var7 = cs0Var7.a;
            if (gs0Var7.p != f7) {
                gs0Var7.p = f7;
                gs0Var7.c.setElevation(f7);
                cs0Var7.g = true;
                cs0Var7.a();
            }
            if (j92Var.n > f && !es0Var.A && (mn1Var2 = es0Var.l) != null) {
                mn1Var2.a();
            }
        }
        if ((i2 & 64) != 0) {
            cs0 cs0Var8 = es0Var.h;
            long j2 = j92Var.o;
            gs0 gs0Var8 = cs0Var8.a;
            long j3 = gs0Var8.q;
            int i5 = kv.h;
            if (!r13.a(j2, j3)) {
                gs0Var8.q = j2;
                gs0Var8.c.setAmbientShadowColor(cu.c0(j2));
            }
        }
        if ((i2 & 128) != 0) {
            cs0 cs0Var9 = es0Var.h;
            long j4 = j92Var.p;
            gs0 gs0Var9 = cs0Var9.a;
            long j5 = gs0Var9.r;
            int i6 = kv.h;
            if (!r13.a(j4, j5)) {
                gs0Var9.r = j4;
                gs0Var9.c.setSpotShadowColor(cu.c0(j4));
            }
        }
        if ((i2 & 1024) != 0) {
            cs0 cs0Var10 = es0Var.h;
            float f8 = j92Var.s;
            gs0 gs0Var10 = cs0Var10.a;
            if (gs0Var10.u != f8) {
                gs0Var10.u = f8;
                gs0Var10.c.setRotationZ(f8);
            }
        }
        if ((i2 & 256) != 0) {
            cs0 cs0Var11 = es0Var.h;
            float f9 = j92Var.q;
            gs0 gs0Var11 = cs0Var11.a;
            if (gs0Var11.s != f9) {
                gs0Var11.s = f9;
                gs0Var11.c.setRotationX(f9);
            }
        }
        if ((i2 & 512) != 0) {
            cs0 cs0Var12 = es0Var.h;
            float f10 = j92Var.r;
            gs0 gs0Var12 = cs0Var12.a;
            if (gs0Var12.t != f10) {
                gs0Var12.t = f10;
                gs0Var12.c.setRotationY(f10);
            }
        }
        if ((i2 & 2048) != 0) {
            cs0 cs0Var13 = es0Var.h;
            float f11 = j92Var.t;
            gs0 gs0Var13 = cs0Var13.a;
            if (gs0Var13.v != f11) {
                gs0Var13.v = f11;
                gs0Var13.c.setCameraDistance(f11);
            }
        }
        if (i4 != 0) {
            j = 4294967295L;
            boolean zA = ez2.a(es0Var.v, ez2.b);
            cs0 cs0Var14 = es0Var.h;
            if (zA) {
                cs0Var14.f(9205357640488583168L);
                c = ' ';
            } else {
                c = ' ';
                cs0Var14.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (es0Var.v >> 32)) * ((int) (es0Var.m >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (es0Var.v & 4294967295L)) * ((int) (es0Var.m & 4294967295L)))) & 4294967295L));
            }
        } else {
            j = 4294967295L;
            c = ' ';
        }
        if ((i2 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE) != 0) {
            cs0 cs0Var15 = es0Var.h;
            boolean z4 = j92Var.w;
            if (cs0Var15.A != z4) {
                cs0Var15.A = z4;
                cs0Var15.g = true;
                cs0Var15.a();
            }
        }
        if ((131072 & i2) != 0) {
            gs0 gs0Var14 = es0Var.h.a;
        }
        if ((262144 & i2) != 0) {
            cs0 cs0Var16 = es0Var.h;
            ln lnVar = j92Var.C;
            gs0 gs0Var15 = cs0Var16.a;
            if (!uz0.g(gs0Var15.j, lnVar)) {
                gs0Var15.j = lnVar;
                Paint paint = gs0Var15.e;
                if (paint == null) {
                    paint = new Paint();
                    gs0Var15.e = paint;
                }
                paint.setColorFilter(lnVar != null ? lnVar.a : null);
                gs0Var15.c();
            }
        }
        if ((524288 & i2) != 0) {
            cs0 cs0Var17 = es0Var.h;
            int i7 = j92Var.D;
            gs0 gs0Var16 = cs0Var17.a;
            if (gs0Var16.i != i7) {
                gs0Var16.i = i7;
                Paint paint2 = gs0Var16.e;
                if (paint2 == null) {
                    paint2 = new Paint();
                    gs0Var16.e = paint2;
                }
                paint2.setBlendMode(ia2.w(i7));
                gs0Var16.c();
            }
        }
        if ((32768 & i2) != 0) {
            cs0 cs0Var18 = es0Var.h;
            int i8 = j92Var.x;
            if (i8 == 0) {
                b = 0;
            } else if (i8 == 1) {
                b = 1;
            } else {
                b = 2;
                if (i8 != 2) {
                    li1.g("Not supported composition strategy");
                    return;
                }
            }
            gs0 gs0Var17 = cs0Var18.a;
            if (gs0Var17.F != b) {
                gs0Var17.F = b;
                gs0Var17.c();
            }
        }
        if ((i2 & 7963) != 0) {
            es0Var.x = true;
            es0Var.y = true;
        }
        if (uz0.g(es0Var.w, j92Var.E)) {
            i = i2;
            z2 = false;
        } else {
            ou ouVar = j92Var.E;
            es0Var.w = ouVar;
            if (ouVar == null) {
                i = i2;
            } else {
                cs0 cs0Var19 = es0Var.h;
                if (ouVar instanceof ns1) {
                    r72 r72Var = ((ns1) ouVar).g;
                    float f12 = r72Var.a;
                    float f13 = r72Var.b;
                    i = i2;
                    cs0Var19.h(0.0f, (((long) Float.floatToRawIntBits(f12)) << c) | (((long) Float.floatToRawIntBits(f13)) & j), (((long) Float.floatToRawIntBits(r72Var.c - f12)) << c) | (((long) Float.floatToRawIntBits(r72Var.d - f13)) & j));
                } else {
                    i = i2;
                    if (ouVar instanceof ms1) {
                        l9 l9Var = ((ms1) ouVar).g;
                        cs0Var19.k = null;
                        cs0Var19.i = 9205357640488583168L;
                        cs0Var19.h = 0L;
                        cs0Var19.j = f;
                        cs0Var19.g = true;
                        cs0Var19.n = false;
                        cs0Var19.l = l9Var;
                        cs0Var19.a();
                    } else {
                        if (!(ouVar instanceof os1)) {
                            wg.n();
                            return;
                        }
                        os1 os1Var = (os1) ouVar;
                        l9 l9Var2 = os1Var.h;
                        if (l9Var2 != null) {
                            cs0Var19.k = null;
                            cs0Var19.i = 9205357640488583168L;
                            cs0Var19.h = 0L;
                            cs0Var19.j = 0.0f;
                            cs0Var19.g = true;
                            cs0Var19.n = false;
                            cs0Var19.l = l9Var2;
                            cs0Var19.a();
                        } else {
                            na2 na2Var = os1Var.g;
                            float f14 = na2Var.b;
                            float f15 = na2Var.a;
                            cs0Var19.h(Float.intBitsToFloat((int) (na2Var.h >> c)), (((long) Float.floatToRawIntBits(f15)) << c) | (((long) Float.floatToRawIntBits(f14)) & j), (((long) Float.floatToRawIntBits(na2Var.c - f15)) << c) | (((long) Float.floatToRawIntBits(na2Var.d - f14)) & j));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((ouVar instanceof ms1) || ((ouVar instanceof os1) && !h12.o(((os1) ouVar).g))) && (mn1Var = es0Var.l) != null)) {
                    mn1Var.a();
                }
            }
            z2 = true;
        }
        es0Var.u = j92Var.h;
        if (i != 0 || z2) {
            ViewParent parent = t6Var.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(t6Var, t6Var);
            }
            if (t6.m()) {
                t6Var.L(0.0f);
            }
        }
        boolean z5 = this.F;
        this.F = j92Var.w;
        this.J = j92Var.k;
        boolean z6 = q31Var2.a == q31Var.a && q31Var2.b == q31Var.b && q31Var2.c == q31Var.c && q31Var2.d == q31Var.d && q31Var2.e == q31Var.e && q31Var2.f == q31Var.f && q31Var2.g == q31Var.g && q31Var2.h == q31Var.h && ez2.a(q31Var2.i, q31Var.i);
        if (!z || (z6 && z5 == this.F && !t72Var.h)) {
            l41Var = l41Var2;
        } else {
            l41Var = l41Var2;
            t6 t6Var2 = l41Var.u;
            if (t6Var2 != null) {
                t6Var2.v(l41Var);
            }
        }
        if (z6) {
            return;
        }
        l41Var.O(this);
        if (l41Var.T > 0) {
            t6 t6VarA = o41.a(l41Var);
            ix0 ix0Var = t6VarA.W.e;
            if (l41Var.T > 0) {
                ((uj1) ix0Var.i).b(l41Var);
                l41Var.S = true;
            }
            t6VarA.E(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    public final boolean x1(long j) {
        boolean z;
        boolean z2;
        boolean zM;
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        gt1 gt1Var = this.a0;
        if (gt1Var == null || !this.F) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        cs0 cs0Var = ((es0) gt1Var).h;
        if (cs0Var.A) {
            ou ouVarD = cs0Var.d();
            if (ouVarD instanceof ns1) {
                r72 r72Var = ((ns1) ouVarD).g;
                if (r72Var.a > fIntBitsToFloat || fIntBitsToFloat >= r72Var.c || r72Var.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= r72Var.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (ouVarD instanceof os1) {
                na2 na2Var = ((os1) ouVarD).g;
                float f = na2Var.c;
                float f2 = na2Var.b;
                float f3 = na2Var.d;
                float f4 = na2Var.a;
                long j2 = na2Var.f;
                long j3 = na2Var.h;
                z = false;
                z2 = true;
                long j4 = na2Var.g;
                long j5 = na2Var.e;
                if (fIntBitsToFloat >= f4 && fIntBitsToFloat < f && fIntBitsToFloat2 >= f2 && fIntBitsToFloat2 < f3) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= f - f4) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= f - f4) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                    float fIntBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                    if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        zM = cy1.M(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, na2Var.e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                        zM = cy1.M(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, na2Var.h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) {
                                        zM = (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : cy1.M(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, na2Var.g);
                                    } else {
                                        zM = cy1.M(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, na2Var.f);
                                    }
                                } else {
                                    l9 l9VarA = n9.a();
                                    l9.b(l9VarA, na2Var);
                                    zM = cy1.K(fIntBitsToFloat, fIntBitsToFloat2, l9VarA);
                                }
                            } else {
                                l9 l9VarA2 = n9.a();
                                l9.b(l9VarA2, na2Var);
                                zM = cy1.K(fIntBitsToFloat, fIntBitsToFloat2, l9VarA2);
                            }
                        } else {
                            l9 l9VarA3 = n9.a();
                            l9.b(l9VarA3, na2Var);
                            zM = cy1.K(fIntBitsToFloat, fIntBitsToFloat2, l9VarA3);
                        }
                    } else {
                        l9 l9VarA4 = n9.a();
                        l9.b(l9VarA4, na2Var);
                        zM = cy1.K(fIntBitsToFloat, fIntBitsToFloat2, l9VarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(ouVarD instanceof ms1)) {
                    wg.n();
                    return false;
                }
                zM = cy1.K(fIntBitsToFloat, fIntBitsToFloat2, ((ms1) ouVarD).g);
            }
            zM = z;
        } else {
            z = false;
            z2 = true;
        }
        return zM ? z2 : z;
    }

    @Override // defpackage.ad1
    public final ad1 y0() {
        return this.C;
    }

    @Override // defpackage.ad1
    public final t31 z0() {
        return this;
    }
}
