package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n33 extends l33 {
    public final String h;
    public final List i;
    public final boolean j;
    public final zo k;
    public final float l;
    public final zo m;
    public final float n;
    public final float o;
    public final byte p;
    public final byte q;
    public final float r;
    public final float s;
    public final float t;
    public final float u;

    /* JADX WARN: Multi-variable type inference failed */
    public n33(String str, List list, int i, zo zoVar, float f, zo zoVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.h = str;
        this.i = list;
        this.j = i;
        this.k = zoVar;
        this.l = f;
        this.m = zoVar2;
        this.n = f2;
        this.o = f3;
        this.p = i2;
        this.q = i3;
        this.r = f4;
        this.s = f5;
        this.t = f6;
        this.u = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n33.class != obj.getClass()) {
            return false;
        }
        n33 n33Var = (n33) obj;
        return this.h.equals(n33Var.h) && uz0.g(this.k, n33Var.k) && this.l == n33Var.l && uz0.g(this.m, n33Var.m) && this.n == n33Var.n && this.o == n33Var.o && this.p == n33Var.p && this.q == n33Var.q && this.r == n33Var.r && this.s == n33Var.s && this.t == n33Var.t && this.u == n33Var.u && this.j == n33Var.j && uz0.g(this.i, n33Var.i);
    }

    public final int hashCode() {
        int iG = jp1.g(this.i, this.h.hashCode() * 31, 31);
        zo zoVar = this.k;
        int iD = wi0.d(this.l, (iG + (zoVar != null ? zoVar.hashCode() : 0)) * 31, 31);
        zo zoVar2 = this.m;
        return Integer.hashCode(this.j ? 1 : 0) + wi0.d(this.u, wi0.d(this.t, wi0.d(this.s, wi0.d(this.r, jp1.b(this.q, jp1.b(this.p, wi0.d(this.o, wi0.d(this.n, (iD + (zoVar2 != null ? zoVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
