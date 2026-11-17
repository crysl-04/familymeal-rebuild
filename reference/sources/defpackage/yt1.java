package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yt1 {
    public final g9 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public yt1(g9 g9Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = g9Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final long a(long j, boolean z) {
        if (z) {
            long j2 = qw2.b;
            if (qw2.b(j, j2)) {
                return j2;
            }
        }
        int i = qw2.c;
        int i2 = this.b;
        return m02.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return cy1.n(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yt1) {
            yt1 yt1Var = (yt1) obj;
            if (this.a == yt1Var.a && this.b == yt1Var.b && this.c == yt1Var.c && this.d == yt1Var.d && this.e == yt1Var.e && Float.compare(this.f, yt1Var.f) == 0 && Float.compare(this.g, yt1Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + wi0.d(this.f, jp1.b(this.e, jp1.b(this.d, jp1.b(this.c, jp1.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ")";
    }
}
