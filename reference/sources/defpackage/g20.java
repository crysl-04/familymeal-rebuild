package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g20 implements PointerInputEventHandler {
    public final /* synthetic */ zt2 a;
    public final /* synthetic */ kv2 b;

    public g20(zt2 zt2Var, kv2 kv2Var) {
        this.a = zt2Var;
        this.b = kv2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d12 d12Var, m10 m10Var) {
        Object objX = vs.x(new f20(d12Var, this.a, this.b, null), m10Var);
        return objX == y20.h ? objX : j23.a;
    }
}
