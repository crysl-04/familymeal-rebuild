package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 {
    public static int k;
    public static final yy l = new yy(16);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final j33 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public iu0(String str, float f, float f2, float f3, float f4, j33 j33Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j33Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu0)) {
            return false;
        }
        iu0 iu0Var = (iu0) obj;
        if (!uz0.g(this.a, iu0Var.a) || !cc0.b(this.b, iu0Var.b) || !cc0.b(this.c, iu0Var.c) || this.d != iu0Var.d || this.e != iu0Var.e || !this.f.equals(iu0Var.f)) {
            return false;
        }
        long j = iu0Var.g;
        int i = kv.h;
        return r13.a(this.g, j) && this.h == iu0Var.h && this.i == iu0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + wi0.d(this.e, wi0.d(this.d, wi0.d(this.c, wi0.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = kv.h;
        return Boolean.hashCode(this.i) + jp1.b(this.h, jp1.d(this.g, iHashCode, 31), 31);
    }
}
