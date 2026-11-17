package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s41 implements af1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ vp0 d;
    public final /* synthetic */ t41 e;
    public final /* synthetic */ z41 f;
    public final /* synthetic */ vp0 g;

    public s41(int i, int i2, Map map, vp0 vp0Var, t41 t41Var, z41 z41Var, vp0 vp0Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = vp0Var;
        this.e = t41Var;
        this.f = z41Var;
        this.g = vp0Var2;
    }

    @Override // defpackage.af1
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.af1
    public final void b() {
        fx0 fx0Var;
        l41 l41Var = this.f.h;
        boolean zU = this.e.u();
        vp0 vp0Var = this.g;
        if (!zU || (fx0Var = l41Var.L.c.j0) == null) {
            vp0Var.h(l41Var.L.c.w);
        } else {
            vp0Var.h(fx0Var.w);
        }
    }

    @Override // defpackage.af1
    public final int d() {
        return this.b;
    }

    @Override // defpackage.af1
    public final vp0 e() {
        return this.d;
    }

    @Override // defpackage.af1
    public final int g() {
        return this.a;
    }
}
