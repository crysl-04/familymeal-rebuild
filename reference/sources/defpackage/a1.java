package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface a1 extends mo2 {
    static String V0(a1 a1Var) {
        int size = a1Var.size();
        if (size == 0) {
            return "{ }";
        }
        if (size == 1) {
            return wi0.h("{ ", String.valueOf(a1Var.G(0L)), " }");
        }
        StringBuilder sb = new StringBuilder("{ ");
        sb.append(a1Var.G(0L));
        for (int i = 1; i < size; i++) {
            sb.append(", ");
            sb.append(a1Var.G(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    double A(int i);

    default int C(long j) {
        return D(Math.toIntExact(j));
    }

    default int D(int i) {
        return (int) r(i);
    }

    Comparable G(long j);

    default float K0(long j) {
        return q(Math.toIntExact(j));
    }

    default void R1(double[] dArr) {
        int iMin = Math.min(dArr.length, (int) count());
        for (int i = 0; i < iMin; i++) {
            dArr[i] = A(i);
        }
    }

    default double S(a1 a1Var) {
        af0 it = b().iterator();
        double dZ = 0.0d;
        while (it.hasNext()) {
            af0 af0Var = (af0) it.next();
            dZ += a1Var.z(af0Var.D0()) * af0Var.A0();
        }
        return dZ;
    }

    default af0 b() {
        return c();
    }

    default af0 c() {
        return new y0(this);
    }

    default short d(int i) {
        return (short) D(i);
    }

    default short e(long j) {
        return d(Math.toIntExact(j));
    }

    default void m1(double d, yj1 yj1Var) {
        af0 it = b().iterator();
        while (it.hasNext()) {
            af0 af0Var = (af0) it.next();
            long jD0 = af0Var.D0();
            ((ry1) yj1Var).f((int) jD0, af0Var.A0() * d);
        }
    }

    default float q(int i) {
        return (float) A(i);
    }

    default long r(int i) {
        return Math.round(A(i));
    }

    default long s(long j) {
        return r(Math.toIntExact(j));
    }

    default double[] u0() {
        double[] dArr = new double[size()];
        R1(dArr);
        return dArr;
    }

    default byte v(int i) {
        return (byte) d(i);
    }

    default byte w(long j) {
        return v(Math.toIntExact(j));
    }

    default double z(long j) {
        return A(Math.toIntExact(j));
    }
}
