package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 {
    public static final nu0 g = new nu0(false, 0, true, 1, 1, ub1.j);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final ub1 f;

    public nu0(boolean z, int i, boolean z2, int i2, int i3, ub1 ub1Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = ub1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0Var = (nu0) obj;
        return this.a == nu0Var.a && this.b == nu0Var.b && this.c == nu0Var.c && this.d == nu0Var.d && this.e == nu0Var.e && uz0.g(this.f, nu0Var.f);
    }

    public final int hashCode() {
        return this.f.h.hashCode() + jp1.b(this.e, jp1.b(this.d, jp1.c(jp1.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i == -1) {
            str = "Unspecified";
        } else if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else {
            str = i == 3 ? "Sentences" : "Invalid";
        }
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + str + ", autoCorrect=" + this.c + ", keyboardType=" + d31.a(this.d) + ", imeAction=" + mu0.a(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
