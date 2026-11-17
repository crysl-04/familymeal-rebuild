package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u83 {
    public static final WeakHashMap v = new WeakHashMap();
    public final pb a;
    public final pb b;
    public final pb c;
    public final pb d;
    public final pb e;
    public final pb f;
    public final pb g;
    public final pb h;
    public final pb i;
    public final d33 j;
    public final lu1 k;
    public final d33 l;
    public final d33 m;
    public final d33 n;
    public final d33 o;
    public final d33 p;
    public final d33 q;
    public final d33 r;
    public final boolean s;
    public int t;
    public final sx0 u;

    public u83(View view) {
        pb pbVar = new pb(4, "captionBar");
        this.a = pbVar;
        pb pbVar2 = new pb(128, "displayCutout");
        this.b = pbVar2;
        pb pbVar3 = new pb(8, "ime");
        this.c = pbVar3;
        pb pbVar4 = new pb(32, "mandatorySystemGestures");
        this.d = pbVar4;
        pb pbVar5 = new pb(2, "navigationBars");
        this.e = pbVar5;
        pb pbVar6 = new pb(1, "statusBars");
        this.f = pbVar6;
        pb pbVar7 = new pb(519, "systemBars");
        this.g = pbVar7;
        pb pbVar8 = new pb(16, "systemGestures");
        this.h = pbVar8;
        pb pbVar9 = new pb(64, "tappableElement");
        this.i = pbVar9;
        d33 d33Var = new d33(new xx0(0, 0, 0, 0), "waterfall");
        this.j = d33Var;
        this.k = rz1.x(null);
        new i23(new i23(new i23(pbVar7, pbVar3), pbVar2), new i23(new i23(new i23(pbVar9, pbVar4), pbVar8), d33Var));
        this.l = rz1.F(4, "captionBarIgnoringVisibility");
        this.m = rz1.F(2, "navigationBarsIgnoringVisibility");
        this.n = rz1.F(1, "statusBarsIgnoringVisibility");
        this.o = rz1.F(519, "systemBarsIgnoringVisibility");
        this.p = rz1.F(64, "tappableElementIgnoringVisibility");
        this.q = new d33(new xx0(0, 0, 0, 0), "imeAnimationTarget");
        this.r = new d33(new xx0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.s = bool != null ? bool.booleanValue() : false;
        this.u = new sx0(this);
        WeakHashMap weakHashMap = t43.a;
        q83 q83VarA = p43.a(view);
        if (q83VarA != null) {
            m83 m83Var = q83VarA.a;
            pbVar.f(m83Var.t(4));
            pbVar2.f(m83Var.t(128));
            pbVar3.f(m83Var.t(8));
            pbVar4.f(m83Var.t(32));
            pbVar5.f(m83Var.t(2));
            pbVar6.f(m83Var.t(1));
            pbVar7.f(m83Var.t(519));
            pbVar8.f(m83Var.t(16));
            pbVar9.f(m83Var.t(64));
        }
    }

    public static void b(u83 u83Var, q83 q83Var) {
        boolean z = false;
        u83Var.a.g(q83Var, 0);
        u83Var.c.g(q83Var, 0);
        u83Var.b.g(q83Var, 0);
        u83Var.e.g(q83Var, 0);
        u83Var.f.g(q83Var, 0);
        u83Var.g.g(q83Var, 0);
        u83Var.h.g(q83Var, 0);
        u83Var.i.g(q83Var, 0);
        u83Var.d.g(q83Var, 0);
        u83Var.l.f(p02.L(q83Var.a.i(4)));
        u83Var.m.f(p02.L(q83Var.a.i(2)));
        u83Var.n.f(p02.L(q83Var.a.i(1)));
        u83Var.o.f(p02.L(q83Var.a.i(519)));
        u83Var.p.f(p02.L(q83Var.a.i(64)));
        za0 za0VarG = q83Var.a.g();
        u83Var.j.f(p02.L(za0VarG != null ? za0VarG.a() : ox0.e));
        l9 l9Var = null;
        if (za0VarG != null) {
            Path pathC = Build.VERSION.SDK_INT >= 31 ? m7.c(za0VarG.a) : null;
            if (pathC != null) {
                l9Var = new l9(pathC);
            }
        }
        u83Var.k.setValue(l9Var);
        synchronized (bl2.c) {
            nj1 nj1Var = bl2.j.h;
            if (nj1Var != null && nj1Var.h()) {
                z = true;
            }
        }
        if (z) {
            bl2.c();
        }
    }

    public final void a(View view) {
        if (this.t == 0) {
            sx0 sx0Var = this.u;
            sx0Var.k = false;
            sx0Var.l = false;
            sx0Var.m = null;
            WeakHashMap weakHashMap = t43.a;
            o43.c(view, sx0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(sx0Var);
            v73.a(view, sx0Var);
        }
        this.t++;
    }
}
