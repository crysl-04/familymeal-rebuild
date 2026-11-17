package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd0 implements vp0 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ float i;
    public final /* synthetic */ Object j;

    public /* synthetic */ cd0(float f, t72 t72Var) {
        this.i = f;
        this.j = t72Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        boolean z;
        byte b = this.h;
        boolean z2 = false;
        float f = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                t72 t72Var = (t72) obj2;
                ld0 ld0Var = (ld0) obj;
                boolean zG = uz0.g(ld0Var.q0(), "waiting");
                if (ld0Var.l() != null) {
                    ks1 ks1VarL = ld0Var.l();
                    ks1VarL.getClass();
                    int i = nd0.a;
                    if (ks1VarL != ks1.i ? f <= 30.0f || f > 90.0f : f > 30.0f) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (t72Var.h || (zG && z)) {
                    z2 = true;
                }
                t72Var.h = z2;
                return Boolean.valueOf(!z2);
            default:
                qz2 qz2Var = (qz2) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zG2 = qz2Var.g();
                ju1 ju1Var = qz2Var.h;
                if (!zG2) {
                    if (ju1Var.g() == Long.MIN_VALUE) {
                        ju1Var.h(jLongValue);
                        ((lu1) qz2Var.a.a).setValue(Boolean.TRUE);
                    }
                    long jG = jLongValue - ju1Var.g();
                    if (f != 0.0f) {
                        jG = ie1.y(jG / ((double) f));
                    }
                    qz2Var.n(jG);
                    qz2Var.h(jG, f == 0.0f);
                }
                return j23.a;
        }
    }

    public /* synthetic */ cd0(qz2 qz2Var, float f) {
        this.j = qz2Var;
        this.i = f;
    }
}
