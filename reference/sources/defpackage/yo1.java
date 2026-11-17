package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yo1 implements List, RandomAccess, a1, z0, zj1, mo2 {
    public long h;
    public final vh i;
    public final ns0 j;
    public zk k;

    public yo1(vh vhVar, ns0 ns0Var, zk zkVar, long j) {
        this.i = vhVar;
        this.j = ns0Var;
        this.k = zkVar;
        this.h = j;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        if (i < this.h) {
            return this.k.A(i);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // defpackage.zj1
    public final void B(long j, Comparable comparable) {
        if (j >= this.h) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.k.B(j, comparable);
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        if (j < this.h) {
            return this.k.G(j);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void R(Comparable comparable) {
        a0();
        zk zkVar = this.k;
        long j = this.h;
        this.h = 1 + j;
        zkVar.B(j, comparable);
    }

    public final void a0() {
        long jCount = this.k.count();
        long j = this.h;
        if (jCount > j) {
            return;
        }
        long j2 = 1 + j;
        ns0 ns0Var = this.j;
        long j3 = ns0Var.c;
        vh vhVar = this.i;
        if (j2 <= j3) {
            zk zkVar = (zk) vhVar.o(ns0Var.b(j));
            zkVar.Z(this.k);
            this.k = zkVar;
            return;
        }
        zk zkVar2 = this.k;
        if (!(zkVar2 instanceof sf2)) {
            this.k = new sf2(new zk[]{zkVar2, (ry1) vhVar.o(ns0Var.a)}, vhVar);
            return;
        }
        sf2 sf2Var = (sf2) zkVar2;
        zk[] zkVarArr = sf2Var.l;
        int length = zkVarArr.length - 1;
        zk zkVar3 = zkVarArr[length];
        xk xkVar = sf2Var.k;
        long j4 = sf2Var.m;
        zk zkVar4 = (zk) xkVar.o(j4);
        long jCount2 = zkVar3.count();
        if (jCount2 < j4) {
            zkVarArr[length] = zkVar4;
            zkVar4.Z(zkVar3);
        } else {
            if (jCount2 != j4) {
                throw new IllegalStateException();
            }
            zk[] zkVarArr2 = new zk[zkVarArr.length + 1];
            for (int i = 0; i < zkVarArr.length; i++) {
                zkVarArr2[i] = zkVarArr[i];
            }
            zkVarArr2[zkVarArr.length] = zkVar4;
            sf2Var = new sf2(zkVarArr2, xkVar);
        }
        this.k = sf2Var;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        R((Comparable) obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            add(i2 + i, (Comparable) it.next());
            i2++;
        }
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.h = 0L;
        this.k.reset();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof Comparable) && indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mo2
    public final long count() {
        return this.h;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final Comparable remove(int i) {
        long j = i;
        Comparable comparableG = this.k.G(j);
        this.h--;
        while (j < this.h) {
            zk zkVar = this.k;
            long j2 = j + 1;
            zkVar.B(j, zkVar.G(j2));
            j = j2;
        }
        return comparableG;
    }

    @Override // java.util.List
    public final Object get(int i) {
        long j = i;
        if (j < this.h) {
            return this.k.G(j);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        long j;
        long j2 = this.h;
        long j3 = 0;
        if (obj == null) {
            while (true) {
                if (!(j3 < j2)) {
                    return -1;
                }
                j = j3 + 1;
                if (G(j3) != null) {
                    j3 = j;
                }
            }
        } else {
            while (true) {
                if (!(j3 < j2)) {
                    return -1;
                }
                j = j3 + 1;
                if (!obj.equals(G(j3))) {
                    j3 = j;
                }
            }
        }
        return (int) (j - 1);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new n01(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void add(int i, Comparable comparable) {
        a0();
        long j = this.h;
        while (true) {
            j--;
            long j2 = i;
            zk zkVar = this.k;
            if (j < j2) {
                zkVar.B(j2, comparable);
                this.h++;
                return;
            }
            zkVar.B(j + 1, zkVar.G(j));
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        n01 n01Var;
        long j;
        n01 n01Var2;
        ListIterator listIterator = listIterator((int) this.h);
        if (obj == null) {
            do {
                n01Var2 = (n01) listIterator;
                if (!n01Var2.hasPrevious()) {
                    return -1;
                }
            } while (n01Var2.previous() != null);
            j = n01Var2.j;
        } else {
            do {
                n01Var = (n01) listIterator;
                if (!n01Var.hasPrevious()) {
                    return -1;
                }
            } while (!obj.equals(n01Var.previous()));
            j = n01Var.j;
        }
        return (int) j;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new n01(this, i);
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        if (i >= this.h) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.k.o(i, d);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        for (Object obj : toArray()) {
            if (!collection.contains(obj)) {
                remove(obj);
            }
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        Comparable comparable = (Comparable) obj;
        long j = i;
        if (j >= this.h) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Comparable comparableG = this.k.G(j);
        this.k.B(j, comparable);
        return comparableG;
    }

    @Override // java.util.List, java.util.Collection, defpackage.mo2
    public final int size() {
        return (int) this.h;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        vh vhVar = this.i;
        yo1 yo1Var = new yo1(vhVar, this.j, (ry1) vhVar.o(4L), 0L);
        int i3 = 0;
        if (this.k instanceof xh) {
            while (i3 < i2) {
                double dA = A(i3);
                yo1Var.a0();
                zk zkVar = yo1Var.k;
                long j = yo1Var.h;
                yo1Var.h = 1 + j;
                zkVar.y(j, dA);
                i3++;
            }
        } else {
            while (i3 < i2) {
                long j2 = i3;
                if (j2 >= this.h) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                yo1Var.R(this.k.G(j2));
                i3++;
            }
        }
        return yo1Var;
    }

    @Override // defpackage.z0
    public final void t(long j, im imVar) {
        if (j >= this.h) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.k.t(j, imVar);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = this.k.G(i);
        }
        return objArr;
    }

    public final String toString() {
        return a1.V0(this);
    }

    @Override // defpackage.zj1
    public final void y(long j, double d) {
        if (j >= this.h) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.k.y(j, d);
    }

    @Override // defpackage.a1
    public final double z(long j) {
        if (j < this.h) {
            return this.k.z(j);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new n01(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = new Object[(int) this.h];
        toArray(objArr);
        return objArr;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            R((Comparable) it.next());
        }
        return true;
    }
}
