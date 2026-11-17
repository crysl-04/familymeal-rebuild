package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ib extends q20 {
    public static final yq2 t = new yq2(new r3(11));
    public static final gb u = new gb(0);
    public final Choreographer j;
    public final Handler k;
    public boolean p;
    public boolean q;
    public final kb s;
    public final Object l = new Object();
    public final ih m = new ih();
    public ArrayList n = new ArrayList();
    public ArrayList o = new ArrayList();
    public final hb r = new hb(this);

    public ib(Choreographer choreographer, Handler handler) {
        this.j = choreographer;
        this.k = handler;
        this.s = new kb(choreographer, this);
    }

    @Override // defpackage.q20
    public final void e(o20 o20Var, Runnable runnable) {
        synchronized (this.l) {
            this.m.addLast(runnable);
            if (!this.p) {
                this.p = true;
                this.k.post(this.r);
                if (!this.q) {
                    this.q = true;
                    this.j.postFrameCallback(this.r);
                }
            }
        }
    }

    public final void j() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.l) {
                ih ihVar = this.m;
                runnable = (Runnable) (ihVar.isEmpty() ? null : ihVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.l) {
                    ih ihVar2 = this.m;
                    runnable = (Runnable) (ihVar2.isEmpty() ? null : ihVar2.removeFirst());
                }
            }
            synchronized (this.l) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.p = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
