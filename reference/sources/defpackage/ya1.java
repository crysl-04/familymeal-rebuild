package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ya1 implements rh2 {
    public final rh2 a;

    public ya1(rh2 rh2Var) {
        this.a = rh2Var;
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
    public final p02 c() {
        return po2.j;
    }

    @Override // defpackage.rh2
    public final int d() {
        return 1;
    }

    @Override // defpackage.rh2
    public final String e(int i) {
        ys.Z(i, b());
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya1)) {
            return false;
        }
        ya1 ya1Var = (ya1) obj;
        return uz0.g(this.a, ya1Var.a) && uz0.g(b(), ya1Var.b());
    }

    public final int hashCode() {
        return b().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.rh2
    public final List i(int i) {
        ys.Z(i, b());
        return ag0.h;
    }

    @Override // defpackage.rh2
    public final rh2 j(int i) {
        ys.Z(i, b());
        return this.a;
    }

    @Override // defpackage.rh2
    public final boolean k(int i) {
        ys.Z(i, b());
        return false;
    }

    public final String toString() {
        return b() + '(' + this.a + ')';
    }
}
