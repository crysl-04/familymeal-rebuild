package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hr2 extends wg1 {
    public final lu1 h;
    public final int i;
    public final zm2 j;

    public hr2(lu1 lu1Var, int i, zm2 zm2Var) {
        this.h = lu1Var;
        this.i = i;
        this.j = zm2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hr2) {
            hr2 hr2Var = (hr2) obj;
            if (this.h == hr2Var.h && this.i == hr2Var.i && this.j.equals(hr2Var.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        jr2 jr2Var = new jr2();
        jr2Var.v = this.h;
        jr2Var.w = this.i;
        jr2Var.x = true;
        jr2Var.y = this.j;
        return jr2Var;
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        jr2 jr2Var = (jr2) qg1Var;
        jr2Var.v = this.h;
        jr2Var.w = this.i;
        jr2Var.x = true;
        jr2Var.y = this.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((((Integer.hashCode(this.i) + (this.h.hashCode() * 31)) * 31) + 1231) * 31);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.h + ", selectedTabIndex=" + this.i + ", followContentSize=true, animationSpec=" + this.j + ')';
    }
}
