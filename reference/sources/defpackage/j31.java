package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j31 extends co1 {
    @Override // defpackage.co1
    public final int d(bj bjVar) {
        b(bjVar);
        ArrayList arrayList = new ArrayList(((ii0) bjVar.c).e());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zh0 zh0Var = (zh0) obj;
            if (!e()) {
                break;
            }
            if (!zh0Var.t() && zh0Var.q() && !zh0Var.U()) {
                if (zh0Var.v()) {
                    h(bjVar, zh0Var, true);
                }
                if (e() && zh0Var.s()) {
                    h(bjVar, zh0Var, false);
                }
            }
        }
        return c(bjVar);
    }

    @Override // defpackage.co1
    public final dz0 g() {
        return dz0.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [int] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    public final void h(bj bjVar, zh0 zh0Var, boolean z) {
        int size;
        int i;
        boolean z2;
        BigDecimal bigDecimalMultiply;
        ii0 ii0Var = (ii0) bjVar.c;
        gs1 gs1Var = (gs1) bjVar.d;
        BigDecimal bigDecimalSubtract = z ? zh0Var.l : zh0Var.j;
        if (bigDecimalSubtract != null) {
            if (!z) {
                bigDecimalSubtract = bigDecimalSubtract.negate();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry : zh0Var.u.entrySet()) {
                int i2 = ((lo2) entry.getKey()).h;
                e33 e33VarK = ii0Var.k(i2);
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
                    arrayList.add(Integer.valueOf(i2));
                    arrayList2.add(bigDecimalNegate.negate());
                    arrayList3.add(Boolean.TRUE);
                    bigDecimalSubtract = bigDecimalSubtract.subtract(bigDecimalNegate);
                } else if (bigDecimalNegate.signum() > 0) {
                    arrayList.add(Integer.valueOf(i2));
                    arrayList2.add(bigDecimalNegate);
                    arrayList3.add(Boolean.FALSE);
                }
            }
            if (arrayList.size() < 2 || bigDecimalSubtract.signum() <= 0) {
                return;
            }
            int size2 = arrayList.size();
            double dDoubleValue = bigDecimalSubtract.doubleValue();
            double dMax = Math.max(9.999999999999999E-6d, dDoubleValue * 1.0E-6d);
            final double[] dArr = new double[size2];
            final double[] dArr2 = new double[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                dArr[i3] = ((BigDecimal) arrayList2.get(i3)).doubleValue();
                double dA = gs1Var.l.A(((Integer) arrayList.get(i3)).intValue());
                if (((Boolean) arrayList3.get(i3)).booleanValue()) {
                    dA = 1.0d - dA;
                }
                dArr2[i3] = dA;
            }
            double d = 0.0d;
            for (int i4 = 0; i4 < size2; i4++) {
                d += dArr[i4];
            }
            if (d - dDoubleValue > dMax) {
                Integer[] numArr = new Integer[size2];
                for (int i5 = 0; i5 < size2; i5++) {
                    numArr[i5] = Integer.valueOf(i5);
                }
                Arrays.sort(numArr, new Comparator() { // from class: i31
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Integer num = (Integer) obj;
                        Integer num2 = (Integer) obj2;
                        int iIntValue = num2.intValue();
                        double[] dArr3 = dArr2;
                        double d2 = dArr3[iIntValue];
                        int iIntValue2 = num2.intValue();
                        double[] dArr4 = dArr;
                        return Double.compare(d2 * dArr4[iIntValue2], dArr3[num.intValue()] * dArr4[num.intValue()]);
                    }
                });
                ArrayList arrayList4 = new ArrayList();
                double d2 = 0.0d;
                for (int i6 = 0; i6 < size2; i6++) {
                    Integer num = numArr[i6];
                    int iIntValue = num.intValue();
                    arrayList4.add(num);
                    d2 += dArr[iIntValue];
                    if (d2 - dDoubleValue > dMax) {
                        break;
                    }
                }
                double d3 = d2 - dDoubleValue;
                if (d3 <= dMax || (size = arrayList4.size()) < 2) {
                    return;
                }
                arrayList4.sort(new ru(dArr, (byte) 2));
                double d4 = dArr[((Integer) arrayList4.get(0)).intValue()];
                int i7 = 1;
                while (true) {
                    if (i7 >= size) {
                        i = size;
                        z2 = true;
                        break;
                    }
                    double d5 = dArr[((Integer) arrayList4.get(i7)).intValue()];
                    i = size;
                    z2 = true;
                    double d6 = i7;
                    double d7 = (d4 - d5) * d6;
                    if (d7 >= d3) {
                        d4 -= d3 / d6;
                        d3 = 0.0d;
                        break;
                    } else {
                        d3 -= d7;
                        i7++;
                        size = i;
                        d4 = d5;
                    }
                }
                if (d3 > 0.0d) {
                    d4 = dDoubleValue / ((double) i);
                }
                double[] dArr3 = new double[i];
                dArr3[0] = Math.min(d4, dArr[((Integer) arrayList4.get(0)).intValue()]);
                int i8 = z2 ? 1 : 0;
                while (i8 < i) {
                    double[] dArr4 = dArr;
                    dArr3[i8] = Math.min(d4, dArr4[((Integer) arrayList4.get(i8)).intValue()]) + dArr3[i8 - 1];
                    i8++;
                    dArr = dArr4;
                }
                double[] dArr5 = dArr;
                boolean[] zArr = new boolean[size2];
                for (int i9 = 0; i9 < i; i9++) {
                    int iIntValue2 = ((Integer) arrayList4.get(i9)).intValue();
                    if (dArr5[iIntValue2] <= d4 + 1.0E-6d) {
                        zArr[iIntValue2] = z2;
                    }
                }
                ?? r4 = new int[size2];
                double d8 = 0.0d;
                int i10 = 0;
                ?? r15 = z2;
                while (i10 < size2) {
                    if (zArr[i10]) {
                        r4[i10] = r15;
                    } else {
                        double d9 = dArr5[i10];
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < i && d9 > dArr3[i11] + 1.0E-6d) {
                            i12 = i11 + 1;
                            i11 = i12;
                        }
                        r4[i10] = i12;
                    }
                    d8 += ((double) r4[i10]) * dArr2[i10];
                    i10++;
                    r15 = r15;
                }
                int i13 = i - 1;
                if (d8 - ((double) i13) <= 0.0d) {
                    return;
                }
                zh0 zh0VarF = f(bjVar);
                long j = i13;
                for (int i14 = 0; i14 < size2; i14++) {
                    if (r4[i14] != 0) {
                        int iIntValue3 = ((Integer) arrayList.get(i14)).intValue();
                        if (((Boolean) arrayList3.get(i14)).booleanValue()) {
                            zh0VarF.E(iIntValue3, BigDecimal.valueOf(-r4[i14]));
                            j -= (long) r4[i14];
                        } else {
                            zh0VarF.E(iIntValue3, BigDecimal.valueOf((long) r4[i14]));
                        }
                    }
                }
                zh0VarF.B(BigDecimal.valueOf(j));
                a(bjVar, zh0VarF);
            }
        }
    }
}
