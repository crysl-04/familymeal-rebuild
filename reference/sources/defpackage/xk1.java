package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xk1 {
    public final kl1 a;
    public final mg b;
    public gl1 c;
    public Bundle d;
    public Bundle[] e;
    public final ih f = new ih();
    public final nn2 g;
    public final nn2 h;
    public final i62 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public e91 n;
    public xl1 o;
    public final ArrayList p;
    public x81 q;
    public final uk1 r;
    public final tm1 s;
    public final LinkedHashMap t;
    public vp0 u;
    public vk1 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final qi2 z;

    public xk1(kl1 kl1Var, mg mgVar) {
        this.a = kl1Var;
        this.b = mgVar;
        ag0 ag0Var = ag0.h;
        this.g = h7.N(ag0Var);
        nn2 nn2VarN = h7.N(ag0Var);
        this.h = nn2VarN;
        this.i = new i62(nn2VarN);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = x81.i;
        this.r = new uk1(this, (byte) 0);
        this.s = new tm1();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = tz0.d(2, dp.i);
    }

    public static dl1 d(int i, dl1 dl1Var, dl1 dl1Var2, boolean z) {
        dl1Var.getClass();
        if (dl1Var.i.b == i && (dl1Var2 == null || (dl1Var.equals(dl1Var2) && uz0.g(dl1Var.j, dl1Var2.j)))) {
            return dl1Var;
        }
        gl1 gl1Var = dl1Var instanceof gl1 ? (gl1) dl1Var : null;
        if (gl1Var == null) {
            gl1Var = dl1Var.j;
            gl1Var.getClass();
        }
        return gl1Var.m.d(i, gl1Var, dl1Var2, z);
    }

    public static /* synthetic */ void o(xk1 xk1Var, pk1 pk1Var) {
        xk1Var.n(pk1Var, false, new ih());
    }

    public final void a(dl1 dl1Var, Bundle bundle, pk1 pk1Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        lf0 lf0Var = this.a.c;
        dl1 dl1Var2 = pk1Var.i;
        boolean z = dl1Var2 instanceof ja0;
        ih ihVar = this.f;
        if (!z) {
            while (!ihVar.isEmpty() && (((pk1) ihVar.last()).i instanceof ja0) && m(((pk1) ihVar.last()).i.i.b, true, false)) {
            }
        }
        ih<pk1> ihVar2 = new ih();
        Object obj = null;
        if (dl1Var instanceof gl1) {
            dl1 dl1Var3 = dl1Var2;
            do {
                dl1Var3.getClass();
                dl1Var3 = dl1Var3.j;
                if (dl1Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!uz0.g(((pk1) objPrevious2).i, dl1Var3));
                    pk1 pk1VarH = (pk1) objPrevious2;
                    if (pk1VarH == null) {
                        pk1VarH = yy.h(lf0Var, dl1Var3, bundle, h(), this.o);
                    }
                    ihVar2.addFirst(pk1VarH);
                    if (!ihVar.isEmpty() && ((pk1) ihVar.last()).i == dl1Var3) {
                        o(this, (pk1) ihVar.last());
                    }
                }
                if (dl1Var3 == null) {
                    break;
                }
            } while (dl1Var3 != dl1Var);
        }
        dl1 dl1Var4 = ihVar2.isEmpty() ? dl1Var2 : ((pk1) ihVar2.first()).i;
        while (dl1Var4 != null && c(dl1Var4.i.b, dl1Var4) != dl1Var4) {
            dl1Var4 = dl1Var4.j;
            if (dl1Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!uz0.g(((pk1) objPrevious).i, dl1Var4));
                pk1 pk1VarH2 = (pk1) objPrevious;
                if (pk1VarH2 == null) {
                    pk1VarH2 = yy.h(lf0Var, dl1Var4, dl1Var4.a(bundle2), h(), this.o);
                }
                ihVar2.addFirst(pk1VarH2);
            }
        }
        if (!ihVar2.isEmpty()) {
            dl1Var2 = ((pk1) ihVar2.first()).i;
        }
        while (!ihVar.isEmpty() && (((pk1) ihVar.last()).i instanceof gl1)) {
            dl1 dl1Var5 = ((pk1) ihVar.last()).i;
            dl1Var5.getClass();
            if (aa3.g((dm2) ((gl1) dl1Var5).m.d, dl1Var2.i.b) != null) {
                break;
            } else {
                o(this, (pk1) ihVar.last());
            }
        }
        pk1 pk1Var2 = (pk1) ihVar.e();
        if (pk1Var2 == null) {
            pk1Var2 = (pk1) ihVar2.e();
        }
        if (!uz0.g(pk1Var2 != null ? pk1Var2.i : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                dl1 dl1Var6 = ((pk1) objPrevious3).i;
                gl1 gl1Var = this.c;
                gl1Var.getClass();
                if (uz0.g(dl1Var6, gl1Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            pk1 pk1VarH3 = (pk1) obj;
            if (pk1VarH3 == null) {
                gl1 gl1Var2 = this.c;
                gl1Var2.getClass();
                gl1 gl1Var3 = this.c;
                gl1Var3.getClass();
                pk1VarH3 = yy.h(lf0Var, gl1Var2, gl1Var3.a(bundle), h(), this.o);
            }
            ihVar2.addFirst(pk1VarH3);
        }
        for (pk1 pk1Var3 : ihVar2) {
            Object obj2 = this.t.get(this.s.b(pk1Var3.i.h));
            if (obj2 == null) {
                throw new IllegalStateException(wi0.h("NavigatorBackStack for ", dl1Var.h, " should already be created").toString());
            }
            ((tk1) obj2).a(pk1Var3);
        }
        ihVar.addAll(ihVar2);
        ihVar.addLast(pk1Var);
        ArrayList arrayListJ0 = dv.J0(ihVar2, pk1Var);
        int size = arrayListJ0.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayListJ0.get(i);
            i++;
            pk1 pk1Var4 = (pk1) obj3;
            gl1 gl1Var4 = pk1Var4.i.j;
            if (gl1Var4 != null) {
                j(pk1Var4, e(gl1Var4.i.b));
            }
        }
    }

    public final boolean b() {
        ih ihVar;
        while (true) {
            ihVar = this.f;
            if (ihVar.isEmpty() || !(((pk1) ihVar.last()).i instanceof gl1)) {
                break;
            }
            o(this, (pk1) ihVar.last());
        }
        pk1 pk1Var = (pk1) ihVar.g();
        ArrayList arrayList = this.y;
        if (pk1Var != null) {
            arrayList.add(pk1Var);
        }
        this.x++;
        s();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList arrayListS0 = dv.S0(arrayList);
            arrayList.clear();
            int size = arrayListS0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListS0.get(i2);
                i2++;
                pk1 pk1Var2 = (pk1) obj;
                Iterator it = dv.R0(this.p).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        li1.c();
                        return false;
                    }
                    dl1 dl1Var = pk1Var2.i;
                    pk1Var2.a();
                    throw null;
                }
                this.z.q(pk1Var2);
            }
            ArrayList arrayList2 = new ArrayList(ihVar);
            nn2 nn2Var = this.g;
            nn2Var.getClass();
            nn2Var.i(null, arrayList2);
            ArrayList arrayListP = p();
            nn2 nn2Var2 = this.h;
            nn2Var2.getClass();
            nn2Var2.i(null, arrayListP);
        }
        return pk1Var != null;
    }

    public final dl1 c(int i, dl1 dl1Var) {
        dl1 dl1Var2;
        gl1 gl1Var = this.c;
        if (gl1Var == null) {
            return null;
        }
        if (gl1Var.i.b == i) {
            if (dl1Var == null) {
                return gl1Var;
            }
            if (uz0.g(gl1Var, dl1Var) && dl1Var.j == null) {
                return this.c;
            }
        }
        pk1 pk1Var = (pk1) this.f.g();
        if (pk1Var == null || (dl1Var2 = pk1Var.i) == null) {
            dl1Var2 = this.c;
            dl1Var2.getClass();
        }
        return d(i, dl1Var2, dl1Var, false);
    }

    public final pk1 e(int i) {
        Object objPrevious;
        ih ihVar = this.f;
        ListIterator<E> listIterator = ihVar.listIterator(ihVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((pk1) objPrevious).i.i.b != i);
        pk1 pk1Var = (pk1) objPrevious;
        if (pk1Var != null) {
            return pk1Var;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + f()).toString());
    }

    public final dl1 f() {
        pk1 pk1Var = (pk1) this.f.g();
        if (pk1Var != null) {
            return pk1Var.i;
        }
        return null;
    }

    public final gl1 g() {
        gl1 gl1Var = this.c;
        if (gl1Var != null) {
            gl1Var.getClass();
            return gl1Var;
        }
        li1.g("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final x81 h() {
        return this.n == null ? x81.j : this.q;
    }

    public final gl1 i() {
        dl1 dl1Var;
        pk1 pk1Var = (pk1) this.f.g();
        if (pk1Var == null || (dl1Var = pk1Var.i) == null) {
            dl1Var = this.c;
            dl1Var.getClass();
        }
        gl1 gl1Var = dl1Var instanceof gl1 ? (gl1) dl1Var : null;
        if (gl1Var != null) {
            return gl1Var;
        }
        gl1 gl1Var2 = dl1Var.j;
        gl1Var2.getClass();
        return gl1Var2;
    }

    public final void j(pk1 pk1Var, pk1 pk1Var2) {
        this.j.put(pk1Var, pk1Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(pk1Var2) == null) {
            linkedHashMap.put(pk1Var2, new ii());
        }
        Object obj = linkedHashMap.get(pk1Var2);
        obj.getClass();
        ((ii) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[LOOP:7: B:67:0x01c5->B:114:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x010b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118 A[LOOP:4: B:47:0x0110->B:49:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:55:0x0173  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb A[Catch: all -> 0x01ec, TryCatch #0 {, blocks: (B:66:0x01af, B:67:0x01c5, B:69:0x01cb, B:71:0x01db, B:73:0x01e1), top: B:95:0x01af }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void k(dl1 dl1Var, Bundle bundle, vl1 vl1Var) {
        boolean z;
        int iNextIndex;
        dl1 dl1Var2;
        ih<pk1> ihVar;
        sm1 sm1VarB;
        dl1 dl1Var3;
        tk1 tk1VarB;
        ListIterator listIterator;
        int iNextIndex2;
        gl1 gl1Var;
        int i;
        dl1Var.getClass();
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            ((tk1) it.next()).d = true;
        }
        t72 t72Var = new t72();
        boolean zM = (vl1Var == null || (i = vl1Var.c) == -1) ? false : m(i, vl1Var.d, vl1Var.e);
        Bundle bundleA = dl1Var.a(bundle);
        if (vl1Var != null && vl1Var.b && this.l.containsKey(Integer.valueOf(dl1Var.i.b))) {
            t72Var.h = q(dl1Var.i.b, bundleA, vl1Var);
            z = false;
        } else {
            if (vl1Var == null || !vl1Var.a) {
                z = false;
            } else {
                pk1 pk1Var = (pk1) this.f.g();
                ih ihVar2 = this.f;
                ListIterator listIterator2 = ihVar2.listIterator(ihVar2.a());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        if (((pk1) listIterator2.previous()).i == dl1Var) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z = false;
                } else if (dl1Var instanceof gl1) {
                    int i2 = gl1.n;
                    List listI = ph2.I(new ds2(ph2.H((gl1) dl1Var, new de1((byte) 9)), new de1((byte) 5), (byte) 1));
                    if (this.f.j - iNextIndex == listI.size()) {
                        ih ihVar3 = this.f;
                        List listSubList = ihVar3.subList(iNextIndex, ihVar3.j);
                        ArrayList arrayList = new ArrayList(ev.o0(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((pk1) it2.next()).i.i.b));
                        }
                        if (arrayList.equals(listI)) {
                            ihVar = new ih();
                            while (lt.H(this.f) >= iNextIndex) {
                                pk1 pk1Var2 = (pk1) iv.s0(this.f);
                                r(pk1Var2);
                                pk1 pk1Var3 = new pk1(pk1Var2.h, pk1Var2.i, pk1Var2.i.a(bundle), pk1Var2.k, pk1Var2.l, pk1Var2.m, pk1Var2.n);
                                x81 x81Var = pk1Var2.k;
                                x81Var.getClass();
                                pk1Var3.k = x81Var;
                                x81 x81Var2 = pk1Var2.s;
                                x81Var2.getClass();
                                pk1Var3.s = x81Var2;
                                pk1Var3.e();
                                ihVar.addFirst(pk1Var3);
                            }
                            for (pk1 pk1Var4 : ihVar) {
                                gl1Var = pk1Var4.i.j;
                                if (gl1Var != null) {
                                    j(pk1Var4, e(gl1Var.i.b));
                                }
                                this.f.addLast(pk1Var4);
                            }
                            for (pk1 pk1Var5 : ihVar) {
                                sm1VarB = this.s.b(pk1Var5.i.h);
                                dl1Var3 = pk1Var5.i;
                                if (dl1Var3 == null) {
                                    dl1Var3 = null;
                                }
                                if (dl1Var3 != null) {
                                    sm1VarB.c(dl1Var3);
                                    tk1VarB = sm1VarB.b();
                                    synchronized (tk1VarB.a) {
                                        ArrayList arrayListS0 = dv.S0((Collection) tk1VarB.e.h.getValue());
                                        listIterator = arrayListS0.listIterator(arrayListS0.size());
                                        while (true) {
                                            if (listIterator.hasPrevious()) {
                                                if (((pk1) listIterator.previous()).m.equals(pk1Var5.m)) {
                                                    iNextIndex2 = listIterator.nextIndex();
                                                    break;
                                                }
                                            } else {
                                                iNextIndex2 = -1;
                                                break;
                                            }
                                        }
                                        arrayListS0.set(iNextIndex2, pk1Var5);
                                        tk1VarB.b.i(null, arrayListS0);
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                } else if (pk1Var == null || (dl1Var2 = pk1Var.i) == null || dl1Var.i.b != dl1Var2.i.b) {
                    z = false;
                } else {
                    ihVar = new ih();
                    while (lt.H(this.f) >= iNextIndex) {
                        pk1 pk1Var6 = (pk1) iv.s0(this.f);
                        r(pk1Var6);
                        pk1 pk1Var7 = new pk1(pk1Var6.h, pk1Var6.i, pk1Var6.i.a(bundle), pk1Var6.k, pk1Var6.l, pk1Var6.m, pk1Var6.n);
                        x81 x81Var3 = pk1Var6.k;
                        x81Var3.getClass();
                        pk1Var7.k = x81Var3;
                        x81 x81Var4 = pk1Var6.s;
                        x81Var4.getClass();
                        pk1Var7.s = x81Var4;
                        pk1Var7.e();
                        ihVar.addFirst(pk1Var7);
                    }
                    while (r0.hasNext()) {
                        gl1Var = pk1Var4.i.j;
                        if (gl1Var != null) {
                            j(pk1Var4, e(gl1Var.i.b));
                        }
                        this.f.addLast(pk1Var4);
                    }
                    while (r0.hasNext()) {
                        sm1VarB = this.s.b(pk1Var5.i.h);
                        dl1Var3 = pk1Var5.i;
                        if (dl1Var3 == null) {
                            dl1Var3 = null;
                        }
                        if (dl1Var3 != null) {
                            sm1VarB.c(dl1Var3);
                            tk1VarB = sm1VarB.b();
                            synchronized (tk1VarB.a) {
                                ArrayList arrayListS1 = dv.S0((Collection) tk1VarB.e.h.getValue());
                                listIterator = arrayListS1.listIterator(arrayListS1.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (((pk1) listIterator.previous()).m.equals(pk1Var5.m)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListS1.set(iNextIndex2, pk1Var5);
                                tk1VarB.b.i(null, arrayListS1);
                            }
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                pk1 pk1VarH = yy.h(this.a.c, dl1Var, bundleA, h(), this.o);
                sm1 sm1VarB2 = this.s.b(dl1Var.h);
                List listP = lt.P(pk1VarH);
                this.u = new b20((Object) t72Var, (Object) this, (Object) dl1Var, (Object) bundleA, (byte) 5);
                sm1VarB2.d(listP, vl1Var);
                this.u = null;
            }
        }
        this.b.a();
        Iterator it3 = this.t.values().iterator();
        while (it3.hasNext()) {
            ((tk1) it3.next()).d = false;
        }
        if (zM || t72Var.h || z) {
            b();
        } else {
            s();
        }
    }

    public final void l(String str, vl1 vl1Var) {
        if (this.c == null) {
            li1.o("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, ".");
            return;
        }
        gl1 gl1VarI = i();
        cl1 cl1VarD = gl1VarI.d(str, true, gl1VarI);
        if (cl1VarD == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + this.c);
        }
        dl1 dl1Var = cl1VarD.h;
        Bundle bundleA = dl1Var.a(cl1VarD.i);
        if (bundleA == null) {
            bundleA = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
        }
        int i = dl1.l;
        String str2 = (String) dl1Var.i.f;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        k(dl1Var, bundleA, vl1Var);
    }

    public final boolean m(int i, boolean z, boolean z2) {
        dl1 dl1Var;
        boolean z3;
        ih ihVar = this.f;
        final byte b = 0;
        if (ihVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = dv.K0(ihVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                dl1Var = null;
                break;
            }
            dl1 dl1Var2 = ((pk1) it.next()).i;
            String str = dl1Var2.h;
            fe feVar = dl1Var2.i;
            sm1 sm1VarB = this.s.b(str);
            if (z || feVar.b != i) {
                arrayList.add(sm1VarB);
            }
            if (feVar.b == i) {
                dl1Var = dl1Var2;
                break;
            }
        }
        if (dl1Var == null) {
            int i2 = dl1.l;
            es.K(this.a.c, i);
            return false;
        }
        t72 t72Var = new t72();
        ih ihVar2 = new ih();
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z3 = z2;
                break;
            }
            int i4 = i3 + 1;
            sm1 sm1Var = (sm1) arrayList.get(i3);
            t72 t72Var2 = new t72();
            pk1 pk1Var = (pk1) ihVar.last();
            z3 = z2;
            vk1 vk1Var = new vk1(t72Var2, t72Var, this, z3, ihVar2);
            sm1Var.getClass();
            pk1Var.getClass();
            this.v = vk1Var;
            sm1Var.e(pk1Var, z3);
            this.v = null;
            if (!t72Var2.h) {
                break;
            }
            i3 = i4;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.l;
            if (!z) {
                ij0 ij0Var = new ij0(new ds2(ph2.H(dl1Var, new de1((byte) 6)), new vp0(this) { // from class: wk1
                    public final /* synthetic */ xk1 i;

                    {
                        this.i = this;
                    }

                    @Override // defpackage.vp0
                    public final Object h(Object obj) {
                        boolean zContainsKey;
                        byte b2 = b;
                        xk1 xk1Var = this.i;
                        dl1 dl1Var3 = (dl1) obj;
                        switch (b2) {
                            case 0:
                                dl1Var3.getClass();
                                zContainsKey = xk1Var.l.containsKey(Integer.valueOf(dl1Var3.i.b));
                                break;
                            default:
                                dl1Var3.getClass();
                                zContainsKey = xk1Var.l.containsKey(Integer.valueOf(dl1Var3.i.b));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, (byte) 0));
                while (ij0Var.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((dl1) ij0Var.next()).i.b);
                    sk1 sk1Var = (sk1) ihVar2.e();
                    linkedHashMap.put(numValueOf, sk1Var != null ? (String) sk1Var.a.b : null);
                }
            }
            if (!ihVar2.isEmpty()) {
                e9 e9Var = ((sk1) ihVar2.first()).a;
                String str2 = (String) e9Var.b;
                final byte b2 = 1;
                ij0 ij0Var2 = new ij0(new ds2(ph2.H(c(e9Var.a, null), new de1((byte) 7)), new vp0(this) { // from class: wk1
                    public final /* synthetic */ xk1 i;

                    {
                        this.i = this;
                    }

                    @Override // defpackage.vp0
                    public final Object h(Object obj) {
                        boolean zContainsKey;
                        byte b3 = b2;
                        xk1 xk1Var = this.i;
                        dl1 dl1Var3 = (dl1) obj;
                        switch (b3) {
                            case 0:
                                dl1Var3.getClass();
                                zContainsKey = xk1Var.l.containsKey(Integer.valueOf(dl1Var3.i.b));
                                break;
                            default:
                                dl1Var3.getClass();
                                zContainsKey = xk1Var.l.containsKey(Integer.valueOf(dl1Var3.i.b));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, (byte) 0));
                while (ij0Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((dl1) ij0Var2.next()).i.b), str2);
                }
                if (linkedHashMap.values().contains(str2)) {
                    this.m.put(str2, ihVar2);
                }
            }
        }
        this.b.a();
        return t72Var.h;
    }

    public final void n(pk1 pk1Var, boolean z, ih ihVar) {
        xl1 xl1Var;
        Set set;
        pk1Var.getClass();
        ih ihVar2 = this.f;
        pk1 pk1Var2 = (pk1) ihVar2.last();
        if (!uz0.g(pk1Var2, pk1Var)) {
            li1.j("Attempted to pop ", pk1Var.i, ", which is not the top of the back stack (", pk1Var2.i, ")");
            return;
        }
        iv.s0(ihVar2);
        tk1 tk1Var = (tk1) this.t.get(this.s.b(pk1Var2.i.h));
        boolean z2 = true;
        if ((tk1Var == null || (set = (Set) tk1Var.f.h.getValue()) == null || !set.contains(pk1Var2)) && !this.k.containsKey(pk1Var2)) {
            z2 = false;
        }
        x81 x81Var = pk1Var2.r.h;
        x81 x81Var2 = x81.j;
        if (x81Var.compareTo(x81Var2) >= 0) {
            if (z) {
                pk1Var2.s = x81Var2;
                pk1Var2.e();
                ihVar.addFirst(new sk1(pk1Var2));
            }
            if (z2) {
                pk1Var2.s = x81Var2;
                pk1Var2.e();
            } else {
                pk1Var2.s = x81.h;
                pk1Var2.e();
                r(pk1Var2);
            }
        }
        if (z || z2 || (xl1Var = this.o) == null) {
            return;
        }
        xl1Var.j(pk1Var2.m);
    }

    public final ArrayList p() {
        x81 x81Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            x81Var = x81.k;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((tk1) it.next()).f.h.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                pk1 pk1Var = (pk1) obj;
                if (!arrayList.contains(pk1Var) && pk1Var.s.compareTo(x81Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            iv.q0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            pk1 pk1Var2 = (pk1) obj2;
            if (!arrayList.contains(pk1Var2) && pk1Var2.s.compareTo(x81Var) >= 0) {
                arrayList3.add(obj2);
            }
        }
        iv.q0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (!(((pk1) obj3).i instanceof gl1)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, vl1 vl1Var) {
        dl1 dl1VarG;
        pk1 pk1Var;
        dl1 dl1Var;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (uz0.g((String) it.next(), str)) {
                it.remove();
            }
        }
        ih<sk1> ihVar = (ih) t03.j(this.m).remove(str);
        lf0 lf0Var = this.a.c;
        ArrayList arrayList = new ArrayList();
        pk1 pk1Var2 = (pk1) this.f.g();
        if (pk1Var2 == null || (dl1VarG = pk1Var2.i) == null) {
            dl1VarG = g();
        }
        if (ihVar != null) {
            for (sk1 sk1Var : ihVar) {
                e9 e9Var = sk1Var.a;
                e9 e9Var2 = sk1Var.a;
                dl1 dl1VarD = d(e9Var.a, dl1VarG, null, true);
                if (dl1VarD == null) {
                    int i3 = dl1.l;
                    li1.n("Restore State failed: destination ", es.K(lf0Var, e9Var2.a), " cannot be found from the current destination ", dl1VarG);
                    return false;
                }
                x81 x81VarH = h();
                xl1 xl1Var = this.o;
                lf0Var.getClass();
                x81VarH.getClass();
                Bundle bundle3 = (Bundle) e9Var2.c;
                if (bundle3 != null) {
                    Context context = lf0Var.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new pk1(lf0Var, dl1VarD, bundle2, x81VarH, xl1Var, (String) e9Var2.b, (Bundle) e9Var2.d));
                dl1VarG = dl1VarD;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((pk1) obj).i instanceof gl1)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            pk1 pk1Var3 = (pk1) obj2;
            List list = (List) dv.G0(arrayList2);
            if (uz0.g((list == null || (pk1Var = (pk1) dv.F0(list)) == null || (dl1Var = pk1Var.i) == null) ? null : dl1Var.h, pk1Var3.i.h)) {
                list.add(pk1Var3);
            } else {
                arrayList2.add(lt.S(pk1Var3));
            }
        }
        t72 t72Var = new t72();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            sm1 sm1VarB = this.s.b(((pk1) dv.x0(list2)).i.h);
            ArrayList arrayList4 = arrayList;
            this.u = new u3(t72Var, arrayList4, new v72(), this, bundle, (byte) 5);
            sm1VarB.d(list2, vl1Var);
            this.u = null;
            arrayList = arrayList4;
        }
        return t72Var.h;
    }

    public final void r(pk1 pk1Var) {
        pk1Var.getClass();
        pk1 pk1Var2 = (pk1) this.j.remove(pk1Var);
        if (pk1Var2 != null) {
            LinkedHashMap linkedHashMap = this.k;
            ii iiVar = (ii) linkedHashMap.get(pk1Var2);
            Integer numValueOf = iiVar != null ? Integer.valueOf(iiVar.a.decrementAndGet()) : null;
            if (numValueOf == null || numValueOf.intValue() != 0) {
                return;
            }
            tk1 tk1Var = (tk1) this.t.get(this.s.b(pk1Var2.i.h));
            if (tk1Var != null) {
                tk1Var.c(pk1Var2);
            }
            linkedHashMap.remove(pk1Var2);
        }
    }

    public final void s() {
        ii iiVar;
        Set set;
        ArrayList arrayListS0 = dv.S0(this.f);
        if (arrayListS0.isEmpty()) {
            return;
        }
        ArrayList arrayListS = lt.S(((pk1) dv.F0(arrayListS0)).i);
        ArrayList arrayList = new ArrayList();
        if (dv.F0(arrayListS) instanceof ja0) {
            Iterator it = dv.K0(arrayListS0).iterator();
            while (it.hasNext()) {
                dl1 dl1Var = ((pk1) it.next()).i;
                arrayList.add(dl1Var);
                if (!(dl1Var instanceof ja0) && !(dl1Var instanceof gl1)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (pk1 pk1Var : dv.K0(arrayListS0)) {
            x81 x81Var = pk1Var.s;
            dl1 dl1Var2 = pk1Var.i;
            dl1 dl1Var3 = (dl1) dv.y0(arrayListS);
            x81 x81Var2 = x81.k;
            x81 x81Var3 = x81.l;
            if (dl1Var3 != null && dl1Var3.i.b == dl1Var2.i.b) {
                if (x81Var != x81Var3) {
                    tk1 tk1Var = (tk1) this.t.get(this.s.b(pk1Var.i.h));
                    if (uz0.g((tk1Var == null || (set = (Set) tk1Var.f.h.getValue()) == null) ? null : Boolean.valueOf(set.contains(pk1Var)), Boolean.TRUE) || ((iiVar = (ii) this.k.get(pk1Var)) != null && iiVar.a.get() == 0)) {
                        map.put(pk1Var, x81Var2);
                    } else {
                        map.put(pk1Var, x81Var3);
                    }
                }
                dl1 dl1Var4 = (dl1) dv.y0(arrayList);
                if (dl1Var4 != null && dl1Var4.i.b == dl1Var2.i.b) {
                    iv.r0(arrayList);
                }
                iv.r0(arrayListS);
                gl1 gl1Var = dl1Var2.j;
                if (gl1Var != null) {
                    arrayListS.add(gl1Var);
                }
            } else if (arrayList.isEmpty() || dl1Var2.i.b != ((dl1) dv.x0(arrayList)).i.b) {
                pk1Var.s = x81.j;
                pk1Var.e();
            } else {
                dl1 dl1Var5 = (dl1) iv.r0(arrayList);
                if (x81Var == x81Var3) {
                    pk1Var.s = x81Var2;
                    pk1Var.e();
                } else if (x81Var != x81Var2) {
                    map.put(pk1Var, x81Var2);
                }
                gl1 gl1Var2 = dl1Var5.j;
                if (gl1Var2 != null && !arrayList.contains(gl1Var2)) {
                    arrayList.add(gl1Var2);
                }
            }
        }
        int size = arrayListS0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListS0.get(i);
            i++;
            pk1 pk1Var2 = (pk1) obj;
            x81 x81Var4 = (x81) map.get(pk1Var2);
            if (x81Var4 != null) {
                pk1Var2.getClass();
                pk1Var2.s = x81Var4;
                pk1Var2.e();
            } else {
                pk1Var2.e();
            }
        }
    }
}
