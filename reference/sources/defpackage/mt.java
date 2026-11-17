package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ dh2 i;

    public /* synthetic */ mt(dh2 dh2Var, byte b) {
        this.h = b;
        this.i = dh2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        Boolean boolValueOf;
        byte b = this.h;
        boolean z = false;
        by2 by2Var = by2.i;
        by2 by2Var2 = by2.h;
        dh2 dh2Var = this.i;
        switch (b) {
            case 0:
                yz2 yz2Var = (yz2) obj;
                yz2Var.getClass();
                nu1 nu1Var = (nu1) yz2Var;
                nu1Var.w = true;
                nu1Var.v.h(dh2Var);
                y02.p(nu1Var);
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((m8) obj).a;
                boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        by2Var = by2Var2;
                    }
                    bh2.m(dh2Var, by2Var);
                    break;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = ((m8) obj).a;
                boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        by2Var = by2Var2;
                    }
                    bh2.m(dh2Var, by2Var);
                    break;
                }
                return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
