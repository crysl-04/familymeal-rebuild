package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wg0 extends m31 implements vp0 {
    public final /* synthetic */ zg0 i;
    public final /* synthetic */ kz2 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ ny1 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ qg0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(zg0 zg0Var, kz2 kz2Var, long j, long j2, long j3, ny1 ny1Var, long j4, qg0 qg0Var) {
        super(1);
        this.i = zg0Var;
        this.j = kz2Var;
        this.k = j2;
        this.l = j3;
        this.m = ny1Var;
        this.n = j4;
        this.o = qg0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        my1 my1Var = (my1) obj;
        zg0 zg0Var = this.i;
        si2 si2Var = zg0Var.B;
        long jA = 0;
        kz2 kz2Var = this.j;
        long j = kz2Var != null ? ((ny0) kz2Var.getValue()).a : 0L;
        si2Var.b();
        si2Var.b();
        long jC = ny0.c(j, 0L);
        if (si2Var.b()) {
            si2Var.i = jC;
        }
        d5 d5Var = zg0Var.F;
        if (d5Var != null) {
            jA = d5Var.a(this.k, this.l, u31.h);
        }
        long jC2 = ny0.c(jA, jC);
        long j2 = this.n;
        long j3 = (((long) (((int) (jC2 >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (jC2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
        ny1 ny1Var = this.m;
        my1Var.g(ny1Var);
        ny1Var.n0(ny0.c(j3, ny1Var.l), 0.0f, this.o);
        return j23.a;
    }
}
