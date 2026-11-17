package defpackage;

import android.view.View;
import android.view.ViewGroup;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v93 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final r93 a(u uVar, wy wyVar, nx nxVar) {
        t6 t6Var;
        r93 r93Var;
        Object[] objArr = 0;
        if (xr0.a.compareAndSet(false, true)) {
            fp fpVarA = ls.a(1, 6, null);
            ie1.p(vs.b((o20) ib.t.getValue()), null, new j((Object) fpVarA, (m10) (objArr == true ? 1 : 0), (byte) 10), 3);
            p pVar = new p(fpVarA, (byte) 23);
            synchronized (bl2.c) {
                bl2.i = dv.J0(bl2.i, pVar);
            }
            bl2.c();
        }
        if (uVar.getChildCount() > 0) {
            View childAt = uVar.getChildAt(0);
            t6Var = childAt instanceof t6 ? (t6) childAt : null;
            if (t6Var != null) {
                t6Var.setComposeViewContext(wyVar);
            }
            if (t6Var == null) {
                t6Var = new t6(uVar.getContext(), wyVar);
                uVar.addView(t6Var.getView(), a);
            }
            t6Var.setComposeViewContext(wyVar);
            if (uVar.getComposeViewContext$ui() != null) {
                wyVar.e();
                t6Var.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = t6Var.getTag(R.id.wrapped_composition_tag);
            r93Var = tag instanceof r93 ? (r93) tag : null;
            if (r93Var == null) {
                r93Var = new r93(t6Var, new oz(wyVar.c(), new b23(t6Var.getRoot())));
                t6Var.setTag(R.id.wrapped_composition_tag, r93Var);
            }
            r93Var.f(nxVar);
            t6Var.setFrameEndScheduler$ui(new u93(wyVar.c()));
            return r93Var;
        }
        uVar.removeAllViews();
        t6Var = null;
        if (t6Var == null) {
            t6Var = new t6(uVar.getContext(), wyVar);
            uVar.addView(t6Var.getView(), a);
        }
        t6Var.setComposeViewContext(wyVar);
        if (uVar.getComposeViewContext$ui() != null) {
            wyVar.e();
            t6Var.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = t6Var.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof r93) {
        }
        if (r93Var == null) {
            r93Var = new r93(t6Var, new oz(wyVar.c(), new b23(t6Var.getRoot())));
            t6Var.setTag(R.id.wrapped_composition_tag, r93Var);
        }
        r93Var.f(nxVar);
        t6Var.setFrameEndScheduler$ui(new u93(wyVar.c()));
        return r93Var;
    }
}
