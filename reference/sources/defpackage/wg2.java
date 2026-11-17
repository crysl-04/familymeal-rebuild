package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wg2 {
    public final qg1 a;
    public final boolean b;
    public final l41 c;
    public final rg2 d;
    public wg2 e;
    public final int f;

    public wg2(qg1 qg1Var, boolean z, l41 l41Var, rg2 rg2Var) {
        this.a = qg1Var;
        this.b = z;
        this.c = l41Var;
        this.d = rg2Var;
        this.f = l41Var.i;
    }

    public static /* synthetic */ List j(int i, wg2 wg2Var) {
        return wg2Var.i((i & 1) != 0 ? !wg2Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [qg1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [qg1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final r72 a(pn1 pn1Var) {
        ?? R;
        wg2 wg2VarL = l();
        if (wg2VarL == null) {
            return r72.e;
        }
        qg1 qg1Var = wg2VarL.c.L.f;
        if ((qg1Var.k & 8) == 0) {
            R = 0;
            break;
        }
        loop0: while (true) {
            if (qg1Var != null) {
                if ((qg1Var.j & 8) != 0) {
                    R = qg1Var;
                    ?? uj1Var = 0;
                    while (R != 0) {
                        if (R instanceof ug2) {
                            if (((ug2) R).j()) {
                                break loop0;
                            }
                        } else if ((R.j & 8) != 0 && (R instanceof k80)) {
                            qg1 qg1Var2 = ((k80) R).w;
                            int i = 0;
                            while (qg1Var2 != null) {
                                if ((qg1Var2.j & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        R = R;
                                        uj1Var = uj1Var;
                                        uj1Var = uj1Var;
                                        R = qg1Var2;
                                    } else {
                                        if (uj1Var == 0) {
                                            uj1Var = new uj1(new qg1[16]);
                                        }
                                        if (R != 0) {
                                            uj1Var.b(R);
                                            R = 0;
                                        }
                                        uj1Var.b(qg1Var2);
                                    }
                                } else {
                                    R = R;
                                    uj1Var = uj1Var;
                                }
                                qg1Var2 = qg1Var2.m;
                                R = R;
                                uj1Var = uj1Var;
                            }
                            if (i != 1) {
                                R = R;
                                uj1Var = uj1Var;
                            } else {
                                R = R;
                                uj1Var = uj1Var;
                            }
                        }
                        R = cu.R(uj1Var);
                    }
                }
                if ((qg1Var.k & 8) != 0) {
                    qg1Var = qg1Var.m;
                }
            }
            R = 0;
            break;
        }
        ug2 ug2Var = (ug2) R;
        pn1 pn1VarW = ug2Var != null ? cu.W(ug2Var, 8) : null;
        return pn1VarW == null ? wg2VarL.a(pn1Var) : pn1VarW.M(pn1Var, true);
    }

    public final wg2 b(ba2 ba2Var, vp0 vp0Var) {
        rg2 rg2Var = new rg2();
        rg2Var.j = false;
        rg2Var.k = false;
        vp0Var.h(rg2Var);
        wg2 wg2Var = new wg2(new vg2(vp0Var), false, new l41(this.f + (ba2Var != null ? 1000000000 : 2000000000), true), rg2Var);
        wg2Var.e = this;
        return wg2Var;
    }

    public final void c(l41 l41Var, ArrayList arrayList) {
        uj1 uj1VarY = l41Var.y();
        Object[] objArr = uj1VarY.h;
        int i = uj1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            l41 l41Var2 = (l41) objArr[i2];
            if (l41Var2.I() && !l41Var2.U) {
                if (l41Var2.L.c(8)) {
                    arrayList.add(h12.d(l41Var2, this.b));
                } else {
                    c(l41Var2, arrayList);
                }
            }
        }
    }

    public final pn1 d() {
        if (!o()) {
            ug2 ug2VarF = f();
            return ug2VarF != null ? cu.W(ug2VarF, 8) : this.c.L.c;
        }
        wg2 wg2VarL = l();
        if (wg2VarL != null) {
            return wg2VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            wg2 wg2Var = (wg2) arrayList.get(size2);
            if (wg2Var.p()) {
                arrayList2.add(wg2Var);
            } else if (!wg2Var.d.k) {
                wg2Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [qg1] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [qg1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final ug2 f() {
        ?? R;
        boolean z;
        ?? r0;
        boolean z2 = this.d.j;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        l41 l41Var = this.c;
        if (!z2) {
            qg1 qg1Var = l41Var.L.f;
            if ((qg1Var.k & 8) != 0) {
                loop3: while (qg1Var != null) {
                    if ((qg1Var.j & 8) != 0) {
                        R = qg1Var;
                        ?? uj1Var = 0;
                        while (true) {
                            if (R != 0) {
                                if (R instanceof ug2) {
                                    if (((ug2) R).j()) {
                                        r4 = R;
                                    }
                                } else if ((R.j & 8) != 0 && (R instanceof k80)) {
                                    qg1 qg1Var2 = ((k80) R).w;
                                    int i = 0;
                                    while (qg1Var2 != null) {
                                        if ((qg1Var2.j & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                R = R;
                                                uj1Var = uj1Var;
                                                uj1Var = uj1Var;
                                                R = qg1Var2;
                                            } else {
                                                if (uj1Var == 0) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (R != 0) {
                                                    uj1Var.b(R);
                                                    R = 0;
                                                }
                                                uj1Var.b(qg1Var2);
                                            }
                                        } else {
                                            R = R;
                                            uj1Var = uj1Var;
                                        }
                                        qg1Var2 = qg1Var2.m;
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                    if (i != 1) {
                                        R = R;
                                        uj1Var = uj1Var;
                                    } else {
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                }
                                R = cu.R(uj1Var);
                            }
                        }
                    }
                    if ((qg1Var.k & 8) == 0) {
                        break;
                    }
                    qg1Var = qg1Var.m;
                }
            }
        } else {
            qg1 qg1Var3 = l41Var.L.f;
            if ((qg1Var3.k & 8) != 0) {
                R = 0;
                while (qg1Var3 != null) {
                    if ((qg1Var3.j & 8) != 0) {
                        qg1 qg1VarR = qg1Var3;
                        uj1 uj1Var2 = null;
                        while (qg1VarR != null) {
                            if (qg1VarR instanceof ug2) {
                                ug2 ug2Var = (ug2) qg1VarR;
                                if (ug2Var.j()) {
                                    if (ug2Var.l0()) {
                                        r0 = R;
                                        r0 = R;
                                        return ug2Var;
                                    }
                                    if (R == 0) {
                                        r0 = ug2Var;
                                    }
                                }
                                r0 = R;
                                z = false;
                                R = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                R = R;
                                if ((qg1VarR.j & 8) != 0 && (qg1VarR instanceof k80)) {
                                    int i2 = 0;
                                    for (qg1 qg1Var4 = ((k80) qg1VarR).w; qg1Var4 != null; qg1Var4 = qg1Var4.m) {
                                        if ((qg1Var4.j & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                qg1VarR = qg1Var4;
                                            } else {
                                                if (uj1Var2 == null) {
                                                    uj1Var2 = new uj1(new qg1[16]);
                                                }
                                                if (qg1VarR != null) {
                                                    uj1Var2.b(qg1VarR);
                                                    qg1VarR = null;
                                                }
                                                uj1Var2.b(qg1Var4);
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                            } else {
                                R = R;
                            }
                            qg1VarR = cu.R(uj1Var2);
                        }
                    }
                    if ((qg1Var3.k & 8) == 0) {
                        break;
                    }
                    qg1Var3 = qg1Var3.m;
                    R = R;
                }
                r4 = R;
            }
        }
        return (ug2) r4;
    }

    public final r72 g() {
        pn1 pn1VarD = d();
        if (pn1VarD != null) {
            if (!pn1VarD.V0().u) {
                pn1VarD = null;
            }
            if (pn1VarD != null) {
                return es.D(pn1VarD).M(pn1VarD, true);
            }
        }
        return r72.e;
    }

    public final r72 h() {
        pn1 pn1VarD = d();
        if (pn1VarD != null) {
            if (!pn1VarD.V0().u) {
                pn1VarD = null;
            }
            if (pn1VarD != null) {
                return es.s(pn1VarD, true);
            }
        }
        return r72.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.k) {
            return ag0.h;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return r(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final rg2 k() {
        boolean zP = p();
        rg2 rg2Var = this.d;
        if (!zP) {
            return rg2Var;
        }
        rg2 rg2Var2 = new rg2();
        rg2Var2.j = rg2Var.j;
        rg2Var2.k = rg2Var.k;
        rg2Var2.h.k(rg2Var.h);
        q(new ArrayList(), rg2Var2);
        return rg2Var2;
    }

    public final wg2 l() {
        l41 l41VarU;
        wg2 wg2Var = this.e;
        if (wg2Var != null) {
            return wg2Var;
        }
        l41 l41Var = this.c;
        boolean z = this.b;
        if (!z) {
            l41VarU = null;
            break;
        }
        l41VarU = l41Var.u();
        while (true) {
            if (l41VarU == null) {
                l41VarU = null;
                break;
            }
            rg2 rg2VarW = l41VarU.w();
            if (rg2VarW != null && rg2VarW.j) {
                break;
            }
            l41VarU = l41VarU.u();
        }
        if (l41VarU == null) {
            for (l41 l41VarU2 = l41Var.u(); l41VarU2 != null; l41VarU2 = l41VarU2.u()) {
                if (l41VarU2.L.c(8)) {
                    l41VarU = l41VarU2;
                }
            }
            l41VarU = null;
        }
        if (l41VarU == null) {
            return null;
        }
        return h12.d(l41VarU, z);
    }

    public final List m() {
        return j(4, this);
    }

    public final r72 n() {
        j80 j80VarF = f();
        if (j80VarF == null) {
            return this.c.L.c.s1();
        }
        qg1 qg1Var = ((qg1) j80VarF).h;
        Object objG = this.d.h.g(qg2.b);
        if (objG == null) {
            objG = null;
        }
        return y02.j(qg1Var, objG != null, true);
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.j;
    }

    public final void q(ArrayList arrayList, rg2 rg2Var) {
        if (this.d.k) {
            return;
        }
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            wg2 wg2Var = (wg2) arrayList.get(size2);
            if (!wg2Var.p()) {
                rg2Var.c(wg2Var.d);
                wg2Var.q(arrayList, rg2Var);
            }
        }
    }

    public final List r(ArrayList arrayList, boolean z) {
        if (o()) {
            return ag0.h;
        }
        c(this.c, arrayList);
        if (z) {
            rg2 rg2Var = this.d;
            mj1 mj1Var = rg2Var.h;
            Object objG = mj1Var.g(ah2.z);
            if (objG == null) {
                objG = null;
            }
            ba2 ba2Var = (ba2) objG;
            if (ba2Var != null && rg2Var.j && !arrayList.isEmpty()) {
                arrayList.add(b(ba2Var, new z61(ba2Var, (byte) 19)));
            }
            ch2 ch2Var = ah2.a;
            if (mj1Var.c(ch2Var) && !arrayList.isEmpty() && rg2Var.j) {
                Object objG2 = mj1Var.g(ch2Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) dv.y0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new ql(str, (byte) 27)));
                }
            }
        }
        return arrayList;
    }
}
