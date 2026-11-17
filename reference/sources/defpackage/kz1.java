package defpackage;

import com.familymeal.app.data.db.AppDatabase;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 {
    public final AppDatabase a;
    public final yr b;
    public final tw1 c;

    public kz1(AppDatabase appDatabase, yr yrVar, tw1 tw1Var) {
        appDatabase.getClass();
        yrVar.getClass();
        tw1Var.getClass();
        this.a = appDatabase;
        this.b = yrVar;
        this.c = tw1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r11v0, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, short] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int, short] */
    public final Object a(LocalDate localDate, long j, long j2, n10 n10Var) {
        fz1 fz1Var;
        long j3;
        long j4;
        yy1 yy1Var;
        LocalDate localDate2 = localDate;
        if (n10Var instanceof fz1) {
            fz1Var = (fz1) n10Var;
            int i = fz1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                fz1Var.p = i - Integer.MIN_VALUE;
            } else {
                fz1Var = new fz1(this, n10Var);
            }
        } else {
            fz1Var = new fz1(this, n10Var);
        }
        fz1 fz1Var2 = fz1Var;
        Object obj = fz1Var2.n;
        int i2 = fz1Var2.p;
        Object obj2 = y20.h;
        if (i2 == 0) {
            m02.y(obj);
            fz1Var2.k = localDate2;
            fz1Var2.l = (int) j;
            j3 = j2;
            fz1Var2.m = (int) j3;
            fz1Var2.p = 1;
            Object objC = ia2.C(this.a, new gz1(this, localDate2, null), fz1Var2);
            if (objC != obj2) {
                j4 = j;
                obj = objC;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                m02.y(obj);
                return obj;
            }
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j3 = fz1Var2.m;
        j4 = fz1Var2.l;
        localDate2 = fz1Var2.k;
        m02.y(obj);
        ez1 ez1Var = (ez1) obj;
        Set<wt1> set = ez1Var != null ? ez1Var.c : null;
        if (set == null) {
            set = gg0.h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (wt1 wt1Var : set) {
            ek2 ek2Var = (ek2) wt1Var.h;
            Object obj3 = linkedHashMap.get(ek2Var);
            if (obj3 == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(ek2Var, arrayList);
                obj3 = arrayList;
            }
            ((List) obj3).add((String) wt1Var.i);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ee1.K(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), dv.U0((Iterable) entry.getValue()));
        }
        jg1 jg1Var = new jg1(j4, j3);
        String str = (ez1Var == null || (yy1Var = ez1Var.a) == null) ? null : yy1Var.a;
        fz1Var2.k = null;
        fz1Var2.l = (int) j4;
        fz1Var2.m = (int) j3;
        fz1Var2.p = 2;
        Object objC2 = c(localDate2, linkedHashMap2, bg0.h, set, jg1Var, str, fz1Var2);
        return objC2 == obj2 ? obj2 : objC2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object b(LocalDate localDate, ek2 ek2Var, String str, n10 n10Var) {
        hz1 hz1Var;
        ek2 ek2Var2;
        String str2;
        Object objC;
        LocalDate localDate2 = localDate;
        if (n10Var instanceof hz1) {
            hz1Var = (hz1) n10Var;
            int i = hz1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                hz1Var.p = i - Integer.MIN_VALUE;
            } else {
                hz1Var = new hz1(this, n10Var);
            }
        } else {
            hz1Var = new hz1(this, n10Var);
        }
        hz1 hz1Var2 = hz1Var;
        Object obj = hz1Var2.n;
        int i2 = hz1Var2.p;
        Object obj2 = y20.h;
        if (i2 == 0) {
            m02.y(obj);
            hz1Var2.k = localDate2;
            ek2Var2 = ek2Var;
            hz1Var2.l = ek2Var2;
            str2 = str;
            hz1Var2.m = str2;
            hz1Var2.p = 1;
            objC = ia2.C(this.a, new gz1(this, localDate2, null), hz1Var2);
            if (objC != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                m02.y(obj);
                return obj;
            }
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str3 = hz1Var2.m;
        ek2 ek2Var3 = hz1Var2.l;
        LocalDate localDate3 = hz1Var2.k;
        m02.y(obj);
        str2 = str3;
        localDate2 = localDate3;
        objC = obj;
        ek2Var2 = ek2Var3;
        ez1 ez1Var = (ez1) objC;
        if (ez1Var == null) {
            return new dz1("还没有本周食谱", false);
        }
        LinkedHashMap linkedHashMap = ez1Var.b.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ee1.K(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ek2 ek2Var4 = (ek2) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                String str4 = (String) obj3;
                if (!uz0.g(ek2Var4, ek2Var2) || !uz0.g(str4, str2)) {
                    arrayList.add(obj3);
                }
            }
            linkedHashMap2.put(key, dv.U0(arrayList));
        }
        Map mapSingletonMap = Collections.singletonMap(ek2Var2, r02.C(str2));
        mapSingletonMap.getClass();
        Set setH = ci2.H(ez1Var.c, new wt1(ek2Var2, str2));
        jg1 jg1Var = new jg1(10000L, 3000L);
        String str5 = ez1Var.a.a;
        hz1Var2.k = null;
        hz1Var2.l = null;
        hz1Var2.m = null;
        hz1Var2.p = 2;
        Object objC2 = c(localDate2, linkedHashMap2, mapSingletonMap, setH, jg1Var, str5, hz1Var2);
        return objC2 == obj2 ? obj2 : objC2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:31:0x0120  */
    /* JADX WARN: Code duplicated, block: B:33:0x012c  */
    /* JADX WARN: Code duplicated, block: B:35:0x012f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0136  */
    /* JADX WARN: Code duplicated, block: B:37:0x0139  */
    /* JADX WARN: Code duplicated, block: B:39:0x013f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0155  */
    /* JADX WARN: Code duplicated, block: B:45:0x015d  */
    /* JADX WARN: Code duplicated, block: B:48:0x016c  */
    /* JADX WARN: Code duplicated, block: B:52:0x017c A[LOOP:0: B:50:0x0176->B:52:0x017c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object c(LocalDate localDate, LinkedHashMap linkedHashMap, Map map, Set set, jg1 jg1Var, String str, n10 n10Var) {
        iz1 iz1Var;
        LinkedHashMap linkedHashMap2;
        Map map2;
        String str2;
        Object objC;
        LocalDate localDate2;
        jg1 jg1Var2;
        Set set2;
        LinkedHashMap linkedHashMap3;
        Map map3;
        List list;
        LocalDate localDate3;
        List list2;
        Set set3;
        String str3;
        jg1 jg1Var3;
        aw1 aw1Var;
        List<j62> list3;
        sl2 sl2VarA;
        String str4;
        c63 c63Var;
        String strE;
        int iK;
        LinkedHashMap linkedHashMap4;
        jz1 jz1Var;
        sl2 sl2Var;
        aw1 aw1Var2;
        String str5;
        int iOrdinal;
        String strConcat;
        String str6;
        ArrayList arrayList;
        if (n10Var instanceof iz1) {
            iz1Var = (iz1) n10Var;
            int i = iz1Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                iz1Var.w = i - Integer.MIN_VALUE;
            } else {
                iz1Var = new iz1(this, n10Var);
            }
        } else {
            iz1Var = new iz1(this, n10Var);
        }
        iz1 iz1Var2 = iz1Var;
        Object obj = iz1Var2.u;
        int i2 = iz1Var2.w;
        y20 y20Var = y20.h;
        if (i2 == 0) {
            m02.y(obj);
            iz1Var2.k = localDate;
            linkedHashMap2 = linkedHashMap;
            iz1Var2.l = linkedHashMap2;
            map2 = map;
            iz1Var2.m = map2;
            iz1Var2.n = set;
            iz1Var2.o = jg1Var;
            str2 = str;
            iz1Var2.p = str2;
            iz1Var2.w = 1;
            yr yrVar = this.b;
            objC = ia2.C(yrVar.a, new nr(yrVar, null), iz1Var2);
            if (objC != y20Var) {
                localDate2 = localDate;
                jg1Var2 = jg1Var;
                set2 = set;
            }
            return y20Var;
        }
        if (i2 == 1) {
            String str7 = iz1Var2.p;
            jg1 jg1Var4 = iz1Var2.o;
            set2 = iz1Var2.n;
            Map map4 = iz1Var2.m;
            LinkedHashMap linkedHashMap5 = iz1Var2.l;
            localDate2 = iz1Var2.k;
            m02.y(obj);
            objC = obj;
            jg1Var2 = jg1Var4;
            map2 = map4;
            str2 = str7;
            linkedHashMap2 = linkedHashMap5;
        } else {
            if (i2 == 2) {
                List list4 = iz1Var2.r;
                List list5 = iz1Var2.q;
                str3 = iz1Var2.p;
                jg1Var3 = iz1Var2.o;
                set3 = iz1Var2.n;
                Map map5 = iz1Var2.m;
                LinkedHashMap linkedHashMap6 = iz1Var2.l;
                localDate3 = iz1Var2.k;
                m02.y(obj);
                list = list4;
                list2 = list5;
                map3 = map5;
                linkedHashMap3 = linkedHashMap6;
                aw1Var = (aw1) obj;
                if (aw1Var.a.isEmpty()) {
                    return new dz1("没有可用的家人资料，请先在「家人」里补全身高体重或设置营养目标", false);
                }
                list3 = list2;
                sl2VarA = jg1Var3.a(new bz1(list2, list, aw1Var.a, aw1Var.b, localDate3.getMonthValue(), new lz1(), linkedHashMap3, map3));
                str4 = str3;
                c63Var = sl2VarA.b;
                if (c63Var == null) {
                    tl2 tl2Var = sl2VarA.a;
                    str5 = sl2VarA.e;
                    iOrdinal = tl2Var.ordinal();
                    if (iOrdinal != 2) {
                        if (co2.X(str5)) {
                            str5 = "可能是锁定的菜或规则互相冲突";
                        }
                        strConcat = "按当前规则排不出食谱：" + ((Object) str5);
                    } else if (iOrdinal != 3) {
                        strConcat = "生成失败：".concat(str5);
                    } else {
                        strConcat = "规定时间内没有找到可行方案，请重试";
                    }
                    return new dz1(strConcat, false);
                }
                if (str4 == null) {
                    strE = bh0.e("plan");
                } else {
                    strE = str4;
                }
                iK = ee1.K(ev.o0(list3, 10));
                if (iK < 16) {
                    iK = 16;
                }
                linkedHashMap4 = new LinkedHashMap(iK);
                for (j62 j62Var : list3) {
                    linkedHashMap4.put(j62Var.a, j62Var.b);
                }
                jz1Var = new jz1(this, strE, localDate3, sl2VarA, c63Var, linkedHashMap4, set3, aw1Var, null);
                iz1Var2.k = null;
                iz1Var2.l = null;
                iz1Var2.m = null;
                iz1Var2.n = null;
                iz1Var2.o = null;
                iz1Var2.p = null;
                iz1Var2.q = null;
                iz1Var2.r = null;
                iz1Var2.s = aw1Var;
                iz1Var2.t = sl2VarA;
                iz1Var2.w = 3;
                if (ia2.C(this.a, jz1Var, iz1Var2) != y20Var) {
                    sl2Var = sl2VarA;
                    aw1Var2 = aw1Var;
                }
                return y20Var;
            }
            if (i2 != 3) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sl2Var = iz1Var2.t;
            aw1Var2 = iz1Var2.s;
            Set set4 = iz1Var2.n;
            m02.y(obj);
        }
        str6 = sl2Var.e;
        if (co2.X(str6)) {
            str6 = null;
        }
        arrayList = aw1Var2.c;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new dz1(dv.E0(gi.W(new String[]{str6, arrayList != null ? "未参与（资料不完整）：".concat(dv.E0(arrayList, "、", null, null, null, 62)) : null}), "；", null, null, null, 62), true);
        wt1 wt1Var = (wt1) objC;
        List list6 = (List) wt1Var.h;
        List list7 = (List) wt1Var.i;
        iz1Var2.k = localDate2;
        iz1Var2.l = linkedHashMap2;
        iz1Var2.m = map2;
        iz1Var2.n = set2;
        iz1Var2.o = jg1Var2;
        iz1Var2.p = str2;
        iz1Var2.q = list6;
        iz1Var2.r = list7;
        iz1Var2.w = 2;
        tw1 tw1Var = this.c;
        Object objC2 = ia2.C(tw1Var.a, new lw1(tw1Var, null), iz1Var2);
        if (objC2 != y20Var) {
            linkedHashMap3 = linkedHashMap2;
            map3 = map2;
            list = list7;
            localDate3 = localDate2;
            list2 = list6;
            set3 = set2;
            str3 = str2;
            jg1Var3 = jg1Var2;
            obj = objC2;
            aw1Var = (aw1) obj;
            if (aw1Var.a.isEmpty()) {
                return new dz1("没有可用的家人资料，请先在「家人」里补全身高体重或设置营养目标", false);
            }
            list3 = list2;
            sl2VarA = jg1Var3.a(new bz1(list2, list, aw1Var.a, aw1Var.b, localDate3.getMonthValue(), new lz1(), linkedHashMap3, map3));
            str4 = str3;
            c63Var = sl2VarA.b;
            if (c63Var == null) {
                tl2 tl2Var2 = sl2VarA.a;
                str5 = sl2VarA.e;
                iOrdinal = tl2Var2.ordinal();
                if (iOrdinal != 2) {
                    if (co2.X(str5)) {
                        str5 = "可能是锁定的菜或规则互相冲突";
                    }
                    strConcat = "按当前规则排不出食谱：" + ((Object) str5);
                } else if (iOrdinal != 3) {
                    strConcat = "生成失败：".concat(str5);
                } else {
                    strConcat = "规定时间内没有找到可行方案，请重试";
                }
                return new dz1(strConcat, false);
            }
            if (str4 == null) {
                strE = bh0.e("plan");
            } else {
                strE = str4;
            }
            iK = ee1.K(ev.o0(list3, 10));
            if (iK < 16) {
                iK = 16;
            }
            linkedHashMap4 = new LinkedHashMap(iK);
            while (r0.hasNext()) {
                linkedHashMap4.put(j62Var.a, j62Var.b);
            }
            jz1Var = new jz1(this, strE, localDate3, sl2VarA, c63Var, linkedHashMap4, set3, aw1Var, null);
            iz1Var2.k = null;
            iz1Var2.l = null;
            iz1Var2.m = null;
            iz1Var2.n = null;
            iz1Var2.o = null;
            iz1Var2.p = null;
            iz1Var2.q = null;
            iz1Var2.r = null;
            iz1Var2.s = aw1Var;
            iz1Var2.t = sl2VarA;
            iz1Var2.w = 3;
            if (ia2.C(this.a, jz1Var, iz1Var2) != y20Var) {
                sl2Var = sl2VarA;
                aw1Var2 = aw1Var;
                str6 = sl2Var.e;
                if (co2.X(str6)) {
                    str6 = null;
                }
                arrayList = aw1Var2.c;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new dz1(dv.E0(gi.W(new String[]{str6, arrayList != null ? "未参与（资料不完整）：".concat(dv.E0(arrayList, "、", null, null, null, 62)) : null}), "；", null, null, null, 62), true);
            }
        }
        return y20Var;
    }
}
