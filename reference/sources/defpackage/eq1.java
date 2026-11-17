package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eq1 implements OnBackAnimationCallback {
    public final /* synthetic */ dq1 a;

    public eq1(dq1 dq1Var) {
        this.a = dq1Var;
    }

    public final void onBackCancelled() {
        dq1 dq1Var = this.a;
        wk wkVar = dq1Var.a;
        if (wkVar == null) {
            li1.g("This input is not added to any dispatcher.");
            return;
        }
        if (!dq1Var.b) {
            wkVar.h(dq1Var, null);
        }
        om1 om1Var = (om1) wkVar.j;
        if (dq1Var.equals(om1Var.h) && -1 == om1Var.g) {
            lm1 lm1VarC = om1Var.f;
            if (lm1VarC == null) {
                lm1VarC = om1Var.c(-1);
            }
            om1Var.f = null;
            om1Var.g = 0;
            om1Var.h = null;
            if (lm1VarC != null) {
                lm1VarC.a();
            }
            om1Var.a.i(null, pm1.l);
        }
        dq1Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        jm1 jm1VarE0 = es.e0(backEvent);
        dq1 dq1Var = this.a;
        wk wkVar = dq1Var.a;
        if (wkVar == null) {
            li1.g("This input is not added to any dispatcher.");
            return;
        }
        if (dq1Var.b) {
            om1 om1Var = (om1) wkVar.j;
            if (dq1Var.equals(om1Var.h) && -1 == om1Var.g) {
                lm1 lm1VarC = om1Var.f;
                if (lm1VarC == null) {
                    lm1VarC = om1Var.c(-1);
                }
                if (lm1VarC != null) {
                    lm1VarC.c(jm1VarE0);
                }
                om1Var.a.i(null, new qm1(jm1VarE0));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        jm1 jm1VarE0 = es.e0(backEvent);
        dq1 dq1Var = this.a;
        wk wkVar = dq1Var.a;
        if (wkVar == null) {
            li1.g("This input is not added to any dispatcher.");
        } else {
            if (dq1Var.b) {
                return;
            }
            wkVar.h(dq1Var, jm1VarE0);
            dq1Var.b = true;
        }
    }
}
