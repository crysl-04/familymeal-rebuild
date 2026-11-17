package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vh extends y22 {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh(je1 je1Var, byte b) {
        super(je1Var);
        this.l = b;
    }

    @Override // defpackage.li0
    public final mo2 p(int i) {
        switch (this.l) {
            case 0:
                return new wh(new float[i]);
            case 1:
                return xh.l2(i);
            case 2:
                return new ci(new byte[i]);
            case 3:
                return new di(new short[i]);
            case 4:
                return new ei(new int[i]);
            default:
                return new fi(new long[i]);
        }
    }
}
