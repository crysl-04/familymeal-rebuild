package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dr implements Runnable {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public dr(g2 g2Var, er erVar, lf1 lf1Var, if1 if1Var) {
        this.l = g2Var;
        this.i = erVar;
        this.j = lf1Var;
        this.k = if1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        Object obj = this.l;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        switch (b) {
            case 0:
                fr frVar = (fr) ((g2) obj).i;
                lf1 lf1Var = (lf1) obj3;
                er erVar = (er) obj4;
                if (erVar != null) {
                    frVar.G = true;
                    erVar.b.c(false);
                    frVar.G = false;
                }
                if (lf1Var.isEnabled() && lf1Var.hasSubMenu()) {
                    ((if1) obj2).q(lf1Var, null, 4);
                    break;
                }
                break;
            default:
                r73.i((View) obj4, (v73) obj3, (k42) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public dr(View view, v73 v73Var, k42 k42Var, ValueAnimator valueAnimator) {
        this.i = view;
        this.j = v73Var;
        this.k = k42Var;
        this.l = valueAnimator;
    }
}
