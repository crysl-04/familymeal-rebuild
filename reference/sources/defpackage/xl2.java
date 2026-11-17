package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xl2 implements lz, Iterable, l21 {
    public final fk2 h;
    public final int i;
    public final d82 j;

    public xl2(fk2 fk2Var, int i, fr0 fr0Var, d82 d82Var) {
        this.h = fk2Var;
        this.i = i;
        this.j = d82Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xl2)) {
            return false;
        }
        xl2 xl2Var = (xl2) obj;
        return xl2Var.i == this.i && xl2Var.h == this.h && xl2Var.j.equals(this.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.h.hashCode() + (this.i * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t80(this.h, this.i, null, this.j);
    }
}
