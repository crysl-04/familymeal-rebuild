package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class jn extends z43 {
    public Executor b;
    public t03 c;
    public gn d;
    public fn e;
    public ix0 f;
    public g2 g;
    public in h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public vi1 n;
    public vi1 o;
    public vi1 p;
    public vi1 q;
    public vi1 r;
    public vi1 s;
    public int t = 0;
    public vi1 u;
    public vi1 v;

    public static void g(vi1 vi1Var, Object obj) {
        boolean z;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            vi1Var.f(obj);
            return;
        }
        synchronized (vi1Var.a) {
            z = vi1Var.f == vi1.k;
            vi1Var.f = obj;
        }
        if (z) {
            vg vgVarV = vg.V();
            q6 q6Var = vi1Var.j;
            c80 c80Var = vgVarV.c;
            if (c80Var.e == null) {
                synchronized (c80Var.c) {
                    if (c80Var.e == null) {
                        c80Var.e = Handler.createAsync(Looper.getMainLooper());
                    }
                }
            }
            c80Var.e.post(q6Var);
        }
    }

    public final void e(int i) {
        vi1 vi1Var = this.u;
        if (vi1Var == null) {
            vi1Var = new vi1();
            this.u = vi1Var;
        }
        g(vi1Var, Integer.valueOf(i));
    }

    public final void f(boolean z) {
        vi1 vi1Var = this.r;
        if (vi1Var == null) {
            vi1Var = new vi1();
            this.r = vi1Var;
        }
        g(vi1Var, Boolean.valueOf(z));
    }
}
