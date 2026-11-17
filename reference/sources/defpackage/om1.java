package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class om1 {
    public final nn2 a = h7.N(pm1.l);
    public final nn2 b;
    public final i62 c;
    public final ih d;
    public final ih e;
    public lm1 f;
    public int g;
    public nm1 h;
    public final gj1 i;
    public final gj1 j;
    public final gj1 k;
    public boolean l;
    public boolean m;
    public boolean n;

    public om1() {
        nn2 nn2VarN = h7.N(new mm1());
        this.b = nn2VarN;
        this.c = new i62(nn2VarN);
        this.d = new ih();
        this.e = new ih();
        this.i = js1.a();
        this.j = js1.a();
        this.k = js1.a();
    }

    public final void a(wk wkVar, nm1 nm1Var, int i) {
        gj1 gj1Var;
        boolean z;
        wkVar.getClass();
        if (nm1Var.a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(nm1Var);
            wk wkVar2 = nm1Var.a;
            sb.append("' is already added to dispatcher ");
            sb.append(wkVar2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            gj1Var = i != 1 ? this.i : this.j;
        } else {
            gj1Var = this.k;
        }
        gj1Var.g(nm1Var);
        nm1Var.a = wkVar;
        ((mm1) this.c.h.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.n : this.l;
        } else {
            z = this.m;
        }
        nm1Var.b(z);
    }

    public final void b() {
        boolean z;
        boolean z2;
        ih ihVar = this.d;
        if (!ihVar.isEmpty()) {
            Iterator it = ihVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((lm1) it.next()).d) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        ih ihVar2 = this.e;
        if (!ihVar2.isEmpty()) {
            Iterator it2 = ihVar2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else if (((lm1) it2.next()).d) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        if (z4) {
            gj1 gj1Var = this.k;
            Object[] objArr = gj1Var.b;
            long[] jArr = gj1Var.c;
            int i = gj1Var.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((nm1) objArr[i]).b(z);
                i = i2;
            }
        }
        if (z5) {
            gj1 gj1Var2 = this.j;
            Object[] objArr2 = gj1Var2.b;
            long[] jArr2 = gj1Var2.c;
            int i3 = gj1Var2.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((nm1) objArr2[i3]).b(z2);
                i3 = i4;
            }
        }
        if (z6) {
            gj1 gj1Var3 = this.i;
            Object[] objArr3 = gj1Var3.b;
            long[] jArr3 = gj1Var3.c;
            int i5 = gj1Var3.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((nm1) objArr3[i5]).b(z3);
                i5 = i6;
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        lm1 lm1VarC = this.f;
        if (lm1VarC == null) {
            lm1VarC = c(0);
        }
        d(lm1VarC);
    }

    public final lm1 c(int i) {
        Object next;
        Object next2;
        ih ihVar = this.e;
        ih ihVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = ihVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((lm1) next).d);
            lm1 lm1Var = (lm1) next;
            if (lm1Var != null) {
                return lm1Var;
            }
            for (Object obj2 : ihVar) {
                if (((lm1) obj2).d) {
                    obj = obj2;
                    break;
                }
            }
            return (lm1) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = ihVar2.iterator();
            while (it2.hasNext()) {
                ((lm1) it2.next()).getClass();
            }
            Iterator it3 = ihVar.iterator();
            while (it3.hasNext()) {
                ((lm1) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = ihVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((lm1) next2).d);
        lm1 lm1Var2 = (lm1) next2;
        if (lm1Var2 != null) {
            return lm1Var2;
        }
        for (Object obj3 : ihVar) {
            if (((lm1) obj3).d) {
                obj = obj3;
                break;
            }
        }
        return (lm1) obj;
    }

    public final void d(lm1 lm1Var) {
        mm1 mm1Var;
        lm1 lm1VarC = this.f;
        if (lm1VarC == null) {
            lm1VarC = c(0);
        }
        if (uz0.g(lm1VarC, lm1Var)) {
            if (lm1VarC == null) {
                mm1Var = new mm1();
            } else {
                ArrayList arrayList = new ArrayList();
                for (lm1 lm1Var2 : this.d) {
                    if (lm1Var2.d && !lm1Var2.b.isEmpty()) {
                        arrayList.addAll(lm1Var2.b);
                    }
                }
                for (lm1 lm1Var3 : this.e) {
                    if (lm1Var3.d && !lm1Var3.b.isEmpty()) {
                        arrayList.addAll(lm1Var3.b);
                    }
                }
                ou ouVar = lm1VarC.a;
                List list = lm1VarC.c;
                ouVar.getClass();
                list.getClass();
                mm1Var = new mm1(ouVar, arrayList, list, arrayList.size());
            }
            nn2 nn2Var = this.b;
            if (uz0.g((mm1) nn2Var.getValue(), mm1Var)) {
                return;
            }
            nn2Var.i(null, mm1Var);
            gj1 gj1Var = this.k;
            Object[] objArr = gj1Var.b;
            long[] jArr = gj1Var.c;
            int i = gj1Var.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((nm1) objArr[i]).getClass();
                i = i2;
            }
            gj1 gj1Var2 = this.j;
            Object[] objArr2 = gj1Var2.b;
            long[] jArr2 = gj1Var2.c;
            int i3 = gj1Var2.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((nm1) objArr2[i3]).getClass();
                i3 = i4;
            }
            gj1 gj1Var3 = this.i;
            Object[] objArr3 = gj1Var3.b;
            long[] jArr3 = gj1Var3.c;
            int i5 = gj1Var3.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((nm1) objArr3[i5]).getClass();
                i5 = i6;
            }
        }
    }
}
