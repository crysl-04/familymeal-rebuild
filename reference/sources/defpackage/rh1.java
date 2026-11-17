package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rh1 implements ze1 {
    public final qh1 a;

    public rh1(qh1 qh1Var) {
        this.a = qh1Var;
    }

    @Override // defpackage.ze1
    public final int a(nz0 nz0Var, List list, int i) {
        return this.a.a(nz0Var, ys.D(nz0Var), i);
    }

    @Override // defpackage.ze1
    public final int b(nz0 nz0Var, List list, int i) {
        return this.a.b(nz0Var, ys.D(nz0Var), i);
    }

    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        return this.a.c(bf1Var, ys.D(bf1Var), j);
    }

    @Override // defpackage.ze1
    public final int d(nz0 nz0Var, List list, int i) {
        return this.a.d(nz0Var, ys.D(nz0Var), i);
    }

    @Override // defpackage.ze1
    public final int e(nz0 nz0Var, List list, int i) {
        return this.a.e(nz0Var, ys.D(nz0Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh1) && uz0.g(this.a, ((rh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
