package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e83 extends d83 {
    public ox0 r;

    public e83(q83 q83Var, WindowInsets windowInsets) {
        super(q83Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.m83
    public q83 b() {
        return q83.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.m83
    public q83 c() {
        return q83.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.m83
    public final ox0 k() {
        ox0 ox0Var = this.r;
        if (ox0Var != null) {
            return ox0Var;
        }
        WindowInsets windowInsets = this.c;
        ox0 ox0VarB = ox0.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.r = ox0VarB;
        return ox0VarB;
    }

    @Override // defpackage.m83
    public boolean r() {
        return this.c.isConsumed();
    }
}
