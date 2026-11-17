package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h22 {
    public static final e22 a;
    public static final f22 b;
    public static final e22 c;
    public static final f22 d;
    public static final g22 e = new g22(30);
    public static final f22 f = new f22(50, 2);
    public static final MathContext g;
    public static final MathContext h;
    public static final MathContext i;

    static {
        byte b2 = 0;
        a = new e22(-10, b2);
        b = new f22(70, b2);
        byte b3 = 1;
        c = new e22(10, b3);
        d = new f22(90, b3);
        MathContext mathContext = MathContext.DECIMAL128;
        g = wo1.I(mathContext).L(RoundingMode.FLOOR).k;
        h = wo1.G(12).k;
        i = wo1.I(mathContext).L(RoundingMode.CEILING).k;
    }

    public static BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2, wo1 wo1Var) {
        BigDecimal bigDecimalMultiply = bigDecimal.divide(bigDecimal2, 0, RoundingMode.HALF_EVEN).multiply(bigDecimal2);
        return wo1Var.s(bigDecimal, bigDecimalMultiply) != null ? bigDecimalMultiply : bigDecimal.divide(bigDecimal2, 0, RoundingMode.CEILING).multiply(bigDecimal2);
    }

    public static boolean b(zh0 zh0Var, e33 e33Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, wo1 wo1Var) {
        BigDecimal bigDecimalS;
        if (bigDecimal != null && bigDecimal2 != null && (bigDecimalS = wo1Var.s(bigDecimal, bigDecimal2)) != null) {
            if (e33Var.q) {
                if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                    bigDecimalS = bigDecimalS.setScale(0, RoundingMode.HALF_EVEN);
                }
            }
            ii0 ii0Var = zh0Var.v;
            if (bigDecimal.compareTo(bigDecimal2) != 0 && !ii0Var.m && !ii0Var.l) {
                lo2 lo2Var = e33Var.p;
                BigDecimal bigDecimalMax = om.a;
                if (e33Var.t()) {
                    bigDecimalMax = e33Var.i.abs();
                }
                for (zh0 zh0Var2 : ii0Var.e()) {
                    BigDecimal bigDecimalAbs = zh0Var2.O(lo2Var, false).abs();
                    if (zh0Var2.o()) {
                        bigDecimalMax = bigDecimalMax.max(bigDecimalAbs);
                    }
                    if (zh0Var2.t()) {
                        bigDecimalMax = bigDecimalMax.max(bigDecimalAbs.multiply(zh0Var2.i.abs()));
                    }
                }
                if (wo1Var.s(bigDecimal.multiply(bigDecimalMax), bigDecimal2.multiply(bigDecimalMax)) == null) {
                    Object[] objArr = {e33Var.k, bigDecimalS, bigDecimal, bigDecimal2, bigDecimalMax};
                    if (!ii0Var.m && !ii0Var.l) {
                        ii0Var.l = true;
                        bl blVar = cl.b;
                        if (blVar != null) {
                            blVar.c(pz1.m("Presolve fixed {} at {}: its range [{}, {}] is within the feasibility tolerance, but not with coefficients up to {}. The model is badly scaled, and the solution may be suboptimal or infeasible.", objArr));
                            blVar.a();
                        }
                    }
                }
            }
            e33Var.J(bigDecimalS);
            return true;
        }
        return false;
    }

    public static BigDecimal c(BigDecimal bigDecimal, BigDecimal bigDecimal2, wo1 wo1Var) {
        BigDecimal bigDecimalMultiply = bigDecimal.divide(bigDecimal2, 0, RoundingMode.HALF_EVEN).multiply(bigDecimal2);
        return wo1Var.s(bigDecimal, bigDecimalMultiply) != null ? bigDecimalMultiply : bigDecimal.divide(bigDecimal2, 0, RoundingMode.FLOOR).multiply(bigDecimal2);
    }
}
