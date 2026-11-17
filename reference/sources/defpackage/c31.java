package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c31 {
    public static final c31 d = new c31(0, 0, 127);
    public final Boolean a;
    public final int b;
    public final int c;

    public c31(int i, int i2, int i3) {
        Boolean bool = (i3 & 2) != 0 ? null : Boolean.FALSE;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = bool;
        this.b = i;
        this.c = i2;
    }

    public final nu0 a(boolean z) {
        Boolean bool = this.a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i = this.b;
        d31 d31Var = new d31(i);
        if (i == 0) {
            d31Var = null;
        }
        int i2 = d31Var != null ? d31Var.a : 1;
        int i3 = this.c;
        mu0 mu0Var = i3 != -1 ? new mu0(i3) : null;
        return new nu0(z, 0, zBooleanValue, i2, mu0Var != null ? mu0Var.a : 1, ub1.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c31)) {
            return false;
        }
        c31 c31Var = (c31) obj;
        return uz0.g(this.a, c31Var.a) && this.b == c31Var.b && this.c == c31Var.c;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return jp1.b(this.c, jp1.b(this.b, ((-31) + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        String strA = d31.a(this.b);
        String strA2 = mu0.a(this.c);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=Unspecified, autoCorrectEnabled=");
        sb.append(this.a);
        sb.append(", keyboardType=");
        sb.append(strA);
        sb.append(", imeAction=");
        return wi0.i(sb, strA2, ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
    }
}
