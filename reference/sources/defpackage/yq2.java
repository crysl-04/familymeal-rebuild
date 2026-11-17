package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yq2 implements d51, Serializable {
    public kp0 h;
    public volatile Object i = vz1.y;
    public final Object j = this;

    public yq2(kp0 kp0Var) {
        this.h = kp0Var;
    }

    @Override // defpackage.d51
    public final Object getValue() {
        Object objA;
        Object obj = this.i;
        vz1 vz1Var = vz1.y;
        if (obj != vz1Var) {
            return obj;
        }
        synchronized (this.j) {
            objA = this.i;
            if (objA == vz1Var) {
                kp0 kp0Var = this.h;
                kp0Var.getClass();
                objA = kp0Var.a();
                this.i = objA;
                this.h = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.i != vz1.y ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
