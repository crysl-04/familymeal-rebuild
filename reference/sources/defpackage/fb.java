package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fb extends mq2 implements zp0 {
    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((fb) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new fb(2, m10Var);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        m02.y(obj);
        return Choreographer.getInstance();
    }
}
