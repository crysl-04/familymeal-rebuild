package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
final class j81 extends wg1 {
    public final c9 h;
    public final p81 i;
    public final kv2 j;

    public j81(c9 c9Var, p81 p81Var, kv2 kv2Var) {
        this.h = c9Var;
        this.i = p81Var;
        this.j = kv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j81) {
            j81 j81Var = (j81) obj;
            return uz0.g(this.h, j81Var.h) && this.i == j81Var.i && this.j == j81Var.j;
        }
        return false;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new k81(this.h, this.i, this.j);
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        k81 k81Var = (k81) qg1Var;
        if (k81Var.u) {
            k81Var.v.f();
            k81Var.v.k(k81Var);
        }
        c9 c9Var = this.h;
        k81Var.v = c9Var;
        if (k81Var.u) {
            if (c9Var.a != null) {
                dx0.c("Expected textInputModifierNode to be null");
            }
            c9Var.a = k81Var;
        }
        k81Var.w = this.i;
        k81Var.x = this.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.h + ", legacyTextFieldState=" + this.i + ", textFieldSelectionManager=" + this.j + ")";
    }
}
