package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lk1 {
    public final AtomicReference a = new AtomicReference(null);
    public final ok1 b = new ok1();

    public final void a(gk1 gk1Var) {
        while (true) {
            AtomicReference atomicReference = this.a;
            gk1 gk1Var2 = (gk1) atomicReference.get();
            if (gk1Var2 != null && gk1Var.a.compareTo(gk1Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(gk1Var2, gk1Var)) {
                    if (gk1Var2 != null) {
                        gk1Var2.b.a(new wj0("Mutation interrupted", (byte) 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == gk1Var2);
        }
    }
}
