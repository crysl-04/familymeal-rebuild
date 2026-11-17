package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zk1 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Bundle i;

    public /* synthetic */ zk1(Bundle bundle, byte b) {
        this.h = b;
        this.i = bundle;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        boolean zContainsKey;
        byte b = this.h;
        Bundle bundle = this.i;
        String str = (String) obj;
        switch (b) {
            case 0:
                str.getClass();
                zContainsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                zContainsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
