package defpackage;

import android.content.Context;
import android.view.View;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends sf1 {
    public final /* synthetic */ byte l = 1;
    public final /* synthetic */ b3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(b3 b3Var, Context context, wo2 wo2Var, View view) {
        super(context, wo2Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = b3Var;
        if ((wo2Var.A.x & 32) != 32) {
            View view2 = b3Var.p;
            this.e = view2 == null ? (View) b3Var.o : view2;
        }
        g2 g2Var = b3Var.D;
        this.h = g2Var;
        qf1 qf1Var = this.i;
        if (qf1Var != null) {
            qf1Var.e(g2Var);
        }
    }

    @Override // defpackage.sf1
    public final void c() {
        byte b = this.l;
        b3 b3Var = this.m;
        switch (b) {
            case 0:
                b3Var.A = null;
                super.c();
                break;
            default:
                if1 if1Var = b3Var.j;
                if (if1Var != null) {
                    if1Var.c(true);
                }
                b3Var.z = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(b3 b3Var, Context context, if1 if1Var, View view) {
        super(context, if1Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = b3Var;
        this.f = 8388613;
        g2 g2Var = b3Var.D;
        this.h = g2Var;
        qf1 qf1Var = this.i;
        if (qf1Var != null) {
            qf1Var.e(g2Var);
        }
    }
}
