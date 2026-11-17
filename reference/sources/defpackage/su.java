package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class su extends co1 {
    public BitSet[] n;
    public ii0 o;
    public long p;

    /* JADX WARN: Code duplicated, block: B:112:0x0203  */
    @Override // defpackage.co1
    public final int d(bj bjVar) {
        double d;
        int i;
        int i2;
        double d2;
        BitSet bitSet;
        int i3;
        BitSet bitSet2;
        b(bjVar);
        ii0 ii0Var = (ii0) bjVar.c;
        gs1 gs1Var = (gs1) bjVar.d;
        int i4 = 0;
        int i5 = 1;
        if (this.n == null || this.o != ii0Var) {
            this.o = ii0Var;
            this.n = new BitSet[ii0Var.o.size() << 1];
            for (zh0 zh0Var : ii0Var.e()) {
                if (!zh0Var.t() && zh0Var.o() && zh0Var.q() && !zh0Var.U()) {
                    if (zh0Var.v()) {
                        i(zh0Var, ii0Var, true);
                    }
                    if (zh0Var.s()) {
                        i(zh0Var, ii0Var, false);
                    }
                }
            }
        }
        int size = ii0Var.o.size();
        ArrayList arrayList = new ArrayList();
        int i6 = size << 1;
        double[] dArr = new double[i6];
        int i7 = 0;
        while (true) {
            d = 1.0E-6d;
            if (i7 >= size) {
                break;
            }
            int i8 = i7 << 1;
            int i9 = i8 + 1;
            BitSet[] bitSetArr = this.n;
            if ((bitSetArr[i8] != null || bitSetArr[i9] != null) && ii0Var.k(i7).F()) {
                double dA = gs1Var.l.A(i7);
                dArr[i8] = dA;
                double d3 = 1.0d - dA;
                dArr[i9] = d3;
                if (dA > 1.0E-6d && this.n[i8] != null) {
                    arrayList.add(Integer.valueOf(i8));
                }
                if (d3 > 1.0E-6d && this.n[i9] != null) {
                    arrayList.add(Integer.valueOf(i9));
                }
            }
            i7++;
        }
        if (arrayList.size() < 2) {
            return 0;
        }
        arrayList.sort(new ru(dArr, (byte) 0));
        int size2 = arrayList.size();
        int[] iArr = new int[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        boolean[] zArr = new boolean[i6];
        int[] iArr2 = new int[i6];
        int i11 = 0;
        while (i11 < size2 && e()) {
            int i12 = iArr[i11];
            if (zArr[i12]) {
                i = size2;
                i2 = i5;
                d2 = d;
            } else {
                double d4 = dArr[i12];
                if (d4 < 0.999999d) {
                    iArr2[i4] = i12;
                    int i13 = i11 + 1;
                    d2 = d;
                    int i14 = i5;
                    while (i13 < size2) {
                        int i15 = iArr[i13];
                        int i16 = i5;
                        int i17 = i4;
                        while (true) {
                            if (i17 >= i14) {
                                i3 = size2;
                                iArr2[i14] = i15;
                                d4 += dArr[i15];
                                i14++;
                                break;
                            }
                            int i18 = iArr2[i17];
                            i3 = size2;
                            if (i15 != (i18 ^ 1) && ((bitSet2 = this.n[i15]) == null || !bitSet2.get(i18))) {
                                break;
                            }
                            i17++;
                            size2 = i3;
                        }
                        i13++;
                        i5 = i16;
                        size2 = i3;
                        i4 = 0;
                    }
                    i = size2;
                    i2 = i5;
                    if (d4 - 1.0d <= 0.0d) {
                        i4 = 0;
                    } else {
                        BitSet bitSet3 = (BitSet) this.n[i12].clone();
                        for (int i19 = i2; i19 < i14 && !bitSet3.isEmpty(); i19++) {
                            BitSet bitSet4 = this.n[iArr2[i19]];
                            if (bitSet4 == null) {
                                bitSet3.clear();
                            } else {
                                bitSet3.and(bitSet4);
                            }
                        }
                        i4 = 0;
                        for (int iNextSetBit = bitSet3.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet3.nextSetBit(iNextSetBit + 1)) {
                            if (dArr[iNextSetBit] <= d2 && ii0Var.k(iNextSetBit >> 1).F()) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= i14) {
                                        iArr2[i14] = iNextSetBit;
                                        i14++;
                                        break;
                                    }
                                    int i21 = iArr2[i20];
                                    if (iNextSetBit != (i21 ^ 1) && ((bitSet = this.n[iNextSetBit]) == null || !bitSet.get(i21))) {
                                        break;
                                    }
                                    i20++;
                                }
                            }
                        }
                        zh0 zh0VarF = f(bjVar);
                        int i22 = 0;
                        int i23 = 0;
                        while (i22 < i14) {
                            int i24 = iArr2[i22];
                            int i25 = i24 >> 1;
                            if ((i24 & 1) == i2) {
                                zh0VarF.E(i25, BigDecimal.ONE.negate());
                                i23++;
                            } else {
                                zh0VarF.E(i25, BigDecimal.ONE);
                            }
                            i22++;
                            i2 = 1;
                        }
                        zh0VarF.B(BigDecimal.valueOf(1 - i23));
                        if (a(bjVar, zh0VarF)) {
                            for (int i26 = 0; i26 < i14; i26++) {
                                zArr[iArr2[i26]] = true;
                            }
                        }
                        i2 = 1;
                    }
                } else {
                    i = size2;
                    i2 = i5;
                    d2 = d;
                }
            }
            i11++;
            d = d2;
            i5 = i2;
            size2 = i;
        }
        return c(bjVar);
    }

    public final void h(int[] iArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < i; i4++) {
                int i5 = iArr[i2];
                int i6 = iArr[i4];
                if (this.p < 4000000) {
                    BitSet[] bitSetArr = this.n;
                    if (bitSetArr[i5] == null) {
                        bitSetArr[i5] = new BitSet();
                    }
                    BitSet[] bitSetArr2 = this.n;
                    if (bitSetArr2[i6] == null) {
                        bitSetArr2[i6] = new BitSet();
                    }
                    if (!this.n[i5].get(i6)) {
                        this.n[i5].set(i6);
                        this.n[i6].set(i5);
                        this.p++;
                    }
                }
            }
            i2 = i3;
        }
    }

    public final void i(zh0 zh0Var, ii0 ii0Var, boolean z) {
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalSubtract = z ? zh0Var.l : zh0Var.j;
        if (bigDecimalSubtract == null) {
            return;
        }
        if (!z) {
            bigDecimalSubtract = bigDecimalSubtract.negate();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = zh0Var.u.entrySet().iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                int size = arrayList.size();
                if (size < 2 || bigDecimalSubtract.signum() <= 0) {
                    return;
                }
                double dDoubleValue = bigDecimalSubtract.doubleValue();
                double dMax = Math.max(9.999999999999999E-6d, 1.0E-6d * dDoubleValue);
                Integer[] numArr = new Integer[size];
                double[] dArr = new double[size];
                for (int i2 = 0; i2 < size; i2++) {
                    numArr[i2] = Integer.valueOf(i2);
                    dArr[i2] = ((BigDecimal) arrayList2.get(i2)).doubleValue();
                }
                Arrays.sort(numArr, new ru(dArr, (byte) 1));
                int[] iArr = new int[size];
                double[] dArr2 = new double[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr[i3] = ((Integer) arrayList.get(numArr[i3].intValue())).intValue();
                    dArr2[i3] = dArr[numArr[i3].intValue()];
                }
                int i4 = 0;
                while (i < size && (dArr2[i - 1] + dArr2[i]) - dDoubleValue > dMax) {
                    i4 = i + 1;
                    i = i4;
                }
                if (i4 >= 2) {
                    h(iArr, i4);
                    int[] iArr2 = new int[i4 + 1];
                    int i5 = i4 - 1;
                    while (i4 < size) {
                        while (i5 > 0 && (dArr2[i5 - 1] + dArr2[i4]) - dDoubleValue <= dMax) {
                            i5--;
                        }
                        if (i5 == 0) {
                            return;
                        }
                        System.arraycopy(iArr, 0, iArr2, 0, i5);
                        iArr2[i5] = iArr[i4];
                        h(iArr2, i5 + 1);
                        i4++;
                    }
                    return;
                }
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i6 = ((lo2) entry.getKey()).h;
            e33 e33VarK = ii0Var.k(i6);
            BigDecimal bigDecimalNegate = (BigDecimal) entry.getValue();
            if (!z) {
                bigDecimalNegate = bigDecimalNegate.negate();
            }
            if (!e33VarK.F()) {
                if (bigDecimalNegate.signum() > 0) {
                    BigDecimal bigDecimal = e33VarK.j;
                    if (bigDecimal == null) {
                        return;
                    } else {
                        bigDecimalMultiply = bigDecimalNegate.multiply(bigDecimal);
                    }
                } else if (bigDecimalNegate.signum() >= 0) {
                    continue;
                } else {
                    BigDecimal bigDecimal2 = e33VarK.l;
                    if (bigDecimal2 == null) {
                        return;
                    } else {
                        bigDecimalMultiply = bigDecimalNegate.multiply(bigDecimal2);
                    }
                }
                bigDecimalSubtract = bigDecimalSubtract.subtract(bigDecimalMultiply);
            } else if (bigDecimalNegate.signum() < 0) {
                arrayList.add(Integer.valueOf((i6 << 1) + 1));
                arrayList2.add(bigDecimalNegate.negate());
                bigDecimalSubtract = bigDecimalSubtract.subtract(bigDecimalNegate);
            } else if (bigDecimalNegate.signum() > 0) {
                arrayList.add(Integer.valueOf(i6 << 1));
                arrayList2.add(bigDecimalNegate);
            }
        }
    }
}
