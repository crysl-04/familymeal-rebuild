package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class sf1 {
    public final Context a;
    public final if1 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public vf1 h;
    public qf1 i;
    public rf1 j;
    public int f = 8388611;
    public final rf1 k = new rf1(this);

    public sf1(Context context, if1 if1Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = if1Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final qf1 a() {
        qf1 en2Var = this.i;
        if (en2Var == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                en2Var = new fr(context2, this.e, this.d, this.c);
            } else {
                en2Var = new en2(context2, this.b, this.e, this.d, this.c);
            }
            en2Var.l(this.b);
            en2Var.r(this.k);
            en2Var.n(this.e);
            en2Var.e(this.h);
            en2Var.o(this.g);
            en2Var.p(this.f);
            this.i = en2Var;
        }
        return en2Var;
    }

    public final boolean b() {
        qf1 qf1Var = this.i;
        return qf1Var != null && qf1Var.a();
    }

    public void c() {
        this.i = null;
        rf1 rf1Var = this.j;
        if (rf1Var != null) {
            rf1Var.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        qf1 qf1VarA = a();
        qf1VarA.s(z2);
        if (z) {
            int i3 = this.f;
            View view = this.e;
            WeakHashMap weakHashMap = t43.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            qf1VarA.q(i);
            qf1VarA.t(i2);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            qf1VarA.h = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        qf1VarA.d();
    }
}
