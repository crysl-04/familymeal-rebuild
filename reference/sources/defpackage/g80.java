package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g80 implements e53 {
    public static final g80 b = new g80(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ g80(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.e53
    public final z43 a(Class cls) {
        switch (this.a) {
            case 0:
                return vs.y(cls);
            case 1:
                return new ap0(true);
            default:
                return new mb1();
        }
    }
}
