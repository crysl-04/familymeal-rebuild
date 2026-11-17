package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ea1 implements ci0 {
    public final m00 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;

    public ea1(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.j = new int[i3];
        this.i = new int[i4];
        int i7 = i + i2;
        this.a = m00.a0(i7, z);
        this.e = i;
        this.c = i2;
        this.h = i3;
        this.f = i4;
        this.g = i5;
        this.d = i6;
        int i8 = i7 - i6;
        this.b = i8;
        if (g() != i6 + i8) {
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.ci0
    public final boolean a(int i) {
        int i2 = this.g;
        return this.a.h.get(i < i2 ? this.d + i : i - i2);
    }

    @Override // defpackage.ci0
    public final int b() {
        return this.g + this.d;
    }

    @Override // defpackage.ci0
    public final boolean c(int i) {
        if (i >= 0) {
            int[] iArr = this.j;
            return i >= iArr.length && i - iArr.length < this.i.length;
        }
        wg.f();
        return false;
    }

    @Override // defpackage.ci0
    public final int d() {
        return this.h + this.f;
    }

    @Override // defpackage.ci0
    public final ih0 e(int i) {
        int i2 = this.g;
        int i3 = i < i2 ? this.d + i : i - i2;
        ih0[] ih0VarArr = this.a.i;
        if (ih0VarArr != null) {
            return ih0VarArr[i3];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea1)) {
            return false;
        }
        ea1 ea1Var = (ea1) obj;
        return this.a == ea1Var.a && this.b == ea1Var.b && this.c == ea1Var.c && this.d == ea1Var.d && this.e == ea1Var.e && this.f == ea1Var.f && this.g == ea1Var.g && this.h == ea1Var.h && Arrays.equals(this.i, ea1Var.i) && Arrays.equals(this.j, ea1Var.j);
    }

    @Override // defpackage.ci0
    public final int f(int i) {
        if (i < 0) {
            wg.f();
            return 0;
        }
        int[] iArr = this.j;
        if (i < iArr.length) {
            return iArr[i];
        }
        int length = i - iArr.length;
        int[] iArr2 = this.i;
        if (length < iArr2.length) {
            return iArr2[length];
        }
        return -1;
    }

    public final int g() {
        return this.e + this.c;
    }

    public final int h() {
        return this.h + this.f + this.g + this.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h)) + ((Arrays.hashCode(this.j) + ((Arrays.hashCode(this.i) + 31) * 31)) * 31);
    }

    public final int i() {
        return this.h + this.f + this.g + this.d + this.b;
    }

    public final String toString() {
        return g() + " x " + h();
    }
}
