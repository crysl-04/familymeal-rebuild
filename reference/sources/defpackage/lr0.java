package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 implements Iterator, l21 {
    public final /* synthetic */ byte h;
    public int i;
    public Object j;
    public final Object k;

    public lr0(pj1 pj1Var) {
        this.h = (byte) 2;
        this.k = pj1Var;
        this.i = -1;
        this.j = rz1.u(new oj1(pj1Var, this, null));
    }

    public final void a() {
        Object objH;
        int i = this.i;
        u80 u80Var = (u80) this.k;
        if (i == -2) {
            objH = ((kp0) u80Var.b).a();
        } else {
            vp0 vp0Var = (vp0) u80Var.c;
            Object obj = this.j;
            obj.getClass();
            objH = vp0Var.h(obj);
        }
        this.j = objH;
        this.i = objH == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.i < 0) {
                    a();
                }
                return this.i == 1;
            case 1:
                return ((oh2) this.j).hasNext();
            case 2:
                return ((oh2) this.j).hasNext();
            default:
                return this.i < ((Map) this.k).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.h) {
            case 0:
                if (this.i < 0) {
                    a();
                }
                if (this.i == 0) {
                    wg.p();
                    return null;
                }
                Object obj2 = this.j;
                obj2.getClass();
                this.i = -1;
                return obj2;
            case 1:
                return ((oh2) this.j).next();
            case 2:
                return ((oh2) this.j).next();
            default:
                if (hasNext()) {
                    obj = this.j;
                    this.i++;
                    Object obj3 = ((Map) this.k).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.j = ((la1) obj3).b;
                } else {
                    wg.p();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.h;
        Object obj = this.k;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.i;
                if (i != -1) {
                    ((ij1) obj).i.i(i);
                    this.i = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.i;
                if (i2 != -1) {
                    ((pj1) obj).i.m(i2);
                    this.i = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public lr0(u80 u80Var) {
        this.h = (byte) 0;
        this.k = u80Var;
        this.i = -2;
    }

    public lr0(Object obj, Map map) {
        this.h = (byte) 3;
        this.j = obj;
        this.k = map;
    }

    public lr0(ij1 ij1Var) {
        this.h = (byte) 1;
        this.k = ij1Var;
        this.i = -1;
        this.j = rz1.u(new hj1(ij1Var, this, null));
    }
}
