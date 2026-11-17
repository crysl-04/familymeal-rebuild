package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r9 implements x20 {
    public final View h;
    public final aw2 i;
    public final x20 j;
    public final AtomicReference k = new AtomicReference(null);

    public r9(View view, aw2 aw2Var, x20 x20Var) {
        this.h = view;
        this.i = aw2Var;
        this.j = x20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(q81 q81Var, n10 n10Var) {
        p9 p9Var;
        if (n10Var instanceof p9) {
            p9Var = (p9) n10Var;
            int i = p9Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                p9Var.m = i - Integer.MIN_VALUE;
            } else {
                p9Var = new p9(this, n10Var);
            }
        } else {
            p9Var = new p9(this, n10Var);
        }
        Object obj = p9Var.k;
        int i2 = p9Var.m;
        byte b = 1;
        if (i2 == 0) {
            m02.y(obj);
            g gVar = new g(q81Var, this, b);
            m10 m10Var = null;
            h hVar = new h((Object) this, m10Var, (byte) 2);
            p9Var.m = 1;
            if (vs.x(new hd0((Object) gVar, (Object) this.k, (Object) hVar, m10Var, (byte) 5), p9Var) == y20.h) {
                return;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            m02.y(obj);
        }
        wg.k();
    }

    @Override // defpackage.x20
    public final o20 f() {
        return this.j.f();
    }
}
