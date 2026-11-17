package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 implements dv0 {
    public final boolean a;
    public final float b;
    public final long c;

    public aa2(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.dv0
    public final j80 a(hz0 hz0Var) {
        return new p80(hz0Var, this.a, this.b, new o80(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa2)) {
            return false;
        }
        aa2 aa2Var = (aa2) obj;
        if (this.a != aa2Var.a || !cc0.b(this.b, aa2Var.b)) {
            return false;
        }
        long j = aa2Var.c;
        int i = kv.h;
        return r13.a(this.c, j);
    }

    @Override // defpackage.dv0
    public final int hashCode() {
        int iD = wi0.d(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = kv.h;
        return Long.hashCode(this.c) + iD;
    }
}
