package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lm implements c23 {
    public final /* synthetic */ byte h;

    public /* synthetic */ lm(byte b) {
        this.h = b;
    }

    @Override // defpackage.c23
    public final double a(double d) {
        return ((BigDecimal) b(BigDecimal.valueOf(d))).doubleValue();
    }

    @Override // defpackage.c23
    public final Comparable b(Comparable comparable) {
        BigDecimal bigDecimal = (BigDecimal) comparable;
        switch (this.h) {
            case 0:
                return bigDecimal.abs();
            case 1:
                return BigDecimal.valueOf(Math.acos(bigDecimal.doubleValue()));
            case 2:
                MathContext mathContext = lg1.b;
                BigDecimal bigDecimalRound = bigDecimal.round(mathContext);
                BigDecimal bigDecimal2 = new BigDecimal(Math.log(bigDecimalRound.doubleValue()), mathContext);
                BigDecimal bigDecimal3 = om.O;
                while (true) {
                    BigDecimal bigDecimalB = lg1.b(bigDecimal2);
                    BigDecimal bigDecimalSubtract = bigDecimalB.subtract(bigDecimalRound);
                    BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
                    if (bigDecimalAbs.compareTo(bigDecimal3) >= 0) {
                        return bigDecimal2;
                    }
                    bigDecimal2 = bigDecimal2.subtract(bigDecimalSubtract.divide(bigDecimalB, mathContext));
                    bigDecimal3 = bigDecimalAbs;
                }
                break;
            case 3:
                return BigDecimal.valueOf(Math.log10(bigDecimal.doubleValue()));
            case 4:
                return BigDecimal.valueOf(Math.log1p(bigDecimal.doubleValue()));
            case 5:
                double dDoubleValue = bigDecimal.doubleValue();
                BigDecimal[] bigDecimalArr = lg1.a;
                return BigDecimal.valueOf(1.0d / (Math.exp(-dDoubleValue) + 1.0d));
            case 6:
                double dDoubleValue2 = bigDecimal.doubleValue();
                BigDecimal[] bigDecimalArr2 = lg1.a;
                return BigDecimal.valueOf(Math.log(1.0d / (1.0d - dDoubleValue2)));
            case 7:
                return bigDecimal.negate();
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return lg1.f(3, bigDecimal);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return bigDecimal.setScale(0, RoundingMode.HALF_EVEN);
            case 10:
                BigDecimal[] bigDecimalArr3 = lg1.a;
                return lg1.a(om.I.subtract(bigDecimal).remainder(om.J, lg1.b));
            case 11:
                return lg1.f(2, bigDecimal);
            case 12:
                return BigDecimal.valueOf(Math.tan(bigDecimal.doubleValue()));
            case 13:
                BigDecimal[] bigDecimalArr4 = lg1.a;
                om.V.getClass();
                BigDecimal bigDecimalB2 = lg1.b(bigDecimal);
                BigDecimal bigDecimalB3 = lg1.b(bigDecimal.negate());
                BigDecimal bigDecimalSubtract2 = bigDecimalB2.subtract(bigDecimalB3);
                BigDecimal bigDecimalAdd = bigDecimalB2.add(bigDecimalB3);
                if (bigDecimalSubtract2.equals(bigDecimalAdd)) {
                    return BigDecimal.ONE;
                }
                if (bigDecimalSubtract2.equals(bigDecimalAdd.negate())) {
                    return BigDecimal.ONE.negate();
                }
                om.U.getClass();
                return bigDecimalSubtract2.divide(bigDecimalAdd, lg1.b);
            case 14:
                return bigDecimal.setScale(0, RoundingMode.CEILING);
            case 15:
                return BigDecimal.valueOf(Math.asin(bigDecimal.doubleValue()));
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return BigDecimal.valueOf(Math.atan(bigDecimal.doubleValue()));
            case 17:
                return bigDecimal;
            case 18:
                BigDecimal[] bigDecimalArr5 = lg1.a;
                return lg1.a(bigDecimal.remainder(om.J, lg1.b));
            case 19:
                return lg1.b(bigDecimal);
            case 20:
                return BigDecimal.valueOf(Math.expm1(bigDecimal.doubleValue()));
            default:
                return bigDecimal.setScale(0, RoundingMode.FLOOR);
        }
    }

    @Override // defpackage.c23
    public final float c(float f) {
        return ((BigDecimal) b(BigDecimal.valueOf(f))).floatValue();
    }
}
