package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 implements rh2 {
    public final rh2 a;
    public final rh2 b;

    public ja1(rh2 rh2Var, rh2 rh2Var2) {
        rh2Var.getClass();
        rh2Var2.getClass();
        this.a = rh2Var;
        this.b = rh2Var2;
    }

    @Override // defpackage.rh2
    public final int a(String str) {
        str.getClass();
        Integer numO = jo2.O(str);
        if (numO == null) {
            return -3;
        }
        if (numO.intValue() < 0) {
            numO = null;
        }
        if (numO != null) {
            return numO.intValue();
        }
        return -3;
    }

    @Override // defpackage.rh2
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // defpackage.rh2
    public final p02 c() {
        return po2.k;
    }

    @Override // defpackage.rh2
    public final int d() {
        return 2;
    }

    @Override // defpackage.rh2
    public final String e(int i) {
        ys.Z(i, "kotlin.collections.LinkedHashMap");
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja1)) {
            return false;
        }
        ja1 ja1Var = (ja1) obj;
        return uz0.g(this.a, ja1Var.a) && uz0.g(this.b, ja1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // defpackage.rh2
    public final List i(int i) {
        ys.Z(i, "kotlin.collections.LinkedHashMap");
        return ag0.h;
    }

    @Override // defpackage.rh2
    public final rh2 j(int i) {
        ys.Z(i, "kotlin.collections.LinkedHashMap");
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        li1.g("Unreached");
        return null;
    }

    @Override // defpackage.rh2
    public final boolean k(int i) {
        ys.Z(i, "kotlin.collections.LinkedHashMap");
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
