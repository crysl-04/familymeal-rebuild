package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bt1 {
    public final long a;
    public final rt1 b;

    public bt1() {
        long jC = cu.c(4284900966L);
        rt1 rt1VarF = t03.f(3);
        this.a = jC;
        this.b = rt1VarF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bt1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        bt1 bt1Var = (bt1) obj;
        long j = bt1Var.a;
        int i = kv.h;
        return r13.a(this.a, j) && this.b.equals(bt1Var.b);
    }

    public final int hashCode() {
        int i = kv.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + kv.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
