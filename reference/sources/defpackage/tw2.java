package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tw2 extends wg1 {
    public final String h;
    public final xw2 i;
    public final sm0 j;
    public final int k;
    public final boolean l;
    public final int m;
    public final int n;

    public tw2(String str, xw2 xw2Var, sm0 sm0Var, int i, boolean z, int i2, int i3) {
        this.h = str;
        this.i = xw2Var;
        this.j = sm0Var;
        this.k = i;
        this.l = z;
        this.m = i2;
        this.n = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw2)) {
            return false;
        }
        tw2 tw2Var = (tw2) obj;
        return uz0.g(this.h, tw2Var.h) && uz0.g(this.i, tw2Var.i) && uz0.g(this.j, tw2Var.j) && this.k == tw2Var.k && this.l == tw2Var.l && this.m == tw2Var.m && this.n == tw2Var.n;
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        ww2 ww2Var = new ww2();
        ww2Var.v = this.h;
        ww2Var.w = this.i;
        ww2Var.x = this.j;
        ww2Var.y = this.k;
        ww2Var.z = this.l;
        ww2Var.A = this.m;
        ww2Var.B = this.n;
        return ww2Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        sm0 sm0Var;
        sm0 sm0Var2;
        int i5;
        int i6;
        ww2 ww2Var = (ww2) qg1Var;
        ww2Var.getClass();
        xw2 xw2Var = ww2Var.w;
        boolean z6 = true;
        xw2 xw2Var2 = this.i;
        if (xw2Var2 != xw2Var) {
            if (!xw2Var2.a.b(xw2Var.a)) {
                z = true;
            }
            str = ww2Var.v;
            str2 = this.h;
            if (uz0.g(str, str2)) {
                z2 = false;
            } else {
                ww2Var.v = str2;
                ww2Var.F = null;
                z2 = true;
            }
            z3 = !ww2Var.w.c(xw2Var2);
            ww2Var.w = xw2Var2;
            i = ww2Var.B;
            i2 = this.n;
            if (i != i2) {
                ww2Var.B = i2;
                z3 = true;
            }
            i3 = ww2Var.A;
            i4 = this.m;
            if (i3 != i4) {
                ww2Var.A = i4;
                z3 = true;
            }
            z4 = ww2Var.z;
            z5 = this.l;
            if (z4 != z5) {
                ww2Var.z = z5;
                z3 = true;
            }
            sm0Var = ww2Var.x;
            sm0Var2 = this.j;
            if (!uz0.g(sm0Var, sm0Var2)) {
                ww2Var.x = sm0Var2;
                z3 = true;
            }
            i5 = ww2Var.y;
            i6 = this.k;
            if (i5 == i6) {
                z6 = z3;
            } else {
                ww2Var.y = i6;
            }
            if (z2 || z6) {
                bu1 bu1VarJ0 = ww2Var.J0();
                String str3 = ww2Var.v;
                xw2 xw2Var3 = ww2Var.w;
                sm0 sm0Var3 = ww2Var.x;
                int i7 = ww2Var.y;
                boolean z7 = ww2Var.z;
                int i8 = ww2Var.A;
                int i9 = ww2Var.B;
                bu1VarJ0.a = str3;
                bu1VarJ0.b = xw2Var3;
                bu1VarJ0.c = sm0Var3;
                bu1VarJ0.d = i7;
                bu1VarJ0.e = z7;
                bu1VarJ0.f = i8;
                bu1VarJ0.g = i9;
                bu1VarJ0.s = (bu1VarJ0.s << 2) | 2;
                bu1VarJ0.j = null;
                bu1VarJ0.n = null;
                bu1VarJ0.o = null;
                bu1VarJ0.q = -1;
                bu1VarJ0.r = -1;
                bu1VarJ0.p = l00.h(0, 0, 0, 0);
                bu1VarJ0.l = 0L;
                bu1VarJ0.k = false;
            }
            if (ww2Var.u) {
                if (z2 || (z && ww2Var.E != null)) {
                    y02.p(ww2Var);
                }
                if (z2 || z6) {
                    vs.E(ww2Var);
                    dt.H(ww2Var);
                }
                if (z) {
                    dt.H(ww2Var);
                }
            }
        }
        xw2Var2.getClass();
        z = false;
        str = ww2Var.v;
        str2 = this.h;
        if (uz0.g(str, str2)) {
            z2 = false;
        } else {
            ww2Var.v = str2;
            ww2Var.F = null;
            z2 = true;
        }
        z3 = !ww2Var.w.c(xw2Var2);
        ww2Var.w = xw2Var2;
        i = ww2Var.B;
        i2 = this.n;
        if (i != i2) {
            ww2Var.B = i2;
            z3 = true;
        }
        i3 = ww2Var.A;
        i4 = this.m;
        if (i3 != i4) {
            ww2Var.A = i4;
            z3 = true;
        }
        z4 = ww2Var.z;
        z5 = this.l;
        if (z4 != z5) {
            ww2Var.z = z5;
            z3 = true;
        }
        sm0Var = ww2Var.x;
        sm0Var2 = this.j;
        if (!uz0.g(sm0Var, sm0Var2)) {
            ww2Var.x = sm0Var2;
            z3 = true;
        }
        i5 = ww2Var.y;
        i6 = this.k;
        if (i5 == i6) {
            z6 = z3;
        } else {
            ww2Var.y = i6;
        }
        if (z2) {
            bu1 bu1VarJ1 = ww2Var.J0();
            String str4 = ww2Var.v;
            xw2 xw2Var4 = ww2Var.w;
            sm0 sm0Var4 = ww2Var.x;
            int i10 = ww2Var.y;
            boolean z8 = ww2Var.z;
            int i11 = ww2Var.A;
            int i12 = ww2Var.B;
            bu1VarJ1.a = str4;
            bu1VarJ1.b = xw2Var4;
            bu1VarJ1.c = sm0Var4;
            bu1VarJ1.d = i10;
            bu1VarJ1.e = z8;
            bu1VarJ1.f = i11;
            bu1VarJ1.g = i12;
            bu1VarJ1.s = (bu1VarJ1.s << 2) | 2;
            bu1VarJ1.j = null;
            bu1VarJ1.n = null;
            bu1VarJ1.o = null;
            bu1VarJ1.q = -1;
            bu1VarJ1.r = -1;
            bu1VarJ1.p = l00.h(0, 0, 0, 0);
            bu1VarJ1.l = 0L;
            bu1VarJ1.k = false;
        } else {
            bu1 bu1VarJ2 = ww2Var.J0();
            String str5 = ww2Var.v;
            xw2 xw2Var5 = ww2Var.w;
            sm0 sm0Var5 = ww2Var.x;
            int i13 = ww2Var.y;
            boolean z9 = ww2Var.z;
            int i14 = ww2Var.A;
            int i15 = ww2Var.B;
            bu1VarJ2.a = str5;
            bu1VarJ2.b = xw2Var5;
            bu1VarJ2.c = sm0Var5;
            bu1VarJ2.d = i13;
            bu1VarJ2.e = z9;
            bu1VarJ2.f = i14;
            bu1VarJ2.g = i15;
            bu1VarJ2.s = (bu1VarJ2.s << 2) | 2;
            bu1VarJ2.j = null;
            bu1VarJ2.n = null;
            bu1VarJ2.o = null;
            bu1VarJ2.q = -1;
            bu1VarJ2.r = -1;
            bu1VarJ2.p = l00.h(0, 0, 0, 0);
            bu1VarJ2.l = 0L;
            bu1VarJ2.k = false;
        }
        if (ww2Var.u) {
            if (z2) {
                y02.p(ww2Var);
            } else {
                y02.p(ww2Var);
            }
            if (z2) {
                vs.E(ww2Var);
                dt.H(ww2Var);
            } else {
                vs.E(ww2Var);
                dt.H(ww2Var);
            }
            if (z) {
                dt.H(ww2Var);
            }
        }
    }

    public final int hashCode() {
        return (((jp1.c(jp1.b(this.k, (this.j.hashCode() + jp1.e(this.i, this.h.hashCode() * 31, 31)) * 31, 31), 31, this.l) + this.m) * 31) + this.n) * 31;
    }
}
