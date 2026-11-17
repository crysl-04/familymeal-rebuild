package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wd1 implements Map, Serializable, n21 {
    public static final wd1 u;
    public Object[] h;
    public Object[] i;
    public int[] j;
    public int[] k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public xd1 q;
    public yd1 r;
    public xd1 s;
    public boolean t;

    static {
        wd1 wd1Var = new wd1(0);
        wd1Var.t = true;
        u = wd1Var;
    }

    public wd1(int i) {
        if (i < 0) {
            wg.m("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.h = objArr;
        this.i = null;
        this.j = iArr;
        this.k = new int[iHighestOneBit];
        this.l = 2;
        this.m = 0;
        this.n = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.l << 1;
            int length = this.k.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.k;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.m;
                    Object[] objArr = this.h;
                    if (i5 >= objArr.length) {
                        f(1);
                        break;
                    }
                    int i6 = i5 + 1;
                    this.m = i6;
                    objArr[i5] = obj;
                    this.j[i5] = i;
                    iArr[i] = i6;
                    this.p++;
                    this.o++;
                    if (i3 > this.l) {
                        this.l = i3;
                    }
                    return i5;
                }
                if (uz0.g(this.h[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > i2) {
                    k(this.k.length << 1);
                    break;
                }
                i = i == 0 ? this.k.length - 1 : i - 1;
            }
        }
    }

    public final wd1 b() {
        c();
        this.t = true;
        if (this.p > 0) {
            return this;
        }
        wd1 wd1Var = u;
        wd1Var.getClass();
        return wd1Var;
    }

    public final void c() {
        if (this.t) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.m - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.j;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.k[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        dt.P(this.h, 0, this.m);
        Object[] objArr = this.i;
        if (objArr != null) {
            dt.P(objArr, 0, this.m);
        }
        this.p = 0;
        this.m = 0;
        this.o++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.m;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.j;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.h;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.k[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        dt.P(this.h, i3, i);
        if (objArr != null) {
            dt.P(objArr, i3, this.m);
        }
        this.m = i3;
    }

    public final boolean e(Collection collection) {
        boolean zG;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = g(entry.getKey());
                    if (iG < 0) {
                        zG = false;
                    } else {
                        Object[] objArr = this.i;
                        objArr.getClass();
                        zG = uz0.g(objArr[iG], entry.getValue());
                    }
                    if (!zG) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        xd1 xd1Var = this.s;
        if (xd1Var != null) {
            return xd1Var;
        }
        xd1 xd1Var2 = new xd1(this, (byte) 0);
        this.s = xd1Var2;
        return xd1Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.p == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.h;
        int length = objArr.length;
        int i2 = this.m;
        int i3 = length - i2;
        int i4 = i2 - this.p;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.h = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.i;
            this.i = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.j = Arrays.copyOf(this.j, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.k.length) {
                k(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.l;
        while (true) {
            int i3 = this.k[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (uz0.g(this.h[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.k.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.i;
        objArr.getClass();
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.m;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.j[i] >= 0) {
                Object[] objArr = this.i;
                objArr.getClass();
                if (uz0.g(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        td1 td1Var = new td1(this, (byte) 0);
        int i = 0;
        while (td1Var.hasNext()) {
            int i2 = td1Var.h;
            wd1 wd1Var = (wd1) td1Var.k;
            if (i2 >= wd1Var.m) {
                wg.p();
                return 0;
            }
            td1Var.h = i2 + 1;
            td1Var.i = i2;
            Object obj = wd1Var.h[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = wd1Var.i;
            objArr.getClass();
            Object obj2 = objArr[td1Var.i];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            td1Var.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.n;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.p == 0;
    }

    public final void k(int i) {
        int[] iArr;
        this.o++;
        int i2 = 0;
        if (this.m > this.p) {
            d(false);
        }
        this.k = new int[i];
        this.n = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.m) {
            int i3 = i2 + 1;
            int i4 = i(this.h[i2]);
            int i5 = this.l;
            while (true) {
                iArr = this.k;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    li1.g("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                i4 = i4 == 0 ? iArr.length - 1 : i4 - 1;
            }
            iArr[i4] = i3;
            this.j[i2] = i4;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        xd1 xd1Var = this.q;
        if (xd1Var != null) {
            return xd1Var;
        }
        xd1 xd1Var2 = new xd1(this, (byte) 1);
        this.q = xd1Var2;
        return xd1Var2;
    }

    public final void l(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        Object[] objArr = this.h;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.i;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.j[i];
        loop0: while (true) {
            int i5 = length;
            int i6 = 0;
            do {
                length = length == 0 ? this.k.length - 1 : length - 1;
                int[] iArr2 = this.k;
                i2 = iArr2[length];
                i6++;
                if (i6 > this.l) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    i4 = i(this.h[i3]) - length;
                    iArr = this.k;
                }
            } while ((i4 & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.j[i3] = i5;
        }
        this.j[i] = -1;
        this.p--;
        this.o++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.i;
        if (objArr == null) {
            int length = this.h.length;
            if (length < 0) {
                wg.m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.i = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.i;
            if (objArr == null) {
                int length = this.h.length;
                if (length < 0) {
                    wg.m("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.i = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!uz0.g(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.i;
        objArr.getClass();
        Object obj2 = objArr[iG];
        l(iG);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.p * 3) + 2);
        sb.append("{");
        int i = 0;
        td1 td1Var = new td1(this, (byte) 0);
        while (td1Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = td1Var.h;
            wd1 wd1Var = (wd1) td1Var.k;
            if (i2 >= wd1Var.m) {
                wg.p();
                return null;
            }
            td1Var.h = i2 + 1;
            td1Var.i = i2;
            Object obj = wd1Var.h[i2];
            if (obj == wd1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = wd1Var.i;
            objArr.getClass();
            Object obj2 = objArr[td1Var.i];
            if (obj2 == wd1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            td1Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        yd1 yd1Var = this.r;
        if (yd1Var != null) {
            return yd1Var;
        }
        yd1 yd1Var2 = new yd1(this, (byte) 0);
        this.r = yd1Var2;
        return yd1Var2;
    }

    public wd1() {
        this(8);
    }
}
