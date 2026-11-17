package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x23 implements Comparable, Serializable {
    public static final x23 j = new x23(0, 0);
    public final long h;
    public final long i;

    public x23(long j2, long j3) {
        this.h = j2;
        this.i = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x23 x23Var = (x23) obj;
        x23Var.getClass();
        long j2 = x23Var.h;
        long j3 = this.h;
        return j3 != j2 ? Long.compareUnsigned(j3, j2) : Long.compareUnsigned(this.i, x23Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x23)) {
            return false;
        }
        x23 x23Var = (x23) obj;
        return this.h == x23Var.h && this.i == x23Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.h ^ this.i);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        pz1.n(this.h, bArr, 0, 0, 4);
        bArr[8] = 45;
        pz1.n(this.h, bArr, 9, 4, 6);
        bArr[13] = 45;
        pz1.n(this.h, bArr, 14, 6, 8);
        bArr[18] = 45;
        pz1.n(this.i, bArr, 19, 0, 2);
        bArr[23] = 45;
        pz1.n(this.i, bArr, 24, 2, 8);
        return new String(bArr, ws.a);
    }
}
