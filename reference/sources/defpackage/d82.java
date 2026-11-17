package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d82 extends r02 {
    public final r02 a;
    public final int b;

    public d82(r02 r02Var, int i) {
        this.a = r02Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d82)) {
            return false;
        }
        d82 d82Var = (d82) obj;
        return d82Var.a.equals(this.a) && d82Var.b == this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
