package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xg2 {
    public final rg2 a;
    public final ti1 b;

    public xg2(wg2 wg2Var, ly0 ly0Var) {
        this.a = wg2Var.d;
        List listJ = wg2.j(4, wg2Var);
        this.b = new ti1(listJ.size());
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            wg2 wg2Var2 = (wg2) listJ.get(i);
            if (ly0Var.a(wg2Var2.f)) {
                this.b.a(wg2Var2.f);
            }
        }
    }
}
