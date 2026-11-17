package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class z3 implements jq0, Serializable {
    public final Object h;
    public final Class i;
    public final String j;
    public final String k;
    public final boolean l = false;
    public final byte m;
    public final int n;

    /* JADX WARN: Multi-variable type inference failed */
    public z3(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.h = obj;
        this.i = cls;
        this.j = str;
        this.k = str2;
        this.m = i;
        this.n = i2 >> 1;
    }

    @Override // defpackage.jq0
    public final int b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return this.l == z3Var.l && this.m == z3Var.m && this.n == z3Var.n && uz0.g(this.h, z3Var.h) && this.i.equals(z3Var.i) && this.j.equals(z3Var.j) && this.k.equals(z3Var.k);
    }

    public final int hashCode() {
        Object obj = this.h;
        return ((((jp1.f(this.k, jp1.f(this.j, (this.i.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31), 31) + (this.l ? 1231 : 1237)) * 31) + this.m) * 31) + this.n;
    }

    public final String toString() {
        z72.a.getClass();
        return a82.a(this);
    }
}
