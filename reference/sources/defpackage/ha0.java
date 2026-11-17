package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ha0 extends n73 {
    public final /* synthetic */ ia0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(ia0 ia0Var) {
        super(1);
        this.j = ia0Var;
    }

    @Override // defpackage.n73
    public final q83 d(q83 q83Var, List list) {
        ia0 ia0Var = this.j;
        if (!ia0Var.t) {
            View childAt = ia0Var.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, ia0Var.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, ia0Var.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return q83Var.a.q(iMax, iMax2, iMax3, iMax4);
            }
        }
        return q83Var;
    }

    @Override // defpackage.n73
    public final k42 e(v73 v73Var, k42 k42Var) {
        ia0 ia0Var = this.j;
        if (!ia0Var.t) {
            View childAt = ia0Var.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, ia0Var.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, ia0Var.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                ox0 ox0VarB = ox0.b(iMax, iMax2, iMax3, iMax4);
                int i = ox0VarB.a;
                ox0 ox0Var = (ox0) k42Var.i;
                int i2 = ox0VarB.b;
                int i3 = ox0VarB.c;
                int i4 = ox0VarB.d;
                return new k42(q83.a(ox0Var, i, i2, i3, i4), q83.a((ox0) k42Var.j, i, i2, i3, i4), (byte) 10);
            }
        }
        return k42Var;
    }
}
