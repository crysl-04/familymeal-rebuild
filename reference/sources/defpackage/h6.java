package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h6 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ h6(tk1 tk1Var, pk1 pk1Var, boolean z) {
        this.h = (byte) 23;
        this.i = tk1Var;
        this.j = pk1Var;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:194:0x040f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [qg1] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [qg1] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r6v40 */
    @Override // defpackage.kp0
    public final Object a() {
        wg2 wg2Var;
        l41 l41Var;
        r72 r72Var;
        List listI0;
        dk2 dk2VarC;
        String[] strArrNames;
        boolean z = false;
        boolean z2 = false;
        lp1 lp1Var = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        switch (this.h) {
            case 0:
                return Boolean.valueOf(t6.h((t6) this.i, (KeyEvent) this.j));
            case 1:
                vd2 vd2Var = (vd2) this.i;
                a7 a7Var = (a7) this.j;
                md2 md2Var = vd2Var.l;
                md2 md2Var2 = vd2Var.m;
                Float f = vd2Var.j;
                Float f2 = vd2Var.k;
                float fFloatValue = (md2Var == null || f == null) ? 0.0f : ((Number) md2Var.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (md2Var2 == null || f2 == null) ? 0.0f : ((Number) md2Var2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iV = a7Var.v(vd2Var.h);
                    yg2 yg2Var = (yg2) a7Var.n().b(a7Var.r);
                    if (yg2Var != null) {
                        try {
                            e2 e2Var = a7Var.t;
                            if (e2Var != null) {
                                e2Var.a.setBoundsInScreen(a7Var.f(yg2Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    yg2 yg2Var2 = (yg2) a7Var.n().b(a7Var.s);
                    if (yg2Var2 != null) {
                        try {
                            e2 e2Var2 = a7Var.u;
                            if (e2Var2 != null) {
                                e2Var2.a.setBoundsInScreen(a7Var.f(yg2Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    a7Var.k.invalidate();
                    yg2 yg2Var3 = (yg2) a7Var.n().b(iV);
                    if (yg2Var3 != null && (wg2Var = yg2Var3.a) != null && (l41Var = wg2Var.c) != null) {
                        if (md2Var != null) {
                            a7Var.w.h(iV, md2Var);
                        }
                        if (md2Var2 != null) {
                            a7Var.x.h(iV, md2Var2);
                        }
                        a7Var.r(l41Var);
                    }
                }
                if (md2Var != null) {
                    vd2Var.j = (Float) md2Var.a.a();
                }
                if (md2Var2 != null) {
                    vd2Var.k = (Float) md2Var2.a.a();
                }
                return j23.a;
            case 2:
                ((x72) this.i).h = ((kp0) this.j).a();
                return j23.a;
            case 3:
                ((ds) this.i).s(this.j);
                return j23.a;
            case 4:
                kl1 kl1Var = (kl1) this.i;
                String str = ((gr2) this.j).a;
                lg lgVar = new lg(kl1Var, (byte) 2);
                kl1Var.getClass();
                xk1 xk1Var = kl1Var.b;
                xk1Var.getClass();
                xk1Var.l(str, lt.T(lgVar));
                return j23.a;
            case 5:
                ij ijVar = (ij) this.i;
                n41 n41Var = (n41) this.j;
                ijVar.B = ijVar.w.a(n41Var.h.d(), n41Var.getLayoutDirection(), n41Var);
                return j23.a;
            case 6:
                vv2 vv2Var = (vv2) this.i;
                sj1 sj1Var = (sj1) this.j;
                if (!qw2.b(vv2Var.b, ((vv2) sj1Var.getValue()).b) || !uz0.g(vv2Var.c, ((vv2) sj1Var.getValue()).c)) {
                    sj1Var.setValue(vv2Var);
                }
                return j23.a;
            case 7:
                ie1.p((x20) this.i, null, new sl((ry2) this.j, z3 ? 1 : 0, z ? 1 : 0), 3);
                return Boolean.TRUE;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                kp0 kp0Var = (kp0) this.i;
                pn1 pn1Var = (pn1) this.j;
                if (kp0Var != null && (r72Var = (r72) kp0Var.a()) != null) {
                    return r72Var;
                }
                if (!pn1Var.V0().u) {
                    pn1Var = null;
                }
                if (pn1Var != null) {
                    return h12.b(0L, ou.G(pn1Var.j));
                }
                return null;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                ((yp) this.i).x.h((zp) this.j);
                return j23.a;
            case 10:
                ((vp0) this.i).h(this.j);
                return j23.a;
            case 11:
                mz mzVar = (mz) this.i;
                Object obj = this.j;
                dr0 dr0Var = mzVar.h;
                fk2 fk2Var = dr0Var.c;
                dk2 dk2VarC2 = fk2Var.c();
                int i = 0;
                while (true) {
                    try {
                        if (i < fk2Var.i) {
                            if (dk2VarC2.l(i)) {
                                Object objN = dk2VarC2.n(i);
                                if (objN != obj) {
                                    hr0 hr0Var = objN instanceof hr0 ? (hr0) objN : null;
                                    if ((hr0Var != null ? hr0Var.a : null) == obj) {
                                    }
                                }
                                lp1 lp1Var2 = new lp1(i, null);
                                dk2VarC2.c();
                                lp1Var = lp1Var2;
                                if (lp1Var != null) {
                                    int i2 = lp1Var.a;
                                    Integer num = lp1Var.b;
                                    dk2VarC = fk2Var.c();
                                    try {
                                        ArrayList arrayListL0 = cu.l0(dk2VarC, i2, num);
                                        dk2VarC.c();
                                        listI0 = dv.I0(arrayListL0, dr0Var.D());
                                    } catch (Throwable th) {
                                        dk2VarC.c();
                                        throw th;
                                    }
                                } else {
                                    listI0 = ag0.h;
                                }
                                return new py(listI0, dr0Var.C);
                            }
                            int[] iArr = dk2VarC2.b;
                            int i3 = i + 1;
                            int iD = (i3 < dk2VarC2.c ? iArr[(i3 * 5) + 4] : dk2VarC2.e) - hk2.d(iArr, i);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= iD) {
                                    i = i3;
                                } else {
                                    Object objH = dk2VarC2.h(i, i4);
                                    if (objH != obj) {
                                        hr0 hr0Var2 = objH instanceof hr0 ? (hr0) objH : null;
                                        if ((hr0Var2 != null ? hr0Var2.a : null) != obj) {
                                            i4++;
                                        }
                                    }
                                    lp1Var = new lp1(i, Integer.valueOf(i4));
                                }
                            }
                        }
                        dk2VarC2.c();
                        if (lp1Var != null) {
                            int i5 = lp1Var.a;
                            Integer num2 = lp1Var.b;
                            dk2VarC = fk2Var.c();
                            ArrayList arrayListL1 = cu.l0(dk2VarC, i5, num2);
                            dk2VarC.c();
                            listI0 = dv.I0(arrayListL1, dr0Var.D());
                        } else {
                            listI0 = ag0.h;
                        }
                        return new py(listI0, dr0Var.C);
                    } catch (Throwable th2) {
                        dk2VarC2.c();
                        throw th2;
                    }
                }
            case 12:
                return new ny0(lt.d0(((gt2) this.i).i((t31) ((kp0) this.j).a())));
            case 13:
                ((mt2) this.i).d.h((fl) this.j);
                return j23.a;
            case 14:
                ((ka0) this.i).e((pk1) this.j, false);
                return j23.a;
            case 15:
                ((x72) this.i).h = ((lm0) this.j).L0();
                return j23.a;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                ((x72) this.i).h = vs.z((pm0) this.j, ky1.a);
                return j23.a;
            case 17:
                ((gt0) this.i).d((qg1) this.j);
                return j23.a;
            case 18:
                lw0 lw0Var = (lw0) this.i;
                ((sj1) this.j).setValue(Boolean.FALSE);
                String str2 = lw0Var.c;
                if (str2 != null) {
                    ie1.p(h7.h0(lw0Var), null, new h(lw0Var, str2, z4 ? 1 : 0, (byte) 18), 3);
                }
                return j23.a;
            case 19:
                rh2 rh2Var = (rh2) this.i;
                c11 c11Var = (c11) this.j;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ia2.s(c11Var, rh2Var);
                int iD2 = rh2Var.d();
                for (int i6 = 0; i6 < iD2; i6++) {
                    List listI = rh2Var.i(i6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listI) {
                        if (obj2 instanceof w11) {
                            arrayList.add(obj2);
                        }
                    }
                    w11 w11Var = (w11) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (w11Var != null && (strArrNames = w11Var.names()) != null) {
                        for (String str3 : strArrNames) {
                            String str4 = uz0.g(rh2Var.c(), vh2.i) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str3)) {
                                throw new l11(lt.z(-1, "The suggested name '" + str3 + "' for " + str4 + ' ' + rh2Var.e(i6) + " is already one of the names for " + str4 + ' ' + rh2Var.e(((Number) ee1.J(str3, linkedHashMap)).intValue()) + " in " + rh2Var, null, null, null));
                            }
                            linkedHashMap.put(str3, Integer.valueOf(i6));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? bg0.h : linkedHashMap;
            case 20:
                l41 l41Var2 = (l41) this.i;
                x72 x72Var = (x72) this.j;
                ln1 ln1Var = l41Var2.L;
                if ((ln1Var.f.k & 8) != 0) {
                    for (qg1 qg1Var = ln1Var.e; qg1Var != null; qg1Var = qg1Var.l) {
                        if ((qg1Var.j & 8) != 0) {
                            ?? R = qg1Var;
                            ?? uj1Var = 0;
                            while (R != 0) {
                                if (R instanceof ug2) {
                                    ug2 ug2Var = (ug2) R;
                                    if (ug2Var.k0()) {
                                        rg2 rg2Var = new rg2();
                                        x72Var.h = rg2Var;
                                        rg2Var.k = true;
                                    }
                                    if (ug2Var.l0()) {
                                        ((rg2) x72Var.h).j = true;
                                    }
                                    ug2Var.h0((dh2) x72Var.h);
                                } else if ((R.j & 8) != 0 && (R instanceof k80)) {
                                    qg1 qg1Var2 = ((k80) R).w;
                                    int i7 = 0;
                                    while (qg1Var2 != null) {
                                        if ((qg1Var2.j & 8) != 0) {
                                            i7++;
                                            if (i7 == 1) {
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
                                    if (i7 != 1) {
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
                }
                return j23.a;
            case 21:
                o90 o90Var = (o90) this.i;
                c61 c61Var = (c61) this.j;
                j51 j51Var = (j51) o90Var.getValue();
                return new l51(c61Var, j51Var, new u8((qy0) c61Var.d.f.getValue(), j51Var));
            case 22:
                return new d81((qb2) this.i, bg0.h, (pb2) this.j);
            case 23:
                tk1 tk1Var = (tk1) this.i;
                pk1 pk1Var = (pk1) this.j;
                pk1Var.getClass();
                synchronized (tk1Var.a) {
                    nn2 nn2Var = tk1Var.b;
                    Iterable iterable = (Iterable) nn2Var.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (uz0.g((pk1) obj3, pk1Var)) {
                            nn2Var.i(null, arrayList2);
                        } else {
                            arrayList2.add(obj3);
                        }
                    }
                    nn2Var.i(null, arrayList2);
                }
                return j23.a;
            case 24:
                ll1 ll1Var = (ll1) this.i;
                sj1 sj1Var2 = (sj1) this.j;
                ll1Var.f(((List) sj1Var2.getValue()).size() > 1);
                qk1 qk1Var = new qk1((pk1) dv.G0((List) sj1Var2.getValue()));
                List list = (List) sj1Var2.getValue();
                list.getClass();
                int size = list.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                List listK0 = dv.K0(dv.N0(list, size));
                ArrayList arrayList3 = new ArrayList(listK0.size());
                int size2 = listK0.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    arrayList3.add(new qk1((pk1) listK0.get(i8)));
                }
                ag0 ag0Var = ag0.h;
                ll1Var.a = qk1Var;
                ll1Var.b = arrayList3;
                ll1Var.c = ag0Var;
                wk wkVar = ll1Var.e;
                if (wkVar != null) {
                    ((om1) wkVar.j).d(ll1Var);
                }
                return j23.a;
            case 25:
                eg egVar = (eg) this.i;
                f72 f72Var = (f72) this.j;
                if (((ji) egVar.i).get() == 0) {
                    f72Var.a();
                }
                return j23.a;
            case 26:
                ay1 ay1Var = (ay1) this.i;
                ((sj1) this.j).setValue(Boolean.FALSE);
                String str5 = ay1Var.d;
                if (str5 != null) {
                    ie1.p(h7.h0(ay1Var), null, new zx1(ay1Var, str5, z5 ? 1 : 0, z2 ? 1 : 0), 3);
                }
                return j23.a;
            case 27:
                ((vp0) this.i).h((String) this.j);
                return j23.a;
            case 28:
                x62 x62Var = (x62) this.i;
                ((sj1) this.j).setValue(Boolean.FALSE);
                String str6 = x62Var.c;
                if (str6 != null) {
                    ie1.p(h7.h0(x62Var), null, new h(x62Var, str6, z6 ? 1 : 0, (byte) 27), 3);
                }
                return j23.a;
            default:
                x62 x62Var2 = (x62) this.i;
                String str7 = (String) this.j;
                str7.getClass();
                x62Var2.l.setValue(x62Var2.f().contains(str7) ? ci2.H(x62Var2.f(), str7) : ci2.I(x62Var2.f(), str7));
                return j23.a;
        }
    }

    public /* synthetic */ h6(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }
}
