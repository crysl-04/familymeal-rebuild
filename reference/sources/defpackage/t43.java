package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class t43 {
    public static WeakHashMap a;

    public static l53 a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        l53 l53Var = (l53) weakHashMap.get(view);
        if (l53Var != null) {
            return l53Var;
        }
        l53 l53Var2 = new l53(view);
        a.put(view, l53Var2);
        return l53Var2;
    }

    public static void b(View view, q83 q83Var) {
        WindowInsets windowInsetsB = q83Var.b();
        if (windowInsetsB != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? s43.a(view, windowInsetsB) : m43.a(view, windowInsetsB);
            if (windowInsetsA.equals(windowInsetsB)) {
                return;
            }
            q83.c(windowInsetsA, view);
        }
    }

    public static void c(ViewGroup viewGroup, p1 p1Var) {
        if (p1Var == null && (r43.a(viewGroup) instanceof o1)) {
            p1Var = new p1();
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(p1Var == null ? null : p1Var.i);
    }
}
