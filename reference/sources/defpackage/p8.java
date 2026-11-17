package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p8 implements zz1 {
    public final int h;

    public p8(int i) {
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8) && this.h == ((p8) obj).h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h);
    }

    public final String toString() {
        return jp1.i(this.h, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
