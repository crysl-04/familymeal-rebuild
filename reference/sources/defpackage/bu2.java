package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bu2 implements nv, iq0 {
    public final /* synthetic */ m51 a;

    public bu2(m51 m51Var) {
        this.a = m51Var;
    }

    @Override // defpackage.iq0
    public final hq0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nv) || !(obj instanceof iq0)) {
            return false;
        }
        return this.a.equals(((iq0) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
