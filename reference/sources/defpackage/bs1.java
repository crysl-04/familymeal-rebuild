package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bs1 extends lt {
    public int i;
    public int k;
    public int m;
    public zr1[] h = new zr1[16];
    public int[] j = new int[16];
    public Object[] l = new Object[16];

    public final void o0() {
        this.i = 0;
        this.k = 0;
        Arrays.fill(this.l, 0, this.m, (Object) null);
        this.m = 0;
    }

    public final void p0(rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        if (this.i != 0) {
            yq0 yq0Var = new yq0(this);
            bs1 bs1Var = (bs1) yq0Var.e;
            while (true) {
                zr1 zr1Var = bs1Var.h[yq0Var.b];
                xq0 xq0VarB = zr1Var.b(yq0Var);
                rg rgVar2 = rgVar;
                ik2 ik2Var2 = ik2Var;
                g82 g82Var2 = g82Var;
                as1 as1Var2 = as1Var;
                try {
                    zr1Var.a(yq0Var, rgVar2, ik2Var2, g82Var2, as1Var2);
                    int i = yq0Var.b;
                    int i2 = bs1Var.i;
                    if (i >= i2) {
                        break;
                    }
                    zr1 zr1Var2 = bs1Var.h[i];
                    yq0Var.c += zr1Var2.a;
                    yq0Var.d += zr1Var2.b;
                    int i3 = i + 1;
                    yq0Var.b = i3;
                    if (i3 >= i2) {
                        break;
                    }
                    rgVar = rgVar2;
                    ik2Var = ik2Var2;
                    g82Var = g82Var2;
                    as1Var = as1Var2;
                } catch (Throwable th) {
                    if (as1Var2 == null) {
                        throw th;
                    }
                    ou.H(th, new zi((Object) xq0VarB, (Object) ik2Var2, (Object) as1Var2, (byte) 8));
                    throw th;
                }
            }
        }
        o0();
    }

    public final boolean q0() {
        return this.i == 0;
    }

    public final void r0(zr1 zr1Var) {
        int i = this.i;
        zr1[] zr1VarArr = this.h;
        if (i == zr1VarArr.length) {
            zr1[] zr1VarArr2 = new zr1[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(zr1VarArr, 0, zr1VarArr2, 0, i);
            this.h = zr1VarArr2;
        }
        int i2 = this.k;
        int i3 = zr1Var.a;
        int i4 = zr1Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.j;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            gi.O(0, 0, length, iArr, iArr2);
            this.j = iArr2;
        }
        int i7 = this.m + i4;
        Object[] objArr = this.l;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.l = objArr2;
        }
        zr1[] zr1VarArr3 = this.h;
        int i9 = this.i;
        this.i = i9 + 1;
        zr1VarArr3[i9] = zr1Var;
        this.k += zr1Var.a;
        this.m += i4;
    }
}
