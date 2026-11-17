package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nk1 implements qq, x53 {
    public final rq h;
    public final /* synthetic */ ok1 i;

    public nk1(ok1 ok1Var, rq rqVar) {
        this.i = ok1Var;
        this.h = rqVar;
    }

    @Override // defpackage.qq
    public final void B(Object obj) {
        this.h.B(obj);
    }

    @Override // defpackage.x53
    public final void a(qf2 qf2Var, int i) {
        this.h.a(qf2Var, i);
    }

    @Override // defpackage.m10
    public final o20 e() {
        return this.h.l;
    }

    @Override // defpackage.m10
    public final void g(Object obj) {
        this.h.g(obj);
    }

    @Override // defpackage.qq
    public final void j(Object obj, aq0 aq0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ok1.i;
        ok1 ok1Var = this.i;
        atomicReferenceFieldUpdater.set(ok1Var, null);
        z61 z61Var = new z61(ok1Var, this, (byte) 6);
        rq rqVar = this.h;
        rqVar.D(j23.a, rqVar.j, new kw0((Object) z61Var, (byte) 2));
    }

    @Override // defpackage.qq
    public final qf0 k(Object obj, aq0 aq0Var) {
        ok1 ok1Var = this.i;
        kw0 kw0Var = new kw0(ok1Var, this);
        qf0 qf0VarK = this.h.k((j23) obj, kw0Var);
        if (qf0VarK != null) {
            ok1.i.set(ok1Var, null);
        }
        return qf0VarK;
    }

    @Override // defpackage.qq
    public final boolean l(Throwable th) {
        return this.h.l(th);
    }
}
