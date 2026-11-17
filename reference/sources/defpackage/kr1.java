package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 extends zr1 {
    public static final kr1 c = new kr1(1, 0, 2);

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        int[] iArr;
        xq0 xq0Var;
        int iC;
        int iC2 = yq0Var.c(0);
        if (ik2Var.n != 0) {
            ez.a("Cannot move a group while inserting");
        }
        if (iC2 < 0) {
            ez.a("Parameter offset is out of bounds");
        }
        if (iC2 != 0) {
            int i = ik2Var.t;
            int i2 = ik2Var.v;
            int i3 = ik2Var.u;
            int i4 = i;
            while (true) {
                iArr = ik2Var.b;
                if (iC2 <= 0) {
                    break;
                }
                i4 += iArr[(ik2Var.q(i4) * 5) + 3];
                if (i4 > i3) {
                    ez.a("Parameter offset is out of bounds");
                }
                iC2--;
            }
            int i5 = iArr[(ik2Var.q(i4) * 5) + 3];
            int iF = ik2Var.f(ik2Var.b, ik2Var.q(ik2Var.t));
            int iF2 = ik2Var.f(ik2Var.b, ik2Var.q(i4));
            int i6 = i4 + i5;
            int iF3 = ik2Var.f(ik2Var.b, ik2Var.q(i6));
            int i7 = iF3 - iF2;
            ik2Var.w(i7, Math.max(ik2Var.t - 1, 0));
            ik2Var.v(i5);
            int[] iArr2 = ik2Var.b;
            int iQ = ik2Var.q(i6) * 5;
            gi.O(ik2Var.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
            if (i7 > 0) {
                Object[] objArr = ik2Var.c;
                int iG = ik2Var.g(iF2 + i7);
                System.arraycopy(objArr, iG, objArr, iF, ik2Var.g(iF3 + i7) - iG);
            }
            int i8 = iF2 + i7;
            int i9 = i8 - iF;
            int i10 = ik2Var.k;
            int i11 = ik2Var.l;
            int length = ik2Var.c.length;
            int i12 = ik2Var.m;
            int i13 = i + i5;
            int i14 = i;
            while (i14 < i13) {
                int iQ2 = ik2Var.q(i14);
                int i15 = i9;
                int[] iArr3 = iArr2;
                iArr3[(iQ2 * 5) + 4] = ik2.h(ik2.h(ik2Var.f(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), ik2Var.k, ik2Var.l, ik2Var.c.length);
                i14++;
                i9 = i15;
                iArr2 = iArr3;
                i10 = i10;
            }
            int i16 = i6 + i5;
            int iO = ik2Var.o();
            int iB = hk2.b(ik2Var.d, i6, iO);
            ArrayList arrayList = new ArrayList();
            if (iB >= 0) {
                while (iB < ik2Var.d.size() && (iC = ik2Var.c((xq0Var = (xq0) ik2Var.d.get(iB)))) >= i6 && iC < i16) {
                    arrayList.add(xq0Var);
                }
            }
            int i17 = i - i6;
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                xq0 xq0Var2 = (xq0) arrayList.get(i18);
                int iC3 = ik2Var.c(xq0Var2) + i17;
                if (iC3 >= ik2Var.g) {
                    xq0Var2.a = -(iO - iC3);
                } else {
                    xq0Var2.a = iC3;
                }
                ik2Var.d.add(hk2.b(ik2Var.d, iC3, iO), xq0Var2);
            }
            if (ik2Var.H(i6, i5)) {
                ez.a("Unexpectedly removed anchors");
            }
            ik2Var.l(i2, ik2Var.u, i);
            if (i7 > 0) {
                ik2Var.I(i8, i7, i6 - 1);
            }
        }
    }
}
