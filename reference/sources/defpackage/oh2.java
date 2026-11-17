package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oh2 implements Iterator, m10, l21 {
    public byte h;
    public Object i;
    public m10 j;

    public final RuntimeException a() {
        byte b = this.h;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.h));
    }

    public final void b(Object obj, c92 c92Var) {
        this.i = obj;
        this.h = (byte) 3;
        this.j = c92Var;
    }

    @Override // defpackage.m10
    public final o20 e() {
        return xf0.h;
    }

    @Override // defpackage.m10
    public final void g(Object obj) {
        m02.y(obj);
        this.h = (byte) 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b;
        while (true) {
            b = this.h;
            if (b != 0) {
                break;
            }
            this.h = (byte) 5;
            m10 m10Var = this.j;
            m10Var.getClass();
            this.j = null;
            m10Var.g(j23.a);
        }
        if (b == 1) {
            throw null;
        }
        if (b == 2 || b == 3) {
            return true;
        }
        if (b == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.h;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            wg.p();
            return null;
        }
        if (b == 2) {
            this.h = (byte) 1;
            throw null;
        }
        if (b != 3) {
            throw a();
        }
        this.h = (byte) 0;
        Object obj = this.i;
        this.i = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
