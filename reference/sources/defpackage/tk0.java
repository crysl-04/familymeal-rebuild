package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tk0 extends co1 {
    public ArrayList n;
    public ii0 o;

    /* JADX WARN: Code duplicated, block: B:114:0x029d  */
    @Override // defpackage.co1
    public final int d(bj bjVar) {
        int i;
        zh0 zh0Var;
        BigDecimal bigDecimalO;
        List list;
        int i2;
        BigDecimal bigDecimal;
        BigDecimal bigDecimalO2;
        b(bjVar);
        gs1 gs1Var = (gs1) bjVar.d;
        ii0 ii0Var = (ii0) bjVar.c;
        if (this.n == null || this.o != ii0Var) {
            this.n = new ArrayList();
            this.o = ii0Var;
            List listUnmodifiableList = Collections.unmodifiableList(ii0Var.o);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (zh0 zh0Var2 : ii0Var.e()) {
                boolean zO = zh0Var2.o();
                HashMap map2 = zh0Var2.u;
                if (zO && !zh0Var2.U()) {
                    if (zh0Var2.p()) {
                        Iterator it = map2.keySet().iterator();
                        while (it.hasNext()) {
                            ((List) map.computeIfAbsent((lo2) it.next(), new j5((byte) 4))).add(zh0Var2);
                        }
                    } else if (zh0Var2.u() && map2.keySet().size() == 2) {
                        arrayList.add(zh0Var2);
                    }
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            HashMap map3 = new HashMap();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                zh0 zh0Var3 = (zh0) obj;
                BigDecimal bigDecimal2 = null;
                lo2 lo2Var = null;
                lo2 lo2Var2 = null;
                BigDecimal bigDecimal3 = null;
                for (Map.Entry entry : zh0Var3.u.entrySet()) {
                    ArrayList arrayList3 = arrayList;
                    lo2 lo2Var3 = (lo2) entry.getKey();
                    BigDecimal bigDecimal4 = (BigDecimal) entry.getValue();
                    int i4 = size;
                    if (((e33) listUnmodifiableList.get(lo2Var3.h)).F()) {
                        lo2Var2 = lo2Var3;
                        bigDecimal3 = bigDecimal4;
                    } else {
                        lo2Var = lo2Var3;
                        bigDecimal2 = bigDecimal4;
                    }
                    size = i4;
                    arrayList = arrayList3;
                }
                ArrayList arrayList4 = arrayList;
                int i5 = size;
                if (lo2Var != null && lo2Var2 != null) {
                    BigDecimal bigDecimal5 = zh0Var3.l;
                    if (bigDecimal5 == null) {
                        bigDecimal5 = BigDecimal.ZERO;
                    }
                    if (bigDecimal2.compareTo(BigDecimal.ONE) == 0 && bigDecimal3.signum() < 0 && bigDecimal5.signum() == 0) {
                        BigDecimal bigDecimalNegate = bigDecimal3.negate();
                        if (bigDecimalNegate.signum() > 0) {
                            hashSet.add(lo2Var);
                            arrayList2.add(new lo2[]{lo2Var, lo2Var2});
                            map3.put(lo2Var, bigDecimalNegate);
                        }
                    }
                }
                size = i5;
                arrayList = arrayList4;
            }
            boolean z = false;
            int size2 = arrayList2.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList2.get(i6);
                i6++;
                lo2[] lo2VarArr = (lo2[]) obj2;
                lo2 lo2Var4 = lo2VarArr[z ? 1 : 0];
                lo2 lo2Var5 = lo2VarArr[1];
                BigDecimal bigDecimal6 = (BigDecimal) map3.get(lo2Var4);
                if (bigDecimal6 != null) {
                    if (bigDecimal6.signum() > 0) {
                        List list2 = (List) map.get(lo2Var4);
                        if (list2 != null) {
                            if (!list2.isEmpty()) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        i = size2;
                                        zh0Var = null;
                                        bigDecimalO = null;
                                        break;
                                    }
                                    zh0Var = (zh0) it2.next();
                                    boolean z2 = z;
                                    bigDecimalO = zh0Var.O(lo2Var4, z2);
                                    if (bigDecimalO != null) {
                                        i = size2;
                                        if (bigDecimalO.abs().compareTo(BigDecimal.ONE) == 0 && ((bigDecimalO2 = zh0Var.O(lo2Var5, false)) == null || bigDecimalO2.signum() == 0)) {
                                            Iterator it3 = zh0Var.u.keySet().iterator();
                                            int i7 = 0;
                                            while (it3.hasNext()) {
                                                Iterator it4 = it3;
                                                if (hashSet.contains((lo2) it3.next())) {
                                                    i7++;
                                                }
                                                it3 = it4;
                                            }
                                            if (i7 >= 1) {
                                                break;
                                            }
                                        }
                                        size2 = i;
                                        z = false;
                                    } else {
                                        z = z2 ? 1 : 0;
                                    }
                                }
                                if (zh0Var != null) {
                                    BigDecimal bigDecimalNegate2 = zh0Var.j;
                                    BigDecimal bigDecimal7 = zh0Var.l;
                                    if (bigDecimalNegate2 == null || bigDecimal7 == null) {
                                        size2 = i;
                                    } else {
                                        if (bigDecimalO.signum() <= 0) {
                                            bigDecimalNegate2 = bigDecimalNegate2.negate();
                                        }
                                        if (bigDecimalNegate2.signum() > 0) {
                                            ArrayList arrayList5 = new ArrayList();
                                            ArrayList arrayList6 = new ArrayList();
                                            Iterator it5 = zh0Var.u.entrySet().iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    hashSet = hashSet;
                                                    list = listUnmodifiableList;
                                                    map = map;
                                                    i2 = i6;
                                                    if (bigDecimalNegate2.compareTo(bigDecimal6) >= 0) {
                                                        break;
                                                    }
                                                    this.n.add(new sk0(lo2Var4, lo2Var5, bigDecimalNegate2, arrayList5, arrayList6));
                                                    break;
                                                }
                                                Map.Entry entry2 = (Map.Entry) it5.next();
                                                hashSet = hashSet;
                                                lo2 lo2Var6 = (lo2) entry2.getKey();
                                                map = map;
                                                BigDecimal bigDecimal8 = (BigDecimal) entry2.getValue();
                                                if (!lo2Var6.equals(lo2Var4)) {
                                                    i2 = i6;
                                                    e33 e33Var = (e33) listUnmodifiableList.get(lo2Var6.h);
                                                    list = listUnmodifiableList;
                                                    if (e33Var.q || (bigDecimal = e33Var.j) == null || bigDecimal.signum() < 0) {
                                                        break;
                                                    }
                                                    if (bigDecimal8.signum() == bigDecimalO.signum()) {
                                                        arrayList5.add(new rk0(lo2Var6, bigDecimal8));
                                                    } else {
                                                        arrayList6.add(new rk0(lo2Var6, bigDecimal8));
                                                    }
                                                    i6 = i2;
                                                    listUnmodifiableList = list;
                                                }
                                            }
                                            size2 = i;
                                            hashSet = hashSet;
                                            map = map;
                                            i6 = i2;
                                            listUnmodifiableList = list;
                                        } else {
                                            size2 = i;
                                        }
                                    }
                                } else {
                                    size2 = i;
                                }
                            }
                        }
                    }
                }
                z = false;
            }
        }
        if (this.n.isEmpty()) {
            return 0;
        }
        ArrayList arrayList7 = this.n;
        int size3 = arrayList7.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj3 = arrayList7.get(i8);
            i8++;
            sk0 sk0Var = (sk0) obj3;
            lo2 lo2Var7 = sk0Var.d;
            ArrayList arrayList8 = sk0Var.b;
            ArrayList arrayList9 = sk0Var.c;
            lo2 lo2Var8 = sk0Var.e;
            BigDecimal bigDecimal9 = sk0Var.a;
            int i9 = lo2Var7.h;
            a1 a1Var = gs1Var.l;
            double dA = a1Var.A(i9);
            int i10 = lo2Var8.h;
            int i11 = lo2Var8.h;
            double dA2 = a1Var.A(i10);
            double dDoubleValue = bigDecimal9.doubleValue();
            double dA3 = dA - (dDoubleValue * dA2);
            int size4 = arrayList9.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList9.get(i12);
                i12++;
                gs1 gs1Var2 = gs1Var;
                rk0 rk0Var = (rk0) obj4;
                dA3 -= a1Var.A(rk0Var.b.h) * rk0Var.a.abs().doubleValue();
                arrayList7 = arrayList7;
                gs1Var = gs1Var2;
            }
            gs1 gs1Var3 = gs1Var;
            ArrayList arrayList10 = arrayList7;
            if (dA3 > 0.0d) {
                zh0 zh0VarF = f(bjVar);
                zh0VarF.E(sk0Var.d.h, BigDecimal.ONE);
                zh0VarF.E(i11, bigDecimal9.negate());
                int size5 = arrayList9.size();
                int i13 = 0;
                while (i13 < size5) {
                    Object obj5 = arrayList9.get(i13);
                    i13++;
                    rk0 rk0Var2 = (rk0) obj5;
                    zh0VarF.E(rk0Var2.b.h, rk0Var2.a.abs().negate());
                }
                zh0VarF.B(BigDecimal.ZERO);
                a(bjVar, zh0VarF);
            }
            double dA4 = (1.0d - dA2) * dDoubleValue;
            int size6 = arrayList8.size();
            int i14 = 0;
            while (i14 < size6) {
                Object obj6 = arrayList8.get(i14);
                i14++;
                rk0 rk0Var3 = (rk0) obj6;
                dA4 -= a1Var.A(rk0Var3.b.h) * rk0Var3.a.abs().doubleValue();
            }
            if (dA4 > 0.0d) {
                zh0 zh0VarF2 = f(bjVar);
                int size7 = arrayList8.size();
                int i15 = 0;
                while (i15 < size7) {
                    Object obj7 = arrayList8.get(i15);
                    i15++;
                    rk0 rk0Var4 = (rk0) obj7;
                    zh0VarF2.E(rk0Var4.b.h, rk0Var4.a.abs());
                }
                zh0VarF2.E(i11, bigDecimal9);
                zh0VarF2.x(bigDecimal9);
                a(bjVar, zh0VarF2);
            }
            arrayList7 = arrayList10;
            gs1Var = gs1Var3;
        }
        return c(bjVar);
    }

    @Override // defpackage.co1
    public final dz0 g() {
        return dz0.j;
    }
}
