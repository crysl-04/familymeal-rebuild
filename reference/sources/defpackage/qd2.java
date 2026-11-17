package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qd2 implements rd2 {
    public final ScrollFeedbackProvider h;

    public qd2(NestedScrollView nestedScrollView) {
        this.h = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.rd2
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.h.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.rd2
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.h.onScrollProgress(i, i2, i3, i4);
    }
}
