package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nh implements Iterator, l21 {
    public int h;
    public int i;
    public boolean j;
    public final /* synthetic */ byte k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nh(rh rhVar, byte b) {
        this(rhVar.j);
        this.k = b;
        switch (b) {
            case 1:
                this.l = rhVar;
                this(rhVar.j);
                break;
            default:
                this.l = rhVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            wg.p();
            return null;
        }
        int i = this.i;
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                objE = ((rh) obj).e(i);
                break;
            case 1:
                objE = ((rh) obj).h(i);
                break;
            default:
                objE = ((bi) obj).i[i];
                break;
        }
        this.i++;
        this.j = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.j) {
            li1.g("Call next() before removing an element.");
            return;
        }
        int i = this.i - 1;
        this.i = i;
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((rh) obj).f(i);
                break;
            case 1:
                ((rh) obj).f(i);
                break;
            default:
                ((bi) obj).a(i);
                break;
        }
        this.h--;
        this.j = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nh(bi biVar) {
        this(biVar.j);
        this.k = (byte) 2;
        this.l = biVar;
    }

    public nh(int i) {
        this.h = i;
    }
}
