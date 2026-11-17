package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ac extends m31 implements zp0 {
    public final /* synthetic */ wh0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(wh0 wh0Var) {
        super(2);
        this.i = wh0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        kg0 kg0Var = (kg0) obj;
        kg0 kg0Var2 = (kg0) obj2;
        kg0 kg0Var3 = kg0.j;
        return Boolean.valueOf(kg0Var == kg0Var3 && kg0Var2 == kg0Var3 && !this.i.a.e);
    }
}
