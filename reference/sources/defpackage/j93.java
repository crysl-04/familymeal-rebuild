package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j93 {
    public static final mj1 a;

    static {
        long[] jArr = bd2.a;
        a = new mj1();
    }

    public static final jz a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof jz) {
            return (jz) tag;
        }
        return null;
    }

    public static final l72 b(View view) {
        o20 o20Var;
        kb kbVar;
        if (!view.isAttachedToWindow()) {
            ax0.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objP = rz1.p(view);
        while (objP instanceof View) {
            View view2 = (View) objP;
            if (view2.getId() == 16908290) {
                break;
            }
            objP = view2.getParent();
            view = view2;
        }
        jz jzVarA = a(view);
        m10 m10Var = null;
        if (jzVarA != null) {
            if (jzVarA instanceof l72) {
                return (l72) jzVarA;
            }
            li1.g("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((e93) f93.a.get()).getClass();
        o20 o20Var2 = xf0.h;
        yq2 yq2Var = ib.t;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            o20Var = (o20) ib.t.getValue();
        } else {
            o20Var = (o20) ib.u.get();
            if (o20Var == null) {
                li1.g("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        o20 o20VarI = o20Var.i(o20Var2);
        kb kbVar2 = (kb) o20VarI.m(c5.c0);
        if (kbVar2 != null) {
            kbVar = new kb(kbVar2);
            n31 n31Var = (n31) kbVar.j;
            synchronized (n31Var.b) {
                n31Var.a = false;
            }
        } else {
            kbVar = null;
        }
        x72 x72Var = new x72();
        o20 ah1Var = (zg1) o20VarI.m(c5.d0);
        if (ah1Var == null) {
            ah1Var = new ah1(view.getContext().getApplicationContext());
            x72Var.h = ah1Var;
        }
        if (kbVar != null) {
            o20Var2 = kbVar;
        }
        o20 o20VarI2 = o20VarI.i(o20Var2).i(ah1Var);
        l72 l72Var = new l72(o20VarI2);
        synchronized (l72Var.c) {
            l72Var.t = true;
        }
        k10 k10VarB = vs.b(o20VarI2);
        e91 e91VarI = m02.i(view);
        h91 h91VarG = e91VarI != null ? e91VarI.g() : null;
        if (h91VarG == null) {
            ax0.c("ViewTreeLifecycleOwner not found from " + view);
            wg.k();
            return null;
        }
        view.addOnAttachStateChangeListener(new g93(view, l72Var));
        h91VarG.a(new i93(k10VarB, kbVar, l72Var, x72Var));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, l72Var);
        ur0 ur0Var = ur0.h;
        Handler handler = view.getHandler();
        int i = ts0.a;
        view.addOnAttachStateChangeListener(new r8(ie1.p(ur0Var, new ss0(handler, "windowRecomposer cleanup", false).m, new ha2(l72Var, view, m10Var, (byte) 7), 2), (byte) 4));
        return l72Var;
    }
}
