package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b71 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ d71 c;

    public b71(d71 d71Var, int i) {
        this.c = d71Var;
        this.a = i;
    }

    public final void a(int i) {
        d71 d71Var = this.c;
        n31 n31Var = d71Var.c;
        if (n31Var == null) {
            return;
        }
        this.b.add(new b22(n31Var, i, d71Var.b, null));
    }
}
