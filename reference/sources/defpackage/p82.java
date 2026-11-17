package defpackage;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p82 extends Thread {
    public final byte h;

    public p82(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.h = (byte) 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.h);
        super.run();
    }
}
