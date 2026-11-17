package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class we1 {
    public final l41 a;
    public boolean c;
    public boolean d;
    public k00 h;
    public final eg b = new eg((byte) 6);
    public final ix0 e = new ix0((byte) 25);
    public final uj1 f = new uj1(new l41[16]);
    public final uj1 g = new uj1(new ve1[16]);

    public we1(l41 l41Var) {
        this.a = l41Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static boolean b(l41 l41Var, k00 k00Var) {
        boolean zB0;
        l41 l41Var2 = l41Var.o;
        p41 p41Var = l41Var.M;
        if (l41Var2 == null) {
            return false;
        }
        if (k00Var == null) {
            gd1 gd1Var = p41Var.q;
            k00 k00Var2 = gd1Var != null ? gd1Var.u : null;
            if (k00Var2 == null || l41Var2 == null) {
                zB0 = false;
            } else {
                gd1Var.getClass();
                zB0 = gd1Var.B0(k00Var2.a);
            }
        } else if (l41Var2 != null) {
            gd1 gd1Var2 = p41Var.q;
            gd1Var2.getClass();
            zB0 = gd1Var2.B0(k00Var.a);
        } else {
            zB0 = false;
        }
        l41 l41VarU = l41Var.u();
        if (zB0 && l41VarU != null) {
            if (l41VarU.o == null) {
                l41.W(l41VarU, false, 3);
                return zB0;
            }
            if (l41Var.s() == j41.h) {
                l41.U(l41VarU, false, 3);
                return zB0;
            }
            if (l41Var.s() == j41.i) {
                l41VarU.T(false);
            }
        }
        return zB0;
    }

    public static boolean c(l41 l41Var, k00 k00Var) {
        boolean zA0;
        j41 j41Var = j41.j;
        if (k00Var != null) {
            if (l41Var.I == j41Var) {
                l41Var.e();
            }
            zA0 = l41Var.M.p.A0(k00Var.a);
        } else {
            ye1 ye1Var = l41Var.M.p;
            k00 k00Var2 = ye1Var.q ? new k00(ye1Var.k) : null;
            if (k00Var2 != null) {
                if (l41Var.I == j41Var) {
                    l41Var.e();
                }
                zA0 = l41Var.M.p.A0(k00Var2.a);
            } else {
                l41Var.getClass();
                zA0 = false;
            }
        }
        l41 l41VarU = l41Var.u();
        if (zA0 && l41VarU != null) {
            if (l41Var.r() == j41.h) {
                l41.W(l41VarU, false, 3);
                return zA0;
            }
            if (l41Var.r() == j41.i) {
                l41VarU.V(false);
            }
        }
        return zA0;
    }

    public static boolean h(l41 l41Var) {
        gd1 gd1Var;
        m41 m41Var;
        if (l41Var.M.e) {
            return (l41Var.s() == j41.j && ((gd1Var = l41Var.M.q) == null || (m41Var = gd1Var.y) == null || !m41Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(l41 l41Var) {
        if (!l41Var.q()) {
            return false;
        }
        do {
            if (l41Var.r() == j41.j && !l41Var.M.p.E.e()) {
                l41 l41VarU = l41Var.u();
                if ((l41VarU != null ? l41VarU.M.d : null) != h41.h) {
                    return false;
                }
            }
            l41Var = l41Var.u();
            if (l41Var == null) {
                return false;
            }
        } while (!l41Var.J());
        return true;
    }

    public static boolean j(l41 l41Var) {
        gd1 gd1Var;
        m41 m41Var;
        p41 p41Var = l41Var.M;
        return l41Var.J() || p41Var.p.A || i(l41Var) || uz0.g(l41Var.K(), Boolean.TRUE) || h(l41Var) || p41Var.p.E.e() || !((gd1Var = p41Var.q) == null || (m41Var = gd1Var.y) == null || !m41Var.e());
    }

    public final void a(boolean z) {
        ix0 ix0Var = this.e;
        uj1 uj1Var = (uj1) ix0Var.i;
        if (z) {
            l41 l41Var = this.a;
            if (l41Var.T > 0) {
                uj1Var.g();
                uj1Var.b(l41Var);
                l41Var.S = true;
            }
        }
        if (uj1Var.j != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                ix0Var.p();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void d() {
        uj1 uj1Var = this.g;
        int i = uj1Var.j;
        if (i != 0) {
            Object[] objArr = uj1Var.h;
            for (int i2 = 0; i2 < i; i2++) {
                ve1 ve1Var = (ve1) objArr[i2];
                if (ve1Var.a.I()) {
                    boolean z = ve1Var.b;
                    l41 l41Var = ve1Var.a;
                    boolean z2 = ve1Var.c;
                    if (z) {
                        l41.U(l41Var, z2, 2);
                    } else {
                        l41.W(l41Var, z2, 2);
                    }
                }
            }
            uj1Var.g();
        }
    }

    public final void e(l41 l41Var) {
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var2 = (l41) objArr[i2];
            if (uz0.g(l41Var2.K(), Boolean.TRUE) && !l41Var2.U) {
                if (this.b.c(l41Var2)) {
                    l41Var2.L();
                }
                e(l41Var2);
            }
        }
    }

    public final void f(l41 l41Var, boolean z) {
        if (!this.c) {
            ax0.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? l41Var.M.e : l41Var.q()) {
            ax0.a("node not yet measured");
        }
        g(l41Var, z);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:51:0x0076 A[SYNTHETIC] */
    public final void g(l41 l41Var, boolean z) {
        gd1 gd1Var;
        m41 m41Var;
        boolean zR;
        p41 p41Var;
        boolean zQ;
        boolean zQ2;
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var2 = (l41) objArr[i2];
            j41 j41Var = j41.h;
            if (z) {
                if (l41Var2.s() == j41Var || ((gd1Var = l41Var2.M.q) != null && (m41Var = gd1Var.y) != null && m41Var.e())) {
                    zR = ys.R(l41Var2);
                    p41Var = l41Var2.M;
                    if (zR) {
                        if (p41Var.e) {
                            f(l41Var2, true);
                        } else {
                            f(l41Var2, true);
                        }
                    }
                    if (z) {
                        zQ = p41Var.e;
                    } else {
                        zQ = l41Var2.q();
                    }
                    if (zQ) {
                        o(l41Var2, z);
                    }
                    if (z) {
                        zQ2 = p41Var.e;
                    } else {
                        zQ2 = l41Var2.q();
                    }
                    if (!zQ2) {
                        g(l41Var2, z);
                    }
                }
            } else if (l41Var2.r() == j41Var || l41Var2.M.p.E.e()) {
                zR = ys.R(l41Var2);
                p41Var = l41Var2.M;
                if (zR && !z) {
                    if (p41Var.e || !this.b.c(l41Var2)) {
                        f(l41Var2, true);
                    } else {
                        o(l41Var2, true);
                    }
                }
                if (z) {
                    zQ = p41Var.e;
                } else {
                    zQ = l41Var2.q();
                }
                if (zQ) {
                    o(l41Var2, z);
                }
                if (z) {
                    zQ2 = p41Var.e;
                } else {
                    zQ2 = l41Var2.q();
                }
                if (!zQ2) {
                    g(l41Var2, z);
                }
            }
        }
        if (z ? l41Var.M.e : l41Var.q()) {
            o(l41Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [qg1] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [qg1] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [uj1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [uj1] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final boolean k(kp0 kp0Var) {
        boolean z;
        ?? R;
        boolean z2;
        l41 l41Var;
        boolean z3;
        boolean zO;
        eg egVar = this.b;
        g2 g2Var = (g2) egVar.i;
        l41 l41Var2 = this.a;
        if (!l41Var2.I()) {
            ax0.a("performMeasureAndLayout called with unattached root");
        }
        if (!l41Var2.J()) {
            ax0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            ax0.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (this.h != null) {
            this.c = true;
            this.d = true;
            try {
                if (egVar.s()) {
                    z = false;
                    while (true) {
                        g2 g2Var2 = (g2) egVar.k;
                        vl2 vl2Var = (vl2) g2Var2.i;
                        g2 g2Var3 = (g2) egVar.j;
                        vl2 vl2Var2 = (vl2) g2Var3.i;
                        if (!((vl2) g2Var.i).isEmpty()) {
                            l41Var = (l41) ((vl2) g2Var.i).first();
                            g2Var.K(l41Var);
                            z3 = l41Var.o != null;
                            z2 = false;
                        } else if (!vl2Var2.isEmpty()) {
                            l41Var = (l41) vl2Var2.first();
                            g2Var3.K(l41Var);
                            z3 = l41Var.o != null;
                            z2 = true;
                        } else {
                            if (vl2Var.isEmpty()) {
                                break;
                            }
                            l41 l41Var3 = (l41) vl2Var.first();
                            g2Var2.K(l41Var3);
                            z2 = true;
                            l41Var = l41Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zO = n(l41Var, z3);
                        } else {
                            zO = o(l41Var, z3);
                            if (l41Var.M.f) {
                                egVar.a(l41Var, b01.i);
                            }
                            if (l41Var.p()) {
                                egVar.a(l41Var, b01.k);
                            }
                        }
                        if (l41Var == l41Var2 && zO) {
                            z = true;
                        }
                    }
                    if (kp0Var != null) {
                        kp0Var.a();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        uj1 uj1Var = this.f;
        Object[] objArr = uj1Var.h;
        int i2 = uj1Var.j;
        int i3 = 0;
        while (i3 < i2) {
            ln1 ln1Var = ((l41) objArr[i3]).L;
            gx0 gx0Var = ln1Var.c;
            boolean zG = vn1.g(4194304);
            qg1 qg1Var = gx0Var.i0;
            if (zG || (qg1Var = qg1Var.l) != null) {
                de1 de1Var = pn1.b0;
                qg1 qg1VarY0 = gx0Var.Y0(zG);
                while (qg1VarY0 != null && (qg1VarY0.k & 4194304) != 0) {
                    if ((qg1VarY0.j & 4194304) != 0) {
                        ?? r12 = qg1VarY0;
                        ?? uj1Var2 = 0;
                        while (r12 != 0) {
                            if (r12 instanceof r31) {
                                ((r31) r12).q(ln1Var.c);
                            } else {
                                if ((r12.j & 4194304) != 0 && (r12 instanceof k80)) {
                                    qg1 qg1Var2 = ((k80) r12).w;
                                    int i4 = i;
                                    while (qg1Var2 != null) {
                                        if ((qg1Var2.j & 4194304) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                R = r12;
                                                uj1Var2 = uj1Var2;
                                                uj1Var2 = uj1Var2;
                                                R = qg1Var2;
                                            } else {
                                                if (uj1Var2 == 0) {
                                                    uj1Var2 = new uj1(new qg1[16]);
                                                }
                                                if (R != 0) {
                                                    uj1Var2.b(R);
                                                    R = 0;
                                                }
                                                uj1Var2.b(qg1Var2);
                                            }
                                        } else {
                                            R = r12;
                                            uj1Var2 = uj1Var2;
                                        }
                                        qg1Var2 = qg1Var2.m;
                                        R = R;
                                        uj1Var2 = uj1Var2;
                                    }
                                    if (i4 == 1) {
                                        R = r12;
                                        uj1Var2 = uj1Var2;
                                    }
                                }
                                i = 0;
                                r12 = R;
                                uj1Var2 = uj1Var2;
                            }
                            R = r12;
                            uj1Var2 = uj1Var2;
                            R = cu.R(uj1Var2);
                            i = 0;
                            r12 = R;
                            uj1Var2 = uj1Var2;
                        }
                    }
                    if (qg1VarY0 == qg1Var) {
                        break;
                    }
                    qg1VarY0 = qg1VarY0.m;
                    i = 0;
                }
            }
            i3++;
            i = 0;
        }
        uj1Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void l(l41 l41Var, long j) {
        boolean z = l41Var.U;
        p41 p41Var = l41Var.M;
        if (z) {
            return;
        }
        l41 l41Var2 = this.a;
        if (l41Var == l41Var2) {
            ax0.a("measureAndLayout called on root");
        }
        if (!l41Var2.I()) {
            ax0.a("performMeasureAndLayout called with unattached root");
        }
        if (!l41Var2.J()) {
            ax0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            ax0.a("performMeasureAndLayout called during measure layout");
        }
        if (this.h != null) {
            this.c = true;
            this.d = false;
            try {
                eg egVar = this.b;
                ((g2) egVar.i).K(l41Var);
                ((g2) egVar.j).K(l41Var);
                ((g2) egVar.k).K(l41Var);
                if ((b(l41Var, new k00(j)) || p41Var.f) && uz0.g(l41Var.K(), Boolean.TRUE)) {
                    l41Var.L();
                }
                e(l41Var);
                if (l41Var.I == j41.j) {
                    l41Var.e();
                }
                boolean zA0 = p41Var.p.A0(j);
                l41 l41VarU = l41Var.u();
                if (zA0 && l41VarU != null) {
                    if (l41Var.r() == j41.h) {
                        l41.W(l41VarU, false, 3);
                    } else if (l41Var.r() == j41.i) {
                        l41VarU.V(false);
                    }
                }
                if (l41Var.p() && l41Var.J()) {
                    l41Var.S();
                    ix0 ix0Var = this.e;
                    if (l41Var.T > 0) {
                        ((uj1) ix0Var.i).b(l41Var);
                        l41Var.S = true;
                    }
                }
                d();
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        }
        uj1 uj1Var = this.f;
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            ln1 ln1Var = ((l41) objArr[i2]).L;
            gx0 gx0Var = ln1Var.c;
            boolean zG = vn1.g(4194304);
            qg1 qg1Var = gx0Var.i0;
            if (zG || (qg1Var = qg1Var.l) != null) {
                de1 de1Var = pn1.b0;
                for (qg1 qg1VarY0 = gx0Var.Y0(zG); qg1VarY0 != null && (qg1VarY0.k & 4194304) != 0; qg1VarY0 = qg1VarY0.m) {
                    if ((qg1VarY0.j & 4194304) != 0) {
                        ?? R = qg1VarY0;
                        ?? uj1Var2 = 0;
                        while (R != 0) {
                            if (R instanceof r31) {
                                ((r31) R).q(ln1Var.c);
                            } else if ((R.j & 4194304) != 0 && (R instanceof k80)) {
                                qg1 qg1Var2 = ((k80) R).w;
                                int i3 = 0;
                                while (qg1Var2 != null) {
                                    if ((qg1Var2.j & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            R = R;
                                            uj1Var2 = uj1Var2;
                                            uj1Var2 = uj1Var2;
                                            R = qg1Var2;
                                        } else {
                                            if (uj1Var2 == 0) {
                                                uj1Var2 = new uj1(new qg1[16]);
                                            }
                                            if (R != 0) {
                                                uj1Var2.b(R);
                                                R = 0;
                                            }
                                            uj1Var2.b(qg1Var2);
                                        }
                                    } else {
                                        R = R;
                                        uj1Var2 = uj1Var2;
                                    }
                                    qg1Var2 = qg1Var2.m;
                                    R = R;
                                    uj1Var2 = uj1Var2;
                                }
                                if (i3 != 1) {
                                    R = R;
                                    uj1Var2 = uj1Var2;
                                } else {
                                    R = R;
                                    uj1Var2 = uj1Var2;
                                }
                            }
                            R = cu.R(uj1Var2);
                        }
                    }
                    if (qg1VarY0 == qg1Var) {
                        break;
                    }
                }
            }
        }
        uj1Var.g();
    }

    public final void m() {
        eg egVar = this.b;
        if (egVar.s()) {
            l41 l41Var = this.a;
            if (!l41Var.I()) {
                ax0.a("performMeasureAndLayout called with unattached root");
            }
            if (!l41Var.J()) {
                ax0.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                ax0.a("performMeasureAndLayout called during measure layout");
            }
            if (this.h != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((vl2) ((g2) egVar.k).i).isEmpty() || ((vl2) ((g2) egVar.i).i).isEmpty()) ? false : true) {
                        if (l41Var.o != null) {
                            q(l41Var, true);
                        } else {
                            p(l41Var);
                        }
                    }
                    q(l41Var, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.c = false;
                        this.d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean n(l41 l41Var, boolean z) {
        k00 k00Var;
        boolean z2 = l41Var.U;
        p41 p41Var = l41Var.M;
        boolean zB = false;
        if (!z2 && j(l41Var)) {
            l41 l41Var2 = this.a;
            if (l41Var == l41Var2) {
                k00Var = this.h;
                k00Var.getClass();
            } else {
                k00Var = null;
            }
            if (z) {
                zB = p41Var.e ? b(l41Var, k00Var) : false;
                if ((zB || p41Var.f) && uz0.g(l41Var.K(), Boolean.TRUE)) {
                    l41Var.L();
                }
            } else {
                boolean zC = l41Var.q() ? c(l41Var, k00Var) : false;
                if (l41Var.p()) {
                    if (l41Var != l41Var2) {
                        l41 l41VarU = l41Var.u();
                        if (l41VarU != null && l41VarU.J() && p41Var.p.A) {
                            l41Var.S();
                        }
                    } else {
                        if (l41Var.I == j41.j) {
                            l41Var.f();
                        }
                        l41 l41VarU2 = l41Var.u();
                        my1.k(l41VarU2 != null ? l41VarU2.L.c.w : o41.a(l41Var).getPlacementScope(), p41Var.p, 0, 0);
                    }
                    if (l41Var.T > 0) {
                        ((uj1) this.e.i).b(l41Var);
                        l41Var.S = true;
                    }
                }
                zB = zC;
            }
            d();
        }
        return zB;
    }

    public final boolean o(l41 l41Var, boolean z) {
        k00 k00Var;
        boolean zC = false;
        if (!l41Var.U && j(l41Var)) {
            if (l41Var == this.a) {
                k00Var = this.h;
                k00Var.getClass();
            } else {
                k00Var = null;
            }
            if (z) {
                if (l41Var.M.e) {
                    zC = b(l41Var, k00Var);
                }
            } else if (l41Var.q()) {
                zC = c(l41Var, k00Var);
            }
            d();
        }
        return zC;
    }

    public final void p(l41 l41Var) {
        uj1 uj1VarZ = l41Var.z();
        Object[] objArr = uj1VarZ.h;
        int i = uj1VarZ.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var2 = (l41) objArr[i2];
            if (l41Var2.r() == j41.h || l41Var2.M.p.E.e()) {
                if (ys.R(l41Var2)) {
                    q(l41Var2, true);
                } else {
                    p(l41Var2);
                }
            }
        }
    }

    public final void q(l41 l41Var, boolean z) {
        k00 k00Var;
        if (l41Var.U) {
            return;
        }
        if (l41Var == this.a) {
            k00Var = this.h;
            k00Var.getClass();
        } else {
            k00Var = null;
        }
        if (z) {
            b(l41Var, k00Var);
        } else {
            c(l41Var, k00Var);
        }
    }

    public final boolean r(l41 l41Var, boolean z) {
        int iOrdinal = l41Var.M.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.g.b(new ve1(l41Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    wg.n();
                    return false;
                }
                if (!l41Var.q() || z) {
                    l41Var.M.p.B = true;
                    if (!l41Var.U && (l41Var.J() || i(l41Var))) {
                        l41 l41VarU = l41Var.u();
                        if (l41VarU == null || !l41VarU.q()) {
                            this.b.a(l41Var, b01.j);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        k00 k00Var = this.h;
        if (k00Var == null ? false : k00.c(k00Var.a, j)) {
            return;
        }
        if (this.c) {
            ax0.a("updateRootConstraints called while measuring");
        }
        this.h = new k00(j);
        l41 l41Var = this.a;
        boolean zI = l41Var.I();
        p41 p41Var = l41Var.M;
        if (zI) {
            l41 l41Var2 = l41Var.o;
            if (l41Var2 != null) {
                p41Var.e = true;
            }
            p41Var.p.B = true;
            this.b.a(l41Var, l41Var2 != null ? b01.h : b01.j);
        }
    }
}
