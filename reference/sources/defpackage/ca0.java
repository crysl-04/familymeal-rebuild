package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.familymeal.app.MainActivity;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ca0 extends jo0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler f0;
    public boolean o0;
    public Dialog q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public final q6 g0 = new q6(this, 3);
    public final z90 h0 = new z90(this);
    public final aa0 i0 = new aa0(this);
    public int j0 = 0;
    public int k0 = 0;
    public boolean l0 = true;
    public boolean m0 = true;
    public int n0 = -1;
    public final g2 p0 = new g2((Object) this, (byte) 15);
    public boolean u0 = false;

    @Override // defpackage.jo0
    public final void B(Bundle bundle) {
        Dialog dialog = this.q0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.j0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.k0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.l0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.m0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.n0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.jo0
    public final void C() {
        this.L = true;
        Dialog dialog = this.q0;
        if (dialog != null) {
            this.r0 = false;
            dialog.show();
            View decorView = this.q0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.jo0
    public final void D() {
        this.L = true;
        Dialog dialog = this.q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.jo0
    public final void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.E(layoutInflater, viewGroup, bundle);
        if (this.q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.q0.onRestoreInstanceState(bundle2);
    }

    public final void H(boolean z) {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        this.t0 = false;
        Dialog dialog = this.q0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.q0.dismiss();
            if (!z) {
                if (Looper.myLooper() == this.f0.getLooper()) {
                    onDismiss(this.q0);
                } else {
                    this.f0.post(this.g0);
                }
            }
        }
        this.r0 = true;
        if (this.n0 < 0) {
            ej ejVar = new ej(l());
            ejVar.o = true;
            ejVar.h(this);
            ejVar.e(true, true);
            return;
        }
        yo0 yo0VarL = l();
        int i = this.n0;
        if (i < 0) {
            wg.m(jp1.h(i, "Bad id: "));
        } else {
            yo0VarL.y(new wo0(yo0VarL, i), true);
            this.n0 = -1;
        }
    }

    public Dialog I() {
        if (yo0.J(3)) {
            toString();
        }
        return new jx(F(), this.k0);
    }

    @Override // defpackage.jo0
    public final es a() {
        return new ba0(this, new ba0(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.r0) {
            return;
        }
        if (yo0.J(3)) {
            toString();
        }
        H(true);
    }

    @Override // defpackage.jo0
    public final void s() {
        this.L = true;
    }

    @Override // defpackage.jo0
    public final void u(MainActivity mainActivity) {
        super.u(mainActivity);
        vi1 vi1Var = this.X;
        vi1Var.getClass();
        vi1.a("observeForever");
        g2 g2Var = this.p0;
        ib1 ib1Var = new ib1(vi1Var, g2Var);
        kb1 kb1Var = (kb1) vi1Var.b.a(g2Var, ib1Var);
        if (kb1Var instanceof jb1) {
            wg.m("Cannot add the same observer with different lifecycles");
            return;
        }
        if (kb1Var == null) {
            ib1Var.d(true);
        }
        if (this.t0) {
            return;
        }
        this.s0 = false;
    }

    @Override // defpackage.jo0
    public void v(Bundle bundle) {
        Bundle bundle2;
        this.L = true;
        Bundle bundle3 = this.i;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.C.W(bundle2);
            yo0 yo0Var = this.C;
            yo0Var.H = false;
            yo0Var.I = false;
            yo0Var.O.g = false;
            yo0Var.v(1);
        }
        yo0 yo0Var2 = this.C;
        if (yo0Var2.v < 1) {
            yo0Var2.H = false;
            yo0Var2.I = false;
            yo0Var2.O.g = false;
            yo0Var2.v(1);
        }
        this.f0 = new Handler();
        this.m0 = this.F == 0;
        if (bundle != null) {
            this.j0 = bundle.getInt("android:style", 0);
            this.k0 = bundle.getInt("android:theme", 0);
            this.l0 = bundle.getBoolean("android:cancelable", true);
            this.m0 = bundle.getBoolean("android:showsDialog", this.m0);
            this.n0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.jo0
    public final void w() {
        this.L = true;
        Dialog dialog = this.q0;
        if (dialog != null) {
            this.r0 = true;
            dialog.setOnDismissListener(null);
            this.q0.dismiss();
            if (!this.s0) {
                onDismiss(this.q0);
            }
            this.q0 = null;
            this.u0 = false;
        }
    }

    @Override // defpackage.jo0
    public final void x() {
        this.L = true;
        if (!this.t0 && !this.s0) {
            this.s0 = true;
        }
        this.X.e(this.p0);
    }

    @Override // defpackage.jo0
    public final LayoutInflater y(Bundle bundle) {
        LayoutInflater layoutInflaterY = super.y(bundle);
        boolean z = this.m0;
        if (z && !this.o0) {
            if (z && !this.u0) {
                try {
                    this.o0 = true;
                    Dialog dialogI = I();
                    this.q0 = dialogI;
                    if (this.m0) {
                        int i = this.j0;
                        if (i == 1 || i == 2) {
                            dialogI.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogI.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogI.requestWindowFeature(1);
                        }
                        Context contextJ = j();
                        if (contextJ != null) {
                            this.q0.setOwnerActivity((Activity) contextJ);
                        }
                        this.q0.setCancelable(this.l0);
                        this.q0.setOnCancelListener(this.h0);
                        this.q0.setOnDismissListener(this.i0);
                        this.u0 = true;
                    } else {
                        this.q0 = null;
                    }
                    this.o0 = false;
                } catch (Throwable th) {
                    this.o0 = false;
                    throw th;
                }
            }
            if (yo0.J(2)) {
                toString();
            }
            Dialog dialog = this.q0;
            if (dialog != null) {
                return layoutInflaterY.cloneInContext(dialog.getContext());
            }
        } else if (yo0.J(2)) {
            toString();
        }
        return layoutInflaterY;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
