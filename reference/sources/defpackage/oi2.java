package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oi2 implements jb0 {
    public final qi2 h;
    public final long i;
    public final Object j;
    public final rq k;

    public oi2(qi2 qi2Var, long j, Object obj, rq rqVar) {
        this.h = qi2Var;
        this.i = j;
        this.j = obj;
        this.k = rqVar;
    }

    @Override // defpackage.jb0
    public final void a() {
        qi2 qi2Var = this.h;
        synchronized (qi2Var) {
            if (this.i < qi2Var.o()) {
                return;
            }
            Object[] objArr = qi2Var.o;
            objArr.getClass();
            long j = this.i;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            tz0.H(objArr, j, tz0.i0);
            qi2Var.i();
        }
    }
}
