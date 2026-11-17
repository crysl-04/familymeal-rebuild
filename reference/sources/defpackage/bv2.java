package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bv2 {
    public static final k42 g = es.T(new kc2((byte) 25), new ss2(8));
    public final hu1 a;
    public final hu1 b = new hu1(0.0f);
    public final iu1 c = new iu1(0);
    public r72 d = r72.e;
    public long e = qw2.b;
    public final lu1 f;

    public bv2(ks1 ks1Var, float f) {
        this.a = new hu1(f);
        this.f = new lu1(ks1Var, vz1.s);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    public final void a(ks1 ks1Var, r72 r72Var, int i, int i2) {
        float f;
        float f2;
        float f3 = i2 - i;
        this.b.h(f3);
        float f4 = r72Var.a;
        float f5 = r72Var.b;
        r72 r72Var2 = this.d;
        float f6 = r72Var2.a;
        hu1 hu1Var = this.a;
        if (f4 != f6 || f5 != r72Var2.b) {
            if (ks1Var == ks1.h) {
                f = r72Var.d;
                f4 = f5;
            } else {
                f = r72Var.c;
            }
            float fG = hu1Var.g();
            float f7 = i;
            float f8 = fG + f7;
            if (f > f8) {
                f2 = f - f8;
            } else if (f4 < fG) {
                float f9 = f - f4;
                if (f9 > f7) {
                    f2 = f - f8;
                } else if (f9 <= f7) {
                    f2 = f4 - fG;
                } else {
                    f2 = 0.0f;
                }
            } else {
                f2 = 0.0f;
            }
            hu1Var.h(hu1Var.g() + f2);
            this.d = r72Var;
        }
        hu1Var.h(cy1.m(hu1Var.g(), 0.0f, f3));
        this.c.h(i);
    }
}
