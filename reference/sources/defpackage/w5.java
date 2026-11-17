package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w5 extends r02 {
    public final int a;

    public w5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w5) && ((w5) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
