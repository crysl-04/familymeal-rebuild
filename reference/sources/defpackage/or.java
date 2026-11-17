package defpackage;

import com.familymeal.app.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class or extends mq2 implements vp0 {
    public Map l;
    public Map m;
    public yr n;
    public Iterator o;
    public byte p;
    public final /* synthetic */ yr q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(yr yrVar, m10 m10Var) {
        super(1, m10Var);
        this.q = yrVar;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        return new or(this.q, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0162  */
    /* JADX WARN: Code duplicated, block: B:53:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:41:0x0119->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee A[SYNTHETIC] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object objA;
        Map linkedHashMap;
        Object objP;
        LinkedHashMap linkedHashMap2;
        Object objP2;
        Map map;
        String str;
        Object arrayList;
        Map map2;
        yr yrVar;
        Iterator it;
        Map map3;
        Map map4;
        ag1 ag1VarN;
        bg1 bg1Var;
        List list;
        Object objP3;
        yr yrVar2 = this.q;
        AppDatabase appDatabase = yrVar2.a;
        byte b = this.p;
        j23 j23Var = j23.a;
        byte b2 = 2;
        y20 y20Var = y20.h;
        if (b == 0) {
            m02.y(obj);
            yv0 yv0VarM = appDatabase.m();
            this.p = (byte) 1;
            objA = yv0VarM.a(this);
            if (objA != y20Var) {
            }
            return y20Var;
        }
        if (b == 1) {
            m02.y(obj);
            objA = obj;
        } else {
            if (b == 2) {
                Map map5 = this.l;
                m02.y(obj);
                linkedHashMap = map5;
                objP = obj;
                linkedHashMap2 = new LinkedHashMap();
                for (Object obj2 : (Iterable) objP) {
                    str = ((d72) obj2).a;
                    arrayList = linkedHashMap2.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap2.put(str, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                m62 m62VarQ = appDatabase.q();
                this.l = linkedHashMap;
                this.m = linkedHashMap2;
                this.p = (byte) 3;
                objP2 = cu.P(this, new vw1((byte) 18), m62VarQ.a, true, false);
                if (objP2 != y20Var) {
                    map = linkedHashMap;
                    map2 = linkedHashMap2;
                    Iterator it2 = ((Iterable) objP2).iterator();
                    yrVar = yrVar2;
                    it = it2;
                    map3 = map;
                    map4 = map2;
                    while (it.hasNext()) {
                        y62 y62Var = (y62) it.next();
                        list = (List) map4.get(y62Var.a);
                        if (list == null) {
                            list = ag0.h;
                        }
                        j62 j62VarK0 = cu.k0(y62Var, list);
                        m62 m62VarQ2 = yrVar.a.q();
                        b82 b82Var = bh0.a;
                        y62 y62VarG0 = cu.g0(j62.a(j62VarK0, bh0.a(j62VarK0.g, map3)));
                        this.l = map3;
                        this.m = map4;
                        this.n = yrVar;
                        this.o = it;
                        this.p = (byte) 4;
                        objP3 = cu.P(this, new uy1(m62VarQ2, y62VarG0, b2), m62VarQ2.a, false, true);
                        if (objP3 != y20Var) {
                            objP3 = j23Var;
                        }
                        if (objP3 == y20Var) {
                        }
                    }
                    ag1VarN = appDatabase.n();
                    bg1Var = new bg1("seed_version", "2");
                    this.l = null;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.p = (byte) 5;
                    if (ag1VarN.a(bg1Var, this) != y20Var) {
                    }
                }
                return y20Var;
            }
            if (b == 3) {
                Map map6 = this.m;
                map = this.l;
                m02.y(obj);
                map2 = map6;
                objP2 = obj;
                Iterator it3 = ((Iterable) objP2).iterator();
                yrVar = yrVar2;
                it = it3;
                map3 = map;
                map4 = map2;
                while (it.hasNext()) {
                    y62 y62Var2 = (y62) it.next();
                    list = (List) map4.get(y62Var2.a);
                    if (list == null) {
                        list = ag0.h;
                    }
                    j62 j62VarK1 = cu.k0(y62Var2, list);
                    m62 m62VarQ3 = yrVar.a.q();
                    b82 b82Var2 = bh0.a;
                    y62 y62VarG1 = cu.g0(j62.a(j62VarK1, bh0.a(j62VarK1.g, map3)));
                    this.l = map3;
                    this.m = map4;
                    this.n = yrVar;
                    this.o = it;
                    this.p = (byte) 4;
                    objP3 = cu.P(this, new uy1(m62VarQ3, y62VarG1, b2), m62VarQ3.a, false, true);
                    if (objP3 != y20Var) {
                        objP3 = j23Var;
                    }
                    if (objP3 == y20Var) {
                        return y20Var;
                    }
                }
                ag1VarN = appDatabase.n();
                bg1Var = new bg1("seed_version", "2");
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = (byte) 5;
                if (ag1VarN.a(bg1Var, this) != y20Var) {
                    return y20Var;
                }
            } else if (b == 4) {
                it = this.o;
                yrVar = this.n;
                Map map7 = this.m;
                map3 = this.l;
                m02.y(obj);
                map4 = map7;
                while (it.hasNext()) {
                    y62 y62Var3 = (y62) it.next();
                    list = (List) map4.get(y62Var3.a);
                    if (list == null) {
                        list = ag0.h;
                    }
                    j62 j62VarK2 = cu.k0(y62Var3, list);
                    m62 m62VarQ4 = yrVar.a.q();
                    b82 b82Var3 = bh0.a;
                    y62 y62VarG2 = cu.g0(j62.a(j62VarK2, bh0.a(j62VarK2.g, map3)));
                    this.l = map3;
                    this.m = map4;
                    this.n = yrVar;
                    this.o = it;
                    this.p = (byte) 4;
                    objP3 = cu.P(this, new uy1(m62VarQ4, y62VarG2, b2), m62VarQ4.a, false, true);
                    if (objP3 != y20Var) {
                        objP3 = j23Var;
                    }
                    if (objP3 == y20Var) {
                        return y20Var;
                    }
                }
                ag1VarN = appDatabase.n();
                bg1Var = new bg1("seed_version", "2");
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = (byte) 5;
                if (ag1VarN.a(bg1Var, this) != y20Var) {
                    return y20Var;
                }
            } else {
                if (b != 5) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
            }
        }
        return j23Var;
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList2 = new ArrayList(ev.o0(iterable, 10));
        Iterator it4 = iterable.iterator();
        while (it4.hasNext()) {
            arrayList2.add(cu.i0((mw0) it4.next()));
        }
        int iK = ee1.K(ev.o0(arrayList2, 10));
        if (iK < 16) {
            iK = 16;
        }
        linkedHashMap = new LinkedHashMap(iK);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList2.get(i);
            i++;
            linkedHashMap.put(((uv0) obj3).a, obj3);
        }
        m62 m62VarQ5 = appDatabase.q();
        this.l = linkedHashMap;
        this.p = (byte) 2;
        objP = cu.P(this, new vw1((byte) 17), m62VarQ5.a, true, false);
        if (objP != y20Var) {
            linkedHashMap2 = new LinkedHashMap();
            while (r3.hasNext()) {
                str = ((d72) obj2).a;
                arrayList = linkedHashMap2.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap2.put(str, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            m62 m62VarQ6 = appDatabase.q();
            this.l = linkedHashMap;
            this.m = linkedHashMap2;
            this.p = (byte) 3;
            objP2 = cu.P(this, new vw1((byte) 18), m62VarQ6.a, true, false);
            if (objP2 != y20Var) {
                map = linkedHashMap;
                map2 = linkedHashMap2;
                Iterator it5 = ((Iterable) objP2).iterator();
                yrVar = yrVar2;
                it = it5;
                map3 = map;
                map4 = map2;
                while (it.hasNext()) {
                    y62 y62Var4 = (y62) it.next();
                    list = (List) map4.get(y62Var4.a);
                    if (list == null) {
                        list = ag0.h;
                    }
                    j62 j62VarK3 = cu.k0(y62Var4, list);
                    m62 m62VarQ7 = yrVar.a.q();
                    b82 b82Var4 = bh0.a;
                    y62 y62VarG3 = cu.g0(j62.a(j62VarK3, bh0.a(j62VarK3.g, map3)));
                    this.l = map3;
                    this.m = map4;
                    this.n = yrVar;
                    this.o = it;
                    this.p = (byte) 4;
                    objP3 = cu.P(this, new uy1(m62VarQ7, y62VarG3, b2), m62VarQ7.a, false, true);
                    if (objP3 != y20Var) {
                        objP3 = j23Var;
                    }
                    if (objP3 == y20Var) {
                    }
                }
                ag1VarN = appDatabase.n();
                bg1Var = new bg1("seed_version", "2");
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = (byte) 5;
                if (ag1VarN.a(bg1Var, this) != y20Var) {
                    return j23Var;
                }
            }
        }
        return y20Var;
    }
}
