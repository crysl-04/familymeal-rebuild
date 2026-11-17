package defpackage;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om2 implements Consumer {
    public final /* synthetic */ byte h;
    public final /* synthetic */ zj1 i;
    public final /* synthetic */ Object j;

    public /* synthetic */ om2(zj1 zj1Var, Object obj, byte b) {
        this.h = b;
        this.i = zj1Var;
        this.j = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.h;
        Object obj2 = this.j;
        zj1 zj1Var = this.i;
        switch (b) {
            case 0:
                bf0 bf0Var = (bf0) obj;
                rm2.A0((cm2) zj1Var, bf0Var.Q1(), bf0Var.F0(), (u42) bf0Var.get(), (gz2) obj2);
                break;
            case 1:
                cm2 cm2Var = (cm2) zj1Var;
                gz2 gz2Var = (gz2) obj2;
                bf0 bf0Var2 = (bf0) obj;
                long jQ1 = bf0Var2.Q1();
                long jF0 = bf0Var2.F0();
                double dA0 = bf0Var2.A0();
                long jH1 = gz2Var.h1();
                long j = jQ1 * jH1;
                long j2 = j + jH1;
                int iQ1 = cm2Var.Q1((int) j);
                if (iQ1 < 0) {
                    iQ1 = -(iQ1 + 1);
                }
                int iQ2 = cm2Var.Q1((int) j2);
                if (iQ2 < 0) {
                    iQ2 = -(iQ2 + 1);
                }
                int i = iQ2;
                for (int i2 = iQ1; i2 < i; i2++) {
                    gz2Var.I0(((long) cm2Var.l[i2]) % jH1, jF0, cm2Var.n.A(i2) * dA0);
                }
                break;
            case 2:
                bf0 bf0Var3 = (bf0) obj;
                rm2.A0((cm2) zj1Var, bf0Var3.Q1(), bf0Var3.F0(), (uw) bf0Var3.get(), (gz2) obj2);
                break;
            case 3:
                bf0 bf0Var4 = (bf0) obj;
                rm2.A0((cm2) zj1Var, bf0Var4.Q1(), bf0Var4.F0(), (z52) bf0Var4.get(), (gz2) obj2);
                break;
            default:
                dk1 dk1Var = (dk1) zj1Var;
                af0 af0Var = (af0) obj;
                dk1Var.Y1(((h1) obj2).k, af0Var.D0(), af0Var.A0());
                break;
        }
    }
}
