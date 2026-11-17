package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oy implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oy(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((dn2) obj).a(null);
                break;
            default:
                kv2 kv2Var = (kv2) obj;
                if (kv2Var != null) {
                    p81 p81Var = kv2Var.d;
                    if (p81Var != null) {
                        p81Var.e(qw2.b);
                    }
                    p81 p81Var2 = kv2Var.d;
                    if (p81Var2 != null) {
                        p81Var2.f(qw2.b);
                    }
                }
                break;
        }
    }
}
