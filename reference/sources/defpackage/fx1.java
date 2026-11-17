package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class fx1 implements Iterator, l21 {
    public final f03[] h;
    public int i;
    public boolean j = true;

    public fx1(e03 e03Var, f03[] f03VarArr) {
        this.h = f03VarArr;
        f03VarArr[0].a(e03Var.d, Integer.bitCount(e03Var.a) << 1, 0);
        this.i = 0;
        a();
    }

    public final void a() {
        int i = this.i;
        f03[] f03VarArr = this.h;
        f03 f03Var = f03VarArr[i];
        if (f03Var.j < f03Var.i) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                f03 f03Var2 = f03VarArr[i];
                int i2 = f03Var2.j;
                Object[] objArr = f03Var2.h;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    f03Var2.j = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.i = iB;
                return;
            }
            if (i > 0) {
                f03 f03Var3 = f03VarArr[i - 1];
                int i3 = f03Var3.j;
                int length2 = f03Var3.h.length;
                f03Var3.j = i3 + 1;
            }
            f03VarArr[i].a(e03.e.d, 0, 0);
            i--;
        }
        this.j = false;
    }

    public final int b(int i) {
        f03[] f03VarArr = this.h;
        f03 f03Var = f03VarArr[i];
        int i2 = f03Var.j;
        if (i2 < f03Var.i) {
            return i;
        }
        Object[] objArr = f03Var.h;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        e03 e03Var = (e03) obj;
        if (i == 6) {
            f03 f03Var2 = f03VarArr[i + 1];
            Object[] objArr2 = e03Var.d;
            f03Var2.a(objArr2, objArr2.length, 0);
        } else {
            f03VarArr[i + 1].a(e03Var.d, Integer.bitCount(e03Var.a) << 1, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.j) {
            wg.p();
            return null;
        }
        Object next = this.h[this.i].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
