package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nf1 extends FrameLayout implements av {
    public final CollapsibleActionView h;

    /* JADX WARN: Multi-variable type inference failed */
    public nf1(View view) {
        super(view.getContext());
        this.h = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.av
    public final void onActionViewCollapsed() {
        this.h.onActionViewCollapsed();
    }

    @Override // defpackage.av
    public final void onActionViewExpanded() {
        this.h.onActionViewExpanded();
    }
}
