package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 {
    public final long a;
    public final long b;
    public final long c;

    static {
        je1 je1Var = je1.n;
        long j = 4096 / (((long) je1Var.h) * ((long) je1Var.i.i));
    }

    public ns0(long j, long j2, long j3) {
        this.b = j;
        this.a = j2;
        this.c = j3;
    }

    public static ns0 a(je1 je1Var) {
        long j = ((long) je1Var.h) * ((long) je1Var.i.i);
        return new ns0(4L, 4096 / j, (aq1.a.k / 2) / j);
    }

    public final long b(long j) {
        long j2 = j + 1;
        long j3 = this.a;
        if (j2 >= j3) {
            long j4 = j3;
            while (j4 < j2) {
                j4 += j3;
            }
            return j4;
        }
        while (true) {
            long jRound = Math.round(j3 / h32.l);
            if (jRound < j2) {
                return j3;
            }
            j3 = jRound;
        }
    }
}
