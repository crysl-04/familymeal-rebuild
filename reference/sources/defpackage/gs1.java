package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 implements a1, xo1, Comparable {
    public m00 h = null;
    public Supplier i = null;
    public transient List j = null;
    public Supplier k = null;
    public final a1 l;
    public final is1 m;
    public final double n;

    public gs1(is1 is1Var, double d, a1 a1Var) {
        Objects.requireNonNull(is1Var);
        Objects.requireNonNull(a1Var);
        this.m = is1Var;
        this.n = d;
        this.l = a1Var;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        return this.l.A(i);
    }

    @Override // defpackage.xo1
    public final double A0() {
        return this.n;
    }

    public final void M0(gs1 gs1Var) {
        Optional optionalOfNullable = Optional.ofNullable(this.i);
        if (optionalOfNullable.isPresent()) {
            gs1Var.i = (Supplier) optionalOfNullable.get();
        }
        List listI0 = i0();
        if (listI0.size() > 0) {
            gs1Var.j = listI0;
        }
    }

    @Override // defpackage.a1
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final BigDecimal G(long j) {
        return pz1.C(this.l.G(j));
    }

    public final gs1 a1(a1 a1Var) {
        gs1 gs1Var = new gs1(this.m, this.n, a1Var);
        M0(gs1Var);
        if (a1Var.size() == this.l.size()) {
            gs1Var.k = this.k;
        }
        return gs1Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return wo1.t(this.n, ((gs1) obj).n);
    }

    @Override // defpackage.mo2
    public final long count() {
        return this.l.count();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gs1.class == obj.getClass()) {
            gs1 gs1Var = (gs1) obj;
            if (this.m == gs1Var.m && Double.doubleToLongBits(this.n) == Double.doubleToLongBits(gs1Var.n)) {
                return true;
            }
        }
        return false;
    }

    public final gs1 f1(is1 is1Var) {
        gs1 gs1Var = new gs1(is1Var, this.n, this.l);
        M0(gs1Var);
        gs1Var.k = this.k;
        return gs1Var;
    }

    public final int hashCode() {
        is1 is1Var = this.m;
        int iHashCode = is1Var == null ? 0 : is1Var.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.n);
        return ((iHashCode + 31) * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final List i0() {
        List list = this.j;
        if (list != null) {
            return list;
        }
        Supplier supplier = this.i;
        a1 a1Var = supplier != null ? (a1) supplier.get() : null;
        m00 m00Var = this.h;
        if (m00Var == null || a1Var == null || !m00Var.j() || this.h.m != a1Var.size()) {
            List list2 = Collections.EMPTY_LIST;
            this.j = list2;
            return list2;
        }
        ArrayList arrayListR = this.h.R(a1Var);
        this.j = arrayListR;
        return arrayListR;
    }

    @Override // defpackage.mo2
    public final int size() {
        return (int) this.l.count();
    }

    public final String toString() {
        return String.valueOf(this.m) + " " + this.n + " @ " + a1.V0(this.l);
    }

    public final gs1 u1(double d) {
        gs1 gs1Var = new gs1(this.m, d, this.l);
        M0(gs1Var);
        gs1Var.k = this.k;
        return gs1Var;
    }
}
