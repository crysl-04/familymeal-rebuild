package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class la0 {
    public final boolean a;

    public la0(int i) {
        this.a = (i & 4) != 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof la0) && this.a == ((la0) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.a) + ((df2.h.hashCode() + 1221152) * 31)) * 31) + 1231) * 31) + 2) * 31;
    }
}
