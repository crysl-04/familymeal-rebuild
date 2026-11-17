package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d71 {
    public final vp0 a;
    public n31 c;
    public int f;
    public final eg b = new eg((byte) 17);
    public int d = -1;
    public int e = -1;

    public d71(vp0 vp0Var) {
        this.a = vp0Var;
    }

    public final c71 a(int i, long j, boolean z, vp0 vp0Var) {
        n31 n31Var = this.c;
        if (n31Var == null) {
            return ce0.a;
        }
        c22 c22Var = (c22) n31Var.d;
        boolean z2 = c22Var instanceof fa;
        b22 b22Var = new b22(n31Var, i, this.b, vp0Var);
        b22Var.d = new k00(j);
        if (!z2) {
            c22Var.a(b22Var);
        } else if (z) {
            fa faVar = (fa) c22Var;
            faVar.i.add(new l32(1, b22Var));
            if (!faVar.j) {
                faVar.j = true;
                faVar.h.post(faVar);
            }
        } else {
            fa faVar2 = (fa) c22Var;
            faVar2.i.add(new l32(0, b22Var));
            if (!faVar2.j) {
                faVar2.j = true;
                faVar2.h.post(faVar2);
            }
        }
        Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
        return b22Var;
    }
}
