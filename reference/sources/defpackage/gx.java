package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.familymeal.app.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gx extends fx implements h53, at0, dc2, km1, x3 {
    public final yq2 A;
    public final c10 i;
    public final eg j;
    public final k42 k;
    public g53 l;
    public final cx m;
    public final yq2 n;
    public final ex o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList t;
    public final CopyOnWriteArrayList u;
    public final CopyOnWriteArrayList v;
    public boolean w;
    public boolean x;
    public final yq2 y;
    public final yq2 z;

    public gx() {
        c10 c10Var = new c10();
        this.i = c10Var;
        final MainActivity mainActivity = (MainActivity) this;
        final byte b = 1;
        this.j = new eg(new vw(mainActivity, b));
        cc2 cc2Var = new cc2(this, new xu1(this, (byte) 6));
        byte b2 = 3;
        k42 k42Var = new k42(cc2Var, (byte) 3);
        this.k = k42Var;
        this.m = new cx(mainActivity);
        this.n = new yq2(new ww(mainActivity, b));
        this.o = new ex(mainActivity);
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.u = new CopyOnWriteArrayList();
        this.v = new CopyOnWriteArrayList();
        this.y = new yq2(new ww(mainActivity, (byte) 2));
        h91 h91Var = this.h;
        if (h91Var == null) {
            li1.g("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final byte b3 = 0;
        h91Var.a(new c91() { // from class: yw
            @Override // defpackage.c91
            public final void e(e91 e91Var, w81 w81Var) {
                Window window;
                View viewPeekDecorView;
                byte b4 = b3;
                MainActivity mainActivity2 = mainActivity;
                switch (b4) {
                    case 0:
                        if (w81Var == w81.ON_STOP && (window = mainActivity2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (w81Var == w81.ON_DESTROY) {
                            mainActivity2.i.b = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                mainActivity2.f().a();
                            }
                            cx cxVar = mainActivity2.m;
                            MainActivity mainActivity3 = cxVar.k;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(cxVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(cxVar);
                        }
                        break;
                }
            }
        });
        this.h.a(new c91() { // from class: yw
            @Override // defpackage.c91
            public final void e(e91 e91Var, w81 w81Var) {
                Window window;
                View viewPeekDecorView;
                byte b4 = b;
                MainActivity mainActivity2 = mainActivity;
                switch (b4) {
                    case 0:
                        if (w81Var == w81.ON_STOP && (window = mainActivity2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (w81Var == w81.ON_DESTROY) {
                            mainActivity2.i.b = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                mainActivity2.f().a();
                            }
                            cx cxVar = mainActivity2.m;
                            MainActivity mainActivity3 = cxVar.k;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(cxVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(cxVar);
                        }
                        break;
                }
            }
        });
        this.h.a(new q72(mainActivity, b));
        cc2Var.a();
        h7.d0(this);
        ((k42) k42Var.j).h("android:support:activity-result", new zw(mainActivity, b3));
        ax axVar = new ax(mainActivity, b3);
        gx gxVar = c10Var.b;
        if (gxVar != null) {
            axVar.a(gxVar);
        }
        c10Var.a.add(axVar);
        this.z = new yq2(new ww(mainActivity, b2));
        this.A = new yq2(new ww(mainActivity, (byte) 4));
    }

    public static final void j(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!uz0.g(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!uz0.g(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.km1
    public final wk a() {
        return h().b().c;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.dc2
    public final k42 b() {
        return (k42) this.k.j;
    }

    @Override // defpackage.at0
    public final e53 c() {
        return (e53) this.z.getValue();
    }

    @Override // defpackage.at0
    public final pi1 d() {
        pi1 pi1Var = new pi1(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = pi1Var.a;
        if (application != null) {
            linkedHashMap.put(d53.d, getApplication());
        }
        linkedHashMap.put(h7.Q, this);
        linkedHashMap.put(h7.R, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(h7.S, extras);
        }
        return pi1Var;
    }

    @Override // defpackage.x3
    public final ex e() {
        return this.o;
    }

    @Override // defpackage.h53
    public final g53 f() {
        if (getApplication() == null) {
            li1.g("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        g53 g53Var = this.l;
        if (g53Var == null) {
            bx bxVar = (bx) getLastNonConfigurationInstance();
            if (bxVar != null) {
                this.l = bxVar.a;
            }
            g53Var = this.l;
            if (g53Var == null) {
                g53Var = new g53();
                this.l = g53Var;
            }
        }
        g53Var.getClass();
        return g53Var;
    }

    @Override // defpackage.e91
    public final h91 g() {
        return this.h;
    }

    public final kq1 h() {
        return (kq1) this.A.getValue();
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.o.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((qa0) this.y.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((p00) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.fx, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.k.f(bundle);
        c10 c10Var = this.i;
        c10Var.b = this;
        Iterator it = c10Var.a.iterator();
        while (it.hasNext()) {
            ((ax) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = o82.h;
        m82.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.j.k).iterator();
        while (it.hasNext()) {
            ((ro0) it.next()).a.l();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.j.k).iterator();
        while (it.hasNext()) {
            if (((ro0) it.next()).a.q()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.w = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.w = false;
            Iterator it = this.s.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((p00) it.next()).accept(new bi1(z));
            }
        } catch (Throwable th) {
            this.w = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.r.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((p00) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.j.k).iterator();
        while (it.hasNext()) {
            ((ro0) it.next()).a.r();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.x = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.x = false;
            Iterator it = this.t.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((p00) it.next()).accept(new hy1(z));
            }
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        jy1 jy1Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        byte b = 0;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            jy1Var = new jy1(b);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            jy1Var = new jy1(b);
        } else {
            jy1Var = new jy1(b);
        }
        Iterator it = this.u.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((p00) it.next()).accept(jy1Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.j.k).iterator();
        while (it.hasNext()) {
            ((ro0) it.next()).a.u();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.o.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        bx bxVar;
        g53 g53Var = this.l;
        if (g53Var == null && (bxVar = (bx) getLastNonConfigurationInstance()) != null) {
            g53Var = bxVar.a;
        }
        if (g53Var == null) {
            return null;
        }
        bx bxVar2 = new bx();
        bxVar2.a = g53Var;
        return bxVar2;
    }

    @Override // defpackage.fx, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        h91 h91Var = this.h;
        if (h91Var != null) {
            h91Var.g(x81.j);
        }
        super.onSaveInstanceState(bundle);
        this.k.g(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((p00) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.v.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                p02.s("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            jp0 jp0Var = (jp0) this.n.getValue();
            synchronized (jp0Var.b) {
                jp0Var.c = true;
                ArrayList arrayList = jp0Var.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((kp0) obj).a();
                }
                jp0Var.d.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.w) {
            return;
        }
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((p00) it.next()).accept(new bi1(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.x) {
            return;
        }
        Iterator it = this.t.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((p00) it.next()).accept(new hy1(z));
        }
    }
}
