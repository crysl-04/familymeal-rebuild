package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nq implements lo1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ nq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((vp0) obj).getClass().getSimpleName() + '@' + s60.o(this) + ']';
            default:
                return "DisposeOnCancel[" + ((jb0) obj) + ']';
        }
    }
}
