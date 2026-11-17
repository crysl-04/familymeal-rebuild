package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x82 {
    public static x82 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public o5 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final w82 h = new w82(6);

    public static synchronized x82 c() {
        x82 x82Var;
        x82Var = g;
        if (x82Var == null) {
            x82Var = new x82();
            g = x82Var;
        }
        return x82Var;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        w82 w82Var = h;
        w82Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) w82Var.b(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, wx2 wx2Var, int[] iArr) {
        ColorStateList colorStateList;
        if (!zd0.a(drawable) || drawable.mutate() == drawable) {
            PorterDuffColorFilter porterDuffColorFilterF = null;
            if (wx2Var.d) {
                colorStateList = wx2Var.a;
            } else {
                if (!wx2Var.c) {
                    drawable.clearColorFilter();
                    return;
                }
                colorStateList = null;
            }
            PorterDuff.Mode mode = wx2Var.c ? wx2Var.b : f;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterF = f(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterF);
        }
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.a = weakHashMap;
        }
        dm2 dm2Var = (dm2) weakHashMap.get(context);
        if (dm2Var == null) {
            dm2Var = new dm2(0);
            this.a.put(context, dm2Var);
        }
        int i2 = dm2Var.k;
        if (i2 != 0 && i <= dm2Var.i[i2 - 1]) {
            dm2Var.c(i, colorStateList);
            return;
        }
        if (dm2Var.h && i2 >= dm2Var.i.length) {
            aa3.o(dm2Var);
        }
        int i3 = dm2Var.k;
        if (i3 >= dm2Var.i.length) {
            int i4 = (i3 + 1) << 2;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            dm2Var.i = Arrays.copyOf(dm2Var.i, i7);
            dm2Var.j = Arrays.copyOf(dm2Var.j, i7);
        }
        dm2Var.i[i3] = i;
        dm2Var.j[i3] = colorStateList;
        dm2Var.k = i3 + 1;
    }

    public final Drawable b(Context context, int i) {
        LayerDrawable layerDrawable;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            tc1 tc1Var = (tc1) this.b.get(context);
            layerDrawable = null;
            if (tc1Var != null && (weakReference = (WeakReference) tc1Var.a(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    tc1Var.d(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e != null && i == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
            if (constantState2 == null) {
                return layerDrawable;
            }
            tc1 tc1Var2 = (tc1) this.b.get(context);
            if (tc1Var2 == null) {
                tc1Var2 = new tc1();
                this.b.put(context, tc1Var2);
            }
            tc1Var2.c(j, new WeakReference(constantState2));
            return layerDrawable;
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        if (!this.d) {
            this.d = true;
            Drawable drawableD = d(context, R.drawable.abc_vector_test);
            if (drawableD == null || !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName())) {
                this.d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableB = b(context, i);
        if (drawableB == null) {
            drawableB = context.getDrawable(i);
        }
        if (drawableB != null) {
            drawableB = h(context, i, z, drawableB);
        }
        if (drawableB != null) {
            int i2 = zd0.a;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        dm2 dm2Var;
        WeakHashMap weakHashMap = this.a;
        colorStateList = (weakHashMap == null || (dm2Var = (dm2) weakHashMap.get(context)) == null) ? null : (ColorStateList) aa3.g(dm2Var, i);
        if (colorStateList == null) {
            o5 o5Var = this.e;
            ColorStateList colorStateListC = o5Var != null ? o5Var.c(context, i) : null;
            if (colorStateListC != null) {
                a(context, i, colorStateListC);
            }
            colorStateList = colorStateListC;
        }
        return colorStateList;
    }

    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int i2;
        PorterDuffColorFilter porterDuffColorFilterF;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            if (zd0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
            return drawable;
        }
        o5 o5Var = this.e;
        int i3 = R.attr.colorControlNormal;
        if (o5Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = dx2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = ve.b;
                o5.d(drawableFindDrawableByLayerId, iC, mode2);
                o5.d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), dx2.c(context, R.attr.colorControlNormal), mode2);
                o5.d(layerDrawable.findDrawableByLayerId(android.R.id.progress), dx2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = dx2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = ve.b;
                o5.d(drawableFindDrawableByLayerId2, iB, mode3);
                o5.d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), dx2.c(context, R.attr.colorControlActivated), mode3);
                o5.d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), dx2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        o5 o5Var2 = this.e;
        boolean z3 = false;
        if (o5Var2 != null) {
            PorterDuff.Mode mode4 = ve.b;
            if (o5.a((int[]) o5Var2.a, i)) {
                z2 = true;
                i2 = -1;
            } else {
                if (o5.a((int[]) o5Var2.c, i)) {
                    i3 = R.attr.colorControlActivated;
                } else {
                    boolean zA = o5.a((int[]) o5Var2.d, i);
                    i3 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        i3 = android.R.attr.colorForeground;
                        i2 = 41;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i3 = 0;
                        }
                        i2 = -1;
                    }
                }
                z2 = true;
                i2 = -1;
            }
            if (z2) {
                Drawable drawableMutate = zd0.a(drawable) ? drawable.mutate() : drawable;
                int iC2 = dx2.c(context, i3);
                synchronized (ve.class) {
                    porterDuffColorFilterF = f(iC2, mode4);
                }
                drawableMutate.setColorFilter(porterDuffColorFilterF);
                if (i2 != -1) {
                    drawableMutate.setAlpha(i2);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
