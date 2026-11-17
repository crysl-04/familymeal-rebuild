package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih1 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ fp i;

    public /* synthetic */ ih1(fp fpVar, byte b) {
        this.h = b;
        this.i = fpVar;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        fp fpVar = this.i;
        switch (b) {
            case 0:
                Object objQ = fpVar.q();
                return (jh1) (objQ instanceof ns ? null : objQ);
            default:
                Object objQ2 = fpVar.q();
                return (xy2) (objQ2 instanceof ns ? null : objQ2);
        }
    }
}
