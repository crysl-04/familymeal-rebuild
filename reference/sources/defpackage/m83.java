package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class m83 {
    public static final q83 b;
    public final q83 a;

    static {
        c83 x73Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            x73Var = new b83();
        } else if (i >= 35) {
            x73Var = new a83();
        } else if (i >= 34) {
            x73Var = new z73();
        } else if (i >= 31) {
            x73Var = new y73();
        } else {
            x73Var = i >= 30 ? new x73() : new w73();
        }
        b = x73Var.b().a.a().a.b().a.c();
    }

    public m83(q83 q83Var) {
        this.a = q83Var;
    }

    public q83 a() {
        return this.a;
    }

    public q83 b() {
        return this.a;
    }

    public q83 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m83)) {
            return false;
        }
        m83 m83Var = (m83) obj;
        return s() == m83Var.s() && r() == m83Var.r() && Objects.equals(m(), m83Var.m()) && Objects.equals(k(), m83Var.k()) && Objects.equals(g(), m83Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public za0 g() {
        return null;
    }

    public ox0 h(int i) {
        return ox0.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public ox0 i(int i) {
        if ((i & 8) == 0) {
            return ox0.e;
        }
        wg.m("Unable to query the maximum insets for IME");
        return null;
    }

    public ox0 j() {
        return m();
    }

    public ox0 k() {
        return ox0.e;
    }

    public ox0 l() {
        return m();
    }

    public ox0 m() {
        return ox0.e;
    }

    public ox0 n() {
        return m();
    }

    public q83 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t(int i) {
        return true;
    }

    public void p() {
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void u(cb0 cb0Var) {
    }

    public void v(ox0[] ox0VarArr) {
    }

    public void w(q83 q83Var) {
    }

    public void x(int i) {
    }

    public void y(Rect[][] rectArr) {
    }

    public void z(Rect[][] rectArr) {
    }
}
