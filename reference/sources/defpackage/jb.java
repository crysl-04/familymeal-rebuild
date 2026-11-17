package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jb implements Choreographer.FrameCallback {
    public final /* synthetic */ rq h;
    public final /* synthetic */ vp0 i;

    public jb(rq rqVar, kb kbVar, vp0 vp0Var) {
        this.h = rqVar;
        this.i = vp0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object d92Var;
        try {
            d92Var = this.i.h(Long.valueOf(j));
        } catch (Throwable th) {
            d92Var = new d92(th);
        }
        this.h.g(d92Var);
    }
}
