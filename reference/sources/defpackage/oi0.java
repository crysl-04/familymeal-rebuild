package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface oi0 extends qi0 {
    no2 b(long j, long j2);

    default no2 u(re1 re1Var, re1 re1Var2) {
        long[] jArr = {re1Var.h1(), re1Var.B1()};
        long[] jArr2 = {re1Var2.h1(), re1Var2.B1()};
        long[] jArr3 = new long[2];
        int i = 0;
        while (i < 2) {
            long j = i < 2 ? jArr[i] : 1L;
            long j2 = i < 2 ? jArr2[i] : 1L;
            if (j != 1 && j2 != 1 && j != j2) {
                wg.f();
                return null;
            }
            jArr3[i] = Math.max(j, j2);
            i++;
        }
        return b(jArr3[0], jArr3[1]);
    }
}
