package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tc1 implements Cloneable {
    public /* synthetic */ boolean h;
    public /* synthetic */ long[] i;
    public /* synthetic */ Object[] j;
    public /* synthetic */ int k;

    public tc1(int i) {
        if (i == 0) {
            this.i = s60.k;
            this.j = s60.l;
            return;
        }
        int i2 = i << 3;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.i = new long[i5];
        this.j = new Object[i5];
    }

    public final Object a(long j) {
        Object obj;
        int i = s60.i(this.i, this.k, j);
        if (i < 0 || (obj = this.j[i]) == ie1.I) {
            return null;
        }
        return obj;
    }

    public final long b(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.k)) {
            wg.m(jp1.h(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.h) {
            long[] jArr = this.i;
            Object[] objArr = this.j;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ie1.I) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.h = false;
            this.k = i3;
        }
        return this.i[i];
    }

    public final void c(long j, Object obj) {
        Object obj2 = ie1.I;
        int i = s60.i(this.i, this.k, j);
        if (i >= 0) {
            this.j[i] = obj;
            return;
        }
        int i2 = ~i;
        int i3 = this.k;
        if (i2 < i3) {
            Object[] objArr = this.j;
            if (objArr[i2] == obj2) {
                this.i[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.h) {
            long[] jArr = this.i;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.j;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.h = false;
                this.k = i4;
                i2 = ~s60.i(this.i, i4, j);
            }
        }
        int i6 = this.k;
        if (i6 >= this.i.length) {
            int i7 = (i6 + 1) << 3;
            for (int i8 = 4; i8 < 32; i8++) {
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
            }
            int i10 = i7 / 8;
            this.i = Arrays.copyOf(this.i, i10);
            this.j = Arrays.copyOf(this.j, i10);
        }
        int i11 = this.k;
        if (i11 - i2 != 0) {
            long[] jArr2 = this.i;
            int i12 = i2 + 1;
            gi.P(jArr2, jArr2, i12, i2, i11);
            Object[] objArr3 = this.j;
            gi.Q(objArr3, objArr3, i12, i2, this.k);
        }
        this.i[i2] = j;
        this.j[i2] = obj;
        this.k++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        tc1 tc1Var = (tc1) objClone;
        tc1Var.i = (long[]) this.i.clone();
        tc1Var.j = (Object[]) this.j.clone();
        return tc1Var;
    }

    public final void d(long j) {
        int i = s60.i(this.i, this.k, j);
        if (i >= 0) {
            Object[] objArr = this.j;
            Object obj = objArr[i];
            Object obj2 = ie1.I;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.h = true;
            }
        }
    }

    public final int e() {
        if (this.h) {
            int i = this.k;
            long[] jArr = this.i;
            Object[] objArr = this.j;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ie1.I) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.h = false;
            this.k = i2;
        }
        return this.k;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.k)) {
            wg.m(jp1.h(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.h) {
            long[] jArr = this.i;
            Object[] objArr = this.j;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ie1.I) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.h = false;
            this.k = i3;
        }
        return this.j[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.k * 28);
        sb.append('{');
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ tc1() {
        this(10);
    }
}
