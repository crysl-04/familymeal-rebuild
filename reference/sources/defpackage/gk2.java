package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gk2 implements lz, Iterable, l21 {
    public final fk2 h;
    public final int i;
    public final int j;

    public gk2(fk2 fk2Var, int i, int i2) {
        this.h = fk2Var;
        this.i = i;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gk2)) {
            return false;
        }
        gk2 gk2Var = (gk2) obj;
        return gk2Var.i == this.i && gk2Var.j == this.j && gk2Var.h == this.h;
    }

    public final int hashCode() {
        return (this.h.hashCode() * 31) + this.i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        fk2 fk2Var = this.h;
        if (fk2Var.o != this.j) {
            hk2.e();
        }
        int i = this.i;
        fk2Var.f(i);
        return new ms0(fk2Var, i + 1, fk2Var.h[(i * 5) + 3] + i);
    }
}
