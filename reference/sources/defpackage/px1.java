package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class px1 extends d0 {
    public final Object[] j;
    public final d03 k;

    public px1(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.j = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.k = new d03(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wg.p();
            return null;
        }
        d03 d03Var = this.k;
        if (d03Var.hasNext()) {
            this.h++;
            return d03Var.next();
        }
        int i = this.h;
        this.h = i + 1;
        return this.j[i - d03Var.i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            wg.p();
            return null;
        }
        int i = this.h;
        d03 d03Var = this.k;
        int i2 = d03Var.i;
        if (i <= i2) {
            this.h = i - 1;
            return d03Var.previous();
        }
        int i3 = i - 1;
        this.h = i3;
        return this.j[i3 - i2];
    }
}
