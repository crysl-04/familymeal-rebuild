package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j32 implements rh2 {
    public final String a;
    public final d32 b;

    public j32(String str, d32 d32Var) {
        d32Var.getClass();
        this.a = str;
        this.b = d32Var;
    }

    @Override // defpackage.rh2
    public final int a(String str) {
        str.getClass();
        g();
        throw null;
    }

    @Override // defpackage.rh2
    public final String b() {
        return this.a;
    }

    @Override // defpackage.rh2
    public final p02 c() {
        return this.b;
    }

    @Override // defpackage.rh2
    public final int d() {
        return 0;
    }

    @Override // defpackage.rh2
    public final String e(int i) {
        g();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j32)) {
            return false;
        }
        j32 j32Var = (j32) obj;
        return this.a.equals(j32Var.a) && uz0.g(this.b, j32Var.b);
    }

    public final void g() {
        throw new IllegalStateException(wi0.i(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.rh2
    public final List i(int i) {
        g();
        throw null;
    }

    @Override // defpackage.rh2
    public final rh2 j(int i) {
        g();
        throw null;
    }

    @Override // defpackage.rh2
    public final boolean k(int i) {
        g();
        throw null;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
