package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qx1 extends d0 {
    public final ox1 j;
    public int k;
    public d03 l;
    public int m;

    public qx1(ox1 ox1Var, int i) {
        super(i, ox1Var.o);
        this.j = ox1Var;
        this.k = ox1Var.e();
        this.m = -1;
        b();
    }

    public final void a() {
        if (this.k != this.j.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.d0, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.h;
        ox1 ox1Var = this.j;
        ox1Var.add(i, obj);
        this.h++;
        this.i = ox1Var.a();
        this.k = ox1Var.e();
        this.m = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        ox1 ox1Var = this.j;
        Object[] objArr = ox1Var.m;
        if (objArr == null) {
            this.l = null;
            return;
        }
        int i = (ox1Var.o - 1) & (-32);
        int i2 = this.h;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (ox1Var.k / 5) + 1;
        d03 d03Var = this.l;
        if (d03Var == null) {
            this.l = new d03(objArr, i2, i, i3);
            return;
        }
        d03Var.h = i2;
        d03Var.i = i;
        d03Var.j = i3;
        Object[] objArr2 = d03Var.k;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            d03Var.k = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        d03Var.l = r0;
        d03Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            wg.p();
            return null;
        }
        int i = this.h;
        this.m = i;
        d03 d03Var = this.l;
        ox1 ox1Var = this.j;
        if (d03Var == null) {
            Object[] objArr = ox1Var.n;
            this.h = i + 1;
            return objArr[i];
        }
        if (d03Var.hasNext()) {
            this.h++;
            return d03Var.next();
        }
        Object[] objArr2 = ox1Var.n;
        int i2 = this.h;
        this.h = i2 + 1;
        return objArr2[i2 - d03Var.i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            wg.p();
            return null;
        }
        int i = this.h;
        this.m = i - 1;
        d03 d03Var = this.l;
        ox1 ox1Var = this.j;
        if (d03Var == null) {
            Object[] objArr = ox1Var.n;
            int i2 = i - 1;
            this.h = i2;
            return objArr[i2];
        }
        int i3 = d03Var.i;
        if (i <= i3) {
            this.h = i - 1;
            return d03Var.previous();
        }
        Object[] objArr2 = ox1Var.n;
        int i4 = i - 1;
        this.h = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.d0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.m;
        if (i == -1) {
            throw new IllegalStateException();
        }
        ox1 ox1Var = this.j;
        ox1Var.b(i);
        int i2 = this.m;
        if (i2 < this.h) {
            this.h = i2;
        }
        this.i = ox1Var.a();
        this.k = ox1Var.e();
        this.m = -1;
        b();
    }

    @Override // defpackage.d0, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.m;
        if (i == -1) {
            throw new IllegalStateException();
        }
        ox1 ox1Var = this.j;
        ox1Var.set(i, obj);
        this.k = ox1Var.e();
        b();
    }
}
