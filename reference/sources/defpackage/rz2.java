package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rz2 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ qz2 i;

    public /* synthetic */ rz2(qz2 qz2Var, byte b) {
        this.h = b;
        this.i = qz2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        qz2 qz2Var = this.i;
        switch (b) {
            case 0:
                return new sz2(qz2Var, (byte) 1);
            default:
                return new sz2(qz2Var, (byte) 0);
        }
    }
}
