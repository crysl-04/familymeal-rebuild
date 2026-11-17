package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 implements RandomAccess {
    public final c0 h;
    public final int i;
    public final int j;

    public b0(c0 c0Var, int i, int i2) {
        this.h = c0Var;
        this.i = i;
        tz0.n(i, i2, c0Var.a());
        this.j = i2 - i;
    }

    @Override // defpackage.q
    public final int a() {
        return this.j;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            wg.i(wi0.f(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.h.get(this.i + i);
    }

    @Override // defpackage.c0, java.util.List
    public final List subList(int i, int i2) {
        tz0.n(i, i2, this.j);
        int i3 = this.i;
        return new b0(this.h, i + i3, i3 + i2);
    }
}
