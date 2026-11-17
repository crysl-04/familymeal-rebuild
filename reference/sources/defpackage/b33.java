package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b33 {
    public static final b82 b = new b82("^[a-z0-9_]{1,64}$");
    public final ArrayList a = new ArrayList();

    public final void a(double d, double d2, double d3, String str) {
        if (Math.abs(d) <= Double.MAX_VALUE && d >= d2 && d <= d3) {
            return;
        }
        this.a.add(str + ": " + d + " not in [" + d2 + ", " + d3 + "]");
    }

    public final void b(int i, int i2, int i3, String str) {
        boolean z = false;
        if (i2 <= i && i <= i3) {
            z = true;
        }
        if (z) {
            return;
        }
        this.a.add(str + ": " + i + " not in [" + i2 + ", " + i3 + "]");
    }

    public final void c(int i, String str, String str2) {
        str.getClass();
        boolean z = false;
        if (!co2.X(str) && str.length() <= i) {
            int i2 = 0;
            while (true) {
                if (i2 >= str.length()) {
                    z = true;
                    break;
                } else if (Character.isISOControl(str.charAt(i2))) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (z) {
            return;
        }
        this.a.add(str2 + ": text must be 1.." + i + " chars without control characters");
    }

    public final void d() {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            throw new g40(dv.R0(arrayList));
        }
    }
}
