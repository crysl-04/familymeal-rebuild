package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mw2 {
    public final yl2 a;
    public final yl2 b;
    public final yl2 c;
    public final yl2 d;

    public mw2(yl2 yl2Var, yl2 yl2Var2, yl2 yl2Var3, yl2 yl2Var4) {
        this.a = yl2Var;
        this.b = yl2Var2;
        this.c = yl2Var3;
        this.d = yl2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mw2)) {
            return false;
        }
        mw2 mw2Var = (mw2) obj;
        return uz0.g(this.a, mw2Var.a) && uz0.g(this.b, mw2Var.b) && uz0.g(this.c, mw2Var.c) && uz0.g(this.d, mw2Var.d);
    }

    public final int hashCode() {
        yl2 yl2Var = this.a;
        int iHashCode = (yl2Var != null ? yl2Var.hashCode() : 0) * 31;
        yl2 yl2Var2 = this.b;
        int iHashCode2 = (iHashCode + (yl2Var2 != null ? yl2Var2.hashCode() : 0)) * 31;
        yl2 yl2Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (yl2Var3 != null ? yl2Var3.hashCode() : 0)) * 31;
        yl2 yl2Var4 = this.d;
        return iHashCode3 + (yl2Var4 != null ? yl2Var4.hashCode() : 0);
    }
}
