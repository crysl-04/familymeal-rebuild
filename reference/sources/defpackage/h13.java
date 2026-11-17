package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h13 implements Comparable {
    public final byte h;

    public /* synthetic */ h13(byte b) {
        this.h = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return uz0.i(this.h & 255, ((h13) obj).h & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h13) {
            return this.h == ((h13) obj).h;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.h);
    }

    public final String toString() {
        return String.valueOf(this.h & 255);
    }
}
