package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface k1 extends no2, a1 {
    static String l0(k1 k1Var) {
        int intExact = Math.toIntExact(k1Var.h1());
        int intExact2 = Math.toIntExact(k1Var.B1());
        StringBuilder sb = new StringBuilder(k1Var.getClass().getName());
        sb.append(" < ");
        sb.append(intExact);
        sb.append(" x ");
        sb.append(intExact2);
        sb.append(" >");
        if (intExact > 0 && intExact2 > 0 && intExact <= 50 && intExact2 <= 50 && intExact * intExact2 <= 200) {
            sb.append("\n{ { ");
            sb.append(k1Var.H(0L, 0L));
            for (int i = 1; i < intExact2; i++) {
                sb.append(",\t");
                sb.append(k1Var.H(0L, i));
            }
            for (int i2 = 1; i2 < intExact; i2++) {
                sb.append(" },\n{ ");
                long j = i2;
                sb.append(k1Var.H(j, 0L));
                for (int i3 = 1; i3 < intExact2; i3++) {
                    sb.append(",\t");
                    sb.append(k1Var.H(j, i3));
                }
            }
            sb.append(" } }");
        }
        return sb.toString();
    }

    @Override // defpackage.a1
    default double A(int i) {
        int iZ1 = Z1();
        return J(i % iZ1, i / iZ1);
    }

    @Override // defpackage.a1
    default int C(long j) {
        long jH1 = h1();
        return C1(j % jH1, j / jH1);
    }

    default int C1(long j, long j2) {
        return M(Math.toIntExact(j), Math.toIntExact(j2));
    }

    @Override // defpackage.a1
    default int D(int i) {
        int iZ1 = Z1();
        return M(i % iZ1, i / iZ1);
    }

    @Override // defpackage.a1
    default Comparable G(long j) {
        long jH1 = h1();
        return H(j % jH1, j / jH1);
    }

    Comparable H(long j, long j2);

    double J(int i, int i2);

    default int M(int i, int i2) {
        return (int) M1(i, i2);
    }

    default long M1(int i, int i2) {
        return Math.round(J(i, i2));
    }

    default double[][] X() {
        int iZ1 = Z1();
        int iT = T();
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iZ1, iT);
        for (int i = 0; i < iZ1; i++) {
            double[] dArr2 = dArr[i];
            for (int i2 = 0; i2 < iT; i2++) {
                dArr2[i2] = J(i, i2);
            }
        }
        return dArr;
    }

    default float Z0(int i, int i2) {
        return (float) J(i, i2);
    }

    default f1 a2() {
        return new f1(this);
    }

    @Override // defpackage.a1
    default bf0 b() {
        return new g1(c(), h1());
    }

    default long b1(long j, long j2) {
        return M1(Math.toIntExact(j), Math.toIntExact(j2));
    }

    @Override // 
    default bf0 c() {
        return new g1(new y0(this), h1());
    }

    default byte c0(int i, int i2) {
        return (byte) i1(i, i2);
    }

    @Override // defpackage.a1
    default short d(int i) {
        int iZ1 = Z1();
        return i1(i % iZ1, i / iZ1);
    }

    @Override // defpackage.a1
    default short e(long j) {
        long jH1 = h1();
        return x0(j % jH1, j / jH1);
    }

    default short i1(int i, int i2) {
        return (short) M(i, i2);
    }

    @Override // defpackage.a1
    default float q(int i) {
        int iZ1 = Z1();
        return Z0(i % iZ1, i / iZ1);
    }

    @Override // defpackage.a1
    default long r(int i) {
        int iZ1 = Z1();
        return M1(i % iZ1, i / iZ1);
    }

    @Override // defpackage.a1
    default long s(long j) {
        long jH1 = h1();
        return b1(j % jH1, j / jH1);
    }

    @Override // defpackage.a1
    default byte v(int i) {
        int iZ1 = Z1();
        return c0(i % iZ1, i / iZ1);
    }

    @Override // defpackage.a1
    default byte w(long j) {
        long jH1 = h1();
        return z0(j % jH1, j / jH1);
    }

    default short x0(long j, long j2) {
        return i1(Math.toIntExact(j), Math.toIntExact(j2));
    }

    default double y1(long j, long j2) {
        return J(Math.toIntExact(j), Math.toIntExact(j2));
    }

    @Override // defpackage.a1
    default double z(long j) {
        long jH1 = h1();
        return y1(j % jH1, j / jH1);
    }

    default byte z0(long j, long j2) {
        return c0(Math.toIntExact(j), Math.toIntExact(j2));
    }
}
