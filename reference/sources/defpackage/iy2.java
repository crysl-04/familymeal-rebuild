package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class iy2 extends pz1 {
    public boolean d = false;
    public final /* synthetic */ byte e;
    public final /* synthetic */ jy2 f;

    /* JADX WARN: Multi-variable type inference failed */
    public iy2(jy2 jy2Var, int i) {
        this.f = jy2Var;
        this.e = i;
    }

    @Override // defpackage.o53
    public final void a() {
        if (this.d) {
            return;
        }
        this.f.a.setVisibility(this.e);
    }

    @Override // defpackage.pz1, defpackage.o53
    public final void b() {
        this.d = true;
    }

    @Override // defpackage.pz1, defpackage.o53
    public final void c() {
        this.f.a.setVisibility(0);
    }
}
