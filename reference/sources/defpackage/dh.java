package defpackage;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dh extends AbstractList implements z0, mo2, yj1, a1, RandomAccess, zj1, xj1, Consumer {
    public static final ch m;
    public final long h;
    public final zk i;
    public final long j;
    public final long k;
    public final long l;

    static {
        new ch(hh.k);
        gh ghVar = jh.k;
        gh ghVar2 = uh.k;
        vh vhVar = wh.k;
        new ch(xh.k);
        gh ghVar3 = yh.k;
        m = new ch(ai.k);
        vh vhVar2 = ci.k;
        vh vhVar3 = di.k;
        vh vhVar4 = ei.k;
        vh vhVar5 = fi.k;
    }

    public dh(zk zkVar, long j, long j2, long j3) {
        this.i = zkVar;
        this.j = j;
        this.k = j2;
        this.l = j3;
        this.h = (j2 - j) / j3;
    }

    @Override // defpackage.a1
    public final double A(int i) {
        return this.i.z(j(i));
    }

    @Override // defpackage.zj1
    public final void B(long j, Comparable comparable) {
        this.i.B(j(j), comparable);
    }

    @Override // defpackage.a1
    public final int C(long j) {
        return this.i.C(j(j));
    }

    @Override // defpackage.a1
    public final int D(int i) {
        return this.i.C(j(i));
    }

    @Override // defpackage.yj1
    public final void F(long j, double d) {
        this.i.F(j(j), d);
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        return this.i.G(j(j));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Comparable set(int i, Comparable comparable) {
        long j = j(i);
        zk zkVar = this.i;
        Comparable comparableG = zkVar.G(j);
        zkVar.B(j, comparable);
        return comparableG;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        a1 a1Var = (a1) obj;
        long jCount = a1Var.count();
        long j = this.h;
        if (j < jCount) {
            throw new a42("Not acceptable!", (byte) 0);
        }
        long jMin = Math.min(j, a1Var.count());
        for (long j2 = 0; j2 < jMin; j2++) {
            B(j2, a1Var.G(j2));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.i.reset();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.mo2
    public final long count() {
        return this.h;
    }

    @Override // defpackage.a1
    public final short d(int i) {
        return this.i.e(j(i));
    }

    @Override // defpackage.a1
    public final short e(long j) {
        return this.i.e(j(j));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof dh)) {
            dh dhVar = (dh) obj;
            if (this.h == dhVar.h && this.j == dhVar.j && this.k == dhVar.k && this.l == dhVar.l) {
                zk zkVar = dhVar.i;
                zk zkVar2 = this.i;
                if (zkVar2 == null) {
                    if (zkVar != null) {
                        return false;
                    }
                } else if (!zkVar2.equals(zkVar)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        this.i.F(j(i), d);
    }

    @Override // defpackage.yj1
    public final void g(long j, Comparable comparable) {
        this.i.g(j(j), comparable);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.i.G(j(i));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        long j = this.h;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        zk zkVar = this.i;
        int iHashCode2 = (i + (zkVar == null ? 0 : zkVar.hashCode())) * 31;
        long j2 = this.j;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.k;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.l;
        return i3 + ((int) (j4 ^ (j4 >>> 32)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int intExact = Math.toIntExact(this.h);
        zk zkVar = this.i;
        int i = 0;
        if (obj == null) {
            while (i < intExact) {
                if (zkVar.G(j(i)) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        if (!(obj instanceof Comparable)) {
            return -1;
        }
        while (i < intExact) {
            if (obj.equals(zkVar.G(j(i)))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.h == 0;
    }

    public final long j(long j) {
        return (this.l * j) + this.j;
    }

    @Override // defpackage.yj1
    public final void n(long j, c23 c23Var) {
        this.i.n(j(j), c23Var);
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        this.i.y(j(i), d);
    }

    @Override // defpackage.zj1
    public final void p(int i, float f) {
        this.i.w1(f, j(i));
    }

    @Override // defpackage.a1
    public final float q(int i) {
        return this.i.K0(j(i));
    }

    @Override // defpackage.a1
    public final long r(int i) {
        return this.i.s(j(i));
    }

    @Override // defpackage.zj1
    public final void reset() {
        this.i.reset();
    }

    @Override // defpackage.a1
    public final long s(long j) {
        return this.i.s(j(j));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, defpackage.mo2
    public final int size() {
        return Math.toIntExact(this.h);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        return new dh(this.i, j(i), j(i2), this.l);
    }

    @Override // defpackage.z0
    public final void t(long j, im imVar) {
        this.i.t(j(j), imVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a1.V0(this);
    }

    @Override // defpackage.a1
    public final byte v(int i) {
        return this.i.w(j(i));
    }

    @Override // defpackage.yj1
    public final void v1(tm tmVar, a1 a1Var) {
        throw null;
    }

    @Override // defpackage.a1
    public final byte w(long j) {
        return this.i.w(j(j));
    }

    @Override // defpackage.z0
    public final void w0(long j, im imVar) {
        this.i.M0(j(0L), j(j), this.l, imVar);
    }

    @Override // defpackage.zj1
    public final void y(long j, double d) {
        this.i.y(j(j), d);
    }

    @Override // defpackage.a1
    public final double z(long j) {
        return this.i.z(j(j));
    }
}
