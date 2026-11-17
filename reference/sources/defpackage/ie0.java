package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 extends g42 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie0(kp0 kp0Var, byte b) {
        super(kp0Var);
        this.b = b;
    }

    @Override // defpackage.g42
    public final i42 a(Object obj) {
        switch (this.b) {
            case 0:
                return new i42(this, obj, obj == null, vz1.s, null, true);
            default:
                return new i42(this, obj, obj == null, null, null, false);
        }
    }
}
