package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class tt2 extends wg1 {
    public final k42 h;
    public final dv2 i;
    public final ev2 j;
    public final a20 k;

    public tt2(k42 k42Var, dv2 dv2Var, ev2 ev2Var, a20 a20Var) {
        this.h = k42Var;
        this.i = dv2Var;
        this.j = ev2Var;
        this.k = a20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt2)) {
            return false;
        }
        tt2 tt2Var = (tt2) obj;
        return this.h == tt2Var.h && this.i == tt2Var.i && this.j == tt2Var.j && this.k == tt2Var.k;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new ut2(this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ut2 ut2Var = (ut2) qg1Var;
        ut2Var.x.i = null;
        k42 k42Var = this.h;
        ut2Var.x = k42Var;
        k42Var.i = ut2Var;
        k42Var.j = ut2Var.u ? gy2.j : gy2.i;
        ut2Var.y = this.i;
        ut2Var.z = this.j;
        ut2Var.A = this.k;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31)) * 31);
    }
}
