package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g82 {
    public Set a;
    public mz b;
    public final uj1 c;
    public nj1 d;
    public uj1 e;
    public final uj1 f;
    public final uj1 g;
    public nj1 h;
    public mj1 i;
    public ArrayList j;
    public nj1 k;

    public g82() {
        uj1 uj1Var = new uj1(new hr0[16]);
        this.c = uj1Var;
        nj1 nj1Var = cd2.a;
        this.d = new nj1();
        this.e = uj1Var;
        this.f = new uj1(new Object[16]);
        this.g = new uj1(new kp0[16]);
    }

    public static final boolean f(hr0 hr0Var, uj1 uj1Var) {
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            h82 h82Var = ((hr0) objArr[i2]).a;
            if (h82Var instanceof xv1) {
                uj1 uj1Var2 = ((xv1) h82Var).i;
                if (uj1Var2.j(hr0Var) || f(hr0Var, uj1Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        uj1 uj1Var = this.c;
        uj1Var.g();
        this.d.b();
        this.e = uj1Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                h82 h82Var = (h82) it.next();
                it.remove();
                h82Var.d();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r7 = this;
            java.util.Set r0 = r7.a
            if (r0 == 0) goto L9f
            r1 = 0
            r7.k = r1
            uj1 r1 = r7.f
            int r2 = r1.j
            r3 = 11
            if (r2 == 0) goto L63
            java.lang.String r2 = "Compose:onForgotten"
            android.os.Trace.beginSection(r2)
            nj1 r2 = r7.h     // Catch: java.lang.Throwable -> L5e
            int r4 = r1.j     // Catch: java.lang.Throwable -> L5e
            int r4 = r4 + (-1)
        L1a:
            r5 = -1
            if (r5 >= r4) goto L5a
            java.lang.Object[] r5 = r1.h     // Catch: java.lang.Throwable -> L5e
            r5 = r5[r4]     // Catch: java.lang.Throwable -> L5e
            boolean r6 = r5 instanceof defpackage.hr0     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L30
            r6 = r5
            hr0 r6 = (defpackage.hr0) r6     // Catch: java.lang.Throwable -> L4c
            h82 r6 = r6.a     // Catch: java.lang.Throwable -> L4c
            r0.remove(r6)     // Catch: java.lang.Throwable -> L4c
            r6.e()     // Catch: java.lang.Throwable -> L4c
        L30:
            boolean r6 = r5 instanceof defpackage.hy     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L49
            if (r2 == 0) goto L43
            boolean r6 = r2.c(r5)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L43
            r6 = r5
            hy r6 = (defpackage.hy) r6     // Catch: java.lang.Throwable -> L4c
            r6.a()     // Catch: java.lang.Throwable -> L4c
            goto L49
        L43:
            r6 = r5
            hy r6 = (defpackage.hy) r6     // Catch: java.lang.Throwable -> L4c
            r6.b()     // Catch: java.lang.Throwable -> L4c
        L49:
            int r4 = r4 + (-1)
            goto L1a
        L4c:
            r0 = move-exception
            mz r7 = r7.b     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L59
            h6 r1 = new h6     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r7, r5, r3)     // Catch: java.lang.Throwable -> L5e
            defpackage.ou.H(r0, r1)     // Catch: java.lang.Throwable -> L5e
        L59:
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5a:
            android.os.Trace.endSection()
            goto L63
        L5e:
            r7 = move-exception
            android.os.Trace.endSection()
            throw r7
        L63:
            uj1 r0 = r7.c
            int r1 = r0.j
            if (r1 == 0) goto L9f
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.util.Set r1 = r7.a     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L96
            java.lang.Object[] r2 = r0.h     // Catch: java.lang.Throwable -> L9a
            int r0 = r0.j     // Catch: java.lang.Throwable -> L9a
            r4 = 0
        L77:
            if (r4 >= r0) goto L96
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L9a
            hr0 r5 = (defpackage.hr0) r5     // Catch: java.lang.Throwable -> L9a
            h82 r6 = r5.a     // Catch: java.lang.Throwable -> L9a
            r1.remove(r6)     // Catch: java.lang.Throwable -> L9a
            r6.c()     // Catch: java.lang.Throwable -> L88
            int r4 = r4 + 1
            goto L77
        L88:
            r0 = move-exception
            mz r7 = r7.b     // Catch: java.lang.Throwable -> L9a
            if (r7 == 0) goto L95
            h6 r1 = new h6     // Catch: java.lang.Throwable -> L9a
            r1.<init>(r7, r5, r3)     // Catch: java.lang.Throwable -> L9a
            defpackage.ou.H(r0, r1)     // Catch: java.lang.Throwable -> L9a
        L95:
            throw r0     // Catch: java.lang.Throwable -> L9a
        L96:
            android.os.Trace.endSection()
            return
        L9a:
            r7 = move-exception
            android.os.Trace.endSection()
            throw r7
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g82.c():void");
    }

    public final void d() {
        uj1 uj1Var = this.g;
        if (uj1Var.j != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = uj1Var.h;
                int i = uj1Var.j;
                for (int i2 = 0; i2 < i; i2++) {
                    ((kp0) objArr[i2]).a();
                }
                uj1Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(hr0 hr0Var) {
        if (!this.d.c(hr0Var)) {
            nj1 nj1Var = this.k;
            if (nj1Var == null || !nj1Var.c(hr0Var)) {
                this.f.b(hr0Var);
                return;
            }
            return;
        }
        this.d.l(hr0Var);
        if (!this.e.j(hr0Var)) {
            uj1 uj1Var = this.c;
            if (!uj1Var.j(hr0Var)) {
                f(hr0Var, uj1Var);
            }
        }
        Set set = this.a;
        if (set != null) {
            set.add(hr0Var.a);
        }
    }

    public final void g(Set set, mz mzVar) {
        a();
        this.a = set;
        this.b = mzVar;
    }
}
