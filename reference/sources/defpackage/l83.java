package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l83 extends k83 {
    public l83(q83 q83Var, WindowInsets windowInsets) {
        super(q83Var, windowInsets);
    }

    @Override // defpackage.d83, defpackage.m83
    public List<Rect> e(int i) {
        return this.c.getBoundingRects(p83.a(i));
    }

    @Override // defpackage.d83, defpackage.m83
    public List<Rect> f(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(p83.a(i));
    }

    @Override // defpackage.d83, defpackage.m83
    public void p() {
    }
}
