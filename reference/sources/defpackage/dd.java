package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dd implements kn2 {
    public final s03 h;
    public final lu1 i;
    public id j;
    public long k;
    public long l;
    public boolean m;

    public dd(s03 s03Var, Object obj, id idVar, long j, long j2, boolean z) {
        id idVarI;
        this.h = s03Var;
        this.i = rz1.x(obj);
        if (idVar != null) {
            idVarI = ia2.i(idVar);
        } else {
            idVarI = (id) s03Var.a.h(obj);
            idVarI.d();
        }
        this.j = idVarI;
        this.k = j;
        this.l = j2;
        this.m = z;
    }

    public final Object a() {
        return this.h.b.h(this.j);
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        return this.i.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.i.getValue() + ", velocity=" + a() + ", isRunning=" + this.m + ", lastFrameTimeNanos=" + this.k + ", finishedTimeNanos=" + this.l + ")";
    }

    public /* synthetic */ dd(s03 s03Var, Object obj, id idVar, int i) {
        this(s03Var, obj, (i & 4) != 0 ? null : idVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
