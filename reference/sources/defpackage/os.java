package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class os extends qf2 {
    public final fp g;
    public final /* synthetic */ AtomicReferenceArray h;

    public os(long j, os osVar, fp fpVar, int i) {
        super(j, osVar, i);
        this.g = fpVar;
        this.h = new AtomicReferenceArray(hp.b << 1);
    }

    @Override // defpackage.qf2
    public final int f() {
        return hp.b;
    }

    @Override // defpackage.qf2
    public final void g(int i, o20 o20Var) {
        fp fpVar;
        int i2 = hp.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i << 1);
        while (true) {
            Object objK = k(i);
            boolean z2 = objK instanceof x53;
            fpVar = this.g;
            if (z2 || (objK instanceof y53)) {
                if (j(i, objK, z ? hp.j : hp.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        fpVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objK == hp.j || objK == hp.k) {
                    break;
                }
                if (objK != hp.g && objK != hp.f) {
                    if (objK == hp.i || objK == hp.d || objK == hp.l) {
                        return;
                    }
                    wg.h(objK, "unexpected state: ");
                    return;
                }
            }
        }
        m(i, null);
        if (z) {
            fpVar.getClass();
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i << 1) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.h.get((i << 1) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            fp fpVar = this.g;
            fpVar.getClass();
            fpVar.I((this.d * ((long) hp.b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.h.set(i << 1, obj);
    }

    public final void n(int i, qf0 qf0Var) {
        this.h.set((i << 1) + 1, qf0Var);
    }
}
