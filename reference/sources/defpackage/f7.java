package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class f7 {
    public static final f7 a = new f7();

    public final void a(View view, w02 w02Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = w02Var instanceof s9 ? PointerIcon.getSystemIcon(context, ((s9) w02Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (uz0.g(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
