package defpackage;

import com.familymeal.app.data.db.AppDatabase;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nr extends mq2 implements vp0 {
    public final /* synthetic */ byte l;
    public Serializable m;
    public byte n;
    public final /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr(Object obj, Object obj2, Serializable serializable, m10 m10Var, byte b) {
        super(1, m10Var);
        this.l = b;
        this.o = obj;
        this.p = obj2;
        this.m = serializable;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new nr((yr) obj2, (ef2) this.p, (ArrayList) this.m, (m10) obj, (byte) 0).r(j23Var);
            case 1:
                return new nr((yr) obj2, (m10) obj).r(j23Var);
            case 2:
                return new nr((tw1) obj2, (String) this.p, (LocalDate) this.m, (m10) obj, (byte) 2).r(j23Var);
            default:
                return new nr((ry2) obj2, (qy2) this.p, (ek1) this.m, (m10) obj, (byte) 3).r(j23Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0270 A[LOOP:3: B:105:0x026e->B:106:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x0169  */
    /* JADX WARN: Code duplicated, block: B:69:0x0179  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a8 A[LOOP:0: B:74:0x01a2->B:76:0x01a8, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        m62 m62VarQ;
        ArrayList arrayList;
        int size;
        ag1 ag1VarN;
        bg1 bg1Var;
        Object objP;
        LinkedHashMap linkedHashMap;
        Object objP2;
        ArrayList arrayList2;
        Object objA;
        List list;
        ArrayList arrayList3;
        Iterator it;
        Object objA2;
        by1 by1Var;
        Object objE;
        byte b = this.l;
        Object obj2 = j23.a;
        int i = 0;
        Object[] objArr = 0;
        y20 y20Var = y20.h;
        Object obj3 = this.o;
        m10 m10Var = null;
        switch (b) {
            case 0:
                ArrayList arrayList4 = (ArrayList) this.m;
                AppDatabase appDatabase = ((yr) obj3).a;
                byte b2 = this.n;
                if (b2 == 0) {
                    m02.y(obj);
                    yv0 yv0VarM = appDatabase.m();
                    ArrayList arrayList5 = ((ef2) this.p).a;
                    ArrayList arrayList6 = new ArrayList(ev.o0(arrayList5, 10));
                    int size2 = arrayList5.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj4 = arrayList5.get(i2);
                        i2++;
                        arrayList6.add(cu.e0((uv0) obj4));
                    }
                    this.n = (byte) 1;
                    Object objP3 = cu.P(this, new g(yv0VarM, arrayList6, (byte) 16), yv0VarM.a, false, true);
                    if (objP3 != y20Var) {
                        objP3 = obj2;
                    }
                    if (objP3 != y20Var) {
                    }
                    return y20Var;
                }
                if (b2 == 1) {
                    m02.y(obj);
                } else {
                    if (b2 == 2) {
                        m02.y(obj);
                        m62VarQ = appDatabase.q();
                        arrayList = new ArrayList();
                        size = arrayList4.size();
                        while (i < size) {
                            Object obj5 = arrayList4.get(i);
                            i++;
                            iv.q0(cu.J((j62) obj5), arrayList);
                        }
                        this.n = (byte) 3;
                        if (m62VarQ.a(arrayList, this) != y20Var) {
                        }
                        return y20Var;
                    }
                    if (b2 != 3) {
                        if (b2 == 4) {
                            m02.y(obj);
                            return obj2;
                        }
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                ag1VarN = appDatabase.n();
                bg1Var = new bg1("seed_version", "2");
                this.n = (byte) 4;
                if (ag1VarN.a(bg1Var, this) != y20Var) {
                    return obj2;
                }
                return y20Var;
                m62 m62VarQ2 = appDatabase.q();
                ArrayList arrayList7 = new ArrayList(ev.o0(arrayList4, 10));
                int size3 = arrayList4.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj6 = arrayList4.get(i3);
                    i3++;
                    arrayList7.add(cu.g0((j62) obj6));
                }
                this.n = (byte) 2;
                Object objP4 = cu.P(this, new l62(m62VarQ2, arrayList7, objArr == true ? 1 : 0), m62VarQ2.a, false, true);
                if (objP4 != y20Var) {
                    objP4 = obj2;
                }
                if (objP4 != y20Var) {
                    m62VarQ = appDatabase.q();
                    arrayList = new ArrayList();
                    size = arrayList4.size();
                    while (i < size) {
                        Object obj7 = arrayList4.get(i);
                        i++;
                        iv.q0(cu.J((j62) obj7), arrayList);
                    }
                    this.n = (byte) 3;
                    if (m62VarQ.a(arrayList, this) != y20Var) {
                        ag1VarN = appDatabase.n();
                        bg1Var = new bg1("seed_version", "2");
                        this.n = (byte) 4;
                        if (ag1VarN.a(bg1Var, this) != y20Var) {
                            return obj2;
                        }
                    }
                }
                return y20Var;
            case 1:
                AppDatabase appDatabase2 = ((yr) obj3).a;
                byte b3 = this.n;
                if (b3 != 0) {
                    if (b3 == 1) {
                        m02.y(obj);
                        objP = obj;
                    } else if (b3 == 2) {
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.p;
                        m02.y(obj);
                        linkedHashMap = linkedHashMap2;
                        objP2 = obj;
                        Iterable<y62> iterable = (Iterable) objP2;
                        arrayList2 = new ArrayList(ev.o0(iterable, 10));
                        for (y62 y62Var : iterable) {
                            list = (List) linkedHashMap.get(y62Var.a);
                            if (list == null) {
                                list = ag0.h;
                            }
                            arrayList2.add(cu.k0(y62Var, list));
                        }
                        yv0 yv0VarM2 = appDatabase2.m();
                        this.p = null;
                        this.m = arrayList2;
                        this.n = (byte) 3;
                        objA = yv0VarM2.a(this);
                        if (objA == y20Var) {
                            return y20Var;
                        }
                    } else {
                        if (b3 != 3) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ArrayList arrayList8 = (ArrayList) this.m;
                        m02.y(obj);
                        arrayList2 = arrayList8;
                        objA = obj;
                    }
                    Iterable iterable2 = (Iterable) objA;
                    arrayList3 = new ArrayList(ev.o0(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(cu.i0((mw0) it.next()));
                    }
                    return new wt1(arrayList2, arrayList3);
                }
                m02.y(obj);
                m62 m62VarQ3 = appDatabase2.q();
                this.n = (byte) 1;
                objP = cu.P(this, new vw1((byte) 17), m62VarQ3.a, true, false);
                if (objP == y20Var) {
                    return y20Var;
                }
                linkedHashMap = new LinkedHashMap();
                for (Object obj8 : (Iterable) objP) {
                    String str = ((d72) obj8).a;
                    Object arrayList9 = linkedHashMap.get(str);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap.put(str, arrayList9);
                    }
                    ((List) arrayList9).add(obj8);
                }
                m62 m62VarQ4 = appDatabase2.q();
                this.p = linkedHashMap;
                this.n = (byte) 2;
                objP2 = cu.P(this, new vw1((byte) 18), m62VarQ4.a, true, false);
                if (objP2 == y20Var) {
                    return y20Var;
                }
                Iterable<y62> iterable3 = (Iterable) objP2;
                arrayList2 = new ArrayList(ev.o0(iterable3, 10));
                while (r4.hasNext()) {
                    list = (List) linkedHashMap.get(y62Var.a);
                    if (list == null) {
                        list = ag0.h;
                    }
                    arrayList2.add(cu.k0(y62Var, list));
                }
                yv0 yv0VarM3 = appDatabase2.m();
                this.p = null;
                this.m = arrayList2;
                this.n = (byte) 3;
                objA = yv0VarM3.a(this);
                if (objA == y20Var) {
                    return y20Var;
                }
                Iterable iterable4 = (Iterable) objA;
                arrayList3 = new ArrayList(ev.o0(iterable4, 10));
                it = iterable4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(cu.i0((mw0) it.next()));
                }
                return new wt1(arrayList2, arrayList3);
            case 2:
                String str2 = (String) this.p;
                tw1 tw1Var = (tw1) obj3;
                AppDatabase appDatabase3 = tw1Var.a;
                byte b4 = this.n;
                if (b4 == 0) {
                    m02.y(obj);
                    r63 r63VarT = appDatabase3.t();
                    String string = ((LocalDate) this.m).toString();
                    string.getClass();
                    this.n = (byte) 1;
                    Object objP5 = cu.P(this, new o40(str2, string, (byte) 2), r63VarT.a, false, true);
                    if (objP5 == y20Var) {
                        obj2 = objP5;
                    }
                    if (obj2 == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (b4 != 1) {
                        if (b4 != 2) {
                            if (b4 != 3) {
                                li1.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            m02.y(obj);
                            objE = obj;
                            return (dw1) objE;
                        }
                        m02.y(obj);
                        objA2 = obj;
                        by1Var = (by1) objA2;
                        if (by1Var != null) {
                            dy1 dy1VarJ0 = cu.j0(by1Var);
                            this.n = (byte) 3;
                            objE = tw1Var.e(dy1VarJ0, this);
                            if (objE == y20Var) {
                                return y20Var;
                            }
                            return (dw1) objE;
                        }
                        return null;
                    }
                    m02.y(obj);
                }
                sx1 sx1VarO = appDatabase3.o();
                this.n = (byte) 2;
                objA2 = sx1VarO.a(str2, this);
                if (objA2 == y20Var) {
                    return y20Var;
                }
                by1Var = (by1) objA2;
                if (by1Var != null) {
                    dy1 dy1VarJ1 = cu.j0(by1Var);
                    this.n = (byte) 3;
                    objE = tw1Var.e(dy1VarJ1, this);
                    if (objE == y20Var) {
                        return y20Var;
                    }
                    return (dw1) objE;
                }
                return null;
            default:
                ek1 ek1Var = (ek1) this.m;
                qy2 qy2Var = (qy2) this.p;
                ry2 ry2Var = (ry2) obj3;
                byte b5 = this.n;
                ek1 ek1Var2 = ek1.j;
                try {
                    if (b5 == 0) {
                        m02.y(obj);
                        qj qjVar = new qj(qy2Var, m10Var, (byte) 13);
                        this.n = (byte) 2;
                        if (cy1.O(new tx2(1500L, this), qjVar) == y20Var) {
                            return y20Var;
                        }
                    } else {
                        if (b5 != 1 && b5 != 2) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    if (ek1Var == ek1Var2) {
                        return obj2;
                    }
                    ry2Var.a();
                    return obj2;
                } catch (Throwable th) {
                    if (ek1Var != ek1Var2) {
                        ry2Var.a();
                    }
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(yr yrVar, m10 m10Var) {
        super(1, m10Var);
        this.l = (byte) 1;
        this.o = yrVar;
    }
}
