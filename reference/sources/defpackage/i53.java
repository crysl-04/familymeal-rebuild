package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i53 {
    public final Object a;
    public final g53 b;
    public boolean c;

    public i53(Object obj) {
        g53 g53Var = new g53();
        this.a = obj;
        this.b = g53Var;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i53) {
            i53 i53Var = (i53) obj;
            if (this.a.equals(i53Var.a) && this.b == i53Var.b && this.c == i53Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961);
    }

    public final String toString() {
        return "Entry(key=" + this.a + ", store=" + this.b + ", refCount=0, isDisposable=" + this.c + ")";
    }
}
