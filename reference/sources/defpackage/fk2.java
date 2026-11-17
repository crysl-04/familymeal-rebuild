package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fk2 implements lz, Iterable, l21 {
    public int i;
    public int k;
    public int l;
    public boolean n;
    public int o;
    public HashMap q;
    public si1 r;
    public int[] h = new int[0];
    public Object[] j = new Object[0];
    public final Object m = new Object();
    public ArrayList p = new ArrayList();

    public final int a(xq0 xq0Var) {
        if (this.n) {
            ez.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!xq0Var.a()) {
            w12.a("Anchor refers to a group that was removed");
        }
        return xq0Var.a;
    }

    public final void b() {
        this.q = new HashMap();
    }

    public final dk2 c() {
        if (this.n) {
            li1.g("Cannot read while a writer is pending");
            return null;
        }
        this.l++;
        return new dk2(this);
    }

    public final ik2 d() {
        if (this.n) {
            ez.a("Cannot start a writer when another writer is pending");
        }
        if (this.l > 0) {
            ez.a("Cannot start a writer when a reader is pending");
        }
        this.n = true;
        this.o++;
        return new ik2(this);
    }

    public final boolean e(xq0 xq0Var) {
        int iC;
        return xq0Var.a() && (iC = hk2.c(this.p, xq0Var.a, this.i)) >= 0 && uz0.g(this.p.get(iC), xq0Var);
    }

    public final fr0 f(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.q;
        if (map != null) {
            if (this.n) {
                ez.a("use active SlotWriter to crate an anchor for location instead");
            }
            xq0 xq0Var = (i < 0 || i >= (i2 = this.i) || (iC = hk2.c((arrayList = this.p), i, i2)) < 0) ? null : (xq0) arrayList.get(iC);
            if (xq0Var != null) {
                return (fr0) map.get(xq0Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ms0(this, 0, this.i);
    }
}
