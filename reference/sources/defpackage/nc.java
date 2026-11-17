package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nc extends f41 {
    public long A = 0;
    public long B = 0;
    public final lc C = new lc(this, (byte) 1);
    public final lc D = new lc(this, (byte) 0);
    public long E = -9223372034707292160L;
    public lz2 v;
    public sj1 w;
    public oc x;
    public ny1 y;
    public ny1 z;

    public nc(lz2 lz2Var, sj1 sj1Var, oc ocVar) {
        this.v = lz2Var;
        this.w = sj1Var;
        this.x = ocVar;
    }

    @Override // defpackage.qg1
    public final void D0() {
        this.E = -9223372034707292160L;
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        long j2;
        ny1 ny1VarE = ue1Var.e(j);
        if (bf1Var.u()) {
            j2 = (((long) ny1VarE.h) << 32) | (((long) ny1VarE.i) & 4294967295L);
        } else {
            lz2 lz2Var = this.v;
            int i = ny1VarE.h;
            if (lz2Var == null) {
                j2 = (((long) i) << 32) | (((long) ny1VarE.i) & 4294967295L);
                this.E = j2;
            } else {
                long j3 = (((long) i) << 32) | (((long) ny1VarE.i) & 4294967295L);
                kz2 kz2VarA = lz2Var.a(new mc(this, j3, (byte) 0), null, null, new mc(this, j3, (byte) 1));
                j2 = ((vy0) kz2VarA.getValue()).a;
                this.E = ((vy0) kz2VarA.getValue()).a;
            }
        }
        boolean zU = bf1Var.u();
        bg0 bg0Var = bg0.h;
        if (zU) {
            this.y = ny1VarE;
            this.A = j2;
            return bf1Var.g0((int) (j2 >> 32), (int) (j2 & 4294967295L), bg0Var, this.C);
        }
        this.z = ny1VarE;
        this.B = j2;
        return bf1Var.g0((int) (j2 >> 32), (int) (j2 & 4294967295L), bg0Var, this.D);
    }
}
