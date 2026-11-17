package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m13 implements Comparable {
    public final int h;

    public /* synthetic */ m13(int i) {
        this.h = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return uz0.i(this.h ^ Integer.MIN_VALUE, ((m13) obj).h ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m13) {
            return this.h == ((m13) obj).h;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h);
    }

    public final String toString() {
        return String.valueOf(((long) this.h) & 4294967295L);
    }
}
