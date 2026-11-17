package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d21 {
    public final short a;
    public final boolean b;
    public Object[] c = new Object[8];
    public int[] d;
    public int e;

    public d21(j11 j11Var) {
        this.a = j11Var.i;
        this.b = j11Var.h;
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.d = iArr;
        this.e = -1;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.e + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.c[i2];
            if (obj instanceof rh2) {
                rh2 rh2Var = (rh2) obj;
                boolean zG = uz0.g(rh2Var.c(), po2.j);
                int[] iArr = this.d;
                if (!zG) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(rh2Var.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(this.d[i2]);
                    sb.append("]");
                }
            } else if (obj == c5.a0) {
                sb.append("[<debug info disabled>]");
            } else if (obj != c5.b0) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final void b() {
        int i = this.e << 1;
        this.c = Arrays.copyOf(this.c, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        gi.R(0, 0, 14, this.d, iArr);
        this.d = iArr;
    }

    public final String toString() {
        return a();
    }
}
