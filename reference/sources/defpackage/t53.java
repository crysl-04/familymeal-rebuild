package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t53 extends iw {
    public final zs0 n;
    public final Runtime o;

    public t53(zs0 zs0Var, Runtime runtime) {
        super(zs0Var, runtime);
        this.n = zs0Var;
        this.o = runtime;
    }

    @Override // defpackage.iw, defpackage.dl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof t53)) {
            return false;
        }
        t53 t53Var = (t53) obj;
        return this.n.equals(t53Var.n) && Objects.equals(this.o, t53Var.o);
    }

    @Override // defpackage.iw, defpackage.dl
    public final int hashCode() {
        return Objects.hash(this.n, this.o) + (super.hashCode() * 31);
    }

    @Override // defpackage.dl
    public final String toString() {
        return wi0.h(super.toString(), " ", this.n.toString());
    }
}
