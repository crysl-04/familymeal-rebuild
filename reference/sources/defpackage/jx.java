package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class jx extends Dialog implements e91, km1, dc2 {
    public h91 h;
    public final k42 i;
    public final yq2 j;
    public final yq2 k;

    public jx(Context context, int i) {
        super(context, i);
        this.i = new k42(new cc2(this, new xu1(this, (byte) 6)), (byte) 3);
        final byte b = 0;
        this.j = new yq2(new kp0(this) { // from class: ix
            public final /* synthetic */ jx i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                byte b2 = b;
                jx jxVar = this.i;
                switch (b2) {
                    case 0:
                        qa0 qa0Var = new qa0();
                        jxVar.a().e(qa0Var);
                        return qa0Var;
                    default:
                        return new kq1(new t(jxVar, (byte) 6));
                }
            }
        });
        final byte b2 = 1;
        this.k = new yq2(new kp0(this) { // from class: ix
            public final /* synthetic */ jx i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                byte b3 = b2;
                jx jxVar = this.i;
                switch (b3) {
                    case 0:
                        qa0 qa0Var = new qa0();
                        jxVar.a().e(qa0Var);
                        return qa0Var;
                    default:
                        return new kq1(new t(jxVar, (byte) 6));
                }
            }
        });
    }

    public static final void f(jx jxVar) {
        super.onBackPressed();
    }

    @Override // defpackage.km1
    public final wk a() {
        return d().b().c;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.dc2
    public final k42 b() {
        return (k42) this.i.j;
    }

    public final h91 c() {
        h91 h91Var = this.h;
        if (h91Var != null) {
            return h91Var;
        }
        h91 h91Var2 = new h91(this, true);
        this.h = h91Var2;
        return h91Var2;
    }

    public final kq1 d() {
        return (kq1) this.k.getValue();
    }

    public final void e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.e91
    public final h91 g() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((qa0) this.j.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            kq1 kq1VarD = d();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            kq1VarD.c(onBackInvokedDispatcher);
        }
        this.i.f(bundle);
        c().d(w81.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.i.g(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(w81.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        c().d(w81.ON_DESTROY);
        this.h = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }
}
