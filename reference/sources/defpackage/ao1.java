package defpackage;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ao1 {
    public static final Comparator d = Comparator.comparingInt(new qn1((byte) 4));
    public final BigDecimal[] a;
    public final int b;
    public final int[] c;

    public ao1(zh0 zh0Var) {
        Set setEntrySet = zh0Var.u.entrySet();
        int size = setEntrySet.size();
        Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[size]);
        Arrays.sort(entryArr, d);
        int[] iArr = new int[size];
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((lo2) entryArr[i].getKey()).h;
            bigDecimalArr[i] = ((BigDecimal) entryArr[i].getValue()).stripTrailingZeros();
        }
        this.c = iArr;
        this.a = bigDecimalArr;
        this.b = (Arrays.hashCode(iArr) * 31) + Arrays.hashCode(bigDecimalArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao1)) {
            return false;
        }
        ao1 ao1Var = (ao1) obj;
        return this.b == ao1Var.b && Arrays.equals(this.c, ao1Var.c) && Arrays.equals(this.a, ao1Var.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
