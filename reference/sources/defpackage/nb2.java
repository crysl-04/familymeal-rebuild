package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nb2 implements h82 {
    public hc2 h;
    public qb2 i;
    public String j;
    public Object k;
    public Object[] l;
    public eg m;
    public final xu1 n = new xu1(this, 3);

    public nb2(hc2 hc2Var, qb2 qb2Var, String str, Object obj, Object[] objArr) {
        this.h = hc2Var;
        this.i = qb2Var;
        this.j = str;
        this.k = obj;
        this.l = objArr;
    }

    public final void a() throws PendingIntent.CanceledException {
        String strM;
        qb2 qb2Var = this.i;
        eg egVar = this.m;
        if (egVar != null) {
            li1.h("entry(", egVar, ") is not null");
            return;
        }
        if (qb2Var != null) {
            xu1 xu1Var = this.n;
            Object objA = xu1Var.a();
            if (objA == null || qb2Var.c(objA)) {
                this.m = qb2Var.a(this.j, xu1Var);
                return;
            }
            if (objA instanceof fl2) {
                fl2 fl2Var = (fl2) objA;
                if (fl2Var.d() == c5.f0 || fl2Var.d() == vz1.s || fl2Var.d() == vz1.k) {
                    strM = "MutableState containing " + fl2Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM = rz1.m(objA);
            }
            throw new IllegalArgumentException(strM);
        }
    }

    @Override // defpackage.h82
    public final void c() throws PendingIntent.CanceledException {
        a();
    }

    @Override // defpackage.h82
    public final void d() {
        eg egVar = this.m;
        if (egVar != null) {
            egVar.K();
        }
    }

    @Override // defpackage.h82
    public final void e() {
        eg egVar = this.m;
        if (egVar != null) {
            egVar.K();
        }
    }
}
