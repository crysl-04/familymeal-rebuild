package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bz {
    public final dr0 a;
    public as b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final wy0 d = new wy0();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public bz(dr0 dr0Var, as asVar) {
        this.a = dr0Var;
        this.b = asVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            bs1 bs1Var = this.b.h;
            bs1Var.r0(xr1.c);
            bs1Var.j[bs1Var.k - bs1Var.h[bs1Var.i - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        as asVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        asVar.getClass();
        if (size != 0) {
            bs1 bs1Var2 = asVar.h;
            bs1Var2.r0(ar1.c);
            dt.Q(bs1Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                bs1 bs1Var = this.b.h;
                bs1Var.r0(pr1.c);
                int i3 = bs1Var.k - bs1Var.h[bs1Var.i - 1].a;
                int[] iArr = bs1Var.j;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                bs1 bs1Var2 = this.b.h;
                bs1Var2.r0(lr1.c);
                int i6 = bs1Var2.k - bs1Var2.h[bs1Var2.i - 1].a;
                int[] iArr2 = bs1Var2.j;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        dk2 dk2Var = this.a.G;
        int i = z ? dk2Var.i : dk2Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            ez.a("Tried to seek backward");
        }
        if (i2 > 0) {
            bs1 bs1Var = this.b.h;
            bs1Var.r0(tq1.c);
            bs1Var.j[bs1Var.k - bs1Var.h[bs1Var.i - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                ez.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
