package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nq2 extends wg1 {
    public final Object h;
    public final Object i;
    public final PointerInputEventHandler j;

    public nq2(Object obj, zt2 zt2Var, PointerInputEventHandler pointerInputEventHandler, int i) {
        zt2Var = (i & 2) != 0 ? null : zt2Var;
        this.h = obj;
        this.i = zt2Var;
        this.j = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq2)) {
            return false;
        }
        nq2 nq2Var = (nq2) obj;
        return uz0.g(this.h, nq2Var.h) && uz0.g(this.i, nq2Var.i) && this.j == nq2Var.j;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new tq2(this.h, this.i, this.j);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        tq2 tq2Var = (tq2) qg1Var;
        Object obj = tq2Var.v;
        Object obj2 = this.h;
        boolean z = !uz0.g(obj, obj2);
        tq2Var.v = obj2;
        Object obj3 = tq2Var.w;
        Object obj4 = this.i;
        if (!uz0.g(obj3, obj4)) {
            z = true;
        }
        tq2Var.w = obj4;
        Class<?> cls = tq2Var.x.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.j;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            tq2Var.L0();
        }
        tq2Var.x = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.h;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.i;
        return this.j.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
