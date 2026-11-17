package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e00 extends f00 {
    public final s92 e;
    public final s92 f;
    public final float[] g;

    public e00(s92 s92Var, s92 s92Var2) {
        float[] fArrU;
        super(s92Var2, s92Var, s92Var2, null);
        this.e = s92Var;
        this.f = s92Var2;
        float[] fArr = y3.c.b;
        g73 g73Var = s92Var.d;
        float[] fArr2 = s92Var.i;
        g73 g73Var2 = s92Var2.d;
        float[] fArr3 = s92Var2.j;
        if (es.u(g73Var, g73Var2)) {
            fArrU = es.U(fArr3, fArr2);
        } else {
            float[] fArrA = g73Var.a();
            float[] fArrA2 = g73Var2.a();
            g73 g73Var3 = s60.U;
            fArrU = es.U(es.u(g73Var2, g73Var3) ? fArr3 : es.R(es.U(es.t(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), s92Var2.i)), es.u(g73Var, g73Var3) ? fArr2 : es.U(es.t(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrU;
    }

    @Override // defpackage.f00
    public final long a(long j) {
        float fG = kv.g(j);
        float f = kv.f(j);
        float fD = kv.d(j);
        float fC = kv.c(j);
        o92 o92Var = this.e.p;
        float fA = (float) o92Var.a(fG);
        float fA2 = (float) o92Var.a(f);
        float fA3 = (float) o92Var.a(fD);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        float f3 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
        float f4 = (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
        s92 s92Var = this.f;
        o92 o92Var2 = s92Var.m;
        return cu.a((float) o92Var2.a(f2), (float) o92Var2.a(f3), (float) o92Var2.a(f4), fC, s92Var);
    }
}
