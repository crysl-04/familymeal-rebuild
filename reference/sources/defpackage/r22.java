package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class r22 implements a1, zj1 {
    @Override // defpackage.zj1
    public final void B(long j, Comparable comparable) {
        y(j, xo1.c1(comparable));
    }

    @Override // defpackage.a1
    public Comparable G(long j) {
        return Double.valueOf(z(j));
    }

    public final String toString() {
        return a1.V0(this);
    }
}
