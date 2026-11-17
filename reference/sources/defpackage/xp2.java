package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xp2 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ yp2 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public mf1 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public xp2(yp2 yp2Var, Menu menu) {
        this.E = yp2Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        yp2 yp2Var = this.E;
        Context context = yp2Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                li1.g("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objA = yp2Var.d;
            if (objA == null) {
                objA = yp2.a(context);
                yp2Var.d = objA;
            }
            String str = this.y;
            wp2 wp2Var = new wp2();
            wp2Var.b = objA;
            Class<?> cls = objA.getClass();
            try {
                wp2Var.c = cls.getMethod(str, wp2.d);
                menuItem.setOnMenuItemClickListener(wp2Var);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof lf1) {
                lf1 lf1Var = (lf1) menuItem;
                lf1Var.x = (lf1Var.x & (-5)) | 4;
            } else if (menuItem instanceof pf1) {
                pf1 pf1Var = (pf1) menuItem;
                zp2 zp2Var = pf1Var.c;
                try {
                    Method declaredMethod = pf1Var.d;
                    if (declaredMethod == null) {
                        declaredMethod = zp2Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        pf1Var.d = declaredMethod;
                    }
                    declaredMethod.invoke(zp2Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, yp2.e, yp2Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        mf1 mf1Var = this.z;
        if (mf1Var != null && (menuItem instanceof zp2)) {
            ((zp2) menuItem).a(mf1Var);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof zp2;
        if (z2) {
            ((zp2) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((zp2) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((zp2) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((zp2) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((zp2) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((zp2) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
