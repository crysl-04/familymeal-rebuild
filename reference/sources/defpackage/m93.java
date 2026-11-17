package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m93 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ m93(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                return new ny0(((long) ((cm) obj3).a(0, (int) (((vy0) obj).a & 4294967295L))) & 4294967295L);
            default:
                return new ny0(((dm) obj3).a(0L, ((vy0) obj).a, (u31) obj2));
        }
    }
}
