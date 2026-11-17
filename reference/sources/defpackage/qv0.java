package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qv0 implements cd {
    public final ee0 a;

    public qv0(ee0 ee0Var) {
        this.a = ee0Var;
        if (ee0Var instanceof q03) {
            q03 q03Var = (q03) ee0Var;
            if (q03Var.a != 0 || q03Var.b != 0) {
                return;
            }
        } else if (ee0Var instanceof tk2) {
            if (((tk2) ee0Var).a != 0) {
                return;
            }
        } else if (!(ee0Var instanceof g31) || ((g31) ee0Var).a.a != 0) {
            return;
        }
        wg.m("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.cd
    public final o33 a(s03 s03Var) {
        return new t33(this.a.a(s03Var));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qv0) && ((qv0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return (l82.h.hashCode() + (this.a.hashCode() * 31)) * 31;
    }
}
