package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class nm0 extends wg1 {
    public final ui1 h;

    public nm0(ui1 ui1Var) {
        this.h = ui1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nm0) {
            return uz0.g(this.h, ((nm0) obj).h);
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new pm0(this.h, 1, null);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        ((pm0) qg1Var).O0(this.h);
    }

    public final int hashCode() {
        ui1 ui1Var = this.h;
        if (ui1Var != null) {
            return ui1Var.hashCode();
        }
        return 0;
    }
}
