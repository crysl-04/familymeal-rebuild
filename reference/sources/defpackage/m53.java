package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m53 extends pz1 {
    public boolean d = false;
    public int e = 0;
    public final /* synthetic */ n53 f;

    public m53(n53 n53Var) {
        this.f = n53Var;
    }

    @Override // defpackage.o53
    public final void a() {
        int i = this.e + 1;
        this.e = i;
        n53 n53Var = this.f;
        if (i == n53Var.a.size()) {
            pz1 pz1Var = n53Var.d;
            if (pz1Var != null) {
                pz1Var.a();
            }
            this.e = 0;
            this.d = false;
            n53Var.e = false;
        }
    }

    @Override // defpackage.pz1, defpackage.o53
    public final void c() {
        if (this.d) {
            return;
        }
        this.d = true;
        pz1 pz1Var = this.f.d;
        if (pz1Var != null) {
            pz1Var.c();
        }
    }
}
