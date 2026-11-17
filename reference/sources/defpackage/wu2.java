package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wu2 implements PointerInputEventHandler {
    public final /* synthetic */ x20 a;
    public final /* synthetic */ sj1 b;
    public final /* synthetic */ ui1 c;
    public final /* synthetic */ sj1 d;

    public wu2(x20 x20Var, sj1 sj1Var, ui1 ui1Var, sj1 sj1Var2) {
        this.a = x20Var;
        this.b = sj1Var;
        this.c = ui1Var;
        this.d = sj1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d12 d12Var, m10 m10Var) {
        vu2 vu2Var = new vu2(this.a, this.b, this.c, null);
        cb cbVar = new cb(this.d, (byte) 10);
        md0 md0Var = ns2.a;
        Object objX = vs.x(new a9(d12Var, vu2Var, cbVar, new k22(d12Var), null, (byte) 7), m10Var);
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        if (objX != y20Var) {
            objX = j23Var;
        }
        return objX == y20Var ? objX : j23Var;
    }
}
