package com.familymeal.app;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.familymeal.app.MainActivity;
import defpackage.ax;
import defpackage.c10;
import defpackage.c30;
import defpackage.dm2;
import defpackage.du;
import defpackage.g2;
import defpackage.g53;
import defpackage.gx;
import defpackage.h91;
import defpackage.hg;
import defpackage.hx;
import defpackage.ip0;
import defpackage.jc2;
import defpackage.jo0;
import defpackage.k42;
import defpackage.li1;
import defpackage.lo0;
import defpackage.ls;
import defpackage.lu1;
import defpackage.m02;
import defpackage.mb1;
import defpackage.nx;
import defpackage.od1;
import defpackage.p00;
import defpackage.p02;
import defpackage.pe0;
import defpackage.qe0;
import defpackage.r02;
import defpackage.re0;
import defpackage.te0;
import defpackage.ty;
import defpackage.ue0;
import defpackage.ve0;
import defpackage.w81;
import defpackage.wg;
import defpackage.wk;
import defpackage.x81;
import defpackage.yo0;
import defpackage.z72;
import defpackage.zq2;
import defpackage.zw;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends gx {
    public static final /* synthetic */ int G = 0;
    public boolean D;
    public boolean E;
    public final g2 B = new g2((Object) new lo0(this), (byte) 19);
    public final h91 C = new h91(this, true);
    public boolean F = true;

    public MainActivity() {
        final byte b = 1;
        ((k42) this.k.j).h("android:support:lifecycle", new zw(this, b));
        final byte b2 = 0;
        this.p.add(new p00(this) { // from class: ko0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.p00
            public final void accept(Object obj) {
                byte b3 = b2;
                MainActivity mainActivity = this.b;
                switch (b3) {
                    case 0:
                        mainActivity.B.I();
                        break;
                    default:
                        mainActivity.B.I();
                        break;
                }
            }
        });
        this.r.add(new p00(this) { // from class: ko0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.p00
            public final void accept(Object obj) {
                byte b3 = b;
                MainActivity mainActivity = this.b;
                switch (b3) {
                    case 0:
                        mainActivity.B.I();
                        break;
                    default:
                        mainActivity.B.I();
                        break;
                }
            }
        });
        ax axVar = new ax(this, b);
        c10 c10Var = this.i;
        c10Var.getClass();
        gx gxVar = c10Var.b;
        if (gxVar != null) {
            axVar.a(gxVar);
        }
        c10Var.a.add(axVar);
    }

    public static boolean k(yo0 yo0Var) {
        boolean zK = false;
        for (jo0 jo0Var : yo0Var.c.v()) {
            if (jo0Var != null) {
                lo0 lo0Var = jo0Var.B;
                if ((lo0Var == null ? null : lo0Var.p) != null) {
                    zK |= k(jo0Var.i());
                }
                ip0 ip0Var = jo0Var.W;
                x81 x81Var = x81.k;
                x81 x81Var2 = x81.j;
                if (ip0Var != null) {
                    ip0Var.a();
                    if (ip0Var.l.h.compareTo(x81Var) >= 0) {
                        jo0Var.W.l.g(x81Var2);
                        zK = true;
                    }
                }
                if (jo0Var.U.h.compareTo(x81Var) >= 0) {
                    jo0Var.U.g(x81Var2);
                    zK = true;
                }
            }
        }
        return zK;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture")) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.D);
        printWriter.print(" mResumed=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        if (getApplication() != null) {
            g53 g53VarF = f();
            g53VarF.getClass();
            c30 c30Var = c30.b;
            c30Var.getClass();
            wk wkVar = new wk(g53VarF, mb1.c, c30Var);
            du duVarA = z72.a(mb1.class);
            String strB = duVarA.b();
            if (strB == null) {
                wg.m("Local and anonymous classes can not be ViewModels");
                return;
            }
            dm2 dm2Var = ((mb1) wkVar.y(duVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
            if (dm2Var.d() > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (dm2Var.d() > 0) {
                    if (dm2Var.e(0) != null) {
                        li1.c();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(dm2Var.b(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((lo0) this.B.i).o.w(str, fileDescriptor, printWriter, strArr);
    }

    public final void l(Bundle bundle) {
        super.onCreate(bundle);
        this.C.d(w81.ON_CREATE);
        yo0 yo0Var = ((lo0) this.B.i).o;
        yo0Var.H = false;
        yo0Var.I = false;
        yo0Var.O.g = false;
        yo0Var.v(1);
    }

    public final void m() {
        g2 g2Var = this.B;
        g2Var.I();
        lo0 lo0Var = (lo0) g2Var.i;
        super.onStart();
        this.F = false;
        if (!this.D) {
            this.D = true;
            yo0 yo0Var = lo0Var.o;
            yo0Var.H = false;
            yo0Var.I = false;
            yo0Var.O.g = false;
            yo0Var.v(4);
        }
        lo0Var.o.A(true);
        this.C.d(w81.ON_START);
        yo0 yo0Var2 = lo0Var.o;
        yo0Var2.H = false;
        yo0Var2.I = false;
        yo0Var2.O.g = false;
        yo0Var2.v(5);
    }

    public final void n() {
        g2 g2Var;
        super.onStop();
        this.F = true;
        do {
            g2Var = this.B;
        } while (k(((lo0) g2Var.i).o));
        yo0 yo0Var = ((lo0) g2Var.i).o;
        yo0Var.I = true;
        yo0Var.O.g = true;
        yo0Var.v(4);
        this.C.d(w81.ON_STOP);
    }

    @Override // defpackage.gx, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.B.I();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.gx, defpackage.fx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        l(bundle);
        getWindow().setFlags(8192, 8192);
        byte b = 28;
        byte b2 = 0;
        zq2 zq2Var = new zq2(0, 0, new jc2(b));
        zq2 zq2Var2 = new zq2(-419430401, -2145707237, new jc2(b));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        te0 ue0Var = ls.j;
        if (ue0Var == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                ue0Var = new ve0();
            } else {
                ue0Var = i >= 30 ? new ue0() : new te0();
            }
            ls.j = ue0Var;
        }
        te0 te0Var = ue0Var;
        pe0 pe0Var = new pe0(te0Var, zq2Var, zq2Var2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                qe0 qe0Var = new qe0(pe0Var, viewGroup.getContext());
                qe0Var.setTag(te0Var);
                qe0Var.setVisibility(8);
                qe0Var.setWillNotDraw(true);
                viewGroup.addView(qe0Var);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof re0) {
                break;
            } else {
                i2 = i3;
            }
        }
        pe0Var.run();
        Window window = getWindow();
        window.getClass();
        te0Var.a(window);
        nx nxVar = new nx(1282765595, true, new od1(this, b2));
        ViewGroup.LayoutParams layoutParams = hx.a;
        View childAt2 = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ty tyVar = childAt2 instanceof ty ? (ty) childAt2 : null;
        if (tyVar != null) {
            tyVar.setParentCompositionContext(null);
            tyVar.setContent(nxVar);
            return;
        }
        ty tyVar2 = new ty(this);
        tyVar2.setParentCompositionContext(null);
        tyVar2.setContent(nxVar);
        View decorView2 = getWindow().getDecorView();
        if (m02.i(decorView2) == null) {
            decorView2.setTag(net.zetetic.database.R.id.view_tree_lifecycle_owner, this);
        }
        if (r02.q(decorView2) == null) {
            decorView2.setTag(net.zetetic.database.R.id.view_tree_view_model_store_owner, this);
        }
        if (p02.y(decorView2) == null) {
            decorView2.setTag(net.zetetic.database.R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(tyVar2, hx.a);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((lo0) this.B.i).o.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((lo0) this.B.i).o.m();
        this.C.d(w81.ON_DESTROY);
    }

    @Override // defpackage.gx, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((lo0) this.B.i).o.k();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.E = false;
        yo0 yo0Var = ((lo0) this.B.i).o;
        if (yo0Var.h != null) {
            yo0Var.d();
        }
        yo0Var.v(5);
        this.C.d(w81.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.C.d(w81.ON_RESUME);
        yo0 yo0Var = ((lo0) this.B.i).o;
        yo0Var.H = false;
        yo0Var.I = false;
        yo0Var.O.g = false;
        yo0Var.v(7);
    }

    @Override // defpackage.gx, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.B.I();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        g2 g2Var = this.B;
        g2Var.I();
        super.onResume();
        this.E = true;
        ((lo0) g2Var.i).o.A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        m();
        lu1 lu1Var = hg.a;
        if (!((Boolean) lu1Var.getValue()).booleanValue() || SystemClock.elapsedRealtime() - hg.c <= 180000) {
            return;
        }
        lu1Var.setValue(Boolean.FALSE);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.B.I();
    }

    @Override // android.app.Activity
    public final void onStop() {
        if (((Boolean) hg.a.getValue()).booleanValue()) {
            hg.c = SystemClock.elapsedRealtime();
        }
        n();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((lo0) this.B.i).o.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}
