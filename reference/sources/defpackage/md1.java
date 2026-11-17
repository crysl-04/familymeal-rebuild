package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class md1 extends qg1 implements sr0, sd0, ug2, rp1 {
    public vz1 D;
    public View E;
    public e90 F;
    public xl1 G;
    public o90 I;
    public vy0 K;
    public fp L;
    public be v;
    public ov2 w;
    public float x = Float.NaN;
    public boolean y = true;
    public long z = 9205357640488583168L;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public boolean C = true;
    public final lu1 H = new lu1(null, c5.f0);
    public long J = 9205357640488583168L;

    public md1(be beVar, ov2 ov2Var, vz1 vz1Var) {
        this.v = beVar;
        this.w = ov2Var;
        this.D = vz1Var;
    }

    @Override // defpackage.qg1
    public final void B0() {
        M();
        this.L = ls.a(0, 7, null);
        ie1.p(x0(), null, new og(this, null, (byte) 1), 1);
    }

    @Override // defpackage.qg1
    public final void C0() {
        xl1 xl1Var = this.G;
        if (xl1Var != null) {
            ((Magnifier) xl1Var.i).dismiss();
        }
        this.G = null;
    }

    public final long J0() {
        o90 o90VarB = this.I;
        if (o90VarB == null) {
            o90VarB = il2.b(new ld1(this, (byte) 2));
            this.I = o90VarB;
        }
        return ((up1) o90VarB.getValue()).a;
    }

    public final void K0() {
        xl1 xl1Var;
        xl1 xl1Var2 = this.G;
        if (xl1Var2 != null) {
            ((Magnifier) xl1Var2.i).dismiss();
        }
        View viewF = this.E;
        if (viewF == null) {
            viewF = ou.F(this);
        }
        this.E = viewF;
        e90 e90Var = this.F;
        if (e90Var == null) {
            e90Var = cu.Y(this).E;
        }
        this.F = e90Var;
        vz1 vz1Var = this.D;
        boolean z = this.y;
        long j = this.z;
        float f = this.A;
        float f2 = this.B;
        boolean z2 = this.C;
        float f3 = this.x;
        vz1Var.getClass();
        byte b = 5;
        if (z) {
            xl1Var = new xl1(new Magnifier(viewF), b);
        } else {
            long jC0 = e90Var.c0(j);
            float fA = e90Var.A(f);
            float fA2 = e90Var.A(f2);
            Magnifier.Builder builder = new Magnifier.Builder(viewF);
            if (jC0 != 9205357640488583168L) {
                builder.setSize(ie1.x(Float.intBitsToFloat((int) (jC0 >> 32))), ie1.x(Float.intBitsToFloat((int) (jC0 & 4294967295L))));
            }
            if (!Float.isNaN(fA)) {
                builder.setCornerRadius(fA);
            }
            if (!Float.isNaN(fA2)) {
                builder.setElevation(fA2);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            xl1Var = new xl1(builder.build(), b);
        }
        this.G = xl1Var;
        M0();
    }

    public final void L0() {
        e90 e90Var = this.F;
        if (e90Var == null) {
            e90Var = cu.Y(this).E;
            this.F = e90Var;
        }
        long j = ((up1) this.v.h(e90Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (J0() & 9223372034707292159L) == 9205357640488583168L) {
            this.J = 9205357640488583168L;
            xl1 xl1Var = this.G;
            if (xl1Var != null) {
                ((Magnifier) xl1Var.i).dismiss();
                return;
            }
            return;
        }
        this.J = up1.e(J0(), j);
        if (this.G == null) {
            K0();
        }
        xl1 xl1Var2 = this.G;
        if (xl1Var2 != null) {
            long j2 = this.J;
            float f = this.x;
            Magnifier magnifier = (Magnifier) xl1Var2.i;
            if (!Float.isNaN(f)) {
                magnifier.setZoom(f);
            }
            if ((9223372034707292159L & 9205357640488583168L) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (9205357640488583168L >> 32)), Float.intBitsToFloat((int) (9205357640488583168L & 4294967295L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            }
        }
        M0();
    }

    @Override // defpackage.rp1
    public final void M() {
        ou.D(this, new ld1(this, (byte) 0));
    }

    public final void M0() {
        e90 e90Var;
        xl1 xl1Var = this.G;
        if (xl1Var == null || (e90Var = this.F) == null) {
            return;
        }
        long jU = xl1Var.u();
        vy0 vy0Var = this.K;
        if (vy0Var == null || jU != vy0Var.a) {
            ov2 ov2Var = this.w;
            if (ov2Var != null) {
                ov2Var.h(new fc0(e90Var.x(ou.G(xl1Var.u()))));
            }
            this.K = new vy0(xl1Var.u());
        }
    }

    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        n41Var.a();
        fp fpVar = this.L;
        if (fpVar != null) {
            fpVar.s(j23.a);
        }
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        dh2Var.a(nd1.a, new ld1(this, (byte) 1));
    }

    @Override // defpackage.sr0
    public final void v(pn1 pn1Var) {
        this.H.setValue(pn1Var);
    }
}
