package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tb2 implements qb2, dc2 {
    public final /* synthetic */ rb2 h;
    public h91 i;
    public k42 j;

    public tb2(rb2 rb2Var) {
        this.h = rb2Var;
        Object objE = rb2Var.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objE instanceof Bundle ? (Bundle) objE : null;
        if (bundle != null && this.j == null) {
            k42 k42Var = new k42(new cc2(this, new xu1(this, (byte) 6)), (byte) 3);
            this.j = k42Var;
            k42Var.f(bundle);
        }
        rb2Var.a("androidx.savedstate.SavedStateRegistry", new xu1(this, (byte) 4));
    }

    @Override // defpackage.qb2
    public final eg a(String str, kp0 kp0Var) {
        return this.h.a(str, kp0Var);
    }

    @Override // defpackage.dc2
    public final k42 b() {
        k42 k42Var = this.j;
        if (k42Var == null) {
            k42 k42Var2 = new k42(new cc2(this, new xu1(this, (byte) 6)), (byte) 3);
            this.j = k42Var2;
            k42Var2.f(null);
            k42Var = k42Var2;
        }
        return (k42) k42Var.j;
    }

    @Override // defpackage.qb2
    public final boolean c(Object obj) {
        return this.h.c(obj);
    }

    @Override // defpackage.qb2
    public final Map d() {
        return this.h.d();
    }

    @Override // defpackage.qb2
    public final Object e(String str) {
        return this.h.e(str);
    }

    @Override // defpackage.e91
    public final h91 g() {
        h91 h91Var = this.i;
        if (h91Var != null) {
            return h91Var;
        }
        h91 h91Var2 = new h91(this, false);
        this.i = h91Var2;
        return h91Var2;
    }
}
