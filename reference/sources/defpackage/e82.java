package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class e82 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final xi g;

    public e82(long j, long j2, long j3, long j4, long j5, float[] fArr, xi xiVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = xiVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && e82.class == obj.getClass()) {
            e82 e82Var = (e82) obj;
            if (this.a == e82Var.a && this.b == e82Var.b && this.e == e82Var.e && ny0.a(this.c, e82Var.c) && ny0.a(this.d, e82Var.d)) {
                float[] fArr = e82Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    if (fArr == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (fArr == null) {
                    zEquals = false;
                } else {
                    zEquals = fArr2.equals(fArr);
                }
                return zEquals && this.g == e82Var.g;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = jp1.d(this.d, jp1.d(this.c, jp1.d(this.e, jp1.d(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iD + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
