package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.familymeal.app.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class jo0 implements ComponentCallbacks, View.OnCreateContextMenuListener, e91, h53, at0, dc2 {
    public static final Object e0 = new Object();
    public yo0 A;
    public lo0 B;
    public jo0 D;
    public int E;
    public int F;
    public String G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean L;
    public ViewGroup M;
    public boolean N;
    public io0 P;
    public boolean Q;
    public boolean R;
    public String S;
    public x81 T;
    public h91 U;
    public final c10 V;
    public ip0 W;
    public final vi1 X;
    public fc2 Y;
    public k42 Z;
    public final g2 a0;
    public final ArrayList b0;
    public final go0 c0;
    public final go0 d0;
    public Bundle i;
    public SparseArray j;
    public Bundle k;
    public Bundle m;
    public jo0 n;
    public int p;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;
    public int h = -1;
    public String l = UUID.randomUUID().toString();
    public String o = null;
    public Boolean q = null;
    public yo0 C = new yo0();
    public final boolean K = true;
    public boolean O = true;

    public jo0() {
        new q6(this, (byte) 6);
        this.T = x81.l;
        this.V = new c10();
        this.X = new vi1();
        this.a0 = new g2((Object) this, (byte) 20);
        this.b0 = new ArrayList();
        this.c0 = new go0(this, (byte) 0);
        this.d0 = new go0(this, (byte) 1);
        n();
    }

    public void A() {
        this.L = true;
    }

    public abstract void C();

    public void D() {
        this.L = true;
    }

    public void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.C.Q();
        this.y = true;
        this.W = new ip0(this, f(), new eo0(this, (byte) 7));
        this.a0.O("Fragment#onCreateView", new l6(this, layoutInflater, viewGroup, bundle));
        if (this.W.l == null) {
            this.W = null;
        } else {
            li1.g("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final Context F() {
        Context contextJ = j();
        if (contextJ != null) {
            return contextJ;
        }
        wg.j("Fragment ", this, " not attached to a context.");
        return null;
    }

    public final void G(int i, int i2, int i3, int i4) {
        if (this.P == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        e().b = i;
        e().c = i2;
        e().d = i3;
        e().e = i4;
    }

    public es a() {
        return new ba0(this);
    }

    @Override // defpackage.dc2
    public final k42 b() {
        return (k42) this.Z.j;
    }

    @Override // defpackage.at0
    public final e53 c() {
        Application application = null;
        if (this.A == null) {
            li1.g("Can't access ViewModels from detached fragment");
            return null;
        }
        fc2 fc2Var = this.Y;
        if (fc2Var != null) {
            return fc2Var;
        }
        for (Context applicationContext = F().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
        }
        if (application == null && yo0.J(3)) {
            Objects.toString(F().getApplicationContext());
        }
        fc2 fc2Var2 = new fc2(application, this, this.m);
        this.Y = fc2Var2;
        return fc2Var2;
    }

    @Override // defpackage.at0
    public final pi1 d() {
        Application application;
        Context applicationContext = F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && yo0.J(3)) {
            Objects.toString(F().getApplicationContext());
        }
        pi1 pi1Var = new pi1(0);
        LinkedHashMap linkedHashMap = pi1Var.a;
        if (application != null) {
            linkedHashMap.put(d53.d, application);
        }
        linkedHashMap.put(h7.Q, this);
        linkedHashMap.put(h7.R, this);
        Bundle bundle = this.m;
        if (bundle != null) {
            linkedHashMap.put(h7.S, bundle);
        }
        return pi1Var;
    }

    public final io0 e() {
        io0 io0Var = this.P;
        if (io0Var != null) {
            return io0Var;
        }
        io0 io0Var2 = new io0();
        Object obj = e0;
        io0Var2.f = obj;
        io0Var2.g = obj;
        io0Var2.h = obj;
        io0Var2.i = null;
        this.P = io0Var2;
        return io0Var2;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.h53
    public final g53 f() {
        if (this.A == null) {
            li1.g("Can't access ViewModels from detached fragment");
            return null;
        }
        if (k() == 1) {
            li1.g("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.A.O.d;
        g53 g53Var = (g53) map.get(this.l);
        if (g53Var != null) {
            return g53Var;
        }
        g53 g53Var2 = new g53();
        map.put(this.l, g53Var2);
        return g53Var2;
    }

    @Override // defpackage.e91
    public final h91 g() {
        return this.U;
    }

    public final MainActivity h() {
        lo0 lo0Var = this.B;
        if (lo0Var == null) {
            return null;
        }
        return lo0Var.l;
    }

    public final yo0 i() {
        if (this.B != null) {
            return this.C;
        }
        wg.j("Fragment ", this, " has not been attached yet.");
        return null;
    }

    public final Context j() {
        lo0 lo0Var = this.B;
        if (lo0Var == null) {
            return null;
        }
        return lo0Var.m;
    }

    public final int k() {
        x81 x81Var = this.T;
        return (x81Var == x81.i || this.D == null) ? x81Var.ordinal() : Math.min(x81Var.ordinal(), this.D.k());
    }

    public final yo0 l() {
        yo0 yo0Var = this.A;
        if (yo0Var != null) {
            return yo0Var;
        }
        wg.j("Fragment ", this, " not associated with a fragment manager.");
        return null;
    }

    public final String m(int i) {
        return F().getResources().getString(i);
    }

    public final void n() {
        this.U = new h91(this, true);
        this.Z = new k42(new cc2(this, new xu1(this, (byte) 6)), (byte) 3);
        this.Y = null;
        ArrayList arrayList = this.b0;
        go0 go0Var = this.c0;
        if (!arrayList.contains(go0Var)) {
            if (this.h >= 0) {
                go0Var.a();
            } else {
                arrayList.add(go0Var);
            }
        }
        go0 go0Var2 = this.d0;
        if (arrayList.contains(go0Var2)) {
            return;
        }
        if (this.h >= 0) {
            go0Var2.a();
        } else {
            arrayList.add(go0Var2);
        }
    }

    public final void o() {
        n();
        this.S = this.l;
        this.l = UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.u = false;
        this.v = false;
        this.x = false;
        this.z = 0;
        this.A = null;
        this.C = new yo0();
        this.B = null;
        this.E = 0;
        this.F = 0;
        this.G = null;
        this.H = false;
        this.I = false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.L = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        MainActivity mainActivityH = h();
        if (mainActivityH != null) {
            mainActivityH.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            wg.j("Fragment ", this, " not attached to an activity.");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.L = true;
    }

    public final boolean p() {
        return this.B != null && this.r;
    }

    public final boolean q() {
        if (this.H) {
            return true;
        }
        if (this.A != null) {
            jo0 jo0Var = this.D;
            if (jo0Var == null ? false : jo0Var.q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return this.z > 0;
    }

    public void s() {
        this.L = true;
    }

    public void t(int i, int i2, Intent intent) {
        if (yo0.J(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.E));
        }
        if (this.G != null) {
            sb.append(" tag=");
            sb.append(this.G);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(MainActivity mainActivity) {
        this.L = true;
        lo0 lo0Var = this.B;
        if ((lo0Var == null ? null : lo0Var.l) != null) {
            this.L = true;
        }
    }

    public abstract void v(Bundle bundle);

    public void w() {
        this.L = true;
    }

    public void x() {
        this.L = true;
    }

    public LayoutInflater y(Bundle bundle) {
        lo0 lo0Var = this.B;
        if (lo0Var == null) {
            li1.g("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        MainActivity mainActivity = lo0Var.p;
        LayoutInflater layoutInflaterCloneInContext = mainActivity.getLayoutInflater().cloneInContext(mainActivity);
        layoutInflaterCloneInContext.setFactory2(this.C.f);
        return layoutInflaterCloneInContext;
    }

    public void z() {
        this.L = true;
    }

    public void B(Bundle bundle) {
    }
}
