package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fz extends az {
    public final t11 c;
    public int d;

    public fz(p4 p4Var, t11 t11Var) {
        super(p4Var);
        this.c = t11Var;
    }

    @Override // defpackage.az
    public final void a() {
        this.a = true;
        this.d++;
    }

    @Override // defpackage.az
    public final void b() {
        this.a = false;
        p4 p4Var = (p4) this.b;
        p4Var.i("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            p4Var.i(this.c.a.d);
        }
    }

    @Override // defpackage.az
    public final void c() {
        if (this.a) {
            this.a = false;
        } else {
            b();
        }
    }

    @Override // defpackage.az
    public final void k() {
        f(' ');
    }

    @Override // defpackage.az
    public final void l() {
        this.d--;
    }
}
