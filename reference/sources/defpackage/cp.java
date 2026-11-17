package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cp extends d0 {
    public final /* synthetic */ byte j = 1;
    public final Object k;

    public cp(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.k = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                if (!hasNext()) {
                    wg.p();
                    return null;
                }
                Object[] objArr = (Object[]) this.k;
                int i = this.h;
                this.h = i + 1;
                return objArr[i];
            default:
                if (hasNext()) {
                    this.h++;
                    return this.k;
                }
                wg.p();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.j) {
            case 0:
                if (!hasPrevious()) {
                    wg.p();
                    return null;
                }
                Object[] objArr = (Object[]) this.k;
                int i = this.h - 1;
                this.h = i;
                return objArr[i];
            default:
                if (hasPrevious()) {
                    this.h--;
                    return this.k;
                }
                wg.p();
                return null;
        }
    }

    public cp(int i, Object obj) {
        super(i, 1);
        this.k = obj;
    }
}
