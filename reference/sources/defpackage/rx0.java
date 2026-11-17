package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rx0 extends n73 implements Runnable, cq1, View.OnAttachStateChangeListener {
    public boolean j;
    public int k;
    public q83 l;
    public final mj1 m;
    public final iu1 n;
    public final fj1 o;
    public final ll2 p;

    public rx0() {
        super(1);
        mj1 mj1Var = new mj1(9);
        w83.a.getClass();
        mj1Var.n(v83.b, new k93("caption bar"));
        mj1Var.n(v83.c, new k93("display cutout"));
        mj1Var.n(v83.d, new k93("ime"));
        mj1Var.n(v83.e, new k93("mandatory system gestures"));
        mj1Var.n(v83.f, new k93("navigation bars"));
        mj1Var.n(v83.g, new k93("status bars"));
        mj1Var.n(v83.h, new k93("system gestures"));
        mj1Var.n(v83.i, new k93("tappable element"));
        mj1Var.n(v83.j, new k93("waterfall"));
        this.m = mj1Var;
        this.n = new iu1(0);
        this.o = new fj1(4);
        this.p = new ll2();
    }

    @Override // defpackage.cq1
    public final q83 a(View view, q83 q83Var) {
        if (this.j) {
            this.l = q83Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return q83Var;
            }
        } else if (this.k == 0) {
            f(q83Var);
        }
        return q83Var;
    }

    @Override // defpackage.n73
    public final void b(v73 v73Var) {
        boolean z = false;
        this.j = false;
        int iD = v73Var.a.d();
        this.k &= ~iD;
        this.l = null;
        w83 w83Var = (w83) y83.a.b(iD);
        if (w83Var != null) {
            Object objG = this.m.g(w83Var);
            objG.getClass();
            k93 k93Var = (k93) objG;
            k93Var.c.h(0.0f);
            k93Var.e.h(1.0f);
            k93Var.d.h(0L);
            k93Var.c.h(0.0f);
            k93Var.b.setValue(Boolean.FALSE);
            k93Var.j = -1L;
            k93Var.k = -1L;
            iu1 iu1Var = this.n;
            iu1Var.h(iu1Var.g() + 1);
            synchronized (bl2.c) {
                nj1 nj1Var = bl2.j.h;
                if (nj1Var != null && nj1Var.h()) {
                    z = true;
                }
            }
            if (z) {
                bl2.c();
            }
        }
    }

    @Override // defpackage.n73
    public final void c(v73 v73Var) {
        this.j = true;
    }

    @Override // defpackage.n73
    public final q83 d(q83 q83Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            v73 v73Var = (v73) list.get(i);
            w83 w83Var = (w83) y83.a.b(v73Var.a.d());
            if (w83Var != null) {
                Object objG = this.m.g(w83Var);
                objG.getClass();
                k93 k93Var = (k93) objG;
                if (((Boolean) k93Var.b.getValue()).booleanValue()) {
                    u73 u73Var = v73Var.a;
                    k93Var.c.h(u73Var.c());
                    k93Var.e.h(u73Var.a());
                    k93Var.d.h(u73Var.b());
                }
            }
        }
        f(q83Var);
        return q83Var;
    }

    @Override // defpackage.n73
    public final k42 e(v73 v73Var, k42 k42Var) {
        q83 q83Var = this.l;
        boolean z = false;
        this.j = false;
        this.l = null;
        if (v73Var.a.b() > 0 && q83Var != null) {
            int iD = v73Var.a.d();
            this.k |= iD;
            w83 w83Var = (w83) y83.a.b(iD);
            if (w83Var != null) {
                Object objG = this.m.g(w83Var);
                objG.getClass();
                k93 k93Var = (k93) objG;
                ox0 ox0VarH = q83Var.a.h(iD);
                long j = (((long) ox0VarH.a) << 48) | (((long) ox0VarH.b) << 32) | (((long) ox0VarH.c) << 16) | ((long) ox0VarH.d);
                long j2 = k93Var.h;
                if (!rz1.l(j, j2)) {
                    k93Var.j = j2;
                    k93Var.k = j;
                    k93Var.b.setValue(Boolean.TRUE);
                    u73 u73Var = v73Var.a;
                    k93Var.c.h(u73Var.c());
                    k93Var.e.h(u73Var.a());
                    k93Var.d.h(u73Var.b());
                    iu1 iu1Var = this.n;
                    iu1Var.h(iu1Var.g() + 1);
                    synchronized (bl2.c) {
                        nj1 nj1Var = bl2.j.h;
                        if (nj1Var != null && nj1Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        bl2.c();
                        return k42Var;
                    }
                }
            }
        }
        return k42Var;
    }

    public final void f(q83 q83Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        si1 si1Var = y83.a;
        int[] iArr2 = si1Var.b;
        Object[] objArr3 = si1Var.c;
        long[] jArr2 = si1Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            w83 w83Var = (w83) objArr3[i6];
                            ox0 ox0VarH = q83Var.a.h(i7);
                            long j3 = (((long) ox0VarH.a) << 48) | (((long) ox0VarH.b) << 32) | (((long) ox0VarH.c) << 16) | ((long) ox0VarH.d);
                            Object objG = this.m.g(w83Var);
                            objG.getClass();
                            k93 k93Var = (k93) objG;
                            if (!rz1.l(j3, k93Var.h)) {
                                k93Var.h = j3;
                                z2 = true;
                                if (!rz1.l(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                ox0 ox0VarI = q83Var.a.i(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) ox0VarI.a) << 48) | (((long) ox0VarI.b) << 32) | (((long) ox0VarI.c) << 16) | ((long) ox0VarI.d);
                                if (!rz1.l(k93Var.i, j4)) {
                                    k93Var.i = j4;
                                    z2 = true;
                                    if (!rz1.l(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            k93Var.a.setValue(Boolean.valueOf(q83Var.a.t(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        za0 za0VarG = q83Var.a.g();
        if (za0VarG == null) {
            j = 0;
        } else {
            ox0 ox0VarA = za0VarG.a();
            j = (((long) ox0VarA.a) << c3) | (((long) ox0VarA.b) << c2) | (((long) ox0VarA.c) << c) | ((long) ox0VarA.d);
        }
        mj1 mj1Var = this.m;
        w83.a.getClass();
        Object objG2 = mj1Var.g(v83.j);
        objG2.getClass();
        k93 k93Var2 = (k93) objG2;
        k93Var2.a.setValue(Boolean.valueOf(!rz1.l(j, 0L)));
        if (!rz1.l(k93Var2.h, j)) {
            k93Var2.h = j;
            k93Var2.i = j;
            z2 = z;
            if (!rz1.l(j, 0L)) {
                z3 = z2;
            }
        }
        if (za0VarG == null) {
            fj1 fj1Var = this.o;
            if (fj1Var.b > 0) {
                fj1Var.d();
                this.p.clear();
                z2 = z;
            }
        } else {
            List<Rect> boundingRects = za0VarG.a.getBoundingRects();
            int size = boundingRects.size();
            fj1 fj1Var2 = this.o;
            if (size < fj1Var2.b) {
                fj1Var2.m(boundingRects.size(), this.o.b);
                this.p.d(boundingRects.size(), this.p.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.o.b;
                int i8 = 0;
                while (i8 < size2) {
                    fj1 fj1Var3 = this.o;
                    fj1Var3.a(rz1.x(boundingRects.get(fj1Var3.b)));
                    this.p.add(new hx0(jp1.h(this.o.b, "display cutout rect ")));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = boundingRects.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = boundingRects.get(i9);
                sj1 sj1Var = (sj1) this.o.g(i9);
                if (!uz0.g(sj1Var.getValue(), rect)) {
                    sj1Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!boundingRects.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.n.g() != 0) && z2) {
            iu1 iu1Var = this.n;
            iu1Var.h(iu1Var.g() + 1);
            synchronized (bl2.c) {
                nj1 nj1Var = bl2.j.h;
                z4 = (nj1Var == null || nj1Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                bl2.c();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = t43.a;
        o43.c(view, this);
        v73.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = t43.a;
        o43.c(view, null);
        v73.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j) {
            this.k = 0;
            this.j = false;
            q83 q83Var = this.l;
            if (q83Var != null) {
                f(q83Var);
                this.l = null;
            }
        }
    }
}
