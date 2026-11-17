package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u30 {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;
    public final Cloneable d;
    public Object e;
    public Object f;

    public u30(int i) {
        this.a = (byte) 0;
        this.c = new EnumMap(dz0.class);
        this.e = new wk((byte) 2);
        this.d = new EnumMap(dz0.class);
        this.f = new wk((byte) 2);
        this.b = i;
        for (dz0 dz0Var : dz0.values()) {
            ((EnumMap) this.d).put(dz0Var, new t30());
            ((EnumMap) this.c).put(dz0Var, new t30());
        }
    }

    public static void a(StringBuilder sb, String str, EnumMap enumMap, wk wkVar) {
        sb.append(str);
        sb.append(": rounds=");
        sb.append(((LongAdder) wkVar.k).sum());
        sb.append(", improving=");
        sb.append(((LongAdder) wkVar.l).sum());
        sb.append(", bound improvement=");
        sb.append(((DoubleAdder) wkVar.i).sum());
        sb.append(", re-solve ms=");
        sb.append(((LongAdder) wkVar.j).sum() / 1000000);
        sb.append('\n');
        for (Map.Entry entry : enumMap.entrySet()) {
            t30 t30Var = (t30) entry.getValue();
            if (t30Var.c.sum() != 0) {
                sb.append("  ");
                sb.append(((dz0) entry.getKey()).h);
                sb.append(": ms=");
                sb.append(t30Var.j.sum() / 1000000);
                sb.append(", calls=");
                sb.append(t30Var.c.sum());
                sb.append(" (with cuts ");
                sb.append(t30Var.d.sum());
                sb.append("), attempted=");
                sb.append(t30Var.b.sum());
                sb.append(", accepted=");
                sb.append(t30Var.a.sum());
                sb.append(", rejected efficacy=");
                sb.append(t30Var.g.sum());
                sb.append(" density=");
                sb.append(t30Var.e.sum());
                sb.append(" dynamism=");
                sb.append(t30Var.f.sum());
                sb.append(" similar=");
                sb.append(t30Var.h.sum());
                sb.append(", skipped=");
                sb.append(t30Var.i.sum());
                sb.append('\n');
            }
        }
    }

    public final dl1 b(int i) {
        return d(i, (gl1) this.c, null, false);
    }

    public final dl1 c(String str, boolean z) {
        Object next;
        gl1 gl1Var;
        dl1 dl1Var;
        boolean zEquals;
        str.getClass();
        Iterator it = ((h00) ph2.G(new z((dm2) this.d, (byte) 3))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            dl1Var = (dl1) next;
            String str2 = (String) dl1Var.i.f;
            if (str2 == null) {
                zEquals = str == null;
            } else {
                zEquals = str2.equals(str);
            }
            if (zEquals) {
                break;
            }
        } while (dl1Var.i.r(str) == null);
        dl1 dl1Var2 = (dl1) next;
        if (dl1Var2 != null) {
            return dl1Var2;
        }
        if (!z || (gl1Var = ((gl1) this.c).j) == null) {
            return null;
        }
        u30 u30Var = gl1Var.m;
        u30Var.getClass();
        if (co2.X(str)) {
            return null;
        }
        return u30Var.c(str, true);
    }

    public final dl1 d(int i, dl1 dl1Var, dl1 dl1Var2, boolean z) {
        gl1 gl1Var = (gl1) this.c;
        dm2 dm2Var = (dm2) this.d;
        dl1 dl1VarD = (dl1) aa3.g(dm2Var, i);
        if (dl1Var2 != null) {
            if (uz0.g(dl1VarD, dl1Var2) && uz0.g(dl1VarD.j, dl1Var2.j)) {
                return dl1VarD;
            }
            dl1VarD = null;
        } else if (dl1VarD != null) {
            return dl1VarD;
        }
        if (z) {
            Iterator it = ((h00) ph2.G(new z(dm2Var, (byte) 3))).iterator();
            do {
                if (!it.hasNext()) {
                    dl1VarD = null;
                    break;
                }
                dl1 dl1Var3 = (dl1) it.next();
                dl1VarD = (!(dl1Var3 instanceof gl1) || dl1Var3.equals(dl1Var)) ? null : ((gl1) dl1Var3).m.d(i, gl1Var, dl1Var2, true);
            } while (dl1VarD == null);
        }
        if (dl1VarD != null) {
            return dl1VarD;
        }
        gl1 gl1Var2 = gl1Var.j;
        if (gl1Var2 == null || gl1Var2.equals(dl1Var)) {
            return null;
        }
        gl1 gl1Var3 = gl1Var.j;
        gl1Var3.getClass();
        return gl1Var3.m.d(i, gl1Var, dl1Var2, z);
    }

    public final p4 e(int i) {
        List list;
        int i2 = this.b;
        int i3 = i * i2;
        int iG = g() - i3;
        if (i2 > iG) {
            i2 = iG;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == ((List) this.f).size()) {
            list = (List) this.f;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new is0(1L));
            }
            this.f = arrayList;
            list = arrayList;
        }
        return new p4(i3, list);
    }

    public final int f(int i) {
        if (g() <= 0) {
            return 0;
        }
        if (i >= g()) {
            dx0.a("ItemIndex > total count");
        }
        return i / this.b;
    }

    public final int g() {
        return ((j51) this.c).i.a;
    }

    public final cl1 h(cl1 cl1Var, eg egVar, boolean z, dl1 dl1Var) {
        cl1 cl1VarC;
        gl1 gl1Var = (gl1) this.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = gl1Var.iterator();
        while (true) {
            il1 il1Var = (il1) it;
            cl1VarC = null;
            if (!il1Var.hasNext()) {
                break;
            }
            dl1 dl1Var2 = (dl1) il1Var.next();
            cl1VarC = uz0.g(dl1Var2, dl1Var) ? null : dl1Var2.b(egVar);
            if (cl1VarC != null) {
                arrayList.add(cl1VarC);
            }
        }
        cl1 cl1Var2 = (cl1) dv.H0(arrayList);
        gl1 gl1Var2 = gl1Var.j;
        if (gl1Var2 != null && z && !gl1Var2.equals(dl1Var)) {
            cl1VarC = gl1Var2.c(egVar, gl1Var);
        }
        return (cl1) dv.H0(gi.W(new cl1[]{cl1Var, cl1Var2, cl1VarC}));
    }

    public final int i(int i) {
        mz0 mz0VarC = ((j51) this.c).i.c(i);
        int i2 = i - mz0VarC.a;
        return (int) ((is0) ((i51) mz0VarC.c).a.f(y51.a, Integer.valueOf(i2))).a;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                a(sb, "root", (EnumMap) this.d, (wk) this.f);
                a(sb, "node", (EnumMap) this.c, (wk) this.e);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public u30(gl1 gl1Var) {
        this.a = (byte) 2;
        this.c = gl1Var;
        this.d = new dm2(0);
    }

    public u30(j51 j51Var) {
        this.a = (byte) 1;
        this.c = j51Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new yy(0, 0));
        this.d = arrayList;
        this.e = new ArrayList();
        this.f = ag0.h;
    }
}
