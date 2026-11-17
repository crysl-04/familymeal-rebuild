package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r13 implements Comparable {
    public final long h;

    public /* synthetic */ r13(long j) {
        this.h = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return uz0.j(this.h ^ Long.MIN_VALUE, ((r13) obj).h ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r13) {
            return this.h == ((r13) obj).h;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.h);
    }

    public final String toString() {
        long j = this.h;
        if (j >= 0) {
            vs.r(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        vs.r(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        vs.r(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }
}
