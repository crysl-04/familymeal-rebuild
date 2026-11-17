package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bp implements xv2 {
    public final ap a;
    public final float b;

    public bp(ap apVar, float f) {
        this.a = apVar;
        this.b = f;
    }

    @Override // defpackage.xv2
    public final long a() {
        int i = kv.h;
        return kv.g;
    }

    @Override // defpackage.xv2
    public final zo b() {
        return this.a;
    }

    @Override // defpackage.xv2
    public final float c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bp) {
            bp bpVar = (bp) obj;
            if (this.a == bpVar.a && Float.compare(this.b, bpVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
