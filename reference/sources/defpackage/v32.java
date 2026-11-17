package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v32 extends v implements ds, lh2 {
    public final fp k;

    public v32(o20 o20Var, fp fpVar) {
        super(o20Var, true);
        this.k = fpVar;
    }

    @Override // defpackage.z01
    public final void C(CancellationException cancellationException) {
        this.k.d(cancellationException, true);
        A(cancellationException);
    }

    @Override // defpackage.z01, defpackage.s01
    public final void a(CancellationException cancellationException) {
        Object objN = N();
        if (objN instanceof mw) {
            return;
        }
        if ((objN instanceof y01) && ((y01) objN).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new t01(E(), null, this);
        }
        C(cancellationException);
    }

    @Override // defpackage.lh2
    public final Object c(m10 m10Var, Object obj) {
        return this.k.c(m10Var, obj);
    }

    @Override // defpackage.v
    public final void g0(Throwable th, boolean z) {
        if (this.k.d(th, false) || z) {
            return;
        }
        ls.E(this.j, th);
    }

    @Override // defpackage.v
    public final void h0(Object obj) {
        this.k.d(null, false);
    }

    @Override // defpackage.ds
    public final ep iterator() {
        fp fpVar = this.k;
        fpVar.getClass();
        return new ep(fpVar);
    }

    @Override // defpackage.ds
    public final Object q() {
        return this.k.q();
    }

    @Override // defpackage.lh2
    public final Object s(Object obj) {
        return this.k.s(obj);
    }

    @Override // defpackage.ds
    public final Object v(m10 m10Var) {
        return this.k.v(m10Var);
    }
}
