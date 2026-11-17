package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ps0 implements o12 {
    public final d5 h;
    public final yp1 i;
    public long j = 0;

    public ps0(d5 d5Var, yp1 yp1Var) {
        this.h = d5Var;
        this.i = yp1Var;
    }

    @Override // defpackage.o12
    public final long f(ry0 ry0Var, long j, u31 u31Var, long j2) {
        long jA = this.i.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.j;
        }
        this.j = jA;
        return ny0.c(ny0.c((((long) ry0Var.a) << 32) | (((long) ry0Var.b) & 4294967295L), lt.d0(jA)), this.h.a(j2, 0L, u31Var));
    }
}
