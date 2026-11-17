package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jg1 {
    public final short a;
    public final short b;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, short] */
    public jg1(long j, long j2) {
        this.a = (int) j;
        this.b = (int) j2;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x074e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d7  */
    public final sl2 a(bz1 bz1Var) {
        bg0 bg0Var;
        lz1 lz1Var;
        long j;
        lz1 lz1Var2;
        long j2;
        lh0 lh0Var;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Object obj;
        ArrayList arrayList2;
        int i;
        e33 e33VarB;
        long jNanoTime = System.nanoTime();
        sy1 sy1Var = new sy1(bz1Var);
        ArrayList arrayList3 = new ArrayList();
        ii0 ii0Var = new ii0();
        long j3 = this.a;
        ds1 ds1Var = ii0Var.a;
        ds1Var.h = j3;
        ds1Var.i = Math.min(this.b, j3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList4 = sy1Var.g;
        int size = arrayList4.size();
        int i2 = 0;
        while (true) {
            bg0Var = bg0.h;
            lz1Var = sy1Var.b;
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList4.get(i2);
            int i3 = i2 + 1;
            ek2 ek2Var = (ek2) obj2;
            Set set = (Set) bz1Var.g.get(ek2Var);
            if (set == null) {
                set = gg0.h;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            ArrayList arrayList5 = sy1Var.c;
            long j4 = jNanoTime;
            int size2 = arrayList5.size();
            int i4 = 0;
            while (i4 < size2) {
                size2 = size2;
                j62 j62Var = (j62) arrayList5.get(i4);
                i4++;
                String str = j62Var.a;
                boolean zContains = set.contains(str);
                if (zContains) {
                    arrayList2 = arrayList4;
                    te1 te1Var = ek2Var.b;
                    te1Var.getClass();
                    i = size;
                    if (j62Var.c.contains(te1Var)) {
                        Map map = (Map) lz1Var.a.get(ek2Var.b);
                        if (map == null) {
                            map = bg0Var;
                        }
                        if (map.containsKey(j62Var.d)) {
                            int i5 = i3;
                            StringBuilder sbL = wi0.l("x_", ek2Var.a.h, "_", ek2Var.b.h, "_");
                            sbL.append(str);
                            e33VarB = ii0Var.B(sbL.toString());
                            e33VarB.I(om.a);
                            e33VarB.L(om.b);
                            e33VarB.q = true;
                            if (zContains) {
                                e33VarB.w(1L);
                            }
                            linkedHashMap3.put(str, e33VarB);
                            arrayList4 = arrayList2;
                            size = i;
                            i3 = i5;
                        }
                    }
                    arrayList4 = arrayList2;
                    size = i;
                } else if (sy1Var.b(j62Var, ek2Var)) {
                    arrayList2 = arrayList4;
                    i = size;
                    int i6 = i3;
                    StringBuilder sbL2 = wi0.l("x_", ek2Var.a.h, "_", ek2Var.b.h, "_");
                    sbL2.append(str);
                    e33VarB = ii0Var.B(sbL2.toString());
                    e33VarB.I(om.a);
                    e33VarB.L(om.b);
                    e33VarB.q = true;
                    if (zContains) {
                        e33VarB.w(1L);
                    }
                    linkedHashMap3.put(str, e33VarB);
                    arrayList4 = arrayList2;
                    size = i;
                    i3 = i6;
                }
            }
            ArrayList arrayList6 = arrayList4;
            int i7 = size;
            int i8 = i3;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : set) {
                if (!linkedHashMap3.containsKey((String) obj3)) {
                    arrayList7.add(obj3);
                }
            }
            int size3 = arrayList7.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj4 = arrayList7.get(i9);
                i9++;
                arrayList3.add("locked " + ((String) obj4) + " cannot be used in " + ek2Var);
            }
            linkedHashMap2.put(ek2Var, linkedHashMap3);
            jNanoTime = j4;
            arrayList4 = arrayList6;
            size = i7;
            i2 = i8;
        }
        long j5 = jNanoTime;
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            tl2 tl2Var = tl2.j;
            LinkedHashMap linkedHashMap4 = sy1Var.d;
            if (!zHasNext) {
                Collection collectionValues = linkedHashMap2.values();
                collectionValues.getClass();
                ArrayList arrayList8 = new ArrayList();
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    Set setEntrySet = ((LinkedHashMap) it2.next()).entrySet();
                    setEntrySet.getClass();
                    iv.q0(setEntrySet, arrayList8);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                int size4 = arrayList8.size();
                int i10 = 0;
                while (i10 < size4) {
                    Object obj5 = arrayList8.get(i10);
                    i10++;
                    Map.Entry entry = (Map.Entry) obj5;
                    String str2 = (String) entry.getKey();
                    Object arrayList9 = linkedHashMap5.get(str2);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap5.put(str2, arrayList9);
                    }
                    ((List) arrayList9).add((e33) entry.getValue());
                }
                for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                    Object key = entry2.getKey();
                    key.getClass();
                    List list = (List) entry2.getValue();
                    if (!sy1Var.f((j62) ee1.J((String) key, linkedHashMap4)) && list.size() > lz1Var.b) {
                        zh0 zh0VarA = ii0Var.a();
                        zh0VarA.l = mg1.A(Integer.valueOf(lz1Var.b));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            zh0VarA.W((e33) it3.next(), 1L);
                        }
                    }
                }
                List listQ = lt.Q(te1.LUNCH, te1.DINNER);
                boolean z = lz1Var.d;
                wu wuVar = lz1Var.m;
                lh0 lh0Var2 = p60.p;
                if (z) {
                    Iterator it4 = listQ.iterator();
                    while (it4.hasNext()) {
                        te1 te1Var2 = (te1) it4.next();
                        int iA = lh0Var2.a() - 1;
                        int i11 = 0;
                        while (i11 < iA) {
                            List list2 = listQ;
                            LinkedHashMap linkedHashMap6 = (LinkedHashMap) linkedHashMap2.get(new ek2((p60) lh0Var2.get(i11), te1Var2));
                            if (linkedHashMap6 != null && (linkedHashMap = (LinkedHashMap) linkedHashMap2.get(new ek2((p60) lh0Var2.get(i11 + 1), te1Var2))) != null) {
                                for (Map.Entry entry3 : linkedHashMap6.entrySet()) {
                                    it4 = it4;
                                    String str3 = (String) entry3.getKey();
                                    wuVar = wuVar;
                                    e33 e33Var = (e33) entry3.getValue();
                                    LinkedHashMap linkedHashMap7 = linkedHashMap7;
                                    e33 e33Var2 = (e33) linkedHashMap7.get(str3);
                                    if (e33Var2 != null && !sy1Var.f((j62) ee1.J(str3, linkedHashMap4))) {
                                        zh0 zh0VarA2 = ii0Var.a();
                                        zh0VarA2.B(BigDecimal.valueOf(1L));
                                        zh0VarA2.W(e33Var, 1L);
                                        zh0VarA2.K(e33Var2.p, BigDecimal.valueOf(1L));
                                        te1Var2 = te1Var2;
                                        lh0Var2 = lh0Var2;
                                        iA = iA;
                                    }
                                }
                            }
                            i11++;
                            te1Var2 = te1Var2;
                            lh0Var2 = lh0Var2;
                            listQ = list2;
                            wuVar = wuVar;
                            it4 = it4;
                            iA = iA;
                        }
                    }
                }
                List list3 = listQ;
                wu wuVar2 = wuVar;
                lh0 lh0Var3 = lh0Var2;
                if (lz1Var.e) {
                    Iterator it5 = list3.iterator();
                    while (it5.hasNext()) {
                        te1 te1Var3 = (te1) it5.next();
                        int iD = sy1Var.d(te1Var3);
                        if (iD > 0) {
                            Set setKeySet = linkedHashMap2.keySet();
                            setKeySet.getClass();
                            ArrayList arrayList10 = new ArrayList();
                            for (Object obj6 : setKeySet) {
                                if (((ek2) obj6).b == te1Var3) {
                                    arrayList10.add(obj6);
                                }
                            }
                            int size5 = arrayList10.size();
                            int i12 = 0;
                            while (i12 < size5) {
                                int i13 = i12 + 1;
                                int size6 = arrayList10.size();
                                int i14 = i13;
                                while (i14 < size6) {
                                    Iterator it6 = it5;
                                    LinkedHashMap linkedHashMap8 = (LinkedHashMap) ee1.J(arrayList10.get(i12), linkedHashMap2);
                                    int i15 = size5;
                                    LinkedHashMap linkedHashMap9 = (LinkedHashMap) ee1.J(arrayList10.get(i14), linkedHashMap2);
                                    Set setKeySet2 = linkedHashMap8.keySet();
                                    setKeySet2.getClass();
                                    ArrayList arrayList11 = arrayList10;
                                    ArrayList arrayList12 = new ArrayList();
                                    for (Object obj7 : setKeySet2) {
                                        int i16 = i12;
                                        int i17 = i13;
                                        String str4 = (String) obj7;
                                        if (linkedHashMap9.containsKey(str4)) {
                                            str4.getClass();
                                            if (!sy1Var.f((j62) ee1.J(str4, linkedHashMap4))) {
                                                arrayList12.add(obj7);
                                            }
                                        }
                                        i12 = i16;
                                        i13 = i17;
                                    }
                                    int i18 = i12;
                                    int i19 = i13;
                                    if (arrayList12.size() >= iD) {
                                        zh0 zh0VarA3 = ii0Var.a();
                                        zh0VarA3.l = mg1.A(Integer.valueOf(iD - 1));
                                        int size7 = arrayList12.size();
                                        int i20 = 0;
                                        while (i20 < size7) {
                                            Object obj8 = arrayList12.get(i20);
                                            int i21 = i20 + 1;
                                            obj8.getClass();
                                            ArrayList arrayList13 = arrayList12;
                                            String str5 = (String) obj8;
                                            int i22 = size7;
                                            e33 e33Var3 = (e33) ii0Var.b().w(0L);
                                            lo2 lo2Var = e33Var3.p;
                                            e33Var3.B(BigDecimal.valueOf(1L));
                                            zh0 zh0Var = (zh0) ii0Var.a().w(-1L);
                                            zh0Var.K(lo2Var, BigDecimal.valueOf(1L));
                                            zh0Var.W((e33) ee1.J(str5, linkedHashMap8), -1L);
                                            zh0Var.W((e33) ee1.J(str5, linkedHashMap9), -1L);
                                            zh0VarA3.K(lo2Var, BigDecimal.valueOf(1L));
                                            linkedHashMap8 = linkedHashMap8;
                                            size7 = i22;
                                            arrayList12 = arrayList13;
                                            iD = iD;
                                            i20 = i21;
                                            i14 = i14;
                                        }
                                    }
                                    i14++;
                                    it5 = it6;
                                    size5 = i15;
                                    size6 = size6;
                                    arrayList10 = arrayList11;
                                    i12 = i18;
                                    i13 = i19;
                                    iD = iD;
                                }
                                i12 = i13;
                            }
                        }
                    }
                }
                for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                    ek2 ek2Var2 = (ek2) entry4.getKey();
                    LinkedHashMap linkedHashMap10 = (LinkedHashMap) entry4.getValue();
                    vp0 vp0VarC = sy1Var.c(ek2Var2);
                    if (vp0VarC != null) {
                        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                        for (Map.Entry entry5 : linkedHashMap10.entrySet()) {
                            if (((Boolean) vp0VarC.h((j62) ee1.J((String) entry5.getKey(), linkedHashMap4))).booleanValue()) {
                                linkedHashMap11.put(entry5.getKey(), entry5.getValue());
                            }
                        }
                        Collection collectionValues2 = linkedHashMap11.values();
                        if (collectionValues2.isEmpty()) {
                            arrayList3.add(ek2Var2.a.i + ek2Var2.b.i + ": 没有可用的鱼类菜，已跳过鱼类要求");
                        } else {
                            zh0 zh0VarA4 = ii0Var.a();
                            BigDecimal bigDecimalA = mg1.A(BigDecimal.valueOf(1L));
                            zh0VarA4.x(bigDecimalA);
                            zh0VarA4.B(bigDecimalA);
                            Iterator it7 = collectionValues2.iterator();
                            while (it7.hasNext()) {
                                zh0VarA4.W((e33) it7.next(), 1L);
                            }
                        }
                    }
                }
                if (lz1Var.j) {
                    ArrayList arrayList14 = sy1Var.h;
                    if (arrayList14.isEmpty()) {
                        j = -1;
                        lz1Var2 = lz1Var;
                        j2 = 1;
                    } else {
                        ArrayList arrayList15 = new ArrayList();
                        int size8 = arrayList14.size();
                        int i23 = 0;
                        while (i23 < size8) {
                            Object obj9 = arrayList14.get(i23);
                            i23++;
                            Map map2 = (Map) linkedHashMap2.get((ek2) obj9);
                            if (map2 == null) {
                                map2 = bg0Var;
                            }
                            iv.q0(map2.entrySet(), arrayList15);
                        }
                        int i24 = 0;
                        Class<sy1> cls = sy1.class;
                        lz1Var2 = lz1Var;
                        j = -1;
                        for (wt1 wt1Var : lt.Q(new wt1("鱼", new i(1, sy1Var, cls, "isFish", "isFish(Lcom/familymeal/core/model/Recipe;)Z", i24, (byte) 3)), new wt1("虾", new i(1, sy1Var, cls, "isShrimp", "isShrimp(Lcom/familymeal/core/model/Recipe;)Z", i24, (byte) 4)))) {
                            String str6 = (String) wt1Var.h;
                            vp0 vp0Var = (vp0) wt1Var.i;
                            ArrayList arrayList16 = new ArrayList();
                            int size9 = arrayList15.size();
                            int i25 = 0;
                            while (i25 < size9) {
                                Object obj10 = arrayList15.get(i25);
                                i25++;
                                if (((Boolean) vp0Var.h((j62) ee1.J((String) ((Map.Entry) obj10).getKey(), linkedHashMap4))).booleanValue()) {
                                    arrayList16.add(obj10);
                                }
                            }
                            ArrayList arrayList17 = new ArrayList(ev.o0(arrayList16, 10));
                            int size10 = arrayList16.size();
                            int i26 = 0;
                            while (i26 < size10) {
                                Object obj11 = arrayList16.get(i26);
                                i26++;
                                arrayList17.add((e33) ((Map.Entry) obj11).getValue());
                            }
                            if (arrayList17.isEmpty()) {
                                arrayList3.add("周末午餐没有可用的" + str6 + "类菜，已跳过该要求");
                            } else {
                                zh0 zh0VarA5 = ii0Var.a();
                                BigDecimal bigDecimalA2 = mg1.A(BigDecimal.valueOf(1L));
                                zh0VarA5.x(bigDecimalA2);
                                zh0VarA5.B(bigDecimalA2);
                                int size11 = arrayList17.size();
                                int i27 = 0;
                                while (i27 < size11) {
                                    Object obj12 = arrayList17.get(i27);
                                    i27++;
                                    zh0VarA5.W((e33) obj12, 1L);
                                }
                            }
                        }
                        j2 = 1;
                    }
                } else {
                    j = -1;
                    lz1Var2 = lz1Var;
                    j2 = 1;
                }
                double dDoubleValue = ((Number) wuVar2.a()).doubleValue();
                double dDoubleValue2 = ((Number) wuVar2.b()).doubleValue();
                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                Iterator it8 = bz1Var.c.iterator();
                while (true) {
                    boolean zHasNext2 = it8.hasNext();
                    long j6 = j2;
                    lh0Var = te1.o;
                    if (!zHasNext2) {
                        break;
                    }
                    rx1 rx1Var = (rx1) it8.next();
                    lh0Var3.getClass();
                    Iterator it9 = it8;
                    ii0 ii0Var2 = ii0Var;
                    z zVar = new z(lh0Var3, (byte) 0);
                    while (zVar.hasNext()) {
                        p60 p60Var = (p60) zVar.next();
                        z zVar2 = zVar;
                        bg0 bg0Var2 = bg0Var;
                        ArrayList arrayList18 = new ArrayList(ev.o0(lh0Var, 10));
                        for (z zVar3 = new z(lh0Var, (byte) 0); zVar3.hasNext(); zVar3 = zVar3) {
                            arrayList18.add(new ek2(p60Var, (te1) zVar3.next()));
                        }
                        ArrayList arrayList19 = new ArrayList();
                        int size12 = arrayList18.size();
                        lh0 lh0Var4 = lh0Var;
                        int i28 = 0;
                        while (i28 < size12) {
                            int i29 = size12;
                            Object obj13 = arrayList18.get(i28);
                            int i30 = i28 + 1;
                            ArrayList arrayList20 = arrayList18;
                            if (sy1Var.a((ek2) obj13).contains(rx1Var.a)) {
                                arrayList19.add(obj13);
                            }
                            size12 = i29;
                            arrayList18 = arrayList20;
                            i28 = i30;
                        }
                        ArrayList arrayList21 = new ArrayList();
                        int size13 = arrayList19.size();
                        int i31 = 0;
                        while (i31 < size13) {
                            Object obj14 = arrayList19.get(i31);
                            int i32 = i31 + 1;
                            ArrayList arrayList22 = arrayList19;
                            ek2 ek2Var3 = (ek2) obj14;
                            Map map3 = (Map) linkedHashMap2.get(ek2Var3);
                            if (map3 == null) {
                                map3 = bg0Var2;
                            }
                            int i33 = size13;
                            ArrayList arrayList23 = new ArrayList(map3.size());
                            Iterator it10 = map3.entrySet().iterator();
                            while (it10.hasNext()) {
                                Map.Entry entry6 = (Map.Entry) it10.next();
                                Iterator it11 = it10;
                                String str7 = (String) entry6.getKey();
                                LinkedHashMap linkedHashMap13 = linkedHashMap2;
                                e33 e33Var4 = (e33) entry6.getValue();
                                lh0 lh0Var5 = lh0Var3;
                                String str8 = rx1Var.a;
                                if (((Number) wuVar2.a()).doubleValue() == ((Number) wuVar2.b()).doubleValue() && ((Number) wuVar2.a()).doubleValue() == 1.0d) {
                                    dDoubleValue2 = dDoubleValue2;
                                    ek2Var3 = ek2Var3;
                                    arrayList21 = arrayList21;
                                    arrayList = arrayList3;
                                    p60Var = p60Var;
                                    linkedHashMap = linkedHashMap4;
                                } else {
                                    arrayList = arrayList3;
                                    linkedHashMap = linkedHashMap4;
                                    if (((j62) ee1.J(str7, linkedHashMap4)).d != zr.n) {
                                        dDoubleValue2 = dDoubleValue2;
                                        ek2Var3 = ek2Var3;
                                        arrayList21 = arrayList21;
                                        p60Var = p60Var;
                                    } else {
                                        q12 q12Var = new q12(ek2Var3, str8, str7);
                                        Object obj15 = linkedHashMap12.get(q12Var);
                                        if (obj15 == null) {
                                            e33 e33Var5 = (e33) ii0Var2.b().w(0L);
                                            lo2 lo2Var2 = e33Var5.p;
                                            e33Var5.B(mg1.z(dDoubleValue2));
                                            zh0 zh0VarA6 = ii0Var2.a();
                                            zh0VarA6.B(BigDecimal.valueOf(0L));
                                            zh0VarA6.K(lo2Var2, BigDecimal.valueOf(j6));
                                            zh0VarA6.K(e33Var4.p, mg1.z(-dDoubleValue2));
                                            zh0 zh0Var2 = (zh0) ii0Var2.a().w(0L);
                                            zh0Var2.K(lo2Var2, BigDecimal.valueOf(j6));
                                            zh0Var2.K(e33Var4.p, mg1.z(-dDoubleValue));
                                            linkedHashMap12.put(q12Var, e33Var5);
                                            obj = e33Var5;
                                        } else {
                                            obj = obj15;
                                        }
                                        e33Var4 = (e33) obj;
                                    }
                                }
                                arrayList23.add(new wt1(str7, e33Var4));
                                lh0Var3 = lh0Var5;
                                linkedHashMap2 = linkedHashMap13;
                                it10 = it11;
                                linkedHashMap4 = linkedHashMap;
                                arrayList3 = arrayList;
                                p60Var = p60Var;
                                ek2Var3 = ek2Var3;
                                arrayList21 = arrayList21;
                                dDoubleValue2 = dDoubleValue2;
                            }
                            iv.q0(arrayList23, arrayList21);
                            arrayList19 = arrayList22;
                            size13 = i33;
                            i31 = i32;
                            linkedHashMap2 = linkedHashMap2;
                        }
                        LinkedHashMap linkedHashMap14 = linkedHashMap2;
                        lh0 lh0Var6 = lh0Var3;
                        double d = dDoubleValue2;
                        ArrayList arrayList24 = arrayList21;
                        ArrayList arrayList25 = arrayList3;
                        p60 p60Var2 = p60Var;
                        LinkedHashMap linkedHashMap15 = linkedHashMap4;
                        if (!arrayList24.isEmpty()) {
                            e40 e40VarG = sy1Var.g(rx1Var, p60Var2);
                            lh0 lh0Var7 = zo1.n;
                            lh0Var7.getClass();
                            z zVar4 = new z(lh0Var7, (byte) 0);
                            while (zVar4.hasNext()) {
                                zo1 zo1Var = (zo1) zVar4.next();
                                ap1 ap1VarA = e40VarG.a(zo1Var);
                                lz1 lz1Var3 = lz1Var2;
                                Double d2 = (Double) lz1Var3.l.get(zo1Var);
                                double dDoubleValue3 = d2 != null ? d2.doubleValue() : 0.0d;
                                zh0 zh0VarA7 = ii0Var2.a();
                                zh0VarA7.x(mg1.z(ap1VarA.a));
                                int size14 = arrayList24.size();
                                int i34 = 0;
                                while (i34 < size14) {
                                    Object obj16 = arrayList24.get(i34);
                                    i34++;
                                    ArrayList arrayList26 = arrayList24;
                                    wt1 wt1Var2 = (wt1) obj16;
                                    double d3 = dDoubleValue;
                                    LinkedHashMap linkedHashMap16 = linkedHashMap15;
                                    zh0VarA7.K(((e33) wt1Var2.i).p, mg1.z(((j62) ee1.J((String) wt1Var2.h, linkedHashMap16)).b().a(zo1Var)));
                                    linkedHashMap15 = linkedHashMap16;
                                    e40VarG = e40VarG;
                                    dDoubleValue = d3;
                                    arrayList24 = arrayList26;
                                }
                                ArrayList arrayList27 = arrayList24;
                                e40 e40Var = e40VarG;
                                double d4 = dDoubleValue;
                                LinkedHashMap linkedHashMap17 = linkedHashMap15;
                                e33 e33Var6 = (e33) ii0Var2.b().w(0L);
                                e33Var6.D(mg1.z(dDoubleValue3));
                                zh0VarA7.K(e33Var6.p, BigDecimal.valueOf(j6));
                                if (ap1VarA.a()) {
                                    zh0VarA7.B(mg1.z(ap1VarA.b));
                                    e33 e33Var7 = (e33) ii0Var2.b().w(0L);
                                    e33Var7.D(mg1.z(dDoubleValue3));
                                    zh0VarA7.K(e33Var7.p, BigDecimal.valueOf(j));
                                }
                                linkedHashMap15 = linkedHashMap17;
                                lz1Var2 = lz1Var3;
                                e40VarG = e40Var;
                                dDoubleValue = d4;
                                arrayList24 = arrayList27;
                            }
                        }
                        zVar = zVar2;
                        bg0Var = bg0Var2;
                        lh0Var = lh0Var4;
                        lh0Var3 = lh0Var6;
                        linkedHashMap2 = linkedHashMap14;
                        linkedHashMap4 = linkedHashMap15;
                        arrayList3 = arrayList25;
                        dDoubleValue2 = d;
                    }
                    it8 = it9;
                    ii0Var = ii0Var2;
                    j2 = j6;
                }
                LinkedHashMap linkedHashMap18 = linkedHashMap2;
                lh0 lh0Var8 = lh0Var3;
                double d5 = dDoubleValue;
                double d6 = dDoubleValue2;
                lh0 lh0Var9 = lh0Var;
                ArrayList arrayList28 = arrayList3;
                bg0 bg0Var3 = bg0Var;
                long jNanoTime2 = (System.nanoTime() - j5) / 1000000;
                gs1 gs1VarZ = ii0Var.z();
                long jNanoTime3 = ((System.nanoTime() - j5) / 1000000) - jNanoTime2;
                is1 is1Var = gs1VarZ.m;
                if (is1Var.d()) {
                    tl2Var = tl2.h;
                } else if (is1Var.c()) {
                    tl2Var = tl2.i;
                } else if (is1Var != is1.INFEASIBLE) {
                    tl2Var = tl2.k;
                }
                tl2 tl2Var2 = tl2Var;
                if (!is1Var.c()) {
                    return new sl2(tl2Var2, null, null, (System.nanoTime() - j5) / 1000000, dv.E0(dv.J0(arrayList28, "求解器状态: " + is1Var), "; ", null, null, null, 62), jNanoTime2, jNanoTime3);
                }
                LinkedHashMap linkedHashMap19 = new LinkedHashMap();
                lh0Var8.getClass();
                byte b = 0;
                z zVar5 = new z(lh0Var8, b);
                while (zVar5.hasNext()) {
                    p60 p60Var3 = (p60) zVar5.next();
                    lh0Var9.getClass();
                    lh0 lh0Var10 = lh0Var9;
                    z zVar6 = new z(lh0Var10, b);
                    while (zVar6.hasNext()) {
                        ek2 ek2Var4 = new ek2(p60Var3, (te1) zVar6.next());
                        LinkedHashMap linkedHashMap20 = linkedHashMap18;
                        Map map4 = (Map) linkedHashMap20.get(ek2Var4);
                        if (map4 == null) {
                            map4 = bg0Var3;
                        }
                        LinkedHashMap linkedHashMap21 = new LinkedHashMap();
                        for (Map.Entry entry7 : map4.entrySet()) {
                            if (((e33) entry7.getValue()).E().doubleValue() > 0.5d) {
                                linkedHashMap21.put(entry7.getKey(), entry7.getValue());
                            }
                        }
                        linkedHashMap19.put(ek2Var4, dv.R0(linkedHashMap21.keySet()));
                        linkedHashMap18 = linkedHashMap20;
                    }
                    lh0Var9 = lh0Var10;
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                for (Map.Entry entry8 : linkedHashMap12.entrySet()) {
                    q12 q12Var2 = (q12) entry8.getKey();
                    List list4 = (List) linkedHashMap19.get(q12Var2.a);
                    if (list4 == null) {
                        list4 = ag0.h;
                    }
                    if (list4.contains(q12Var2.c)) {
                        linkedHashMap22.put(entry8.getKey(), entry8.getValue());
                    }
                }
                LinkedHashMap linkedHashMap23 = new LinkedHashMap(ee1.K(linkedHashMap22.size()));
                for (Map.Entry entry9 : linkedHashMap22.entrySet()) {
                    double d7 = d5;
                    linkedHashMap23.put(entry9.getKey(), Double.valueOf(cy1.l(Math.round(((e33) entry9.getValue()).E().doubleValue() * 20.0d) / 20.0d, d7, d6)));
                    d5 = d7;
                }
                c63 c63Var = new c63(linkedHashMap19, linkedHashMap23);
                return new sl2(tl2Var2, c63Var, Double.valueOf(new xl1(bz1Var).t(c63Var).a), (System.nanoTime() - j5) / 1000000, dv.E0(arrayList28, "; ", null, null, null, 62), jNanoTime2, jNanoTime3);
            }
            Map.Entry entry10 = (Map.Entry) it.next();
            ek2 ek2Var5 = (ek2) entry10.getKey();
            LinkedHashMap linkedHashMap24 = (LinkedHashMap) entry10.getValue();
            Map map5 = (Map) lz1Var.a.get(ek2Var5.b);
            if (map5 == null) {
                map5 = bg0Var;
            }
            for (Map.Entry entry11 : map5.entrySet()) {
                zr zrVar = (zr) entry11.getKey();
                qy0 qy0Var = (qy0) entry11.getValue();
                LinkedHashMap linkedHashMap25 = new LinkedHashMap();
                for (Map.Entry entry12 : linkedHashMap24.entrySet()) {
                    Iterator it12 = it;
                    if (((j62) ee1.J((String) entry12.getKey(), linkedHashMap4)).d == zrVar) {
                        linkedHashMap25.put(entry12.getKey(), entry12.getValue());
                        linkedHashMap24 = linkedHashMap24;
                    }
                    it = it12;
                }
                Iterator it13 = it;
                LinkedHashMap linkedHashMap26 = linkedHashMap24;
                Collection collectionValues3 = linkedHashMap25.values();
                int size15 = collectionValues3.size();
                int i35 = qy0Var.h;
                if (size15 < i35) {
                    long jNanoTime4 = (System.nanoTime() - j5) / 1000000;
                    StringBuilder sbL3 = wi0.l(ek2Var5.a.i, ek2Var5.b.i, ": 可选的「", zrVar.h, "」不足 ");
                    sbL3.append(i35);
                    sbL3.append(" 道");
                    return new sl2(tl2Var, null, null, jNanoTime4, sbL3.toString(), 0L, 0L);
                }
                if (!collectionValues3.isEmpty()) {
                    zh0 zh0VarA8 = ii0Var.a();
                    zh0VarA8.j = mg1.A(Integer.valueOf(i35));
                    zh0VarA8.l = mg1.A(Integer.valueOf(qy0Var.i));
                    Iterator it14 = collectionValues3.iterator();
                    while (it14.hasNext()) {
                        zh0VarA8.W((e33) it14.next(), 1L);
                    }
                }
                linkedHashMap24 = linkedHashMap26;
                it = it13;
            }
        }
    }
}
