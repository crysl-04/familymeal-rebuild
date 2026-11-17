package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c80 extends cy1 {
    public final Object c = new Object();
    public final ExecutorService d = Executors.newFixedThreadPool(4, new b80());
    public volatile Handler e;
}
