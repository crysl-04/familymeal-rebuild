package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tk2 implements ee0 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public tk2(int i) {
        this.a = i;
    }

    @Override // defpackage.cd
    public final q33 a(s03 s03Var) {
        return new w33(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tk2) && ((tk2) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
