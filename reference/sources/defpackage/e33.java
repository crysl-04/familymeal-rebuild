package defpackage;

import java.math.BigDecimal;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e33 extends mg1 {
    public final lo2 p;
    public boolean q;
    public transient boolean r;
    public BigDecimal s;

    public e33(e33 e33Var) {
        super(e33Var);
        this.q = false;
        this.r = false;
        this.s = null;
        this.p = e33Var.p;
        this.q = e33Var.q;
        this.s = e33Var.E();
    }

    @Override // defpackage.mg1
    public final /* bridge */ /* synthetic */ mg1 B(BigDecimal bigDecimal) {
        L(bigDecimal);
        return this;
    }

    @Override // defpackage.mg1
    public final boolean C(BigDecimal bigDecimal, wo1 wo1Var, cl clVar) {
        throw null;
    }

    public final BigDecimal E() {
        if (this.s == null && p()) {
            this.s = this.j;
        }
        return this.s;
    }

    public final boolean F() {
        if (!this.q) {
            return false;
        }
        BigDecimal bigDecimal = om.a;
        BigDecimal bigDecimal2 = om.b;
        BigDecimal bigDecimal3 = this.j;
        return bigDecimal3 != null && this.l != null && bigDecimal3.compareTo(bigDecimal) == 0 && this.l.compareTo(bigDecimal2) == 0;
    }

    public final boolean G() {
        return !s() || this.j.signum() < 0;
    }

    public final boolean H() {
        return !v() || this.l.signum() > 0;
    }

    public final void I(BigDecimal bigDecimal) {
        this.j = mg1.A(bigDecimal);
        if (s() && v() && this.j.compareTo(this.l) == 0) {
            this.s = this.j;
        }
    }

    public final void J(BigDecimal bigDecimal) {
        BigDecimal bigDecimalA = mg1.A(bigDecimal);
        x(bigDecimalA);
        B(bigDecimalA);
        K(bigDecimal);
    }

    public final void K(BigDecimal bigDecimal) {
        BigDecimal bigDecimalC;
        if (bigDecimal != null) {
            bigDecimalC = pz1.C(bigDecimal);
            if (v()) {
                bigDecimalC = bigDecimalC.min(this.l);
            }
            if (s()) {
                bigDecimalC = bigDecimalC.max(this.j);
            }
        } else {
            bigDecimalC = null;
        }
        this.s = bigDecimalC;
    }

    public final void L(BigDecimal bigDecimal) {
        this.l = mg1.A(bigDecimal);
        if (s() && v() && this.j.compareTo(this.l) == 0) {
            this.s = this.j;
        }
    }

    public final boolean M(BigDecimal bigDecimal, wo1 wo1Var, al alVar, boolean z) {
        boolean zC = super.C(bigDecimal, wo1Var, alVar);
        if (!zC || z || !this.q || wo1Var.v(bigDecimal).stripTrailingZeros().scale() <= 0) {
            return zC;
        }
        if (alVar == null) {
            return false;
        }
        alVar.println(String.valueOf(bigDecimal) + " ! Integer: " + this.k);
        return false;
    }

    @Override // defpackage.mg1
    public final void a(zh0 zh0Var, BigDecimal bigDecimal) {
        zh0Var.I(this.p, mg1.A(bigDecimal));
    }

    @Override // defpackage.mg1
    public final void c(StringBuilder sb, wo1 wo1Var) {
        sb.append(this.k);
        if (this.s != null) {
            sb.append(": ");
            sb.append(wo1Var.v(this.s).toPlainString());
        }
        if (t()) {
            sb.append(" (");
            sb.append(wo1Var.v(this.i).toPlainString());
            sb.append(")");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.p.h, ((e33) obj).p.h);
    }

    @Override // defpackage.mg1
    public final int e() {
        if (!o() || this.q) {
            return 0;
        }
        jm jmVar = jm.L0;
        im imVarV = jmVar.v();
        im imVarE = jmVar.E();
        BigDecimal bigDecimal = this.j;
        if (bigDecimal != null) {
            if (bigDecimal.signum() == 0) {
                BigDecimal bigDecimal2 = om.b;
                imVarV.d(bigDecimal2);
                imVarE.d(bigDecimal2);
            } else {
                imVarV.d(bigDecimal);
                imVarE.d(bigDecimal);
            }
        }
        BigDecimal bigDecimal3 = this.l;
        if (bigDecimal3 != null) {
            if (bigDecimal3.signum() == 0) {
                BigDecimal bigDecimal4 = om.b;
                imVarV.d(bigDecimal4);
                imVarE.d(bigDecimal4);
            } else {
                imVarV.d(bigDecimal3);
                imVarE.d(bigDecimal3);
            }
        }
        return mg1.f(imVarV, imVarE);
    }

    @Override // defpackage.mg1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof e33)) {
            return false;
        }
        e33 e33Var = (e33) obj;
        return this.p.equals(e33Var.p) && this.q == e33Var.q && Objects.equals(this.s, e33Var.s);
    }

    @Override // defpackage.mg1
    public final int hashCode() {
        return Objects.hash(this.p, Boolean.valueOf(this.q), this.s) + (super.hashCode() * 31);
    }

    @Override // defpackage.mg1
    public final boolean q() {
        return this.q;
    }

    @Override // defpackage.mg1
    public final /* bridge */ /* synthetic */ mg1 x(BigDecimal bigDecimal) {
        I(bigDecimal);
        return this;
    }

    public e33(String str, int i) {
        super(str);
        this.q = false;
        this.r = false;
        this.s = null;
        this.p = new lo2(i);
    }
}
