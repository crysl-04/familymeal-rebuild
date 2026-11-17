package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class an2 implements m10, z20 {
    public final m10 h;
    public final o20 i;

    public an2(m10 m10Var, o20 o20Var) {
        this.h = m10Var;
        this.i = o20Var;
    }

    @Override // defpackage.z20
    public final z20 d() {
        m10 m10Var = this.h;
        if (m10Var instanceof z20) {
            return (z20) m10Var;
        }
        return null;
    }

    @Override // defpackage.m10
    public final o20 e() {
        return this.i;
    }

    @Override // defpackage.m10
    public final void g(Object obj) {
        this.h.g(obj);
    }
}
