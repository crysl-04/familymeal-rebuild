package defpackage;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fk {
    public static final fk a = new fk();
    public static final t11 b;
    public static final t11 c;
    public static final t11 d;

    static {
        s0 s0Var = new s0((byte) 13);
        b11 b11Var = c11.d;
        t11 t11VarG = cu.g(b11Var, s0Var);
        b = t11VarG;
        c = cu.g(t11VarG, new s0((byte) 14));
        d = cu.g(b11Var, new s0((byte) 15));
    }

    public static gk a(String str, LocalDate localDate) {
        OffsetDateTime offsetDateTimeNow;
        OffsetDateTime offsetDateTime;
        List list;
        Set setU0;
        ArrayList arrayList;
        Iterator it;
        yy yyVar;
        p60 p60VarI;
        te1 te1VarJ;
        wt1 wt1Var;
        LocalDate localDate2;
        ArrayList arrayList2;
        u63 u63Var;
        Iterator it2;
        ir0 ir0VarValueOf;
        i3 i3VarValueOf;
        as0 as0VarValueOf;
        lt1 lt1VarValueOf;
        LocalDate localDate3;
        e40 e40Var;
        dy1 dy1Var;
        e40 e40Var2;
        zr zrVarK;
        cf2 cf2VarY;
        j62 j62Var;
        int i;
        int i2;
        te1 te1VarJ2;
        LocalDate localDate4 = localDate;
        str.getClass();
        localDate4.getClass();
        if (str.length() > 5242880) {
            throw new g40(lt.P("文件太大（超过 5 MB），不是有效的备份"));
        }
        try {
            bk bkVar = (bk) d.a(bk.Companion.serializer(), str);
            if (!uz0.g(bkVar.a, "meal-planner-backup")) {
                throw new g40(lt.P("不是家庭食谱的备份文件"));
            }
            int i3 = bkVar.b;
            if (i3 > 1) {
                throw new g40(lt.P("备份来自更新版本的应用（格式 " + i3 + "），请先升级应用"));
            }
            if (i3 < 1) {
                throw new g40(lt.P("备份格式版本无效"));
            }
            try {
                yj yjVar = (yj) b.a(yj.Companion.serializer(), str);
                b33 b33Var = new b33();
                ArrayList arrayList3 = b33Var.a;
                int year = localDate4.getYear();
                try {
                    offsetDateTimeNow = OffsetDateTime.parse(yjVar.c);
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        yyVar = te1.j;
                        if (!zHasNext) {
                            break;
                        }
                        q62 q62Var = (q62) it.next();
                        Iterator it3 = it;
                        String str2 = q62Var.b;
                        List<String> list2 = q62Var.c;
                        List list3 = q62Var.i;
                        String strH = wi0.h("菜谱「", co2.f0(20, str2), "」");
                        if (dv.U0(list3).size() != list3.size()) {
                            arrayList3.add(strH.concat("：标签重复"));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (String str3 : list2) {
                            OffsetDateTime offsetDateTime2 = offsetDateTime;
                            String strConcat = strH.concat(" 餐次");
                            try {
                                yyVar.getClass();
                                te1VarJ2 = yy.j(str3);
                            } catch (IllegalArgumentException unused) {
                                arrayList3.add(strConcat.concat(" 无效"));
                                te1VarJ2 = null;
                            }
                            if (te1VarJ2 != null) {
                                arrayList4.add(te1VarJ2);
                            }
                            offsetDateTime = offsetDateTime2;
                        }
                        OffsetDateTime offsetDateTime3 = offsetDateTime;
                        Set setU1 = dv.U0(arrayList4);
                        if (setU1.size() != list2.size()) {
                            arrayList3.add(strH.concat("：餐次重复或无效"));
                        }
                        String strConcat2 = strH.concat(" 类别");
                        try {
                            vz1 vz1Var = zr.i;
                            String str4 = q62Var.d;
                            vz1Var.getClass();
                            zrVarK = vz1.k(str4);
                        } catch (IllegalArgumentException unused2) {
                            arrayList3.add(strConcat2.concat(" 无效"));
                            zrVarK = null;
                        }
                        String strConcat3 = strH.concat(" 季节");
                        try {
                            jy1 jy1Var = cf2.i;
                            String str5 = q62Var.j;
                            jy1Var.getClass();
                            cf2VarY = jy1.y(str5);
                        } catch (IllegalArgumentException unused3) {
                            arrayList3.add(strConcat3.concat(" 无效"));
                            cf2VarY = null;
                        }
                        b33Var.b(q62Var.e, 1, 20, strH.concat(" 基准份数"));
                        b33Var.b(q62Var.f, 1, 20, strH.concat(" 最少用餐人数"));
                        if (zrVarK != null && cf2VarY != null && (i = q62Var.e) >= 1 && (i2 = q62Var.f) >= 1) {
                            String str6 = q62Var.a;
                            String str7 = q62Var.b;
                            List list4 = q62Var.g;
                            ArrayList arrayList5 = new ArrayList(ev.o0(list4, 10));
                            Iterator it4 = list4.iterator();
                            while (it4.hasNext()) {
                                c72 c72Var = (c72) it4.next();
                                arrayList5.add(new z62(c72Var.a, c72Var.b));
                                it4 = it4;
                                str6 = str6;
                                str7 = str7;
                            }
                            ep1 ep1Var = q62Var.h;
                            j62Var = new j62(str6, str7, setU1, zrVarK, i, i2, arrayList5, new bp1(ep1Var.a, ep1Var.b, ep1Var.c, ep1Var.d, ep1Var.e), dv.U0(list3), cf2VarY, q62Var.k);
                            ListIterator listIterator = bh0.g(j62Var, setU0).listIterator(0);
                            while (true) {
                                ht0 ht0Var = (ht0) listIterator;
                                if (!ht0Var.hasNext()) {
                                    break;
                                }
                                arrayList3.add(strH + "：" + ((m32) ht0Var.next()).b);
                            }
                        } else {
                            j62Var = null;
                        }
                        if (j62Var != null) {
                            arrayList.add(j62Var);
                        }
                        it = it3;
                        b33Var = b33Var;
                        list = list;
                        offsetDateTime = offsetDateTime3;
                    }
                } catch (DateTimeParseException unused4) {
                    arrayList3.add("导出时间格式无效");
                    offsetDateTimeNow = OffsetDateTime.now();
                }
                offsetDateTime = offsetDateTimeNow;
                List list5 = yjVar.e;
                boolean z = yjVar.d;
                list = yjVar.h;
                List list6 = yjVar.g;
                List list7 = yjVar.f;
                b33Var.b(list5.size(), 1, 2000, "食材数量");
                b33Var.b(list7.size(), 0, 2000, "菜谱数量");
                b33Var.b(list6.size(), 0, 20, "家人数量");
                b33Var.b(list.size(), 0, 20000, "体重记录数量");
                ArrayList arrayList6 = new ArrayList(ev.o0(list5, 10));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((bw0) it5.next()).a);
                }
                if (dv.U0(arrayList6).size() != list5.size()) {
                    arrayList3.add("食材编号重复");
                }
                ArrayList arrayList7 = new ArrayList(ev.o0(list7, 10));
                Iterator it6 = list7.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(((q62) it6.next()).a);
                }
                if (dv.U0(arrayList7).size() != list7.size()) {
                    arrayList3.add("菜谱编号重复");
                }
                ArrayList arrayList8 = new ArrayList(ev.o0(list6, 10));
                Iterator it7 = list6.iterator();
                while (it7.hasNext()) {
                    arrayList8.add(((vj) it7.next()).a);
                }
                if (dv.U0(arrayList8).size() != list6.size()) {
                    arrayList3.add("家人编号重复");
                }
                List list8 = list6;
                ArrayList arrayList9 = new ArrayList(ev.o0(list5, 10));
                Iterator it8 = list5.iterator();
                while (it8.hasNext()) {
                    bw0 bw0Var = (bw0) it8.next();
                    String str8 = bw0Var.a;
                    String str9 = bw0Var.b;
                    List list9 = list8;
                    String str10 = bw0Var.c;
                    ep1 ep1Var2 = bw0Var.d;
                    Iterator it9 = it8;
                    boolean z2 = z;
                    uv0 uv0Var = new uv0(str8, str9, str10, new bp1(ep1Var2.a, ep1Var2.b, ep1Var2.c, ep1Var2.d, ep1Var2.e));
                    ListIterator listIterator2 = bh0.c(uv0Var).listIterator(0);
                    while (true) {
                        ht0 ht0Var2 = (ht0) listIterator2;
                        if (ht0Var2.hasNext()) {
                            m32 m32Var = (m32) ht0Var2.next();
                            arrayList3.add("食材「" + co2.f0(20, str9) + "」：" + m32Var.b);
                        }
                    }
                    arrayList9.add(uv0Var);
                    list8 = list9;
                    z = z2;
                    it8 = it9;
                }
                List list10 = list8;
                boolean z3 = z;
                ArrayList arrayList10 = new ArrayList(ev.o0(arrayList9, 10));
                int size = arrayList9.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList9.get(i4);
                    i4++;
                    arrayList10.add(((uv0) obj).a);
                }
                setU0 = dv.U0(arrayList10);
                arrayList = new ArrayList();
                it = list7.iterator();
                b33 b33Var2 = b33Var;
                OffsetDateTime offsetDateTime4 = offsetDateTime;
                List<ek> list11 = list;
                ArrayList arrayList11 = new ArrayList();
                Iterator it10 = list10.iterator();
                while (it10.hasNext()) {
                    vj vjVar = (vj) it10.next();
                    String str11 = vjVar.b;
                    List list12 = vjVar.g;
                    String strH2 = wi0.h("家人「", co2.f0(20, str11), "」");
                    if (!z3) {
                        it2 = it10;
                        List listQ = lt.Q(vjVar.h, vjVar.i, vjVar.j, vjVar.k, vjVar.l, vjVar.m, vjVar.n);
                        if (!listQ.isEmpty()) {
                            Iterator it11 = listQ.iterator();
                            while (it11.hasNext()) {
                                if (it11.next() != null) {
                                    arrayList3.add(strH2.concat("：文件标明不含身体数据，却包含身体数据，可能被修改过"));
                                    break;
                                }
                            }
                        }
                    } else {
                        it2 = it10;
                    }
                    String strConcat4 = strH2.concat(" 性别");
                    try {
                        ir0VarValueOf = ir0.valueOf(vjVar.c);
                    } catch (IllegalArgumentException unused5) {
                        arrayList3.add(strConcat4.concat(" 无效"));
                        ir0VarValueOf = null;
                    }
                    String strConcat5 = strH2.concat(" 活动水平");
                    try {
                        i3VarValueOf = i3.valueOf(vjVar.d);
                    } catch (IllegalArgumentException unused6) {
                        arrayList3.add(strConcat5.concat(" 无效"));
                        i3VarValueOf = null;
                    }
                    String strConcat6 = strH2.concat(" 目标");
                    try {
                        as0VarValueOf = as0.valueOf(vjVar.e);
                    } catch (IllegalArgumentException unused7) {
                        arrayList3.add(strConcat6.concat(" 无效"));
                        as0VarValueOf = null;
                    }
                    String strConcat7 = strH2.concat(" 减重速度");
                    try {
                        lt1VarValueOf = lt1.valueOf(vjVar.f);
                    } catch (IllegalArgumentException unused8) {
                        arrayList3.add(strConcat7.concat(" 无效"));
                        lt1VarValueOf = null;
                    }
                    String str12 = vjVar.n;
                    if (str12 != null) {
                        try {
                            localDate3 = LocalDate.parse(str12);
                        } catch (DateTimeParseException unused9) {
                            arrayList3.add(strH2.concat("：调整日期无效"));
                            localDate3 = null;
                        }
                    } else {
                        localDate3 = null;
                    }
                    if (localDate3 != null && localDate3.isAfter(localDate4)) {
                        arrayList3.add(strH2.concat("：调整日期晚于今天"));
                    }
                    vs2 vs2Var = vjVar.l;
                    if (vs2Var != null) {
                        q52 q52Var = vs2Var.a;
                        q52 q52Var2 = vs2Var.b;
                        q52 q52Var3 = vs2Var.c;
                        q52 q52Var4 = vs2Var.d;
                        q52 q52Var5 = vs2Var.e;
                        List listQ2 = lt.Q(q52Var, q52Var2, q52Var3, q52Var4, q52Var5);
                        if (listQ2.isEmpty()) {
                            e40Var2 = new e40(c(q52Var), c(q52Var2), c(q52Var3), c(q52Var4), c(q52Var5));
                        } else {
                            Iterator it12 = listQ2.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    q52 q52Var6 = q52Var2;
                                    q52 q52Var7 = (q52) it12.next();
                                    q52 q52Var8 = q52Var3;
                                    q52 q52Var9 = q52Var5;
                                    double d2 = q52Var7.a;
                                    Double d3 = q52Var7.b;
                                    if (Math.abs(d2) > Double.MAX_VALUE || d2 < 0.0d || (d3 != null && (Math.abs(d3.doubleValue()) > Double.MAX_VALUE || d3.doubleValue() < d2))) {
                                        arrayList3.add(strH2.concat("：手动目标数值无效"));
                                        e40Var2 = null;
                                    } else {
                                        q52Var3 = q52Var8;
                                        q52Var2 = q52Var6;
                                        q52Var5 = q52Var9;
                                    }
                                } else {
                                    e40Var2 = new e40(c(q52Var), c(q52Var2), c(q52Var3), c(q52Var4), c(q52Var5));
                                }
                            }
                        }
                        e40Var = e40Var2;
                    } else {
                        e40Var = null;
                    }
                    if (ir0VarValueOf == null || i3VarValueOf == null || as0VarValueOf == null || lt1VarValueOf == null) {
                        dy1Var = null;
                    } else {
                        String str13 = vjVar.a;
                        String str14 = vjVar.b;
                        Integer num = vjVar.h;
                        Double d4 = vjVar.i;
                        Double d5 = vjVar.j;
                        Double d6 = vjVar.k;
                        Set setU2 = dv.U0(list12);
                        Double d7 = vjVar.m;
                        dy1Var = new dy1(str13, str14, ir0VarValueOf, num, d4, d5, i3VarValueOf, as0VarValueOf, d6, lt1VarValueOf, setU2, e40Var, d7 != null ? d7.doubleValue() : 0.0d, localDate3);
                        if (dv.U0(list12).size() != list12.size()) {
                            arrayList3.add(strH2.concat("：忌口重复"));
                        }
                        ListIterator listIterator3 = bh0.f(dy1Var, year).listIterator(0);
                        while (true) {
                            ht0 ht0Var3 = (ht0) listIterator3;
                            if (!ht0Var3.hasNext()) {
                                break;
                            }
                            arrayList3.add(strH2 + "：" + ((m32) ht0Var3.next()).b);
                        }
                    }
                    if (dy1Var != null) {
                        arrayList11.add(dy1Var);
                    }
                    it10 = it2;
                    arrayList9 = arrayList9;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = new ArrayList(ev.o0(arrayList11, 10));
                int size2 = arrayList11.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList11.get(i5);
                    i5++;
                    arrayList13.add(((dy1) obj2).a);
                }
                Set setU3 = dv.U0(arrayList13);
                if (!z3 && !list11.isEmpty()) {
                    arrayList3.add("文件标明不含身体数据，却包含体重记录，可能被修改过");
                }
                ArrayList arrayList14 = new ArrayList();
                for (ek ekVar : list11) {
                    String str15 = ekVar.a;
                    double d8 = ekVar.c;
                    String str16 = ekVar.b;
                    if (!setU3.contains(str15)) {
                        arrayList3.add("体重记录引用了不存在的家人");
                    }
                    try {
                        localDate2 = LocalDate.parse(str16);
                    } catch (DateTimeParseException unused10) {
                        arrayList3.add("体重记录日期无效");
                        localDate2 = null;
                    }
                    if (localDate2 == null) {
                        arrayList2 = arrayList11;
                        u63Var = null;
                    } else {
                        ListIterator listIterator4 = bh0.h(localDate2, d8, localDate4).listIterator(0);
                        while (true) {
                            ht0 ht0Var4 = (ht0) listIterator4;
                            if (!ht0Var4.hasNext()) {
                                break;
                            }
                            arrayList3.add("体重记录 " + str16 + "：" + ((m32) ht0Var4.next()).b);
                            arrayList11 = arrayList11;
                        }
                        arrayList2 = arrayList11;
                        u63Var = new u63(ekVar.a, localDate2, d8);
                    }
                    if (u63Var != null) {
                        arrayList14.add(u63Var);
                    }
                    arrayList11 = arrayList2;
                    localDate4 = localDate;
                }
                ArrayList arrayList15 = arrayList11;
                ArrayList arrayList16 = new ArrayList(ev.o0(arrayList14, 10));
                int size3 = arrayList14.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList14.get(i6);
                    i6++;
                    u63 u63Var2 = (u63) obj3;
                    arrayList16.add(new wt1(u63Var2.a, u63Var2.b));
                }
                if (dv.U0(arrayList16).size() != arrayList14.size()) {
                    arrayList3.add("同一位家人同一天有多条体重记录");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : yjVar.i.entrySet()) {
                    String str17 = (String) entry.getKey();
                    Map map = (Map) entry.getValue();
                    try {
                        p60.j.getClass();
                        p60VarI = yy.i(str17);
                    } catch (IllegalArgumentException unused11) {
                        arrayList3.add("时间表日期 无效");
                        p60VarI = null;
                    }
                    if (p60VarI != null) {
                        ArrayList arrayList17 = new ArrayList();
                        for (Map.Entry entry2 : map.entrySet()) {
                            String str18 = (String) entry2.getKey();
                            List list13 = (List) entry2.getValue();
                            try {
                                yyVar.getClass();
                                te1VarJ = yy.j(str18);
                            } catch (IllegalArgumentException unused12) {
                                arrayList3.add("时间表餐次 无效");
                                te1VarJ = null;
                            }
                            if (te1VarJ == null) {
                                wt1Var = null;
                            } else {
                                if (dv.U0(list13).size() != list13.size()) {
                                    arrayList3.add("时间表中有重复的人");
                                }
                                Iterator it13 = list13.iterator();
                                while (it13.hasNext()) {
                                    if (!setU3.contains((String) it13.next())) {
                                        arrayList3.add("时间表引用了不存在的家人");
                                    }
                                }
                                wt1Var = new wt1(te1VarJ, dv.w0(list13));
                            }
                            if (wt1Var != null) {
                                arrayList17.add(wt1Var);
                            }
                        }
                        linkedHashMap.put(p60VarI, ee1.M(arrayList17));
                    }
                }
                b33Var2.d();
                offsetDateTime4.getClass();
                return new gk(offsetDateTime4, yjVar.d, arrayList12, arrayList, arrayList15, arrayList14, new ed2(linkedHashMap));
            } catch (wh2 e) {
                String message = e.getMessage();
                throw new g40(lt.P("备份文件内容格式错误：" + (message != null ? co2.f0(160, message) : null)));
            } catch (IllegalArgumentException e2) {
                String message2 = e2.getMessage();
                throw new g40(lt.P("备份文件内容格式错误：" + (message2 != null ? co2.f0(160, message2) : null)));
            }
        } catch (wh2 unused13) {
            throw new g40(lt.P("不是家庭食谱的备份文件"));
        } catch (IllegalArgumentException unused14) {
            throw new g40(lt.P("不是家庭食谱的备份文件"));
        }
    }

    public static String b(gk gkVar) {
        byte b2;
        char[] cArr;
        gkVar.getClass();
        gk gkVarA = gkVar;
        if (!gkVarA.b) {
            gkVarA = gkVarA.a();
        }
        String string = gkVarA.a.toString();
        string.getClass();
        boolean z = gkVarA.b;
        List list = gkVarA.c;
        ArrayList arrayList = new ArrayList(ev.o0(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            uv0 uv0Var = (uv0) it.next();
            String str = uv0Var.a;
            String str2 = uv0Var.b;
            String str3 = uv0Var.c;
            bp1 bp1Var = uv0Var.d;
            arrayList.add(new bw0(str, str2, str3, new ep1(bp1Var.a, bp1Var.b, bp1Var.c, bp1Var.d, bp1Var.e)));
            string = string;
        }
        String str4 = string;
        List list2 = gkVarA.d;
        ArrayList arrayList2 = new ArrayList(ev.o0(list2, 10));
        Iterator it2 = list2.iterator();
        while (true) {
            b2 = 0;
            int i = 0;
            if (!it2.hasNext()) {
                break;
            }
            j62 j62Var = (j62) it2.next();
            String str5 = j62Var.a;
            String str6 = j62Var.b;
            lh0 lh0Var = te1.o;
            ArrayList arrayList3 = new ArrayList();
            lh0Var.getClass();
            z zVar = new z(lh0Var, b2);
            while (zVar.hasNext()) {
                Object next = zVar.next();
                if (j62Var.c.contains((te1) next)) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(ev.o0(arrayList3, 10));
            int size = arrayList3.size();
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                arrayList4.add(((te1) obj).h);
            }
            String str7 = j62Var.d.h;
            int i2 = j62Var.e;
            int i3 = j62Var.f;
            List list3 = j62Var.g;
            ArrayList arrayList5 = new ArrayList(ev.o0(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                z62 z62Var = (z62) it3.next();
                arrayList5.add(new c72(z62Var.a, z62Var.b));
                it3 = it3;
                it2 = it2;
                z = z;
            }
            Iterator it4 = it2;
            bp1 bp1Var2 = j62Var.h;
            arrayList2.add(new q62(str5, str6, arrayList4, str7, i2, i3, arrayList5, new ep1(bp1Var2.a, bp1Var2.b, bp1Var2.c, bp1Var2.d, bp1Var2.e), dv.L0(j62Var.i), j62Var.j.h, j62Var.k));
            it2 = it4;
            z = z;
        }
        boolean z2 = z;
        List<dy1> list4 = gkVarA.e;
        ArrayList arrayList6 = new ArrayList(ev.o0(list4, 10));
        for (dy1 dy1Var : list4) {
            String str8 = dy1Var.a;
            String str9 = dy1Var.b;
            String strName = dy1Var.c.name();
            String strName2 = dy1Var.g.name();
            String strName3 = dy1Var.h.name();
            String strName4 = dy1Var.j.name();
            List listL0 = dv.L0(dy1Var.k);
            Integer num = dy1Var.d;
            Double d2 = dy1Var.e;
            Double d3 = dy1Var.f;
            Double d4 = dy1Var.i;
            e40 e40Var = dy1Var.l;
            vs2 vs2Var = e40Var != null ? new vs2(d(e40Var.a), d(e40Var.b), d(e40Var.c), d(e40Var.d), d(e40Var.e)) : null;
            double d5 = dy1Var.m;
            Double dValueOf = (!gkVarA.b || d5 == 0.0d) ? null : Double.valueOf(d5);
            LocalDate localDate = dy1Var.n;
            arrayList6.add(new vj(str8, str9, strName, strName2, strName3, strName4, listL0, num, d2, d3, d4, vs2Var, dValueOf, localDate != null ? localDate.toString() : null));
        }
        List<u63> listM0 = dv.M0(gkVarA.f, vs.t(new s0((byte) 16), new s0((byte) 17)));
        ArrayList arrayList7 = new ArrayList(ev.o0(listM0, 10));
        for (u63 u63Var : listM0) {
            String str10 = u63Var.a;
            String string2 = u63Var.b.toString();
            string2.getClass();
            arrayList7.add(new ek(str10, string2, u63Var.c));
        }
        lh0 lh0Var2 = p60.p;
        int iK = ee1.K(ev.o0(lh0Var2, 10));
        if (iK < 16) {
            iK = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iK);
        z zVar2 = new z(lh0Var2, b2);
        while (zVar2.hasNext()) {
            p60 p60Var = (p60) zVar2.next();
            String str11 = p60Var.h;
            lh0 lh0Var3 = te1.o;
            int iK2 = ee1.K(ev.o0(lh0Var3, 10));
            if (iK2 < 16) {
                iK2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iK2);
            z zVar3 = new z(lh0Var3, b2);
            while (zVar3.hasNext()) {
                te1 te1Var = (te1) zVar3.next();
                linkedHashMap2.put(te1Var.h, dv.L0(gkVarA.g.a(p60Var, te1Var)));
            }
            linkedHashMap.put(str11, linkedHashMap2);
            b2 = 0;
        }
        yj yjVar = new yj(str4, z2, arrayList, arrayList2, arrayList6, arrayList7, linkedHashMap);
        t11 t11Var = c;
        r21 r21VarSerializer = yj.Companion.serializer();
        t11Var.getClass();
        r21VarSerializer.getClass();
        p4 p4Var = new p4((byte) 7);
        qs qsVar = qs.c;
        synchronized (qsVar) {
            ih ihVar = qsVar.a;
            char[] cArr2 = (char[]) (ihVar.isEmpty() ? null : ihVar.removeLast());
            if (cArr2 != null) {
                qsVar.b -= cArr2.length;
                cArr = cArr2;
            } else {
                cArr = null;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        p4Var.c = cArr;
        try {
            new b(t11Var.a.b ? new fz(p4Var, t11Var) : new az(p4Var), t11Var, t81.OBJ, new b[t81.o.a()]).p(r21VarSerializer, yjVar);
            return p4Var.toString();
        } finally {
            p4Var.g();
        }
    }

    public static final ap1 c(q52 q52Var) {
        double d2 = q52Var.a;
        Double d3 = q52Var.b;
        return new ap1(d2, d3 != null ? d3.doubleValue() : Double.POSITIVE_INFINITY);
    }

    public static q52 d(ap1 ap1Var) {
        double d2 = ap1Var.a;
        double d3 = ap1Var.b;
        Double dValueOf = Double.valueOf(d3);
        if (Math.abs(d3) > Double.MAX_VALUE) {
            dValueOf = null;
        }
        return new q52(d2, dValueOf);
    }
}
