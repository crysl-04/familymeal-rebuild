package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kz2 implements kn2 {
    public final oz2 h;
    public vp0 i;
    public vp0 j;
    public final /* synthetic */ lz2 k;

    public kz2(lz2 lz2Var, oz2 oz2Var, vp0 vp0Var, vp0 vp0Var2) {
        this.k = lz2Var;
        this.h = oz2Var;
        this.i = vp0Var;
        this.j = vp0Var2;
    }

    public final void a(mz2 mz2Var, Object obj, id idVar) {
        Object objH = this.j.h(mz2Var.d());
        boolean zG = this.k.c.g();
        oz2 oz2Var = this.h;
        if (zG) {
            oz2Var.f(this.j.h(mz2Var.b()), objH, (oj0) this.i.h(mz2Var));
        } else {
            oz2Var.g(objH, (oj0) this.i.h(mz2Var), obj, idVar);
        }
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        a(this.k.c.f(), null, null);
        return this.h.q.getValue();
    }
}
