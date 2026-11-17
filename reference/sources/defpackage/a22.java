package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a22 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ b22 f;

    public a22(b22 b22Var, List list) {
        this.f = b22Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            dx0.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
