package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class fn2 {
    public static final j40 a;

    static {
        Locale locale = Locale.getDefault();
        MathContext mathContext = wo1.p;
        NumberFormat numberFormatB = wi0.b(1, locale);
        MathContext mathContext2 = wo1.p;
        new wo1(numberFormatB, mathContext2.getPrecision(), 2, mathContext2.getRoundingMode());
        DateFormat dateFormatA = wi0.a(1, 4, Locale.getDefault());
        Objects.requireNonNull(dateFormatA);
        DateFormat dateFormatA2 = wi0.a(2, 4, Locale.getDefault());
        Objects.requireNonNull(dateFormatA2);
        MathContext mathContext3 = MathContext.DECIMAL32;
        wo1.I(mathContext3).M(mathContext3.getPrecision() / 2);
        MathContext mathContext4 = MathContext.DECIMAL64;
        wo1.I(mathContext4).M(mathContext4.getPrecision() / 2);
        MathContext mathContext5 = MathContext.DECIMAL128;
        wo1.I(mathContext5).M(mathContext5.getPrecision() / 2);
        wo1.I(mathContext3).M(mathContext3.getPrecision());
        wo1.I(mathContext4).M(mathContext4.getPrecision());
        wo1.I(mathContext5).M(mathContext5.getPrecision());
        new wo1(wi0.b(4, Locale.getDefault()), mathContext3.getPrecision(), 4, mathContext3.getRoundingMode()).d(new BigDecimal("0.5000"));
        wo1.K(8);
        wo1.K(6);
        DateFormat dateFormatA3 = wi0.a(1, 5, null);
        Objects.requireNonNull(dateFormatA3);
        a = new j40(wi0.a(2, 5, null));
        DateFormat dateFormatA4 = wi0.a(3, 5, null);
        Objects.requireNonNull(dateFormatA4);
        zn2 zn2Var = yn2.j;
        new yn2(zn2Var);
        new yn2(zn2Var);
        new yn2(zn2Var);
        new yn2(zn2Var);
        new yn2(zn2Var);
        DateFormat dateFormatA5 = wi0.a(3, 4, Locale.getDefault());
        Objects.requireNonNull(dateFormatA5);
    }
}
