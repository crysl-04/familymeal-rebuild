package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lo {
    public final uj1 a;

    public lo(byte b) {
        switch (b) {
            case 1:
                this.a = new uj1(new h61[16]);
                break;
            default:
                this.a = new uj1(new u00[16]);
                break;
        }
    }

    public final void a(CancellationException cancellationException) {
        uj1 uj1Var = this.a;
        int i = uj1Var.j;
        qq[] qqVarArr = new qq[i];
        for (int i2 = 0; i2 < i; i2++) {
            qqVarArr[i2] = ((u00) uj1Var.h[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            qqVarArr[i3].l(cancellationException);
        }
        if (uj1Var.j == 0) {
            return;
        }
        dx0.c("uncancelled requests present");
    }

    public final void b() {
        uj1 uj1Var = this.a;
        qy0 qy0VarS = cy1.S(0, uj1Var.j);
        int i = qy0VarS.h;
        int i2 = qy0VarS.i;
        if (i <= i2) {
            while (true) {
                ((u00) uj1Var.h[i]).b.g(j23.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        uj1Var.g();
    }
}
