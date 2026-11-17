package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class il1 implements Iterator, l21 {
    public int h = -1;
    public boolean i;
    public final /* synthetic */ u30 j;

    public il1(u30 u30Var) {
        this.j = u30Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h + 1 < ((dm2) this.j.d).d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wg.p();
            return null;
        }
        this.i = true;
        dm2 dm2Var = (dm2) this.j.d;
        int i = this.h + 1;
        this.h = i;
        return (dl1) dm2Var.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.i) {
            li1.g("You must call next() before you can remove an element");
            return;
        }
        dm2 dm2Var = (dm2) this.j.d;
        ((dl1) dm2Var.e(this.h)).j = null;
        int i = this.h;
        Object[] objArr = dm2Var.j;
        Object obj = objArr[i];
        Object obj2 = aa3.P;
        if (obj != obj2) {
            objArr[i] = obj2;
            dm2Var.h = true;
        }
        this.h = i - 1;
        this.i = false;
    }
}
