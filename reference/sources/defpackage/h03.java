package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h03 extends f03 {
    public final ix1 k;

    public h03(ix1 ix1Var) {
        this.k = ix1Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.j;
        this.j = i + 2;
        Object[] objArr = this.h;
        return new zi1(this.k, objArr[i], objArr[i + 1]);
    }
}
