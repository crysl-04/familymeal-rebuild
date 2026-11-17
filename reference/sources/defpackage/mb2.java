package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mb2 implements d51, Serializable {
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(mb2.class, Object.class, "i");
    public volatile kp0 h;
    public volatile Object i;

    @Override // defpackage.d51
    public final Object getValue() {
        Object obj = this.i;
        vz1 vz1Var = vz1.y;
        if (obj != vz1Var) {
            return obj;
        }
        kp0 kp0Var = this.h;
        if (kp0Var != null) {
            Object objA = kp0Var.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vz1Var, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != vz1Var) {
                }
            }
            this.h = null;
            return objA;
        }
        return this.i;
    }

    public final String toString() {
        return this.i != vz1.y ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
