package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends do0 {
    public final /* synthetic */ byte q = 1;
    public final /* synthetic */ View r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.r = actionMenuItemView;
    }

    @Override // defpackage.do0
    public final aj2 b() {
        x2 x2Var;
        byte b = this.q;
        View view = this.r;
        switch (b) {
            case 0:
                w2 w2Var = ((ActionMenuItemView) view).p;
                if (w2Var == null || (x2Var = ((y2) w2Var).a.A) == null) {
                    return null;
                }
                return x2Var.a();
            default:
                x2 x2Var2 = ((a3) view).j.z;
                if (x2Var2 != null) {
                    return x2Var2.a();
                }
                return null;
        }
    }

    @Override // defpackage.do0
    public final boolean c() {
        aj2 aj2VarB;
        byte b = this.q;
        View view = this.r;
        switch (b) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                hf1 hf1Var = actionMenuItemView.n;
                return hf1Var != null && hf1Var.a(actionMenuItemView.k) && (aj2VarB = b()) != null && aj2VarB.a();
            default:
                ((a3) view).j.l();
                return true;
        }
    }

    @Override // defpackage.do0
    public final boolean d() {
        switch (this.q) {
            case 1:
                b3 b3Var = ((a3) this.r).j;
                if (b3Var.B != null) {
                    return false;
                }
                b3Var.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(a3 a3Var, a3 a3Var2) {
        super(a3Var2);
        this.r = a3Var;
    }
}
