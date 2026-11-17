package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk1 implements c91 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ uk1(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.c91
    public final void e(e91 e91Var, w81 w81Var) {
        byte b = this.h;
        int i = 0;
        Object obj = this.i;
        switch (b) {
            case 0:
                xk1 xk1Var = (xk1) obj;
                xk1Var.q = w81Var.a();
                if (xk1Var.c != null) {
                    ArrayList arrayListS0 = dv.S0(xk1Var.f);
                    int size = arrayListS0.size();
                    while (i < size) {
                        Object obj2 = arrayListS0.get(i);
                        i++;
                        pk1 pk1Var = (pk1) obj2;
                        pk1Var.getClass();
                        pk1Var.k = w81Var.a();
                        pk1Var.e();
                    }
                }
                break;
            default:
                cc2 cc2Var = (cc2) obj;
                if (w81Var == w81.ON_START) {
                    cc2Var.h = true;
                } else if (w81Var == w81.ON_STOP) {
                    cc2Var.h = false;
                }
                break;
        }
    }
}
