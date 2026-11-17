package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class bj2 {
    public int[] h = s60.j;
    public Object[] i = s60.l;
    public int j;

    public final int a(Object obj) {
        int i = this.j << 1;
        Object[] objArr = this.i;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i, Object obj) {
        int i2 = this.j;
        if (i2 == 0) {
            return -1;
        }
        int iH = s60.h(i2, i, this.h);
        if (iH < 0 || uz0.g(obj, this.i[iH << 1])) {
            return iH;
        }
        int i3 = iH + 1;
        while (i3 < i2 && this.h[i3] == i) {
            if (uz0.g(obj, this.i[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iH - 1; i4 >= 0 && this.h[i4] == i; i4--) {
            if (uz0.g(obj, this.i[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        int i = this.j;
        if (i > 0) {
            this.h = s60.j;
            this.i = s60.l;
            i = 0;
            this.j = 0;
        }
        if (i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i = this.j;
        if (i == 0) {
            return -1;
        }
        int iH = s60.h(i, 0, this.h);
        if (iH < 0 || this.i[iH << 1] == null) {
            return iH;
        }
        int i2 = iH + 1;
        while (i2 < i && this.h[i2] == 0) {
            if (this.i[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iH - 1; i3 >= 0 && this.h[i3] == 0; i3--) {
            if (this.i[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.j) {
            z = true;
        }
        if (z) {
            return this.i[i << 1];
        }
        wg.m(jp1.h(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof bj2) {
                int i = this.j;
                if (i != ((bj2) obj).j) {
                    return false;
                }
                bj2 bj2Var = (bj2) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objE = e(i2);
                    Object objH = h(i2);
                    Object obj2 = bj2Var.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !bj2Var.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objH.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.j != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.j;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objE2 = e(i4);
                Object objH2 = h(i4);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objH2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.j)) {
            wg.m(jp1.h(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.i;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.h;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                gi.O(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.i;
                gi.Q(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.i;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.h = Arrays.copyOf(iArr, i7);
            this.i = Arrays.copyOf(this.i, i7 << 1);
            if (i2 != this.j) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                gi.O(0, 0, i, iArr, this.h);
                gi.Q(objArr, this.i, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                gi.O(i, i8, i2, iArr, this.h);
                gi.Q(objArr, this.i, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.j) {
            throw new ConcurrentModificationException();
        }
        this.j = i4;
        return obj;
    }

    public final Object g(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.j) {
            z = true;
        }
        if (!z) {
            wg.m(jp1.h(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.i[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.i[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.j) {
            z = true;
        }
        if (z) {
            return this.i[(i << 1) + 1];
        }
        wg.m(jp1.h(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.h;
        Object[] objArr = this.i;
        int i = this.j;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += iArr[i3] ^ (obj != null ? obj.hashCode() : 0);
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.j <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int iD;
        int iHashCode;
        int i = this.j;
        if (obj != null) {
            iHashCode = obj.hashCode();
            iD = b(iHashCode, obj);
        } else {
            iD = d();
            iHashCode = 0;
        }
        if (iD >= 0) {
            int i2 = (iD << 1) + 1;
            Object[] objArr = this.i;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iD;
        int[] iArr = this.h;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.h = Arrays.copyOf(iArr, i4);
            this.i = Arrays.copyOf(this.i, i4 << 1);
            if (i != this.j) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.h;
            int i5 = i3 + 1;
            gi.O(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.i;
            gi.Q(objArr2, objArr2, i5 << 1, i3 << 1, this.j << 1);
        }
        int i6 = this.j;
        if (i == i6) {
            int[] iArr3 = this.h;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.i;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.j = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !uz0.g(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !uz0.g(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }

    public final int size() {
        return this.j;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.j * 28);
        sb.append('{');
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objE = e(i2);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i2);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
        }
        return null;
    }
}
