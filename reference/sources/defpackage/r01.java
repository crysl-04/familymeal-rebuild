package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public enum r01 {
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN(Boolean.TYPE, 1),
    BYTE(Byte.TYPE, 1),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR(Character.TYPE, 2),
    DOUBLE(Double.TYPE, 8),
    FLOAT(Float.TYPE, 4),
    INT(Integer.TYPE, 4),
    LONG(Long.TYPE, 8),
    REFERENCE(Object.class, 4),
    SHORT(Short.TYPE, 2);

    public final Class h;
    public final byte i;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    r01(Class cls, long j) {
        this.h = cls;
        this.i = (int) j;
    }
}
