package defpackage;

import com.familymeal.app.data.db.AppDatabase;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gz1 extends mq2 implements vp0 {
    public yy1 l;
    public List m;
    public List n;
    public List o;
    public List p;
    public List q;
    public aw1 r;
    public byte s;
    public final /* synthetic */ kz1 t;
    public final /* synthetic */ LocalDate u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz1(kz1 kz1Var, LocalDate localDate, m10 m10Var) {
        super(1, m10Var);
        this.t = kz1Var;
        this.u = localDate;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        return new gz1(this.t, this.u, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0378  */
    /* JADX WARN: Code duplicated, block: B:104:0x0388 A[LOOP:10: B:102:0x0382->B:104:0x0388, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b8 A[PHI: r3 r9
  0x00b8: PHI (r3v7 yy1) = (r3v5 yy1), (r3v9 yy1) binds: [B:19:0x00b6, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x00b8: PHI (r9v5 java.lang.Object) = (r9v4 java.lang.Object), (r9v8 java.lang.Object) binds: [B:19:0x00b6, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:28:0x011d  */
    /* JADX WARN: Code duplicated, block: B:31:0x014a  */
    /* JADX WARN: Code duplicated, block: B:35:0x016a  */
    /* JADX WARN: Code duplicated, block: B:39:0x017d  */
    /* JADX WARN: Code duplicated, block: B:41:0x019a  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c6 A[LOOP:1: B:47:0x01c0->B:49:0x01c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0205  */
    /* JADX WARN: Code duplicated, block: B:58:0x0224 A[LOOP:3: B:57:0x0222->B:58:0x0224, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x025a  */
    /* JADX WARN: Code duplicated, block: B:65:0x026b A[LOOP:4: B:63:0x0265->B:65:0x026b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0288  */
    /* JADX WARN: Code duplicated, block: B:71:0x029b  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x031e  */
    /* JADX WARN: Code duplicated, block: B:90:0x032f A[LOOP:8: B:88:0x0329->B:90:0x032f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x034a  */
    /* JADX WARN: Code duplicated, block: B:97:0x035b A[LOOP:9: B:95:0x0355->B:97:0x035b, LOOP_END] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object objP;
        yy1 yy1Var;
        Object objP2;
        List list;
        Object objP3;
        yy1 yy1Var2;
        List list2;
        List list3;
        Object objP4;
        List<xy1> list4;
        List list5;
        yy1 yy1Var3;
        List list6;
        Object objC;
        List<cz1> list7;
        List list8;
        List list9;
        List list10;
        Object objC2;
        List list11;
        List list12;
        aw1 aw1Var;
        Object objB;
        yy1 yy1Var4;
        List list13;
        LinkedHashMap linkedHashMap;
        int iK;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i;
        int iK2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        int iK3;
        LinkedHashMap linkedHashMap6;
        int iK4;
        LinkedHashMap linkedHashMap7;
        int iK5;
        LinkedHashMap linkedHashMap8;
        LinkedHashMap linkedHashMap9;
        te1 te1VarValueOf;
        Object arrayList3;
        p60 p60VarValueOf;
        Object arrayList4;
        ek2 ek2Var;
        Object arrayList5;
        kz1 kz1Var = this.t;
        AppDatabase appDatabase = kz1Var.a;
        byte b = this.s;
        byte b2 = 16;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                m02.y(obj);
                vy1 vy1VarP = appDatabase.p();
                String string = this.u.toString();
                string.getClass();
                this.s = (byte) 1;
                objP = cu.P(this, new ql(string, (byte) 15), vy1VarP.a, true, false);
                if (objP != y20Var) {
                    yy1Var = (yy1) objP;
                    if (yy1Var == null) {
                        return null;
                    }
                    vy1 vy1VarP2 = appDatabase.p();
                    String str = yy1Var.a;
                    this.l = yy1Var;
                    this.s = (byte) 2;
                    objP2 = cu.P(this, new ql(str, b2), vy1VarP2.a, true, false);
                    if (objP2 != y20Var) {
                        list = (List) objP2;
                        vy1 vy1VarP3 = appDatabase.p();
                        String str2 = yy1Var.a;
                        this.l = yy1Var;
                        this.m = list;
                        this.s = (byte) 3;
                        objP3 = cu.P(this, new ql(str2, (byte) 19), vy1VarP3.a, true, false);
                        if (objP3 != y20Var) {
                            yy1Var2 = yy1Var;
                            list2 = list;
                            list3 = (List) objP3;
                            vy1 vy1VarP4 = appDatabase.p();
                            String str3 = yy1Var2.a;
                            this.l = yy1Var2;
                            this.m = list2;
                            this.n = list3;
                            this.s = (byte) 4;
                            objP4 = cu.P(this, new ql(str3, (byte) 18), vy1VarP4.a, true, false);
                            if (objP4 != y20Var) {
                                yy1 yy1Var5 = yy1Var2;
                                list4 = list2;
                                list5 = list3;
                                yy1Var3 = yy1Var5;
                                list6 = (List) objP4;
                                yr yrVar = kz1Var.b;
                                this.l = yy1Var3;
                                this.m = list4;
                                this.n = list5;
                                this.o = list6;
                                this.s = (byte) 5;
                                objC = ia2.C(yrVar.a, new nr(yrVar, null), this);
                                if (objC != y20Var) {
                                    list7 = list5;
                                    list8 = list6;
                                    wt1 wt1Var = (wt1) objC;
                                    list9 = (List) wt1Var.h;
                                    list10 = (List) wt1Var.i;
                                    tw1 tw1Var = kz1Var.c;
                                    this.l = yy1Var3;
                                    this.m = list4;
                                    this.n = list7;
                                    this.o = list8;
                                    this.p = list9;
                                    this.q = list10;
                                    this.s = (byte) 6;
                                    objC2 = ia2.C(tw1Var.a, new lw1(tw1Var, null), this);
                                    if (objC2 != y20Var) {
                                        list11 = list8;
                                        list12 = list9;
                                        aw1Var = (aw1) objC2;
                                        sx1 sx1VarO = appDatabase.o();
                                        this.l = yy1Var3;
                                        this.m = list4;
                                        this.n = list7;
                                        this.o = list11;
                                        this.p = list12;
                                        this.q = list10;
                                        this.r = aw1Var;
                                        this.s = (byte) 7;
                                        objB = sx1VarO.b(this);
                                        if (objB != y20Var) {
                                            yy1Var4 = yy1Var3;
                                            list13 = list10;
                                            List<by1> list14 = (List) objB;
                                            linkedHashMap = new LinkedHashMap();
                                            for (xy1 xy1Var : list4) {
                                                ek2Var = new ek2(p60.valueOf(xy1Var.b), te1.valueOf(xy1Var.c));
                                                arrayList5 = linkedHashMap.get(ek2Var);
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                    linkedHashMap.put(ek2Var, arrayList5);
                                                }
                                                ((List) arrayList5).add(xy1Var.d);
                                            }
                                            iK = ee1.K(ev.o0(list7, 10));
                                            if (iK < 16) {
                                                iK = 16;
                                            }
                                            linkedHashMap2 = new LinkedHashMap(iK);
                                            for (cz1 cz1Var : list7) {
                                                linkedHashMap2.put(new q12(new ek2(p60.valueOf(cz1Var.b), te1.valueOf(cz1Var.c)), cz1Var.d, cz1Var.e), new Double(cz1Var.f));
                                            }
                                            c63 c63Var = new c63(linkedHashMap, linkedHashMap2);
                                            arrayList = new ArrayList();
                                            for (Object obj2 : list4) {
                                                if (((xy1) obj2).f) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            arrayList2 = new ArrayList(ev.o0(arrayList, 10));
                                            size = arrayList.size();
                                            i = 0;
                                            while (i < size) {
                                                Object obj3 = arrayList.get(i);
                                                i++;
                                                xy1 xy1Var2 = (xy1) obj3;
                                                arrayList2.add(new wt1(new ek2(p60.valueOf(xy1Var2.b), te1.valueOf(xy1Var2.c)), xy1Var2.d));
                                            }
                                            Set setU0 = dv.U0(arrayList2);
                                            iK2 = ee1.K(ev.o0(list4, 10));
                                            if (iK2 < 16) {
                                                iK2 = 16;
                                            }
                                            linkedHashMap3 = new LinkedHashMap(iK2);
                                            for (xy1 xy1Var3 : list4) {
                                                linkedHashMap3.put(xy1Var3.d, xy1Var3.e);
                                            }
                                            linkedHashMap4 = new LinkedHashMap();
                                            for (Object obj4 : list11) {
                                                p60VarValueOf = p60.valueOf(((wy1) obj4).b);
                                                arrayList4 = linkedHashMap4.get(p60VarValueOf);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                    linkedHashMap4.put(p60VarValueOf, arrayList4);
                                                }
                                                ((List) arrayList4).add(obj4);
                                            }
                                            linkedHashMap5 = new LinkedHashMap(ee1.K(linkedHashMap4.size()));
                                            for (Map.Entry entry : linkedHashMap4.entrySet()) {
                                                Object key = entry.getKey();
                                                List<wy1> list15 = (List) entry.getValue();
                                                linkedHashMap9 = new LinkedHashMap();
                                                for (wy1 wy1Var : list15) {
                                                    te1VarValueOf = te1.valueOf(wy1Var.c);
                                                    arrayList3 = linkedHashMap9.get(te1VarValueOf);
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                        linkedHashMap9.put(te1VarValueOf, arrayList3);
                                                    }
                                                    ((List) arrayList3).add(wy1Var.d);
                                                }
                                                linkedHashMap5.put(key, linkedHashMap9);
                                            }
                                            ed2 ed2Var = new ed2(linkedHashMap5);
                                            iK3 = ee1.K(ev.o0(list12, 10));
                                            if (iK3 < 16) {
                                                iK3 = 16;
                                            }
                                            linkedHashMap6 = new LinkedHashMap(iK3);
                                            for (Object obj5 : list12) {
                                                linkedHashMap6.put(((j62) obj5).a, obj5);
                                            }
                                            iK4 = ee1.K(ev.o0(list13, 10));
                                            if (iK4 < 16) {
                                                iK4 = 16;
                                            }
                                            linkedHashMap7 = new LinkedHashMap(iK4);
                                            for (Object obj6 : list13) {
                                                linkedHashMap7.put(((uv0) obj6).a, obj6);
                                            }
                                            ArrayList arrayList6 = aw1Var.a;
                                            iK5 = ee1.K(ev.o0(list14, 10));
                                            if (iK5 < 16) {
                                                iK5 = 16;
                                            }
                                            linkedHashMap8 = new LinkedHashMap(iK5);
                                            for (by1 by1Var : list14) {
                                                linkedHashMap8.put(by1Var.a, by1Var.b);
                                            }
                                            return new ez1(yy1Var4, c63Var, setU0, linkedHashMap3, ed2Var, linkedHashMap6, linkedHashMap7, arrayList6, linkedHashMap8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y20Var;
            case 1:
                m02.y(obj);
                objP = obj;
                yy1Var = (yy1) objP;
                if (yy1Var == null) {
                    return null;
                }
                vy1 vy1VarP5 = appDatabase.p();
                String str4 = yy1Var.a;
                this.l = yy1Var;
                this.s = (byte) 2;
                objP2 = cu.P(this, new ql(str4, b2), vy1VarP5.a, true, false);
                if (objP2 != y20Var) {
                    list = (List) objP2;
                    vy1 vy1VarP6 = appDatabase.p();
                    String str5 = yy1Var.a;
                    this.l = yy1Var;
                    this.m = list;
                    this.s = (byte) 3;
                    objP3 = cu.P(this, new ql(str5, (byte) 19), vy1VarP6.a, true, false);
                    if (objP3 != y20Var) {
                        yy1Var2 = yy1Var;
                        list2 = list;
                        list3 = (List) objP3;
                        vy1 vy1VarP7 = appDatabase.p();
                        String str6 = yy1Var2.a;
                        this.l = yy1Var2;
                        this.m = list2;
                        this.n = list3;
                        this.s = (byte) 4;
                        objP4 = cu.P(this, new ql(str6, (byte) 18), vy1VarP7.a, true, false);
                        if (objP4 != y20Var) {
                            yy1 yy1Var6 = yy1Var2;
                            list4 = list2;
                            list5 = list3;
                            yy1Var3 = yy1Var6;
                            list6 = (List) objP4;
                            yr yrVar2 = kz1Var.b;
                            this.l = yy1Var3;
                            this.m = list4;
                            this.n = list5;
                            this.o = list6;
                            this.s = (byte) 5;
                            objC = ia2.C(yrVar2.a, new nr(yrVar2, null), this);
                            if (objC != y20Var) {
                                list7 = list5;
                                list8 = list6;
                                wt1 wt1Var2 = (wt1) objC;
                                list9 = (List) wt1Var2.h;
                                list10 = (List) wt1Var2.i;
                                tw1 tw1Var2 = kz1Var.c;
                                this.l = yy1Var3;
                                this.m = list4;
                                this.n = list7;
                                this.o = list8;
                                this.p = list9;
                                this.q = list10;
                                this.s = (byte) 6;
                                objC2 = ia2.C(tw1Var2.a, new lw1(tw1Var2, null), this);
                                if (objC2 != y20Var) {
                                    list11 = list8;
                                    list12 = list9;
                                    aw1Var = (aw1) objC2;
                                    sx1 sx1VarO2 = appDatabase.o();
                                    this.l = yy1Var3;
                                    this.m = list4;
                                    this.n = list7;
                                    this.o = list11;
                                    this.p = list12;
                                    this.q = list10;
                                    this.r = aw1Var;
                                    this.s = (byte) 7;
                                    objB = sx1VarO2.b(this);
                                    if (objB != y20Var) {
                                        yy1Var4 = yy1Var3;
                                        list13 = list10;
                                        List<by1> list16 = (List) objB;
                                        linkedHashMap = new LinkedHashMap();
                                        while (r11.hasNext()) {
                                            ek2Var = new ek2(p60.valueOf(xy1Var.b), te1.valueOf(xy1Var.c));
                                            arrayList5 = linkedHashMap.get(ek2Var);
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                                linkedHashMap.put(ek2Var, arrayList5);
                                            }
                                            ((List) arrayList5).add(xy1Var.d);
                                        }
                                        iK = ee1.K(ev.o0(list7, 10));
                                        if (iK < 16) {
                                            iK = 16;
                                        }
                                        linkedHashMap2 = new LinkedHashMap(iK);
                                        while (r7.hasNext()) {
                                            linkedHashMap2.put(new q12(new ek2(p60.valueOf(cz1Var.b), te1.valueOf(cz1Var.c)), cz1Var.d, cz1Var.e), new Double(cz1Var.f));
                                        }
                                        c63 c63Var2 = new c63(linkedHashMap, linkedHashMap2);
                                        arrayList = new ArrayList();
                                        while (r7.hasNext()) {
                                            if (((xy1) obj2).f) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        arrayList2 = new ArrayList(ev.o0(arrayList, 10));
                                        size = arrayList.size();
                                        i = 0;
                                        while (i < size) {
                                            Object obj7 = arrayList.get(i);
                                            i++;
                                            xy1 xy1Var4 = (xy1) obj7;
                                            arrayList2.add(new wt1(new ek2(p60.valueOf(xy1Var4.b), te1.valueOf(xy1Var4.c)), xy1Var4.d));
                                        }
                                        Set setU1 = dv.U0(arrayList2);
                                        iK2 = ee1.K(ev.o0(list4, 10));
                                        if (iK2 < 16) {
                                            iK2 = 16;
                                        }
                                        linkedHashMap3 = new LinkedHashMap(iK2);
                                        while (r6.hasNext()) {
                                            linkedHashMap3.put(xy1Var3.d, xy1Var3.e);
                                        }
                                        linkedHashMap4 = new LinkedHashMap();
                                        while (r4.hasNext()) {
                                            p60VarValueOf = p60.valueOf(((wy1) obj4).b);
                                            arrayList4 = linkedHashMap4.get(p60VarValueOf);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                                linkedHashMap4.put(p60VarValueOf, arrayList4);
                                            }
                                            ((List) arrayList4).add(obj4);
                                        }
                                        linkedHashMap5 = new LinkedHashMap(ee1.K(linkedHashMap4.size()));
                                        while (r6.hasNext()) {
                                            Object key2 = entry.getKey();
                                            List<wy1> list17 = (List) entry.getValue();
                                            linkedHashMap9 = new LinkedHashMap();
                                            while (r7.hasNext()) {
                                                te1VarValueOf = te1.valueOf(wy1Var.c);
                                                arrayList3 = linkedHashMap9.get(te1VarValueOf);
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                    linkedHashMap9.put(te1VarValueOf, arrayList3);
                                                }
                                                ((List) arrayList3).add(wy1Var.d);
                                            }
                                            linkedHashMap5.put(key2, linkedHashMap9);
                                        }
                                        ed2 ed2Var2 = new ed2(linkedHashMap5);
                                        iK3 = ee1.K(ev.o0(list12, 10));
                                        if (iK3 < 16) {
                                            iK3 = 16;
                                        }
                                        linkedHashMap6 = new LinkedHashMap(iK3);
                                        while (r3.hasNext()) {
                                            linkedHashMap6.put(((j62) obj5).a, obj5);
                                        }
                                        iK4 = ee1.K(ev.o0(list13, 10));
                                        if (iK4 < 16) {
                                            iK4 = 16;
                                        }
                                        linkedHashMap7 = new LinkedHashMap(iK4);
                                        while (r2.hasNext()) {
                                            linkedHashMap7.put(((uv0) obj6).a, obj6);
                                        }
                                        ArrayList arrayList7 = aw1Var.a;
                                        iK5 = ee1.K(ev.o0(list16, 10));
                                        if (iK5 < 16) {
                                            iK5 = 16;
                                        }
                                        linkedHashMap8 = new LinkedHashMap(iK5);
                                        while (r0.hasNext()) {
                                            linkedHashMap8.put(by1Var.a, by1Var.b);
                                        }
                                        return new ez1(yy1Var4, c63Var2, setU1, linkedHashMap3, ed2Var2, linkedHashMap6, linkedHashMap7, arrayList7, linkedHashMap8);
                                    }
                                }
                            }
                        }
                    }
                }
                return y20Var;
            case 2:
                yy1Var = this.l;
                m02.y(obj);
                objP2 = obj;
                list = (List) objP2;
                vy1 vy1VarP8 = appDatabase.p();
                String str7 = yy1Var.a;
                this.l = yy1Var;
                this.m = list;
                this.s = (byte) 3;
                objP3 = cu.P(this, new ql(str7, (byte) 19), vy1VarP8.a, true, false);
                if (objP3 != y20Var) {
                    yy1Var2 = yy1Var;
                    list2 = list;
                    list3 = (List) objP3;
                    vy1 vy1VarP9 = appDatabase.p();
                    String str8 = yy1Var2.a;
                    this.l = yy1Var2;
                    this.m = list2;
                    this.n = list3;
                    this.s = (byte) 4;
                    objP4 = cu.P(this, new ql(str8, (byte) 18), vy1VarP9.a, true, false);
                    if (objP4 != y20Var) {
                        yy1 yy1Var7 = yy1Var2;
                        list4 = list2;
                        list5 = list3;
                        yy1Var3 = yy1Var7;
                        list6 = (List) objP4;
                        yr yrVar3 = kz1Var.b;
                        this.l = yy1Var3;
                        this.m = list4;
                        this.n = list5;
                        this.o = list6;
                        this.s = (byte) 5;
                        objC = ia2.C(yrVar3.a, new nr(yrVar3, null), this);
                        if (objC != y20Var) {
                            list7 = list5;
                            list8 = list6;
                            wt1 wt1Var3 = (wt1) objC;
                            list9 = (List) wt1Var3.h;
                            list10 = (List) wt1Var3.i;
                            tw1 tw1Var3 = kz1Var.c;
                            this.l = yy1Var3;
                            this.m = list4;
                            this.n = list7;
                            this.o = list8;
                            this.p = list9;
                            this.q = list10;
                            this.s = (byte) 6;
                            objC2 = ia2.C(tw1Var3.a, new lw1(tw1Var3, null), this);
                            if (objC2 != y20Var) {
                                list11 = list8;
                                list12 = list9;
                                aw1Var = (aw1) objC2;
                                sx1 sx1VarO3 = appDatabase.o();
                                this.l = yy1Var3;
                                this.m = list4;
                                this.n = list7;
                                this.o = list11;
                                this.p = list12;
                                this.q = list10;
                                this.r = aw1Var;
                                this.s = (byte) 7;
                                objB = sx1VarO3.b(this);
                                if (objB != y20Var) {
                                    yy1Var4 = yy1Var3;
                                    list13 = list10;
                                    List<by1> list18 = (List) objB;
                                    linkedHashMap = new LinkedHashMap();
                                    while (r11.hasNext()) {
                                        ek2Var = new ek2(p60.valueOf(xy1Var.b), te1.valueOf(xy1Var.c));
                                        arrayList5 = linkedHashMap.get(ek2Var);
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                            linkedHashMap.put(ek2Var, arrayList5);
                                        }
                                        ((List) arrayList5).add(xy1Var.d);
                                    }
                                    iK = ee1.K(ev.o0(list7, 10));
                                    if (iK < 16) {
                                        iK = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(iK);
                                    while (r7.hasNext()) {
                                        linkedHashMap2.put(new q12(new ek2(p60.valueOf(cz1Var.b), te1.valueOf(cz1Var.c)), cz1Var.d, cz1Var.e), new Double(cz1Var.f));
                                    }
                                    c63 c63Var3 = new c63(linkedHashMap, linkedHashMap2);
                                    arrayList = new ArrayList();
                                    while (r7.hasNext()) {
                                        if (((xy1) obj2).f) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    arrayList2 = new ArrayList(ev.o0(arrayList, 10));
                                    size = arrayList.size();
                                    i = 0;
                                    while (i < size) {
                                        Object obj8 = arrayList.get(i);
                                        i++;
                                        xy1 xy1Var5 = (xy1) obj8;
                                        arrayList2.add(new wt1(new ek2(p60.valueOf(xy1Var5.b), te1.valueOf(xy1Var5.c)), xy1Var5.d));
                                    }
                                    Set setU2 = dv.U0(arrayList2);
                                    iK2 = ee1.K(ev.o0(list4, 10));
                                    if (iK2 < 16) {
                                        iK2 = 16;
                                    }
                                    linkedHashMap3 = new LinkedHashMap(iK2);
                                    while (r6.hasNext()) {
                                        linkedHashMap3.put(xy1Var3.d, xy1Var3.e);
                                    }
                                    linkedHashMap4 = new LinkedHashMap();
                                    while (r4.hasNext()) {
                                        p60VarValueOf = p60.valueOf(((wy1) obj4).b);
                                        arrayList4 = linkedHashMap4.get(p60VarValueOf);
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                            linkedHashMap4.put(p60VarValueOf, arrayList4);
                                        }
                                        ((List) arrayList4).add(obj4);
                                    }
                                    linkedHashMap5 = new LinkedHashMap(ee1.K(linkedHashMap4.size()));
                                    while (r6.hasNext()) {
                                        Object key3 = entry.getKey();
                                        List<wy1> list19 = (List) entry.getValue();
                                        linkedHashMap9 = new LinkedHashMap();
                                        while (r7.hasNext()) {
                                            te1VarValueOf = te1.valueOf(wy1Var.c);
                                            arrayList3 = linkedHashMap9.get(te1VarValueOf);
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                                linkedHashMap9.put(te1VarValueOf, arrayList3);
                                            }
                                            ((List) arrayList3).add(wy1Var.d);
                                        }
                                        linkedHashMap5.put(key3, linkedHashMap9);
                                    }
                                    ed2 ed2Var3 = new ed2(linkedHashMap5);
                                    iK3 = ee1.K(ev.o0(list12, 10));
                                    if (iK3 < 16) {
                                        iK3 = 16;
                                    }
                                    linkedHashMap6 = new LinkedHashMap(iK3);
                                    while (r3.hasNext()) {
                                        linkedHashMap6.put(((j62) obj5).a, obj5);
                                    }
                                    iK4 = ee1.K(ev.o0(list13, 10));
                                    if (iK4 < 16) {
                                        iK4 = 16;
                                    }
                                    linkedHashMap7 = new LinkedHashMap(iK4);
                                    while (r2.hasNext()) {
                                        linkedHashMap7.put(((uv0) obj6).a, obj6);
                                    }
                                    ArrayList arrayList8 = aw1Var.a;
                                    iK5 = ee1.K(ev.o0(list18, 10));
                                    if (iK5 < 16) {
                                        iK5 = 16;
                                    }
                                    linkedHashMap8 = new LinkedHashMap(iK5);
                                    while (r0.hasNext()) {
                                        linkedHashMap8.put(by1Var.a, by1Var.b);
                                    }
                                    return new ez1(yy1Var4, c63Var3, setU2, linkedHashMap3, ed2Var3, linkedHashMap6, linkedHashMap7, arrayList8, linkedHashMap8);
                                }
                            }
                        }
                    }
                }
                return y20Var;
            case 3:
                list2 = this.m;
                yy1Var2 = this.l;
                m02.y(obj);
                objP3 = obj;
                list3 = (List) objP3;
                vy1 vy1VarP10 = appDatabase.p();
                String str9 = yy1Var2.a;
                this.l = yy1Var2;
                this.m = list2;
                this.n = list3;
                this.s = (byte) 4;
                objP4 = cu.P(this, new ql(str9, (byte) 18), vy1VarP10.a, true, false);
                if (objP4 != y20Var) {
                    yy1 yy1Var8 = yy1Var2;
                    list4 = list2;
                    list5 = list3;
                    yy1Var3 = yy1Var8;
                    list6 = (List) objP4;
                    yr yrVar4 = kz1Var.b;
                    this.l = yy1Var3;
                    this.m = list4;
                    this.n = list5;
                    this.o = list6;
                    this.s = (byte) 5;
                    objC = ia2.C(yrVar4.a, new nr(yrVar4, null), this);
                    if (objC != y20Var) {
                        list7 = list5;
                        list8 = list6;
                        wt1 wt1Var4 = (wt1) objC;
                        list9 = (List) wt1Var4.h;
                        list10 = (List) wt1Var4.i;
                        tw1 tw1Var4 = kz1Var.c;
                        this.l = yy1Var3;
                        this.m = list4;
                        this.n = list7;
                        this.o = list8;
                        this.p = list9;
                        this.q = list10;
                        this.s = (byte) 6;
                        objC2 = ia2.C(tw1Var4.a, new lw1(tw1Var4, null), this);
                        if (objC2 != y20Var) {
                            list11 = list8;
                            list12 = list9;
                            aw1Var = (aw1) objC2;
                            sx1 sx1VarO4 = appDatabase.o();
                            this.l = yy1Var3;
                            this.m = list4;
                            this.n = list7;
                            this.o = list11;
                            this.p = list12;
                            this.q = list10;
                            this.r = aw1Var;
                            this.s = (byte) 7;
                            objB = sx1VarO4.b(this);
                            if (objB != y20Var) {
                                yy1Var4 = yy1Var3;
                                list13 = list10;
                                List<by1> list110 = (List) objB;
                                linkedHashMap = new LinkedHashMap();
                                while (r11.hasNext()) {
                                    ek2Var = new ek2(p60.valueOf(xy1Var.b), te1.valueOf(xy1Var.c));
                                    arrayList5 = linkedHashMap.get(ek2Var);
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                        linkedHashMap.put(ek2Var, arrayList5);
                                    }
                                    ((List) arrayList5).add(xy1Var.d);
                                }
                                iK = ee1.K(ev.o0(list7, 10));
                                if (iK < 16) {
                                    iK = 16;
                                }
                                linkedHashMap2 = new LinkedHashMap(iK);
                                while (r7.hasNext()) {
                                    linkedHashMap2.put(new q12(new ek2(p60.valueOf(cz1Var.b), te1.valueOf(cz1Var.c)), cz1Var.d, cz1Var.e), new Double(cz1Var.f));
                                }
                                c63 c63Var4 = new c63(linkedHashMap, linkedHashMap2);
                                arrayList = new ArrayList();
                                while (r7.hasNext()) {
                                    if (((xy1) obj2).f) {
                                        arrayList.add(obj2);
                                    }
                                }
                                arrayList2 = new ArrayList(ev.o0(arrayList, 10));
                                size = arrayList.size();
                                i = 0;
                                while (i < size) {
                                    Object obj9 = arrayList.get(i);
                                    i++;
                                    xy1 xy1Var6 = (xy1) obj9;
                                    arrayList2.add(new wt1(new ek2(p60.valueOf(xy1Var6.b), te1.valueOf(xy1Var6.c)), xy1Var6.d));
                                }
                                Set setU3 = dv.U0(arrayList2);
                                iK2 = ee1.K(ev.o0(list4, 10));
                                if (iK2 < 16) {
                                    iK2 = 16;
                                }
                                linkedHashMap3 = new LinkedHashMap(iK2);
                                while (r6.hasNext()) {
                                    linkedHashMap3.put(xy1Var3.d, xy1Var3.e);
                                }
                                linkedHashMap4 = new LinkedHashMap();
                                while (r4.hasNext()) {
                                    p60VarValueOf = p60.valueOf(((wy1) obj4).b);
                                    arrayList4 = linkedHashMap4.get(p60VarValueOf);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        linkedHashMap4.put(p60VarValueOf, arrayList4);
                                    }
                                    ((List) arrayList4).add(obj4);
                                }
                                linkedHashMap5 = new LinkedHashMap(ee1.K(linkedHashMap4.size()));
                                while (r6.hasNext()) {
                                    Object key4 = entry.getKey();
                                    List<wy1> list111 = (List) entry.getValue();
                                    linkedHashMap9 = new LinkedHashMap();
                                    while (r7.hasNext()) {
                                        te1VarValueOf = te1.valueOf(wy1Var.c);
                                        arrayList3 = linkedHashMap9.get(te1VarValueOf);
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                            linkedHashMap9.put(te1VarValueOf, arrayList3);
                                        }
                                        ((List) arrayList3).add(wy1Var.d);
                                    }
                                    linkedHashMap5.put(key4, linkedHashMap9);
                                }
                                ed2 ed2Var4 = new ed2(linkedHashMap5);
                                iK3 = ee1.K(ev.o0(list12, 10));
                                if (iK3 < 16) {
                                    iK3 = 16;
                                }
                                linkedHashMap6 = new LinkedHashMap(iK3);
                                while (r3.hasNext()) {
                                    linkedHashMap6.put(((j62) obj5).a, obj5);
                                }
                                iK4 = ee1.K(ev.o0(list13, 10));
                                if (iK4 < 16) {
                                    iK4 = 16;
                                }
                                linkedHashMap7 = new LinkedHashMap(iK4);
                                while (r2.hasNext()) {
                                    linkedHashMap7.put(((uv0) obj6).a, obj6);
                                }
                                ArrayList arrayList9 = aw1Var.a;
                                iK5 = ee1.K(ev.o0(list110, 10));
                                if (iK5 < 16) {
                                    iK5 = 16;
                                }
                                linkedHashMap8 = new LinkedHashMap(iK5);
                                while (r0.hasNext()) {
                                    linkedHashMap8.put(by1Var.a, by1Var.b);
                                }
                                return new ez1(yy1Var4, c63Var4, setU3, linkedHashMap3, ed2Var4, linkedHashMap6, linkedHashMap7, arrayList9, linkedHashMap8);
                            }
                        }
                    }
                }
                return y20Var;
            case 4:
                list5 = this.n;
                List list20 = this.m;
                yy1 yy1Var9 = this.l;
                m02.y(obj);
                yy1Var3 = yy1Var9;
                list4 = list20;
                objP4 = obj;
                list6 = (List) objP4;
                yr yrVar5 = kz1Var.b;
                this.l = yy1Var3;
                this.m = list4;
                this.n = list5;
                this.o = list6;
                this.s = (byte) 5;
                objC = ia2.C(yrVar5.a, new nr(yrVar5, null), this);
                if (objC != y20Var) {
                    list7 = list5;
                    list8 = list6;
                    wt1 wt1Var5 = (wt1) objC;
                    list9 = (List) wt1Var5.h;
                    list10 = (List) wt1Var5.i;
                    tw1 tw1Var5 = kz1Var.c;
                    this.l = yy1Var3;
                    this.m = list4;
                    this.n = list7;
                    this.o = list8;
                    this.p = list9;
                    this.q = list10;
                    this.s = (byte) 6;
                    objC2 = ia2.C(tw1Var5.a, new lw1(tw1Var5, null), this);
                    if (objC2 != y20Var) {
                        list11 = list8;
                        list12 = list9;
                        aw1Var = (aw1) objC2;
                        sx1 sx1VarO5 = appDatabase.o();
                        this.l = yy1Var3;
                        this.m = list4;
                        this.n = list7;
                        this.o = list11;
                        this.p = list12;
                        this.q = list10;
                        this.r = aw1Var;
                        this.s = (byte) 7;
                        objB = sx1VarO5.b(this);
                        if (objB != y20Var) {
                            yy1Var4 = yy1Var3;
                            list13 = list10;
                            List<by1> list112 = (List) objB;
                            linkedHashMap = new LinkedHashMap();
                            while (r11.hasNext()) {
                                ek2Var = new ek2(p60.valueOf(xy1Var.b), te1.valueOf(xy1Var.c));
                                arrayList5 = linkedHashMap.get(ek2Var);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    linkedHashMap.put(ek2Var, arrayList5);
                                }
                                ((List) arrayList5).add(xy1Var.d);
                            }
                            iK = ee1.K(ev.o0(list7, 10));
                            if (iK < 16) {
                                iK = 16;
                            }
                            linkedHashMap2 = new LinkedHashMap(iK);
                            while (r7.hasNext()) {
                                linkedHashMap2.put(new q12(new ek2(p60.valueOf(cz1Var.b), te1.valueOf(cz1Var.c)), cz1Var.d, cz1Var.e), new Double(cz1Var.f));
                            }
                            c63 c63Var5 = new c63(linkedHashMap, linkedHashMap2);
                            arrayList = new ArrayList();
                            while (r7.hasNext()) {
                                if (((xy1) obj2).f) {
                                    arrayList.add(obj2);
                                }
                            }
                            arrayList2 = new ArrayList(ev.o0(arrayList, 10));
                            size = arrayList.size();
                            i = 0;
                            while (i < size) {
                                Object obj10 = arrayList.get(i);
                                i++;
                                xy1 xy1Var7 = (xy1) obj10;
                                arrayList2.add(new wt1(new ek2(p60.valueOf(xy1Var7.b), te1.valueOf(xy1Var7.c)), xy1Var7.d));
                            }
                            Set setU4 = dv.U0(arrayList2);
                            iK2 = ee1.K(ev.o0(list4, 10));
                            if (iK2 < 16) {
                                iK2 = 16;
                            }
                            linkedHashMap3 = new LinkedHashMap(iK2);
                            while (r6.hasNext()) {
                                linkedHashMap3.put(xy1Var3.d, xy1Var3.e);
                            }
                            linkedHashMap4 = new LinkedHashMap();
                            while (r4.hasNext()) {
                                p60VarValueOf = p60.valueOf(((wy1) obj4).b);
                                arrayList4 = linkedHashMap4.get(p60VarValueOf);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    linkedHashMap4.put(p60VarValueOf, arrayList4);
                                }
                                ((List) arrayList4).add(obj4);
                            }
                            linkedHashMap5 = new LinkedHashMap(ee1.K(linkedHashMap4.size()));
                            while (r6.hasNext()) {
                                Object key5 = entry.getKey();
                                List<wy1> list113 = (List) entry.getValue();
                                linkedHashMap9 = new LinkedHashMap();
                                while (r7.hasNext()) {
                                    te1VarValueOf = te1.valueOf(wy1Var.c);
                                    arrayList3 = linkedHashMap9.get(te1VarValueOf);
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        linkedHashMap9.put(te1VarValueOf, arrayList3);
                                    }
                                    ((List) arrayList3).add(wy1Var.d);
                                }
                                linkedHashMap5.put(key5, linkedHashMap9);
                            }
                            ed2 ed2Var5 = new ed2(linkedHashMap5);
                            iK3 = ee1.K(ev.o0(list12, 10));
                            if (iK3 < 16) {
                                iK3 = 16;
                            }
                            linkedHashMap6 = new LinkedHashMap(iK3);
                            while (r3.hasNext()) {
                                linkedHashMap6.put(((j62) obj5).a, obj5);
                            }
                            iK4 = ee1.K(ev.o0(list13, 10));
                            if (iK4 < 16) {
                                iK4 = 16;
                            }
                            linkedHashMap7 = new LinkedHashMap(iK4);
                            while (r2.hasNext()) {
                                linkedHashMap7.put(((uv0) obj6).a, obj6);
                            }
                            ArrayList arrayList10 = aw1Var.a;
                            iK5 = ee1.K(ev.o0(list112, 10));
                            if (iK5 < 16) {
                                iK5 = 16;
                            }
                            linkedHashMap8 = new LinkedHashMap(iK5);
                            while (r0.hasNext()) {
                                linkedHashMap8.put(by1Var.a, by1Var.b);
                            }
                            return new ez1(yy1Var4, c63Var5, setU4, linkedHashMap3, ed2Var5, linkedHashMap6, linkedHashMap7, arrayList10, linkedHashMap8);
                        }
                    }
                }
                return y20Var;
            case 5:
                list8 = this.o;
                list7 = this.n;
                list4 = this.m;
                yy1Var3 = this.l;
                m02.y(obj);
                objC = obj;
                wt1 wt1Var6 = (wt1) objC;
                list9 = (List) wt1Var6.h;
                list10 = (List) wt1Var6.i;
                tw1 tw1Var6 = kz1Var.c;
                this.l = yy1Var3;
                this.m = list4;
                this.n = list7;
                this.o = list8;
                this.p = list9;
                this.q = list10;
                this.s = (byte) 6;
                objC2 = ia2.C(tw1Var6.a, new lw1(tw1Var6, null), this);
                if (objC2 != y20Var) {
                    list11 = list8;
                    list12 = list9;
                    aw1Var = (aw1) objC2;
                    sx1 sx1VarO6 = appDatabase.o();
                    this.l = yy1Var3;
                    this.m = list4;
                    this.n = list7;
                    this.o = list11;
                    this.p = list12;
                    this.q = list10;
                    this.r = aw1Var;
                    this.s = (byte) 7;
                    objB = sx1VarO6.b(this);
                    if (objB != y20Var) {
                        yy1Var4 = yy1Var3;
                        list13 = list10;
                        List<by1> list114 = (List) objB;
                        linkedHashMap = new LinkedHashMap();
                        while (r11.hasNext()) {
                            ek2Var = new ek2(p60.valueOf(xy1Var.b), te1.valueOf(xy1Var.c));
                            arrayList5 = linkedHashMap.get(ek2Var);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                                linkedHashMap.put(ek2Var, arrayList5);
                            }
                            ((List) arrayList5).add(xy1Var.d);
                        }
                        iK = ee1.K(ev.o0(list7, 10));
                        if (iK < 16) {
                            iK = 16;
                        }
                        linkedHashMap2 = new LinkedHashMap(iK);
                        while (r7.hasNext()) {
                            linkedHashMap2.put(new q12(new ek2(p60.valueOf(cz1Var.b), te1.valueOf(cz1Var.c)), cz1Var.d, cz1Var.e), new Double(cz1Var.f));
                        }
                        c63 c63Var6 = new c63(linkedHashMap, linkedHashMap2);
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            if (((xy1) obj2).f) {
                                arrayList.add(obj2);
                            }
                        }
                        arrayList2 = new ArrayList(ev.o0(arrayList, 10));
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            Object obj11 = arrayList.get(i);
                            i++;
                            xy1 xy1Var8 = (xy1) obj11;
                            arrayList2.add(new wt1(new ek2(p60.valueOf(xy1Var8.b), te1.valueOf(xy1Var8.c)), xy1Var8.d));
                        }
                        Set setU5 = dv.U0(arrayList2);
                        iK2 = ee1.K(ev.o0(list4, 10));
                        if (iK2 < 16) {
                            iK2 = 16;
                        }
                        linkedHashMap3 = new LinkedHashMap(iK2);
                        while (r6.hasNext()) {
                            linkedHashMap3.put(xy1Var3.d, xy1Var3.e);
                        }
                        linkedHashMap4 = new LinkedHashMap();
                        while (r4.hasNext()) {
                            p60VarValueOf = p60.valueOf(((wy1) obj4).b);
                            arrayList4 = linkedHashMap4.get(p60VarValueOf);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                linkedHashMap4.put(p60VarValueOf, arrayList4);
                            }
                            ((List) arrayList4).add(obj4);
                        }
                        linkedHashMap5 = new LinkedHashMap(ee1.K(linkedHashMap4.size()));
                        while (r6.hasNext()) {
                            Object key6 = entry.getKey();
                            List<wy1> list115 = (List) entry.getValue();
                            linkedHashMap9 = new LinkedHashMap();
                            while (r7.hasNext()) {
                                te1VarValueOf = te1.valueOf(wy1Var.c);
                                arrayList3 = linkedHashMap9.get(te1VarValueOf);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    linkedHashMap9.put(te1VarValueOf, arrayList3);
                                }
                                ((List) arrayList3).add(wy1Var.d);
                            }
                            linkedHashMap5.put(key6, linkedHashMap9);
                        }
                        ed2 ed2Var6 = new ed2(linkedHashMap5);
                        iK3 = ee1.K(ev.o0(list12, 10));
                        if (iK3 < 16) {
                            iK3 = 16;
                        }
                        linkedHashMap6 = new LinkedHashMap(iK3);
                        while (r3.hasNext()) {
                            linkedHashMap6.put(((j62) obj5).a, obj5);
                        }
                        iK4 = ee1.K(ev.o0(list13, 10));
                        if (iK4 < 16) {
                            iK4 = 16;
                        }
                        linkedHashMap7 = new LinkedHashMap(iK4);
                        while (r2.hasNext()) {
                            linkedHashMap7.put(((uv0) obj6).a, obj6);
                        }
                        ArrayList arrayList11 = aw1Var.a;
                        iK5 = ee1.K(ev.o0(list114, 10));
                        if (iK5 < 16) {
                            iK5 = 16;
                        }
                        linkedHashMap8 = new LinkedHashMap(iK5);
                        while (r0.hasNext()) {
                            linkedHashMap8.put(by1Var.a, by1Var.b);
                        }
                        return new ez1(yy1Var4, c63Var6, setU5, linkedHashMap3, ed2Var6, linkedHashMap6, linkedHashMap7, arrayList11, linkedHashMap8);
                    }
                }
                return y20Var;
            case 6:
                List list21 = this.q;
                list12 = this.p;
                list11 = this.o;
                list7 = this.n;
                list4 = this.m;
                yy1Var3 = this.l;
                m02.y(obj);
                list10 = list21;
                objC2 = obj;
                aw1Var = (aw1) objC2;
                sx1 sx1VarO7 = appDatabase.o();
                this.l = yy1Var3;
                this.m = list4;
                this.n = list7;
                this.o = list11;
                this.p = list12;
                this.q = list10;
                this.r = aw1Var;
                this.s = (byte) 7;
                objB = sx1VarO7.b(this);
                if (objB != y20Var) {
                    yy1Var4 = yy1Var3;
                    list13 = list10;
                    List<by1> list116 = (List) objB;
                    linkedHashMap = new LinkedHashMap();
                    while (r11.hasNext()) {
                        ek2Var = new ek2(p60.valueOf(xy1Var.b), te1.valueOf(xy1Var.c));
                        arrayList5 = linkedHashMap.get(ek2Var);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            linkedHashMap.put(ek2Var, arrayList5);
                        }
                        ((List) arrayList5).add(xy1Var.d);
                    }
                    iK = ee1.K(ev.o0(list7, 10));
                    if (iK < 16) {
                        iK = 16;
                    }
                    linkedHashMap2 = new LinkedHashMap(iK);
                    while (r7.hasNext()) {
                        linkedHashMap2.put(new q12(new ek2(p60.valueOf(cz1Var.b), te1.valueOf(cz1Var.c)), cz1Var.d, cz1Var.e), new Double(cz1Var.f));
                    }
                    c63 c63Var7 = new c63(linkedHashMap, linkedHashMap2);
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (((xy1) obj2).f) {
                            arrayList.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList(ev.o0(arrayList, 10));
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        Object obj12 = arrayList.get(i);
                        i++;
                        xy1 xy1Var9 = (xy1) obj12;
                        arrayList2.add(new wt1(new ek2(p60.valueOf(xy1Var9.b), te1.valueOf(xy1Var9.c)), xy1Var9.d));
                    }
                    Set setU6 = dv.U0(arrayList2);
                    iK2 = ee1.K(ev.o0(list4, 10));
                    if (iK2 < 16) {
                        iK2 = 16;
                    }
                    linkedHashMap3 = new LinkedHashMap(iK2);
                    while (r6.hasNext()) {
                        linkedHashMap3.put(xy1Var3.d, xy1Var3.e);
                    }
                    linkedHashMap4 = new LinkedHashMap();
                    while (r4.hasNext()) {
                        p60VarValueOf = p60.valueOf(((wy1) obj4).b);
                        arrayList4 = linkedHashMap4.get(p60VarValueOf);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap4.put(p60VarValueOf, arrayList4);
                        }
                        ((List) arrayList4).add(obj4);
                    }
                    linkedHashMap5 = new LinkedHashMap(ee1.K(linkedHashMap4.size()));
                    while (r6.hasNext()) {
                        Object key7 = entry.getKey();
                        List<wy1> list117 = (List) entry.getValue();
                        linkedHashMap9 = new LinkedHashMap();
                        while (r7.hasNext()) {
                            te1VarValueOf = te1.valueOf(wy1Var.c);
                            arrayList3 = linkedHashMap9.get(te1VarValueOf);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                linkedHashMap9.put(te1VarValueOf, arrayList3);
                            }
                            ((List) arrayList3).add(wy1Var.d);
                        }
                        linkedHashMap5.put(key7, linkedHashMap9);
                    }
                    ed2 ed2Var7 = new ed2(linkedHashMap5);
                    iK3 = ee1.K(ev.o0(list12, 10));
                    if (iK3 < 16) {
                        iK3 = 16;
                    }
                    linkedHashMap6 = new LinkedHashMap(iK3);
                    while (r3.hasNext()) {
                        linkedHashMap6.put(((j62) obj5).a, obj5);
                    }
                    iK4 = ee1.K(ev.o0(list13, 10));
                    if (iK4 < 16) {
                        iK4 = 16;
                    }
                    linkedHashMap7 = new LinkedHashMap(iK4);
                    while (r2.hasNext()) {
                        linkedHashMap7.put(((uv0) obj6).a, obj6);
                    }
                    ArrayList arrayList12 = aw1Var.a;
                    iK5 = ee1.K(ev.o0(list116, 10));
                    if (iK5 < 16) {
                        iK5 = 16;
                    }
                    linkedHashMap8 = new LinkedHashMap(iK5);
                    while (r0.hasNext()) {
                        linkedHashMap8.put(by1Var.a, by1Var.b);
                    }
                    return new ez1(yy1Var4, c63Var7, setU6, linkedHashMap3, ed2Var7, linkedHashMap6, linkedHashMap7, arrayList12, linkedHashMap8);
                }
                return y20Var;
            case 7:
                aw1Var = this.r;
                list13 = this.q;
                list12 = this.p;
                list11 = this.o;
                list7 = this.n;
                List list22 = this.m;
                yy1 yy1Var10 = this.l;
                m02.y(obj);
                list4 = list22;
                yy1Var4 = yy1Var10;
                objB = obj;
                List<by1> list118 = (List) objB;
                linkedHashMap = new LinkedHashMap();
                while (r11.hasNext()) {
                    ek2Var = new ek2(p60.valueOf(xy1Var.b), te1.valueOf(xy1Var.c));
                    arrayList5 = linkedHashMap.get(ek2Var);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(ek2Var, arrayList5);
                    }
                    ((List) arrayList5).add(xy1Var.d);
                }
                iK = ee1.K(ev.o0(list7, 10));
                if (iK < 16) {
                    iK = 16;
                }
                linkedHashMap2 = new LinkedHashMap(iK);
                while (r7.hasNext()) {
                    linkedHashMap2.put(new q12(new ek2(p60.valueOf(cz1Var.b), te1.valueOf(cz1Var.c)), cz1Var.d, cz1Var.e), new Double(cz1Var.f));
                }
                c63 c63Var8 = new c63(linkedHashMap, linkedHashMap2);
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    if (((xy1) obj2).f) {
                        arrayList.add(obj2);
                    }
                }
                arrayList2 = new ArrayList(ev.o0(arrayList, 10));
                size = arrayList.size();
                i = 0;
                while (i < size) {
                    Object obj13 = arrayList.get(i);
                    i++;
                    xy1 xy1Var10 = (xy1) obj13;
                    arrayList2.add(new wt1(new ek2(p60.valueOf(xy1Var10.b), te1.valueOf(xy1Var10.c)), xy1Var10.d));
                }
                Set setU7 = dv.U0(arrayList2);
                iK2 = ee1.K(ev.o0(list4, 10));
                if (iK2 < 16) {
                    iK2 = 16;
                }
                linkedHashMap3 = new LinkedHashMap(iK2);
                while (r6.hasNext()) {
                    linkedHashMap3.put(xy1Var3.d, xy1Var3.e);
                }
                linkedHashMap4 = new LinkedHashMap();
                while (r4.hasNext()) {
                    p60VarValueOf = p60.valueOf(((wy1) obj4).b);
                    arrayList4 = linkedHashMap4.get(p60VarValueOf);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap4.put(p60VarValueOf, arrayList4);
                    }
                    ((List) arrayList4).add(obj4);
                }
                linkedHashMap5 = new LinkedHashMap(ee1.K(linkedHashMap4.size()));
                while (r6.hasNext()) {
                    Object key8 = entry.getKey();
                    List<wy1> list119 = (List) entry.getValue();
                    linkedHashMap9 = new LinkedHashMap();
                    while (r7.hasNext()) {
                        te1VarValueOf = te1.valueOf(wy1Var.c);
                        arrayList3 = linkedHashMap9.get(te1VarValueOf);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap9.put(te1VarValueOf, arrayList3);
                        }
                        ((List) arrayList3).add(wy1Var.d);
                    }
                    linkedHashMap5.put(key8, linkedHashMap9);
                }
                ed2 ed2Var8 = new ed2(linkedHashMap5);
                iK3 = ee1.K(ev.o0(list12, 10));
                if (iK3 < 16) {
                    iK3 = 16;
                }
                linkedHashMap6 = new LinkedHashMap(iK3);
                while (r3.hasNext()) {
                    linkedHashMap6.put(((j62) obj5).a, obj5);
                }
                iK4 = ee1.K(ev.o0(list13, 10));
                if (iK4 < 16) {
                    iK4 = 16;
                }
                linkedHashMap7 = new LinkedHashMap(iK4);
                while (r2.hasNext()) {
                    linkedHashMap7.put(((uv0) obj6).a, obj6);
                }
                ArrayList arrayList13 = aw1Var.a;
                iK5 = ee1.K(ev.o0(list118, 10));
                if (iK5 < 16) {
                    iK5 = 16;
                }
                linkedHashMap8 = new LinkedHashMap(iK5);
                while (r0.hasNext()) {
                    linkedHashMap8.put(by1Var.a, by1Var.b);
                }
                return new ez1(yy1Var4, c63Var8, setU7, linkedHashMap3, ed2Var8, linkedHashMap6, linkedHashMap7, arrayList13, linkedHashMap8);
            default:
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
