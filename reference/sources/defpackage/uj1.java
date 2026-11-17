package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uj1 implements RandomAccess {
    public Object[] h;
    public dj1 i;
    public int j = 0;

    public uj1(Object[] objArr) {
        this.h = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.j + 1;
        if (this.h.length < i2) {
            m(i2);
        }
        Object[] objArr = this.h;
        int i3 = this.j;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.j++;
    }

    public final void b(Object obj) {
        int i = this.j + 1;
        if (this.h.length < i) {
            m(i);
        }
        Object[] objArr = this.h;
        int i2 = this.j;
        objArr[i2] = obj;
        this.j = i2 + 1;
    }

    public final void c(int i, uj1 uj1Var) {
        int i2 = uj1Var.j;
        if (i2 == 0) {
            return;
        }
        int i3 = this.j + i2;
        if (this.h.length < i3) {
            m(i3);
        }
        Object[] objArr = this.h;
        int i4 = this.j;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(uj1Var.h, 0, objArr, i, i2);
        this.j += i2;
    }

    public final void d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.j + size;
        if (this.h.length < i2) {
            m(i2);
        }
        Object[] objArr = this.h;
        int i3 = this.j;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.j += size;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.j + size;
        if (this.h.length < i3) {
            m(i3);
        }
        Object[] objArr = this.h;
        int i4 = this.j;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                lt.h0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.j += size;
        return true;
    }

    public final List f() {
        dj1 dj1Var = this.i;
        if (dj1Var != null) {
            return dj1Var;
        }
        dj1 dj1Var2 = new dj1(this, (byte) 1);
        this.i = dj1Var2;
        return dj1Var2;
    }

    public final void g() {
        Object[] objArr = this.h;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.j = 0;
    }

    public final boolean h(Object obj) {
        int i = this.j - 1;
        if (i >= 0) {
            for (int i2 = 0; !uz0.g(this.h[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.h;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (uz0.g(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return false;
        }
        k(i);
        return true;
    }

    public final Object k(int i) {
        Object[] objArr = this.h;
        Object obj = objArr[i];
        int i2 = this.j;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.j - 1;
        this.j = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.j;
            if (i2 < i3) {
                Object[] objArr = this.h;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.j;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.h[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.j = i5;
        }
    }

    public final void m(int i) {
        Object[] objArr = this.h;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length << 1)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.h = objArr2;
    }
}
