package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class om {
    public static final BigDecimal A;
    public static final BigDecimal B;
    public static final BigDecimal C;
    public static final BigDecimal D;
    public static final BigDecimal E;
    public static final BigDecimal F;
    public static final BigDecimal G;
    public static final BigDecimal H;
    public static final BigDecimal I;
    public static final BigDecimal J;
    public static final BigDecimal K;
    public static final BigDecimal L;
    public static final BigDecimal M;
    public static final BigDecimal N;
    public static final BigDecimal O;
    public static final BigDecimal P;
    public static final BigDecimal Q;
    public static final lm R;
    public static final mm S;
    public static final lm T;
    public static final mm U;
    public static final lm V;
    public static final lm W;
    public static final mm X;
    public static final mm Y;
    public static final mm Z;
    public static final BigDecimal a = new BigDecimal("0");
    public static final lm a0;
    public static final BigDecimal b;
    public static final mm b0;
    public static final BigDecimal c;
    public static final BigDecimal d;
    public static final BigDecimal e;
    public static final BigDecimal f;
    public static final BigDecimal g;
    public static final BigDecimal h;
    public static final BigDecimal i;
    public static final BigDecimal j;
    public static final BigDecimal k;
    public static final BigDecimal l;
    public static final BigDecimal m;
    public static final BigDecimal n;
    public static final BigDecimal o;
    public static final BigDecimal p;
    public static final BigDecimal q;
    public static final BigDecimal r;
    public static final BigDecimal s;
    public static final BigDecimal t;
    public static final BigDecimal u;
    public static final BigDecimal v;
    public static final BigDecimal w;
    public static final BigDecimal x;
    public static final BigDecimal y;
    public static final BigDecimal z;

    /* JADX WARN: Type inference failed for: r0v15, types: [mm] */
    /* JADX WARN: Type inference failed for: r0v17, types: [mm] */
    /* JADX WARN: Type inference failed for: r0v20, types: [mm] */
    /* JADX WARN: Type inference failed for: r0v21, types: [mm] */
    /* JADX WARN: Type inference failed for: r0v22, types: [mm] */
    /* JADX WARN: Type inference failed for: r0v24, types: [mm] */
    static {
        BigDecimal bigDecimal = new BigDecimal("1");
        b = bigDecimal;
        BigDecimal bigDecimal2 = new BigDecimal("2");
        c = bigDecimal2;
        BigDecimal bigDecimal3 = new BigDecimal("3");
        d = bigDecimal3;
        BigDecimal bigDecimal4 = new BigDecimal("4");
        e = bigDecimal4;
        BigDecimal bigDecimal5 = new BigDecimal("5");
        f = bigDecimal5;
        BigDecimal bigDecimal6 = new BigDecimal("6");
        g = bigDecimal6;
        BigDecimal bigDecimal7 = new BigDecimal("7");
        h = bigDecimal7;
        BigDecimal bigDecimal8 = new BigDecimal("8");
        i = bigDecimal8;
        BigDecimal bigDecimal9 = new BigDecimal("9");
        j = bigDecimal9;
        BigDecimal bigDecimal10 = new BigDecimal("10");
        k = bigDecimal10;
        BigDecimal bigDecimal11 = new BigDecimal("11");
        l = bigDecimal11;
        BigDecimal bigDecimal12 = new BigDecimal("12");
        m = bigDecimal12;
        BigDecimal bigDecimal13 = new BigDecimal("100");
        n = bigDecimal13;
        BigDecimal bigDecimal14 = new BigDecimal("1000");
        o = bigDecimal14;
        p = bigDecimal.negate();
        MathContext mathContext = lg1.b;
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, mathContext);
        q = bigDecimalDivide;
        r = bigDecimal.divide(bigDecimal3, mathContext);
        s = bigDecimal.divide(bigDecimal4, mathContext);
        t = bigDecimal.divide(bigDecimal5, mathContext);
        u = bigDecimal.divide(bigDecimal6, mathContext);
        v = bigDecimal.divide(bigDecimal7, mathContext);
        w = bigDecimal.divide(bigDecimal8, mathContext);
        x = bigDecimal.divide(bigDecimal9, mathContext);
        y = bigDecimal.divide(bigDecimal10, mathContext);
        z = bigDecimal.divide(bigDecimal11, mathContext);
        A = bigDecimal.divide(bigDecimal12, mathContext);
        B = bigDecimal.divide(bigDecimal13, mathContext);
        C = bigDecimal.divide(bigDecimal14, mathContext);
        D = bigDecimal2.divide(bigDecimal3, mathContext);
        E = bigDecimal3.divide(bigDecimal4, mathContext);
        F = new BigDecimal("2.71828182845904523536028747135266249775724709369995957496696762772407663035354759457138217852516642742746");
        BigDecimal bigDecimal15 = new BigDecimal("3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214");
        G = bigDecimal15;
        H = new BigDecimal("1.61803398874989484820458683436563811772030917980576286213544862270526046281890244970720720418939113748475");
        I = bigDecimalDivide.multiply(bigDecimal15);
        BigDecimal bigDecimalMultiply = bigDecimal2.multiply(bigDecimal15);
        J = bigDecimalMultiply;
        K = lg1.f(2, bigDecimal2);
        L = lg1.f(2, bigDecimal15);
        M = lg1.f(2, bigDecimalMultiply);
        N = new BigDecimal(Long.MIN_VALUE);
        O = new BigDecimal(Long.MAX_VALUE);
        BigDecimal bigDecimalAdd = new BigDecimal(Double.MAX_VALUE).add(new BigDecimal(Double.MAX_VALUE).movePointLeft(16));
        P = bigDecimalAdd;
        Q = bigDecimalAdd.negate();
        R = new lm((byte) 0);
        final byte b2 = 3;
        S = new tm() { // from class: mm
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                BigDecimal bigDecimal16 = (BigDecimal) comparable;
                BigDecimal bigDecimal17 = (BigDecimal) comparable2;
                switch (b2) {
                    case 0:
                        return bigDecimal16.max(bigDecimal17);
                    case 1:
                        return bigDecimal16.min(bigDecimal17);
                    case 2:
                        return bigDecimal16.multiply(bigDecimal17);
                    case 3:
                        return bigDecimal16.add(bigDecimal17);
                    case 4:
                        return bigDecimal16.subtract(bigDecimal17);
                    case 5:
                        return BigDecimal.valueOf(Math.atan2(bigDecimal16.doubleValue(), bigDecimal17.doubleValue()));
                    case 6:
                        return bigDecimal16.divide(bigDecimal17, lg1.b);
                    default:
                        BigDecimal[] bigDecimalArr = lg1.a;
                        return lg1.f(2, bigDecimal16.multiply(bigDecimal16).add(bigDecimal17.multiply(bigDecimal17)));
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((BigDecimal) a(BigDecimal.valueOf(d2), BigDecimal.valueOf(d3))).doubleValue();
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return ((BigDecimal) a(BigDecimal.valueOf(f2), BigDecimal.valueOf(f3))).floatValue();
            }
        };
        T = new lm((byte) 17);
        final byte b3 = 6;
        U = new tm() { // from class: mm
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                BigDecimal bigDecimal16 = (BigDecimal) comparable;
                BigDecimal bigDecimal17 = (BigDecimal) comparable2;
                switch (b3) {
                    case 0:
                        return bigDecimal16.max(bigDecimal17);
                    case 1:
                        return bigDecimal16.min(bigDecimal17);
                    case 2:
                        return bigDecimal16.multiply(bigDecimal17);
                    case 3:
                        return bigDecimal16.add(bigDecimal17);
                    case 4:
                        return bigDecimal16.subtract(bigDecimal17);
                    case 5:
                        return BigDecimal.valueOf(Math.atan2(bigDecimal16.doubleValue(), bigDecimal17.doubleValue()));
                    case 6:
                        return bigDecimal16.divide(bigDecimal17, lg1.b);
                    default:
                        BigDecimal[] bigDecimalArr = lg1.a;
                        return lg1.f(2, bigDecimal16.multiply(bigDecimal16).add(bigDecimal17.multiply(bigDecimal17)));
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((BigDecimal) a(BigDecimal.valueOf(d2), BigDecimal.valueOf(d3))).doubleValue();
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return ((BigDecimal) a(BigDecimal.valueOf(f2), BigDecimal.valueOf(f3))).floatValue();
            }
        };
        V = new lm((byte) 19);
        W = new lm((byte) 2);
        final byte b4 = 0;
        X = new tm() { // from class: mm
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                BigDecimal bigDecimal16 = (BigDecimal) comparable;
                BigDecimal bigDecimal17 = (BigDecimal) comparable2;
                switch (b4) {
                    case 0:
                        return bigDecimal16.max(bigDecimal17);
                    case 1:
                        return bigDecimal16.min(bigDecimal17);
                    case 2:
                        return bigDecimal16.multiply(bigDecimal17);
                    case 3:
                        return bigDecimal16.add(bigDecimal17);
                    case 4:
                        return bigDecimal16.subtract(bigDecimal17);
                    case 5:
                        return BigDecimal.valueOf(Math.atan2(bigDecimal16.doubleValue(), bigDecimal17.doubleValue()));
                    case 6:
                        return bigDecimal16.divide(bigDecimal17, lg1.b);
                    default:
                        BigDecimal[] bigDecimalArr = lg1.a;
                        return lg1.f(2, bigDecimal16.multiply(bigDecimal16).add(bigDecimal17.multiply(bigDecimal17)));
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((BigDecimal) a(BigDecimal.valueOf(d2), BigDecimal.valueOf(d3))).doubleValue();
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return ((BigDecimal) a(BigDecimal.valueOf(f2), BigDecimal.valueOf(f3))).floatValue();
            }
        };
        final byte b5 = 1;
        Y = new tm() { // from class: mm
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                BigDecimal bigDecimal16 = (BigDecimal) comparable;
                BigDecimal bigDecimal17 = (BigDecimal) comparable2;
                switch (b5) {
                    case 0:
                        return bigDecimal16.max(bigDecimal17);
                    case 1:
                        return bigDecimal16.min(bigDecimal17);
                    case 2:
                        return bigDecimal16.multiply(bigDecimal17);
                    case 3:
                        return bigDecimal16.add(bigDecimal17);
                    case 4:
                        return bigDecimal16.subtract(bigDecimal17);
                    case 5:
                        return BigDecimal.valueOf(Math.atan2(bigDecimal16.doubleValue(), bigDecimal17.doubleValue()));
                    case 6:
                        return bigDecimal16.divide(bigDecimal17, lg1.b);
                    default:
                        BigDecimal[] bigDecimalArr = lg1.a;
                        return lg1.f(2, bigDecimal16.multiply(bigDecimal16).add(bigDecimal17.multiply(bigDecimal17)));
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((BigDecimal) a(BigDecimal.valueOf(d2), BigDecimal.valueOf(d3))).doubleValue();
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return ((BigDecimal) a(BigDecimal.valueOf(f2), BigDecimal.valueOf(f3))).floatValue();
            }
        };
        final byte b6 = 2;
        Z = new tm() { // from class: mm
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                BigDecimal bigDecimal16 = (BigDecimal) comparable;
                BigDecimal bigDecimal17 = (BigDecimal) comparable2;
                switch (b6) {
                    case 0:
                        return bigDecimal16.max(bigDecimal17);
                    case 1:
                        return bigDecimal16.min(bigDecimal17);
                    case 2:
                        return bigDecimal16.multiply(bigDecimal17);
                    case 3:
                        return bigDecimal16.add(bigDecimal17);
                    case 4:
                        return bigDecimal16.subtract(bigDecimal17);
                    case 5:
                        return BigDecimal.valueOf(Math.atan2(bigDecimal16.doubleValue(), bigDecimal17.doubleValue()));
                    case 6:
                        return bigDecimal16.divide(bigDecimal17, lg1.b);
                    default:
                        BigDecimal[] bigDecimalArr = lg1.a;
                        return lg1.f(2, bigDecimal16.multiply(bigDecimal16).add(bigDecimal17.multiply(bigDecimal17)));
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((BigDecimal) a(BigDecimal.valueOf(d2), BigDecimal.valueOf(d3))).doubleValue();
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return ((BigDecimal) a(BigDecimal.valueOf(f2), BigDecimal.valueOf(f3))).floatValue();
            }
        };
        a0 = new lm((byte) 11);
        final byte b7 = 4;
        b0 = new tm() { // from class: mm
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                BigDecimal bigDecimal16 = (BigDecimal) comparable;
                BigDecimal bigDecimal17 = (BigDecimal) comparable2;
                switch (b7) {
                    case 0:
                        return bigDecimal16.max(bigDecimal17);
                    case 1:
                        return bigDecimal16.min(bigDecimal17);
                    case 2:
                        return bigDecimal16.multiply(bigDecimal17);
                    case 3:
                        return bigDecimal16.add(bigDecimal17);
                    case 4:
                        return bigDecimal16.subtract(bigDecimal17);
                    case 5:
                        return BigDecimal.valueOf(Math.atan2(bigDecimal16.doubleValue(), bigDecimal17.doubleValue()));
                    case 6:
                        return bigDecimal16.divide(bigDecimal17, lg1.b);
                    default:
                        BigDecimal[] bigDecimalArr = lg1.a;
                        return lg1.f(2, bigDecimal16.multiply(bigDecimal16).add(bigDecimal17.multiply(bigDecimal17)));
                }
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                return ((BigDecimal) a(BigDecimal.valueOf(d2), BigDecimal.valueOf(d3))).doubleValue();
            }

            @Override // defpackage.tm
            public final float h(float f2, float f3) {
                return ((BigDecimal) a(BigDecimal.valueOf(f2), BigDecimal.valueOf(f3))).floatValue();
            }
        };
    }
}
