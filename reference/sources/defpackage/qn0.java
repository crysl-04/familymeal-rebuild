package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qn0 implements Comparable {
    public static final qn0 i;
    public static final qn0 j;
    public static final qn0 k;
    public static final qn0 l;
    public final int h;

    static {
        qn0 qn0Var = new qn0(100);
        qn0 qn0Var2 = new qn0(200);
        qn0 qn0Var3 = new qn0(300);
        qn0 qn0Var4 = new qn0(400);
        qn0 qn0Var5 = new qn0(500);
        qn0 qn0Var6 = new qn0(600);
        i = qn0Var6;
        qn0 qn0Var7 = new qn0(700);
        qn0 qn0Var8 = new qn0(800);
        qn0 qn0Var9 = new qn0(900);
        j = qn0Var4;
        k = qn0Var5;
        l = qn0Var7;
        lt.Q(qn0Var, qn0Var2, qn0Var3, qn0Var4, qn0Var5, qn0Var6, qn0Var7, qn0Var8, qn0Var9);
    }

    public qn0(int i2) {
        this.h = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        bx0.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return uz0.i(this.h, ((qn0) obj).h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qn0) {
            return this.h == ((qn0) obj).h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return jp1.i(this.h, "FontWeight(weight=", ")");
    }
}
