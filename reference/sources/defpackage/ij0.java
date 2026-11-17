package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ij0 implements Iterator, l21 {
    public final Iterator i;
    public Object k;
    public final /* synthetic */ nh2 l;
    public final /* synthetic */ byte h = 1;
    public int j = -1;

    public ij0(u80 u80Var) {
        this.l = u80Var;
        this.i = new iz2((ds2) u80Var.b);
    }

    public final void a() {
        Object next;
        u80 u80Var = (u80) this.l;
        do {
            Iterator it = this.i;
            if (!it.hasNext()) {
                this.j = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((jc2) u80Var.c).h(next)).booleanValue());
        this.k = next;
        this.j = 1;
    }

    public final void b() {
        Iterator it = this.i;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((ds2) this.l).c.h(next)).booleanValue()) {
                this.j = 1;
                this.k = next;
                return;
            }
        }
        this.j = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.j == -1) {
                    a();
                }
                return this.j == 1;
            default:
                if (this.j == -1) {
                    b();
                }
                return this.j == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                if (this.j == -1) {
                    a();
                }
                if (this.j == 0) {
                    wg.p();
                    return null;
                }
                Object obj = this.k;
                this.k = null;
                this.j = -1;
                return obj;
            default:
                if (this.j == -1) {
                    b();
                }
                if (this.j == 0) {
                    wg.p();
                    return null;
                }
                Object obj2 = this.k;
                this.k = null;
                this.j = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ij0(ds2 ds2Var) {
        this.l = ds2Var;
        this.i = ds2Var.b.iterator();
    }
}
