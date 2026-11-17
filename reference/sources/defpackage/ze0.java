package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 {
    public static final long[] e = new long[0];
    public final rh2 a;
    public final om0 b;
    public long c;
    public final long[] d;

    public ze0(rh2 rh2Var, om0 om0Var) {
        rh2Var.getClass();
        this.a = rh2Var;
        this.b = om0Var;
        int iD = rh2Var.d();
        if (iD <= 64) {
            this.c = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.d = jArr;
    }
}
