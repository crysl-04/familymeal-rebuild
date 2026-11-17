package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ei0 {
    public static double b(ii0 ii0Var, int i, gs1 gs1Var) {
        lo2 lo2Var = new lo2(i);
        double dA0 = h32.a;
        if (gs1Var.m != is1.INFEASIBLE) {
            zh0 zh0VarC = ii0Var.C();
            dA0 = zh0VarC.M(lo2Var, false);
            if (zh0VarC.U()) {
                Map map = zh0VarC.x;
                Iterator it = (map != null ? map.keySet() : Collections.EMPTY_SET).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        li1.c();
                        return 0.0d;
                    }
                    zh0VarC.Q().doubleValue();
                    throw null;
                }
            }
        }
        for (eh0 eh0Var : gs1Var.i0()) {
            mg1 mg1Var = (mg1) ((ih0) eh0Var.getKey()).getKey();
            if (mg1Var instanceof zh0) {
                zh0 zh0Var = (zh0) mg1Var;
                if (zh0Var.u.keySet().contains(lo2Var)) {
                    dA0 -= eh0Var.A0() * zh0Var.M(lo2Var, false);
                }
            }
        }
        return dA0;
    }

    public static gs1 c(final gs1 gs1Var, final ii0 ii0Var, final vh vhVar, final Optional optional) {
        final List listG = ii0Var.g();
        final Set setF = ii0Var.f();
        final int size = listG.size();
        final int size2 = ii0Var.o.size();
        vhVar.getClass();
        final xh xhVarL2 = xh.l2(size2);
        if (xhVarL2.a0()) {
            for (int i = 0; i < size; i++) {
                xhVarL2.o(((e33) listG.get(i)).p.h, gs1Var.l.A(i));
            }
        } else {
            for (int i2 = 0; i2 < size; i2++) {
                xhVarL2.i2(((e33) listG.get(i2)).p.h, gs1Var.G(i2));
            }
        }
        Iterator it = setF.iterator();
        while (it.hasNext()) {
            int i3 = ((lo2) it.next()).h;
            xhVarL2.i2(i3, ii0Var.k(i3).E());
        }
        int i4 = ii0Var.i;
        boolean z = (i4 == 0 || 2 == i4) ? false : true;
        gs1 gs1VarA1 = gs1Var.a1(xhVarL2);
        if (z) {
            gs1VarA1 = gs1VarA1.u1(-gs1VarA1.n);
        }
        gs1 gs1VarU1 = gs1VarA1.u1(gs1VarA1.n + ii0Var.g.doubleValue());
        if (optional.isPresent()) {
            final boolean z2 = z && gs1Var.m != is1.INFEASIBLE;
            gs1VarU1.k = new Supplier(vhVar, size2, optional, size, ii0Var, listG, z2, setF, gs1Var, xhVarL2) { // from class: di0
                public final /* synthetic */ int a;
                public final /* synthetic */ Optional b;
                public final /* synthetic */ int c;
                public final /* synthetic */ ii0 d;
                public final /* synthetic */ List e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ Set g;
                public final /* synthetic */ gs1 h;

                {
                    this.a = size2;
                    this.b = optional;
                    this.c = size;
                    this.d = ii0Var;
                    this.e = listG;
                    this.f = z2;
                    this.g = setF;
                    this.h = gs1Var;
                }

                @Override // java.util.function.Supplier
                public final Object get() {
                    ii0 ii0Var2;
                    xh xhVarL3 = xh.l2(this.a);
                    a1 a1Var = (a1) ((Supplier) this.b.get()).get();
                    int i5 = 0;
                    while (true) {
                        int i6 = this.c;
                        ii0Var2 = this.d;
                        if (i5 >= i6) {
                            break;
                        }
                        double dA = a1Var.A(i5);
                        e33 e33Var = (e33) this.e.get(i5);
                        ii0Var2.getClass();
                        int i7 = e33Var.p.h;
                        if (this.f) {
                            dA = -dA;
                        }
                        xhVarL3.o(i7, dA);
                        i5++;
                    }
                    Iterator it2 = this.g.iterator();
                    while (it2.hasNext()) {
                        int i8 = ((lo2) it2.next()).h;
                        xhVarL3.o(i8, ei0.b(ii0Var2, i8, this.h));
                    }
                    return xhVarL3;
                }
            };
        }
        return gs1VarU1;
    }

    public static gs1 g(gs1 gs1Var, ii0 ii0Var, vh vhVar) {
        List listG = ii0Var.g();
        int size = listG.size();
        vhVar.getClass();
        xh xhVarL2 = xh.l2(size);
        for (int i = 0; i < size; i++) {
            xhVarL2.o(i, gs1Var.l.A(((e33) listG.get(i)).p.h));
        }
        return gs1Var.a1(xhVarL2);
    }

    public static void h(gs1 gs1Var, ii0 ii0Var) {
        int i = ii0Var.i;
        final boolean z = (gs1Var.m == is1.INFEASIBLE || i == 0 || 2 == i) ? false : true;
        final Supplier supplier = gs1Var.i;
        if (supplier != null) {
            final m00 m00Var = gs1Var.h;
            if (m00Var != null) {
                gs1Var.i = new Supplier() { // from class: es1
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ih0[] ih0VarArr;
                        a1 a1Var = (a1) supplier.get();
                        m00 m00Var2 = m00Var;
                        int i2 = m00Var2.m;
                        double[] dArr = new double[i2];
                        for (int i3 = 0; i3 < i2; i3++) {
                            double dA = (m00Var2.l || (ih0VarArr = m00Var2.i) == null || ih0VarArr[i3].j() != cs1.i) ? -a1Var.A(i3) : a1Var.A(i3);
                            if (z) {
                                dA = -dA;
                            }
                            dArr[i3] = dA;
                        }
                        return new xh(dArr);
                    }
                };
                if (m00Var.l) {
                    m00 m00Var2 = new m00(m00Var.m, m00Var.i, m00Var.k);
                    m00Var2.h.or(m00Var.h);
                    m00Var2.j = m00Var.j;
                    m00Var = m00Var2;
                }
                gs1Var.h = m00Var;
            } else {
                gs1Var.i = new Supplier() { // from class: fs1
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        a1 a1Var = (a1) supplier.get();
                        int size = a1Var.size();
                        double[] dArr = new double[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            dArr[i2] = z ? a1Var.A(i2) : -a1Var.A(i2);
                        }
                        return new xh(dArr);
                    }
                };
            }
            gs1Var.j = null;
        }
    }

    public abstract hs1 a(ii0 ii0Var);

    public int d(ii0 ii0Var, e33 e33Var) {
        return e33Var.p.h;
    }

    public abstract boolean e(ii0 ii0Var);

    public gs1 f(gs1 gs1Var, ii0 ii0Var) {
        if (gs1Var == null) {
            gs1Var = ii0Var.m();
        }
        return j(gs1Var, ii0Var);
    }

    public gs1 i(gs1 gs1Var, ii0 ii0Var) {
        return gs1Var;
    }

    public gs1 j(gs1 gs1Var, ii0 ii0Var) {
        return gs1Var;
    }
}
