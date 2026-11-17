package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r5 implements w53 {
    public final int h;
    public final int i;
    public int j;
    public final Object k;
    public final Object l;

    public r5(k40 k40Var) {
        this.k = k40Var;
        String str = k40Var.a;
        char c = k40Var.b;
        this.h = co2.U(str, c, 0, 6);
        this.i = co2.Y(str, c);
        this.j = k40Var.c.length();
        this.l = new g2(this, (byte) 10);
    }

    @Override // defpackage.w53
    public final hz2 a(od odVar) {
        int length = odVar.i.length();
        int i = this.j;
        String strSubstring = odVar.i;
        int i2 = 0;
        if (length > i) {
            qy0 qy0VarS = cy1.S(0, i);
            strSubstring.getClass();
            qy0VarS.getClass();
            strSubstring = strSubstring.substring(qy0VarS.h, qy0VarS.i + 1);
        }
        String str = "";
        int i3 = 0;
        while (i2 < strSubstring.length()) {
            int i4 = i3 + 1;
            str = str + strSubstring.charAt(i2);
            if (i4 == this.h || i3 + 2 == this.i) {
                str = str + ((k40) this.k).b;
            }
            i2++;
            i3 = i4;
        }
        return new hz2(new od(str), (g2) this.l);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final boolean b(int i, double d) {
        boolean zIsFinite = Double.isFinite(d);
        int i2 = this.h;
        if (zIsFinite) {
            double d2 = h32.a;
            if (d > d2) {
                int i3 = this.j;
                int[] iArr = (int[]) this.k;
                if (i3 < iArr.length) {
                    iArr[i3] = i;
                    ((double[]) this.l)[i3] = Math.log10(d);
                    this.j++;
                }
                double d3 = i;
                if (d3 >= Math.max(((double) i2) * 0.4d, 500.0d)) {
                    double dC = c(0.45d * d3, 0.55d * d3);
                    double dC2 = c(0.9d * d3, d3);
                    double d4 = (dC - dC2) / (d3 * 0.5d);
                    double d5 = d4 > d2 ? dC2 / d4 : Double.POSITIVE_INFINITY;
                    int i4 = this.i;
                    if (i >= i4 || d5 > i4 - i) {
                        return false;
                    }
                } else if (i >= i2) {
                    return false;
                }
            } else if (i < i2) {
                return false;
            }
        } else if (i < i2) {
            return false;
        }
        return true;
    }

    public final double c(double d, double d2) {
        double dMin = Double.POSITIVE_INFINITY;
        for (int i = 0; i < this.j; i++) {
            double d3 = ((int[]) this.k)[i];
            if (d3 >= d && d3 <= d2) {
                dMin = Math.min(dMin, ((double[]) this.l)[i]);
            }
        }
        return dMin;
    }

    public r5(int i, int i2) {
        this.j = 0;
        this.h = i;
        this.i = i2;
        int i3 = (i2 / 25) + 2;
        this.k = new int[i3];
        this.l = new double[i3];
    }
}
