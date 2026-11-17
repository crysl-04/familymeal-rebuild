package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ za i;
    public final /* synthetic */ gt2 j;

    public /* synthetic */ ta(za zaVar, gt2 gt2Var, byte b) {
        this.h = b;
        this.i = zaVar;
        this.j = gt2Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        gt2 gt2Var = this.j;
        za zaVar = this.i;
        byte b2 = 2;
        switch (b) {
            case 0:
                sa saVar = zaVar.f;
                o9 o9Var = new o9(gt2Var, b2);
                x72 x72Var = new x72();
                zaVar.e.d("dataBuilder", saVar, new h6(x72Var, o9Var, b2));
                Object obj = x72Var.h;
                if (obj != null) {
                    return (ft2) obj;
                }
                uz0.A("result");
                throw null;
            case 1:
                sa saVar2 = zaVar.g;
                ta taVar = new ta(zaVar, gt2Var, b2);
                x72 x72Var2 = new x72();
                zaVar.e.d("positioner", saVar2, new h6(x72Var2, taVar, b2));
                Object obj2 = x72Var2.h;
                if (obj2 != null) {
                    return (r72) obj2;
                }
                uz0.A("result");
                throw null;
            default:
                Object objA = zaVar.c.a();
                t31 t31Var = (t31) (((t31) objA).C() ? objA : null);
                return t31Var == null ? r72.e : gt2Var.o(t31Var).i(t31Var.S(0L));
        }
    }
}
