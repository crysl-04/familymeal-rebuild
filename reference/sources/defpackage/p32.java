package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p32 {
    public final int a;

    public p32(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p32) {
            return this.a == ((p32) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
