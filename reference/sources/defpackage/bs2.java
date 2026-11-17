package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class bs2 {
    public static final wo1 a = wo1.H(4, 16);

    public static mh0 a(r22 r22Var, int i, double d, double d2, int[] iArr, boolean[] zArr, double[] dArr, double[] dArr2, boolean[] zArr2) {
        double d3;
        double d4;
        int i2;
        int length = zArr.length;
        if (r22Var.size() < length || dArr.length < length || dArr2.length < length) {
            wg.f();
            return null;
        }
        int i3 = 0;
        boolean z = d < h32.a;
        double d5 = z ? -d : d;
        double dFloor = d5 - Math.floor(d5);
        if (!b(d, dFloor, d2)) {
            return null;
        }
        double d6 = h32.b - dFloor;
        double[] dArr3 = new double[length];
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 < length) {
                boolean z2 = zArr2[i4];
                i2 = i3;
                double dA = r22Var.A(i4);
                if (z ^ z2) {
                    dA = -dA;
                }
                d3 = d6;
                wo1 wo1Var = a;
                d4 = dFloor;
                double d7 = wo1Var.j;
                double d8 = wo1Var.j;
                if (wo1.D(dA, d7)) {
                    continue;
                } else {
                    if (!Double.isFinite(z2 ? dArr2[i4] : dArr[i4])) {
                        return null;
                    }
                    if (zArr[i4]) {
                        double dFloor2 = dA - Math.floor(dA);
                        if (dFloor2 > d4) {
                            double d9 = h32.b - dFloor2;
                            if (!wo1.D(d9, d8)) {
                                dArr3[i4] = d9 / d3;
                            }
                        } else if (!wo1.D(dFloor2, d8)) {
                            dArr3[i4] = dFloor2 / d4;
                        }
                    } else {
                        double d10 = h32.a;
                        if (dA > d10) {
                            dArr3[i4] = dA / d4;
                        } else if (dA < d10) {
                            dArr3[i4] = (-dA) / d3;
                        }
                    }
                }
            } else {
                d3 = d6;
                d4 = dFloor;
                i2 = i3;
            }
            i3 = i2 + 1;
            d6 = d3;
            dFloor = d4;
        }
        return new mh0(new xh(dArr3), i, h32.b);
    }

    public static boolean b(double d, double d2, double d3) {
        double d4 = h32.b;
        return !a.B(d, Math.min(d2, d4 - d2)) && d3 < d2 && d2 < d4 - d3;
    }
}
