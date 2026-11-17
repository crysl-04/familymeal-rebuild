package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j33 extends l33 implements Iterable, l21 {
    public final String h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final List p;
    public final ArrayList q;

    public j33(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.h = str;
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = f5;
        this.n = f6;
        this.o = f7;
        this.p = list;
        this.q = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j33)) {
            return false;
        }
        j33 j33Var = (j33) obj;
        return uz0.g(this.h, j33Var.h) && this.i == j33Var.i && this.j == j33Var.j && this.k == j33Var.k && this.l == j33Var.l && this.m == j33Var.m && this.n == j33Var.n && this.o == j33Var.o && uz0.g(this.p, j33Var.p) && this.q.equals(j33Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + jp1.g(this.p, wi0.d(this.o, wi0.d(this.n, wi0.d(this.m, wi0.d(this.l, wi0.d(this.k, wi0.d(this.j, wi0.d(this.i, this.h.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ix1(this);
    }
}
