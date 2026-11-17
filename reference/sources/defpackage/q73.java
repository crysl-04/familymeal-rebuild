package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q73 implements View.OnApplyWindowInsetsListener {
    public final n73 a;
    public q83 b;

    public q73(View view, n73 n73Var) {
        q83 q83VarB;
        this.a = n73Var;
        WeakHashMap weakHashMap = t43.a;
        q83 q83VarA = p43.a(view);
        if (q83VarA != null) {
            int i = Build.VERSION.SDK_INT;
            q83VarB = (i >= 36 ? new b83(q83VarA) : i >= 35 ? new a83(q83VarA) : i >= 34 ? new z73(q83VarA) : i >= 31 ? new y73(q83VarA) : i >= 30 ? new x73(q83VarA) : new w73(q83VarA)).b();
        } else {
            q83VarB = null;
        }
        this.b = q83VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = q83.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        q83 q83VarC = q83.c(windowInsets, view);
        m83 m83Var = q83VarC.a;
        q83 q83VarA = this.b;
        if (q83VarA == null) {
            WeakHashMap weakHashMap = t43.a;
            q83VarA = p43.a(view);
            this.b = q83VarA;
        }
        if (q83VarA == null) {
            this.b = q83VarC;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            n73 n73VarJ = r73.j(view);
            if (n73VarJ == null || !Objects.equals(n73VarJ.h, q83VarC)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q83 q83Var = this.b;
                int i = 1;
                while (i <= 512) {
                    ox0 ox0VarH = m83Var.h(i);
                    ox0 ox0VarH2 = q83Var.a.h(i);
                    int i2 = ox0VarH.a;
                    int i3 = ox0VarH.d;
                    int i4 = ox0VarH.c;
                    int i5 = ox0VarH.b;
                    int i6 = ox0VarH2.a;
                    int i7 = ox0VarH2.d;
                    int[] iArr3 = iArr;
                    int i8 = ox0VarH2.c;
                    int i9 = ox0VarH2.b;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = q83VarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    q83 q83Var2 = this.b;
                    if ((i10 & 8) != 0) {
                        interpolator = r73.e;
                    } else if ((i11 & 8) != 0) {
                        interpolator = r73.f;
                    } else if ((i10 & 519) != 0) {
                        interpolator = r73.g;
                    } else {
                        interpolator = (i11 & 519) != 0 ? r73.h : null;
                    }
                    v73 v73Var = new v73(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    v73Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v73Var.a.b());
                    ox0 ox0VarH3 = m83Var.h(i12);
                    ox0 ox0VarH4 = q83Var2.a.h(i12);
                    int iMin = Math.min(ox0VarH3.a, ox0VarH4.a);
                    int i13 = ox0VarH3.b;
                    int i14 = ox0VarH4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = ox0VarH3.c;
                    int i16 = ox0VarH4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = ox0VarH3.d;
                    int i18 = ox0VarH4.d;
                    k42 k42Var = new k42(ox0.b(iMin, iMin2, iMin3, Math.min(i17, i18)), ox0.b(Math.max(ox0VarH3.a, ox0VarH4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), (byte) 10);
                    r73.g(view, v73Var, q83VarC, false);
                    duration.addUpdateListener(new o73(v73Var, q83VarC, q83Var2, i12, view));
                    duration.addListener(new p73(v73Var, view));
                    dr drVar = new dr(view, v73Var, k42Var, duration);
                    if (view == null) {
                        throw new NullPointerException("view == null");
                    }
                    rq1 rq1Var = new rq1(view, drVar);
                    view.getViewTreeObserver().addOnPreDrawListener(rq1Var);
                    view.addOnAttachStateChangeListener(rq1Var);
                    this.b = q83VarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
