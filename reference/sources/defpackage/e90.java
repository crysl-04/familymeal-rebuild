package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface e90 {
    default float A(float f) {
        return b() * f;
    }

    default int J(long j) {
        return Math.round(f0(j));
    }

    default float L(long j) {
        if (!bx2.a(ax2.b(j), 4294967296L)) {
            cx0.b("Only Sp can convert to Px");
        }
        float[] fArr = mn0.a;
        if (n() < 1.03f) {
            return n() * ax2.c(j);
        }
        ln0 ln0VarA = mn0.a(n());
        if (ln0VarA != null) {
            return ln0VarA.b(ax2.c(j));
        }
        return n() * ax2.c(j);
    }

    default int R(float f) {
        float fA = A(f);
        if (Float.isInfinite(fA)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fA);
    }

    float b();

    default long c0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fA = A(fc0.b(j));
        float fA2 = A(fc0.a(j));
        return (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L);
    }

    default float f0(long j) {
        if (!bx2.a(ax2.b(j), 4294967296L)) {
            cx0.b("Only Sp can convert to Px");
        }
        return A(L(j));
    }

    default long m0(float f) {
        return w(u0(f));
    }

    float n();

    default float r0(int i) {
        return i / b();
    }

    default float u0(float f) {
        return f / b();
    }

    default long w(float f) {
        float[] fArr = mn0.a;
        if (n() < 1.03f) {
            return r02.z(f / n(), 4294967296L);
        }
        ln0 ln0VarA = mn0.a(n());
        return r02.z(ln0VarA != null ? ln0VarA.a(f) : f / n(), 4294967296L);
    }

    default long x(long j) {
        if (j != 9205357640488583168L) {
            return ou.b(u0(Float.intBitsToFloat((int) (j >> 32))), u0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }
}
