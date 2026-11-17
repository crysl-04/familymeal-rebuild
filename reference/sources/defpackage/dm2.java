package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dm2 implements Cloneable {
    public /* synthetic */ boolean h;
    public /* synthetic */ int[] i;
    public /* synthetic */ Object[] j;
    public /* synthetic */ int k;

    public dm2(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.i = new int[i5];
        this.j = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dm2 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        dm2 dm2Var = (dm2) objClone;
        dm2Var.i = (int[]) this.i.clone();
        dm2Var.j = (Object[]) this.j.clone();
        return dm2Var;
    }

    public final int b(int i) {
        if (this.h) {
            aa3.o(this);
        }
        if (i >= this.k || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.i[i];
    }

    public final void c(int i, Object obj) {
        int iH = s60.h(this.k, i, this.i);
        if (iH >= 0) {
            this.j[iH] = obj;
            return;
        }
        int i2 = ~iH;
        int i3 = this.k;
        if (i2 < i3) {
            Object[] objArr = this.j;
            if (objArr[i2] == aa3.P) {
                this.i[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.h && i3 >= this.i.length) {
            aa3.o(this);
            i2 = ~s60.h(this.k, i, this.i);
        }
        int i4 = this.k;
        if (i4 >= this.i.length) {
            int i5 = (i4 + 1) << 2;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            this.i = Arrays.copyOf(this.i, i8);
            this.j = Arrays.copyOf(this.j, i8);
        }
        int i9 = this.k;
        if (i9 - i2 != 0) {
            int[] iArr = this.i;
            int i10 = i2 + 1;
            gi.O(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.j;
            gi.Q(objArr2, objArr2, i10, i2, this.k);
        }
        this.i[i2] = i;
        this.j[i2] = obj;
        this.k++;
    }

    public final int d() {
        if (this.h) {
            aa3.o(this);
        }
        return this.k;
    }

    public final Object e(int i) {
        if (this.h) {
            aa3.o(this);
        }
        if (i >= this.k || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.j[i];
    }

    public final String toString() {
        if (d() <= 0) {
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
            Object objE = e(i2);
            if (objE != this) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
