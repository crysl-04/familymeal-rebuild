package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cw implements re1, sm2, bk1, ck1, ak1, k1 {
    public final bm2 h;
    public final ArrayList i;
    public final int j;

    public cw(int i) {
        g52 g52Var = l52.q;
        this.i = new ArrayList(0);
        this.j = i;
        y22 y22VarR = g52Var.r();
        wo1 wo1Var = cm2.o;
        this.h = new bm2(y22VarR);
    }

    @Override // defpackage.no2
    public final long B1() {
        return this.i.size();
    }

    @Override // defpackage.re1
    public final fy1 C0() {
        return l52.q;
    }

    @Override // defpackage.ak1
    public final void E(long j, long j2) {
        int intExact = Math.toIntExact(j);
        int intExact2 = Math.toIntExact(j2);
        ArrayList arrayList = this.i;
        cm2 cm2Var = (cm2) arrayList.get(intExact);
        arrayList.set(intExact, (cm2) arrayList.get(intExact2));
        arrayList.set(intExact2, cm2Var);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        ((cm2) this.i.get((int) j2)).F(j, d);
    }

    @Override // defpackage.re1, defpackage.k1
    public final double J(int i, int i2) {
        return ((cm2) this.i.get(i2)).A(i);
    }

    @Override // defpackage.ak1
    public final void K(long j, long j2) {
        int intExact = Math.toIntExact(j);
        int intExact2 = Math.toIntExact(j2);
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cm2) obj).c1(intExact, intExact2);
        }
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        ((cm2) this.i.get((int) j2)).g(j, comparable);
    }

    @Override // defpackage.no2
    public final int T() {
        return this.i.size();
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        ((cm2) this.i.get((int) j2)).n(j, c23Var);
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.j;
    }

    public final k52 a0(int i, int i2, int i3) {
        double[] dArr = new double[i3];
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i2 + 1];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            iArr2[i5] = i4;
            am2 it = ((cm2) this.i.get(i5)).b().iterator();
            while (it.hasNext()) {
                it.c();
                dArr[i4] = it.A0();
                iArr[i4] = (int) it.D0();
                i4++;
            }
        }
        iArr2[i2] = i4;
        return new k52(i, i2, dArr, iArr, iArr2, (byte) 0);
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        ((cm2) this.i.get(i2)).o(i, d);
    }

    @Override // defpackage.i1
    public final a1 g0(long j) {
        return (cm2) this.i.get(Math.toIntExact(j));
    }

    @Override // defpackage.re1
    public final Comparable h0(int i, int i2) {
        return ((cm2) this.i.get(i2)).G(i);
    }

    @Override // defpackage.no2
    public final long h1() {
        return this.j;
    }

    public final void j(int i) {
        ArrayList arrayList = this.i;
        arrayList.ensureCapacity(arrayList.size() + i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(this.h.p(this.j));
        }
    }

    @Override // defpackage.re1, defpackage.e1
    /* JADX INFO: renamed from: m */
    public final void a(gz2 gz2Var) {
        gz2Var.reset();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cm2) arrayList.get(i)).b2(gz2Var.N0(i));
        }
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        ((cm2) this.i.get(i2)).f(i, d);
    }

    @Override // defpackage.zj1
    public final void reset() {
        ArrayList arrayList = this.i;
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
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int size2 = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            i += ((cm2) obj).i;
        }
        return a0(this.j, size, i);
    }

    public final String toString() {
        return k1.l0(this);
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        ((cm2) this.i.get(Math.toIntExact(j2))).B(j, comparable);
    }
}
