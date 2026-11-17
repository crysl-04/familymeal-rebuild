package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t6 extends ViewGroup implements la2, m70, ls1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, am0 {
    public static Class O0;
    public static Method P0;
    public static Method Q0;
    public static final fj1 R0 = new fj1();
    public static l6 S0;
    public static Method T0;
    public final si1 A;
    public float A0;
    public final s72 B;
    public final q6 B0;
    public final zg2 C;
    public final k6 C0;
    public final a7 D;
    public boolean D0;
    public o7 E;
    public zp0 E0;
    public final s8 F;
    public final pv0 F0;
    public final vi G;
    public final e6 G0;
    public final fj1 H;
    public final e6 H0;
    public fj1 I;
    public boolean I0;
    public boolean J;
    public boolean J0;
    public final ch1 K;
    public boolean K0;
    public final kt L;
    public final od2 L0;
    public final lu1 M;
    public View M0;
    public final o90 N;
    public final p6 N0;
    public final y5 O;
    public final z5 P;
    public boolean Q;
    public final it1 R;
    public boolean S;
    public ob T;
    public k00 U;
    public boolean V;
    public final we1 W;
    public long a0;
    public final int[] b0;
    public final float[] c0;
    public final Matrix d0;
    public final float[] e0;
    public final float[] f0;
    public long g0;
    public final lu1 h;
    public boolean h0;
    public long i;
    public long i0;
    public final boolean j;
    public vp0 j0;
    public ev0 k;
    public cw2 k0;
    public j91 l;
    public aw2 l0;
    public k91 m;
    public final AtomicReference m0;
    public kb0 n;
    public m80 n0;
    public h92 o;
    public final lu1 o0;
    public final ih p;
    public final lu1 p0;
    public final k6 q;
    public mx0 q0;
    public final lu1 r;
    public final sg1 r0;
    public final View s;
    public eb s0;
    public final em0 t;
    public MotionEvent t0;
    public o20 u;
    public long u0;
    public final f8 v;
    public final k42 v0;
    public final lu1 w;
    public final fj1 w0;
    public final o90 x;
    public float x0;
    public final rx0 y;
    public float y0;
    public final l41 z;
    public float z0;

    public t6(Context context, wy wyVar) {
        u31 u31Var;
        super(context);
        this.h = rz1.x(wyVar);
        this.i = 9205357640488583168L;
        byte b = 1;
        this.j = true;
        this.o = c5.X;
        this.p = new ih();
        byte b2 = 0;
        this.q = new k6(this, b2);
        this.r = new lu1(tz0.c(context), vz1.k);
        this.t = new em0(this, this);
        this.u = wyVar.c().j();
        this.v = new f8();
        this.w = rz1.x(Boolean.FALSE);
        byte b3 = 2;
        this.x = il2.b(new e6(this, b3));
        this.y = new rx0();
        l41 l41Var = new l41(3);
        l41Var.d0(ma2.c);
        l41Var.a0(getDensity());
        l41Var.f0(getViewConfiguration());
        l41Var.e0(new r6(this).c(((em0) getFocusOwner()).e).c(m8getDragAndDropManager().c));
        this.z = l41Var;
        si1 si1Var = my0.a;
        this.A = new si1();
        this.B = new s72(getLayoutNodes(), this);
        this.C = new zg2(getRoot(), new eg0(), getLayoutNodes());
        a7 a7Var = new a7(this);
        this.D = a7Var;
        this.E = new o7(this, new o6(0, this, h7.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, (byte) 0));
        this.F = new s8(this);
        this.G = new vi();
        this.H = new fj1();
        this.K = new ch1();
        l41 root = getRoot();
        kt ktVar = new kt();
        ktVar.b = root;
        ktVar.c = new gt0(root.L.c);
        ktVar.d = new xl1((byte) 6);
        ktVar.e = new jt0();
        this.L = ktVar;
        this.M = rz1.x(new Configuration(context.getResources().getConfiguration()));
        this.N = il2.b(new e6(this, (byte) 3));
        this.O = new y5(this, getAutofillTree());
        this.P = new z5(new ix0((Object) context, (byte) 28), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.R = new it1(new d6(this, b));
        this.W = new we1(getRoot());
        this.a0 = 9223372034707292159L;
        this.b0 = new int[]{0, 0};
        this.c0 = ke1.a();
        this.d0 = new Matrix();
        this.e0 = ke1.a();
        this.f0 = ke1.a();
        this.g0 = -1L;
        this.i0 = 9187343241974906880L;
        this.m0 = new AtomicReference(null);
        this.o0 = wyVar.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = yl0.a;
        u31 u31Var2 = u31.h;
        if (layoutDirection != 0) {
            u31Var = layoutDirection != 1 ? null : u31.i;
        } else {
            u31Var = u31Var2;
        }
        this.p0 = rz1.x(u31Var != null ? u31Var : u31Var2);
        this.r0 = new sg1(this);
        this.v0 = new k42((byte) 9);
        this.w0 = new fj1();
        this.x0 = Float.NaN;
        this.y0 = Float.NaN;
        this.z0 = Float.NaN;
        this.A0 = Float.NaN;
        this.B0 = new q6(this, b2);
        this.C0 = new k6(this, b);
        this.E0 = new p70(this, b);
        this.F0 = new pv0(context, new d6(this, b3));
        this.G0 = new e6(this, (byte) 4);
        this.H0 = new e6(this, b2);
        addOnAttachStateChangeListener(this.E);
        setWillNotDraw(false);
        setFocusable(true);
        g7.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        t43.c(this, a7Var);
        setOnDragListener(m8getDragAndDropManager());
        b7.a.a(this);
        if (m()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.s = view;
            addView(view, -1);
        }
        this.L0 = Build.VERSION.SDK_INT >= 31 ? new od2() : null;
        this.N0 = new p6(this);
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof t6) {
                ((t6) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return (j << 32) | j;
    }

    private final zq getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    private final cw2 getLegacyTextInputServiceAndroid() {
        cw2 cw2Var = this.k0;
        if (cw2Var != null) {
            return cw2Var;
        }
        cw2 cw2Var2 = new cw2(getView(), this, new g6(this));
        this.k0 = cw2Var2;
        return cw2Var2;
    }

    private final wy get_composeViewContext() {
        return (wy) this.h.getValue();
    }

    public static final boolean h(t6 t6Var, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static void k(l41 l41Var) {
        l41Var.E();
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            k((l41) objArr[i2]);
        }
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean n(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !dh1.a.a(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.w.setValue(Boolean.valueOf(z));
    }

    private void setDensity(e90 e90Var) {
        this.r.setValue(e90Var);
    }

    private void setLayoutDirection(u31 u31Var) {
        this.p0.setValue(u31Var);
    }

    private final void set_composeViewContext(wy wyVar) {
        this.h.setValue(wyVar);
    }

    public final void A() {
        if (this.h0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.g0) {
            this.g0 = jCurrentAnimationTimeMillis;
            bq bqVar = bq.a;
            Matrix matrix = this.d0;
            float[] fArr = this.e0;
            int[] iArr = this.b0;
            bqVar.a(this, fArr, matrix, iArr);
            vs.F(fArr, this.f0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.i0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void B(MotionEvent motionEvent) {
        this.g0 = AnimationUtils.currentAnimationTimeMillis();
        Matrix matrix = this.d0;
        int[] iArr = this.b0;
        bq bqVar = bq.a;
        float[] fArr = this.e0;
        bqVar.a(this, fArr, matrix, iArr);
        vs.F(fArr, this.f0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = ke1.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.i0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean C() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void D(kp0 kp0Var) {
        ih ihVar = this.p;
        boolean zIsEmpty = ihVar.isEmpty();
        ihVar.addLast(kp0Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.q);
            } else {
                wg.m("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void E(l41 l41Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (l41Var != null) {
            while (l41Var != null && l41Var.r() == j41.h) {
                if (!this.V) {
                    l41 l41VarU = l41Var.u();
                    if (l41VarU == null) {
                        break;
                    }
                    long j = l41VarU.L.c.k;
                    if (k00.g(j) && k00.f(j)) {
                        break;
                    }
                }
                l41Var = l41Var.u();
            }
            if (l41Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long F(long j) {
        A();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.i0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.i0 & 4294967295L));
        return ke1.b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), this.f0);
    }

    public final int G(MotionEvent motionEvent) {
        Object obj;
        if (this.I0) {
            this.I0 = false;
            i81 i81Var = getComposeViewContext().t;
            l73.a.setValue(new e12(motionEvent.getMetaState()));
        }
        ch1 ch1Var = this.K;
        ix0 ix0VarC = ch1Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        kt ktVar = this.L;
        if (ix0VarC == null) {
            if (!ktVar.a) {
                tc1 tc1Var = (tc1) ((xl1) ktVar.d).i;
                int i = tc1Var.k;
                Object[] objArr = tc1Var.j;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                tc1Var.k = 0;
                tc1Var.h = false;
                ((gt0) ktVar.c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) ix0VarC.i;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i3 = size - 1;
            obj = arrayList.get(size);
            if (((b12) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i3 < 0) {
                obj = null;
                break;
            }
            size = i3;
        }
        b12 b12Var = (b12) obj;
        if (b12Var != null) {
            this.i = b12Var.d;
        }
        int iC = ktVar.c(ix0VarC, this, o(motionEvent));
        ix0VarC.j = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iC & 1) != 0) {
            return iC;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ch1Var.c.delete(pointerId);
        ch1Var.b.delete(pointerId);
        return iC;
    }

    public final void H(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            long jR = r((((long) Float.floatToRawIntBits(pointerCoords.x)) << 32) | (((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L));
            pointerCoords.x = Float.intBitsToFloat((int) (jR >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jR & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        ix0 ix0VarC = this.K.c(motionEventObtain, this);
        ix0VarC.getClass();
        this.L.c(ix0VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void I(b9 b9Var, n10 n10Var) {
        s6 s6Var;
        if (n10Var instanceof s6) {
            s6Var = (s6) n10Var;
            int i = s6Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                s6Var.m = i - Integer.MIN_VALUE;
            } else {
                s6Var = new s6(this, n10Var);
            }
        } else {
            s6Var = new s6(this, n10Var);
        }
        Object obj = s6Var.k;
        int i2 = s6Var.m;
        if (i2 == 0) {
            m02.y(obj);
            d6 d6Var = new d6(this, (byte) 0);
            s6Var.m = 1;
            if (vs.x(new hd0((Object) d6Var, (Object) this.m0, (Object) b9Var, (m10) null, (byte) 5), s6Var) == y20.h) {
                return;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            m02.y(obj);
        }
        wg.k();
    }

    public final void J(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (uz0.g(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(tz0.c(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void K() {
        boolean z;
        int i;
        int[] iArr = this.b0;
        getLocationOnScreen(iArr);
        long j = this.a0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.g0 >= 0) {
            z = false;
        } else {
            this.a0 = (((long) i4) << 32) | (((long) iArr[1]) & 4294967295L);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                uj1 uj1VarZ = getRoot().z();
                Object[] objArr = uj1VarZ.h;
                int i5 = uj1VarZ.j;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((l41) objArr[i6]).M.p.B0();
                }
                z = true;
            }
        }
        A();
        View rootView = this.M0;
        if (rootView == null) {
            rootView = getRootView();
            this.M0 = rootView;
        }
        s72 rectManager = getRectManager();
        long j2 = this.a0;
        long jD0 = lt.d0(this.i0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.e0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0) & (fArr[15] == 1.0f ? 1 : 0));
        }
        nx2 nx2Var = rectManager.d;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.g = nx2Var.b(j2, jD0, fArr, width, height) || rectManager.g;
        this.W.a(z);
        getRectManager().a();
    }

    public final void L(float f) {
        if (m()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.x0) || f > this.x0) {
                    this.x0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.y0) || f < this.y0) {
                    this.y0 = f;
                }
            }
        }
    }

    @Override // defpackage.m70
    public final void a(e91 e91Var) {
        k91 k91Var = this.m;
        if (k91Var != null) {
            sd1 sd1Var = (sd1) k91Var.a.i;
            if (sd1Var.h && !sd1Var.j) {
                sq sqVar = k91Var.d;
                if (sqVar != null) {
                    sqVar.cancel();
                }
                k91Var.d = null;
                return;
            }
            if (sd1Var.i) {
                return;
            }
            if (!sd1Var.j) {
                x12.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!sd1Var.k.i()) {
                x12.a("Attempted to start retaining exited values with pending exited values");
            }
            sd1Var.j = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        lm0 lm0Var = ((em0) getFocusOwner()).c;
        if (!lm0Var.u) {
            return;
        }
        if (!lm0Var.h.u) {
            ax0.b("visitSubtreeIf called on an unattached node");
        }
        uj1 uj1Var = new uj1(new qg1[16]);
        qg1 qg1Var = lm0Var.h;
        qg1 qg1Var2 = qg1Var.m;
        if (qg1Var2 == null) {
            cu.q(uj1Var, qg1Var);
        } else {
            uj1Var.b(qg1Var2);
        }
        while (true) {
            int i3 = uj1Var.j;
            if (i3 == 0) {
                return;
            }
            qg1 qg1Var3 = (qg1) uj1Var.k(i3 - 1);
            if ((qg1Var3.k & 1024) != 0) {
                for (qg1 qg1Var4 = qg1Var3; qg1Var4 != null && qg1Var4.u; qg1Var4 = qg1Var4.m) {
                    if ((qg1Var4.j & 1024) != 0) {
                        qg1 qg1VarR = qg1Var4;
                        uj1 uj1Var2 = null;
                        while (qg1VarR != null) {
                            int i4 = 0;
                            if (qg1VarR instanceof lm0) {
                                lm0 lm0Var2 = (lm0) qg1VarR;
                                if (lm0Var2.u && lm0Var2.L0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    lm0 lm0Var3 = ((em0) getFocusOwner()).c;
                                    if (lm0Var3.u) {
                                        if (!lm0Var3.h.u) {
                                            ax0.b("visitSubtreeIf called on an unattached node");
                                        }
                                        uj1 uj1Var3 = new uj1(new qg1[16]);
                                        qg1 qg1Var5 = lm0Var3.h;
                                        qg1 qg1Var6 = qg1Var5.m;
                                        if (qg1Var6 == null) {
                                            cu.q(uj1Var3, qg1Var5);
                                        } else {
                                            uj1Var3.b(qg1Var6);
                                        }
                                        while (true) {
                                            int i5 = uj1Var3.j;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            qg1 qg1Var7 = (qg1) uj1Var3.k(i5 - 1);
                                            if ((qg1Var7.k & 1024) != 0) {
                                                for (qg1 qg1Var8 = qg1Var7; qg1Var8 != null && qg1Var8.u; qg1Var8 = qg1Var8.m) {
                                                    if ((qg1Var8.j & 1024) != 0) {
                                                        qg1 qg1VarR2 = qg1Var8;
                                                        uj1 uj1Var4 = null;
                                                        while (qg1VarR2 != null) {
                                                            if (qg1VarR2 instanceof lm0) {
                                                                lm0 lm0Var4 = (lm0) qg1VarR2;
                                                                if (lm0Var4.u) {
                                                                    fm0 fm0VarL0 = lm0Var4.L0();
                                                                    if (lm0Var4.u && fm0VarL0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((qg1VarR2.j & 1024) != 0 && (qg1VarR2 instanceof k80)) {
                                                                int i6 = 0;
                                                                for (qg1 qg1Var9 = ((k80) qg1VarR2).w; qg1Var9 != null; qg1Var9 = qg1Var9.m) {
                                                                    if ((qg1Var9.j & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            qg1VarR2 = qg1Var9;
                                                                        } else {
                                                                            if (uj1Var4 == null) {
                                                                                uj1Var4 = new uj1(new qg1[16]);
                                                                            }
                                                                            if (qg1VarR2 != null) {
                                                                                uj1Var4.b(qg1VarR2);
                                                                                qg1VarR2 = null;
                                                                            }
                                                                            uj1Var4.b(qg1Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 != 1) {
                                                                }
                                                            }
                                                            qg1VarR2 = cu.R(uj1Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            cu.q(uj1Var3, qg1Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                for (qg1 qg1Var10 = ((k80) qg1VarR).w; qg1Var10 != null; qg1Var10 = qg1Var10.m) {
                                    if ((qg1Var10.j & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            qg1VarR = qg1Var10;
                                        } else {
                                            if (uj1Var2 == null) {
                                                uj1Var2 = new uj1(new qg1[16]);
                                            }
                                            if (qg1VarR != null) {
                                                uj1Var2.b(qg1VarR);
                                                qg1VarR = null;
                                            }
                                            uj1Var2.b(qg1Var10);
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            qg1VarR = cu.R(uj1Var2);
                        }
                    }
                }
            }
            cu.q(uj1Var, qg1Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        rg2 rg2VarW;
        vp0 vp0Var;
        vp0 vp0Var2;
        z5 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                l41 l41Var = (l41) autofillManager.i.c.b(iKeyAt);
                if (l41Var != null && (rg2VarW = l41Var.w()) != null) {
                    mj1 mj1Var = rg2VarW.h;
                    Object objG = mj1Var.g(qg2.g);
                    if (objG == null) {
                        objG = null;
                    }
                    m1 m1Var = (m1) objG;
                    if (m1Var != null && (vp0Var2 = (vp0) m1Var.b) != null) {
                    }
                    Object objG2 = mj1Var.g(qg2.h);
                    m1 m1Var2 = (m1) (objG2 != null ? objG2 : null);
                    if (m1Var2 != null && (vp0Var = (vp0) m1Var2.b) != null) {
                    }
                }
            }
        }
        y5 autofill = getAutofill();
        if (autofill != null) {
            vi viVar = autofill.b;
            if (viVar.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (viVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                        li1.c();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new mo1("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new mo1("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new mo1("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // defpackage.m70
    public final void c(e91 e91Var) {
        sq sqVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(aa3.t());
        }
        k91 k91Var = this.m;
        if (k91Var != null) {
            j91 j91Var = this.l;
            j91Var.getClass();
            sd1 sd1Var = (sd1) k91Var.a.i;
            if (!sd1Var.h || sd1Var.j) {
                return;
            }
            try {
                sqVarS = ((u93) j91Var).a.s(new o9((Object) k91Var, (byte) 22));
            } catch (CancellationException unused) {
                if (!sd1Var.i) {
                    if (sd1Var.j) {
                        x12.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    sd1Var.a();
                    sd1Var.j = true;
                }
                sqVarS = null;
            }
            sq sqVar = k91Var.d;
            if (sqVar != null) {
                sqVar.cancel();
            }
            k91Var.d = sqVarS;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.D.h(false, i, this.i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.D.h(true, i, this.i);
    }

    @Override // defpackage.am0
    public final void d(lm0 lm0Var, lm0 lm0Var2) {
        ln1 ln1Var;
        boolean z;
        ln1 ln1Var2;
        boolean z2;
        if (lm0Var != null) {
            lm0 lm0Var3 = lm0Var;
            if (!lm0Var3.h.u) {
                ax0.b("visitAncestors called on an unattached node");
            }
            qg1 qg1Var = lm0Var3.h;
            l41 l41VarY = cu.Y(lm0Var);
            nj1 nj1Var = null;
            ArrayList arrayList = null;
            while (l41VarY != null) {
                if ((l41VarY.L.f.k & 2097152) != 0) {
                    while (qg1Var != null) {
                        if ((qg1Var.j & 2097152) != 0) {
                            qg1 qg1VarR = qg1Var;
                            uj1 uj1Var = null;
                            while (qg1VarR != null) {
                                if (qg1VarR instanceof nv0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(qg1VarR);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (qg1VarR.j & 2097152) != 0 && (qg1VarR instanceof k80)) {
                                    int i = 0;
                                    for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                        if ((qg1Var2.j & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qg1VarR = qg1Var2;
                                            } else {
                                                if (uj1Var == null) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (qg1VarR != null) {
                                                    uj1Var.b(qg1VarR);
                                                    qg1VarR = null;
                                                }
                                                uj1Var.b(qg1Var2);
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                qg1VarR = cu.R(uj1Var);
                            }
                        }
                        qg1Var = qg1Var.l;
                    }
                }
                l41VarY = l41VarY.u();
                qg1Var = (l41VarY == null || (ln1Var2 = l41VarY.L) == null) ? null : ln1Var2.e;
            }
            if (arrayList != null) {
                if (lm0Var2 != null) {
                    if (!lm0Var2.h.u) {
                        ax0.b("visitAncestors called on an unattached node");
                    }
                    qg1 qg1Var3 = lm0Var2.h;
                    l41 l41VarY2 = cu.Y(lm0Var2);
                    nj1 nj1Var2 = null;
                    while (l41VarY2 != null) {
                        if ((l41VarY2.L.f.k & 2097152) != 0) {
                            while (qg1Var3 != null) {
                                if ((qg1Var3.j & 2097152) != 0) {
                                    qg1 qg1VarR2 = qg1Var3;
                                    uj1 uj1Var2 = null;
                                    while (qg1VarR2 != null) {
                                        if (qg1VarR2 instanceof nv0) {
                                            if (nj1Var2 == null) {
                                                nj1 nj1Var3 = cd2.a;
                                                nj1Var2 = new nj1();
                                            }
                                            nj1Var2.a(qg1VarR2);
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (z && (qg1VarR2.j & 2097152) != 0 && (qg1VarR2 instanceof k80)) {
                                            int i2 = 0;
                                            for (qg1 qg1Var4 = ((k80) qg1VarR2).w; qg1Var4 != null; qg1Var4 = qg1Var4.m) {
                                                if ((qg1Var4.j & 2097152) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        qg1VarR2 = qg1Var4;
                                                    } else {
                                                        if (uj1Var2 == null) {
                                                            uj1Var2 = new uj1(new qg1[16]);
                                                        }
                                                        if (qg1VarR2 != null) {
                                                            uj1Var2.b(qg1VarR2);
                                                            qg1VarR2 = null;
                                                        }
                                                        uj1Var2.b(qg1Var4);
                                                    }
                                                }
                                            }
                                            if (i2 != 1) {
                                            }
                                        }
                                        qg1VarR2 = cu.R(uj1Var2);
                                    }
                                }
                                qg1Var3 = qg1Var3.l;
                            }
                        }
                        l41VarY2 = l41VarY2.u();
                        qg1Var3 = (l41VarY2 == null || (ln1Var = l41VarY2.L) == null) ? null : ln1Var.e;
                    }
                    nj1Var = nj1Var2;
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    nv0 nv0Var = (nv0) arrayList.get(i3);
                    if (!(nj1Var != null ? nj1Var.c(nv0Var) : false)) {
                        nv0Var.C();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fj1 fj1Var = this.H;
        if (!isAttachedToWindow()) {
            k(getRoot());
        }
        s(true);
        bl2.h().m();
        this.J = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            zq canvasHolder = getCanvasHolder();
            a6 a6Var = canvasHolder.a;
            Canvas canvas2 = a6Var.a;
            a6Var.a = canvas;
            getRoot().i(a6Var, null);
            canvasHolder.a.a = canvas2;
            if (fj1Var.j()) {
                int i = fj1Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((es0) ((gt1) fj1Var.g(i2))).g();
                }
            }
            int i3 = y43.h;
            fj1Var.d();
            this.J = false;
            Trace.endSection();
            fj1 fj1Var2 = this.I;
            if (fj1Var2 != null) {
                fj1Var.b(fj1Var2);
                fj1Var2.d();
            }
            if (m()) {
                if (Float.compare(this.x0, this.z0) != 0) {
                    float f = this.x0;
                    this.z0 = f;
                    yd.a(this, f);
                }
                View view = this.s;
                if (view != null) {
                    if (Float.compare(this.y0, this.A0) != 0) {
                        float f2 = this.y0;
                        this.A0 = f2;
                        yd.a(view, f2);
                    }
                    if (!Float.isNaN(this.y0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.x0 = Float.NaN;
                this.y0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r34v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r34v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r34v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r34v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r37v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r37v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r37v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r37v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r37v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r37v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r41v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r41v0 ??, new type: android.view.MotionEvent
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r41v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r41v0 ??, new type: android.view.MotionEvent
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r41) {
        /*
            Method dump skipped, instruction units count: 1923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x015a, code lost:
    
        if (p(r25) == false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        byte b = 0;
        if (!isFocused()) {
            return ((em0) getFocusOwner()).d(keyEvent, new h6(this, keyEvent, b));
        }
        i81 i81Var = getComposeViewContext().t;
        l73.a.setValue(new e12(keyEvent.getMetaState()));
        return ((em0) getFocusOwner()).d(keyEvent, new sz((byte) 27)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        ln1 ln1Var;
        if (isFocused()) {
            em0 em0Var = (em0) getFocusOwner();
            if (em0Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                lm0 lm0VarV = ys.v(em0Var.c);
                if (lm0VarV != null) {
                    if (!lm0VarV.h.u) {
                        ax0.b("visitAncestors called on an unattached node");
                    }
                    qg1 qg1Var = lm0VarV.h;
                    l41 l41VarY = cu.Y(lm0VarV);
                    while (l41VarY != null) {
                        if ((l41VarY.L.f.k & 131072) != 0) {
                            while (qg1Var != null) {
                                if ((qg1Var.j & 131072) != 0) {
                                    qg1 qg1VarR = qg1Var;
                                    uj1 uj1Var = null;
                                    while (qg1VarR != null) {
                                        if ((qg1VarR.j & 131072) != 0 && (qg1VarR instanceof k80)) {
                                            int i = 0;
                                            for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                                if ((qg1Var2.j & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        qg1VarR = qg1Var2;
                                                    } else {
                                                        if (uj1Var == null) {
                                                            uj1Var = new uj1(new qg1[16]);
                                                        }
                                                        if (qg1VarR != null) {
                                                            uj1Var.b(qg1VarR);
                                                            qg1VarR = null;
                                                        }
                                                        uj1Var.b(qg1Var2);
                                                    }
                                                }
                                            }
                                            if (i != 1) {
                                            }
                                        }
                                        qg1VarR = cu.R(uj1Var);
                                    }
                                }
                                qg1Var = qg1Var.l;
                            }
                        }
                        l41VarY = l41VarY.u();
                        qg1Var = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.K0 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.K0 = false;
            z(viewStructure);
        } catch (Throwable th) {
            this.K0 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object oiVar;
        lm0 lm0VarF;
        if (this.D0) {
            k6 k6Var = this.C0;
            removeCallbacks(k6Var);
            MotionEvent motionEvent2 = this.t0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.D0 = false;
            } else {
                k6Var.run();
            }
        }
        if (!n(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || p(motionEvent))) {
            int iJ = j(motionEvent);
            if ((iJ & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (oiVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    oiVar = new oi(1);
                }
                if (oiVar.equals(new oi(1)) && (lm0VarF = ((em0) getFocusOwner()).f()) != null) {
                    pn1 pn1VarX = cu.X(lm0VarF);
                    if (!es.D(pn1VarX).M(pn1VarX, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((em0) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iJ & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        r72 r72VarA;
        if (view == null || this.W.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus != null && !viewFindNextFocus.equals(this)) {
            ViewParent parent = viewFindNextFocus.getParent();
            while (true) {
                if (parent == null) {
                    viewFindNextFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        } else {
            viewFindNextFocus = null;
            break;
        }
        if (view == this) {
            lm0 lm0VarV = ys.v(((em0) getFocusOwner()).c);
            r72VarA = lm0VarV != null ? ys.A(lm0VarV) : null;
            if (r72VarA == null) {
                r72VarA = yl0.a(view, this);
            }
        } else {
            r72VarA = yl0.a(view, this);
        }
        ul0 ul0VarC = yl0.c(i);
        byte b = ul0VarC != null ? ul0VarC.a : (byte) 6;
        x72 x72Var = new x72();
        if (((em0) getFocusOwner()).e(b, r72VarA, new f6(x72Var, (byte) 0)) == null) {
            return view;
        }
        Object obj = x72Var.h;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || b == 1 || b == 2 || cy1.G(ys.A((lm0) obj), yl0.a(viewFindNextFocus, this), r72VarA, b)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public v1 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final ob getAndroidViewsHandler$ui() {
        if (this.T == null) {
            ob obVar = new ob(getContext());
            this.T = obVar;
            addView(obVar, -1);
            requestLayout();
        }
        ob obVar2 = this.T;
        obVar2.getClass();
        return obVar2;
    }

    public vi getAutofillTree() {
        return this.G;
    }

    public pu getClipboard() {
        return getComposeViewContext().n;
    }

    public qu getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final wy getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.J0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.M.getValue();
    }

    public final o7 getContentCaptureManager$ui() {
        return this.E;
    }

    public o20 getCoroutineContext() {
        return this.u;
    }

    public e90 getDensity() {
        return (e90) this.r.getValue();
    }

    public r72 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            lm0 lm0VarV = ys.v(((em0) getFocusOwner()).c);
            if (lm0VarV != null) {
                return ys.A(lm0VarV);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return yl0.a(viewFindFocus, this);
        }
        return null;
    }

    public bm0 getFocusOwner() {
        return this.t;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        r72 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (uz0.g(((em0) getFocusOwner()).e(6, null, new s0((byte) 2)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public sm0 getFontFamilyResolver() {
        return (sm0) this.o0.getValue();
    }

    public rm0 getFontLoader() {
        return getComposeViewContext().o;
    }

    public final j91 getFrameEndScheduler$ui() {
        return this.l;
    }

    public bs0 getGraphicsContext() {
        return this.F;
    }

    public ws0 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.W.b.s() || !this.p.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public mx0 getInputModeManager() {
        mx0 mx0Var = this.q0;
        if (mx0Var == null) {
            mx0Var = new mx0(isInTouchMode() ? 1 : 2);
            this.q0 = mx0Var;
        }
        return mx0Var;
    }

    public final rx0 getInsetsListener() {
        return this.y;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.g0;
    }

    @Override // android.view.View, android.view.ViewParent
    public u31 getLayoutDirection() {
        return (u31) this.p0.getValue();
    }

    public ub1 getLocaleList() {
        return (ub1) this.N.getValue();
    }

    public long getMeasureIteration() {
        if (this.W.c) {
            return 1L;
        }
        ax0.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    public sg1 getModifierLocalManager() {
        return this.r0;
    }

    public t6 getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public my1 getPlacementScope() {
        vw1 vw1Var = oy1.a;
        return new bd1(this, (byte) 1);
    }

    public final zp0 getPlayNavigationSoundEffect$ui() {
        return this.E0;
    }

    public x02 getPointerIconService() {
        return this.N0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final ev0 m4getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.k;
    }

    public s72 getRectManager() {
        return this.B;
    }

    public h92 getRetainedValuesStore() {
        return this.o;
    }

    public l41 getRoot() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kb0 getSavedStateRegistry() {
        kb0 kb0Var = this.n;
        if (kb0Var != null) {
            return kb0Var;
        }
        wy composeViewContext = getComposeViewContext();
        composeViewContext.g();
        dc2 dc2Var = composeViewContext.e;
        dc2Var.getClass();
        ViewParent parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strJ = jp1.j("SaveableStateRegistry:", strValueOf);
        k42 k42VarB = dc2Var.b();
        Bundle bundleC = k42VarB.c(strJ);
        if (bundleC != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleC.keySet()) {
                ArrayList parcelableArrayList = bundleC.getParcelableArrayList(str);
                parcelableArrayList.getClass();
                linkedHashMap.put(str, parcelableArrayList);
            }
        }
        rt rtVar = new rt((byte) 18);
        ie0 ie0Var = sb2.a;
        rb2 rb2Var = new rb2(linkedHashMap, rtVar);
        boolean z = false;
        z = false;
        if (k42VarB.d(strJ) == null) {
            try {
                k42VarB.h(strJ, new lb0(rb2Var, z ? (byte) 1 : (byte) 0));
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        kb0 kb0Var2 = new kb0(rb2Var, new mb0(z, k42VarB, strJ));
        this.n = kb0Var2;
        return kb0Var2;
    }

    public final boolean getScrollCaptureInProgress() {
        od2 od2Var;
        if (Build.VERSION.SDK_INT >= 31 && (od2Var = this.L0) != null && ((Boolean) od2Var.a.getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof t6) {
                return ((t6) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    public zg2 getSemanticsOwner() {
        return this.C;
    }

    public n41 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? td.a.a(this) : this.S;
    }

    public it1 getSnapshotObserver() {
        return this.R;
    }

    public ol2 getSoftwareKeyboardController() {
        m80 m80Var = this.n0;
        if (m80Var != null) {
            return m80Var;
        }
        m80 m80Var2 = new m80(getTextInputService());
        this.n0 = m80Var2;
        return m80Var2;
    }

    public aw2 getTextInputService() {
        aw2 aw2Var = this.l0;
        if (aw2Var != null) {
            return aw2Var;
        }
        aw2 aw2Var2 = new aw2(getLegacyTextInputServiceAndroid());
        this.l0 = aw2Var2;
        return aw2Var2;
    }

    public yw2 getTextToolbar() {
        eb ebVar = this.s0;
        if (ebVar != null) {
            return ebVar;
        }
        eb ebVar2 = new eb();
        new jy1(new o9((Object) ebVar2, (byte) 4), (byte) 24);
        this.s0 = ebVar2;
        return ebVar2;
    }

    public final ka2 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public v43 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    public k73 getWindowInfo() {
        return getComposeViewContext().t;
    }

    public final void i(l41 l41Var, boolean z) {
        this.W.f(l41Var, z);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014b A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:106:0x015a  */
    /* JADX WARN: Code duplicated, block: B:107:0x015c  */
    /* JADX WARN: Code duplicated, block: B:109:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0163 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0175 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0178 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0187 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #2 {all -> 0x01ca, blocks: (B:12:0x0030, B:14:0x003a, B:19:0x0049, B:21:0x004f, B:27:0x005b, B:30:0x0063, B:39:0x009a, B:48:0x00ad, B:50:0x00b3, B:118:0x0187, B:119:0x0193, B:31:0x006f, B:33:0x0074, B:35:0x0083, B:36:0x0089), top: B:147:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00de  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e1 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0114 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x011a A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0126 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0130 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00bd, B:54:0x00c3, B:62:0x00d4, B:67:0x00e1, B:68:0x00e4, B:70:0x00e8, B:72:0x00ee, B:74:0x00f2, B:76:0x00f8, B:79:0x0100, B:82:0x0108, B:83:0x0114, B:85:0x011a, B:87:0x0120, B:89:0x0126, B:91:0x012c, B:93:0x0130, B:94:0x0134, B:100:0x0147, B:102:0x014b, B:104:0x0152, B:111:0x0163, B:112:0x016d, B:114:0x0175, B:115:0x0178, B:116:0x017f), top: B:149:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0140  */
    /* JADX WARN: Code duplicated, block: B:99:0x0146  */
    public final int j(MotionEvent motionEvent) throws Throwable {
        MotionEvent motionEvent2;
        int actionMasked;
        boolean z;
        t6 t6Var;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent3;
        int iG;
        t6 t6Var2;
        MotionEvent motionEvent4;
        int pointerId;
        int action;
        ch1 ch1Var;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z4;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z5;
        gt0 gt0Var;
        t6 t6Var3 = this;
        t6Var3.removeCallbacks(t6Var3.B0);
        try {
            B(motionEvent);
            t6Var3.h0 = true;
            t6Var3.s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = t6Var3.t0;
                boolean z6 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                kt ktVar = t6Var3.L;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6) {
                        t6Var = this;
                    } else {
                        t6Var = this;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = t6Var.t0;
                    if (motionEvent3 != null) {
                        motionEvent4 = t6Var.t0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        ch1Var = t6Var.K;
                        if (action == 9) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = t6Var.t0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = t6Var.t0;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                motionEvent6 = t6Var.t0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (pointerId >= 0) {
                                        ch1Var.c.delete(pointerId);
                                        ch1Var.b.delete(pointerId);
                                    }
                                    gt0Var = (gt0) ktVar.c;
                                    if (gt0Var.d) {
                                        gt0Var.d = true;
                                    } else {
                                        gt0Var.g.a.g();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        ch1Var.c.delete(pointerId);
                                        ch1Var.b.delete(pointerId);
                                    }
                                    gt0Var = (gt0) ktVar.c;
                                    if (gt0Var.d) {
                                        gt0Var.d = true;
                                    } else {
                                        gt0Var.g.a.g();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = t6Var.t0;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = t6Var.t0;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            motionEvent6 = t6Var.t0;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                if (pointerId >= 0) {
                                    ch1Var.c.delete(pointerId);
                                    ch1Var.b.delete(pointerId);
                                }
                                gt0Var = (gt0) ktVar.c;
                                if (gt0Var.d) {
                                    gt0Var.d = true;
                                } else {
                                    gt0Var.g.a.g();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    ch1Var.c.delete(pointerId);
                                    ch1Var.b.delete(pointerId);
                                }
                                gt0Var = (gt0) ktVar.c;
                                if (gt0Var.d) {
                                    gt0Var.d = true;
                                } else {
                                    gt0Var.g.a.g();
                                }
                            }
                        }
                    }
                    t6Var.t0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        t6Var.H(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iG = G(motionEvent);
                    Trace.endSection();
                    if ((iG & 4) == 0) {
                        t6Var2 = this;
                    } else {
                        t6Var2 = this;
                    }
                    t6Var2.h0 = false;
                    return iG;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!ktVar.a) {
                            tc1 tc1Var = (tc1) ((xl1) ktVar.d).i;
                            int i = tc1Var.k;
                            Object[] objArr = tc1Var.j;
                            for (int i2 = 0; i2 < i; i2++) {
                                objArr[i2] = null;
                            }
                            tc1Var.k = 0;
                            tc1Var.h = false;
                            ((gt0) ktVar.c).c();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z6) {
                        motionEvent2 = motionEvent7;
                    } else {
                        t6Var3.H(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !o(motionEvent)) {
                        t6Var = this;
                    } else {
                        t6Var = this;
                        t6Var.H(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 || z2 || motionEvent2 == null || motionEvent2.isFromSource(4098)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = t6Var.t0;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = t6Var.t0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        ch1Var = t6Var.K;
                        if (action == 9 || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = t6Var.t0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = t6Var.t0;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                motionEvent6 = t6Var.t0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4 || z5) {
                                    if (pointerId >= 0) {
                                        ch1Var.c.delete(pointerId);
                                        ch1Var.b.delete(pointerId);
                                    }
                                    gt0Var = (gt0) ktVar.c;
                                    if (gt0Var.d) {
                                        gt0Var.d = true;
                                    } else {
                                        gt0Var.g.a.g();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            ch1Var.c.delete(pointerId);
                            ch1Var.b.delete(pointerId);
                        }
                    }
                    t6Var.t0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        t6Var.H(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iG = G(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iG & 4) == 0 || !z3) {
                            t6Var2 = this;
                        } else {
                            gt0 gt0Var2 = (gt0) ktVar.c;
                            if (gt0Var2.d) {
                                gt0Var2.d = true;
                            } else {
                                gt0Var2.g.a.g();
                            }
                            t6Var2 = this;
                            t6Var2.H(motionEvent, 9, motionEvent.getEventTime(), true);
                        }
                        t6Var2.h0 = false;
                        return iG;
                    } catch (Throwable th) {
                        th = th;
                        t6Var3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        t6Var3.h0 = false;
        throw th;
    }

    public final void l(l41 l41Var) {
        this.W.r(l41Var, false);
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l((l41) objArr[i2]);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        h92 h92Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().I()) {
            getRoot().d(this);
        }
        byte b = 1;
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(aa3.t());
        }
        this.y.onViewAttachedToWindow(this);
        if (!this.J0) {
            getComposeViewContext().e();
        }
        int i = 0;
        this.J0 = false;
        l(getRoot());
        k(getRoot());
        getSnapshotObserver().a.e();
        t6 outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            li1.g("Expected the view to be attached to window.");
            return;
        }
        outOfFrameExecutor.D(new e6(this, b));
        getComposeViewContext().d();
        wy composeViewContext = getComposeViewContext();
        composeViewContext.g();
        h53 h53Var = composeViewContext.f;
        j91 j91Var = this.l;
        if (h53Var == null || j91Var == null) {
            h92Var = null;
        } else {
            g53 g53VarF = h53Var.f();
            f53 f53Var = new f53();
            c30 c30Var = c30.b;
            g53VarF.getClass();
            c30Var.getClass();
            wk wkVar = new wk(g53VarF, f53Var, c30Var);
            du duVarA = z72.a(l91.class);
            String strB = duVarA.b();
            if (strB == null) {
                wg.m("Local and anonymous classes can not be ViewModels");
                return;
            }
            l91 l91Var = (l91) wkVar.y(duVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            si1 si1Var = l91Var.b;
            Object objB = si1Var.b(id);
            if (objB == null) {
                objB = new fj1(1);
                si1Var.h(id, objB);
            }
            fj1 fj1Var = (fj1) objB;
            Object[] objArr = fj1Var.a;
            int i2 = fj1Var.b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((k91) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            k91 k91Var = (k91) obj;
            if (k91Var == null) {
                k91Var = new k91();
                fj1Var.a(k91Var);
            }
            k91Var.c = true;
            this.m = k91Var;
            h92Var = k91Var.b;
        }
        if (h92Var == null) {
            h92Var = c5.X;
        }
        this.o = h92Var;
        vp0 vp0Var = this.j0;
        if (vp0Var != null) {
            vp0Var.h(getComposeViewContext());
            this.j0 = null;
        }
        h91 h91VarG = getComposeViewContext().d().g();
        h91VarG.a(this);
        h91VarG.a(this.E);
        getInputModeManager().a.setValue(new kx0(isInTouchMode() ? (byte) 1 : (byte) 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            e7.a.b(this);
        }
        z5 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((em0) getFocusOwner()).g.a(autofillManager);
            getSemanticsOwner().d.a(autofillManager);
        }
        ((em0) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        xh2 xh2Var = (xh2) this.m0.get();
        r9 r9Var = (r9) (xh2Var != null ? xh2Var.b : null);
        if (r9Var == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        xh2 xh2Var2 = (xh2) r9Var.k.get();
        jx0 jx0Var = (jx0) (xh2Var2 != null ? xh2Var2.b : null);
        return jx0Var != null && (jx0Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        J(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x014f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:112:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f  */
    /* JADX WARN: Code duplicated, block: B:118:0x018d  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i2;
        xh2 xh2Var = (xh2) this.m0.get();
        r9 r9Var = (r9) (xh2Var != null ? xh2Var.b : null);
        if (r9Var != null) {
            xh2 xh2Var2 = (xh2) r9Var.k.get();
            jx0 jx0Var = (jx0) (xh2Var2 != null ? xh2Var2.b : null);
            if (jx0Var == null) {
                return null;
            }
            synchronized (jx0Var.c) {
                if (jx0Var.e) {
                    return null;
                }
                o72 o72VarA = jx0Var.a.a(editorInfo);
                p pVar = new p((Object) jx0Var, (byte) 26);
                InputConnection to1Var = Build.VERSION.SDK_INT >= 34 ? new to1(o72VarA, pVar) : new so1(o72VarA, pVar);
                jx0Var.d.b(new z53(to1Var));
                return to1Var;
            }
        }
        cw2 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.d) {
            return null;
        }
        nu0 nu0Var = legacyTextInputServiceAndroid.h;
        vv2 vv2Var = legacyTextInputServiceAndroid.g;
        int i3 = nu0Var.e;
        boolean z = nu0Var.a;
        int i4 = 4;
        int i5 = 3;
        if (i3 == 1) {
            i = !z ? 0 : 6;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                li1.g("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i6 = nu0Var.d;
        byte b = 16;
        if (i6 != 1) {
            if (i6 == 2) {
                editorInfo.inputType = 1;
                i |= Integer.MIN_VALUE;
                editorInfo.imeOptions = i;
            } else if (i6 == 3) {
                editorInfo.inputType = 2;
                i4 = 2;
            } else {
                if (i6 == 4) {
                    editorInfo.inputType = 3;
                } else {
                    i5 = 17;
                    if (i6 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i6 == 6) {
                        i4 = 33;
                        editorInfo.inputType = 33;
                    } else if (i6 == 7) {
                        i4 = 129;
                        editorInfo.inputType = 129;
                    } else if (i6 == 8) {
                        editorInfo.inputType = 18;
                        i4 = 18;
                    } else if (i6 == 9) {
                        i4 = 8194;
                        editorInfo.inputType = 8194;
                    } else if (i6 == 10) {
                        i4 = 145;
                        editorInfo.inputType = 145;
                    } else if (i6 == 11) {
                        i4 = 113;
                        editorInfo.inputType = 113;
                    } else if (i6 == 12) {
                        i4 = 97;
                        editorInfo.inputType = 97;
                    } else if (i6 == 13) {
                        i4 = 49;
                        editorInfo.inputType = 49;
                    } else if (i6 == 14) {
                        i4 = 65;
                        editorInfo.inputType = 65;
                    } else if (i6 == 15) {
                        i4 = 81;
                        editorInfo.inputType = 81;
                    } else if (i6 == 16) {
                        i4 = 177;
                        editorInfo.inputType = 177;
                    } else if (i6 == 17) {
                        i4 = 193;
                        editorInfo.inputType = 193;
                    } else if (i6 == 18) {
                        editorInfo.inputType = 4;
                    } else {
                        i4 = 20;
                        if (i6 == 19) {
                            editorInfo.inputType = 20;
                        } else if (i6 == 20) {
                            i4 = 36;
                            editorInfo.inputType = 36;
                        } else if (i6 == 21) {
                            i4 = 4098;
                            editorInfo.inputType = 4098;
                        } else if (i6 == 22) {
                            i4 = 12290;
                            editorInfo.inputType = 12290;
                        } else if (i6 == 23) {
                            i4 = 8210;
                            editorInfo.inputType = 8210;
                        } else if (i6 == 24) {
                            i4 = 4114;
                            editorInfo.inputType = 4114;
                        } else {
                            if (i6 != 25) {
                                li1.g("Invalid Keyboard Type");
                                return null;
                            }
                            i4 = 12306;
                            editorInfo.inputType = 12306;
                        }
                    }
                }
                i4 = i5;
            }
            if (!z && (i4 & 15) == 1) {
                i4 |= 131072;
                editorInfo.inputType = i4;
                if (i3 == 1) {
                    editorInfo.imeOptions = i | 1073741824;
                }
            }
            if ((i4 & 15) == 1) {
                i2 = nu0Var.b;
                if (i2 == 1) {
                    i4 |= 4096;
                    editorInfo.inputType = i4;
                } else if (i2 == 2) {
                    i4 |= 8192;
                    editorInfo.inputType = i4;
                } else if (i2 == 3) {
                    i4 |= CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                    editorInfo.inputType = i4;
                }
                if (nu0Var.c) {
                    editorInfo.inputType = i4 | 32768;
                }
            }
            long j = vv2Var.b;
            int i7 = qw2.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            ys.c0(editorInfo, vv2Var.a.i);
            editorInfo.imeOptions |= 33554432;
            if (if0.d()) {
                if0.a().g(editorInfo);
            }
            n72 n72Var = new n72(legacyTextInputServiceAndroid.g, new xl1(legacyTextInputServiceAndroid, b), legacyTextInputServiceAndroid.h.c);
            legacyTextInputServiceAndroid.i.add(new WeakReference(n72Var));
            return n72Var;
        }
        editorInfo.inputType = 1;
        i4 = 1;
        if (!z) {
            i4 |= 131072;
            editorInfo.inputType = i4;
            if (i3 == 1) {
                editorInfo.imeOptions = i | 1073741824;
            }
        }
        if ((i4 & 15) == 1) {
            i2 = nu0Var.b;
            if (i2 == 1) {
                i4 |= 4096;
                editorInfo.inputType = i4;
            } else if (i2 == 2) {
                i4 |= 8192;
                editorInfo.inputType = i4;
            } else if (i2 == 3) {
                i4 |= CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                editorInfo.inputType = i4;
            }
            if (nu0Var.c) {
                editorInfo.inputType = i4 | 32768;
            }
        }
        long j2 = vv2Var.b;
        int i8 = qw2.c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        ys.c0(editorInfo, vv2Var.a.i);
        editorInfo.imeOptions |= 33554432;
        if (if0.d()) {
            if0.a().g(editorInfo);
        }
        n72 n72Var2 = new n72(legacyTextInputServiceAndroid.g, new xl1(legacyTextInputServiceAndroid, b), legacyTextInputServiceAndroid.h.c);
        legacyTextInputServiceAndroid.i.add(new WeakReference(n72Var2));
        return n72Var2;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        o7 o7Var = this.E;
        o7Var.getClass();
        m7.e(o7Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.y.onViewDetachedFromWindow(this);
        View view = this.s;
        if (m() && view != null) {
            removeView(view);
        }
        fj1 fj1Var = R0;
        synchronized (fj1Var) {
            fj1Var.k(this);
        }
        getComposeViewContext().b();
        nl2 nl2Var = getSnapshotObserver().a;
        v3 v3Var = nl2Var.h;
        if (v3Var != null) {
            v3Var.b();
        }
        nl2Var.a();
        h91 h91VarG = getComposeViewContext().d().g();
        h91VarG.f(this.E);
        h91VarG.f(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        k91 k91Var = this.m;
        if (k91Var != null) {
            k91Var.c = false;
        }
        this.m = null;
        if (Build.VERSION.SDK_INT >= 31) {
            e7.a.a(this);
        }
        z5 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.k(autofillManager);
            ((em0) getFocusOwner()).g.k(autofillManager);
        }
        s72 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        s72 rectManager2 = getRectManager();
        t tVar = rectManager2.i;
        if (tVar != null) {
            rectManager2.b.removeCallbacks(tVar);
            rectManager2.i = null;
        }
        ((em0) getFocusOwner()).g.k(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        em0 em0Var = (em0) getFocusOwner();
        vs.T(em0Var.c, true);
        if (em0Var.f() != null) {
            lm0 lm0VarF = em0Var.f();
            em0Var.i(null);
            if (lm0VarF != null) {
                lm0VarF.K0(km0.h, km0.j);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.g0 = 0L;
        K();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        J(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.g0 = 0L;
            this.W.k(this.G0);
            this.U = null;
            K();
            if (this.T != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        we1 we1Var = this.W;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().I()) {
                getRoot().d(this);
            }
            if (!isAttachedToWindow()) {
                l(getRoot());
            }
            long jG = g(i);
            long jG2 = g(i2);
            long jX = lt.x((int) (jG >>> 32), (int) (jG & 4294967295L), (int) (jG2 >>> 32), (int) (jG2 & 4294967295L));
            k00 k00Var = this.U;
            if (k00Var == null) {
                this.U = new k00(jX);
                this.V = false;
            } else if (!k00.c(k00Var.a, jX)) {
                this.V = true;
            }
            we1Var.s(jX);
            we1Var.m();
            setMeasuredDimension(getRoot().M.p.h, getRoot().M.p.i);
            if (this.T != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().M.p.h, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().M.p.i, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.K0) {
            return;
        }
        z(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        s9 s9Var;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (s9Var = ((p6) getPointerIconService()).a) == null) ? super.onResolvePointerIcon(motionEvent, i) : PointerIcon.getSystemIcon(getContext(), s9Var.b);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        u31 u31Var;
        if (this.j) {
            int[] iArr = yl0.a;
            u31 u31Var2 = u31.h;
            if (i != 0) {
                u31Var = i != 1 ? null : u31.i;
            } else {
                u31Var = u31Var2;
            }
            if (u31Var != null) {
                u31Var2 = u31Var;
            }
            setLayoutDirection(u31Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        od2 od2Var;
        if (Build.VERSION.SDK_INT < 31 || (od2Var = this.L0) == null) {
            return;
        }
        od2Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        K();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new kx0(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        o7 o7Var = this.E;
        o7Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (uz0.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            m7.b(o7Var, longSparseArray);
        } else {
            o7Var.h.post(new l7(o7Var, longSparseArray, (byte) 0));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zT;
        this.I0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zT = aa3.t())) {
            return;
        }
        setShowLayoutBounds(zT);
        k(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.t0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void q(float[] fArr) {
        A();
        ke1.e(fArr, this.e0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.i0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.i0 & 4294967295L));
        float[] fArr2 = this.c0;
        ke1.d(fArr2);
        ke1.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        float fC0 = h7.c0(fArr2, 0, fArr, 0);
        float fC1 = h7.c0(fArr2, 0, fArr, 1);
        float fC2 = h7.c0(fArr2, 0, fArr, 2);
        float fC3 = h7.c0(fArr2, 0, fArr, 3);
        float fC4 = h7.c0(fArr2, 1, fArr, 0);
        float fC5 = h7.c0(fArr2, 1, fArr, 1);
        float fC6 = h7.c0(fArr2, 1, fArr, 2);
        float fC7 = h7.c0(fArr2, 1, fArr, 3);
        float fC8 = h7.c0(fArr2, 2, fArr, 0);
        float fC9 = h7.c0(fArr2, 2, fArr, 1);
        float fC10 = h7.c0(fArr2, 2, fArr, 2);
        float fC11 = h7.c0(fArr2, 2, fArr, 3);
        float fC12 = h7.c0(fArr2, 3, fArr, 0);
        float fC13 = h7.c0(fArr2, 3, fArr, 1);
        float fC14 = h7.c0(fArr2, 3, fArr, 2);
        float fC15 = h7.c0(fArr2, 3, fArr, 3);
        fArr[0] = fC0;
        fArr[1] = fC1;
        fArr[2] = fC2;
        fArr[3] = fC3;
        fArr[4] = fC4;
        fArr[5] = fC5;
        fArr[6] = fC6;
        fArr[7] = fC7;
        fArr[8] = fC8;
        fArr[9] = fC9;
        fArr[10] = fC10;
        fArr[11] = fC11;
        fArr[12] = fC12;
        fArr[13] = fC13;
        fArr[14] = fC14;
        fArr[15] = fC15;
    }

    public final long r(long j) {
        A();
        long jB = ke1.b(j, this.e0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.i0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.i0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        byte b = 1;
        if (!isFocused()) {
            ul0 ul0VarC = yl0.c(i);
            byte b2 = ul0VarC != null ? ul0VarC.a : (byte) 7;
            Boolean boolE = ((em0) getFocusOwner()).e(b2, rect != null ? new r72(rect.left, rect.top, rect.right, rect.bottom) : null, new j6(b2, (byte) 0));
            Boolean bool = Boolean.TRUE;
            if (!uz0.g(boolE, bool)) {
                if (!uz0.g(((em0) getFocusOwner()).e(b2, null, new j6(b2, b)), bool)) {
                    if (hasFocus() && (b2 == 1 || b2 == 2)) {
                        return ((em0) getFocusOwner()).h(b2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(boolean z) {
        we1 we1Var = this.W;
        if (we1Var.b.s() || ((uj1) we1Var.e.i).j != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (we1Var.k(z ? this.G0 : this.H0)) {
                    requestLayout();
                }
                we1Var.a(false);
                getRectManager().a();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.D.o = j;
    }

    public final void setComposeViewContext(wy wyVar) {
        if (getCoroutineContext() != wyVar.c().j() && !((dj1) getRoot().n()).isEmpty()) {
            ax0.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        uk2 uk2VarN = y02.n();
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            wy wyVar2 = get_composeViewContext();
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            if (wyVar != wyVar2) {
                if (isAttachedToWindow()) {
                    wyVar2.b();
                    wyVar.e();
                }
                set_composeViewContext(wyVar);
                setCoroutineContext(wyVar.c().j());
            }
        } catch (Throwable th) {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.J0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.M.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(o7 o7Var) {
        this.E = o7Var;
    }

    public void setCoroutineContext(o20 o20Var) {
        this.u = o20Var;
    }

    public final void setFrameEndScheduler$ui(j91 j91Var) {
        this.l = j91Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.g0 = j;
    }

    public final void setOnReadyForComposition(vp0 vp0Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.J0) {
            vp0Var.h(getComposeViewContext());
        } else {
            this.j0 = vp0Var;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(zp0 zp0Var) {
        this.E0 = zp0Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m5setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(ev0 ev0Var) {
        this.k = ev0Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.S = z;
    }

    public void setUncaughtExceptionHandler(ka2 ka2Var) {
        this.W.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(l41 l41Var, long j) {
        we1 we1Var = this.W;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            we1Var.l(l41Var, j);
            if (!we1Var.b.s()) {
                we1Var.a(false);
                getRectManager().a();
                this.H0.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void u() {
        fj1 fj1Var;
        Object[] objArr;
        if (this.Q) {
            nl2 nl2Var = getSnapshotObserver().a;
            de1 de1Var = new de1((byte) 28);
            synchronized (nl2Var.g) {
                uj1 uj1Var = nl2Var.f;
                int i = uj1Var.j;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    objArr = uj1Var.h;
                    if (i2 >= i) {
                        break;
                    }
                    ml2 ml2Var = (ml2) objArr[i2];
                    ml2Var.d(de1Var);
                    if (!ml2Var.f.j()) {
                        i3++;
                    } else if (i3 > 0) {
                        Object[] objArr2 = uj1Var.h;
                        objArr2[i2 - i3] = objArr2[i2];
                    }
                    i2++;
                }
                int i4 = i - i3;
                Arrays.fill(objArr, i4, i, (Object) null);
                uj1Var.j = i4;
            }
            this.Q = false;
        }
        ob obVar = this.T;
        if (obVar != null) {
            f(obVar);
        }
        z5 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ti1 ti1Var = autofillManager.o;
            if (ti1Var.d == 0 && autofillManager.p) {
                autofillManager.h.H().commit();
                autofillManager.p = false;
            }
            if (ti1Var.d != 0) {
                autofillManager.p = true;
            }
        }
        while (this.w0.j() && this.w0.g(0) != null) {
            int i5 = this.w0.b;
            int i6 = 0;
            while (true) {
                fj1Var = this.w0;
                if (i6 < i5) {
                    kp0 kp0Var = (kp0) fj1Var.g(i6);
                    this.w0.o(i6, null);
                    if (kp0Var != null) {
                        kp0Var.a();
                    }
                    i6++;
                }
            }
            fj1Var.m(0, i5);
        }
    }

    public final void v(l41 l41Var) {
        a7 a7Var = this.D;
        a7Var.E = true;
        if (a7Var.q()) {
            a7Var.r(l41Var);
        }
        o7 o7Var = this.E;
        o7Var.m = true;
        if (o7Var.h()) {
            o7Var.n.s(j23.a);
        }
    }

    public final void w(l41 l41Var, boolean z, boolean z2, boolean z3) {
        l41 l41VarU;
        l41 l41VarU2;
        we1 we1Var = this.W;
        if (!z) {
            if (we1Var.r(l41Var, z2) && z3) {
                E(l41Var);
                return;
            }
            return;
        }
        eg egVar = we1Var.b;
        l41 l41Var2 = l41Var.o;
        p41 p41Var = l41Var.M;
        if (l41Var2 == null) {
            ax0.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = p41Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    wg.n();
                    return;
                }
                if (!p41Var.e || z2) {
                    p41Var.e = true;
                    p41Var.p.B = true;
                    if (l41Var.U) {
                        return;
                    }
                    if ((uz0.g(l41Var.K(), Boolean.TRUE) || we1.h(l41Var)) && ((l41VarU = l41Var.u()) == null || !l41VarU.M.e)) {
                        egVar.a(l41Var, b01.h);
                    } else if ((l41Var.J() || we1.i(l41Var)) && ((l41VarU2 = l41Var.u()) == null || !l41VarU2.q())) {
                        egVar.a(l41Var, b01.j);
                    }
                    if (we1Var.d || !z3) {
                        return;
                    }
                    E(l41Var);
                    return;
                }
                return;
            }
        }
        we1Var.g.b(new ve1(l41Var, true, z2));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final void x(l41 l41Var, boolean z, boolean z2) {
        p41 p41Var = l41Var.M;
        b01 b01Var = b01.k;
        we1 we1Var = this.W;
        if (!z) {
            we1Var.getClass();
            int iOrdinal = p41Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                wg.n();
                return;
            }
            l41 l41VarU = l41Var.u();
            boolean z3 = l41VarU == null || l41VarU.J();
            if (!z2) {
                if (l41Var.q()) {
                    return;
                }
                if (l41Var.p() && l41Var.J() == z3 && l41Var.J() == p41Var.p.A) {
                    return;
                }
            }
            ye1 ye1Var = p41Var.p;
            ye1Var.C = true;
            ye1Var.D = true;
            if (!l41Var.U && ye1Var.A && z3) {
                if (l41VarU == null || (!l41VarU.p() && !l41VarU.q())) {
                    we1Var.b.a(l41Var, b01Var);
                }
                if (we1Var.d) {
                    return;
                }
                E(null);
                return;
            }
            return;
        }
        eg egVar = we1Var.b;
        int iOrdinal2 = p41Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    wg.n();
                    return;
                }
            }
        }
        if ((p41Var.e || p41Var.f) && !z2) {
            return;
        }
        p41Var.f = true;
        p41Var.g = true;
        ye1 ye1Var2 = p41Var.p;
        ye1Var2.C = true;
        ye1Var2.D = true;
        if (l41Var.U) {
            return;
        }
        l41 l41VarU2 = l41Var.u();
        if (uz0.g(l41Var.K(), Boolean.TRUE)) {
            if (l41VarU2 != null) {
                p41 p41Var2 = l41VarU2.M;
                if (p41Var2.e || p41Var2.f) {
                    if (l41Var.J()) {
                        egVar.a(l41Var, b01Var);
                    }
                }
            }
            egVar.a(l41Var, b01.i);
        } else if (l41Var.J() && (l41VarU2 == null || (!l41VarU2.p() && !l41VarU2.q()))) {
            egVar.a(l41Var, b01Var);
        }
        if (we1Var.d) {
            return;
        }
        E(null);
    }

    public final void y() {
        a7 a7Var = this.D;
        a7Var.E = true;
        Handler handler = a7Var.k.getHandler();
        if (a7Var.q() && !a7Var.P && handler != null) {
            a7Var.P = true;
            handler.post(a7Var.R);
        }
        o7 o7Var = this.E;
        o7Var.m = true;
        Handler handler2 = o7Var.h.getHandler();
        if (!o7Var.h() || o7Var.s || handler2 == null) {
            return;
        }
        o7Var.s = true;
        handler2.post(o7Var.t);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    public final void z(ViewStructure viewStructure) {
        z5 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            l41 l41Var = autofillManager.i.a;
            AutofillId autofillId = autofillManager.n;
            String str = autofillManager.l;
            s72 s72Var = autofillManager.k;
            rz1.y(viewStructure, l41Var, autofillId, str, s72Var);
            Object[] objArr = kp1.a;
            fj1 fj1Var = new fj1(2);
            fj1Var.a(l41Var);
            fj1Var.a(viewStructure);
            while (fj1Var.j()) {
                Object objL = fj1Var.l(fj1Var.b - 1);
                objL.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objL;
                Object objL2 = fj1Var.l(fj1Var.b - 1);
                objL2.getClass();
                dj1 dj1Var = (dj1) ((l41) objL2).n();
                int i = ((uj1) dj1Var.i).j;
                for (int i2 = 0; i2 < i; i2++) {
                    l41 l41Var2 = (l41) dj1Var.get(i2);
                    if (!l41Var2.U && l41Var2.I() && l41Var2.J()) {
                        rg2 rg2VarW = l41Var2.w();
                        if (rg2VarW != null) {
                            mj1 mj1Var = rg2VarW.h;
                            if (mj1Var.b(qg2.g) || mj1Var.b(qg2.h) || mj1Var.b(ah2.r) || mj1Var.b(ah2.s) || (Build.VERSION.SDK_INT >= 34 && mj1Var.b(h7.V))) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                rz1.y(viewStructureNewChild, l41Var2, autofillId, str, s72Var);
                                fj1Var.a(l41Var2);
                                fj1Var.a(viewStructureNewChild);
                            } else {
                                fj1Var.a(l41Var2);
                                fj1Var.a(viewStructure2);
                            }
                        } else {
                            fj1Var.a(l41Var2);
                            fj1Var.a(viewStructure2);
                        }
                    }
                }
            }
        }
        y5 autofill = getAutofill();
        if (autofill != null) {
            vi viVar = autofill.b;
            LinkedHashMap linkedHashMap = viVar.a;
            LinkedHashMap linkedHashMap2 = viVar.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    li1.c();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId(autofill.c, iIntValue);
                viewStructureNewChild2.setId(iIntValue, autofill.a.getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    public y5 getAutofill() {
        return this.O;
    }

    public z5 getAutofillManager() {
        return this.P;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public f8 m8getDragAndDropManager() {
        return this.v;
    }

    public si1 getLayoutNodes() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @k90
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m3getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @k90
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public la2 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(ka2 ka2Var) {
    }
}
