package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qe0 extends View {
    public final /* synthetic */ pe0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(pe0 pe0Var, Context context) {
        super(context);
        this.h = pe0Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.h.run();
    }
}
