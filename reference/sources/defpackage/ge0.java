package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ge0 implements r21 {
    public static final ge0 a = new ge0();
    public static final j32 b = new j32("kotlin.time.Duration", d32.q);

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        yy yyVar = de0.i;
        String strB = v60Var.B();
        strB.getClass();
        try {
            long jX = lt.X(strB);
            if (jX == de0.l) {
                throw new IllegalStateException("invariant failed");
            }
            return new de0(jX);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(wi0.h("Invalid ISO duration string format: '", strB, "'."), e);
        }
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        long j = ((de0) obj).h;
        yy yyVar = de0.i;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jG = j < 0 ? de0.g(j) : j;
        long jF = de0.f(jG, he0.HOURS);
        boolean z = false;
        int iF = de0.d(jG) ? 0 : (int) (de0.f(jG, he0.MINUTES) % 60);
        int iF2 = de0.d(jG) ? 0 : (int) (de0.f(jG, he0.SECONDS) % 60);
        int iC = de0.c(jG);
        if (de0.d(j)) {
            jF = 9999999999999L;
        }
        boolean z2 = jF != 0;
        boolean z3 = (iF2 == 0 && iC == 0) ? false : true;
        if (iF != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jF);
            sb.append('H');
        }
        if (z) {
            sb.append(iF);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            de0.b(sb, iF2, iC, 9, "S", true);
        }
        bVar.r(sb.toString());
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
