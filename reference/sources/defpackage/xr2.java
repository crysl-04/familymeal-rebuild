package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xr2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final byte f;
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public xr2(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = co2.Q(upperCase, "INT", false) ? (byte) 3 : (co2.Q(upperCase, "CHAR", false) || co2.Q(upperCase, "CLOB", false) || co2.Q(upperCase, "TEXT", false)) ? (byte) 2 : co2.Q(upperCase, "BLOB", false) ? (byte) 5 : (co2.Q(upperCase, "REAL", false) || co2.Q(upperCase, "FLOA", false) || co2.Q(upperCase, "DOUB", false)) ? (byte) 4 : (byte) 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xr2) {
                boolean z = this.d > 0;
                xr2 xr2Var = (xr2) obj;
                byte b = xr2Var.f;
                if (z == (xr2Var.d > 0) && uz0.g(this.a, xr2Var.a) && this.c == xr2Var.c) {
                    String str = xr2Var.e;
                    byte b2 = this.f;
                    String str2 = this.e;
                    if ((b2 != 1 || b != 2 || str2 == null || h12.h(str2, str)) && ((b2 != 2 || b != 1 || str == null || h12.h(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : h12.h(str2, str))) && this.g == xr2Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append((int) this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return do2.G(do2.I(sb.toString()));
    }
}
