package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zm implements Executor {
    public final /* synthetic */ byte h;
    public final Handler i;

    public zm(byte b) {
        this.h = b;
        switch (b) {
            case 1:
                this.i = new Handler(Looper.getMainLooper());
                break;
            default:
                this.i = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.h;
        Handler handler = this.i;
        switch (b) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            default:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public zm(Handler handler) {
        this.h = (byte) 2;
        this.i = handler;
    }
}
