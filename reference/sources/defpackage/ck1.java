package defpackage;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface ck1 extends Consumer, dk1, xj1 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    default void accept(k1 k1Var) {
        if (!f0(k1Var)) {
            throw new a42("Not acceptable!", (byte) 0);
        }
        long jMin = Math.min(h1(), k1Var.h1());
        long jMin2 = Math.min(B1(), k1Var.B1());
        for (long j = 0; j < jMin2; j++) {
            for (long j2 = 0; j2 < jMin; j2++) {
                y0(j2, j, k1Var.H(j2, j));
            }
        }
    }

    default void G0(long j, a1 a1Var) {
        long jB1 = B1();
        long j2 = 0;
        while (j2 < jB1) {
            ck1 ck1Var = this;
            long j3 = j;
            ck1Var.y0(j3, j2, a1Var.G(j2));
            j2++;
            this = ck1Var;
            j = j3;
        }
    }

    default void X0(long j, a1 a1Var) {
        G0(j, a1Var);
    }

    default boolean f0(k1 k1Var) {
        return h1() >= k1Var.h1() && B1() >= k1Var.B1();
    }

    default void k0(re1 re1Var, tm tmVar, re1 re1Var2) {
        int iZ1 = Z1();
        int iT = T();
        int iZ2 = re1Var.Z1();
        int iT2 = re1Var.T();
        int iZ3 = re1Var2.Z1();
        int iT3 = re1Var2.T();
        int i = 0;
        while (i < iT) {
            int i2 = i % iT2;
            int i3 = i % iT3;
            int i4 = 0;
            while (i4 < iZ1) {
                int i5 = i;
                y0(i4, i5, tmVar.a(re1Var.H(i4 % iZ2, i2), re1Var2.H(i4 % iZ3, i3)));
                i4++;
                iZ1 = iZ1;
                iT = iT;
                i = i5;
                iZ2 = iZ2;
            }
            i++;
            iZ1 = iZ1;
            iT = iT;
            iZ2 = iZ2;
        }
    }
}
