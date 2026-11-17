package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lg2 {
    public final os0 a;
    public final long b;
    public final kg2 c;
    public final boolean d;

    public lg2(os0 os0Var, long j, kg2 kg2Var, boolean z) {
        this.a = os0Var;
        this.b = j;
        this.c = kg2Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg2)) {
            return false;
        }
        lg2 lg2Var = (lg2) obj;
        return this.a == lg2Var.a && up1.b(this.b, lg2Var.b) && this.c == lg2Var.c && this.d == lg2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + jp1.d(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + up1.g(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
