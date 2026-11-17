package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gb2 implements m10, z20 {
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(gb2.class, Object.class, "result");
    public final m10 h;
    private volatile Object result;

    public gb2(m10 m10Var) {
        y20 y20Var = y20.h;
        this.h = m10Var;
        this.result = y20Var;
    }

    @Override // defpackage.z20
    public final z20 d() {
        m10 m10Var = this.h;
        if (m10Var instanceof z20) {
            return (z20) m10Var;
        }
        return null;
    }

    @Override // defpackage.m10
    public final o20 e() {
        return this.h.e();
    }

    @Override // defpackage.m10
    public final void g(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        while (true) {
            Object obj2 = this.result;
            y20 y20Var = y20.i;
            if (obj2 == y20Var) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, y20Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != y20Var) {
                    }
                }
                return;
            }
            y20 y20Var2 = y20.h;
            if (obj2 != y20Var2) {
                li1.g("Already resumed");
                return;
            }
            y20 y20Var3 = y20.j;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, y20Var2, y20Var3)) {
                    this.h.g(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == y20Var2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.h;
    }
}
