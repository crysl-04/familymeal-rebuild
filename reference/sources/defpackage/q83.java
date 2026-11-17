package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q83 {
    public static final q83 b;
    public final m83 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = k83.w;
        } else if (i >= 30) {
            b = i83.v;
        } else {
            b = m83.b;
        }
    }

    public q83(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new l83(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new k83(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new j83(this, windowInsets);
        } else if (i >= 30) {
            this.a = new i83(this, windowInsets);
        } else {
            this.a = new g83(this, windowInsets);
        }
    }

    public static ox0 a(ox0 ox0Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, ox0Var.a - i);
        int iMax2 = Math.max(0, ox0Var.b - i2);
        int iMax3 = Math.max(0, ox0Var.c - i3);
        int iMax4 = Math.max(0, ox0Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? ox0Var : ox0.b(iMax, iMax2, iMax3, iMax4);
    }

    public static q83 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        q83 q83Var = new q83(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = t43.a;
            q83 q83VarA = p43.a(view);
            m83 m83Var = q83Var.a;
            m83Var.w(q83VarA);
            View rootView = view.getRootView();
            m83Var.d(rootView);
            m83Var.o(rootView);
            m83Var.p();
            m83Var.x(view.getWindowSystemUiVisibility());
        }
        return q83Var;
    }

    public final WindowInsets b() {
        m83 m83Var = this.a;
        if (m83Var instanceof d83) {
            return ((d83) m83Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q83) {
            return Objects.equals(this.a, ((q83) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        m83 m83Var = this.a;
        if (m83Var == null) {
            return 0;
        }
        return m83Var.hashCode();
    }

    public q83() {
        this.a = new m83(this);
    }
}
