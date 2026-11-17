package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hb2 extends kb2 implements Iterator {
    public ib2 h;
    public ib2 i;

    @Override // defpackage.kb2
    public final void a(ib2 ib2Var) {
        ib2 ib2Var2 = this.h;
        ib2 ib2Var3 = null;
        if (ib2Var2 == ib2Var && ib2Var == this.i) {
            this.i = null;
            this.h = null;
            ib2Var2 = null;
        }
        ib2 ib2Var4 = ib2Var2;
        if (ib2Var2 == ib2Var) {
            ib2Var4 = ib2Var2.k;
            this.h = ib2Var4;
        }
        ib2 ib2Var5 = this.i;
        if (ib2Var5 == ib2Var) {
            if (ib2Var5 != ib2Var4 && ib2Var4 != null) {
                ib2Var3 = ib2Var5.j;
            }
            this.i = ib2Var3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ib2 ib2Var = this.i;
        ib2 ib2Var2 = this.h;
        this.i = (ib2Var == ib2Var2 || ib2Var2 == null) ? null : ib2Var.j;
        return ib2Var;
    }
}
