package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bn0 implements hf0 {
    public final Context a;
    public final an0 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public dt g;

    public bn0(Context context, an0 an0Var) {
        m02.c(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = an0Var;
    }

    @Override // defpackage.hf0
    public final void a(dt dtVar) {
        synchronized (this.c) {
            this.g = dtVar;
        }
        synchronized (this.c) {
            if (this.g == null) {
                return;
            }
            ThreadPoolExecutor threadPoolExecutor = this.e;
            if (threadPoolExecutor == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new xz("emojiCompat"));
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                this.f = threadPoolExecutor2;
                this.e = threadPoolExecutor2;
                threadPoolExecutor = threadPoolExecutor2;
            }
            threadPoolExecutor.execute(new t(this, (byte) 7));
        }
    }

    public final void b() {
        synchronized (this.c) {
            this.g = null;
            Handler handler = this.d;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.d = null;
            ThreadPoolExecutor threadPoolExecutor = this.f;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.e = null;
            this.f = null;
        }
    }

    public final sn0 c() {
        try {
            Context context = this.a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            az azVarA = zm0.a(context, Collections.unmodifiableList(arrayList));
            boolean z = azVarA.a;
            if (z) {
                throw new RuntimeException(jp1.i(z ? 1 : 0, "fetchFonts failed (", ")"));
            }
            sn0[] sn0VarArr = (sn0[]) ((List) azVarA.b).get(0);
            if (sn0VarArr == null || sn0VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return sn0VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
