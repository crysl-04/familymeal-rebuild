package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pv0 {
    public final d6 a;
    public int b = 0;
    public boolean c;
    public final GestureDetector d;

    public pv0(Context context, d6 d6Var) {
        this.a = d6Var;
        this.d = new GestureDetector(context, new ov0(this));
    }
}
