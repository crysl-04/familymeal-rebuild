package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vs2 {
    public static final us2 Companion = new us2();
    public final q52 a;
    public final q52 b;
    public final q52 c;
    public final q52 d;
    public final q52 e;

    public /* synthetic */ vs2(int i, q52 q52Var, q52 q52Var2, q52 q52Var3, q52 q52Var4, q52 q52Var5) {
        if (31 != (i & 31)) {
            m02.x(i, 31, ts2.a.d());
            throw null;
        }
        this.a = q52Var;
        this.b = q52Var2;
        this.c = q52Var3;
        this.d = q52Var4;
        this.e = q52Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs2)) {
            return false;
        }
        vs2 vs2Var = (vs2) obj;
        return uz0.g(this.a, vs2Var.a) && uz0.g(this.b, vs2Var.b) && uz0.g(this.c, vs2Var.c) && uz0.g(this.d, vs2Var.d) && uz0.g(this.e, vs2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TargetsDto(kcal=" + this.a + ", protein=" + this.b + ", fat=" + this.c + ", carb=" + this.d + ", fiber=" + this.e + ")";
    }

    public vs2(q52 q52Var, q52 q52Var2, q52 q52Var3, q52 q52Var4, q52 q52Var5) {
        this.a = q52Var;
        this.b = q52Var2;
        this.c = q52Var3;
        this.d = q52Var4;
        this.e = q52Var5;
    }
}
