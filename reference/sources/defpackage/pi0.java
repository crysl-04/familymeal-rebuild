package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class pi0 extends w0 {
    public final fy1 k;
    public final vc2 l;
    public final vc2 m;

    public pi0(fy1 fy1Var, int i, int i2) {
        super(i, i2);
        this.k = fy1Var;
        this.m = fy1Var.h().k();
        this.l = fy1Var.h().c();
    }

    @Override // defpackage.re1
    public final fy1 C0() {
        return this.k;
    }

    @Override // defpackage.w0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof pi0)) {
            return false;
        }
        pi0 pi0Var = (pi0) obj;
        fy1 fy1Var = pi0Var.k;
        fy1 fy1Var2 = this.k;
        if (fy1Var2 == null) {
            if (fy1Var != null) {
                return false;
            }
        } else if (!fy1Var2.equals(fy1Var)) {
            return false;
        }
        vc2 vc2Var = pi0Var.l;
        vc2 vc2Var2 = this.l;
        if (vc2Var2 == null) {
            if (vc2Var != null) {
                return false;
            }
        } else if (!vc2Var2.equals(vc2Var)) {
            return false;
        }
        vc2 vc2Var3 = pi0Var.m;
        vc2 vc2Var4 = this.m;
        if (vc2Var4 == null) {
            if (vc2Var3 != null) {
                return false;
            }
        } else if (!vc2Var4.equals(vc2Var3)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.w0
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        fy1 fy1Var = this.k;
        int iHashCode2 = (iHashCode + (fy1Var == null ? 0 : fy1Var.hashCode())) * 31;
        vc2 vc2Var = this.l;
        int iHashCode3 = (iHashCode2 + (vc2Var == null ? 0 : vc2Var.hashCode())) * 31;
        vc2 vc2Var2 = this.m;
        return iHashCode3 + (vc2Var2 != null ? vc2Var2.hashCode() : 0);
    }

    public pi0(fy1 fy1Var, long j, long j2) {
        this(fy1Var, Math.toIntExact(j), Math.toIntExact(j2));
    }
}
