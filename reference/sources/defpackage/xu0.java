package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xu0 {
    public int b;
    public final boolean[] g;
    public transient int[] a = null;
    public transient int[] c = null;
    public int d = 0;
    public int e = -1;
    public int f = -1;

    public xu0(int i) {
        this.g = new boolean[i];
        this.b = i;
    }

    public final int[] a() {
        int[] iArr = this.a;
        if (iArr == null || iArr.length != this.b) {
            this.a = new int[this.b];
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.g;
            if (i >= zArr.length) {
                return this.a;
            }
            if (!zArr[i]) {
                this.a[i2] = i;
                i2++;
            }
            i++;
        }
    }

    public final int[] b() {
        int[] iArr = this.c;
        if (iArr == null || iArr.length != this.d) {
            this.c = new int[this.d];
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.g;
            if (i >= zArr.length) {
                return this.c;
            }
            if (zArr[i]) {
                this.c[i2] = i;
                i2++;
            }
            i++;
        }
    }

    public final String toString() {
        int i = this.f;
        int i2 = this.e;
        String string = Arrays.toString(b());
        String string2 = Arrays.toString(a());
        StringBuilder sbK = wi0.k("Last Incl/Excl: ", i, "/", i2, " => ");
        sbK.append(string);
        sbK.append(" / ");
        sbK.append(string2);
        return sbK.toString();
    }
}
