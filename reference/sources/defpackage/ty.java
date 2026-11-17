package defpackage;

import com.familymeal.app.MainActivity;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ty extends u {
    public final lu1 q;
    public boolean r;

    public ty(MainActivity mainActivity) {
        super(mainActivity);
        this.q = rz1.x(null);
    }

    @Override // defpackage.u
    public final void b(int i, dr0 dr0Var) {
        dr0Var.W(420213850);
        int i2 = (dr0Var.h(this) ? 4 : 2) | i;
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            zp0 zp0Var = (zp0) this.q.getValue();
            if (zp0Var == null) {
                dr0Var.V(-1238823553);
            } else {
                dr0Var.V(98585282);
                zp0Var.f(dr0Var, 0);
            }
            dr0Var.p(false);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s(this, i, (byte) 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ty.class.getName();
    }

    @Override // defpackage.u
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.r;
    }

    public final void setContent(zp0 zp0Var) {
        this.r = true;
        this.q.setValue(zp0Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            e();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
