package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hi1 extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        try {
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ReflectiveOperationException e) {
            throw new a42(e, (byte) 0);
        }
    }
}
