package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d83 extends m83 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public ox0[] d;
    public ox0 e;
    public q83 f;
    public ox0 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public d83(q83 q83Var, WindowInsets windowInsets) {
        super(q83Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private cb0 A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return cb0.a(point.x, point.y, 0, 0, 0, 0, true);
        }
        oa2 oa2VarG = dt.G(display, 0);
        oa2 oa2VarG2 = dt.G(display, 1);
        oa2 oa2VarG3 = dt.G(display, 2);
        oa2 oa2VarG4 = dt.G(display, 3);
        return cb0.a(point.x, point.y, oa2VarG != null ? oa2VarG.b : 0, oa2VarG2 != null ? oa2VarG2.b : 0, oa2VarG3 != null ? oa2VarG3.b : 0, oa2VarG4 != null ? oa2VarG4.b : 0, false);
    }

    private static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[cy1.D(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] C(ox0 ox0Var) {
        ArrayList arrayList = new ArrayList();
        int i = ox0Var.a;
        int i2 = ox0Var.d;
        int i3 = ox0Var.c;
        int i4 = ox0Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, ox0Var.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private ox0 D(int i, boolean z) {
        ox0 ox0VarA = ox0.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                ox0VarA = ox0.a(ox0VarA, E(i2, z));
            }
        }
        return ox0VarA;
    }

    private ox0 F() {
        q83 q83Var = this.f;
        return q83Var != null ? q83Var.a.k() : ox0.e;
    }

    private ox0 G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!m) {
            I();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) p.get(q.get(objInvoke));
                    if (rect != null) {
                        return ox0.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    private static void I() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        m = true;
    }

    public static boolean K(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    public ox0 E(int i, boolean z) {
        ox0 ox0VarK;
        int i2;
        ox0 ox0Var = ox0.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    ox0[] ox0VarArr = this.d;
                    ox0VarK = ox0VarArr != null ? ox0VarArr[cy1.D(8)] : null;
                    if (ox0VarK != null) {
                        return ox0VarK;
                    }
                    ox0 ox0VarM = m();
                    ox0 ox0VarF = F();
                    int i3 = ox0VarM.d;
                    if (i3 > ox0VarF.d) {
                        return ox0.b(0, 0, 0, i3);
                    }
                    ox0 ox0Var2 = this.g;
                    if (ox0Var2 != null && !ox0Var2.equals(ox0Var) && (i2 = this.g.d) > ox0VarF.d) {
                        return ox0.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return l();
                    }
                    if (i == 32) {
                        return j();
                    }
                    if (i == 64) {
                        return n();
                    }
                    if (i == 128) {
                        q83 q83Var = this.f;
                        za0 za0VarG = q83Var != null ? q83Var.a.g() : g();
                        if (za0VarG != null) {
                            DisplayCutout displayCutout = za0VarG.a;
                            return ox0.b(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z) {
                    ox0 ox0VarF2 = F();
                    ox0 ox0VarK2 = k();
                    return ox0.b(Math.max(ox0VarF2.a, ox0VarK2.a), 0, Math.max(ox0VarF2.c, ox0VarK2.c), Math.max(ox0VarF2.d, ox0VarK2.d));
                }
                if ((this.h & 2) == 0) {
                    ox0 ox0VarM2 = m();
                    q83 q83Var2 = this.f;
                    ox0VarK = q83Var2 != null ? q83Var2.a.k() : null;
                    int iMin = ox0VarM2.d;
                    if (ox0VarK != null) {
                        iMin = Math.min(iMin, ox0VarK.d);
                    }
                    return ox0.b(ox0VarM2.a, 0, ox0VarM2.c, iMin);
                }
            }
        } else {
            if (z) {
                return ox0.b(0, Math.max(F().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return ox0.b(0, m().b, 0, 0);
            }
        }
        return ox0Var;
    }

    public boolean H(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !E(i, false).equals(ox0.e);
    }

    public void J(ox0 ox0Var) {
        this.g = ox0Var;
    }

    @Override // defpackage.m83
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        ox0 ox0VarG = G(view);
        if (ox0VarG == null) {
            ox0VarG = ox0.e;
        }
        J(ox0VarG);
    }

    @Override // defpackage.m83
    public List<Rect> e(int i) {
        return B(this.k, i);
    }

    @Override // defpackage.m83
    public List<Rect> f(int i) {
        return B(this.l, i);
    }

    @Override // defpackage.m83
    public ox0 h(int i) {
        return D(i, false);
    }

    @Override // defpackage.m83
    public ox0 i(int i) {
        return D(i, true);
    }

    @Override // defpackage.m83
    public final ox0 m() {
        ox0 ox0Var = this.e;
        if (ox0Var != null) {
            return ox0Var;
        }
        WindowInsets windowInsets = this.c;
        ox0 ox0VarB = ox0.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = ox0VarB;
        return ox0VarB;
    }

    @Override // defpackage.m83
    public void o(View view) {
        A(view);
    }

    @Override // defpackage.m83
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iD = cy1.D(i);
            this.k[iD] = C(h(i));
            if (i != 8) {
                this.l[iD] = C(i(i));
            }
        }
    }

    @Override // defpackage.m83
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.m83
    public boolean t(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !H(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.m83
    public void v(ox0[] ox0VarArr) {
        this.d = ox0VarArr;
    }

    @Override // defpackage.m83
    public void w(q83 q83Var) {
        this.f = q83Var;
    }

    @Override // defpackage.m83
    public void x(int i) {
        this.h = i;
    }

    @Override // defpackage.m83
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.m83
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.m83
    public void u(cb0 cb0Var) {
    }
}
