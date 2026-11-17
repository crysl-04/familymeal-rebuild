package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m51 extends f42 implements p21 {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m51(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.o = b;
    }

    @Override // defpackage.kp0
    public final Object a() {
        return get();
    }

    @Override // defpackage.kq
    public final k21 d() {
        z72.a.getClass();
        return this;
    }

    @Override // defpackage.p21
    public final Object get() {
        byte b = this.o;
        Object obj = this.i;
        switch (b) {
            case 0:
                return ((kn2) obj).getValue();
            case 1:
                return ((kn2) obj).getValue();
            case 2:
                return obj.getClass().getSimpleName();
            case 3:
                return ((kn2) obj).getValue();
            default:
                return ((kn2) obj).getValue();
        }
    }
}
