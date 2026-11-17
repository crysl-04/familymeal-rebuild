package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cr2 extends vx0 {
    public vp0 y;
    public u83 z;

    @Override // defpackage.qx0, defpackage.qg1
    public final void B0() {
        View viewF = ou.F(this);
        WeakHashMap weakHashMap = u83.v;
        u83 u83VarO = rz1.o(viewF);
        u83VarO.a(viewF);
        m73 m73Var = (m73) this.y.h(u83VarO);
        if (!uz0.g(m73Var, this.x)) {
            this.x = m73Var;
            K0();
        }
        this.z = u83VarO;
        super.B0();
    }

    @Override // defpackage.qx0, defpackage.qg1
    public final void C0() {
        View viewF = ou.F(this);
        u83 u83Var = this.z;
        if (u83Var != null) {
            int i = u83Var.t - 1;
            u83Var.t = i;
            if (i == 0) {
                WeakHashMap weakHashMap = t43.a;
                o43.c(viewF, null);
                v73.a(viewF, null);
                viewF.removeOnAttachStateChangeListener(u83Var.u);
            }
        }
        super.C0();
    }
}
