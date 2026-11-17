package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ep0 {
    public final ix0 a;
    public final wk b;
    public final jo0 c;
    public boolean d = false;
    public int e = -1;

    public ep0(ix0 ix0Var, wk wkVar, ClassLoader classLoader, so0 so0Var, Bundle bundle) {
        this.a = ix0Var;
        this.b = wkVar;
        dp0 dp0Var = (dp0) bundle.getParcelable("state");
        jo0 jo0VarA = so0Var.a(dp0Var.h);
        jo0VarA.l = dp0Var.i;
        jo0VarA.u = dp0Var.j;
        jo0VarA.w = dp0Var.k;
        jo0VarA.x = true;
        jo0VarA.E = dp0Var.l;
        jo0VarA.F = dp0Var.m;
        jo0VarA.G = dp0Var.n;
        jo0VarA.J = dp0Var.o;
        jo0VarA.s = dp0Var.p;
        jo0VarA.I = dp0Var.q;
        jo0VarA.H = dp0Var.r;
        jo0VarA.T = x81.values()[dp0Var.s];
        jo0VarA.o = dp0Var.t;
        jo0VarA.p = dp0Var.u;
        jo0VarA.O = dp0Var.v;
        this.c = jo0VarA;
        jo0VarA.i = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        yo0 yo0Var = jo0VarA.A;
        if (yo0Var != null && yo0Var.O()) {
            li1.g("Fragment already added and state has been saved");
            throw null;
        }
        jo0VarA.m = bundle2;
        if (yo0.J(2)) {
            Objects.toString(jo0VarA);
        }
    }

    public final void a() {
        boolean zJ = yo0.J(3);
        jo0 jo0Var = this.c;
        if (zJ) {
            Objects.toString(jo0Var);
        }
        Bundle bundle = jo0Var.i;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        jo0Var.C.Q();
        jo0Var.h = 3;
        jo0Var.L = false;
        jo0Var.a0.O("Fragment#onActivityCreated", new eo0(jo0Var, bundle2));
        if (!jo0Var.L) {
            wg.g(jo0Var, " did not call through to super.onActivityCreated()");
            return;
        }
        if (yo0.J(3)) {
            jo0Var.toString();
        }
        jo0Var.i = null;
        yo0 yo0Var = jo0Var.C;
        yo0Var.H = false;
        yo0Var.I = false;
        yo0Var.O.g = false;
        yo0Var.v(4);
        this.a.r(jo0Var, false);
    }

    public final void b() {
        boolean zJ = yo0.J(3);
        jo0 jo0Var = this.c;
        if (zJ) {
            Objects.toString(jo0Var);
        }
        jo0 jo0Var2 = jo0Var.n;
        ep0 ep0Var = null;
        wk wkVar = this.b;
        if (jo0Var2 != null) {
            ep0 ep0Var2 = (ep0) ((HashMap) wkVar.j).get(jo0Var2.l);
            if (ep0Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(jo0Var);
                jo0 jo0Var3 = jo0Var.n;
                sb.append(" declared target fragment ");
                sb.append(jo0Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            jo0Var.o = jo0Var.n.l;
            jo0Var.n = null;
            ep0Var = ep0Var2;
        } else {
            String str = jo0Var.o;
            if (str != null && (ep0Var = (ep0) ((HashMap) wkVar.j).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(jo0Var);
                sb2.append(" declared target fragment ");
                li1.g(wi0.i(sb2, jo0Var.o, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (ep0Var != null) {
            ep0Var.j();
        }
        yo0 yo0Var = jo0Var.A;
        jo0Var.B = yo0Var.w;
        jo0Var.D = yo0Var.y;
        ix0 ix0Var = this.a;
        ix0Var.x(jo0Var, false);
        ArrayList arrayList = jo0Var.b0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((go0) obj).a();
        }
        arrayList.clear();
        jo0Var.C.b(jo0Var.B, jo0Var.a(), jo0Var);
        jo0Var.h = 0;
        jo0Var.L = false;
        jo0Var.a0.O("Fragment#onAttach", new eo0(jo0Var, (byte) 13));
        if (!jo0Var.L) {
            wg.g(jo0Var, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = jo0Var.A.p.iterator();
        while (it.hasNext()) {
            ((bp0) it.next()).a();
        }
        yo0 yo0Var2 = jo0Var.C;
        yo0Var2.H = false;
        yo0Var2.I = false;
        yo0Var2.O.g = false;
        yo0Var2.v(0);
        ix0Var.s(jo0Var, false);
    }

    public final int c() {
        z70 z70Var;
        jo0 jo0Var = this.c;
        if (jo0Var.A == null) {
            return jo0Var.h;
        }
        int iMin = this.e;
        int iOrdinal = jo0Var.T.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (jo0Var.u) {
            boolean z = jo0Var.v;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
            } else {
                iMin = i < 4 ? Math.min(iMin, jo0Var.h) : Math.min(iMin, 1);
            }
        }
        if (jo0Var.w && jo0Var.M == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!jo0Var.r) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = jo0Var.M;
        if (viewGroup != null) {
            jo0Var.l().I().getClass();
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof z70) {
                z70Var = (z70) tag;
            } else {
                z70Var = new z70(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, z70Var);
            }
            Iterator it = z70Var.b.iterator();
            if (it.hasNext()) {
                throw null;
            }
            Iterator it2 = z70Var.c.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        if (jo0Var.s) {
            iMin = jo0Var.r() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (jo0Var.N && jo0Var.h < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (jo0Var.t) {
            iMin = Math.max(iMin, 3);
        }
        if (yo0.J(2)) {
            Objects.toString(jo0Var);
        }
        return iMin;
    }

    public final void d() {
        Bundle bundle;
        boolean zJ = yo0.J(3);
        jo0 jo0Var = this.c;
        if (zJ) {
            Objects.toString(jo0Var);
        }
        Bundle bundle2 = jo0Var.i;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (jo0Var.R) {
            jo0Var.h = 1;
            Bundle bundle4 = jo0Var.i;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            jo0Var.C.W(bundle);
            yo0 yo0Var = jo0Var.C;
            yo0Var.H = false;
            yo0Var.I = false;
            yo0Var.O.g = false;
            yo0Var.v(1);
            return;
        }
        ix0 ix0Var = this.a;
        ix0Var.y(jo0Var, false);
        jo0Var.C.Q();
        jo0Var.h = 1;
        jo0Var.L = false;
        jo0Var.U.a(new ho0());
        g2 g2Var = jo0Var.a0;
        g2Var.O("Fragment#onCreate", new fo0(jo0Var, bundle3, (byte) 0));
        jo0Var.R = true;
        if (!jo0Var.L) {
            wg.g(jo0Var, " did not call through to super.onCreate()");
        } else {
            g2Var.O("FragmentLifecycle#handleLifecycleEvent(ON_CREATE)", new eo0(jo0Var, (byte) 6));
            ix0Var.t(jo0Var, false);
        }
    }

    public final void e() {
        String resourceName;
        jo0 jo0Var = this.c;
        if (jo0Var.u) {
            return;
        }
        if (yo0.J(3)) {
            Objects.toString(jo0Var);
        }
        Bundle bundle = jo0Var.i;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterY = jo0Var.y(bundle2);
        ViewGroup viewGroup2 = jo0Var.M;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = jo0Var.F;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + jo0Var + " for a container view with no id");
                }
                viewGroup = (ViewGroup) jo0Var.A.x.W(i);
                if (viewGroup == null) {
                    if (!jo0Var.x && !jo0Var.w) {
                        try {
                            resourceName = jo0Var.F().getResources().getResourceName(jo0Var.F);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(jo0Var.F) + " (" + resourceName + ") for fragment " + jo0Var);
                    }
                } else if (!(viewGroup instanceof mo0)) {
                    fp0 fp0Var = gp0.a;
                    gp0.b(new cp0(jo0Var, "Attempting to add fragment " + jo0Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    gp0.a(jo0Var).getClass();
                }
            }
        }
        jo0Var.M = viewGroup;
        jo0Var.E(layoutInflaterY, viewGroup, bundle2);
        jo0Var.h = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        jo0 jo0VarM;
        boolean zJ = yo0.J(3);
        jo0 jo0Var = this.c;
        if (zJ) {
            Objects.toString(jo0Var);
        }
        byte b = 1;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = jo0Var.s && !jo0Var.r();
        wk wkVar = this.b;
        if (objArr2 == true) {
            wkVar.F(jo0Var.l, null);
        } else {
            ap0 ap0Var = (ap0) wkVar.l;
            if (!((ap0Var.b.containsKey(jo0Var.l) && ap0Var.e) ? ap0Var.f : true)) {
                String str = jo0Var.o;
                if (str != null && (jo0VarM = wkVar.m(str)) != null && jo0VarM.J) {
                    jo0Var.n = jo0VarM;
                }
                jo0Var.h = 0;
                return;
            }
        }
        lo0 lo0Var = jo0Var.B;
        boolean z = lo0Var != null ? ((ap0) wkVar.l).f : !lo0Var.m.isChangingConfigurations();
        if (objArr2 != false || z) {
            ap0 ap0Var2 = (ap0) wkVar.l;
            if (yo0.J(3)) {
                ap0Var2.getClass();
                Objects.toString(jo0Var);
            }
            ap0Var2.e(jo0Var.l, false);
        }
        jo0Var.C.m();
        g2 g2Var = jo0Var.a0;
        g2Var.O("FragmentLifecycle#handleLifecycleEvent(ON_DESTROY)", new eo0(jo0Var, (byte) (objArr == true ? 1 : 0)));
        jo0Var.h = 0;
        jo0Var.L = false;
        jo0Var.R = false;
        g2Var.O("Fragment#onDestroy", new eo0(jo0Var, b));
        if (!jo0Var.L) {
            wg.g(jo0Var, " did not call through to super.onDestroy()");
            return;
        }
        this.a.u(jo0Var, false);
        ArrayList arrayListS = wkVar.s();
        int size = arrayListS.size();
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            ep0 ep0Var = (ep0) obj;
            if (ep0Var != null) {
                jo0 jo0Var2 = ep0Var.c;
                if (jo0Var.l.equals(jo0Var2.o)) {
                    jo0Var2.n = jo0Var;
                    jo0Var2.o = null;
                }
            }
        }
        String str2 = jo0Var.o;
        if (str2 != null) {
            jo0Var.n = wkVar.m(str2);
        }
        wkVar.B(this);
    }

    public final void g() {
        boolean zJ = yo0.J(3);
        jo0 jo0Var = this.c;
        if (zJ) {
            Objects.toString(jo0Var);
        }
        g2 g2Var = jo0Var.a0;
        jo0Var.C.v(1);
        jo0Var.h = 1;
        jo0Var.L = false;
        g2Var.O("Fragment#onDestroyView", new eo0(jo0Var, (byte) 5));
        if (!jo0Var.L) {
            wg.g(jo0Var, " did not call through to super.onDestroyView()");
            return;
        }
        dm2 dm2Var = ((mb1) new ix0(jo0Var, jo0Var.f()).j).b;
        if (dm2Var.d() > 0) {
            dm2Var.e(0).getClass();
            li1.c();
            return;
        }
        jo0Var.y = false;
        this.a.D(jo0Var, false);
        jo0Var.M = null;
        jo0Var.W = null;
        jo0Var.X.f(null);
        jo0Var.v = false;
    }

    public final void h() {
        if (yo0.J(3)) {
            Objects.toString(this.c);
        }
        jo0 jo0Var = this.c;
        jo0Var.h = -1;
        jo0Var.L = false;
        jo0Var.a0.O("Fragment#onDetach", new eo0(jo0Var, (byte) 2));
        if (!jo0Var.L) {
            wg.g(jo0Var, " did not call through to super.onDetach()");
            return;
        }
        yo0 yo0Var = jo0Var.C;
        if (!yo0Var.J) {
            yo0Var.m();
            jo0Var.C = new yo0();
        }
        this.a.v(this.c, false);
        jo0 jo0Var2 = this.c;
        jo0Var2.h = -1;
        jo0Var2.B = null;
        jo0Var2.V.b = null;
        jo0 jo0Var3 = this.c;
        jo0Var3.D = null;
        jo0Var3.A = null;
        if (!jo0Var3.s || jo0Var3.r()) {
            ap0 ap0Var = (ap0) this.b.l;
            if (!((ap0Var.b.containsKey(this.c.l) && ap0Var.e) ? ap0Var.f : true)) {
                return;
            }
        }
        if (yo0.J(3)) {
            Objects.toString(this.c);
        }
        this.c.o();
    }

    public final void i() {
        jo0 jo0Var = this.c;
        if (jo0Var.u && jo0Var.v && !jo0Var.y) {
            if (yo0.J(3)) {
                Objects.toString(jo0Var);
            }
            Bundle bundle = jo0Var.i;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            jo0Var.E(jo0Var.y(bundle2), null, bundle2);
        }
    }

    public final void j() {
        wk wkVar = this.b;
        boolean z = this.d;
        jo0 jo0Var = this.c;
        if (z) {
            if (yo0.J(2)) {
                Objects.toString(jo0Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iC = c();
                int i = jo0Var.h;
                if (iC == i) {
                    if (!z2 && i == -1 && jo0Var.s && !jo0Var.r()) {
                        if (yo0.J(3)) {
                            Objects.toString(jo0Var);
                        }
                        ap0 ap0Var = (ap0) wkVar.l;
                        if (yo0.J(3)) {
                            ap0Var.getClass();
                            Objects.toString(jo0Var);
                        }
                        ap0Var.e(jo0Var.l, true);
                        wkVar.B(this);
                        if (yo0.J(3)) {
                            Objects.toString(jo0Var);
                        }
                        jo0Var.o();
                    }
                    if (jo0Var.Q) {
                        yo0 yo0Var = jo0Var.A;
                        if (yo0Var != null && jo0Var.r && yo0.K(jo0Var)) {
                            yo0Var.G = true;
                        }
                        jo0Var.Q = false;
                        jo0Var.C.p();
                    }
                    return;
                }
                if (iC <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            jo0Var.h = 1;
                            break;
                        case 2:
                            jo0Var.v = false;
                            jo0Var.h = 2;
                            break;
                        case 3:
                            if (yo0.J(3)) {
                                Objects.toString(jo0Var);
                            }
                            jo0Var.h = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            jo0Var.h = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            jo0Var.h = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            jo0Var.h = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void k() {
        boolean zJ = yo0.J(3);
        jo0 jo0Var = this.c;
        if (zJ) {
            Objects.toString(jo0Var);
        }
        g2 g2Var = jo0Var.a0;
        yo0 yo0Var = jo0Var.C;
        if (yo0Var.h != null) {
            yo0Var.d();
        }
        yo0Var.v(5);
        g2Var.O("FragmentLifecycle#handleLifecycleEvent(ON_PAUSE)", new eo0(jo0Var, (byte) 14));
        jo0Var.h = 6;
        jo0Var.L = false;
        g2Var.O("Fragment#onPause", new eo0(jo0Var, (byte) 15));
        if (jo0Var.L) {
            this.a.w(jo0Var, false);
        } else {
            wg.g(jo0Var, " did not call through to super.onPause()");
        }
    }

    public final void l(ClassLoader classLoader) {
        jo0 jo0Var = this.c;
        Bundle bundle = jo0Var.i;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (jo0Var.i.getBundle("savedInstanceState") == null) {
                jo0Var.i.putBundle("savedInstanceState", new Bundle());
            }
            try {
                jo0Var.j = jo0Var.i.getSparseParcelableArray("viewState");
                jo0Var.k = jo0Var.i.getBundle("viewRegistryState");
                dp0 dp0Var = (dp0) jo0Var.i.getParcelable("state");
                if (dp0Var != null) {
                    jo0Var.o = dp0Var.t;
                    jo0Var.p = dp0Var.u;
                    jo0Var.O = dp0Var.v;
                }
                if (jo0Var.O) {
                    return;
                }
                jo0Var.N = true;
            } catch (BadParcelableException e) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + jo0Var, e);
            }
        }
    }

    public final void m() {
        byte b = 3;
        boolean zJ = yo0.J(3);
        jo0 jo0Var = this.c;
        if (zJ) {
            Objects.toString(jo0Var);
        }
        io0 io0Var = jo0Var.P;
        View view = io0Var == null ? null : io0Var.i;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        jo0Var.e().i = null;
        jo0Var.C.Q();
        jo0Var.C.A(true);
        jo0Var.h = 7;
        jo0Var.L = false;
        g2 g2Var = jo0Var.a0;
        g2Var.O("Fragment#onResume", new eo0(jo0Var, b));
        if (!jo0Var.L) {
            wg.g(jo0Var, " did not call through to super.onResume()");
            return;
        }
        g2Var.O("FragmentLifecycle#handleLifecycleEvent(ON_RESUME)", new eo0(jo0Var, (byte) 4));
        yo0 yo0Var = jo0Var.C;
        yo0Var.H = false;
        yo0Var.I = false;
        yo0Var.O.g = false;
        yo0Var.v(7);
        this.a.z(jo0Var, false);
        this.b.F(jo0Var.l, null);
        jo0Var.i = null;
        jo0Var.j = null;
        jo0Var.k = null;
    }

    public final void n() {
        boolean zJ = yo0.J(3);
        jo0 jo0Var = this.c;
        if (zJ) {
            Objects.toString(jo0Var);
        }
        jo0Var.C.Q();
        jo0Var.C.A(true);
        jo0Var.h = 5;
        jo0Var.L = false;
        g2 g2Var = jo0Var.a0;
        g2Var.O("Fragment#onStart", new eo0(jo0Var, (byte) 11));
        if (!jo0Var.L) {
            wg.g(jo0Var, " did not call through to super.onStart()");
            return;
        }
        g2Var.O("FragmentLifecycle#handleLifecycleEvent(ON_START)", new eo0(jo0Var, (byte) 12));
        yo0 yo0Var = jo0Var.C;
        yo0Var.H = false;
        yo0Var.I = false;
        yo0Var.O.g = false;
        yo0Var.v(5);
        this.a.B(jo0Var, false);
    }

    public final void o() {
        boolean zJ = yo0.J(3);
        jo0 jo0Var = this.c;
        if (zJ) {
            Objects.toString(jo0Var);
        }
        g2 g2Var = jo0Var.a0;
        yo0 yo0Var = jo0Var.C;
        yo0Var.I = true;
        yo0Var.O.g = true;
        yo0Var.v(4);
        g2Var.O("FragmentLifecycle#handleLifecycleEvent(ON_STOP)", new eo0(jo0Var, (byte) 8));
        jo0Var.h = 4;
        jo0Var.L = false;
        g2Var.O("Fragment#onStop", new eo0(jo0Var, (byte) 9));
        if (jo0Var.L) {
            this.a.C(jo0Var, false);
        } else {
            wg.g(jo0Var, " did not call through to super.onStop()");
        }
    }

    public ep0(ix0 ix0Var, wk wkVar, jo0 jo0Var) {
        this.a = ix0Var;
        this.b = wkVar;
        this.c = jo0Var;
    }

    public ep0(ix0 ix0Var, wk wkVar, jo0 jo0Var, Bundle bundle) {
        this.a = ix0Var;
        this.b = wkVar;
        this.c = jo0Var;
        jo0Var.j = null;
        jo0Var.k = null;
        jo0Var.z = 0;
        jo0Var.v = false;
        jo0Var.r = false;
        jo0 jo0Var2 = jo0Var.n;
        jo0Var.o = jo0Var2 != null ? jo0Var2.l : null;
        jo0Var.n = null;
        jo0Var.i = bundle;
        jo0Var.m = bundle.getBundle("arguments");
    }
}
