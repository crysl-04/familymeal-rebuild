package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x92 extends View {
    public static final int[] m = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] n = new int[0];
    public o23 h;
    public Boolean i;
    public Long j;
    public t k;
    public o9 l;

    private final void setRippleState(boolean z) {
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.k;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.j;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (!z) {
            if (jLongValue < 5) {
                t tVar = new t(this, (byte) 10);
                this.k = tVar;
                postDelayed(tVar, 50L);
            } else {
                iArr = n;
            }
            this.j = Long.valueOf(jCurrentAnimationTimeMillis);
        }
        iArr = m;
        o23 o23Var = this.h;
        if (o23Var != null) {
            o23Var.setState(iArr);
        }
        this.j = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(x92 x92Var) {
        o23 o23Var = x92Var.h;
        if (o23Var != null) {
            o23Var.setState(n);
        }
        x92Var.k = null;
    }

    public final void b(m22 m22Var, boolean z, long j, int i, long j2, o9 o9Var) {
        long j3 = m22Var.a;
        if (this.h == null || !Boolean.valueOf(z).equals(this.i)) {
            o23 o23Var = new o23(z);
            setBackground(o23Var);
            this.h = o23Var;
            this.i = Boolean.valueOf(z);
        }
        o23 o23Var2 = this.h;
        o23Var2.getClass();
        this.l = o9Var;
        e(i, j, j2);
        if (z) {
            o23Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        } else {
            o23Var2.setHotspot(o23Var2.getBounds().centerX(), o23Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.l = null;
        t tVar = this.k;
        if (tVar != null) {
            removeCallbacks(tVar);
            t tVar2 = this.k;
            tVar2.getClass();
            tVar2.run();
        } else {
            o23 o23Var = this.h;
            if (o23Var != null) {
                o23Var.setState(n);
            }
        }
        o23 o23Var2 = this.h;
        if (o23Var2 == null) {
            return;
        }
        o23Var2.setVisible(false, false);
        unscheduleDrawable(o23Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i, long j, long j2) {
        o23 o23Var = this.h;
        if (o23Var == null) {
            return;
        }
        if (o23Var.getRadius() != i) {
            o23Var.setRadius(i);
        }
        long jB = kv.b(0.1f, j2);
        kv kvVar = o23Var.i;
        if (!(kvVar == null ? false : r13.a(kvVar.a, jB))) {
            o23Var.i = new kv(jB);
            o23Var.setColor(ColorStateList.valueOf(cu.c0(jB)));
        }
        Rect rect = new Rect(0, 0, ie1.x(Float.intBitsToFloat((int) (j >> 32))), ie1.x(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        o23Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        o9 o9Var = this.l;
        if (o9Var != null) {
            o9Var.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
