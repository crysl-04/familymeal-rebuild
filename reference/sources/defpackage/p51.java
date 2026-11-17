package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p51 extends qy {
    public final l51 b;
    public final v61 c;
    public final int d;
    public final /* synthetic */ v61 e;
    public final /* synthetic */ c61 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(l51 l51Var, v61 v61Var, int i, c61 c61Var, int i2, int i3, long j) {
        super((byte) 1);
        this.e = v61Var;
        this.f = c61Var;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.b = l51Var;
        this.c = v61Var;
        this.d = i;
    }

    public final u51 q(int i, int i2, int i3, int i4, long j) {
        int iJ;
        l51 l51Var = this.b;
        Object objB = l51Var.b(i);
        Object objA = l51Var.b.A(i);
        List listH = h(this.c, i, j);
        if (k00.g(j)) {
            iJ = k00.k(j);
        } else {
            if (!k00.f(j)) {
                dx0.a("does not have fixed height");
            }
            iJ = k00.j(j);
        }
        u31 layoutDirection = this.e.i.getLayoutDirection();
        p61 p61Var = this.f.m;
        return new u51(i, objB, iJ, i4, layoutDirection, this.g, this.h, listH, this.i, objA, p61Var, j, i2, i3);
    }
}
