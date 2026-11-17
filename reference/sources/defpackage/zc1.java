package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zc1 implements af1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ vp0 d;
    public final /* synthetic */ vp0 e;
    public final /* synthetic */ ad1 f;

    public zc1(int i, int i2, Map map, vp0 vp0Var, vp0 vp0Var2, ad1 ad1Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = vp0Var;
        this.e = vp0Var2;
        this.f = ad1Var;
    }

    @Override // defpackage.af1
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.af1
    public final void b() {
        this.e.h(this.f.w);
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
