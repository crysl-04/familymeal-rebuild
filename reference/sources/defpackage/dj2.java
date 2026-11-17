package defpackage;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dj2 implements Consumer {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ dk1 j;
    public final /* synthetic */ Object k;

    public /* synthetic */ dj2(dk1 dk1Var, int i, Object obj, byte b) {
        this.h = b;
        this.j = dk1Var;
        this.i = i;
        this.k = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.h;
        Object obj2 = this.k;
        int i = this.i;
        switch (b) {
            case 0:
                af0 af0Var = (af0) obj;
                this.j.Y1(((long) i) + ((h1) obj2).k, af0Var.D0(), af0Var.A0());
                break;
            default:
                l52 l52Var = (l52) this.j;
                rm2 rm2Var = (rm2) obj2;
                bf0 bf0Var = (bf0) obj;
                long jQ1 = bf0Var.Q1();
                long jF0 = bf0Var.F0();
                double dA0 = bf0Var.A0();
                long j = i;
                long jMin = Math.min(l52Var.P((int) jQ1), j);
                long j2 = 0;
                while (j2 < jMin) {
                    double dA = l52Var.A((int) ((jQ1 * j) + j2)) * dA0;
                    l52 l52Var2 = l52Var;
                    double d = dA0;
                    if (wo1.t(dA, h32.a) != 0) {
                        rm2Var.I0(j2, jF0, dA);
                    }
                    j2++;
                    l52Var = l52Var2;
                    dA0 = d;
                }
                break;
        }
    }
}
