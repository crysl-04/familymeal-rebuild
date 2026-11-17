package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mc extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ nc j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc(nc ncVar, long j, byte b) {
        super(1);
        this.i = b;
        this.j = ncVar;
        this.k = j;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        oj0 oj0Var;
        byte b = this.i;
        long j = 0;
        long j2 = this.k;
        nc ncVar = this.j;
        switch (b) {
            case 0:
                mz2 mz2Var = (mz2) obj;
                if (!uz0.g(mz2Var.b(), ncVar.x.b())) {
                    kn2 kn2Var = (kn2) ncVar.x.d.g(mz2Var.b());
                    j2 = kn2Var != null ? ((vy0) kn2Var.getValue()).a : 0L;
                } else if (!vy0.a(ncVar.E, -9223372034707292160L)) {
                    j2 = ncVar.E;
                }
                kn2 kn2Var2 = (kn2) ncVar.x.d.g(mz2Var.d());
                j = kn2Var2 != null ? ((vy0) kn2Var2.getValue()).a : 0L;
                ak2 ak2Var = (ak2) ncVar.w.getValue();
                return (ak2Var == null || (oj0Var = (oj0) ak2Var.a.f(new vy0(j2), new vy0(j))) == null) ? uz0.y(0.0f, 400.0f, null, 5) : oj0Var;
            default:
                if (uz0.g(obj, ncVar.x.b())) {
                    j = vy0.a(ncVar.E, -9223372034707292160L) ? j2 : ncVar.E;
                } else {
                    kn2 kn2Var3 = (kn2) ncVar.x.d.g(obj);
                    if (kn2Var3 != null) {
                        j = ((vy0) kn2Var3.getValue()).a;
                    }
                }
                return new vy0(j);
        }
    }
}
