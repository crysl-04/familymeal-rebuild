package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d61 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;

    public /* synthetic */ d61(int i, byte b) {
        this.h = b;
        this.i = i;
    }

    @Override // defpackage.kp0
    public final Object a() {
        switch (this.h) {
            case 0:
                return new c61(this.i, 0);
            default:
                return new b81(this.i, 0);
        }
    }
}
