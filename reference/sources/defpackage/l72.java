package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l72 extends jz {
    public final kb a;
    public final eg b;
    public final Object c;
    public s01 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public nj1 h;
    public final uj1 i;
    public final ArrayList j;
    public final ArrayList k;
    public final mj1 l;
    public final ix0 m;
    public final mj1 n;
    public final mj1 o;
    public ArrayList p;
    public nj1 q;
    public rq r;
    public final nn2 s;
    public boolean t;
    public final nn2 u;
    public final eg v;
    public final u01 w;
    public final o20 x;
    public final jy1 y;
    public static final nn2 z = h7.N(mx1.k);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public l72(o20 o20Var) {
        kb kbVar = new kb(new f72(this, (byte) 0));
        this.a = kbVar;
        this.b = new eg(new f72(this, (byte) 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new nj1();
        this.i = new uj1(new oz[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new mj1();
        this.m = new ix0((byte) 24);
        this.n = new mj1();
        this.o = new mj1();
        this.s = h7.N(null);
        this.u = h7.N(i72.j);
        this.v = new eg((byte) 19);
        u01 u01Var = new u01((s01) o20Var.m(c5.Z));
        u01Var.r(new z61(this, (byte) 12));
        this.w = u01Var;
        this.x = o20Var.i(kbVar).i(u01Var);
        this.y = new jy1((byte) 8);
    }

    public static final void G(ArrayList arrayList, l72 l72Var, oz ozVar) {
        arrayList.clear();
        synchronized (l72Var.c) {
            Iterator it = l72Var.k.iterator();
            if (it.hasNext()) {
                ((ph1) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(rj1 rj1Var) {
        try {
            if (rj1Var.w() instanceof wk2) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            rj1Var.c();
        } catch (Throwable th) {
            rj1Var.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.i.j != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((ji) ((bj) this.b.j).c).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.j != 0 || z() || B();
        }
        return z2;
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? ag0.h : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        qq qqVarY;
        synchronized (this.c) {
            qqVarY = y();
            if (((i72) this.u.getValue()).compareTo(i72.i) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (qqVarY != null) {
            ((rq) qqVarY).g(j23.a);
        }
    }

    public final void F(oz ozVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((ph1) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List H(ArrayList arrayList, nj1 nj1Var) {
        rj1 rj1VarC;
        ArrayList arrayList2;
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            ((ph1) obj).getClass();
            Object arrayList3 = map.get(null);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                map.put(null, arrayList3);
            }
            ((ArrayList) arrayList3).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            oz ozVar = (oz) entry.getKey();
            List list = (List) entry.getValue();
            if (ozVar.C.F) {
                ez.a("Check failed");
            }
            z61 z61Var = new z61(ozVar, (byte) 11);
            uy1 uy1Var = new uy1((Object) ozVar, (Object) nj1Var, (byte) 7);
            uk2 uk2VarH = bl2.h();
            rj1 rj1Var = uk2VarH instanceof rj1 ? (rj1) uk2VarH : null;
            if (rj1Var == null || (rj1VarC = rj1Var.C(z61Var, uy1Var)) == null) {
                li1.g("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                uk2 uk2VarJ = rj1VarC.j();
                try {
                    synchronized (this.c) {
                        arrayList2 = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ph1 ph1Var = (ph1) list.get(i2);
                            mj1 mj1Var = this.l;
                            ph1Var.getClass();
                            Object objA = ai1.a(mj1Var);
                            arrayList2.add(new wt1(ph1Var, objA));
                        }
                        int size3 = arrayList2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            wt1 wt1Var = (wt1) arrayList2.get(i3);
                            if (wt1Var.i == null) {
                                ix0 ix0Var = this.m;
                                ((ph1) wt1Var.h).getClass();
                                if (((mj1) ix0Var.i).b(null)) {
                                    ArrayList arrayList4 = new ArrayList(arrayList2.size());
                                    int size4 = arrayList2.size();
                                    for (int i4 = 0; i4 < size4; i4++) {
                                        wt1 wt1Var2 = (wt1) arrayList2.get(i4);
                                        if (wt1Var2.i == null) {
                                            ix0 ix0Var2 = this.m;
                                            ((ph1) wt1Var2.h).getClass();
                                            mj1 mj1Var2 = (mj1) ix0Var2.i;
                                            if (mj1Var2.i()) {
                                                ((mj1) ix0Var2.j).a();
                                            }
                                        }
                                        arrayList4.add(wt1Var2);
                                    }
                                    arrayList2 = arrayList4;
                                    break;
                                }
                            }
                        }
                    }
                    int size5 = arrayList2.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((wt1) arrayList2.get(i5)).i != null) {
                            int size6 = arrayList2.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((wt1) arrayList2.get(i6)).i == null) {
                                    ArrayList arrayList5 = new ArrayList(arrayList2.size());
                                    int size7 = arrayList2.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        wt1 wt1Var3 = (wt1) arrayList2.get(i7);
                                        if (wt1Var3.i == null) {
                                        }
                                    }
                                    synchronized (this.c) {
                                        iv.q0(arrayList5, this.k);
                                    }
                                    ArrayList arrayList6 = new ArrayList(arrayList2.size());
                                    int size8 = arrayList2.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList2.get(i8);
                                        if (((wt1) obj2).i != null) {
                                            arrayList6.add(obj2);
                                        }
                                    }
                                    arrayList2 = arrayList6;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    ozVar.r(arrayList2);
                    uk2.q(uk2VarJ);
                    w(rj1VarC);
                } catch (Throwable th) {
                    uk2.q(uk2VarJ);
                    throw th;
                }
            } catch (Throwable th2) {
                w(rj1VarC);
                throw th2;
            }
        }
        return dv.R0(map.keySet());
    }

    public final oz I(oz ozVar, nj1 nj1Var) {
        rj1 rj1VarC;
        if (ozVar.C.F || ozVar.D == 3) {
            return null;
        }
        nj1 nj1Var2 = this.q;
        if (nj1Var2 == null || !nj1Var2.c(ozVar)) {
            z61 z61Var = new z61(ozVar, (byte) 11);
            uy1 uy1Var = new uy1((Object) ozVar, (Object) nj1Var, (byte) 7);
            uk2 uk2VarH = bl2.h();
            rj1 rj1Var = uk2VarH instanceof rj1 ? (rj1) uk2VarH : null;
            if (rj1Var == null || (rj1VarC = rj1Var.C(z61Var, uy1Var)) == null) {
                li1.g("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    uk2 uk2VarJ = rj1VarC.j();
                    if (nj1Var != null) {
                        try {
                            if (nj1Var.h()) {
                                g72 g72Var = new g72(nj1Var, ozVar, (byte) 0);
                                dr0 dr0Var = ozVar.C;
                                if (dr0Var.F) {
                                    ez.a("Preparing a composition while composing is not supported");
                                }
                                dr0Var.F = true;
                                try {
                                    g72Var.a();
                                    dr0Var.F = false;
                                } catch (Throwable th) {
                                    dr0Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            uk2.q(uk2VarJ);
                            throw th2;
                        }
                    }
                    boolean zW = ozVar.w();
                    uk2.q(uk2VarJ);
                    w(rj1VarC);
                    if (zW) {
                        return ozVar;
                    }
                } catch (Throwable th3) {
                    w(rj1VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, oz ozVar) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof ky)) {
            synchronized (this.c) {
                h72 h72Var = (h72) this.s.getValue();
                if (h72Var != null) {
                    throw h72Var.a;
                }
                nn2 nn2Var = this.s;
                h72 h72Var2 = new h72(th);
                nn2Var.getClass();
                nn2Var.i(null, h72Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            this.j.clear();
            this.i.g();
            this.h = new nj1();
            this.k.clear();
            this.l.a();
            this.n.a();
            nn2 nn2Var2 = this.s;
            h72 h72Var3 = new h72(th);
            nn2Var2.getClass();
            nn2Var2.i(null, h72Var3);
            if (ozVar != null) {
                L(ozVar);
            }
            if (y() != null) {
                ez.a("expected to go to inactive state due to composition error");
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            dd2 dd2Var = new dd2(this.h);
            this.h = new nj1();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((oz) listD.get(i)).x(dd2Var);
                    if (((i72) this.u.getValue()).compareTo(i72.i) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    nj1 nj1Var = this.h;
                    int i2 = nj1Var.d;
                    Iterator<E> it = dd2Var.iterator();
                    while (it.hasNext()) {
                        nj1Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(oz ozVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(ozVar)) {
            arrayList.add(ozVar);
        }
        if (this.f.remove(ozVar)) {
            this.g = null;
        }
    }

    @Override // defpackage.jz
    public final void a(oz ozVar, zp0 zp0Var) throws Throwable {
        i72 i72Var;
        boolean zContains;
        rj1 rj1VarC;
        boolean z2 = ozVar.C.F;
        synchronized (this.c) {
            i72 i72Var2 = (i72) this.u.getValue();
            i72Var = i72.i;
            zContains = i72Var2.compareTo(i72Var) > 0 ? true ^ D().contains(ozVar) : true;
        }
        try {
            z61 z61Var = new z61(ozVar, (byte) 11);
            uy1 uy1Var = new uy1((Object) ozVar, (Object) null, (byte) 7);
            uk2 uk2VarH = bl2.h();
            rj1 rj1Var = uk2VarH instanceof rj1 ? (rj1) uk2VarH : null;
            if (rj1Var == null || (rj1VarC = rj1Var.C(z61Var, uy1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                uk2 uk2VarJ = rj1VarC.j();
                try {
                    ozVar.j(zp0Var);
                    uk2.q(uk2VarJ);
                    w(rj1VarC);
                    synchronized (this.c) {
                        if (((i72) this.u.getValue()).compareTo(i72Var) > 0 && !D().contains(ozVar)) {
                            this.f.add(ozVar);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        bl2.h().m();
                    }
                    try {
                        F(ozVar);
                        try {
                            ozVar.d();
                            ozVar.f();
                            if (z2) {
                                return;
                            }
                            bl2.h().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, ozVar);
                    }
                } catch (Throwable th3) {
                    uk2.q(uk2VarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(rj1VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            J(th5, ozVar);
        }
    }

    @Override // defpackage.jz
    public final nj1 b(oz ozVar, zi2 zi2Var, zp0 zp0Var) {
        eg egVar = this.v;
        try {
            zi2 zi2Var2 = ozVar.w;
            ozVar.w = zi2Var;
            try {
                a(ozVar, zp0Var);
                nj1 nj1Var = (nj1) egVar.f();
                if (nj1Var == null) {
                    nj1Var = cd2.a;
                    nj1Var.getClass();
                }
                ozVar.w = zi2Var2;
                egVar.D(null);
                return nj1Var;
            } catch (Throwable th) {
                ozVar.w = zi2Var2;
                throw th;
            }
        } catch (Throwable th2) {
            egVar.D(null);
            throw th2;
        }
    }

    @Override // defpackage.jz
    public final o20 j() {
        return this.x;
    }

    @Override // defpackage.jz
    public final void l(oz ozVar) {
        qq qqVarY;
        synchronized (this.c) {
            if (this.i.h(ozVar)) {
                qqVarY = null;
            } else {
                this.i.b(ozVar);
                qqVarY = y();
            }
        }
        if (qqVarY != null) {
            ((rq) qqVarY).g(j23.a);
        }
    }

    @Override // defpackage.jz
    public final oh1 m(ph1 ph1Var) {
        oh1 oh1Var;
        synchronized (this.c) {
            oh1Var = (oh1) this.n.l(ph1Var);
        }
        return oh1Var;
    }

    @Override // defpackage.jz
    public final nj1 n(oz ozVar, zi2 zi2Var, nj1 nj1Var) {
        eg egVar = this.v;
        try {
            K();
            ozVar.x(new dd2(nj1Var));
            zi2 zi2Var2 = ozVar.w;
            ozVar.w = zi2Var;
            try {
                oz ozVarI = I(ozVar, null);
                if (ozVarI != null) {
                    F(ozVar);
                    ozVarI.d();
                    ozVarI.f();
                }
                nj1 nj1Var2 = (nj1) egVar.f();
                if (nj1Var2 == null) {
                    nj1Var2 = cd2.a;
                    nj1Var2.getClass();
                }
                ozVar.w = zi2Var2;
                egVar.D(null);
                return nj1Var2;
            } catch (Throwable th) {
                ozVar.w = zi2Var2;
                throw th;
            }
        } catch (Throwable th2) {
            egVar.D(null);
            throw th2;
        }
    }

    @Override // defpackage.jz
    public final void q(e72 e72Var) {
        eg egVar = this.v;
        nj1 nj1Var = (nj1) egVar.f();
        if (nj1Var == null) {
            nj1 nj1Var2 = cd2.a;
            nj1Var = new nj1();
            egVar.D(nj1Var);
        }
        nj1Var.a(e72Var);
    }

    @Override // defpackage.jz
    public final void r(oz ozVar) {
        synchronized (this.c) {
            nj1 nj1Var = this.q;
            if (nj1Var == null) {
                nj1 nj1Var2 = cd2.a;
                nj1Var = new nj1();
                this.q = nj1Var;
            }
            nj1Var.a(ozVar);
        }
    }

    @Override // defpackage.jz
    public final sq s(o9 o9Var) {
        eg egVar = this.b;
        bj bjVar = (bj) egVar.j;
        hn1 hn1Var = new hn1();
        hn1Var.a = o9Var;
        return bjVar.a(hn1Var, (h6) egVar.k);
    }

    @Override // defpackage.jz
    public final void v(oz ozVar) {
        synchronized (this.c) {
            if (this.f.remove(ozVar)) {
                this.g = null;
            }
            this.i.j(ozVar);
            this.j.remove(ozVar);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((i72) this.u.getValue()).compareTo(i72.l) >= 0) {
                nn2 nn2Var = this.u;
                i72 i72Var = i72.i;
                nn2Var.getClass();
                nn2Var.i(null, i72Var);
            }
        }
        this.w.a(null);
    }

    public final qq y() {
        nn2 nn2Var = this.u;
        int iCompareTo = ((i72) nn2Var.getValue()).compareTo(i72.i);
        nn2 nn2Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        uj1 uj1Var = this.i;
        if (iCompareTo > 0) {
            Object value = nn2Var2.getValue();
            i72 i72Var = i72.m;
            i72 i72Var2 = i72.j;
            if (value == null) {
                if (this.d == null) {
                    this.h = new nj1();
                    uj1Var.g();
                    if (z() || B()) {
                        i72Var2 = i72.k;
                    }
                } else {
                    i72Var2 = (uj1Var.j != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? i72Var : i72.l;
                }
            }
            nn2Var.i(null, i72Var2);
            if (i72Var2 != i72Var) {
                return null;
            }
            rq rqVar = this.r;
            this.r = null;
            return rqVar;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = ag0.h;
        this.h = new nj1();
        uj1Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        rq rqVar2 = this.r;
        if (rqVar2 != null) {
            rqVar2.l(null);
        }
        this.r = null;
        nn2Var2.h(null);
        return null;
    }

    public final boolean z() {
        return !this.t && (((ji) ((bj) this.a.j).c).get() & 134217727) > 0;
    }
}
