package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo0 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ jo0 i;
    public final /* synthetic */ Bundle j;

    public /* synthetic */ fo0(jo0 jo0Var, Bundle bundle, byte b) {
        this.h = b;
        this.i = jo0Var;
        this.j = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        Bundle bundle = this.j;
        jo0 jo0Var = this.i;
        switch (b) {
            case 0:
                jo0Var.v(bundle);
                break;
            default:
                jo0Var.B(bundle);
                break;
        }
    }
}
