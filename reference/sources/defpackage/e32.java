package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e32 implements c23 {
    public final /* synthetic */ byte h;

    @Override // defpackage.c23
    public final double a(double d) {
        switch (this.h) {
            case 0:
                return Math.abs(d);
            case 1:
                return Math.acos(d);
            case 2:
                return Math.log(d);
            case 3:
                return Math.log10(d);
            case 4:
                return Math.log1p(d);
            case 5:
                return -d;
            case 6:
                return Math.cbrt(d);
            case 7:
                return Math.rint(d);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return Math.sin(d);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return Math.sqrt(d);
            case 10:
                return Math.ceil(d);
            case 11:
                return d;
            case 12:
                return Math.cos(d);
            case 13:
                return Math.exp(d);
            case 14:
                return Math.expm1(d);
            default:
                return Math.floor(d);
        }
    }

    @Override // defpackage.c23
    public final Comparable b(Comparable comparable) {
        return Double.valueOf(a(((Double) comparable).doubleValue()));
    }
}
