package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final j0 b;
    public static final j0 c;
    public final CancellationException a;

    static {
        if (p0.k) {
            c = null;
            b = null;
        } else {
            c = new j0(false, null);
            b = new j0(true, null);
        }
    }

    public j0(boolean z, CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
