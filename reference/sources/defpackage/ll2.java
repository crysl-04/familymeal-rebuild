package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ll2 implements Parcelable, qn2, List, RandomAccess, l21 {
    public static final Parcelable.Creator<ll2> CREATOR = new kl2((byte) 0);
    public pn2 h;

    public ll2(h0 h0Var) {
        uk2 uk2VarH = bl2.h();
        pn2 pn2Var = new pn2(uk2VarH.g(), h0Var);
        if (!(uk2VarH instanceof wr0)) {
            pn2Var.b = new pn2(1L, h0Var);
        }
        this.h = pn2Var;
    }

    @Override // defpackage.qn2
    public final sn2 a() {
        return this.h;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        h0 h0Var;
        uk2 uk2VarH;
        boolean zG;
        do {
            synchronized (ia2.g0) {
                pn2 pn2Var = this.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            h0 h0VarC = h0Var.c(obj);
            if (h0VarC.equals(h0Var)) {
                return false;
            }
            pn2 pn2Var3 = this.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = ia2.g((pn2) bl2.w(pn2Var3, this, uk2VarH), i, h0VarC, true);
            }
            bl2.l(uk2VarH, this);
        } while (!zG);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        h0 h0Var;
        uk2 uk2VarH;
        boolean zG;
        do {
            synchronized (ia2.g0) {
                pn2 pn2Var = this.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            h0 h0VarD = h0Var.d(collection);
            if (uz0.g(h0VarD, h0Var)) {
                return false;
            }
            pn2 pn2Var3 = this.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = ia2.g((pn2) bl2.w(pn2Var3, this, uk2VarH), i, h0VarD, true);
            }
            bl2.l(uk2VarH, this);
        } while (!zG);
        return true;
    }

    @Override // defpackage.qn2
    public final void c(sn2 sn2Var) {
        sn2Var.b = this.h;
        this.h = (pn2) sn2Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        uk2 uk2VarH;
        pn2 pn2Var = this.h;
        pn2Var.getClass();
        synchronized (bl2.c) {
            uk2VarH = bl2.h();
            pn2 pn2Var2 = (pn2) bl2.w(pn2Var, this, uk2VarH);
            synchronized (ia2.g0) {
                pn2Var2.c = jk2.i;
                pn2Var2.d++;
                pn2Var2.e++;
            }
        }
        bl2.l(uk2VarH, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ia2.m(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ia2.m(this).c.containsAll(collection);
    }

    public final void d(int i, int i2) {
        int i3;
        h0 h0Var;
        uk2 uk2VarH;
        boolean zG;
        do {
            synchronized (ia2.g0) {
                pn2 pn2Var = this.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i3 = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            ox1 ox1VarE = h0Var.e();
            ox1VarE.subList(i, i2).clear();
            h0 h0VarC = ox1VarE.c();
            if (uz0.g(h0VarC, h0Var)) {
                return;
            }
            pn2 pn2Var3 = this.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = ia2.g((pn2) bl2.w(pn2Var3, this, uk2VarH), i3, h0VarC, true);
            }
            bl2.l(uk2VarH, this);
        } while (!zG);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ia2.m(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ia2.m(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ia2.m(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ia2.m(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ht0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        h0 h0Var;
        uk2 uk2VarH;
        boolean zG;
        do {
            synchronized (ia2.g0) {
                pn2 pn2Var = this.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            int iIndexOf = h0Var.indexOf(obj);
            h0 h0VarG = iIndexOf != -1 ? h0Var.g(iIndexOf) : h0Var;
            if (h0VarG.equals(h0Var)) {
                return false;
            }
            pn2 pn2Var3 = this.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = ia2.g((pn2) bl2.w(pn2Var3, this, uk2VarH), i, h0VarG, true);
            }
            bl2.l(uk2VarH, this);
        } while (!zG);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        h0 h0Var;
        uk2 uk2VarH;
        boolean zG;
        do {
            synchronized (ia2.g0) {
                pn2 pn2Var = this.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            h0 h0VarF = h0Var.f(new g0(collection, (byte) 0));
            if (uz0.g(h0VarF, h0Var)) {
                return false;
            }
            pn2 pn2Var3 = this.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = ia2.g((pn2) bl2.w(pn2Var3, this, uk2VarH), i, h0VarF, true);
            }
            bl2.l(uk2VarH, this);
        } while (!zG);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ia2.r(this, new g0(collection, (byte) 2));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        h0 h0Var;
        uk2 uk2VarH;
        boolean zG;
        Object obj2 = get(i);
        do {
            synchronized (ia2.g0) {
                pn2 pn2Var = this.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i2 = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            h0 h0VarH = h0Var.h(i, obj);
            if (h0VarH.equals(h0Var)) {
                break;
            }
            pn2 pn2Var3 = this.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = ia2.g((pn2) bl2.w(pn2Var3, this, uk2VarH), i2, h0VarH, false);
            }
            bl2.l(uk2VarH, this);
        } while (!zG);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ia2.m(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            w12.a("fromIndex or toIndex are out of bounds");
        }
        return new vo2(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return s60.I(this);
    }

    public final String toString() {
        pn2 pn2Var = this.h;
        pn2Var.getClass();
        return "SnapshotStateList(value=" + ((pn2) bl2.f(pn2Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        h0 h0Var = ia2.m(this).c;
        int iA = h0Var.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(h0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return s60.J(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ht0(this, i);
    }

    public ll2() {
        this(jk2.i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        h0 h0Var;
        uk2 uk2VarH;
        boolean zG;
        do {
            synchronized (ia2.g0) {
                pn2 pn2Var = this.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i2 = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            h0 h0VarB = h0Var.b(i, obj);
            if (h0VarB.equals(h0Var)) {
                return;
            }
            pn2 pn2Var3 = this.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = ia2.g((pn2) bl2.w(pn2Var3, this, uk2VarH), i2, h0VarB, true);
            }
            bl2.l(uk2VarH, this);
        } while (!zG);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return ia2.r(this, new ao0(i, (Object) collection, (byte) 3));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        h0 h0Var;
        uk2 uk2VarH;
        boolean zG;
        Object obj = get(i);
        do {
            synchronized (ia2.g0) {
                pn2 pn2Var = this.h;
                pn2Var.getClass();
                pn2 pn2Var2 = (pn2) bl2.f(pn2Var);
                i2 = pn2Var2.d;
                h0Var = pn2Var2.c;
            }
            h0Var.getClass();
            h0 h0VarG = h0Var.g(i);
            if (h0VarG.equals(h0Var)) {
                break;
            }
            pn2 pn2Var3 = this.h;
            pn2Var3.getClass();
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                zG = ia2.g((pn2) bl2.w(pn2Var3, this, uk2VarH), i2, h0VarG, true);
            }
            bl2.l(uk2VarH, this);
        } while (!zG);
        return obj;
    }
}
