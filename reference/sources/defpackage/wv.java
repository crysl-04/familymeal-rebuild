package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wv implements xv2 {
    public final long a;

    public wv(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        bx0.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.xv2
    public final long a() {
        return this.a;
    }

    @Override // defpackage.xv2
    public final zo b() {
        return null;
    }

    @Override // defpackage.xv2
    public final float c() {
        return kv.c(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv)) {
            return false;
        }
        long j = ((wv) obj).a;
        int i = kv.h;
        return r13.a(this.a, j);
    }

    public final int hashCode() {
        int i = kv.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wi0.h("ColorStyle(value=", kv.h(this.a), ")");
    }
}
