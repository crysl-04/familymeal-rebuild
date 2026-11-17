package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends ie1 {
    public final AtomicReferenceFieldUpdater A0;
    public final AtomicReferenceFieldUpdater B0;
    public final AtomicReferenceFieldUpdater C0;
    public final AtomicReferenceFieldUpdater y0;
    public final AtomicReferenceFieldUpdater z0;

    public m0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.y0 = atomicReferenceFieldUpdater;
        this.z0 = atomicReferenceFieldUpdater2;
        this.A0 = atomicReferenceFieldUpdater3;
        this.B0 = atomicReferenceFieldUpdater4;
        this.C0 = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.ie1
    public final boolean g(p0 p0Var, l0 l0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.B0;
            if (atomicReferenceFieldUpdater.compareAndSet(p0Var, l0Var, l0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p0Var) == l0Var);
        return false;
    }

    @Override // defpackage.ie1
    public final boolean h(p0 p0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.C0;
            if (atomicReferenceFieldUpdater.compareAndSet(p0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p0Var) == obj);
        return false;
    }

    @Override // defpackage.ie1
    public final boolean i(p0 p0Var, o0 o0Var, o0 o0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.A0;
            if (atomicReferenceFieldUpdater.compareAndSet(p0Var, o0Var, o0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p0Var) == o0Var);
        return false;
    }

    @Override // defpackage.ie1
    public final void t(o0 o0Var, o0 o0Var2) {
        this.z0.lazySet(o0Var, o0Var2);
    }

    @Override // defpackage.ie1
    public final void u(o0 o0Var, Thread thread) {
        this.y0.lazySet(o0Var, thread);
    }
}
