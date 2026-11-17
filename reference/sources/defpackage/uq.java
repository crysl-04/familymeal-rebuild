package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uq extends mw {
    public static final /* synthetic */ long c = hi.a.objectFieldOffset(uq.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    public uq(rq rqVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + rqVar + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
