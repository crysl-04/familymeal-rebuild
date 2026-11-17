package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wk implements au1, r33 {
    public final /* synthetic */ byte h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public wk(od odVar, xw2 xw2Var, List list, e90 e90Var, sm0 sm0Var, boolean z) {
        int i;
        od odVar2 = odVar;
        xw2 xw2Var2 = xw2Var;
        this.h = (byte) 7;
        this.i = odVar2;
        this.j = list;
        final byte b = 0;
        kp0 kp0Var = new kp0(this) { // from class: vh1
            public final /* synthetic */ wk i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                byte b2 = b;
                float fB = 0.0f;
                Object obj = null;
                int i2 = 1;
                wk wkVar = this.i;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) wkVar.l;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fB2 = ((zt1) obj2).a.b();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fB3 = ((zt1) obj3).a.b();
                                    if (Float.compare(fB2, fB3) < 0) {
                                        obj2 = obj3;
                                        fB2 = fB3;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        zt1 zt1Var = (zt1) obj;
                        if (zt1Var != null) {
                            fB = zt1Var.a.b();
                        }
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) wkVar.l;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((zt1) obj4).a.p.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fC2 = ((zt1) obj5).a.p.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        zt1 zt1Var2 = (zt1) obj;
                        if (zt1Var2 != null) {
                            fB = zt1Var2.a.p.c();
                        }
                        break;
                }
                return Float.valueOf(fB);
            }
        };
        g81 g81Var = g81.i;
        vs.N(g81Var, kp0Var);
        final byte b2 = 1;
        this.k = vs.N(g81Var, new kp0(this) { // from class: vh1
            public final /* synthetic */ wk i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                byte b3 = b2;
                float fB = 0.0f;
                Object obj = null;
                int i2 = 1;
                wk wkVar = this.i;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) wkVar.l;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fB2 = ((zt1) obj2).a.b();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fB3 = ((zt1) obj3).a.b();
                                    if (Float.compare(fB2, fB3) < 0) {
                                        obj2 = obj3;
                                        fB2 = fB3;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        zt1 zt1Var = (zt1) obj;
                        if (zt1Var != null) {
                            fB = zt1Var.a.b();
                        }
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) wkVar.l;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((zt1) obj4).a.p.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fC2 = ((zt1) obj5).a.p.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        zt1 zt1Var2 = (zt1) obj;
                        if (zt1Var2 != null) {
                            fB = zt1Var2.a.p.c();
                        }
                        break;
                }
                return Float.valueOf(fB);
            }
        });
        cu1 cu1Var = xw2Var2.b;
        od odVar3 = pd.a;
        ArrayList arrayList = odVar2.k;
        String str = odVar2.i;
        ag0 ag0Var = ag0.h;
        List listM0 = arrayList != null ? dv.M0(arrayList, new mm0((byte) 6)) : ag0Var;
        ArrayList arrayList2 = new ArrayList();
        ih ihVar = new ih();
        int size = listM0.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            nd ndVar = (nd) listM0.get(i2);
            cu1 cu1VarA = cu1Var.a((cu1) ndVar.a);
            int i4 = ndVar.b;
            int i5 = ndVar.c;
            if (i4 > i5) {
                bx0.a("Reversed range is not supported");
            }
            while (i3 < i4) {
                if (ihVar.isEmpty()) {
                    arrayList2.add(new nd(i3, i4, cu1Var));
                    i3 = i4;
                    break;
                }
                nd ndVar2 = (nd) ihVar.last();
                listM0 = listM0;
                int i6 = ndVar2.c;
                ag0Var = ag0Var;
                Object obj = ndVar2.a;
                if (i4 < i6) {
                    arrayList2.add(new nd(i3, i4, obj));
                    i3 = i4;
                } else {
                    int i7 = size;
                    arrayList2.add(new nd(i3, i6, obj));
                    i3 = ndVar2.c;
                    while (!ihVar.isEmpty() && i3 == ((nd) ihVar.last()).c) {
                        ihVar.removeLast();
                    }
                    size = i7;
                }
            }
            nd ndVar3 = (nd) ihVar.g();
            if (ndVar3 != null) {
                int i8 = ndVar3.c;
                Object obj2 = ndVar3.a;
                int i9 = ndVar3.b;
                if (i9 == i4 && i8 == i5) {
                    ihVar.removeLast();
                    ihVar.addLast(new nd(i4, i5, ((cu1) obj2).a(cu1VarA)));
                } else if (i9 == i8) {
                    arrayList2.add(new nd(i9, i8, obj2));
                    ihVar.removeLast();
                    ihVar.addLast(new nd(i4, i5, cu1VarA));
                } else {
                    if (i8 < i5) {
                        wg.f();
                        throw null;
                    }
                    ihVar.addLast(new nd(i4, i5, ((cu1) obj2).a(cu1VarA)));
                }
            } else {
                ihVar.addLast(new nd(i4, i5, cu1VarA));
            }
            i2++;
            listM0 = listM0;
            ag0Var = ag0Var;
            size = size;
        }
        ag0 ag0Var2 = ag0Var;
        while (i3 <= str.length() && !ihVar.isEmpty()) {
            nd ndVar4 = (nd) ihVar.last();
            Object obj3 = ndVar4.a;
            int i10 = ndVar4.c;
            arrayList2.add(new nd(i3, i10, obj3));
            while (!ihVar.isEmpty() && i10 == ((nd) ihVar.last()).c) {
                ihVar.removeLast();
            }
            i3 = i10;
        }
        if (i3 < str.length()) {
            arrayList2.add(new nd(i3, str.length(), cu1Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new nd(0, 0, cu1Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i11 = i;
        for (int size2 = arrayList2.size(); i11 < size2; size2 = size2) {
            nd ndVar5 = (nd) arrayList2.get(i11);
            int i12 = ndVar5.b;
            int i13 = ndVar5.c;
            String strSubstring = i12 != i13 ? str.substring(i12, i13) : "";
            List listA = pd.a(odVar2, i12, i13, new s0((byte) 12));
            od odVar4 = new od(strSubstring, listA == null ? ag0Var2 : listA);
            cu1 cu1Var2 = (cu1) ndVar5.a;
            if (cu1Var2.b == 0) {
                cu1Var2 = new cu1(cu1Var2.a, cu1Var.b, cu1Var2.c, cu1Var2.d, cu1Var2.e, cu1Var2.f, cu1Var2.g, cu1Var2.h, cu1Var2.i);
            }
            xw2 xw2Var3 = new xw2(xw2Var2.a, cu1Var.a(cu1Var2));
            List list2 = odVar4.h;
            List list3 = list2 == null ? ag0Var2 : list2;
            List list4 = (List) this.j;
            ArrayList arrayList4 = new ArrayList(list4.size());
            int size3 = list4.size();
            int i14 = 0;
            while (i14 < size3) {
                nd ndVar6 = (nd) list4.get(i14);
                int i15 = ndVar6.b;
                cu1 cu1Var3 = cu1Var;
                int i16 = ndVar6.c;
                if (pd.b(i12, i13, i15, i16)) {
                    if (i12 > i15 || i16 > i13) {
                        bx0.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new nd(i15 - i12, i16 - i12, ndVar6.a));
                }
                i14++;
                list4 = list4;
                cu1Var = cu1Var3;
            }
            arrayList3.add(new zt1(new k9(strSubstring, xw2Var3, list3, arrayList4, sm0Var, e90Var, z), i12, i13));
            i11++;
            odVar2 = odVar;
            xw2Var2 = xw2Var;
            str = str;
        }
        this.l = arrayList3;
    }

    public static void d(wk wkVar, lm1 lm1Var) {
        wkVar.getClass();
        lm1Var.getClass();
        if (((gj1) wkVar.k).a(lm1Var)) {
            om1 om1Var = (om1) wkVar.j;
            if (lm1Var.e != null) {
                li1.h("Handler '", lm1Var, "' is already registered with a dispatcher");
                return;
            }
            om1Var.e.addFirst(lm1Var);
            lm1Var.e = wkVar;
            om1Var.b();
        }
    }

    public final void A(ep0 ep0Var) {
        jo0 jo0Var = ep0Var.c;
        String str = jo0Var.l;
        HashMap map = (HashMap) this.j;
        if (map.get(str) != null) {
            return;
        }
        map.put(jo0Var.l, ep0Var);
        if (yo0.J(2)) {
            jo0Var.toString();
        }
    }

    public final void B(ep0 ep0Var) {
        HashMap map = (HashMap) this.j;
        jo0 jo0Var = ep0Var.c;
        if (jo0Var.J) {
            ((ap0) this.l).f(jo0Var);
        }
        if (map.get(jo0Var.l) == ep0Var && ((ep0) map.put(jo0Var.l, null)) != null && yo0.J(2)) {
            jo0Var.toString();
        }
    }

    public final boolean C(f3 f3Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.i).onActionItemClicked(r(f3Var), new pf1((Context) this.j, (zp2) menuItem));
    }

    public final boolean D(f3 f3Var, if1 if1Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.i;
        vp2 vp2VarR = r(f3Var);
        bj2 bj2Var = (bj2) this.l;
        Menu zf1Var = (Menu) bj2Var.get(if1Var);
        if (zf1Var == null) {
            zf1Var = new zf1((Context) this.j, if1Var);
            bj2Var.put(if1Var, zf1Var);
        }
        return callback.onCreateActionMode(vp2VarR, zf1Var);
    }

    public final void E(int i) {
        int[] iArr = (int[]) this.k;
        int i2 = iArr[i];
        int[] iArr2 = (int[]) this.j;
        int i3 = iArr2[i];
        if (i2 >= 0) {
            iArr2[i2] = i3;
        } else {
            ((int[]) this.i)[((int[]) this.l)[i]] = i3;
        }
        if (i3 >= 0) {
            iArr[i3] = i2;
        }
    }

    public final Bundle F(String str, Bundle bundle) {
        HashMap map = (HashMap) this.k;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    @Override // defpackage.o33
    public final long b(id idVar, id idVar2, id idVar3) {
        int iB = idVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((jd) this.i).get(i).d(idVar.a(i), idVar2.a(i), idVar3.a(i)));
        }
        return jMax;
    }

    public final void c(jo0 jo0Var) {
        if (((ArrayList) this.i).contains(jo0Var)) {
            throw new IllegalStateException("Fragment already added: " + jo0Var);
        }
        synchronized (((ArrayList) this.i)) {
            ((ArrayList) this.i).add(jo0Var);
        }
        jo0Var.r = true;
    }

    public final void e(nm1 nm1Var) {
        if (((gj1) this.l).a(nm1Var)) {
            ((om1) this.j).a(this, nm1Var, -1);
        }
    }

    public final void f(dq1 dq1Var, int i) {
        if (i != 1 && i != 0) {
            li1.e(jp1.h(i, "Unsupported priority value: "));
        } else if (((gj1) this.l).a(dq1Var)) {
            ((om1) this.j).a(this, dq1Var, i);
        }
    }

    public final void g(gi0 gi0Var) {
        ((TreeSet) this.k).add(gi0Var);
    }

    public final void h(nm1 nm1Var, jm1 jm1Var) {
        om1 om1Var = (om1) this.j;
        if (om1Var.g == 0) {
            lm1 lm1VarC = om1Var.c(-1);
            om1Var.f = lm1VarC;
            om1Var.g = -1;
            om1Var.h = nm1Var;
            if (jm1Var != null) {
                if (lm1VarC != null) {
                    lm1VarC.d(jm1Var);
                }
                om1Var.a.i(null, new qm1(jm1Var));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r0 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        if (r0 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r8, long r10, defpackage.n10 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.xm1
            if (r0 == 0) goto L14
            r0 = r12
            xm1 r0 = (defpackage.xm1) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.m = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            xm1 r0 = new xm1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.k
            int r1 = r12.m
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.m02.y(r0)
            goto L73
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r7)
            return r2
        L31:
            defpackage.m02.y(r0)
            goto L58
        L35:
            defpackage.m02.y(r0)
            java.lang.Object r0 = r7.j
            bn1 r0 = (defpackage.bn1) r0
            if (r0 == 0) goto L43
            bn1 r0 = r0.K0()
            goto L44
        L43:
            r0 = r2
        L44:
            r5 = 0
            y20 r1 = defpackage.y20.h
            if (r0 != 0) goto L5d
            java.lang.Object r7 = r7.k
            bn1 r7 = (defpackage.bn1) r7
            if (r7 == 0) goto L77
            r12.m = r4
            java.lang.Object r0 = r7.L0(r8, r10, r12)
            if (r0 == r1) goto L72
        L58:
            a43 r0 = (defpackage.a43) r0
            long r5 = r0.a
            goto L77
        L5d:
            java.lang.Object r7 = r7.j
            bn1 r7 = (defpackage.bn1) r7
            if (r7 == 0) goto L67
            bn1 r2 = r7.K0()
        L67:
            r7 = r2
            if (r7 == 0) goto L77
            r12.m = r3
            java.lang.Object r0 = r7.L0(r8, r10, r12)
            if (r0 != r1) goto L73
        L72:
            return r1
        L73:
            a43 r0 = (defpackage.a43) r0
            long r5 = r0.a
        L77:
            a43 r7 = new a43
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.i(long, long, n10):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(long j, n10 n10Var) {
        ym1 ym1Var;
        long j2;
        if (n10Var instanceof ym1) {
            ym1Var = (ym1) n10Var;
            int i = ym1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ym1Var.m = i - Integer.MIN_VALUE;
            } else {
                ym1Var = new ym1(this, n10Var);
            }
        } else {
            ym1Var = new ym1(this, n10Var);
        }
        Object objN0 = ym1Var.k;
        int i2 = ym1Var.m;
        if (i2 == 0) {
            m02.y(objN0);
            bn1 bn1Var = (bn1) this.j;
            bn1 bn1VarK0 = bn1Var != null ? bn1Var.K0() : null;
            if (bn1VarK0 != null) {
                ym1Var.m = 1;
                objN0 = bn1VarK0.N0(j, ym1Var);
                y20 y20Var = y20.h;
                if (objN0 == y20Var) {
                    return y20Var;
                }
            } else {
                j2 = 0;
            }
            return new a43(j2);
        }
        if (i2 != 1) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m02.y(objN0);
        j2 = ((a43) objN0).a;
        return new a43(j2);
    }

    @Override // defpackage.o33
    public final id l(long j, id idVar, id idVar2, id idVar3) {
        id idVarC = (id) this.k;
        if (idVarC == null) {
            idVarC = idVar3.c();
            this.k = idVarC;
        }
        int iB = idVarC.b();
        int i = 0;
        while (true) {
            id idVar4 = (id) this.k;
            if (i >= iB) {
                if (idVar4 != null) {
                    return idVar4;
                }
                uz0.A("velocityVector");
                throw null;
            }
            if (idVar4 == null) {
                uz0.A("velocityVector");
                throw null;
            }
            long j2 = j;
            idVar4.e(i, ((jd) this.i).get(i).c(j2, idVar.a(i), idVar2.a(i), idVar3.a(i)));
            i++;
            j = j2;
        }
    }

    public final jo0 m(String str) {
        ep0 ep0Var = (ep0) ((HashMap) this.j).get(str);
        if (ep0Var != null) {
            return ep0Var.c;
        }
        return null;
    }

    public final jo0 n(String str) {
        for (ep0 ep0Var : ((HashMap) this.j).values()) {
            if (ep0Var != null) {
                jo0 jo0VarN = ep0Var.c;
                if (!str.equals(jo0VarN.l)) {
                    jo0VarN = jo0VarN.C.c.n(str);
                }
                if (jo0VarN != null) {
                    return jo0VarN;
                }
            }
        }
        return null;
    }

    @Override // defpackage.o33
    public final id p(long j, id idVar, id idVar2, id idVar3) {
        id idVarC = (id) this.j;
        if (idVarC == null) {
            idVarC = idVar.c();
            this.j = idVarC;
        }
        int iB = idVarC.b();
        int i = 0;
        while (true) {
            id idVar4 = (id) this.j;
            if (i >= iB) {
                if (idVar4 != null) {
                    return idVar4;
                }
                uz0.A("valueVector");
                throw null;
            }
            if (idVar4 == null) {
                uz0.A("valueVector");
                throw null;
            }
            long j2 = j;
            idVar4.e(i, ((jd) this.i).get(i).b(j2, idVar.a(i), idVar2.a(i), idVar3.a(i)));
            i++;
            j = j2;
        }
    }

    @Override // defpackage.o33
    public final id q(id idVar, id idVar2, id idVar3) {
        id idVarC = (id) this.l;
        if (idVarC == null) {
            idVarC = idVar3.c();
            this.l = idVarC;
        }
        int iB = idVarC.b();
        int i = 0;
        while (true) {
            id idVar4 = (id) this.l;
            if (i >= iB) {
                if (idVar4 != null) {
                    return idVar4;
                }
                uz0.A("endVelocityVector");
                throw null;
            }
            if (idVar4 == null) {
                uz0.A("endVelocityVector");
                throw null;
            }
            idVar4.e(i, ((jd) this.i).get(i).e(idVar.a(i), idVar2.a(i), idVar3.a(i)));
            i++;
        }
    }

    public final vp2 r(f3 f3Var) {
        ArrayList arrayList = (ArrayList) this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vp2 vp2Var = (vp2) arrayList.get(i);
            if (vp2Var != null && vp2Var.b == f3Var) {
                return vp2Var;
            }
        }
        vp2 vp2Var2 = new vp2((Context) this.j, f3Var);
        arrayList.add(vp2Var2);
        return vp2Var2;
    }

    public final ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (ep0 ep0Var : ((HashMap) this.j).values()) {
            if (ep0Var != null) {
                arrayList.add(ep0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (ep0 ep0Var : ((HashMap) this.j).values()) {
            if (ep0Var != null) {
                arrayList.add(ep0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final String toString() {
        switch (this.h) {
            case 5:
                return "NodeStatistics [I=" + ((LongAdder) this.l) + ", E=" + ((LongAdder) this.j) + ", S=" + ((LongAdder) this.k) + ", A=" + ((LongAdder) this.i) + "]";
            default:
                return super.toString();
        }
    }

    public final x20 u() {
        x20 x20Var = (x20) ((kp0) this.i).a();
        if (x20Var != null) {
            return x20Var;
        }
        li1.g("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final List v() {
        ArrayList arrayList;
        if (((ArrayList) this.i).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.i)) {
            arrayList = new ArrayList((ArrayList) this.i);
        }
        return arrayList;
    }

    public final boolean w() {
        ArrayList arrayList = (ArrayList) this.l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((zt1) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    public final float x() {
        return ((Number) ((d51) this.k).getValue()).floatValue();
    }

    public final z43 y(du duVar, String str) {
        z43 z43Var;
        z43 z43VarA;
        synchronized (((jy1) this.l)) {
            z43Var = (z43) ((g53) this.i).a.get(str);
            if (duVar.d(z43Var)) {
                e53 e53Var = (e53) this.j;
                if (e53Var instanceof fc2) {
                    fc2 fc2Var = (fc2) e53Var;
                    z43Var.getClass();
                    h91 h91Var = fc2Var.d;
                    if (h91Var != null) {
                        k42 k42Var = fc2Var.e;
                        k42Var.getClass();
                        es.m(z43Var, k42Var, h91Var);
                    }
                }
                z43Var.getClass();
            } else {
                pi1 pi1Var = new pi1((e30) this.k);
                pi1Var.a.put(s60.B0, str);
                e53 e53Var2 = (e53) this.j;
                e53Var2.getClass();
                try {
                    try {
                        z43VarA = e53Var2.c(duVar, pi1Var);
                    } catch (AbstractMethodError unused) {
                        Class cls = duVar.a;
                        cls.getClass();
                        z43VarA = e53Var2.a(cls);
                    }
                } catch (AbstractMethodError unused2) {
                    Class cls2 = duVar.a;
                    cls2.getClass();
                    z43VarA = e53Var2.b(cls2, pi1Var);
                }
                z43Var = z43VarA;
                g53 g53Var = (g53) this.i;
                g53Var.getClass();
                z43Var.getClass();
                z43 z43Var2 = (z43) g53Var.a.put(str, z43Var);
                if (z43Var2 != null) {
                    z43Var2.b();
                }
            }
        }
        return z43Var;
    }

    public final void z(int i, int i2) {
        int[] iArr = (int[]) this.i;
        int i3 = iArr[i2];
        ((int[]) this.j)[i] = i3;
        int[] iArr2 = (int[]) this.k;
        iArr2[i] = -1;
        if (i3 >= 0) {
            iArr2[i3] = i;
        }
        iArr[i2] = i;
        ((int[]) this.l)[i] = i2;
    }

    public wk(g53 g53Var, e53 e53Var, e30 e30Var) {
        this.h = (byte) 13;
        g53Var.getClass();
        e53Var.getClass();
        e30Var.getClass();
        this.i = g53Var;
        this.j = e53Var;
        this.k = e30Var;
        this.l = new jy1((byte) 20);
    }

    public wk(v3 v3Var) {
        this.h = (byte) 8;
        this.i = v3Var;
        this.j = new om1();
        js1.a();
        this.k = js1.a();
        this.l = js1.a();
    }

    public wk(int i, int i2) {
        this.h = (byte) 1;
        this.l = new int[i];
        int[] iArr = new int[i2 + 1];
        this.i = iArr;
        this.j = new int[i];
        this.k = new int[i];
        Arrays.fill(iArr, -1);
    }

    public wk(byte b) {
        this.h = b;
        switch (b) {
            case 4:
                this.i = new ArrayList();
                this.j = new HashMap();
                this.k = new HashMap();
                break;
            case 5:
                this.i = new LongAdder();
                this.j = new LongAdder();
                this.k = new LongAdder();
                this.l = new LongAdder();
                break;
            case 6:
            case 7:
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
            default:
                this.i = new DoubleAdder();
                this.j = new LongAdder();
                this.k = new LongAdder();
                this.l = new LongAdder();
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                this.i = new o9((Object) this, (byte) 26);
                break;
            case 10:
                this.i = new li1((byte) 12);
                this.j = new ArrayList();
                TreeSet treeSet = new TreeSet();
                this.k = treeSet;
                this.l = new li1((byte) 13);
                treeSet.clear();
                g(h22.a);
                g(h22.c);
                g(h22.e);
                g(h22.f);
                g(h22.b);
                g(h22.d);
                break;
        }
    }

    public wk(Typeface typeface, dg1 dg1Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.h = (byte) 6;
        this.l = typeface;
        this.i = dg1Var;
        this.k = new eg1(1024);
        int iA = dg1Var.a(6);
        if (iA != 0) {
            int i5 = iA + dg1Var.h;
            i = ((ByteBuffer) dg1Var.k).getInt(((ByteBuffer) dg1Var.k).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.j = new char[i << 1];
        int iA2 = dg1Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + dg1Var.h;
            i2 = ((ByteBuffer) dg1Var.k).getInt(((ByteBuffer) dg1Var.k).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            x03 x03Var = new x03(this, i7);
            cg1 cg1VarB = x03Var.b();
            int iA3 = cg1VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) cg1VarB.k).getInt(iA3 + cg1VarB.h) : 0, (char[]) this.j, i7 << 1);
            cg1 cg1VarB2 = x03Var.b();
            int iA4 = cg1VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + cg1VarB2.h;
                i3 = ((ByteBuffer) cg1VarB2.k).getInt(((ByteBuffer) cg1VarB2.k).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                eg1 eg1Var = (eg1) this.k;
                cg1 cg1VarB3 = x03Var.b();
                int iA5 = cg1VarB3.a(16);
                if (iA5 != 0) {
                    int i9 = iA5 + cg1VarB3.h;
                    i4 = ((ByteBuffer) cg1VarB3.k).getInt(((ByteBuffer) cg1VarB3.k).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                eg1Var.a(x03Var, 0, i4 - 1);
            } else {
                wg.m("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public wk(int[] iArr, BitSet bitSet, int[] iArr2, int[] iArr3) {
        this.h = (byte) 3;
        this.l = iArr;
        this.j = iArr2;
        this.i = bitSet;
        this.k = iArr3;
    }

    public wk(Context context, ActionMode.Callback callback) {
        this.h = (byte) 11;
        this.j = context;
        this.i = callback;
        this.k = new ArrayList();
        this.l = new bj2();
    }

    public wk(kp0 kp0Var, rg1 rg1Var, la0 la0Var, nx nxVar) {
        this.h = (byte) 0;
        this.i = kp0Var;
        this.j = rg1Var;
        this.k = la0Var;
        this.l = nxVar;
    }

    public wk(jd jdVar) {
        this.h = (byte) 12;
        this.i = jdVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wk(xj0 xj0Var) {
        this(new xl1((Object) xj0Var, (byte) 21));
        this.h = (byte) 12;
    }
}
