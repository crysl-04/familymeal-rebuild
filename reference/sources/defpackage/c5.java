package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import com.familymeal.app.MealPlannerApp;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c5 implements bo, n20, f90, kp, h92, hl2, cp2 {
    public static final wg A;
    public static final /* synthetic */ c5 B;
    public static final r3 C;
    public static final yx E;
    public static final yx G;
    public static final rt H;
    public static final /* synthetic */ c5 L;
    public static final c5 e0;
    public static final c5 y;
    public final /* synthetic */ byte h;
    public static final dm i = new dm(-1.0f, -1.0f);
    public static final dm j = new dm(0.0f, -1.0f);
    public static final dm k = new dm(1.0f, -1.0f);
    public static final dm l = new dm(-1.0f, 0.0f);
    public static final dm m = new dm(0.0f, 0.0f);
    public static final dm n = new dm(1.0f, 0.0f);
    public static final dm o = new dm(-1.0f, 1.0f);
    public static final dm p = new dm(0.0f, 1.0f);
    public static final dm q = new dm(1.0f, 1.0f);
    public static final cm r = new cm(-1.0f);
    public static final cm s = new cm(0.0f);
    public static final cm t = new cm(1.0f);
    public static final bm u = new bm(-1.0f);
    public static final bm v = new bm(0.0f);
    public static final bm w = new bm(1.0f);
    public static final /* synthetic */ c5 x = new c5(1);
    public static final c5 z = new c5(3);
    public static final yx D = new yx(5);
    public static final yx F = new yx(7);
    public static final p7 I = new p7(0);
    public static final p7 J = new p7(1);
    public static final p7 K = new p7(2);
    public static final /* synthetic */ c5 M = new c5(9);
    public static final c5 N = new c5(10);
    public static final c5 O = new c5(11);
    public static final c5 P = new c5(12);
    public static final c5 Q = new c5(13);
    public static final c5 R = new c5(14);
    public static final u31 S = u31.h;
    public static final h90 T = new h90(1.0f, 1.0f);
    public static final c5 U = new c5(15);
    public static final c5 V = new c5(16);
    public static final r72 W = new r72(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final c5 X = new c5(18);
    public static final /* synthetic */ c5 Y = new c5(19);
    public static final /* synthetic */ c5 Z = new c5(20);
    public static final c5 a0 = new c5(21);
    public static final c5 b0 = new c5(22);
    public static final /* synthetic */ c5 c0 = new c5(23);
    public static final /* synthetic */ c5 d0 = new c5(24);
    public static final c5 f0 = new c5(26);
    public static final c5 g0 = new c5(27);
    public static final c5 h0 = new c5(28);
    public static final c5 i0 = new c5(29);

    static {
        byte b = 2;
        y = new c5(b);
        A = new wg(b);
        byte b2 = 6;
        B = new c5(b2);
        byte b3 = 25;
        C = new r3(b3);
        E = new yx(b2);
        byte b4 = 8;
        G = new yx(b4);
        H = new rt(b);
        L = new c5(b4);
        e0 = new c5(b3);
    }

    public /* synthetic */ c5(byte b) {
        this.h = b;
    }

    public static zs k(dr0 dr0Var) {
        pv pvVar = (pv) dr0Var.j(rv.a);
        zs zsVar = pvVar.c0;
        if (zsVar != null) {
            return zsVar;
        }
        long jC = rv.c(pvVar, et.c);
        long j2 = kv.f;
        qv qvVar = et.a;
        long jC2 = rv.c(pvVar, qvVar);
        qv qvVar2 = et.b;
        zs zsVar2 = new zs(jC, j2, jC2, j2, kv.b(0.38f, rv.c(pvVar, qvVar2)), j2, kv.b(0.38f, rv.c(pvVar, qvVar2)), rv.c(pvVar, qvVar), rv.c(pvVar, et.f), kv.b(0.38f, rv.c(pvVar, qvVar2)), kv.b(0.38f, rv.c(pvVar, et.e)), kv.b(0.38f, rv.c(pvVar, qvVar2)));
        pvVar.c0 = zsVar2;
        return zsVar2;
    }

    public static au2 l(int i2, dr0 dr0Var) {
        return m((pv) dr0Var.j(rv.a), dr0Var);
    }

    public static au2 m(pv pvVar, dr0 dr0Var) {
        au2 au2Var = pvVar.i0;
        boolean z2 = false;
        if (au2Var == null) {
            dr0Var.V(390452338);
            dr0Var.p(false);
            au2Var = null;
        } else {
            rw2 rw2Var = au2Var.k;
            dr0Var.V(390452339);
            rw2 rw2Var2 = (rw2) dr0Var.j(sw2.a);
            if (!uz0.g(rw2Var, rw2Var2)) {
                au2 au2Var2 = new au2(au2Var.a, au2Var.b, au2Var.c, au2Var.d, au2Var.e, au2Var.f, au2Var.g, au2Var.h, au2Var.i, au2Var.j, rw2Var2 == null ? rw2Var : rw2Var2, au2Var.l, au2Var.m, au2Var.n, au2Var.o, au2Var.p, au2Var.q, au2Var.r, au2Var.s, au2Var.t, au2Var.u, au2Var.v, au2Var.w, au2Var.x, au2Var.y, au2Var.z, au2Var.A, au2Var.B, au2Var.C, au2Var.D, au2Var.E, au2Var.F, au2Var.G, au2Var.H, au2Var.I, au2Var.J, au2Var.K, au2Var.L, au2Var.M, au2Var.N, au2Var.O, au2Var.P, au2Var.Q);
                pvVar.i0 = au2Var2;
                au2Var = au2Var2;
                z2 = false;
            }
            dr0Var.p(z2);
        }
        if (au2Var != null) {
            dr0Var.V(-1788515437);
            dr0Var.p(false);
            return au2Var;
        }
        dr0Var.V(-1788321191);
        long jC = rv.c(pvVar, ia2.K);
        long jC2 = rv.c(pvVar, ia2.Q);
        qv qvVar = ia2.x;
        long jB = kv.b(0.38f, rv.c(pvVar, qvVar));
        long jC3 = rv.c(pvVar, ia2.E);
        long j2 = kv.f;
        long jC4 = rv.c(pvVar, ia2.v);
        long jC5 = rv.c(pvVar, ia2.D);
        rw2 rw2Var3 = (rw2) dr0Var.j(sw2.a);
        long jC6 = rv.c(pvVar, ia2.N);
        long jC7 = rv.c(pvVar, ia2.W);
        long jB2 = kv.b(0.12f, rv.c(pvVar, ia2.A));
        long jC8 = rv.c(pvVar, ia2.H);
        long jC9 = rv.c(pvVar, ia2.M);
        long jC10 = rv.c(pvVar, ia2.V);
        long jB3 = kv.b(0.38f, rv.c(pvVar, ia2.z));
        long jC11 = rv.c(pvVar, ia2.G);
        long jC12 = rv.c(pvVar, ia2.P);
        long jC13 = rv.c(pvVar, ia2.Y);
        long jB4 = kv.b(0.38f, rv.c(pvVar, ia2.C));
        long jC14 = rv.c(pvVar, ia2.J);
        long jC15 = rv.c(pvVar, ia2.L);
        long jC16 = rv.c(pvVar, ia2.U);
        long jB5 = kv.b(0.38f, rv.c(pvVar, ia2.y));
        long jC17 = rv.c(pvVar, ia2.F);
        qv qvVar2 = ia2.R;
        long jC18 = rv.c(pvVar, qvVar2);
        long jC19 = rv.c(pvVar, qvVar2);
        long jB6 = kv.b(0.38f, rv.c(pvVar, qvVar));
        long jC20 = rv.c(pvVar, qvVar2);
        long jC21 = rv.c(pvVar, ia2.O);
        long jC22 = rv.c(pvVar, ia2.X);
        long jB7 = kv.b(0.38f, rv.c(pvVar, ia2.B));
        long jC23 = rv.c(pvVar, ia2.I);
        qv qvVar3 = ia2.S;
        long jC24 = rv.c(pvVar, qvVar3);
        long jC25 = rv.c(pvVar, qvVar3);
        long jB8 = kv.b(0.38f, rv.c(pvVar, qvVar3));
        long jC26 = rv.c(pvVar, qvVar3);
        qv qvVar4 = ia2.T;
        au2 au2Var3 = new au2(jC, jC2, jB, jC3, j2, j2, j2, j2, jC4, jC5, rw2Var3, jC6, jC7, jB2, jC8, jC9, jC10, jB3, jC11, jC12, jC13, jB4, jC14, jC15, jC16, jB5, jC17, jC18, jC19, jB6, jC20, jC21, jC22, jB7, jC23, jC24, jC25, jB8, jC26, rv.c(pvVar, qvVar4), rv.c(pvVar, qvVar4), kv.b(0.38f, rv.c(pvVar, qvVar4)), rv.c(pvVar, qvVar4));
        pvVar.i0 = au2Var3;
        dr0Var.p(false);
        return au2Var3;
    }

    @Override // defpackage.bo
    public final Rect a(Activity activity) throws Exception {
        byte b = this.h;
        c5 c5Var = bo.d;
        DisplayCutout displayCutout = null;
        switch (b) {
            case 2:
                Rect rect = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        objInvoke.getClass();
                        rect.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        objInvoke2.getClass();
                        rect.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    c5Var.getClass();
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                }
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i2 = rect.bottom + dimensionPixelSize;
                    if (i2 == point.y) {
                        rect.bottom = i2;
                    } else {
                        int i3 = rect.right + dimensionPixelSize;
                        if (i3 == point.x) {
                            rect.right = i3;
                        } else if (rect.left == dimensionPixelSize) {
                            rect.left = 0;
                        }
                    }
                }
                if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (obj2 instanceof DisplayCutout) {
                            displayCutout = (DisplayCutout) obj2;
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        c5Var.getClass();
                    }
                    if (displayCutout != null) {
                        if (rect.left == displayCutout.getSafeInsetLeft()) {
                            rect.left = 0;
                        }
                        if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                            rect.right = displayCutout.getSafeInsetRight() + rect.right;
                        }
                        if (rect.top == displayCutout.getSafeInsetTop()) {
                            rect.top = 0;
                        }
                        if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                            rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                        }
                    }
                }
                return rect;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object objInvoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    objInvoke3.getClass();
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    c5Var.getClass();
                    return y.a(activity);
                }
        }
    }

    @Override // defpackage.kp
    public final e90 b() {
        return T;
    }

    @Override // defpackage.cp2
    public final void c(bp2 bp2Var) {
        bp2Var.clear();
    }

    @Override // defpackage.kp
    public final long d() {
        return 9205357640488583168L;
    }

    @Override // defpackage.hl2
    public final boolean e(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.f90
    public final float f(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0164  */
    /* JADX WARN: Code duplicated, block: B:101:0x0167  */
    /* JADX WARN: Code duplicated, block: B:103:0x0189  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:113:0x0209  */
    /* JADX WARN: Code duplicated, block: B:116:0x0215  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x0131  */
    /* JADX WARN: Code duplicated, block: B:95:0x0141  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    public final void g(final boolean z2, final boolean z3, final hz0 hz0Var, rg1 rg1Var, final au2 au2Var, final hi2 hi2Var, float f, float f2, dr0 dr0Var, final int i2, final int i3) {
        rg1 rg1Var2;
        int i4;
        int i5;
        int i6;
        float f3;
        float f4;
        boolean z4;
        final rg1 rg1Var3;
        final float f5;
        final float f6;
        e72 e72VarR;
        rg1 rg1Var4;
        float f7;
        int i7;
        float f8;
        boolean zBooleanValue;
        long j2;
        gh1 gh1Var;
        zm2 zm2VarA0;
        kn2 kn2VarC;
        zm2 zm2VarA1;
        gh1 gh1Var2;
        float f9;
        kn2 kn2VarC2;
        long j3;
        float f10;
        dr0Var.W(1035477640);
        int i8 = (dr0Var.g(z2) ? 4 : 2) | i2 | (dr0Var.g(z3) ? 32 : 16) | (dr0Var.f(hz0Var) ? 256 : 128);
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                rg1Var2 = rg1Var;
                i8 |= dr0Var.f(rg1Var2) ? 2048 : 1024;
            }
            if (dr0Var.f(au2Var)) {
                i4 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            } else {
                i4 = 8192;
            }
            int i10 = i8 | i4;
            if (dr0Var.f(hi2Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i6 = i10 | i5;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    f3 = f;
                    int i11 = dr0Var.c(f3) ? 1048576 : 524288;
                    i6 |= i11;
                } else {
                    f3 = f;
                }
                i6 |= i11;
            } else {
                f3 = f;
            }
            if ((12582912 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    f4 = f2;
                    int i12 = dr0Var.c(f4) ? 8388608 : 4194304;
                    i6 |= i12;
                } else {
                    f4 = f2;
                }
                i6 |= i12;
            } else {
                f4 = f2;
            }
            if ((38347923 & i6) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dr0Var.N(i6 & 1, z4)) {
                dr0Var.S();
                if ((i2 & 1) != 0 || dr0Var.x()) {
                    if (i9 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                        f7 = 2.0f;
                    } else {
                        f7 = f3;
                    }
                    if ((i3 & 128) != 0) {
                        rg1 rg1Var5 = rg1Var4;
                        i7 = i6 & (-29360129);
                        rg1Var3 = rg1Var5;
                        f8 = f7;
                        f4 = 1.0f;
                    } else {
                        rg1 rg1Var6 = rg1Var4;
                        i7 = i6;
                        rg1Var3 = rg1Var6;
                        f8 = f7;
                    }
                } else {
                    dr0Var.Q();
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i6 &= -29360129;
                    }
                    i7 = i6;
                    rg1Var3 = rg1Var2;
                    f8 = f3;
                }
                dr0Var.q();
                zBooleanValue = ((Boolean) ls.r(hz0Var, dr0Var, (i7 >> 6) & 14).getValue()).booleanValue();
                if (!z2) {
                    j2 = au2Var.n;
                } else if (z3) {
                    j2 = au2Var.o;
                } else if (zBooleanValue) {
                    j2 = au2Var.l;
                } else {
                    j2 = au2Var.m;
                }
                gh1Var = gh1.k;
                zm2VarA0 = ls.a0(gh1Var, dr0Var);
                if (z2) {
                    dr0Var.V(-1674507999);
                    kn2VarC = vj2.a(j2, zm2VarA0, dr0Var);
                    dr0Var.p(false);
                } else {
                    dr0Var.V(-1674427244);
                    kn2VarC = rz1.C(new kv(j2), dr0Var);
                    dr0Var.p(false);
                }
                kn2 kn2Var = kn2VarC;
                zm2VarA1 = ls.a0(gh1.i, dr0Var);
                if (z2) {
                    dr0Var.V(-1674245832);
                    if (zBooleanValue) {
                        f10 = f8;
                    } else {
                        f10 = f4;
                    }
                    zm2 zm2Var = vb.a;
                    f9 = f4;
                    gh1Var2 = gh1Var;
                    kn2VarC2 = vb.b(new cc0(f10), aa3.S, zm2VarA1, null, "DpAnimation", dr0Var, 8);
                    dr0Var.p(false);
                } else {
                    gh1Var2 = gh1Var;
                    f9 = f4;
                    dr0Var.V(-1674063769);
                    kn2VarC2 = rz1.C(new cc0(f9), dr0Var);
                    dr0Var.p(false);
                }
                sj1 sj1VarC = rz1.C(s60.c(((cc0) kn2VarC2.getValue()).h, ((kv) kn2Var.getValue()).a), dr0Var);
                if (!z2) {
                    j3 = au2Var.g;
                } else if (z3) {
                    j3 = au2Var.h;
                } else if (zBooleanValue) {
                    j3 = au2Var.e;
                } else {
                    j3 = au2Var.f;
                }
                kn2 kn2VarA = vj2.a(j3, ls.a0(gh1Var2, dr0Var), dr0Var);
                zn znVar = (zn) sj1VarC.getValue();
                ho.a(aa3.i(rg1Var3.c(new yn(znVar.a, znVar.b, hi2Var)), new uy1((Object) hi2Var, (Object) new bu2(new m51(kn2VarA, kn2.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 3)), (byte) 16)), dr0Var, 0);
                f6 = f9;
                f5 = f8;
            } else {
                dr0Var.Q();
                rg1Var3 = rg1Var2;
                f5 = f3;
                f6 = f4;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: ps1
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.h.g(z2, z3, hz0Var, rg1Var3, au2Var, hi2Var, f5, f6, (dr0) obj, m02.A(i2 | 1), i3);
                        return j23.a;
                    }
                };
            }
        }
        i8 |= 3072;
        rg1Var2 = rg1Var;
        if (dr0Var.f(au2Var)) {
            i4 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
        } else {
            i4 = 8192;
        }
        int i13 = i8 | i4;
        if (dr0Var.f(hi2Var)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        i6 = i13 | i5;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f3 = f;
                if (dr0Var.c(f3)) {
                }
                i6 |= i11;
            } else {
                f3 = f;
            }
            i6 |= i11;
        } else {
            f3 = f;
        }
        if ((12582912 & i2) == 0) {
            if ((i3 & 128) == 0) {
                f4 = f2;
                if (dr0Var.c(f4)) {
                }
                i6 |= i12;
            } else {
                f4 = f2;
            }
            i6 |= i12;
        } else {
            f4 = f2;
        }
        if ((38347923 & i6) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dr0Var.N(i6 & 1, z4)) {
            dr0Var.S();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    rg1Var4 = og1.h;
                } else {
                    rg1Var4 = rg1Var2;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i3 & 128) != 0) {
                    rg1 rg1Var7 = rg1Var4;
                    i7 = i6 & (-29360129);
                    rg1Var3 = rg1Var7;
                    f8 = f7;
                    f4 = 1.0f;
                } else {
                    rg1 rg1Var8 = rg1Var4;
                    i7 = i6;
                    rg1Var3 = rg1Var8;
                    f8 = f7;
                }
            } else {
                if (i9 != 0) {
                    rg1Var4 = og1.h;
                } else {
                    rg1Var4 = rg1Var2;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i3 & 128) != 0) {
                    rg1 rg1Var9 = rg1Var4;
                    i7 = i6 & (-29360129);
                    rg1Var3 = rg1Var9;
                    f8 = f7;
                    f4 = 1.0f;
                } else {
                    rg1 rg1Var10 = rg1Var4;
                    i7 = i6;
                    rg1Var3 = rg1Var10;
                    f8 = f7;
                }
            }
            dr0Var.q();
            zBooleanValue = ((Boolean) ls.r(hz0Var, dr0Var, (i7 >> 6) & 14).getValue()).booleanValue();
            if (!z2) {
                j2 = au2Var.n;
            } else if (z3) {
                j2 = au2Var.o;
            } else if (zBooleanValue) {
                j2 = au2Var.l;
            } else {
                j2 = au2Var.m;
            }
            gh1Var = gh1.k;
            zm2VarA0 = ls.a0(gh1Var, dr0Var);
            if (z2) {
                dr0Var.V(-1674507999);
                kn2VarC = vj2.a(j2, zm2VarA0, dr0Var);
                dr0Var.p(false);
            } else {
                dr0Var.V(-1674427244);
                kn2VarC = rz1.C(new kv(j2), dr0Var);
                dr0Var.p(false);
            }
            kn2 kn2Var2 = kn2VarC;
            zm2VarA1 = ls.a0(gh1.i, dr0Var);
            if (z2) {
                dr0Var.V(-1674245832);
                if (zBooleanValue) {
                    f10 = f8;
                } else {
                    f10 = f4;
                }
                zm2 zm2Var2 = vb.a;
                f9 = f4;
                gh1Var2 = gh1Var;
                kn2VarC2 = vb.b(new cc0(f10), aa3.S, zm2VarA1, null, "DpAnimation", dr0Var, 8);
                dr0Var.p(false);
            } else {
                gh1Var2 = gh1Var;
                f9 = f4;
                dr0Var.V(-1674063769);
                kn2VarC2 = rz1.C(new cc0(f9), dr0Var);
                dr0Var.p(false);
            }
            sj1 sj1VarC2 = rz1.C(s60.c(((cc0) kn2VarC2.getValue()).h, ((kv) kn2Var2.getValue()).a), dr0Var);
            if (!z2) {
                j3 = au2Var.g;
            } else if (z3) {
                j3 = au2Var.h;
            } else if (zBooleanValue) {
                j3 = au2Var.e;
            } else {
                j3 = au2Var.f;
            }
            kn2 kn2VarA2 = vj2.a(j3, ls.a0(gh1Var2, dr0Var), dr0Var);
            zn znVar2 = (zn) sj1VarC2.getValue();
            ho.a(aa3.i(rg1Var3.c(new yn(znVar2.a, znVar2.b, hi2Var)), new uy1((Object) hi2Var, (Object) new bu2(new m51(kn2VarA2, kn2.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 3)), (byte) 16)), dr0Var, 0);
            f6 = f9;
            f5 = f8;
        } else {
            dr0Var.Q();
            rg1Var3 = rg1Var2;
            f5 = f3;
            f6 = f4;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: ps1
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.h.g(z2, z3, hz0Var, rg1Var3, au2Var, hi2Var, f5, f6, (dr0) obj, m02.A(i2 | 1), i3);
                    return j23.a;
                }
            };
        }
    }

    @Override // defpackage.kp
    public final u31 getLayoutDirection() {
        return S;
    }

    @Override // defpackage.cp2
    public final boolean h(Object obj, Object obj2) {
        return false;
    }

    public final void i(final String str, final zp0 zp0Var, final boolean z2, final boolean z3, final w53 w53Var, final hz0 hz0Var, final boolean z4, final nx nxVar, final nx nxVar2, final nx nxVar3, final nx nxVar4, final nx nxVar5, final au2 au2Var, rt1 rt1Var, final nx nxVar6, dr0 dr0Var, final int i2) {
        int i3;
        boolean z5;
        boolean z6;
        hz0 hz0Var2;
        final rt1 rt1Var2;
        rt1 rt1Var3;
        int i4;
        nx nxVarN;
        dr0Var.W(-1732281618);
        if ((i2 & 6) == 0) {
            i3 = (dr0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dr0Var.h(zp0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z2;
            i3 |= dr0Var.g(z5) ? 256 : 128;
        } else {
            z5 = z2;
        }
        if ((i2 & 3072) == 0) {
            z6 = z3;
            i3 |= dr0Var.g(z6) ? 2048 : 1024;
        } else {
            z6 = z3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dr0Var.f(w53Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            hz0Var2 = hz0Var;
            i3 |= dr0Var.f(hz0Var2) ? 131072 : 65536;
        } else {
            hz0Var2 = hz0Var;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= dr0Var.g(z4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= dr0Var.h(nxVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= dr0Var.h(nxVar2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= dr0Var.h(nxVar3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        int i5 = 14155776 | (dr0Var.h(null) ? 4 : 2) | (dr0Var.h(null) ? 32 : 16) | (dr0Var.h(nxVar4) ? 256 : 128) | (dr0Var.h(nxVar5) ? 2048 : 1024) | (dr0Var.f(au2Var) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | 65536;
        if (dr0Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 4793491) == 4793490) ? false : true)) {
            dr0Var.S();
            if ((i2 & 1) == 0 || dr0Var.x()) {
                rt1Var3 = new rt1(16.0f, 16.0f, 16.0f, 16.0f);
                i4 = i5 & (-458753);
            } else {
                dr0Var.Q();
                i4 = i5 & (-458753);
                rt1Var3 = rt1Var;
            }
            dr0Var.q();
            rt1 rt1Var4 = rt1Var3;
            boolean z7 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object objK = dr0Var.K();
            if (z7 || objK == zy.a) {
                objK = w53Var.a(new od(str));
                dr0Var.f0(objK);
            }
            String str2 = ((hz2) objK).a.i;
            su2 su2Var = new su2();
            if (nxVar == null) {
                dr0Var.V(1927058812);
                dr0Var.p(false);
                nxVarN = null;
            } else {
                dr0Var.V(1927058813);
                nxVarN = dt.N(-1459717586, new d60(nxVar, (byte) 2), dr0Var);
                dr0Var.p(false);
            }
            int i6 = i3 >> 9;
            int i7 = i4 << 21;
            y02.a(str2, zp0Var, su2Var, nxVarN, nxVar2, nxVar3, nxVar4, nxVar5, z6, z5, z4, hz0Var2, rt1Var4, au2Var, nxVar6, dr0Var, ((i3 << 3) & 896) | 6 | (i6 & 458752) | (i6 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), ((i4 >> 9) & 14) | ((i3 >> 6) & 112) | (i3 & 896) | (i6 & 7168) | ((i3 >> 3) & 57344) | ((i4 << 6) & 3670016) | 12582912);
            rt1Var2 = rt1Var4;
        } else {
            dr0Var.Q();
            rt1Var2 = rt1Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: qs1
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(i2 | 1);
                    this.h.i(str, zp0Var, z2, z3, w53Var, hz0Var, z4, nxVar, nxVar2, nxVar3, nxVar4, nxVar5, au2Var, rt1Var2, nxVar6, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Context context, n10 n10Var) {
        v90 v90Var;
        MealPlannerApp mealPlannerApp;
        boolean z2;
        if (n10Var instanceof v90) {
            v90Var = (v90) n10Var;
            int i2 = v90Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v90Var.n = i2 - Integer.MIN_VALUE;
            } else {
                v90Var = new v90(this, n10Var);
            }
        } else {
            v90Var = new v90(this, n10Var);
        }
        Object objC = v90Var.l;
        int i3 = v90Var.n;
        try {
            if (i3 == 0) {
                m02.y(objC);
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                mealPlannerApp = (MealPlannerApp) applicationContext;
                yr yrVarB = mealPlannerApp.b();
                v90Var.k = mealPlannerApp;
                v90Var.n = 1;
                objC = ia2.C(yrVarB.a, new nr(yrVarB, null), v90Var);
                y20 y20Var = y20.h;
                if (objC == y20Var) {
                    return y20Var;
                }
            } else {
                if (i3 != 1) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mealPlannerApp = v90Var.k;
                m02.y(objC);
            }
            wt1 wt1Var = (wt1) objC;
            List list = (List) wt1Var.h;
            List list2 = (List) wt1Var.i;
            mealPlannerApp.getClass();
            File databasePath = mealPlannerApp.getDatabasePath("family_meal.db");
            databasePath.getClass();
            if (databasePath.exists()) {
                byte[] bArr = new byte[16];
                FileInputStream fileInputStream = new FileInputStream(databasePath);
                try {
                    int i4 = fileInputStream.read(bArr);
                    fileInputStream.close();
                    if (i4 != 16 || new String(bArr, ws.a).startsWith("SQLite format 3")) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vs.s(fileInputStream, th);
                        throw th2;
                    }
                }
            } else {
                z2 = false;
            }
            ((i40) mealPlannerApp.h.getValue()).getClass();
            return new t90(true, z2, i40.b(), list2.size(), list.size(), null);
        } catch (Exception e) {
            return new t90(false, false, "unknown", 0, 0, e.getClass().getSimpleName());
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:29:0x0118  */
    /* JADX WARN: Code duplicated, block: B:30:0x012f  */
    /* JADX WARN: Code duplicated, block: B:33:0x013f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0148  */
    /* JADX WARN: Code duplicated, block: B:38:0x014b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r11v0, types: [int, short] */
    /* JADX WARN: Type inference failed for: r11v2, types: [int, short] */
    /* JADX WARN: Type inference failed for: r11v3, types: [int, short] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int, short] */
    public final Object n(Context context, long j2, long j3, n10 n10Var) {
        w90 w90Var;
        MealPlannerApp mealPlannerApp;
        long j4;
        long j5;
        long j6;
        long j7;
        List list;
        List list2;
        bz1 bz1Var;
        c63 c63Var;
        az1 az1VarT;
        Double d;
        Integer num;
        String str;
        ArrayList arrayList;
        if (n10Var instanceof w90) {
            w90Var = (w90) n10Var;
            int i2 = w90Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w90Var.r = i2 - Integer.MIN_VALUE;
            } else {
                w90Var = new w90(this, n10Var);
            }
        } else {
            w90Var = new w90(this, n10Var);
        }
        Object objC = w90Var.p;
        int i3 = w90Var.r;
        y20 y20Var = y20.h;
        if (i3 == 0) {
            m02.y(objC);
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            mealPlannerApp = (MealPlannerApp) applicationContext;
            yr yrVarB = mealPlannerApp.b();
            w90Var.k = mealPlannerApp;
            w90Var.n = (int) j2;
            w90Var.o = (int) j3;
            w90Var.r = 1;
            objC = ia2.C(yrVarB.a, new nr(yrVarB, null), w90Var);
            if (objC != y20Var) {
                j4 = j2;
                j5 = j3;
            }
            return y20Var;
        }
        if (i3 == 1) {
            j5 = w90Var.o;
            j4 = w90Var.n;
            mealPlannerApp = w90Var.k;
            m02.y(objC);
        } else {
            if (i3 != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j6 = w90Var.o;
            long j8 = w90Var.n;
            List list3 = w90Var.m;
            List list4 = w90Var.l;
            m02.y(objC);
            list = list3;
            j7 = j8;
            list2 = list4;
        }
        aw1 aw1Var = (aw1) objC;
        bz1Var = new bz1(list2, list, aw1Var.a, aw1Var.b, LocalDate.now().getMonthValue(), null, 224);
        sl2 sl2VarA = new jg1(j7, j6).a(bz1Var);
        c63Var = sl2VarA.b;
        if (c63Var != null) {
            az1VarT = new xl1(bz1Var).t(c63Var);
        } else {
            az1VarT = null;
        }
        String strName = sl2VarA.a.name();
        double d2 = sl2VarA.d / 1000.0d;
        double d3 = sl2VarA.f / 1000.0d;
        double d4 = sl2VarA.g / 1000.0d;
        String str2 = "上限 " + (j7 / 1000) + "s / 够用即停 " + (j6 / 1000) + "s";
        if (az1VarT != null) {
            Double d5 = new Double(az1VarT.a);
            num = new Integer(az1VarT.b.size());
            d = d5;
        } else {
            d = null;
            num = null;
        }
        int size = list2.size();
        str = sl2VarA.e;
        if (co2.X(str)) {
            str = null;
        }
        arrayList = aw1Var.c;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new u90(strName, d2, d3, d4, str2, d, num, size, dv.E0(gi.W(new String[]{str, arrayList != null ? "未参与（资料不完整）：".concat(dv.E0(arrayList, "、", null, null, null, 62)) : null}), "；", null, null, null, 62));
        wt1 wt1Var = (wt1) objC;
        List list5 = (List) wt1Var.h;
        List list6 = (List) wt1Var.i;
        tw1 tw1VarC = mealPlannerApp.c();
        w90Var.k = null;
        w90Var.l = list5;
        w90Var.m = list6;
        w90Var.n = (int) j4;
        w90Var.o = (int) j5;
        w90Var.r = 2;
        Object objC2 = ia2.C(tw1VarC.a, new lw1(tw1VarC, null), w90Var);
        if (objC2 != y20Var) {
            j6 = j5;
            j7 = j4;
            list = list6;
            objC = objC2;
            list2 = list5;
            aw1 aw1Var2 = (aw1) objC;
            bz1Var = new bz1(list2, list, aw1Var2.a, aw1Var2.b, LocalDate.now().getMonthValue(), null, 224);
            sl2 sl2VarA2 = new jg1(j7, j6).a(bz1Var);
            c63Var = sl2VarA2.b;
            if (c63Var != null) {
                az1VarT = new xl1(bz1Var).t(c63Var);
            } else {
                az1VarT = null;
            }
            String strName2 = sl2VarA2.a.name();
            double d6 = sl2VarA2.d / 1000.0d;
            double d7 = sl2VarA2.f / 1000.0d;
            double d8 = sl2VarA2.g / 1000.0d;
            String str3 = "上限 " + (j7 / 1000) + "s / 够用即停 " + (j6 / 1000) + "s";
            if (az1VarT != null) {
                Double d9 = new Double(az1VarT.a);
                num = new Integer(az1VarT.b.size());
                d = d9;
            } else {
                d = null;
                num = null;
            }
            int size2 = list2.size();
            str = sl2VarA2.e;
            if (co2.X(str)) {
                str = null;
            }
            arrayList = aw1Var2.c;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            return new u90(strName2, d6, d7, d8, str3, d, num, size2, dv.E0(gi.W(new String[]{str, arrayList != null ? "未参与（资料不完整）：".concat(dv.E0(arrayList, "、", null, null, null, 62)) : null}), "；", null, null, null, 62));
        }
        return y20Var;
    }

    public final String toString() {
        switch (this.h) {
            case 26:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }
}
