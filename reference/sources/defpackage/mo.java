package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class mo extends wg1 {
    public final oo h;

    public mo(oo ooVar) {
        this.h = ooVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mo) {
            return uz0.g(this.h, ((mo) obj).h);
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        po poVar = new po();
        poVar.v = this.h;
        return poVar;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        po poVar = (po) qg1Var;
        oo ooVar = poVar.v;
        if (ooVar != null) {
            ooVar.a.j(poVar);
        }
        oo ooVar2 = this.h;
        if (ooVar2 != null) {
            ooVar2.a.b(poVar);
        }
        poVar.v = ooVar2;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
