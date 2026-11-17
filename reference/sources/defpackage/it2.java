package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class it2 extends wg1 {
    public final cv2 h;

    public it2(cv2 cv2Var) {
        this.h = cv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof it2) {
            return this.h == ((it2) obj).h;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new kt2(this.h);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((kt2) qg1Var).x = this.h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
