package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hu0 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final gu0 j;
    public boolean k;

    public hu0(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? kv.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        gu0 gu0Var = new gu0(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = gu0Var;
        arrayList.add(gu0Var);
    }

    public static void a(hu0 hu0Var, ArrayList arrayList, rl2 rl2Var) {
        if (hu0Var.k) {
            ax0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList2 = hu0Var.i;
        ((gu0) arrayList2.get(arrayList2.size() - 1)).j.add(new n33("", arrayList, 0, rl2Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final iu0 b() {
        if (this.k) {
            ax0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                gu0 gu0Var = this.j;
                iu0 iu0Var = new iu0(this.a, this.b, this.c, this.d, this.e, new j33(gu0Var.a, gu0Var.b, gu0Var.c, gu0Var.d, gu0Var.e, gu0Var.f, gu0Var.g, gu0Var.h, gu0Var.i, gu0Var.j), this.f, this.g, this.h);
                this.k = true;
                return iu0Var;
            }
            if (this.k) {
                ax0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            gu0 gu0Var2 = (gu0) arrayList.remove(arrayList.size() - 1);
            ((gu0) arrayList.get(arrayList.size() - 1)).j.add(new j33(gu0Var2.a, gu0Var2.b, gu0Var2.c, gu0Var2.d, gu0Var2.e, gu0Var2.f, gu0Var2.g, gu0Var2.h, gu0Var2.i, gu0Var2.j));
        }
    }
}
