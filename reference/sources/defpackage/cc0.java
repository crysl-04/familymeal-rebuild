package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cc0 implements Comparable {
    public final float h;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.h, ((cc0) obj).h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cc0) {
            return Float.compare(this.h, ((cc0) obj).h) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h);
    }

    public final String toString() {
        return c(this.h);
    }
}
