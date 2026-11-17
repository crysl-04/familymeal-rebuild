package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class on2 extends v0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.v0
    public final boolean a(u0 u0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(h7.W);
        return true;
    }

    @Override // defpackage.v0
    public final m10[] b(u0 u0Var) {
        this.a.set(null);
        return tz0.a;
    }
}
