package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements a1 {
    public final /* synthetic */ Comparable[] h;

    public x0(Comparable[] comparableArr) {
        this.h = comparableArr;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        return xo1.c1(this.h[i]);
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        return this.h[Math.toIntExact(j)];
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.h.length;
    }

    public final String toString() {
        return a1.V0(this);
    }
}
