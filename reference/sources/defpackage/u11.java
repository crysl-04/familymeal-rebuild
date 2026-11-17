package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u11 extends f21 {
    public final boolean h;
    public final String i;

    public u11(String str, boolean z) {
        str.getClass();
        this.h = z;
        this.i = str.toString();
    }

    @Override // defpackage.f21, defpackage.n11
    public final void a(StringBuilder sb) {
        boolean z = this.h;
        String str = this.i;
        if (z) {
            ao2.a(sb, str);
        } else {
            sb.append(str);
        }
    }

    @Override // defpackage.f21
    public final String b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u11.class != obj.getClass()) {
            return false;
        }
        u11 u11Var = (u11) obj;
        return this.h == u11Var.h && uz0.g(this.i, u11Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + (Boolean.hashCode(this.h) * 31);
    }

    @Override // defpackage.f21
    public final String toString() {
        boolean z = this.h;
        String str = this.i;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        ao2.a(sb, str);
        return sb.toString();
    }
}
