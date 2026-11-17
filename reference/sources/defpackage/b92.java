package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b92 extends rk {
    public b92(m10 m10Var) {
        super(m10Var);
        if (m10Var == null || m10Var.e() == xf0.h) {
            return;
        }
        wg.m("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.m10
    public final o20 e() {
        return xf0.h;
    }
}
