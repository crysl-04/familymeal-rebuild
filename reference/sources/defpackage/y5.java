package defpackage;

import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y5 implements ri {
    public final t6 a;
    public final vi b;
    public final AutofillId c;

    public y5(t6 t6Var, vi viVar) {
        this.a = t6Var;
        this.b = viVar;
        t6Var.setImportantForAutofill(1);
        AutofillId autofillId = t6Var.getAutofillId();
        if (autofillId == null) {
            throw wi0.e("Required value was null.");
        }
        this.c = autofillId;
    }
}
