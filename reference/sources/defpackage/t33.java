package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t33 implements o33 {
    public final q33 h;
    public final long i;
    public final long j = 0;

    public t33(q33 q33Var) {
        this.h = q33Var;
        this.i = ((long) (q33Var.o() + q33Var.k())) * 1000000;
    }

    @Override // defpackage.o33
    public final boolean a() {
        return true;
    }

    @Override // defpackage.o33
    public final long b(id idVar, id idVar2, id idVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j2 = j + this.j;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.i;
        return j2 - ((j2 / j3) * j3);
    }

    public final id d(long j, id idVar, id idVar2, id idVar3) {
        long j2 = this.j;
        long j3 = j + j2;
        long j4 = this.i;
        return j3 > j4 ? this.h.l(j4 - j2, idVar, idVar3, idVar2) : idVar2;
    }

    @Override // defpackage.o33
    public final id l(long j, id idVar, id idVar2, id idVar3) {
        return this.h.l(c(j), idVar, idVar2, d(j, idVar, idVar3, idVar2));
    }

    @Override // defpackage.o33
    public final id p(long j, id idVar, id idVar2, id idVar3) {
        return this.h.p(c(j), idVar, idVar2, d(j, idVar, idVar3, idVar2));
    }
}
