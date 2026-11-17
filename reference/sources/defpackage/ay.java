package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ay extends ClickableSpan {
    public final ia1 h;

    public ay(ia1 ia1Var) {
        this.h = ia1Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.h.getClass();
    }
}
