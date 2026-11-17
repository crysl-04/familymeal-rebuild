package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ep implements x53 {
    public Object h = hp.p;
    public rq i;
    public final /* synthetic */ fp j;

    public ep(fp fpVar) {
        this.j = fpVar;
    }

    @Override // defpackage.x53
    public final void a(qf2 qf2Var, int i) {
        rq rqVar = this.i;
        if (rqVar != null) {
            rqVar.a(qf2Var, i);
        }
    }

    public final Object b(n10 n10Var) throws Throwable {
        os osVarH;
        Object obj = this.h;
        boolean z = true;
        if (obj == hp.p || obj == hp.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fp.m;
            fp fpVar = this.j;
            os osVar = (os) atomicReferenceFieldUpdater.get(fpVar);
            while (!fpVar.u()) {
                long andIncrement = fp.j.getAndIncrement(fpVar);
                long j = hp.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (osVar.d != j2) {
                    osVarH = fpVar.h(j2, osVar);
                    if (osVarH == null) {
                        continue;
                    }
                } else {
                    osVarH = osVar;
                }
                Object objF = fpVar.F(osVarH, i, andIncrement, null);
                qf0 qf0Var = hp.m;
                if (objF == qf0Var) {
                    li1.g("unreachable");
                    return null;
                }
                qf0 qf0Var2 = hp.o;
                if (objF == qf0Var2) {
                    if (andIncrement < fpVar.o()) {
                        osVarH.a();
                    }
                    osVar = osVarH;
                } else {
                    if (objF == hp.n) {
                        fp fpVar2 = this.j;
                        rq rqVarK = uz0.k(ls.F(n10Var));
                        try {
                            this.i = rqVarK;
                            Object objF2 = fpVar2.F(osVarH, i, andIncrement, this);
                            if (objF2 != qf0Var) {
                                if (objF2 == qf0Var2) {
                                    if (andIncrement < fpVar2.o()) {
                                        osVarH.a();
                                    }
                                    os osVar2 = (os) fp.m.get(fpVar2);
                                    while (true) {
                                        if (fpVar2.u()) {
                                            rq rqVar = this.i;
                                            rqVar.getClass();
                                            this.i = null;
                                            this.h = hp.l;
                                            Throwable thK = fpVar.k();
                                            if (thK != null) {
                                                rqVar.g(new d92(thK));
                                                break;
                                            }
                                            rqVar.g(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = fp.j.getAndIncrement(fpVar2);
                                        long j3 = hp.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (osVar2.d != j4) {
                                            os osVarH2 = fpVar2.h(j4, osVar2);
                                            if (osVarH2 != null) {
                                                osVar2 = osVarH2;
                                            } else {
                                                continue;
                                            }
                                        }
                                        Object objF3 = fpVar2.F(osVar2, i2, andIncrement2, this);
                                        if (objF3 == hp.m) {
                                            a(osVar2, i2);
                                            break;
                                        }
                                        if (objF3 == hp.o) {
                                            if (andIncrement2 < fpVar2.o()) {
                                                osVar2.a();
                                            }
                                        } else {
                                            if (objF3 == hp.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            osVar2.a();
                                            this.h = objF3;
                                        }
                                    }
                                } else {
                                    osVarH.a();
                                    this.h = objF2;
                                }
                                this.i = null;
                                rqVarK.j(Boolean.TRUE, null);
                                break;
                            }
                            a(osVarH, i);
                            return rqVarK.t();
                        } catch (Throwable th) {
                            rqVarK.C();
                            throw th;
                        }
                    }
                    osVarH.a();
                    this.h = objF;
                }
            }
            this.h = hp.l;
            Throwable thK2 = fpVar.k();
            if (thK2 != null) {
                int i3 = bn2.a;
                throw thK2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.h;
        qf0 qf0Var = hp.p;
        if (obj == qf0Var) {
            li1.g("`hasNext()` has not been invoked");
            return null;
        }
        this.h = qf0Var;
        if (obj != hp.l) {
            return obj;
        }
        Throwable thL = this.j.l();
        int i = bn2.a;
        throw thL;
    }
}
