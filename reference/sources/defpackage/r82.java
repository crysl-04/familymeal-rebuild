package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r82 implements Runnable {
    public final /* synthetic */ byte h = 0;
    public Object i;
    public Object j;
    public Object k;

    public r82(rq rqVar, ga2 ga2Var, ha2 ha2Var) {
        this.i = rqVar;
        this.j = ga2Var;
        this.k = ha2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.h) {
            case 0:
                try {
                    objCall = ((dn0) this.i).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.k).post(new z2((en0) this.j, objCall, (byte) 6, false));
                break;
            default:
                rq rqVar = (rq) this.i;
                try {
                    uz0.w(rqVar.l.t(c5.L), new b9((ga2) this.j, rqVar, (ha2) this.k, null, (byte) 5));
                } catch (Throwable th) {
                    rqVar.l(th);
                }
                break;
        }
    }

    public /* synthetic */ r82() {
    }
}
