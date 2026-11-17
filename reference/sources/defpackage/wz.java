package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wz implements c33 {
    public final vp0 a;

    public wz(vp0 vp0Var) {
        this.a = vp0Var;
    }

    @Override // defpackage.c33
    public final Object a(dx1 dx1Var) {
        return this.a.h(dx1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz) && uz0.g(this.a, ((wz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
