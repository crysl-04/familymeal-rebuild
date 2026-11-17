package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jb2 extends kb2 implements Iterator {
    public ib2 h;
    public boolean i = true;
    public final /* synthetic */ lb2 j;

    public jb2(lb2 lb2Var) {
        this.j = lb2Var;
    }

    @Override // defpackage.kb2
    public final void a(ib2 ib2Var) {
        ib2 ib2Var2 = this.h;
        if (ib2Var == ib2Var2) {
            ib2 ib2Var3 = ib2Var2.k;
            this.h = ib2Var3;
            this.i = ib2Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.i) {
            return this.j.h != null;
        }
        ib2 ib2Var = this.h;
        return (ib2Var == null || ib2Var.j == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.i) {
            this.i = false;
            ib2 ib2Var = this.j.h;
            this.h = ib2Var;
            return ib2Var;
        }
        ib2 ib2Var2 = this.h;
        ib2 ib2Var3 = ib2Var2 != null ? ib2Var2.j : null;
        this.h = ib2Var3;
        return ib2Var3;
    }
}
