package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class i83 extends g83 {
    public static final q83 v = q83.c(WindowInsets.CONSUMED, null);

    public i83(q83 q83Var, WindowInsets windowInsets) {
        super(q83Var, windowInsets);
    }

    @Override // defpackage.d83, defpackage.m83
    public ox0 h(int i) {
        return ox0.c(this.c.getInsets(n83.a(i)));
    }

    @Override // defpackage.d83, defpackage.m83
    public ox0 i(int i) {
        return ox0.c(this.c.getInsetsIgnoringVisibility(n83.a(i)));
    }

    @Override // defpackage.d83, defpackage.m83
    public boolean t(int i) {
        return this.c.isVisible(n83.a(i));
    }

    @Override // defpackage.d83, defpackage.m83
    public final void d(View view) {
    }
}
