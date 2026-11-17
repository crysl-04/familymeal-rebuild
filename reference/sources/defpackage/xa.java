package defpackage;

import android.view.ActionMode;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ xa(Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                za zaVar = (za) this.i;
                va vaVar = (va) this.j;
                wa waVar = (wa) this.k;
                ActionMode actionModeStartActionMode = zaVar.a.startActionMode(new ok0(vaVar), 1);
                zaVar.h = actionModeStartActionMode;
                if (actionModeStartActionMode == null) {
                    waVar.close();
                    return;
                }
                return;
            case 1:
                lf0 lf0Var = (lf0) this.i;
                dt dtVar = (dt) this.j;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.k;
                try {
                    cn0 cn0VarX = dt.x(lf0Var.a);
                    if (cn0VarX == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    bn0 bn0Var = (bn0) cn0VarX.a;
                    synchronized (bn0Var.c) {
                        try {
                            bn0Var.e = threadPoolExecutor;
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    cn0VarX.a.a(new kf0(dtVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    dtVar.J(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                b bVar = (b) this.i;
                bVar.k.r1((q22) this.j, (gz2) this.k);
                return;
        }
    }
}
