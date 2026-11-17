package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d03 extends d0 {
    public int j;
    public Object[] k;
    public boolean l;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public d03(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.j = i3;
        Object[] objArr2 = new Object[i3];
        this.k = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.l = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.h & 31;
        Object obj = this.k[this.j - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.j - i2) * 5;
        while (i2 < this.j) {
            Object[] objArr = this.k;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[cy1.E(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (cy1.E(this.h, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.h, ((this.j - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wg.p();
            return null;
        }
        Object objA = a();
        int i = this.h + 1;
        this.h = i;
        if (i == this.i) {
            this.l = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            wg.p();
            return null;
        }
        this.h--;
        if (this.l) {
            this.l = false;
            return a();
        }
        c(31);
        return a();
    }
}
