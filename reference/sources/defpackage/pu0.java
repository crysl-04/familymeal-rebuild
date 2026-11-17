package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pu0 extends c0 {
    public final h0 h;
    public final int i;
    public final int j;

    public pu0(h0 h0Var, int i, int i2) {
        this.h = h0Var;
        this.i = i;
        lt.l(i, i2, h0Var.a());
        this.j = i2 - i;
    }

    @Override // defpackage.q
    public final int a() {
        return this.j;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lt.h(i, this.j);
        return this.h.get(this.i + i);
    }

    @Override // defpackage.c0, java.util.List
    public final List subList(int i, int i2) {
        lt.l(i, i2, this.j);
        int i3 = this.i;
        return new pu0(this.h, i + i3, i3 + i2);
    }
}
