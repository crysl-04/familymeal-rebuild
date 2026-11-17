package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kf0 extends dt {
    public final /* synthetic */ dt i;
    public final /* synthetic */ ThreadPoolExecutor j;

    public kf0(dt dtVar, ThreadPoolExecutor threadPoolExecutor) {
        this.i = dtVar;
        this.j = threadPoolExecutor;
    }

    @Override // defpackage.dt
    public final void J(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.J(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.dt
    public final void K(wk wkVar) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.K(wkVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
