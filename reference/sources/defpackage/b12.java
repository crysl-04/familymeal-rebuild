package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b12 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final byte g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    /* JADX WARN: Multi-variable type inference failed */
    public b12(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b12)) {
            return false;
        }
        b12 b12Var = (b12) obj;
        return y02.k(this.a, b12Var.a) && this.b == b12Var.b && up1.b(this.c, b12Var.c) && up1.b(this.d, b12Var.d) && this.e == b12Var.e && Float.compare(this.f, b12Var.f) == 0 && this.g == b12Var.g && this.h == b12Var.h && this.i.equals(b12Var.i) && up1.b(this.j, b12Var.j) && Float.compare(this.k, b12Var.k) == 0 && up1.b(this.l, b12Var.l) && up1.b(this.m, b12Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + jp1.d(this.l, wi0.d(this.k, jp1.d(this.j, (this.i.hashCode() + jp1.c(jp1.b(this.g, wi0.d(this.f, jp1.c(jp1.d(this.d, jp1.d(this.c, jp1.d(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31), 31), 31, this.h)) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strZ = y02.z(this.a);
        String strG = up1.g(this.c);
        String strG2 = up1.g(this.d);
        String strA = f12.a(this.g);
        String strG3 = up1.g(this.j);
        String strG4 = up1.g(this.l);
        String strG5 = up1.g(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strZ);
        sb.append(", uptime=");
        sb.append(this.b);
        wi0.v(sb, ", positionOnScreen=", strG, ", position=", strG2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(strG3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(strG4);
        sb.append(", originalEventPosition=");
        sb.append(strG5);
        sb.append(")");
        return sb.toString();
    }
}
