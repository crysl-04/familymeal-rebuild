package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hb implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ ib h;

    public hb(ib ibVar) {
        this.h = ibVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.h.k.removeCallbacks(this);
        this.h.j();
        ib ibVar = this.h;
        synchronized (ibVar.l) {
            if (ibVar.q) {
                ibVar.q = false;
                ArrayList arrayList = ibVar.n;
                ibVar.n = ibVar.o;
                ibVar.o = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.j();
        ib ibVar = this.h;
        synchronized (ibVar.l) {
            if (ibVar.n.isEmpty()) {
                ibVar.j.removeFrameCallback(this);
                ibVar.q = false;
            }
        }
    }
}
