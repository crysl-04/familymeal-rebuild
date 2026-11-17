package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tg0 extends m31 implements vp0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ kp0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(kp0 kp0Var, boolean z) {
        super(1);
        this.i = z;
        this.j = kp0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        ((j92) obj).g(!this.i && ((Boolean) this.j.a()).booleanValue());
        return j23.a;
    }
}
