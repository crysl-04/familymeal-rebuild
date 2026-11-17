package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class m43 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = w43.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
