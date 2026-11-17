package defpackage;

import java.time.OffsetDateTime;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hk {
    public final gk a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final OffsetDateTime f;
    public final boolean g;
    public final int h;

    public hk(gk gkVar, int i, int i2, int i3, int i4, OffsetDateTime offsetDateTime, boolean z, int i5) {
        offsetDateTime.getClass();
        this.a = gkVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = offsetDateTime;
        this.g = z;
        this.h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk)) {
            return false;
        }
        hk hkVar = (hk) obj;
        return this.a.equals(hkVar.a) && this.b == hkVar.b && this.c == hkVar.c && this.d == hkVar.d && this.e == hkVar.e && uz0.g(this.f, hkVar.f) && this.g == hkVar.g && this.h == hkVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + jp1.c((this.f.hashCode() + jp1.b(this.e, jp1.b(this.d, jp1.b(this.c, jp1.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31, this.g);
    }

    public final String toString() {
        return "Preview(data=" + this.a + ", ingredients=" + this.b + ", recipes=" + this.c + ", persons=" + this.d + ", weights=" + this.e + ", exportedAt=" + this.f + ", includesBodyData=" + this.g + ", matchingMembers=" + this.h + ")";
    }
}
