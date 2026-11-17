package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ag2 {
    public final u82 a;
    public final int b;

    public ag2(int i, u82 u82Var) {
        this.a = u82Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag2)) {
            return false;
        }
        ag2 ag2Var = (ag2) obj;
        return this.a == ag2Var.a && this.b == ag2Var.b;
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + 1;
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=1)";
    }
}
