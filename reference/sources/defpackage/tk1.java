package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tk1 {
    public final jy1 a;
    public final nn2 b;
    public final nn2 c;
    public boolean d;
    public final i62 e;
    public final i62 f;
    public final sm1 g;
    public final /* synthetic */ kl1 h;

    public tk1(kl1 kl1Var, sm1 sm1Var) {
        sm1Var.getClass();
        this.h = kl1Var;
        this.a = new jy1((byte) 21);
        nn2 nn2VarN = h7.N(ag0.h);
        this.b = nn2VarN;
        nn2 nn2VarN2 = h7.N(gg0.h);
        this.c = nn2VarN2;
        this.e = new i62(nn2VarN);
        this.f = new i62(nn2VarN2);
        this.g = sm1Var;
    }

    public final void a(pk1 pk1Var) {
        pk1Var.getClass();
        synchronized (this.a) {
            nn2 nn2Var = this.b;
            nn2Var.i(null, dv.J0((Collection) nn2Var.getValue(), pk1Var));
        }
    }

    public final pk1 b(dl1 dl1Var, Bundle bundle) {
        xk1 xk1Var = this.h.b;
        xk1Var.getClass();
        return yy.h(xk1Var.a.c, dl1Var, bundle, xk1Var.h(), xk1Var.o);
    }

    public final void c(pk1 pk1Var) {
        xl1 xl1Var;
        pk1Var.getClass();
        xk1 xk1Var = this.h.b;
        nn2 nn2Var = xk1Var.h;
        String str = pk1Var.m;
        LinkedHashMap linkedHashMap = xk1Var.w;
        boolean zG = uz0.g(linkedHashMap.get(pk1Var), Boolean.TRUE);
        nn2 nn2Var2 = this.c;
        nn2Var2.i(null, ci2.H((Set) nn2Var2.getValue(), pk1Var));
        linkedHashMap.remove(pk1Var);
        ih ihVar = xk1Var.f;
        if (ihVar.contains(pk1Var)) {
            if (this.d) {
                return;
            }
            xk1Var.s();
            nn2 nn2Var3 = xk1Var.g;
            ArrayList arrayList = new ArrayList(ihVar);
            nn2Var3.getClass();
            nn2Var3.i(null, arrayList);
            ArrayList arrayListP = xk1Var.p();
            nn2Var.getClass();
            nn2Var.i(null, arrayListP);
            return;
        }
        xk1Var.r(pk1Var);
        if (pk1Var.r.h.compareTo(x81.j) >= 0) {
            pk1Var.s = x81.h;
            pk1Var.e();
        }
        if (!ihVar.isEmpty()) {
            Iterator it = ihVar.iterator();
            while (it.hasNext()) {
                if (((pk1) it.next()).m.equals(str)) {
                }
            }
            if (!zG && (xl1Var = xk1Var.o) != null) {
                xl1Var.j(str);
            }
        } else if (!zG) {
            xl1Var.j(str);
        }
        xk1Var.s();
        ArrayList arrayListP2 = xk1Var.p();
        nn2Var.getClass();
        nn2Var.i(null, arrayListP2);
    }

    public final void d(pk1 pk1Var, boolean z) {
        pk1Var.getClass();
        xk1 xk1Var = this.h.b;
        h6 h6Var = new h6(this, pk1Var, z);
        xk1Var.getClass();
        sm1 sm1VarB = xk1Var.s.b(pk1Var.i.h);
        xk1Var.w.put(pk1Var, Boolean.valueOf(z));
        if (!sm1VarB.equals(this.g)) {
            Object obj = xk1Var.t.get(sm1VarB);
            obj.getClass();
            ((tk1) obj).d(pk1Var, z);
            return;
        }
        vk1 vk1Var = xk1Var.v;
        if (vk1Var != null) {
            vk1Var.h(pk1Var);
            h6Var.a();
            return;
        }
        ih ihVar = xk1Var.f;
        int iIndexOf = ihVar.indexOf(pk1Var);
        if (iIndexOf < 0) {
            pk1Var.toString();
            return;
        }
        int i = iIndexOf + 1;
        if (i != ihVar.j) {
            xk1Var.m(((pk1) ihVar.get(i)).i.i.b, true, false);
        }
        xk1.o(xk1Var, pk1Var);
        h6Var.a();
        xk1Var.b.a();
        xk1Var.b();
    }

    public final void e(pk1 pk1Var, boolean z) {
        Object objPrevious;
        pk1Var.getClass();
        nn2 nn2Var = this.e.h;
        nn2 nn2Var2 = this.c;
        Iterable iterable = (Iterable) nn2Var2.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((pk1) it.next()) == pk1Var) {
                    Iterable iterable2 = (Iterable) nn2Var.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((pk1) it2.next()) == pk1Var) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        nn2Var2.i(null, ci2.I((Set) nn2Var2.getValue(), pk1Var));
        List list = (List) nn2Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            pk1 pk1Var2 = (pk1) objPrevious;
            if (!uz0.g(pk1Var2, pk1Var) && ((List) nn2Var.getValue()).lastIndexOf(pk1Var2) < ((List) nn2Var.getValue()).lastIndexOf(pk1Var)) {
                break;
            }
        }
        pk1 pk1Var3 = (pk1) objPrevious;
        if (pk1Var3 != null) {
            nn2Var2.i(null, ci2.I((Set) nn2Var2.getValue(), pk1Var3));
        }
        d(pk1Var, z);
    }

    public final void f(pk1 pk1Var) {
        pk1Var.getClass();
        xk1 xk1Var = this.h.b;
        xk1Var.getClass();
        sm1 sm1VarB = xk1Var.s.b(pk1Var.i.h);
        if (!sm1VarB.equals(this.g)) {
            Object obj = xk1Var.t.get(sm1VarB);
            if (obj == null) {
                throw new IllegalStateException(wi0.h("NavigatorBackStack for ", pk1Var.i.h, " should already be created").toString());
            }
            ((tk1) obj).f(pk1Var);
            return;
        }
        vp0 vp0Var = xk1Var.u;
        if (vp0Var == null) {
            Objects.toString(pk1Var.i);
        } else {
            vp0Var.h(pk1Var);
            a(pk1Var);
        }
    }
}
