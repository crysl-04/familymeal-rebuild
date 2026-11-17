package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z03 {
    public final ar2 a;
    public final qn0 b;
    public final int c;
    public final int d;

    public z03(ar2 ar2Var, qn0 qn0Var, int i, int i2) {
        this.a = ar2Var;
        this.b = qn0Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z03)) {
            return false;
        }
        z03 z03Var = (z03) obj;
        return uz0.g(this.a, z03Var.a) && uz0.g(this.b, z03Var.b) && this.c == z03Var.c && this.d == z03Var.d;
    }

    public final int hashCode() {
        ar2 ar2Var = this.a;
        return jp1.b(this.d, jp1.b(this.c, (((ar2Var == null ? 0 : ar2Var.hashCode()) * 31) + this.b.h) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + str + ", fontSynthesis=" + str2 + ", resourceLoaderCacheKey=null)";
    }
}
