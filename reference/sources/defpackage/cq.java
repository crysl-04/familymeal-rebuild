package defpackage;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cq implements Temporal, Comparable {
    public final long h;

    public cq(long j) {
        this.h = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.h, ((cq) obj).h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof cq) && this.h == ((cq) obj).h;
    }

    @Override // java.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        long j = this.h;
        if (temporalField == chronoField) {
            return Math.floorDiv(j, 1000L);
        }
        if (temporalField == ChronoField.MILLI_OF_SECOND) {
            return Math.floorMod(j, 1000L);
        }
        if (temporalField == ChronoField.MICRO_OF_SECOND) {
            return Math.floorMod(j, 1000L) * 1000;
        }
        if (temporalField == ChronoField.NANO_OF_SECOND) {
            return Math.floorMod(j, 1000L) * 1000000;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public final int hashCode() {
        long j = this.h;
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.time.temporal.Temporal
    public final boolean isSupported(TemporalUnit temporalUnit) {
        if (temporalUnit instanceof eq) {
            return true;
        }
        if (temporalUnit instanceof ChronoUnit) {
            return ((ChronoUnit) temporalUnit).isTimeBased() || temporalUnit == ChronoUnit.DAYS;
        }
        if (temporalUnit != null) {
            return temporalUnit.isSupportedBy(this);
        }
        return false;
    }

    @Override // java.time.temporal.Temporal
    public final Temporal plus(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? new cq(Instant.ofEpochMilli(this.h).plus(j, temporalUnit).toEpochMilli()) : (cq) temporalUnit.addTo(this, j);
    }

    @Override // java.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        return temporalQuery == TemporalQueries.precision() ? ChronoUnit.MILLIS : super.query(temporalQuery);
    }

    public final String toString() {
        return fn2.a.d(new Date(this.h));
    }

    @Override // java.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        cq cqVar;
        if (temporalUnit instanceof ChronoUnit) {
            return Instant.ofEpochMilli(this.h).until(temporal, temporalUnit);
        }
        Objects.requireNonNull(temporal);
        if (temporal instanceof cq) {
            cqVar = (cq) temporal;
        } else if (temporal instanceof Instant) {
            cqVar = new cq(((Instant) temporal).toEpochMilli());
        } else {
            try {
                cqVar = new cq((temporal.getLong(ChronoField.INSTANT_SECONDS) * 1000) + ((long) temporal.get(ChronoField.MILLI_OF_SECOND)));
            } catch (DateTimeException e) {
                throw new DateTimeException("Unable to obtain CalendarDate from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        return temporalUnit.between(this, cqVar);
    }

    @Override // java.time.temporal.Temporal
    public final Temporal with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (cq) temporalField.adjustInto(this, j);
        }
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        long j2 = this.h;
        if (temporalField == chronoField) {
            return new cq((j * 1000) + Math.floorMod(j2, 1000L));
        }
        ChronoField chronoField2 = ChronoField.MILLI_OF_SECOND;
        if (temporalField == chronoField2) {
            chronoField2.checkValidValue(j);
            return new cq((Math.floorDiv(j2, 1000L) * 1000) + j);
        }
        ChronoField chronoField3 = ChronoField.MICRO_OF_SECOND;
        if (temporalField == chronoField3) {
            chronoField3.checkValidValue(j);
            return new cq((j / 1000) + (Math.floorDiv(j2, 1000L) * 1000));
        }
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        if (temporalField != chronoField4) {
            throw new UnsupportedTemporalTypeException("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        chronoField4.checkValidValue(j);
        return new cq((j / 1000000) + (Math.floorDiv(j2, 1000L) * 1000));
    }

    @Override // java.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.MILLI_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.NANO_OF_SECOND;
        }
        return temporalField.isSupportedBy(this);
    }

    @Override // java.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        return (cq) super.with(temporalAdjuster);
    }
}
