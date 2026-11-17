package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dq implements Comparable {
    public final int h;
    public final int i;
    public final int j;
    public final long k;

    public dq(int i, int i2, int i3, long j) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return uz0.j(this.k, ((dq) obj).k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq)) {
            return false;
        }
        dq dqVar = (dq) obj;
        return this.h == dqVar.h && this.i == dqVar.i && this.j == dqVar.j && this.k == dqVar.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + jp1.b(this.j, jp1.b(this.i, Integer.hashCode(this.h) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.h + ", month=" + this.i + ", dayOfMonth=" + this.j + ", utcTimeMillis=" + this.k + ')';
    }
}
