package defpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ur implements qk0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ qk0 i;

    public ur(qk0 qk0Var, tw1 tw1Var) {
        this.h = (byte) 4;
        this.i = qk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:81:0x0171  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.qk0
    public final Object m(Object obj, m10 m10Var) {
        tr trVar;
        xr xrVar;
        kw1 kw1Var;
        pw1 pw1Var;
        rw1 rw1Var;
        byte b = this.h;
        j23 j23Var = j23.a;
        qk0 qk0Var = this.i;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                if (m10Var instanceof tr) {
                    trVar = (tr) m10Var;
                    int i = trVar.l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        trVar.l = i - Integer.MIN_VALUE;
                    } else {
                        trVar = new tr(this, m10Var);
                    }
                } else {
                    trVar = new tr(this, m10Var);
                }
                Object obj2 = trVar.k;
                int i2 = trVar.l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        m02.y(obj2);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(ev.o0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(cu.i0((mw0) it.next()));
                }
                trVar.l = 1;
                return qk0Var.m(arrayList, trVar) == y20Var ? y20Var : j23Var;
            case 1:
                if (m10Var instanceof xr) {
                    xrVar = (xr) m10Var;
                    int i3 = xrVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xrVar.l = i3 - Integer.MIN_VALUE;
                    } else {
                        xrVar = new xr(this, m10Var);
                    }
                } else {
                    xrVar = new xr(this, m10Var);
                }
                Object obj3 = xrVar.k;
                int i4 = xrVar.l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        m02.y(obj3);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj3);
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(ev.o0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(cu.k0((y62) it2.next(), ag0.h));
                }
                xrVar.l = 1;
                return qk0Var.m(arrayList2, xrVar) == y20Var ? y20Var : j23Var;
            case 2:
                if (m10Var instanceof kw1) {
                    kw1Var = (kw1) m10Var;
                    int i5 = kw1Var.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        kw1Var.l = i5 - Integer.MIN_VALUE;
                    } else {
                        kw1Var = new kw1(this, m10Var);
                    }
                } else {
                    kw1Var = new kw1(this, m10Var);
                }
                Object obj4 = kw1Var.k;
                int i6 = kw1Var.l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        m02.y(obj4);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj4);
                List<s63> list3 = (List) obj;
                ArrayList arrayList3 = new ArrayList(ev.o0(list3, 10));
                for (s63 s63Var : list3) {
                    LocalDate localDate = LocalDate.parse(s63Var.b);
                    localDate.getClass();
                    arrayList3.add(new t63(localDate, s63Var.c));
                }
                kw1Var.l = 1;
                return qk0Var.m(arrayList3, kw1Var) == y20Var ? y20Var : j23Var;
            case 3:
                if (m10Var instanceof pw1) {
                    pw1Var = (pw1) m10Var;
                    int i7 = pw1Var.l;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        pw1Var.l = i7 - Integer.MIN_VALUE;
                    } else {
                        pw1Var = new pw1(this, m10Var);
                    }
                } else {
                    pw1Var = new pw1(this, m10Var);
                }
                Object obj5 = pw1Var.k;
                int i8 = pw1Var.l;
                if (i8 != 0) {
                    if (i8 == 1) {
                        m02.y(obj5);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj5);
                List list4 = (List) obj;
                ArrayList arrayList4 = new ArrayList(ev.o0(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(cu.j0((by1) it3.next()));
                }
                pw1Var.l = 1;
                return qk0Var.m(arrayList4, pw1Var) == y20Var ? y20Var : j23Var;
            default:
                if (m10Var instanceof rw1) {
                    rw1Var = (rw1) m10Var;
                    int i9 = rw1Var.l;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        rw1Var.l = i9 - Integer.MIN_VALUE;
                    } else {
                        rw1Var = new rw1(this, m10Var);
                    }
                } else {
                    rw1Var = new rw1(this, m10Var);
                }
                Object obj6 = rw1Var.k;
                int i10 = rw1Var.l;
                if (i10 == 0) {
                    m02.y(obj6);
                    ed2 ed2VarF = tw1.f((List) obj);
                    rw1Var.l = 1;
                    return qk0Var.m(ed2VarF, rw1Var) == y20Var ? y20Var : j23Var;
                }
                if (i10 == 1) {
                    m02.y(obj6);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ ur(qk0 qk0Var, byte b) {
        this.h = b;
        this.i = qk0Var;
    }
}
