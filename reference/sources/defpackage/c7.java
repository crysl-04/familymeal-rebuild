package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c7 implements ViewTranslationCallback {
    public static final c7 a = new c7();

    public final boolean onClearTranslation(View view) {
        kp0 kp0Var;
        view.getClass();
        o7 contentCaptureManager$ui = ((t6) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.l = k7.h;
        ly0 ly0VarG = contentCaptureManager$ui.g();
        Object[] objArr = ly0VarG.c;
        long[] jArr = ly0VarG.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        mj1 mj1Var = ((yg2) objArr[(i << 3) + i3]).a.d.h;
                        Object objG = mj1Var.g(ah2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = mj1Var.g(qg2.n);
                            m1 m1Var = (m1) (objG2 != null ? objG2 : null);
                            if (m1Var != null && (kp0Var = (kp0) m1Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        vp0 vp0Var;
        view.getClass();
        o7 contentCaptureManager$ui = ((t6) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.l = k7.h;
        ly0 ly0VarG = contentCaptureManager$ui.g();
        Object[] objArr = ly0VarG.c;
        long[] jArr = ly0VarG.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        mj1 mj1Var = ((yg2) objArr[(i << 3) + i3]).a.d.h;
                        Object objG = mj1Var.g(ah2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (uz0.g(objG, Boolean.TRUE)) {
                            Object objG2 = mj1Var.g(qg2.m);
                            m1 m1Var = (m1) (objG2 != null ? objG2 : null);
                            if (m1Var != null && (vp0Var = (vp0) m1Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        vp0 vp0Var;
        view.getClass();
        o7 contentCaptureManager$ui = ((t6) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.l = k7.i;
        ly0 ly0VarG = contentCaptureManager$ui.g();
        Object[] objArr = ly0VarG.c;
        long[] jArr = ly0VarG.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        mj1 mj1Var = ((yg2) objArr[(i << 3) + i3]).a.d.h;
                        Object objG = mj1Var.g(ah2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (uz0.g(objG, Boolean.FALSE)) {
                            Object objG2 = mj1Var.g(qg2.m);
                            m1 m1Var = (m1) (objG2 != null ? objG2 : null);
                            if (m1Var != null && (vp0Var = (vp0) m1Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
