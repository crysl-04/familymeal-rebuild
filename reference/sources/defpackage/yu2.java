package defpackage;

import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yu2 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ yu2(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                bv2 bv2Var = (bv2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                hu1 hu1Var = bv2Var.a;
                float fG = hu1Var.g() + fFloatValue;
                hu1 hu1Var2 = bv2Var.b;
                if (fG > hu1Var2.g()) {
                    fFloatValue = hu1Var2.g() - hu1Var.g();
                } else if (fG < 0.0f) {
                    fFloatValue = -hu1Var.g();
                }
                hu1Var.h(hu1Var.g() + fFloatValue);
                return Float.valueOf(fFloatValue);
            default:
                ((e30) obj).getClass();
                return new p63((kz1) ((MealPlannerApp) obj2).l.getValue());
        }
    }
}
