package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class qo2 extends wg1 {
    public final kp0 h;

    public qo2(kp0 kp0Var) {
        this.h = kp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qo2) {
            return this.h == ((qo2) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new ro2(this.h);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((ro2) qg1Var).x = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
