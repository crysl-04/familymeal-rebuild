package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p12 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final short f;

    public p12(int i, boolean z, boolean z2) {
        ie0 ie0Var = ca.a;
        int i2 = !z ? 262152 : 262144;
        this.a = z2 ? i2 : i2 | 512;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = (short) 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p12)) {
            return false;
        }
        p12 p12Var = (p12) obj;
        return this.a == p12Var.a && this.b == p12Var.b && this.c == p12Var.c && this.d == p12Var.d && this.e == p12Var.e && this.f == p12Var.f;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.e) + jp1.c(jp1.c(jp1.c(this.a * 31, 31, this.b), 31, this.c), 31, this.d)) * 31) + 1237) * 31) + this.f) * 31;
    }
}
