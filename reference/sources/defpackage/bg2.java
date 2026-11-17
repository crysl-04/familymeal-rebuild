package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bg2 {
    public final ag2 a;
    public final ag2 b;
    public final boolean c;

    public bg2(ag2 ag2Var, ag2 ag2Var2, boolean z) {
        this.a = ag2Var;
        this.b = ag2Var2;
        this.c = z;
    }

    public static bg2 a(bg2 bg2Var, ag2 ag2Var, ag2 ag2Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            ag2Var = bg2Var.a;
        }
        if ((i & 2) != 0) {
            ag2Var2 = bg2Var.b;
        }
        bg2Var.getClass();
        return new bg2(ag2Var, ag2Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2)) {
            return false;
        }
        bg2 bg2Var = (bg2) obj;
        return uz0.g(this.a, bg2Var.a) && uz0.g(this.b, bg2Var.b) && this.c == bg2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ")";
    }
}
