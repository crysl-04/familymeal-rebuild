package defpackage;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements Consumer {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b1(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                ck1 ck1Var = (ck1) obj2;
                af0 af0Var = (af0) obj;
                ck1Var.Y1(af0Var.D0(), 0L, af0Var.A0());
                break;
            case 1:
                v5 v5Var = (v5) obj2;
                u5 u5Var = v5Var.m;
                ((a1) obj).R1(u5Var.o);
                double[] dArr = u5Var.o;
                ab2 ab2Var = v5Var.j;
                lt.M(dArr, ab2Var.b.h);
                ys.T(dArr, 0, dArr.length, 1, ab2Var.a, dArr);
                break;
            default:
                eh0 eh0Var = (eh0) obj;
                ((cm2) obj2).B(eh0Var.a0(), (Comparable) eh0Var.getKey());
                break;
        }
    }
}
