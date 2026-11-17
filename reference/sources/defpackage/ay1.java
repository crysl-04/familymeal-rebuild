package defpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ay1 extends z43 {
    public final tw1 b;
    public final yr c;
    public final String d;
    public final int e;
    public final lu1 f;
    public final lu1 g;
    public final lu1 h;
    public final lu1 i;
    public final lu1 j;
    public final lu1 k;
    public final lu1 l;
    public final lu1 m;
    public final lu1 n;
    public final lu1 o;
    public final lu1 p;
    public final lu1 q;
    public final lu1 r;
    public final lu1 s;
    public final lu1 t;
    public final lu1 u;
    public double v;
    public LocalDate w;

    public ay1(tw1 tw1Var, yr yrVar, String str) {
        tw1Var.getClass();
        yrVar.getClass();
        this.b = tw1Var;
        this.c = yrVar;
        this.d = str;
        this.e = ((Number) tw1Var.c.a()).intValue();
        Boolean bool = Boolean.FALSE;
        this.f = rz1.x(bool);
        this.g = rz1.x("");
        this.h = rz1.x(ir0.j);
        this.i = rz1.x("");
        this.j = rz1.x("");
        this.k = rz1.x("");
        this.l = rz1.x(i3.LIGHT);
        this.m = rz1.x(as0.j);
        this.n = rz1.x("");
        this.o = rz1.x(lt1.j);
        this.p = rz1.x(gg0.h);
        this.q = rz1.x(ag0.h);
        this.r = rz1.x(bool);
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
            arrayList.add("");
        }
        this.s = rz1.x(arrayList);
        this.t = rz1.x(bg0.h);
        this.u = rz1.x(Boolean.FALSE);
        ie1.p(h7.h0(this), null, new y8(this, null, (byte) 4), 3);
    }

    public static final ap1 k(double d, Double d2) {
        if (d2 == null || d2.doubleValue() >= d) {
            return new ap1(d, d2 != null ? d2.doubleValue() : Double.POSITIVE_INFINITY);
        }
        return null;
    }

    public static ArrayList l(e40 e40Var) {
        Double dValueOf = Double.valueOf(e40Var.a.a);
        Double dValueOf2 = Double.valueOf(e40Var.a.b);
        Double dValueOf3 = Double.valueOf(e40Var.b.a);
        ap1 ap1Var = e40Var.c;
        Double dValueOf4 = Double.valueOf(ap1Var.a);
        Double dValueOf5 = Double.valueOf(ap1Var.b);
        ap1 ap1Var2 = e40Var.d;
        List listQ = lt.Q(dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, Double.valueOf(ap1Var2.a), Double.valueOf(ap1Var2.b), Double.valueOf(e40Var.e.a));
        ArrayList arrayList = new ArrayList(ev.o0(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            arrayList.add(Math.abs(dDoubleValue) <= Double.MAX_VALUE ? t03.M(dDoubleValue) : "");
        }
        return arrayList;
    }

    public final List e() {
        Integer numO = jo2.O((String) this.i.getValue());
        as0 as0Var = as0.k;
        as0 as0Var2 = as0.j;
        as0 as0Var3 = as0.i;
        if (numO != null) {
            return this.e - numO.intValue() < 18 ? lt.P(as0.l) : lt.Q(as0Var3, as0Var2, as0Var);
        }
        return lt.Q(as0Var3, as0Var2, as0Var);
    }

    public final dy1 f() {
        Integer numO = jo2.O((String) this.i.getValue());
        if (numO == null) {
            return null;
        }
        String str = this.d;
        if (str == null) {
            str = "draft";
        }
        return new dy1(str, co2.g0((String) this.g.getValue()).toString(), (ir0) this.h.getValue(), numO, t03.K((String) this.j.getValue()), t03.K((String) this.k.getValue()), (i3) this.l.getValue(), h(), h() == as0.i ? t03.K((String) this.n.getValue()) : null, (lt1) this.o.getValue(), g(), ((Boolean) this.r.getValue()).booleanValue() ? j() : null, this.v, this.w);
    }

    public final Set g() {
        return (Set) this.p.getValue();
    }

    public final as0 h() {
        return (as0) this.m.getValue();
    }

    public final List i() {
        return (List) this.s.getValue();
    }

    public final e40 j() {
        List listI = i();
        ArrayList arrayList = new ArrayList(ev.o0(listI, 10));
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(t03.K((String) it.next()));
        }
        if (arrayList.get(0) == null || arrayList.get(2) == null || arrayList.get(3) == null || arrayList.get(5) == null || arrayList.get(7) == null) {
            return null;
        }
        Object obj = arrayList.get(0);
        obj.getClass();
        ap1 ap1VarK = k(((Number) obj).doubleValue(), (Double) arrayList.get(1));
        if (ap1VarK == null) {
            return null;
        }
        Object obj2 = arrayList.get(2);
        obj2.getClass();
        ap1 ap1Var = new ap1(((Number) obj2).doubleValue());
        Object obj3 = arrayList.get(3);
        obj3.getClass();
        ap1 ap1VarK2 = k(((Number) obj3).doubleValue(), (Double) arrayList.get(4));
        if (ap1VarK2 == null) {
            return null;
        }
        Object obj4 = arrayList.get(5);
        obj4.getClass();
        ap1 ap1VarK3 = k(((Number) obj4).doubleValue(), (Double) arrayList.get(6));
        if (ap1VarK3 == null) {
            return null;
        }
        Object obj5 = arrayList.get(7);
        obj5.getClass();
        return new e40(ap1VarK, ap1Var, ap1VarK2, ap1VarK3, new ap1(((Number) obj5).doubleValue()));
    }
}
