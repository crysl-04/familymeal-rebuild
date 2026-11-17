package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.MenuItem;
import android.view.WindowManager;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 implements hl2, d93, vf1, gf1, v1, rm0, zg, bh, n20 {
    public final /* synthetic */ byte h;
    public static final vz1 i = new vz1((byte) 0);
    public static final /* synthetic */ vz1 j = new vz1((byte) 1);
    public static final vz1 k = new vz1((byte) 2);
    public static final vz1 l = new vz1((byte) 3);
    public static final vz1 m = new vz1((byte) 4);
    public static final vz1 n = new vz1((byte) 5);
    public static final li1 o = new li1(19);
    public static final li1 p = new li1(20);
    public static final li1 q = new li1(21);
    public static final li1 r = new li1(22);
    public static final vz1 s = new vz1((byte) 7);
    public static final vz1 t = new vz1((byte) 8);
    public static final vz1 u = new vz1((byte) 9);
    public static final vz1 v = new vz1((byte) 10);
    public static final li1 w = new li1(26);
    public static final li1 x = new li1(27);
    public static final vz1 y = new vz1((byte) 12);
    public static final v53 z = new v53();
    public static final vz1 A = new vz1((byte) 14);
    public static final e93 B = new e93();

    public vz1() {
        this.h = (byte) 25;
        new hd1(16);
        long[] jArr = bd2.a;
        new mj1();
    }

    public static zr k(String str) {
        Object next;
        str.getClass();
        lh0 lh0Var = zr.p;
        lh0Var.getClass();
        z zVar = new z(lh0Var, (byte) 0);
        do {
            if (!zVar.hasNext()) {
                next = null;
                break;
            }
            next = zVar.next();
        } while (!((zr) next).h.equals(str));
        zr zrVar = (zr) next;
        if (zrVar != null) {
            return zrVar;
        }
        wg.m("Unknown category: ".concat(str));
        return null;
    }

    @Override // defpackage.zg, defpackage.bh
    public final float a() {
        byte b = this.h;
        return 0.0f;
    }

    @Override // defpackage.gf1
    public final boolean b(if1 if1Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.zg
    public final void d(e90 e90Var, int i2, int[] iArr, u31 u31Var, int[] iArr2) {
        byte b = this.h;
        u31 u31Var2 = u31.h;
        switch (b) {
            case 22:
                if (u31Var != u31Var2) {
                    uz0.q(i2, iArr, iArr2, true);
                } else {
                    uz0.q(i2, iArr, iArr2, false);
                }
                break;
            case 23:
                if (u31Var != u31Var2) {
                    uz0.t(i2, iArr, iArr2, true);
                } else {
                    uz0.t(i2, iArr, iArr2, false);
                }
                break;
            default:
                if (u31Var != u31Var2) {
                    uz0.u(i2, iArr, iArr2, true);
                } else {
                    uz0.u(i2, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // defpackage.hl2
    public final boolean e(Object obj, Object obj2) {
        switch (this.h) {
            case 2:
                return obj == obj2;
            default:
                return uz0.g(obj, obj2);
        }
    }

    @Override // defpackage.bh
    public final void f(e90 e90Var, int i2, int[] iArr, int[] iArr2) {
        switch (this.h) {
            case 22:
                uz0.q(i2, iArr, iArr2, false);
                break;
            case 23:
                uz0.t(i2, iArr, iArr2, false);
                break;
            default:
                uz0.u(i2, iArr, iArr2, false);
                break;
        }
    }

    @Override // defpackage.d93
    public final z83 h(Context context, f90 f90Var) {
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                baseContext.getClass();
            } else {
                break;
            }
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            bo.d.getClass();
            return new z83(new ao((Build.VERSION.SDK_INT >= 30 ? co.h : c5.z).a(activity)), f90Var.f(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            wg.m("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new z83(new Rect(0, 0, point.x, point.y), f90Var.f(context));
    }

    public final void i(Drawable drawable, dr0 dr0Var, int i2) {
        dr0Var.W(257732500);
        int i3 = (dr0Var.h(drawable) ? 4 : 2) | i2;
        byte b = 27;
        if (dr0Var.N(i3 & 1, (i3 & 3) != 2)) {
            rg1 rg1VarI = yj2.i(og1.h, g10.e);
            boolean zH = dr0Var.h(drawable);
            Object objK = dr0Var.K();
            if (zH || objK == zy.a) {
                objK = new z61(drawable, b);
                dr0Var.f0(objK);
            }
            ho.a(aa3.h(rg1VarI, (vp0) objK), dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new j7(b, i2, this, drawable);
        }
    }

    public final void j(final rg1 rg1Var, final float f, float f2, long j2, pa2 pa2Var, dr0 dr0Var, final int i2) {
        final float f3;
        final long j3;
        final pa2 pa2Var2;
        float f4;
        long jD;
        pa2 pa2Var3;
        dr0Var.W(-1895596205);
        int i3 = i2 | (dr0Var.f(rg1Var) ? 4 : 2) | 25984;
        if (dr0Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            dr0Var.S();
            if ((i2 & 1) == 0 || dr0Var.x()) {
                f4 = p22.b;
                jD = rv.d(p22.a, dr0Var);
                pa2Var3 = p22.c;
            } else {
                dr0Var.Q();
                f4 = f2;
                jD = j2;
                pa2Var3 = pa2Var;
            }
            dr0Var.q();
            y02.d(dr0Var, ie1.e(yj2.h(yj2.e(rg1Var, f4), f), jD, pa2Var3));
            pa2Var2 = pa2Var3;
            j3 = jD;
            f3 = f4;
        } else {
            dr0Var.Q();
            f3 = f2;
            j3 = j2;
            pa2Var2 = pa2Var;
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0(rg1Var, f, f3, j3, pa2Var2, i2) { // from class: rr2
                public final /* synthetic */ rg1 i;
                public final /* synthetic */ float j;
                public final /* synthetic */ float k;
                public final /* synthetic */ long l;
                public final /* synthetic */ pa2 m;

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(196657);
                    this.h.j(this.i, this.j, this.k, this.l, this.m, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    public final String toString() {
        switch (this.h) {
            case 2:
                return "ReferentialEqualityPolicy";
            case 7:
                return "StructuralEqualityPolicy";
            case 22:
                return "Arrangement#Center";
            case 23:
                return "Arrangement#SpaceBetween";
            case 24:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vf1
    public final boolean v(if1 if1Var) {
        return false;
    }

    public /* synthetic */ vz1(byte b) {
        this.h = b;
    }

    public vz1(ActionMenuView actionMenuView) {
        this.h = (byte) 17;
    }

    @Override // defpackage.gf1
    public final void g(if1 if1Var) {
    }

    @Override // defpackage.vf1
    public final void c(if1 if1Var, boolean z2) {
    }
}
