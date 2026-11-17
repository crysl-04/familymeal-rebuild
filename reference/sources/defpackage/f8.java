package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f8 implements View.OnDragListener, hc0 {
    public final kc0 a;
    public final bi b;
    public final e8 c;

    public f8() {
        kc0 kc0Var = new kc0();
        kc0Var.x = 0L;
        this.a = kc0Var;
        this.b = new bi(0);
        this.c = new e8(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        g2 g2Var = new g2((Object) dragEvent, (byte) 16);
        int action = dragEvent.getAction();
        xz2 xz2Var = xz2.h;
        bi biVar = this.b;
        kc0 kc0Var = this.a;
        switch (action) {
            case 1:
                t72 t72Var = new t72();
                ic0 ic0Var = new ic0(g2Var, kc0Var, t72Var);
                if (ic0Var.h(kc0Var) == xz2Var) {
                    y02.D(kc0Var, ic0Var);
                }
                boolean z = t72Var.h;
                nh nhVar = new nh(biVar);
                while (nhVar.hasNext()) {
                    ((kc0) nhVar.next()).N0();
                }
                return z;
            case 2:
                kc0Var.M0(g2Var);
                return false;
            case 3:
                return kc0Var.J0();
            case 4:
                p pVar = new p((Object) g2Var, (byte) 17);
                if (pVar.h(kc0Var) == xz2Var) {
                    y02.D(kc0Var, pVar);
                }
                biVar.clear();
                return false;
            case 5:
                kc0Var.K0();
                return false;
            case 6:
                kc0Var.L0();
                return false;
            default:
                return false;
        }
    }
}
