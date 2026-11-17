package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w51 {
    public final /* synthetic */ byte a;
    public final iu1 b;
    public final iu1 c;
    public boolean d;
    public Object e;
    public final x61 f;

    public w51(int i, int i2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new iu1(i);
                this.c = new iu1(i2);
                this.f = new x61(i, 30, 100);
                break;
            default:
                this.b = new iu1(i);
                this.c = new iu1(i2);
                this.f = new x61(i, 90, 200);
                break;
        }
    }

    public final void a(int i, int i2) {
        byte b = this.a;
        iu1 iu1Var = this.c;
        x61 x61Var = this.f;
        iu1 iu1Var2 = this.b;
        switch (b) {
            case 0:
                if (i < 0.0f) {
                    dx0.a("Index should be non-negative");
                }
                iu1Var2.h(i);
                x61Var.a(i);
                iu1Var.h(i2);
                break;
            default:
                if (i < 0.0f) {
                    dx0.a("Index should be non-negative (" + i + ")");
                }
                iu1Var2.h(i);
                x61Var.a(i);
                iu1Var.h(i2);
                break;
        }
    }
}
