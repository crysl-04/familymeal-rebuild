package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z8 extends kq0 implements vp0 {
    public final /* synthetic */ k81 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(k81 k81Var) {
        super(1, tz0.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.o = k81Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        float[] fArr = ((ke1) obj).a;
        t31 t31Var = (t31) this.o.y.getValue();
        if (t31Var != null) {
            if (!t31Var.C()) {
                t31Var = null;
            }
            if (t31Var != null) {
                t31Var.E(fArr);
            }
        }
        return j23.a;
    }
}
