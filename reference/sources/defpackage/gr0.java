package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gr0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final si1 e;
    public final yq2 f;

    public gr0(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            w12.a("Invalid start index");
        }
        this.d = new ArrayList();
        si1 si1Var = new si1();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            x21 x21Var = (x21) this.a.get(i3);
            int i4 = x21Var.c;
            int i5 = x21Var.d;
            si1Var.h(i4, new ls0(i3, i2, i5));
            i2 += i5;
        }
        this.e = si1Var;
        this.f = new yq2(new x70(this, (byte) 1));
    }

    public final boolean a(int i, int i2) {
        ls0 ls0Var;
        int i3;
        int i4;
        si1 si1Var = this.e;
        ls0 ls0Var2 = (ls0) si1Var.b(i);
        if (ls0Var2 == null) {
            return false;
        }
        int i5 = ls0Var2.b;
        int i6 = i2 - ls0Var2.c;
        ls0Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = si1Var.c;
        long[] jArr = si1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (ls0Var = (ls0) objArr[(i7 << 3) + i9]).b) >= i5 && ls0Var != ls0Var2 && (i4 = i3 + i6) >= 0) {
                        ls0Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
