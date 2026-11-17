package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h00 implements nh2 {
    public final AtomicReference a;

    public h00(nh2 nh2Var) {
        this.a = new AtomicReference(nh2Var);
    }

    @Override // defpackage.nh2
    public final Iterator iterator() {
        nh2 nh2Var = (nh2) this.a.getAndSet(null);
        if (nh2Var != null) {
            return nh2Var.iterator();
        }
        li1.g("This sequence can be consumed only once.");
        return null;
    }
}
