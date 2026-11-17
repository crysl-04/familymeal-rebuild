package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jk2 extends h0 {
    public static final jk2 i = new jk2(new Object[0]);
    public final Object[] h;

    public jk2(Object[] objArr) {
        this.h = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.q
    public final int a() {
        return this.h.length;
    }

    @Override // defpackage.h0
    public final h0 b(int i2, Object obj) {
        Object[] objArr = this.h;
        lt.i(i2, objArr.length);
        if (i2 == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            gi.S(objArr, objArr2, 0, i2, 6);
            gi.Q(objArr, objArr2, i2 + 1, i2, objArr.length);
            objArr2[i2] = obj;
            return new jk2(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        gi.Q(objArr, objArrCopyOf, i2 + 1, i2, objArr.length - 1);
        objArrCopyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new nx1(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.h0
    public final h0 c(Object obj) {
        Object[] objArr = this.h;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new jk2(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new nx1(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.h0
    public final h0 d(Collection collection) {
        Object[] objArr = this.h;
        if (collection.size() + objArr.length > 32) {
            ox1 ox1VarE = e();
            ox1VarE.addAll(collection);
            return ox1VarE.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new jk2(objArrCopyOf);
    }

    @Override // defpackage.h0
    public final ox1 e() {
        return new ox1(this, null, this.h, 0);
    }

    @Override // defpackage.h0
    public final h0 f(g0 g0Var) {
        Object[] objArr = this.h;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj = objArr[i2];
            if (((Boolean) g0Var.h(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i2;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? i : new jk2(gi.T(objArrCopyOf, 0, length));
    }

    @Override // defpackage.h0
    public final h0 g(int i2) {
        Object[] objArr = this.h;
        lt.h(i2, objArr.length);
        if (objArr.length == 1) {
            return i;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        gi.Q(objArr, objArrCopyOf, i2, i2 + 1, objArr.length);
        return new jk2(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        lt.h(i2, a());
        return this.h[i2];
    }

    @Override // defpackage.h0
    public final h0 h(int i2, Object obj) {
        lt.h(i2, a());
        Object[] objArr = this.h;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i2] = obj;
        return new jk2(objArrCopyOf);
    }

    @Override // defpackage.c0, java.util.List
    public final int indexOf(Object obj) {
        return gi.Z(this.h, obj);
    }

    @Override // defpackage.c0, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.h;
        objArr.getClass();
        if (obj != null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (!obj.equals(objArr[length])) {
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    } else {
                        return length;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (objArr[length2] == null) {
                        return length2;
                    }
                    if (i3 >= 0) {
                        length2 = i3;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.c0, java.util.List
    public final ListIterator listIterator(int i2) {
        Object[] objArr = this.h;
        lt.i(i2, objArr.length);
        return new cp(objArr, i2, objArr.length);
    }
}
