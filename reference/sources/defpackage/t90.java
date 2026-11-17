package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t90 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public t90(boolean z, boolean z2, String str, int i, int i2, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t90)) {
            return false;
        }
        t90 t90Var = (t90) obj;
        return this.a == t90Var.a && this.b == t90Var.b && this.c.equals(t90Var.c) && this.d == t90Var.d && this.e == t90Var.e && uz0.g(this.f, t90Var.f);
    }

    public final int hashCode() {
        int iB = jp1.b(this.e, jp1.b(this.d, jp1.f(this.c, jp1.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31), 31);
        String str = this.f;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DbStatus(opened=" + this.a + ", encryptedOnDisk=" + this.b + ", keyProtection=" + this.c + ", ingredients=" + this.d + ", recipes=" + this.e + ", error=" + this.f + ")";
    }
}
