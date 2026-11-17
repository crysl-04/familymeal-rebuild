package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends ClickableSpan {
    public final int h;
    public final e2 i;
    public final int j;

    public n1(int i, e2 e2Var, int i2) {
        this.h = i;
        this.i = e2Var;
        this.j = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.h);
        this.i.a.performAction(this.j, bundle);
    }
}
