package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p23 implements d51, Serializable {
    public kp0 h;
    public Object i;

    @Override // defpackage.d51
    public final Object getValue() {
        Object obj = this.i;
        if (obj != vz1.y) {
            return obj;
        }
        kp0 kp0Var = this.h;
        kp0Var.getClass();
        Object objA = kp0Var.a();
        this.i = objA;
        this.h = null;
        return objA;
    }

    public final String toString() {
        return this.i != vz1.y ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
