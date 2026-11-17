package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z33 extends qg1 implements sd0 {
    public lz2 v;
    public ah0 w;
    public wh0 x;
    public si2 y;

    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        n41Var.a();
        lz2 lz2Var = this.v;
        y33 y33Var = new y33(this, (byte) 0);
        si2 si2Var = this.y;
        kz2 kz2VarA = lz2Var.a(y33Var, si2Var.a() ? new kv(si2Var.e) : null, null, new y33(this, (byte) 1));
        si2 si2Var2 = this.y;
        long j = ((kv) kz2VarA.getValue()).a;
        p61 p61Var = si2Var2.c;
        if (si2Var2.b() && ((Boolean) ((lu1) p61Var.g).getValue()).booleanValue()) {
            j = ((kv) ((lu1) p61Var.h).getValue()).a;
        }
        long j2 = j;
        if (si2Var2.b()) {
            si2Var2.e = j2;
        }
        if (kv.c(j2) == 0.0f) {
            return;
        }
        pz2 pz2Var = this.w.a;
        pz2 pz2Var2 = this.x.a;
        td0.H(n41Var, j2, 0L, 126);
    }
}
