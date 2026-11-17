package defpackage;

import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e6 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ t6 i;

    public /* synthetic */ e6(t6 t6Var, byte b) {
        this.h = b;
        this.i = t6Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        int i = 0;
        t6 t6Var = this.i;
        switch (b) {
            case 0:
                ob obVar = t6Var.T;
                if (obVar != null) {
                    int childCount = obVar.getChildCount();
                    while (i < childCount) {
                        obVar.getChildAt(i);
                        i++;
                    }
                }
                return j23.a;
            case 1:
                if (t6Var.isAttachedToWindow()) {
                    if (t6.S0 == null) {
                        l6 l6Var = new l6();
                        t6.S0 = l6Var;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (t6.O0 == null) {
                                t6.O0 = Class.forName("android.os.SystemProperties");
                            }
                            Method declaredMethod = t6.Q0;
                            if (declaredMethod == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = t6.O0;
                                declaredMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                t6.Q0 = declaredMethod;
                            }
                            if (declaredMethod != null) {
                                declaredMethod.invoke(null, l6Var);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    fj1 fj1Var = t6.R0;
                    synchronized (fj1Var) {
                        fj1Var.a(t6Var);
                    }
                }
                return j23.a;
            case 2:
                Boolean bool = (Boolean) t6Var.w.getValue();
                bool.getClass();
                return bool;
            case 3:
                LocaleList locales = t6Var.getConfiguration().getLocales();
                vb1 vb1Var = new vb1(new wb1(locales));
                if (locales.isEmpty()) {
                    vb1Var = new vb1(new wb1(LocaleList.getDefault()));
                }
                LocaleList localeList = vb1Var.a.a;
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Locale locale = localeList.get(i);
                    locale.getClass();
                    arrayList.add(new tb1(locale));
                    i++;
                }
                return new ub1(arrayList);
            default:
                MotionEvent motionEvent = t6Var.t0;
                if (motionEvent != null) {
                    boolean zContains = lt.Q(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = t6Var.t0;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (zContains && i != 0) {
                        t6Var.u0 = SystemClock.uptimeMillis();
                        t6Var.post(t6Var.B0);
                    }
                }
                t6Var.H0.a();
                return j23.a;
        }
    }
}
