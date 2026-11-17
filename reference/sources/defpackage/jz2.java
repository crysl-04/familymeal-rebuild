package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jz2 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ qz2 i;

    public /* synthetic */ jz2(qz2 qz2Var, byte b) {
        this.h = b;
        this.i = qz2Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        qz2 qz2Var = this.i;
        switch (b) {
            case 0:
                return Boolean.valueOf((uz0.g(qz2Var.d.getValue(), qz2Var.a.g()) && qz2Var.h.g() == Long.MIN_VALUE && !((Boolean) qz2Var.i.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(qz2Var.b());
        }
    }
}
