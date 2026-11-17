package defpackage;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public enum eq implements TemporalUnit, TemporalAdjuster {
    /* JADX INFO: Fake field, exist only in values array */
    NANOS(ChronoUnit.NANOS, TimeUnit.NANOSECONDS, "ns"),
    /* JADX INFO: Fake field, exist only in values array */
    MICROS(ChronoUnit.MICROS, TimeUnit.MICROSECONDS, "µs"),
    MILLIS(ChronoUnit.MILLIS, TimeUnit.MILLISECONDS, "ms"),
    /* JADX INFO: Fake field, exist only in values array */
    SECOND(ChronoUnit.SECONDS, TimeUnit.SECONDS, "s"),
    /* JADX INFO: Fake field, exist only in values array */
    MINUTE(ChronoUnit.MINUTES, TimeUnit.MINUTES, "min"),
    HOUR(ChronoUnit.HOURS, TimeUnit.HOURS, "h"),
    DAY(ChronoUnit.DAYS, TimeUnit.DAYS, "days"),
    /* JADX INFO: Fake field, exist only in values array */
    WEEK(ChronoUnit.WEEKS, 604800000, "weeks"),
    /* JADX INFO: Fake field, exist only in values array */
    MONTH(ChronoUnit.MONTHS, 2629746000L, "months"),
    /* JADX INFO: Fake field, exist only in values array */
    QUARTER((ChronoUnit) null, 7889238000L, "quarters"),
    /* JADX INFO: Fake field, exist only in values array */
    YEAR(ChronoUnit.YEARS, 31556952000L, "years"),
    /* JADX INFO: Fake field, exist only in values array */
    DECADE(ChronoUnit.DECADES, 315569520000L, "decades"),
    /* JADX INFO: Fake field, exist only in values array */
    CENTURY(ChronoUnit.CENTURIES, 3155695200000L, "centuries"),
    /* JADX INFO: Fake field, exist only in values array */
    MILLENIUM(ChronoUnit.MILLENNIA, 31556952000000L, "millennia");

    public final ChronoUnit h;
    public final long i;
    public final long j;

    eq(ChronoUnit chronoUnit, TimeUnit timeUnit, String str) {
        this.h = chronoUnit;
        this.i = timeUnit.toMillis(1L);
        this.j = timeUnit.toNanos(1L);
    }

    public static Temporal b(Temporal temporal, long j) {
        ChronoField chronoField = ChronoField.YEAR;
        return temporal.with(chronoField, ((Math.floorDiv(temporal.getLong(chronoField), j) * j) + j) - 1).with(TemporalAdjusters.lastDayOfYear());
    }

    public final long a(long j) {
        long jC = c();
        if (jC != 0) {
            j = Math.floorDiv(j, jC) * jC;
        }
        return (c() / 2) + j;
    }

    @Override // java.time.temporal.TemporalUnit
    public final Temporal addTo(Temporal temporal, long j) {
        if (!(temporal instanceof cq)) {
            ChronoUnit chronoUnit = this.h;
            return chronoUnit != null ? chronoUnit.addTo(temporal, j) : ChronoUnit.MONTHS.addTo(temporal, j * 3);
        }
        long j2 = ((cq) temporal).h;
        long j3 = this.i;
        return new cq(j3 == 0 ? Math.floorDiv(this.j * j, 1000000L) + j2 : (j * j3) + j2);
    }

    @Override // java.time.temporal.TemporalAdjuster
    public final Temporal adjustInto(Temporal temporal) {
        if (temporal instanceof cq) {
            return new cq(a(((cq) temporal).h));
        }
        if (temporal instanceof Instant) {
            return Instant.ofEpochMilli(a(((Instant) temporal).toEpochMilli()));
        }
        ChronoField chronoField = ChronoField.NANO_OF_DAY;
        if (temporal.isSupported(chronoField)) {
            long j = HOUR.i;
            long j2 = this.i;
            if (j < j2) {
                temporal = temporal.with(LocalTime.NOON);
            } else if (MILLIS.i < j2) {
                long j3 = temporal.getLong(chronoField);
                temporal = temporal.with(chronoField, j3 - (j3 % this.j));
            }
        }
        switch (ordinal()) {
            case 7:
                return temporal.minus(2L, ChronoUnit.DAYS).with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return temporal.with(TemporalAdjusters.lastDayOfMonth());
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
                return temporal.with(chronoField2, (((temporal.get(chronoField2) - 1) / 3) * 3) + 3).with(TemporalAdjusters.lastDayOfMonth());
            case 10:
                return temporal.with(TemporalAdjusters.lastDayOfYear());
            case 11:
                return b(temporal, 10L);
            case 12:
                return b(temporal, 100L);
            case 13:
                return b(temporal, 1000L);
            default:
                return temporal;
        }
    }

    @Override // java.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        long epochMilli;
        if (!(temporal instanceof cq)) {
            ChronoUnit chronoUnit = this.h;
            return chronoUnit != null ? chronoUnit.between(temporal, temporal2) : ChronoUnit.MONTHS.between(temporal, temporal2) / 3;
        }
        long j = ((cq) temporal).h;
        if (temporal2 instanceof cq) {
            epochMilli = ((cq) temporal2).h;
        } else if (temporal2 instanceof Instant) {
            epochMilli = ((Instant) temporal2).toEpochMilli();
        } else {
            try {
                epochMilli = ((long) temporal2.get(ChronoField.MILLI_OF_SECOND)) + (temporal2.getLong(ChronoField.INSTANT_SECONDS) * 1000);
            } catch (DateTimeException unused) {
                throw new DateTimeException("No millis!");
            }
        }
        long j2 = this.i;
        long j3 = epochMilli - j;
        return j2 == 0 ? (j3 * 1000000) / this.j : j3 / j2;
    }

    public final long c() {
        return this.i;
    }

    @Override // java.time.temporal.TemporalUnit
    public final Duration getDuration() {
        ChronoUnit chronoUnit = this.h;
        return chronoUnit != null ? chronoUnit.getDuration() : ChronoUnit.MONTHS.getDuration().multipliedBy(3L);
    }

    @Override // java.time.temporal.TemporalUnit
    public final boolean isDateBased() {
        ChronoUnit chronoUnit = this.h;
        if (chronoUnit != null) {
            return chronoUnit.isDateBased();
        }
        return true;
    }

    @Override // java.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        ChronoUnit chronoUnit = this.h;
        if (chronoUnit != null) {
            return chronoUnit.isDurationEstimated();
        }
        return true;
    }

    @Override // java.time.temporal.TemporalUnit
    public final boolean isTimeBased() {
        ChronoUnit chronoUnit = this.h;
        if (chronoUnit != null) {
            return chronoUnit.isTimeBased();
        }
        return false;
    }

    eq(ChronoUnit chronoUnit, long j, String str) {
        this.h = chronoUnit;
        this.i = j;
        this.j = TimeUnit.MILLISECONDS.toNanos(j);
    }
}
