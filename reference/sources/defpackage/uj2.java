package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uj2 extends qy {
    public Object b;
    public Object c;
    public nj1 d;
    public nj1 e;
    public ds f;
    public final z61 g;
    public final v3 h;

    public uj2() {
        super((byte) 3);
        this.g = new z61(this, (byte) 24);
        s sVar = new s(this, (byte) 22);
        bl2.b(bl2.a);
        synchronized (bl2.c) {
            bl2.h = dv.J0(bl2.h, sVar);
        }
        this.h = new v3(sVar);
    }

    @Override // defpackage.qy
    public final void d(ds dsVar) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.qy
    public final void e() {
        synchronized (this.a) {
            this.b = this.c;
            if (this.e == null) {
                this.d = null;
            } else {
                nj1 nj1Var = this.d;
                if (nj1Var == null) {
                    nj1 nj1Var2 = cd2.a;
                    nj1Var = new nj1();
                    this.d = nj1Var;
                }
                this.d = this.e;
                this.e = nj1Var;
            }
        }
    }

    @Override // defpackage.qy
    public final void f() {
        this.h.b();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.qy
    public final vp0 l(ds dsVar) {
        ds dsVar2 = this.f;
        if (dsVar2 != null && !dsVar2.equals(dsVar)) {
            w12.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = dsVar;
        return this.g;
    }

    @Override // defpackage.qy
    public final void m(ds dsVar) {
        this.f = null;
        this.c = null;
        this.e = null;
        e();
    }
}
