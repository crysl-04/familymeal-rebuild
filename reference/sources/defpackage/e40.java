package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e40 {
    public final ap1 a;
    public final ap1 b;
    public final ap1 c;
    public final ap1 d;
    public final ap1 e;

    public e40(ap1 ap1Var, ap1 ap1Var2, ap1 ap1Var3, ap1 ap1Var4, ap1 ap1Var5) {
        this.a = ap1Var;
        this.b = ap1Var2;
        this.c = ap1Var3;
        this.d = ap1Var4;
        this.e = ap1Var5;
    }

    public final ap1 a(zo1 zo1Var) {
        zo1Var.getClass();
        int iOrdinal = zo1Var.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        if (iOrdinal == 3) {
            return this.d;
        }
        if (iOrdinal == 4) {
            return this.e;
        }
        wg.n();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return this.a.equals(e40Var.a) && this.b.equals(e40Var.b) && this.c.equals(e40Var.c) && this.d.equals(e40Var.d) && this.e.equals(e40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DailyTargets(kcal=" + this.a + ", protein=" + this.b + ", fat=" + this.c + ", carb=" + this.d + ", fiber=" + this.e + ")";
    }
}
