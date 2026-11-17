package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class lz0 implements hs1 {
    public transient ei0 b;
    public final ii0 c;
    public transient gs1 d;
    public transient hs1 e;
    public boolean a = true;
    public final HashMap f = new HashMap();

    public lz0(ii0 ii0Var) {
        this.b = null;
        this.d = null;
        this.e = null;
        this.c = ii0Var;
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // defpackage.hs1
    public final void a() {
        j();
    }

    @Override // defpackage.hs1
    public final gs1 f(gs1 gs1Var) {
        hs1 hs1Var = this.e;
        ii0 ii0Var = this.c;
        if (hs1Var == null) {
            wk wkVar = ii0Var.b;
            ArrayList arrayList = ii0Var.o;
            if (((TreeSet) wkVar.k).size() > 0) {
                ii0Var.D();
            }
            if (!ii0Var.e) {
                Iterator it = ii0Var.c.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                e33 e33Var = (e33) obj;
                                BigDecimal bigDecimal = e33Var.j;
                                BigDecimal bigDecimal2 = e33Var.l;
                                if (bigDecimal != null && bigDecimal2 != null && bigDecimal.compareTo(bigDecimal2) > 0) {
                                    ii0Var.e = true;
                                    break;
                                }
                            } else if (arrayList.stream().anyMatch(new m5((byte) 8))) {
                                is1 is1Var = is1.UNBOUNDED;
                                if (gs1Var != null && ii0Var.H(gs1Var)) {
                                    return new gs1(is1Var, gs1Var.n, gs1Var);
                                }
                                gs1 gs1VarN = ii0Var.n();
                                if (gs1VarN.m.c()) {
                                    return new gs1(is1Var, gs1VarN.n, gs1VarN);
                                }
                            } else if (arrayList.stream().allMatch(new m5((byte) 7))) {
                                gs1 gs1VarN2 = ii0Var.n();
                                double d = gs1VarN2.n;
                                return gs1VarN2.m.c() ? new gs1(is1.DISTINCT, d, gs1VarN2) : new gs1(is1.INVALID, d, gs1VarN2);
                            }
                        }
                    } else if (((zh0) it.next()).V()) {
                        ii0Var.e = true;
                        break;
                    }
                }
            }
            if (gs1Var == null) {
                gs1Var = ii0Var.m();
            }
            return new gs1(is1.INFEASIBLE, gs1Var.n, gs1Var);
        }
        ei0 ei0VarH = h();
        gs1 gs1VarI = ei0VarH.i(i().f(ei0VarH.f(gs1Var, ii0Var)), ii0Var);
        this.d = gs1VarI;
        return gs1VarI;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048 A[PHI: r1
  0x0048: PHI (r1v6 sk) = (r1v4 sk), (r1v5 sk), (r1v7 sk) binds: [B:17:0x003e, B:19:0x0046, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    public final ei0 h() {
        ei0 ei0Var;
        sk skVar;
        ei0 ei0Var2 = this.b;
        if (ei0Var2 != null) {
            return ei0Var2;
        }
        ii0 ii0Var = this.c;
        ii0Var.getClass();
        ArrayList arrayList = (ArrayList) ii0Var.b.j;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                ei0Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            ei0Var = (ei0) obj;
        } while (!ei0Var.e(ii0Var));
        if (ei0Var == null) {
            if (ii0Var.v()) {
                skVar = zy0.r;
                if (!ii0Var.s()) {
                    ei0Var = skVar;
                }
            } else {
                skVar = r10.f;
                if (skVar.e(ii0Var)) {
                    ei0Var = skVar;
                } else {
                    skVar = da1.h;
                    if (skVar.e(ii0Var)) {
                        ei0Var = skVar;
                    }
                }
            }
        }
        if (ei0Var == null) {
            throw new a42("No solver integration available that can handle this model!", (byte) 0);
        }
        this.b = ei0Var;
        return ei0Var;
    }

    public final hs1 i() {
        if (this.e == null) {
            ei0 ei0VarH = h();
            ii0 ii0Var = this.c;
            this.e = ei0VarH.a(ii0Var);
            HashMap map = this.f;
            if (!map.isEmpty()) {
                hs1 hs1Var = this.e;
                if (hs1Var instanceof u23) {
                    u23 u23Var = (u23) hs1Var;
                    for (Map.Entry entry : map.entrySet()) {
                        int iD = h().d(ii0Var, ii0Var.k(((Integer) entry.getKey()).intValue()));
                        if (iD >= 0) {
                            double[] dArr = (double[]) entry.getValue();
                            u23Var.c(iD, dArr[0], dArr[1]);
                        }
                    }
                }
            }
        }
        return this.e;
    }

    public final void j() {
        this.d = null;
        this.f.clear();
        hs1 hs1Var = this.e;
        if (hs1Var != null) {
            hs1Var.a();
            this.e = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    public final void k(int i, double d, double d2) {
        this.f.put(Integer.valueOf(i), new double[]{d, d2});
        if (this.a) {
            hs1 hs1Var = this.e;
            if (hs1Var instanceof u23) {
                u23 u23Var = (u23) hs1Var;
                ii0 ii0Var = this.c;
                int iD = h().d(ii0Var, ii0Var.k(i));
                if (iD < 0) {
                    this.a = false;
                } else {
                    if (u23Var.c(iD, d, d2)) {
                        return;
                    }
                    gs1 gs1Var = this.d;
                    if (gs1Var == null || !gs1Var.m.b()) {
                        this.a = false;
                    }
                }
            }
        }
        this.e = null;
    }

    public final String toString() {
        return this.c.toString();
    }
}
