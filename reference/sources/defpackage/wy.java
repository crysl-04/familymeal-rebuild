package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.R;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wy {
    public final View a;
    public boolean b;
    public jz c;
    public e91 d;
    public dc2 e;
    public h53 f;
    public final lu0 g;
    public final v82 h;
    public final Configuration i;
    public final lu1 j;
    public final vz1 k;
    public final vz1 l;
    public final ix0 m;
    public final c6 n;
    public final vz1 o;
    public final lu1 p;
    public final sz1 q;
    public final mb r;
    public final n41 s;
    public final i81 t;
    public final zq u;
    public int v;
    public final o9 w;
    public ra x;
    public final vy y;

    public wy(wy wyVar, View view, jz jzVar, e91 e91Var, dc2 dc2Var, h53 h53Var) {
        lu0 lu0Var;
        Configuration configuration;
        lu1 lu1VarX;
        vz1 vz1Var;
        vz1 vz1Var2;
        ix0 ix0Var;
        c6 c6Var;
        vz1 vz1Var3;
        lu1 lu1Var;
        mb mbVar;
        boolean zG = uz0.g(wyVar != null ? wyVar.a.getContext() : null, view.getContext());
        this.a = view;
        this.c = jzVar;
        this.d = e91Var;
        this.e = dc2Var;
        this.f = h53Var;
        if (zG) {
            wyVar.getClass();
            lu0Var = wyVar.g;
        } else {
            lu0Var = new lu0();
        }
        this.g = lu0Var;
        this.h = wyVar != null ? wyVar.h : new v82();
        if (zG) {
            wyVar.getClass();
            configuration = wyVar.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (zG) {
            wyVar.getClass();
            lu1VarX = wyVar.j;
        } else {
            lu1VarX = rz1.x(new Configuration(configuration));
        }
        this.j = lu1VarX;
        if (zG) {
            wyVar.getClass();
            vz1Var = wyVar.k;
        } else {
            Context context = view.getContext();
            vz1Var = new vz1((byte) 18);
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.k = vz1Var;
        if (zG) {
            wyVar.getClass();
            vz1Var2 = wyVar.l;
        } else {
            view.getContext();
            vz1Var2 = new vz1((byte) 21);
        }
        this.l = vz1Var2;
        if (zG) {
            wyVar.getClass();
            ix0Var = wyVar.m;
        } else {
            ix0Var = new ix0((Object) view.getContext(), (byte) 2);
        }
        this.m = ix0Var;
        if (zG) {
            wyVar.getClass();
            c6Var = wyVar.n;
        } else {
            c6Var = new c6(ix0Var);
        }
        this.n = c6Var;
        if (zG) {
            wyVar.getClass();
            vz1Var3 = wyVar.o;
        } else {
            view.getContext();
            vz1Var3 = new vz1((byte) 20);
        }
        this.o = vz1Var3;
        if (zG) {
            wyVar.getClass();
            lu1Var = wyVar.p;
        } else {
            lu1Var = new lu1(dt.y(view.getContext()), vz1.k);
        }
        this.p = lu1Var;
        this.q = view == (wyVar != null ? wyVar.a : null) ? wyVar.q : new sz1(view);
        if (zG) {
            wyVar.getClass();
            mbVar = wyVar.r;
        } else {
            mbVar = new mb(ViewConfiguration.get(view.getContext()));
        }
        this.r = mbVar;
        this.s = wyVar != null ? wyVar.s : new n41();
        this.t = new i81();
        this.u = wyVar != null ? wyVar.u : new zq();
        this.w = new o9(this, (byte) 9);
        this.y = new vy(this);
    }

    public final void a(t6 t6Var, nx nxVar, dr0 dr0Var, int i) {
        dr0Var.W(123858079);
        int i2 = (dr0Var.h(t6Var) ? 4 : 2) | i | (dr0Var.h(nxVar) ? 32 : 16) | (dr0Var.h(this) ? 256 : 128);
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object tag = t6Var.getTag(R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof l21) && !(tag instanceof o21))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = t6Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof l21) || (tag2 instanceof o21))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(dr0Var.v());
                dr0Var.q = true;
                dr0Var.C = true;
                dr0Var.c.b();
                dr0Var.H.b();
                ik2 ik2Var = dr0Var.I;
                fk2 fk2Var = ik2Var.a;
                ik2Var.e = fk2Var.q;
                ik2Var.f = fk2Var.r;
            }
            boolean zF = dr0Var.f(t6Var.getView());
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (zF || objK == yyVar) {
                objK = new q53(t6Var.getView());
                dr0Var.f0(objK);
            }
            q53 q53Var = (q53) objK;
            i42 i42VarA = ob1.a.a(d());
            g42 g42Var = rb1.a;
            g();
            dc2 dc2Var = this.e;
            dc2Var.getClass();
            i42 i42VarA2 = g42Var.a(dc2Var);
            i42 i42VarA3 = i7.d.a(this.g);
            i42 i42VarA4 = i7.e.a(this.h);
            ie0 ie0Var = uz.v;
            boolean zH = dr0Var.h(this);
            Object objK2 = dr0Var.K();
            if (zH || objK2 == yyVar) {
                objK2 = new p((Object) this, (byte) 14);
                dr0Var.f0(objK2);
            }
            i42 i42VarC = ie0Var.c((vp0) objK2);
            i42 i42VarA5 = i7.b.a(t6Var.getContext());
            i42 i42VarA6 = zx0.a.a(set);
            i42 i42VarA7 = i7.a.a(t6Var.getConfiguration());
            ie0 ie0Var2 = sb2.a;
            boolean zH2 = dr0Var.h(t6Var);
            Object objK3 = dr0Var.K();
            if (zH2 || objK3 == yyVar) {
                objK3 = new d6(t6Var, (byte) 3);
                dr0Var.f0(objK3);
            }
            i42 i42VarC2 = ie0Var2.c((vp0) objK3);
            i42 i42VarA8 = i7.f.a(t6Var.getView());
            ie0 ie0Var3 = uz.x;
            boolean zH3 = dr0Var.h(t6Var);
            Object objK4 = dr0Var.K();
            if (zH3 || objK4 == yyVar) {
                objK4 = new d6(t6Var, (byte) 4);
                dr0Var.f0(objK4);
            }
            ys.b(new i42[]{i42VarA, i42VarA2, i42VarA3, i42VarA4, i42VarC, i42VarA5, i42VarA6, i42VarA7, i42VarC2, i42VarA8, ie0Var3.c((vp0) objK4), uz.t.a(t6Var.getViewConfiguration()), st0.a.a(q53Var)}, dt.N(1317454175, new uy(t6Var, this, nxVar), dr0Var), dr0Var, 56);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new uy(this, t6Var, nxVar, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            vy vyVar = this.y;
            context.unregisterComponentCallbacks(vyVar);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(vyVar);
        }
    }

    public final jz c() {
        g();
        jz jzVar = this.c;
        jzVar.getClass();
        return jzVar;
    }

    public final e91 d() {
        g();
        e91 e91Var = this.d;
        e91Var.getClass();
        return e91Var;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            vy vyVar = this.y;
            context.registerComponentCallbacks(vyVar);
            f(view.getResources().getConfiguration());
            this.t.a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(vyVar);
        }
    }

    public final void f(Configuration configuration) {
        int iUpdateFrom = this.i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                ju0 ju0Var = (ju0) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (ju0Var == null || Configuration.needNewResources(iUpdateFrom, ju0Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            v82 v82Var = this.h;
            synchronized (v82Var) {
                v82Var.a.c();
            }
            if ((iUpdateFrom & SQLiteDatabase.CREATE_IF_NECESSARY) != 0) {
                this.p.setValue(dt.y(this.a.getContext()));
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        jz jzVar = this.c;
        View view = this.a;
        if (jzVar == null) {
            jz jzVarA = j93.a(view);
            if (jzVarA == null) {
                Object parent = view.getParent();
                while (jzVarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    jzVarA = j93.a(view2);
                    parent = rz1.p(view2);
                }
            }
            if (jzVarA == null) {
                jzVarA = j93.b(view);
            }
            this.c = jzVarA;
        }
        if (this.d == null) {
            e91 e91VarI = m02.i(view);
            if (e91VarI == null) {
                li1.g("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = e91VarI;
        }
        if (this.e == null) {
            dc2 dc2VarY = p02.y(view);
            if (dc2VarY == null) {
                li1.g("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = dc2VarY;
        }
        if (this.f == null) {
            this.f = r02.q(view);
        }
    }
}
