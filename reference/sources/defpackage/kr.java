package defpackage;

import com.familymeal.app.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kr extends mq2 implements vp0 {
    public final /* synthetic */ byte l;
    public byte m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr(Object obj, Object obj2, m10 m10Var, byte b) {
        super(1, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        Object obj2 = this.o;
        Object obj3 = this.n;
        m10 m10Var = (m10) obj;
        switch (b) {
            case 0:
                return new kr((yr) obj3, (String) obj2, m10Var, (byte) 0).r(j23Var);
            case 1:
                return new kr((yr) obj3, (j62) obj2, m10Var, (byte) 1).r(j23Var);
            default:
                return new kr((tw1) obj3, (ef2) obj2, m10Var, (byte) 2).r(j23Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object objP;
        Object objA;
        AppDatabase appDatabase;
        ag1 ag1VarN;
        bg1 bg1Var;
        byte b = this.l;
        ir irVar = ir.a;
        int i = 10;
        Object obj2 = j23.a;
        y20 y20Var = y20.h;
        Object obj3 = this.n;
        Object obj4 = this.o;
        byte b2 = 0;
        switch (b) {
            case 0:
                String str = (String) obj4;
                yr yrVar = (yr) obj3;
                byte b3 = this.m;
                if (b3 == 0) {
                    m02.y(obj);
                    yv0 yv0VarM = yrVar.a.m();
                    this.m = (byte) 1;
                    objP = cu.P(this, new ql(str, (byte) 9), yv0VarM.a, true, false);
                    if (objP != y20Var) {
                    }
                    return y20Var;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        m02.y(obj);
                        return irVar;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                objP = obj;
                List list = (List) objP;
                if (!list.isEmpty()) {
                    return new gr(list);
                }
                yv0 yv0VarM2 = yrVar.a.m();
                this.m = (byte) 2;
                if (cu.P(this, new ql(str, (byte) 8), yv0VarM2.a, false, true) != y20Var) {
                    return irVar;
                }
                return y20Var;
            case 1:
                yr yrVar2 = (yr) obj3;
                j62 j62Var = (j62) obj4;
                byte b4 = this.m;
                if (b4 == 0) {
                    m02.y(obj);
                    yv0 yv0VarM3 = yrVar2.a.m();
                    this.m = (byte) 1;
                    objA = yv0VarM3.a(this);
                    if (objA != y20Var) {
                    }
                    return y20Var;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        m02.y(obj);
                        return irVar;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                objA = obj;
                Iterable iterable = (Iterable) objA;
                ArrayList arrayList = new ArrayList(ev.o0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mw0) it.next()).a);
                }
                na1 na1VarG = bh0.g(j62Var, dv.U0(arrayList));
                if (!na1VarG.isEmpty()) {
                    return new hr(na1VarG);
                }
                m62 m62VarQ = yrVar2.a.q();
                y62 y62VarG0 = cu.g0(j62Var);
                ArrayList arrayListJ = cu.J(j62Var);
                this.m = (byte) 2;
                Object objO = cu.O(m62VarQ.a, new vu1(m62VarQ, y62VarG0, arrayListJ, null, (byte) 1), this);
                if (objO == y20Var) {
                    obj2 = objO;
                }
                if (obj2 != y20Var) {
                    return irVar;
                }
                return y20Var;
            default:
                ef2 ef2Var = (ef2) obj4;
                AppDatabase appDatabase2 = ((tw1) obj3).a;
                byte b5 = this.m;
                if (b5 != 0) {
                    if (b5 == 1) {
                        m02.y(obj);
                    } else {
                        if (b5 != 2) {
                            if (b5 == 3) {
                                m02.y(obj);
                                return obj2;
                            }
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                        appDatabase = appDatabase2;
                    }
                    ag1VarN = appDatabase.n();
                    bg1Var = new bg1("people_seed_version", "1");
                    this.m = (byte) 3;
                    if (ag1VarN.a(bg1Var, this) != y20Var) {
                        return obj2;
                    }
                    return y20Var;
                }
                m02.y(obj);
                sx1 sx1VarO = appDatabase2.o();
                ArrayList arrayList2 = ef2Var.e;
                ArrayList arrayList3 = new ArrayList(ev.o0(arrayList2, 10));
                int size = arrayList2.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    Object obj5 = arrayList2.get(i2);
                    i2++;
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        lt.h0();
                        throw null;
                    }
                    arrayList3.add(cu.f0((dy1) obj5, i3));
                    i3 = i4;
                }
                this.m = (byte) 1;
                Object objP2 = cu.P(this, new g(sx1VarO, arrayList3, (byte) 29), sx1VarO.a, false, true);
                if (objP2 != y20Var) {
                    objP2 = obj2;
                }
                if (objP2 != y20Var) {
                }
                return y20Var;
                ArrayList arrayList4 = new ArrayList();
                lh0 lh0Var = p60.p;
                lh0Var.getClass();
                z zVar = new z(lh0Var, (byte) 0);
                while (zVar.hasNext()) {
                    p60 p60Var = (p60) zVar.next();
                    ArrayList arrayList5 = new ArrayList();
                    lh0 lh0Var2 = te1.o;
                    lh0Var2.getClass();
                    z zVar2 = new z(lh0Var2, b2);
                    while (zVar2.hasNext()) {
                        te1 te1Var = (te1) zVar2.next();
                        List listA = ef2Var.d.a(p60Var, te1Var);
                        ArrayList arrayList6 = new ArrayList(ev.o0(listA, i));
                        Iterator it2 = listA.iterator();
                        while (it2.hasNext()) {
                            arrayList6.add(new kd2(p60Var.name(), te1Var.name(), (String) it2.next()));
                            appDatabase2 = appDatabase2;
                        }
                        iv.q0(arrayList6, arrayList5);
                        i = 10;
                    }
                    iv.q0(arrayList5, arrayList4);
                    i = 10;
                    b2 = 0;
                }
                appDatabase = appDatabase2;
                fd2 fd2VarS = appDatabase.s();
                this.m = (byte) 2;
                if (fd2VarS.a(arrayList4, this) != y20Var) {
                    ag1VarN = appDatabase.n();
                    bg1Var = new bg1("people_seed_version", "1");
                    this.m = (byte) 3;
                    if (ag1VarN.a(bg1Var, this) != y20Var) {
                        return obj2;
                    }
                }
                return y20Var;
        }
    }
}
