package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ya2 implements re1, sm2, bk1, ck1, ak1, k1 {
    public final int h;
    public final fy1 i;
    public final bm2 j;
    public final ArrayList k;

    public ya2(fy1 fy1Var, int i, int i2) {
        this.k = new ArrayList(i2);
        this.h = i;
        this.i = fy1Var;
        y22 y22VarR = fy1Var.r();
        wo1 wo1Var = cm2.o;
        this.j = new bm2(y22VarR);
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.h;
    }

    @Override // defpackage.re1
    public final fy1 C0() {
        return this.i;
    }

    @Override // defpackage.ak1
    public final void E(long j, long j2) {
        int intExact = Math.toIntExact(j);
        int intExact2 = Math.toIntExact(j2);
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cm2) obj).c1(intExact, intExact2);
        }
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        ((cm2) this.k.get((int) j)).F(j2, d);
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        return ((cm2) this.k.get(i)).A(i2);
    }

    @Override // defpackage.ak1
    public final void K(long j, long j2) {
        int intExact = Math.toIntExact(j);
        int intExact2 = Math.toIntExact(j2);
        ArrayList arrayList = this.k;
        cm2 cm2Var = (cm2) arrayList.get(intExact);
        arrayList.set(intExact, (cm2) arrayList.get(intExact2));
        arrayList.set(intExact2, cm2Var);
    }

    @Override // defpackage.i1
    public final a1 N1(long j) {
        return a0(Math.toIntExact(j));
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        ((cm2) this.k.get((int) j)).g(j2, comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.h;
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        ((cm2) this.k.get((int) j)).n(j2, c23Var);
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.k.size();
    }

    public final cm2 a0(int i) {
        return (cm2) this.k.get(i);
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        ((cm2) this.k.get(i)).o(i2, d);
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return ((cm2) this.k.get(i)).G(i2);
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.k.size();
    }

    public final void j(int i) {
        ArrayList arrayList = this.k;
        arrayList.ensureCapacity(arrayList.size() + i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(this.j.p(this.h));
        }
    }

    @Override // defpackage.re1, defpackage.e1
    /* JADX INFO: renamed from: m */
    public final void a(gz2 gz2Var) {
        gz2Var.reset();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cm2) arrayList.get(i)).b2(gz2Var.L0(i));
        }
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        ((cm2) this.k.get(i)).f(i2, d);
    }

    @Override // defpackage.zj1
    public final void reset() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cm2) obj).i = 0;
        }
    }

    @Override // defpackage.sm2
    public final k52 t0() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int size2 = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            i += ((cm2) obj).i;
        }
        double[] dArr = new double[i];
        int[] iArr = new int[i];
        int i3 = this.h;
        int[] iArr2 = new int[i3 + 1];
        for (int i4 = 0; i4 < size; i4++) {
            am2 it = ((cm2) arrayList.get(i4)).b().iterator();
            while (it.hasNext()) {
                it.c();
                int iD0 = ((int) it.D0()) + 1;
                iArr2[iD0] = iArr2[iD0] + 1;
            }
        }
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i5 + 1;
            iArr2[i6] = iArr2[i6] + iArr2[i5];
            i5 = i6;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i3);
        for (int i7 = 0; i7 < size; i7++) {
            am2 it2 = ((cm2) arrayList.get(i7)).b().iterator();
            while (it2.hasNext()) {
                it2.c();
                int iD1 = (int) it2.D0();
                int i8 = iArrCopyOf[iD1];
                iArrCopyOf[iD1] = i8 + 1;
                dArr[i8] = it2.A0();
                iArr[i8] = i7;
            }
        }
        return new k52(size, i3, dArr, iArr, iArr2, (byte) 0);
    }

    public final String toString() {
        return k1.l0(this);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        ((cm2) this.k.get(Math.toIntExact(j))).B(j2, comparable);
    }
}
