package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 {
    public final float a;
    public final float b;
    public final float c;

    public qr2(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr2)) {
            return false;
        }
        qr2 qr2Var = (qr2) obj;
        return cc0.b(this.a, qr2Var.a) && cc0.b(this.b, qr2Var.b) && cc0.b(this.c, qr2Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + wi0.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        sb.append((Object) cc0.c(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) cc0.c(f + f2));
        sb.append(", width=");
        sb.append((Object) cc0.c(f2));
        sb.append(", contentWidth=");
        sb.append((Object) cc0.c(this.c));
        sb.append(')');
        return sb.toString();
    }
}
