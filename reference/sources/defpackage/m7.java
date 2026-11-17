package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m7 {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static void b(o7 o7Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        yg2 yg2Var;
        wg2 wg2Var;
        vp0 vp0Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseN = d7.n(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseN != null && (value = viewTranslationResponseN.getValue("android:text")) != null && (text = value.getText()) != null && (yg2Var = (yg2) o7Var.g().b((int) jKeyAt)) != null && (wg2Var = yg2Var.a) != null) {
                Object objG = wg2Var.d.h.g(qg2.l);
                if (objG == null) {
                    objG = null;
                }
                m1 m1Var = (m1) objG;
                if (m1Var != null && (vp0Var = (vp0) m1Var.b) != null) {
                }
            }
        }
    }

    public static Path c(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static void e(o7 o7Var, long[] jArr, Consumer consumer) {
        wg2 wg2Var;
        for (long j : jArr) {
            yg2 yg2Var = (yg2) o7Var.g().b((int) j);
            if (yg2Var != null && (wg2Var = yg2Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(o7Var.h.getAutofillId(), wg2Var.f);
                Object objG = wg2Var.d.h.g(ah2.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new od(gb1.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float f(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
