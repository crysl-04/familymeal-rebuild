package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xl implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ry2 b;

    public /* synthetic */ xl(ry2 ry2Var, byte b) {
        this.a = b;
        this.b = ry2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d12 d12Var, m10 m10Var) {
        byte b = this.a;
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        m10 m10Var2 = null;
        ry2 ry2Var = this.b;
        switch (b) {
            case 0:
                Object objX = vs.x(new wl(d12Var, ry2Var, m10Var2, (byte) 0), m10Var);
                return objX == y20Var ? objX : j23Var;
            default:
                Object objX2 = vs.x(new wl(d12Var, ry2Var, m10Var2, (byte) 1), m10Var);
                return objX2 == y20Var ? objX2 : j23Var;
        }
    }
}
