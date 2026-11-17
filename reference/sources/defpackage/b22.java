package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b22 implements c71 {
    public final int a;
    public final eg b;
    public final vp0 c;
    public k00 d;
    public yo2 e;
    public y41 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public a22 l;
    public boolean m;
    public long n;
    public long o;
    public long p = yg1.a();
    public boolean q;
    public final /* synthetic */ n31 r;

    public b22(n31 n31Var, int i, eg egVar, vp0 vp0Var) {
        this.r = n31Var;
        this.a = i;
        this.b = egVar;
        this.c = vp0Var;
    }

    @Override // defpackage.c71
    public final void a() {
        this.m = true;
    }

    public final void b() {
        y41 y41Var = this.f;
        if (y41Var != null) {
            switch (y41Var.a) {
                case 0:
                    break;
                default:
                    r41 r41VarB = y41Var.b();
                    if ((r41VarB != null ? r41VarB.f : null) != null) {
                        y41Var.b.g(y41Var.c);
                    }
                    break;
            }
        }
        this.f = null;
        yo2 yo2Var = this.e;
        if (yo2Var != null) {
            yo2Var.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(ea eaVar) {
        boolean zD;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(eaVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(eaVar);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // defpackage.c71
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01e6  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final boolean d(ea eaVar) {
        ?? r12;
        yo2 yo2VarE;
        int i = this.a;
        long j = i;
        Trace.setCounter("compose:lazy:prefetch:execute:item", j);
        s61 s61Var = (s61) ((r61) this.r.b).b.a();
        if (!this.h) {
            int iA = s61Var.a();
            if (i >= 0 && i < iA) {
                Object objB = s61Var.b(i);
                Object obj = this.j;
                if (obj != null && !objB.equals(obj)) {
                    b();
                    return false;
                }
                Object objC = s61Var.c(i);
                eg egVar = this.b;
                wi wiVar = (wi) egVar.k;
                if (egVar.j != objC || wiVar == null) {
                    mj1 mj1Var = (mj1) egVar.i;
                    Object objG = mj1Var.g(objC);
                    Object obj2 = objG;
                    if (objG == null) {
                        wi wiVar2 = new wi();
                        wiVar2.e = -1;
                        mj1Var.n(objC, wiVar2);
                        obj2 = wiVar2;
                    }
                    wiVar = (wi) obj2;
                    egVar.j = objC;
                    egVar.k = wiVar;
                }
                e();
                long jA = eaVar.a();
                this.n = jA;
                this.p = yg1.a();
                this.o = 0L;
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jA);
                if (!e()) {
                    if (g(this.n, wiVar.a + wiVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objB, objC, wiVar);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!g(this.n, wiVar.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        y41 y41Var = this.f;
                        if (y41Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (y41Var.a) {
                            case 0:
                                yo2VarE = y41Var.b.e(y41Var.c);
                                break;
                            default:
                                z41 z41Var = y41Var.b;
                                r41 r41VarB = y41Var.b();
                                if (r41VarB != null) {
                                    z41Var.c(r41VarB, false);
                                }
                                yo2VarE = z41Var.e(y41Var.c);
                                break;
                        }
                        this.e = yo2VarE;
                        this.f = null;
                        this.i = true;
                        Trace.endSection();
                        h();
                        wiVar.c = wi.a(this.o, wiVar.c);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.k) {
                    if (this.n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        yo2 yo2Var = this.e;
                        if (yo2Var == null) {
                            throw wi0.w("Should precompose before resolving nested prefetch states");
                        }
                        x72 x72Var = new x72();
                        yo2Var.b(new f6(x72Var, (byte) 5));
                        List list = (List) x72Var.h;
                        this.l = list != null ? new a22(this, list) : null;
                        this.k = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                a22 a22Var = this.l;
                if (a22Var != null) {
                    int i2 = wiVar.e;
                    boolean z = this.m;
                    List[] listArr = a22Var.b;
                    int i3 = a22Var.c;
                    List list2 = a22Var.a;
                    if (i3 < list2.size()) {
                        if (a22Var.f.h) {
                            dx0.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((d71) list2.get(i4)).d = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (a22Var.c < list2.size()) {
                                try {
                                    if (listArr[a22Var.c] == null) {
                                        if (eaVar.a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = a22Var.c;
                                        d71 d71Var = (d71) list2.get(i5);
                                        vp0 vp0Var = d71Var.a;
                                        b71 b71Var = new b71(d71Var, d71Var.d);
                                        vp0Var.h(b71Var);
                                        ArrayList arrayList = b71Var.b;
                                        d71Var.f = arrayList.size();
                                        listArr[i5] = arrayList;
                                    }
                                    List list3 = listArr[a22Var.c];
                                    list3.getClass();
                                    while (a22Var.d < list3.size()) {
                                        b22 b22Var = (b22) list3.get(a22Var.d);
                                        if (z) {
                                            b22 b22Var2 = b22Var != null ? b22Var : null;
                                            if (b22Var2 != null) {
                                                r12 = 1;
                                                b22Var2.m = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        a22Var.e = r12;
                                        if (b22Var.c(eaVar)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        a22Var.d += r12;
                                    }
                                    a22Var.d = 0;
                                    a22Var.c++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                a22 a22Var2 = this.l;
                if (a22Var2 != null && a22Var2.e) {
                    h();
                    Trace.setCounter("compose:lazy:prefetch:execute:item", j);
                    a22 a22Var3 = this.l;
                    if (a22Var3 != null) {
                        a22Var3.e = false;
                    }
                }
                k00 k00Var = this.d;
                if (!this.g && k00Var != null) {
                    if (!g(this.n, wiVar.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = k00Var.a;
                        if (this.h) {
                            dx0.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            dx0.a("Request was already measured!");
                        }
                        this.g = true;
                        yo2 yo2Var2 = this.e;
                        if (yo2Var2 == null) {
                            throw wi0.w("performComposition() must be called before performMeasure()");
                        }
                        int iD = yo2Var2.d();
                        for (int i6 = 0; i6 < iD; i6++) {
                            yo2Var2.e(i6, j2);
                        }
                        Trace.endSection();
                        h();
                        wiVar.d = wi.a(this.o, wiVar.d);
                        vp0 vp0Var2 = this.c;
                        if (vp0Var2 != null) {
                            vp0Var2.h(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                a22 a22Var4 = this.l;
                if (this.g && this.k && a22Var4 != null) {
                    List list4 = a22Var4.a;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((d71) list4.get(i7)).e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = wiVar.e;
                    wiVar.e = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((d71) list4.get(i9)).f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        wiVar.d = 0L;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        y41 y41Var;
        return this.i || ((y41Var = this.f) != null && y41Var.c());
    }

    public final void f(Object obj, Object obj2, final wi wiVar) {
        y41 y41Var;
        y41 y41Var2 = this.f;
        byte b = 0;
        if (y41Var2 == null) {
            n31 n31Var = this.r;
            zp0 zp0VarA = ((r61) n31Var.b).a(this.a, obj, obj2);
            z41 z41VarA = ((zo2) n31Var.c).a();
            if (z41VarA.h.I()) {
                z41VarA.k(obj, zp0VarA, true);
                y41Var = new y41(z41VarA, obj, (byte) 1);
            } else {
                y41Var = new y41(z41VarA, obj, b);
            }
            y41Var2 = y41Var;
            this.f = y41Var2;
            this.j = obj;
        }
        this.q = false;
        while (!y41Var2.c() && !this.q) {
            zi2 zi2Var = new zi2() { // from class: z12
                @Override // defpackage.zi2
                public final boolean b() {
                    b22 b22Var = this.h;
                    boolean z = b22Var.q;
                    if (z) {
                        return z;
                    }
                    b22Var.h();
                    long j = b22Var.o;
                    wi wiVar2 = wiVar;
                    long jA = wi.a(j, wiVar2.a);
                    wiVar2.a = jA;
                    boolean z2 = !b22Var.g(b22Var.n, jA + wiVar2.b);
                    b22Var.q = z2;
                    return z2;
                }
            };
            switch (y41Var2.a) {
                case 0:
                    break;
                default:
                    r41 r41VarB = y41Var2.b();
                    wv1 wv1Var = r41VarB != null ? r41VarB.f : null;
                    if (wv1Var == null || wv1Var.c()) {
                        break;
                    } else {
                        uk2 uk2VarN = y02.n();
                        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
                        uk2 uk2VarQ = y02.q(uk2VarN);
                        try {
                            wv1Var.e(zi2Var);
                            y02.u(uk2VarN, uk2VarQ, vp0VarE);
                            break;
                        } catch (Throwable th) {
                            try {
                                r41VarB.getClass();
                                throw th;
                            } catch (Throwable th2) {
                                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                                throw th2;
                            }
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            wiVar.b = wi.a(j, wiVar.b);
        } else {
            wiVar.a = wi.a(j, wiVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long jI;
        long jA = yg1.a();
        long j = this.p;
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            jI = ((jA - 1) | 1) == Long.MAX_VALUE ? ys.I(jA) : ys.b0(jA, j);
        } else if (jA == j) {
            yy yyVar = de0.i;
            jI = 0;
        } else {
            jI = de0.g(ys.I(j));
        }
        long j3 = jI >> 1;
        yy yyVar2 = de0.i;
        if ((((int) jI) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
        }
        this.o = j2;
        long j4 = this.n - j2;
        this.n = j4;
        this.p = jA;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j4);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.d + ", isComposed = " + e() + ", isMeasured = " + this.g + ", isCanceled = " + this.h + " }";
    }
}
