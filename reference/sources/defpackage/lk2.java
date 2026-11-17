package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lk2 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ u72 i;
    public final /* synthetic */ ss2 j;

    public /* synthetic */ lk2(u72 u72Var, ss2 ss2Var, byte b) {
        this.h = b;
        this.i = u72Var;
        this.j = ss2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        ss2 ss2Var = this.j;
        u72 u72Var = this.i;
        float fFloatValue = ((Float) obj).floatValue();
        switch (b) {
            case 0:
                float f = u72Var.h - fFloatValue;
                u72Var.h = f;
                ss2Var.h(Float.valueOf(f));
                break;
            default:
                float f2 = u72Var.h - fFloatValue;
                u72Var.h = f2;
                ss2Var.h(Float.valueOf(f2));
                break;
        }
        return j23Var;
    }
}
