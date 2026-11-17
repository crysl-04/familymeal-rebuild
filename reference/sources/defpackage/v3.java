package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v3 implements n3 {
    public final /* synthetic */ Object a;

    public /* synthetic */ v3(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.n3
    public final void a(Object obj) {
        ((vp0) ((sj1) this.a).getValue()).h(obj);
    }

    public final void b() {
        zp0 zp0Var = (zp0) this.a;
        synchronized (bl2.c) {
            List list = bl2.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(ev.o0(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && uz0.g(obj, zp0Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            bl2.h = arrayList;
        }
    }
}
