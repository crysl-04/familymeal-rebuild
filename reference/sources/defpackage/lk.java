package defpackage;

import com.familymeal.app.data.db.AppDatabase;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lk extends mq2 implements vp0 {
    public LinkedHashMap l;
    public OffsetDateTime m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public boolean r;
    public byte s;
    public final /* synthetic */ ok t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(ok okVar, boolean z, m10 m10Var) {
        super(1, m10Var);
        this.t = okVar;
        this.u = z;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        return new lk(this.t, this.u, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f2 A[LOOP:7: B:25:0x00ec->B:27:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x011e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0139  */
    /* JADX WARN: Code duplicated, block: B:36:0x0149  */
    /* JADX WARN: Code duplicated, block: B:40:0x016a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0182 A[LOOP:5: B:42:0x017c->B:44:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ce A[LOOP:4: B:49:0x01c8->B:51:0x01ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0212  */
    /* JADX WARN: Code duplicated, block: B:58:0x022c  */
    /* JADX WARN: Code duplicated, block: B:62:0x023c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0253  */
    /* JADX WARN: Code duplicated, block: B:68:0x0263  */
    /* JADX WARN: Code duplicated, block: B:71:0x027a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0295  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c7 A[LOOP:3: B:78:0x02c5->B:79:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x02f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x014b A[SYNTHETIC] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object objP;
        LinkedHashMap linkedHashMap;
        OffsetDateTime offsetDateTimeNow;
        Object objA;
        LinkedHashMap linkedHashMap2;
        OffsetDateTime offsetDateTime;
        boolean z;
        String str;
        Object arrayList;
        ArrayList arrayList2;
        Iterator it;
        Object objP2;
        OffsetDateTime offsetDateTime2;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap3;
        ArrayList arrayList4;
        Object objB;
        OffsetDateTime offsetDateTime3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List list;
        ArrayList arrayList7;
        Iterator it2;
        Object objP3;
        ArrayList arrayList8;
        ArrayList arrayList9;
        OffsetDateTime offsetDateTime4;
        ArrayList arrayList10;
        ArrayList arrayList11;
        Object objP4;
        boolean z2;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        OffsetDateTime offsetDateTime5;
        ArrayList arrayList15;
        List list2;
        LinkedHashMap linkedHashMap4;
        int iK;
        int i;
        z zVar;
        gk gkVar;
        p60 p60Var;
        LinkedHashMap linkedHashMap5;
        int iK2;
        z zVar2;
        ArrayList arrayList16;
        ArrayList arrayList17;
        int size;
        int i2;
        kd2 kd2Var;
        AppDatabase appDatabase = this.t.b;
        byte b = this.s;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                m02.y(obj);
                m62 m62VarQ = appDatabase.q();
                this.s = (byte) 1;
                objP = cu.P(this, new vw1((byte) 17), m62VarQ.a, true, false);
                if (objP != y20Var) {
                    linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : (Iterable) objP) {
                        str = ((d72) obj2).a;
                        arrayList = linkedHashMap.get(str);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(str, arrayList);
                        }
                        ((List) arrayList).add(obj2);
                    }
                    offsetDateTimeNow = OffsetDateTime.now();
                    offsetDateTimeNow.getClass();
                    yv0 yv0VarM = appDatabase.m();
                    this.l = linkedHashMap;
                    this.m = offsetDateTimeNow;
                    this.r = true;
                    this.s = (byte) 2;
                    objA = yv0VarM.a(this);
                    if (objA != y20Var) {
                        linkedHashMap2 = linkedHashMap;
                        offsetDateTime = offsetDateTimeNow;
                        z = true;
                        Iterable iterable = (Iterable) objA;
                        arrayList2 = new ArrayList(ev.o0(iterable, 10));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(cu.i0((mw0) it.next()));
                        }
                        m62 m62VarQ2 = appDatabase.q();
                        this.l = linkedHashMap2;
                        this.m = offsetDateTime;
                        this.n = arrayList2;
                        this.r = z;
                        this.s = (byte) 3;
                        objP2 = cu.P(this, new vw1((byte) 18), m62VarQ2.a, true, false);
                        if (objP2 != y20Var) {
                            LinkedHashMap linkedHashMap6 = linkedHashMap2;
                            offsetDateTime2 = offsetDateTime;
                            arrayList3 = arrayList2;
                            linkedHashMap3 = linkedHashMap6;
                            Iterable<y62> iterable2 = (Iterable) objP2;
                            arrayList4 = new ArrayList(ev.o0(iterable2, 10));
                            for (y62 y62Var : iterable2) {
                                list = (List) linkedHashMap3.get(y62Var.a);
                                if (list == null) {
                                    list = ag0.h;
                                }
                                arrayList4.add(cu.k0(y62Var, list));
                            }
                            sx1 sx1VarO = appDatabase.o();
                            this.l = null;
                            this.m = offsetDateTime2;
                            this.n = arrayList3;
                            this.o = arrayList4;
                            this.r = z;
                            this.s = (byte) 4;
                            objB = sx1VarO.b(this);
                            if (objB != y20Var) {
                                offsetDateTime3 = offsetDateTime2;
                                arrayList5 = arrayList3;
                                arrayList6 = arrayList4;
                                Iterable iterable3 = (Iterable) objB;
                                arrayList7 = new ArrayList(ev.o0(iterable3, 10));
                                it2 = iterable3.iterator();
                                while (it2.hasNext()) {
                                    arrayList7.add(cu.j0((by1) it2.next()));
                                }
                                r63 r63VarT = appDatabase.t();
                                this.l = null;
                                this.m = offsetDateTime3;
                                this.n = arrayList5;
                                this.o = arrayList6;
                                this.p = arrayList7;
                                this.r = z;
                                this.s = (byte) 5;
                                objP3 = cu.P(this, new h33((byte) 12), r63VarT.a, true, false);
                                if (objP3 != y20Var) {
                                    ArrayList arrayList18 = arrayList5;
                                    arrayList8 = arrayList6;
                                    arrayList9 = arrayList7;
                                    offsetDateTime4 = offsetDateTime3;
                                    arrayList10 = arrayList18;
                                    Iterable<s63> iterable4 = (Iterable) objP3;
                                    arrayList11 = new ArrayList(ev.o0(iterable4, 10));
                                    for (s63 s63Var : iterable4) {
                                        String str2 = s63Var.a;
                                        LocalDate localDate = LocalDate.parse(s63Var.b);
                                        localDate.getClass();
                                        arrayList11.add(new u63(str2, localDate, s63Var.c));
                                    }
                                    fd2 fd2VarS = appDatabase.s();
                                    this.l = null;
                                    this.m = offsetDateTime4;
                                    this.n = arrayList10;
                                    this.o = arrayList8;
                                    this.p = arrayList9;
                                    this.q = arrayList11;
                                    this.r = z;
                                    this.s = (byte) 6;
                                    objP4 = cu.P(this, new jc2((byte) 14), fd2VarS.a, true, false);
                                    if (objP4 != y20Var) {
                                        z2 = z;
                                        arrayList12 = arrayList9;
                                        arrayList13 = arrayList8;
                                        arrayList14 = arrayList10;
                                        offsetDateTime5 = offsetDateTime4;
                                        arrayList15 = arrayList11;
                                        list2 = (List) objP4;
                                        lh0 lh0Var = p60.p;
                                        iK = ee1.K(ev.o0(lh0Var, 10));
                                        i = 16;
                                        if (iK < 16) {
                                            iK = 16;
                                        }
                                        linkedHashMap4 = new LinkedHashMap(iK);
                                        zVar = new z(lh0Var, (byte) 0);
                                        while (zVar.hasNext()) {
                                            Object next = zVar.next();
                                            p60Var = (p60) next;
                                            lh0 lh0Var2 = te1.o;
                                            iK2 = ee1.K(ev.o0(lh0Var2, 10));
                                            if (iK2 < i) {
                                                iK2 = i;
                                            }
                                            linkedHashMap5 = new LinkedHashMap(iK2);
                                            zVar2 = new z(lh0Var2, (byte) 0);
                                            while (zVar2.hasNext()) {
                                                Object next2 = zVar2.next();
                                                te1 te1Var = (te1) next2;
                                                arrayList16 = new ArrayList();
                                                for (Object obj3 : list2) {
                                                    List list3 = list2;
                                                    OffsetDateTime offsetDateTime6 = offsetDateTime5;
                                                    kd2Var = (kd2) obj3;
                                                    boolean z3 = z2;
                                                    ArrayList arrayList19 = arrayList14;
                                                    if (!uz0.g(kd2Var.a, p60Var.name()) && uz0.g(kd2Var.b, te1Var.name())) {
                                                        arrayList16.add(obj3);
                                                    }
                                                    list2 = list3;
                                                    offsetDateTime5 = offsetDateTime6;
                                                    z2 = z3;
                                                    arrayList14 = arrayList19;
                                                }
                                                List list4 = list2;
                                                OffsetDateTime offsetDateTime7 = offsetDateTime5;
                                                boolean z4 = z2;
                                                ArrayList arrayList20 = arrayList14;
                                                arrayList17 = new ArrayList(ev.o0(arrayList16, 10));
                                                size = arrayList16.size();
                                                i2 = 0;
                                                while (i2 < size) {
                                                    Object obj4 = arrayList16.get(i2);
                                                    i2++;
                                                    arrayList17.add(((kd2) obj4).c);
                                                }
                                                linkedHashMap5.put(next2, arrayList17);
                                                list2 = list4;
                                                offsetDateTime5 = offsetDateTime7;
                                                z2 = z4;
                                                arrayList14 = arrayList20;
                                            }
                                            linkedHashMap4.put(next, linkedHashMap5);
                                            i = 16;
                                        }
                                        gkVar = new gk(offsetDateTime5, z2, arrayList14, arrayList13, arrayList12, arrayList15, new ed2(linkedHashMap4));
                                        if (this.u) {
                                            return gkVar;
                                        }
                                        return gkVar.a();
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
                linkedHashMap = new LinkedHashMap();
                while (r2.hasNext()) {
                    str = ((d72) obj2).a;
                    arrayList = linkedHashMap.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(str, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                offsetDateTimeNow = OffsetDateTime.now();
                offsetDateTimeNow.getClass();
                yv0 yv0VarM2 = appDatabase.m();
                this.l = linkedHashMap;
                this.m = offsetDateTimeNow;
                this.r = true;
                this.s = (byte) 2;
                objA = yv0VarM2.a(this);
                if (objA != y20Var) {
                    linkedHashMap2 = linkedHashMap;
                    offsetDateTime = offsetDateTimeNow;
                    z = true;
                    Iterable iterable5 = (Iterable) objA;
                    arrayList2 = new ArrayList(ev.o0(iterable5, 10));
                    it = iterable5.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(cu.i0((mw0) it.next()));
                    }
                    m62 m62VarQ3 = appDatabase.q();
                    this.l = linkedHashMap2;
                    this.m = offsetDateTime;
                    this.n = arrayList2;
                    this.r = z;
                    this.s = (byte) 3;
                    objP2 = cu.P(this, new vw1((byte) 18), m62VarQ3.a, true, false);
                    if (objP2 != y20Var) {
                        LinkedHashMap linkedHashMap7 = linkedHashMap2;
                        offsetDateTime2 = offsetDateTime;
                        arrayList3 = arrayList2;
                        linkedHashMap3 = linkedHashMap7;
                        Iterable<y62> iterable6 = (Iterable) objP2;
                        arrayList4 = new ArrayList(ev.o0(iterable6, 10));
                        while (r9.hasNext()) {
                            list = (List) linkedHashMap3.get(y62Var.a);
                            if (list == null) {
                                list = ag0.h;
                            }
                            arrayList4.add(cu.k0(y62Var, list));
                        }
                        sx1 sx1VarO2 = appDatabase.o();
                        this.l = null;
                        this.m = offsetDateTime2;
                        this.n = arrayList3;
                        this.o = arrayList4;
                        this.r = z;
                        this.s = (byte) 4;
                        objB = sx1VarO2.b(this);
                        if (objB != y20Var) {
                            offsetDateTime3 = offsetDateTime2;
                            arrayList5 = arrayList3;
                            arrayList6 = arrayList4;
                            Iterable iterable7 = (Iterable) objB;
                            arrayList7 = new ArrayList(ev.o0(iterable7, 10));
                            it2 = iterable7.iterator();
                            while (it2.hasNext()) {
                                arrayList7.add(cu.j0((by1) it2.next()));
                            }
                            r63 r63VarT2 = appDatabase.t();
                            this.l = null;
                            this.m = offsetDateTime3;
                            this.n = arrayList5;
                            this.o = arrayList6;
                            this.p = arrayList7;
                            this.r = z;
                            this.s = (byte) 5;
                            objP3 = cu.P(this, new h33((byte) 12), r63VarT2.a, true, false);
                            if (objP3 != y20Var) {
                                ArrayList arrayList110 = arrayList5;
                                arrayList8 = arrayList6;
                                arrayList9 = arrayList7;
                                offsetDateTime4 = offsetDateTime3;
                                arrayList10 = arrayList110;
                                Iterable<s63> iterable8 = (Iterable) objP3;
                                arrayList11 = new ArrayList(ev.o0(iterable8, 10));
                                while (r9.hasNext()) {
                                    String str3 = s63Var.a;
                                    LocalDate localDate2 = LocalDate.parse(s63Var.b);
                                    localDate2.getClass();
                                    arrayList11.add(new u63(str3, localDate2, s63Var.c));
                                }
                                fd2 fd2VarS2 = appDatabase.s();
                                this.l = null;
                                this.m = offsetDateTime4;
                                this.n = arrayList10;
                                this.o = arrayList8;
                                this.p = arrayList9;
                                this.q = arrayList11;
                                this.r = z;
                                this.s = (byte) 6;
                                objP4 = cu.P(this, new jc2((byte) 14), fd2VarS2.a, true, false);
                                if (objP4 != y20Var) {
                                    z2 = z;
                                    arrayList12 = arrayList9;
                                    arrayList13 = arrayList8;
                                    arrayList14 = arrayList10;
                                    offsetDateTime5 = offsetDateTime4;
                                    arrayList15 = arrayList11;
                                    list2 = (List) objP4;
                                    lh0 lh0Var3 = p60.p;
                                    iK = ee1.K(ev.o0(lh0Var3, 10));
                                    i = 16;
                                    if (iK < 16) {
                                        iK = 16;
                                    }
                                    linkedHashMap4 = new LinkedHashMap(iK);
                                    zVar = new z(lh0Var3, (byte) 0);
                                    while (zVar.hasNext()) {
                                        Object next3 = zVar.next();
                                        p60Var = (p60) next3;
                                        lh0 lh0Var4 = te1.o;
                                        iK2 = ee1.K(ev.o0(lh0Var4, 10));
                                        if (iK2 < i) {
                                            iK2 = i;
                                        }
                                        linkedHashMap5 = new LinkedHashMap(iK2);
                                        zVar2 = new z(lh0Var4, (byte) 0);
                                        while (zVar2.hasNext()) {
                                            Object next4 = zVar2.next();
                                            te1 te1Var2 = (te1) next4;
                                            arrayList16 = new ArrayList();
                                            while (r19.hasNext()) {
                                                List list5 = list2;
                                                OffsetDateTime offsetDateTime8 = offsetDateTime5;
                                                kd2Var = (kd2) obj3;
                                                boolean z5 = z2;
                                                ArrayList arrayList111 = arrayList14;
                                                if (!uz0.g(kd2Var.a, p60Var.name())) {
                                                }
                                                list2 = list5;
                                                offsetDateTime5 = offsetDateTime8;
                                                z2 = z5;
                                                arrayList14 = arrayList111;
                                            }
                                            List list6 = list2;
                                            OffsetDateTime offsetDateTime9 = offsetDateTime5;
                                            boolean z6 = z2;
                                            ArrayList arrayList21 = arrayList14;
                                            arrayList17 = new ArrayList(ev.o0(arrayList16, 10));
                                            size = arrayList16.size();
                                            i2 = 0;
                                            while (i2 < size) {
                                                Object obj5 = arrayList16.get(i2);
                                                i2++;
                                                arrayList17.add(((kd2) obj5).c);
                                            }
                                            linkedHashMap5.put(next4, arrayList17);
                                            list2 = list6;
                                            offsetDateTime5 = offsetDateTime9;
                                            z2 = z6;
                                            arrayList14 = arrayList21;
                                        }
                                        linkedHashMap4.put(next3, linkedHashMap5);
                                        i = 16;
                                    }
                                    gkVar = new gk(offsetDateTime5, z2, arrayList14, arrayList13, arrayList12, arrayList15, new ed2(linkedHashMap4));
                                    if (this.u) {
                                        return gkVar;
                                    }
                                    return gkVar.a();
                                }
                            }
                        }
                    }
                }
                return y20Var;
            case 2:
                z = this.r;
                offsetDateTime = this.m;
                LinkedHashMap linkedHashMap8 = this.l;
                m02.y(obj);
                linkedHashMap2 = linkedHashMap8;
                objA = obj;
                Iterable iterable9 = (Iterable) objA;
                arrayList2 = new ArrayList(ev.o0(iterable9, 10));
                it = iterable9.iterator();
                while (it.hasNext()) {
                    arrayList2.add(cu.i0((mw0) it.next()));
                }
                m62 m62VarQ4 = appDatabase.q();
                this.l = linkedHashMap2;
                this.m = offsetDateTime;
                this.n = arrayList2;
                this.r = z;
                this.s = (byte) 3;
                objP2 = cu.P(this, new vw1((byte) 18), m62VarQ4.a, true, false);
                if (objP2 != y20Var) {
                    LinkedHashMap linkedHashMap9 = linkedHashMap2;
                    offsetDateTime2 = offsetDateTime;
                    arrayList3 = arrayList2;
                    linkedHashMap3 = linkedHashMap9;
                    Iterable<y62> iterable10 = (Iterable) objP2;
                    arrayList4 = new ArrayList(ev.o0(iterable10, 10));
                    while (r9.hasNext()) {
                        list = (List) linkedHashMap3.get(y62Var.a);
                        if (list == null) {
                            list = ag0.h;
                        }
                        arrayList4.add(cu.k0(y62Var, list));
                    }
                    sx1 sx1VarO3 = appDatabase.o();
                    this.l = null;
                    this.m = offsetDateTime2;
                    this.n = arrayList3;
                    this.o = arrayList4;
                    this.r = z;
                    this.s = (byte) 4;
                    objB = sx1VarO3.b(this);
                    if (objB != y20Var) {
                        offsetDateTime3 = offsetDateTime2;
                        arrayList5 = arrayList3;
                        arrayList6 = arrayList4;
                        Iterable iterable11 = (Iterable) objB;
                        arrayList7 = new ArrayList(ev.o0(iterable11, 10));
                        it2 = iterable11.iterator();
                        while (it2.hasNext()) {
                            arrayList7.add(cu.j0((by1) it2.next()));
                        }
                        r63 r63VarT3 = appDatabase.t();
                        this.l = null;
                        this.m = offsetDateTime3;
                        this.n = arrayList5;
                        this.o = arrayList6;
                        this.p = arrayList7;
                        this.r = z;
                        this.s = (byte) 5;
                        objP3 = cu.P(this, new h33((byte) 12), r63VarT3.a, true, false);
                        if (objP3 != y20Var) {
                            ArrayList arrayList112 = arrayList5;
                            arrayList8 = arrayList6;
                            arrayList9 = arrayList7;
                            offsetDateTime4 = offsetDateTime3;
                            arrayList10 = arrayList112;
                            Iterable<s63> iterable12 = (Iterable) objP3;
                            arrayList11 = new ArrayList(ev.o0(iterable12, 10));
                            while (r9.hasNext()) {
                                String str4 = s63Var.a;
                                LocalDate localDate3 = LocalDate.parse(s63Var.b);
                                localDate3.getClass();
                                arrayList11.add(new u63(str4, localDate3, s63Var.c));
                            }
                            fd2 fd2VarS3 = appDatabase.s();
                            this.l = null;
                            this.m = offsetDateTime4;
                            this.n = arrayList10;
                            this.o = arrayList8;
                            this.p = arrayList9;
                            this.q = arrayList11;
                            this.r = z;
                            this.s = (byte) 6;
                            objP4 = cu.P(this, new jc2((byte) 14), fd2VarS3.a, true, false);
                            if (objP4 != y20Var) {
                                z2 = z;
                                arrayList12 = arrayList9;
                                arrayList13 = arrayList8;
                                arrayList14 = arrayList10;
                                offsetDateTime5 = offsetDateTime4;
                                arrayList15 = arrayList11;
                                list2 = (List) objP4;
                                lh0 lh0Var5 = p60.p;
                                iK = ee1.K(ev.o0(lh0Var5, 10));
                                i = 16;
                                if (iK < 16) {
                                    iK = 16;
                                }
                                linkedHashMap4 = new LinkedHashMap(iK);
                                zVar = new z(lh0Var5, (byte) 0);
                                while (zVar.hasNext()) {
                                    Object next5 = zVar.next();
                                    p60Var = (p60) next5;
                                    lh0 lh0Var6 = te1.o;
                                    iK2 = ee1.K(ev.o0(lh0Var6, 10));
                                    if (iK2 < i) {
                                        iK2 = i;
                                    }
                                    linkedHashMap5 = new LinkedHashMap(iK2);
                                    zVar2 = new z(lh0Var6, (byte) 0);
                                    while (zVar2.hasNext()) {
                                        Object next6 = zVar2.next();
                                        te1 te1Var3 = (te1) next6;
                                        arrayList16 = new ArrayList();
                                        while (r19.hasNext()) {
                                            List list7 = list2;
                                            OffsetDateTime offsetDateTime10 = offsetDateTime5;
                                            kd2Var = (kd2) obj3;
                                            boolean z7 = z2;
                                            ArrayList arrayList113 = arrayList14;
                                            if (!uz0.g(kd2Var.a, p60Var.name())) {
                                            }
                                            list2 = list7;
                                            offsetDateTime5 = offsetDateTime10;
                                            z2 = z7;
                                            arrayList14 = arrayList113;
                                        }
                                        List list8 = list2;
                                        OffsetDateTime offsetDateTime11 = offsetDateTime5;
                                        boolean z8 = z2;
                                        ArrayList arrayList22 = arrayList14;
                                        arrayList17 = new ArrayList(ev.o0(arrayList16, 10));
                                        size = arrayList16.size();
                                        i2 = 0;
                                        while (i2 < size) {
                                            Object obj6 = arrayList16.get(i2);
                                            i2++;
                                            arrayList17.add(((kd2) obj6).c);
                                        }
                                        linkedHashMap5.put(next6, arrayList17);
                                        list2 = list8;
                                        offsetDateTime5 = offsetDateTime11;
                                        z2 = z8;
                                        arrayList14 = arrayList22;
                                    }
                                    linkedHashMap4.put(next5, linkedHashMap5);
                                    i = 16;
                                }
                                gkVar = new gk(offsetDateTime5, z2, arrayList14, arrayList13, arrayList12, arrayList15, new ed2(linkedHashMap4));
                                if (this.u) {
                                    return gkVar;
                                }
                                return gkVar.a();
                            }
                        }
                    }
                }
                return y20Var;
            case 3:
                z = this.r;
                arrayList3 = this.n;
                OffsetDateTime offsetDateTime12 = this.m;
                LinkedHashMap linkedHashMap10 = this.l;
                m02.y(obj);
                linkedHashMap3 = linkedHashMap10;
                offsetDateTime2 = offsetDateTime12;
                objP2 = obj;
                Iterable<y62> iterable13 = (Iterable) objP2;
                arrayList4 = new ArrayList(ev.o0(iterable13, 10));
                while (r9.hasNext()) {
                    list = (List) linkedHashMap3.get(y62Var.a);
                    if (list == null) {
                        list = ag0.h;
                    }
                    arrayList4.add(cu.k0(y62Var, list));
                }
                sx1 sx1VarO4 = appDatabase.o();
                this.l = null;
                this.m = offsetDateTime2;
                this.n = arrayList3;
                this.o = arrayList4;
                this.r = z;
                this.s = (byte) 4;
                objB = sx1VarO4.b(this);
                if (objB != y20Var) {
                    offsetDateTime3 = offsetDateTime2;
                    arrayList5 = arrayList3;
                    arrayList6 = arrayList4;
                    Iterable iterable14 = (Iterable) objB;
                    arrayList7 = new ArrayList(ev.o0(iterable14, 10));
                    it2 = iterable14.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(cu.j0((by1) it2.next()));
                    }
                    r63 r63VarT4 = appDatabase.t();
                    this.l = null;
                    this.m = offsetDateTime3;
                    this.n = arrayList5;
                    this.o = arrayList6;
                    this.p = arrayList7;
                    this.r = z;
                    this.s = (byte) 5;
                    objP3 = cu.P(this, new h33((byte) 12), r63VarT4.a, true, false);
                    if (objP3 != y20Var) {
                        ArrayList arrayList114 = arrayList5;
                        arrayList8 = arrayList6;
                        arrayList9 = arrayList7;
                        offsetDateTime4 = offsetDateTime3;
                        arrayList10 = arrayList114;
                        Iterable<s63> iterable15 = (Iterable) objP3;
                        arrayList11 = new ArrayList(ev.o0(iterable15, 10));
                        while (r9.hasNext()) {
                            String str5 = s63Var.a;
                            LocalDate localDate4 = LocalDate.parse(s63Var.b);
                            localDate4.getClass();
                            arrayList11.add(new u63(str5, localDate4, s63Var.c));
                        }
                        fd2 fd2VarS4 = appDatabase.s();
                        this.l = null;
                        this.m = offsetDateTime4;
                        this.n = arrayList10;
                        this.o = arrayList8;
                        this.p = arrayList9;
                        this.q = arrayList11;
                        this.r = z;
                        this.s = (byte) 6;
                        objP4 = cu.P(this, new jc2((byte) 14), fd2VarS4.a, true, false);
                        if (objP4 != y20Var) {
                            z2 = z;
                            arrayList12 = arrayList9;
                            arrayList13 = arrayList8;
                            arrayList14 = arrayList10;
                            offsetDateTime5 = offsetDateTime4;
                            arrayList15 = arrayList11;
                            list2 = (List) objP4;
                            lh0 lh0Var7 = p60.p;
                            iK = ee1.K(ev.o0(lh0Var7, 10));
                            i = 16;
                            if (iK < 16) {
                                iK = 16;
                            }
                            linkedHashMap4 = new LinkedHashMap(iK);
                            zVar = new z(lh0Var7, (byte) 0);
                            while (zVar.hasNext()) {
                                Object next7 = zVar.next();
                                p60Var = (p60) next7;
                                lh0 lh0Var8 = te1.o;
                                iK2 = ee1.K(ev.o0(lh0Var8, 10));
                                if (iK2 < i) {
                                    iK2 = i;
                                }
                                linkedHashMap5 = new LinkedHashMap(iK2);
                                zVar2 = new z(lh0Var8, (byte) 0);
                                while (zVar2.hasNext()) {
                                    Object next8 = zVar2.next();
                                    te1 te1Var4 = (te1) next8;
                                    arrayList16 = new ArrayList();
                                    while (r19.hasNext()) {
                                        List list9 = list2;
                                        OffsetDateTime offsetDateTime13 = offsetDateTime5;
                                        kd2Var = (kd2) obj3;
                                        boolean z9 = z2;
                                        ArrayList arrayList115 = arrayList14;
                                        if (!uz0.g(kd2Var.a, p60Var.name())) {
                                        }
                                        list2 = list9;
                                        offsetDateTime5 = offsetDateTime13;
                                        z2 = z9;
                                        arrayList14 = arrayList115;
                                    }
                                    List list10 = list2;
                                    OffsetDateTime offsetDateTime14 = offsetDateTime5;
                                    boolean z10 = z2;
                                    ArrayList arrayList23 = arrayList14;
                                    arrayList17 = new ArrayList(ev.o0(arrayList16, 10));
                                    size = arrayList16.size();
                                    i2 = 0;
                                    while (i2 < size) {
                                        Object obj7 = arrayList16.get(i2);
                                        i2++;
                                        arrayList17.add(((kd2) obj7).c);
                                    }
                                    linkedHashMap5.put(next8, arrayList17);
                                    list2 = list10;
                                    offsetDateTime5 = offsetDateTime14;
                                    z2 = z10;
                                    arrayList14 = arrayList23;
                                }
                                linkedHashMap4.put(next7, linkedHashMap5);
                                i = 16;
                            }
                            gkVar = new gk(offsetDateTime5, z2, arrayList14, arrayList13, arrayList12, arrayList15, new ed2(linkedHashMap4));
                            if (this.u) {
                                return gkVar;
                            }
                            return gkVar.a();
                        }
                    }
                }
                return y20Var;
            case 4:
                z = this.r;
                arrayList6 = this.o;
                ArrayList arrayList24 = this.n;
                OffsetDateTime offsetDateTime15 = this.m;
                m02.y(obj);
                offsetDateTime3 = offsetDateTime15;
                arrayList5 = arrayList24;
                objB = obj;
                Iterable iterable16 = (Iterable) objB;
                arrayList7 = new ArrayList(ev.o0(iterable16, 10));
                it2 = iterable16.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(cu.j0((by1) it2.next()));
                }
                r63 r63VarT5 = appDatabase.t();
                this.l = null;
                this.m = offsetDateTime3;
                this.n = arrayList5;
                this.o = arrayList6;
                this.p = arrayList7;
                this.r = z;
                this.s = (byte) 5;
                objP3 = cu.P(this, new h33((byte) 12), r63VarT5.a, true, false);
                if (objP3 != y20Var) {
                    ArrayList arrayList116 = arrayList5;
                    arrayList8 = arrayList6;
                    arrayList9 = arrayList7;
                    offsetDateTime4 = offsetDateTime3;
                    arrayList10 = arrayList116;
                    Iterable<s63> iterable17 = (Iterable) objP3;
                    arrayList11 = new ArrayList(ev.o0(iterable17, 10));
                    while (r9.hasNext()) {
                        String str6 = s63Var.a;
                        LocalDate localDate5 = LocalDate.parse(s63Var.b);
                        localDate5.getClass();
                        arrayList11.add(new u63(str6, localDate5, s63Var.c));
                    }
                    fd2 fd2VarS5 = appDatabase.s();
                    this.l = null;
                    this.m = offsetDateTime4;
                    this.n = arrayList10;
                    this.o = arrayList8;
                    this.p = arrayList9;
                    this.q = arrayList11;
                    this.r = z;
                    this.s = (byte) 6;
                    objP4 = cu.P(this, new jc2((byte) 14), fd2VarS5.a, true, false);
                    if (objP4 != y20Var) {
                        z2 = z;
                        arrayList12 = arrayList9;
                        arrayList13 = arrayList8;
                        arrayList14 = arrayList10;
                        offsetDateTime5 = offsetDateTime4;
                        arrayList15 = arrayList11;
                        list2 = (List) objP4;
                        lh0 lh0Var9 = p60.p;
                        iK = ee1.K(ev.o0(lh0Var9, 10));
                        i = 16;
                        if (iK < 16) {
                            iK = 16;
                        }
                        linkedHashMap4 = new LinkedHashMap(iK);
                        zVar = new z(lh0Var9, (byte) 0);
                        while (zVar.hasNext()) {
                            Object next9 = zVar.next();
                            p60Var = (p60) next9;
                            lh0 lh0Var10 = te1.o;
                            iK2 = ee1.K(ev.o0(lh0Var10, 10));
                            if (iK2 < i) {
                                iK2 = i;
                            }
                            linkedHashMap5 = new LinkedHashMap(iK2);
                            zVar2 = new z(lh0Var10, (byte) 0);
                            while (zVar2.hasNext()) {
                                Object next10 = zVar2.next();
                                te1 te1Var5 = (te1) next10;
                                arrayList16 = new ArrayList();
                                while (r19.hasNext()) {
                                    List list11 = list2;
                                    OffsetDateTime offsetDateTime16 = offsetDateTime5;
                                    kd2Var = (kd2) obj3;
                                    boolean z11 = z2;
                                    ArrayList arrayList117 = arrayList14;
                                    if (!uz0.g(kd2Var.a, p60Var.name())) {
                                    }
                                    list2 = list11;
                                    offsetDateTime5 = offsetDateTime16;
                                    z2 = z11;
                                    arrayList14 = arrayList117;
                                }
                                List list12 = list2;
                                OffsetDateTime offsetDateTime17 = offsetDateTime5;
                                boolean z12 = z2;
                                ArrayList arrayList25 = arrayList14;
                                arrayList17 = new ArrayList(ev.o0(arrayList16, 10));
                                size = arrayList16.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj8 = arrayList16.get(i2);
                                    i2++;
                                    arrayList17.add(((kd2) obj8).c);
                                }
                                linkedHashMap5.put(next10, arrayList17);
                                list2 = list12;
                                offsetDateTime5 = offsetDateTime17;
                                z2 = z12;
                                arrayList14 = arrayList25;
                            }
                            linkedHashMap4.put(next9, linkedHashMap5);
                            i = 16;
                        }
                        gkVar = new gk(offsetDateTime5, z2, arrayList14, arrayList13, arrayList12, arrayList15, new ed2(linkedHashMap4));
                        if (this.u) {
                            return gkVar;
                        }
                        return gkVar.a();
                    }
                }
                return y20Var;
            case 5:
                z = this.r;
                arrayList9 = this.p;
                ArrayList arrayList26 = this.o;
                ArrayList arrayList27 = this.n;
                OffsetDateTime offsetDateTime18 = this.m;
                m02.y(obj);
                offsetDateTime4 = offsetDateTime18;
                arrayList10 = arrayList27;
                arrayList8 = arrayList26;
                objP3 = obj;
                Iterable<s63> iterable18 = (Iterable) objP3;
                arrayList11 = new ArrayList(ev.o0(iterable18, 10));
                while (r9.hasNext()) {
                    String str7 = s63Var.a;
                    LocalDate localDate6 = LocalDate.parse(s63Var.b);
                    localDate6.getClass();
                    arrayList11.add(new u63(str7, localDate6, s63Var.c));
                }
                fd2 fd2VarS6 = appDatabase.s();
                this.l = null;
                this.m = offsetDateTime4;
                this.n = arrayList10;
                this.o = arrayList8;
                this.p = arrayList9;
                this.q = arrayList11;
                this.r = z;
                this.s = (byte) 6;
                objP4 = cu.P(this, new jc2((byte) 14), fd2VarS6.a, true, false);
                if (objP4 != y20Var) {
                    z2 = z;
                    arrayList12 = arrayList9;
                    arrayList13 = arrayList8;
                    arrayList14 = arrayList10;
                    offsetDateTime5 = offsetDateTime4;
                    arrayList15 = arrayList11;
                    list2 = (List) objP4;
                    lh0 lh0Var11 = p60.p;
                    iK = ee1.K(ev.o0(lh0Var11, 10));
                    i = 16;
                    if (iK < 16) {
                        iK = 16;
                    }
                    linkedHashMap4 = new LinkedHashMap(iK);
                    zVar = new z(lh0Var11, (byte) 0);
                    while (zVar.hasNext()) {
                        Object next11 = zVar.next();
                        p60Var = (p60) next11;
                        lh0 lh0Var12 = te1.o;
                        iK2 = ee1.K(ev.o0(lh0Var12, 10));
                        if (iK2 < i) {
                            iK2 = i;
                        }
                        linkedHashMap5 = new LinkedHashMap(iK2);
                        zVar2 = new z(lh0Var12, (byte) 0);
                        while (zVar2.hasNext()) {
                            Object next12 = zVar2.next();
                            te1 te1Var6 = (te1) next12;
                            arrayList16 = new ArrayList();
                            while (r19.hasNext()) {
                                List list13 = list2;
                                OffsetDateTime offsetDateTime19 = offsetDateTime5;
                                kd2Var = (kd2) obj3;
                                boolean z13 = z2;
                                ArrayList arrayList118 = arrayList14;
                                if (!uz0.g(kd2Var.a, p60Var.name())) {
                                }
                                list2 = list13;
                                offsetDateTime5 = offsetDateTime19;
                                z2 = z13;
                                arrayList14 = arrayList118;
                            }
                            List list14 = list2;
                            OffsetDateTime offsetDateTime110 = offsetDateTime5;
                            boolean z14 = z2;
                            ArrayList arrayList28 = arrayList14;
                            arrayList17 = new ArrayList(ev.o0(arrayList16, 10));
                            size = arrayList16.size();
                            i2 = 0;
                            while (i2 < size) {
                                Object obj9 = arrayList16.get(i2);
                                i2++;
                                arrayList17.add(((kd2) obj9).c);
                            }
                            linkedHashMap5.put(next12, arrayList17);
                            list2 = list14;
                            offsetDateTime5 = offsetDateTime110;
                            z2 = z14;
                            arrayList14 = arrayList28;
                        }
                        linkedHashMap4.put(next11, linkedHashMap5);
                        i = 16;
                    }
                    gkVar = new gk(offsetDateTime5, z2, arrayList14, arrayList13, arrayList12, arrayList15, new ed2(linkedHashMap4));
                    if (this.u) {
                        return gkVar;
                    }
                    return gkVar.a();
                }
                return y20Var;
            case 6:
                boolean z15 = this.r;
                ArrayList arrayList29 = this.q;
                ArrayList arrayList30 = this.p;
                ArrayList arrayList31 = this.o;
                ArrayList arrayList32 = this.n;
                OffsetDateTime offsetDateTime20 = this.m;
                m02.y(obj);
                arrayList13 = arrayList31;
                arrayList14 = arrayList32;
                offsetDateTime5 = offsetDateTime20;
                arrayList15 = arrayList29;
                arrayList12 = arrayList30;
                z2 = z15;
                objP4 = obj;
                list2 = (List) objP4;
                lh0 lh0Var13 = p60.p;
                iK = ee1.K(ev.o0(lh0Var13, 10));
                i = 16;
                if (iK < 16) {
                    iK = 16;
                }
                linkedHashMap4 = new LinkedHashMap(iK);
                zVar = new z(lh0Var13, (byte) 0);
                while (zVar.hasNext()) {
                    Object next13 = zVar.next();
                    p60Var = (p60) next13;
                    lh0 lh0Var14 = te1.o;
                    iK2 = ee1.K(ev.o0(lh0Var14, 10));
                    if (iK2 < i) {
                        iK2 = i;
                    }
                    linkedHashMap5 = new LinkedHashMap(iK2);
                    zVar2 = new z(lh0Var14, (byte) 0);
                    while (zVar2.hasNext()) {
                        Object next14 = zVar2.next();
                        te1 te1Var7 = (te1) next14;
                        arrayList16 = new ArrayList();
                        while (r19.hasNext()) {
                            List list15 = list2;
                            OffsetDateTime offsetDateTime111 = offsetDateTime5;
                            kd2Var = (kd2) obj3;
                            boolean z16 = z2;
                            ArrayList arrayList119 = arrayList14;
                            if (!uz0.g(kd2Var.a, p60Var.name())) {
                            }
                            list2 = list15;
                            offsetDateTime5 = offsetDateTime111;
                            z2 = z16;
                            arrayList14 = arrayList119;
                        }
                        List list16 = list2;
                        OffsetDateTime offsetDateTime112 = offsetDateTime5;
                        boolean z17 = z2;
                        ArrayList arrayList210 = arrayList14;
                        arrayList17 = new ArrayList(ev.o0(arrayList16, 10));
                        size = arrayList16.size();
                        i2 = 0;
                        while (i2 < size) {
                            Object obj10 = arrayList16.get(i2);
                            i2++;
                            arrayList17.add(((kd2) obj10).c);
                        }
                        linkedHashMap5.put(next14, arrayList17);
                        list2 = list16;
                        offsetDateTime5 = offsetDateTime112;
                        z2 = z17;
                        arrayList14 = arrayList210;
                    }
                    linkedHashMap4.put(next13, linkedHashMap5);
                    i = 16;
                }
                gkVar = new gk(offsetDateTime5, z2, arrayList14, arrayList13, arrayList12, arrayList15, new ed2(linkedHashMap4));
                if (this.u) {
                    return gkVar;
                }
                return gkVar.a();
            default:
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
