package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class yl0 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final r72 a(View view, t6 t6Var) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        t6Var.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        Rect rect = b;
        view.getFocusedRect(rect);
        float f2 = (i - i3) + rect.left;
        return new r72(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    public static final Integer b(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final ul0 c(int i) {
        if (i == 1) {
            return new ul0(2);
        }
        if (i == 2) {
            return new ul0(1);
        }
        if (i == 17) {
            return new ul0(3);
        }
        if (i == 33) {
            return new ul0(5);
        }
        if (i == 66) {
            return new ul0(4);
        }
        if (i != 130) {
            return null;
        }
        return new ul0(6);
    }
}
