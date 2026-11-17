package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nx implements zp0, aq0, bq0, cq0, dq0, eq0, fq0, gq0, lp0, mp0, op0, pp0, qp0, rp0, sp0, tp0, up0, wp0, xp0 {
    public final int h;
    public final boolean i;
    public Object j;
    public e72 k;
    public ArrayList l;

    public nx(int i, boolean z, Object obj) {
        this.h = i;
        this.i = z;
        this.j = obj;
    }

    @Override // defpackage.aq0
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
        return g(obj, (dr0) obj2, ((Number) obj3).intValue());
    }

    public final Object d(int i, dr0 dr0Var) {
        dr0Var.W(this.h);
        l(dr0Var);
        int iV = i | (dr0Var.f(this) ? dt.v(2, 0) : dt.v(1, 0));
        Object obj = this.j;
        obj.getClass();
        t03.k(2, obj);
        Object objF = ((zp0) obj).f(dr0Var, Integer.valueOf(iV));
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new mx(2, this, nx.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, (byte) 0);
        }
        return objF;
    }

    public final Object e(fl flVar, gt2 gt2Var, kp0 kp0Var, dr0 dr0Var, int i) {
        dr0Var.W(this.h);
        l(dr0Var);
        int iV = dr0Var.f(this) ? dt.v(2, 3) : dt.v(1, 3);
        Object obj = this.j;
        obj.getClass();
        t03.k(5, obj);
        Object objI = ((cq0) obj).i(flVar, gt2Var, kp0Var, dr0Var, Integer.valueOf(iV | i));
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new t4(this, flVar, gt2Var, kp0Var, i);
        }
        return objI;
    }

    @Override // defpackage.zp0
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2) {
        return d(((Number) obj2).intValue(), (dr0) obj);
    }

    public final Object g(Object obj, dr0 dr0Var, int i) {
        dr0Var.W(this.h);
        l(dr0Var);
        int iV = dr0Var.f(this) ? dt.v(2, 1) : dt.v(1, 1);
        Object obj2 = this.j;
        obj2.getClass();
        t03.k(3, obj2);
        Object objC = ((aq0) obj2).c(obj, dr0Var, Integer.valueOf(iV | i));
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new lx((byte) 0, i, this, obj);
        }
        return objC;
    }

    @Override // defpackage.cq0
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e((fl) obj, (gt2) obj2, (kp0) obj3, (dr0) obj4, ((Number) obj5).intValue());
    }

    public final Object j(Object obj, Object obj2, dr0 dr0Var, int i) {
        dr0Var.W(this.h);
        l(dr0Var);
        int iV = dr0Var.f(this) ? dt.v(2, 2) : dt.v(1, 2);
        Object obj3 = this.j;
        obj3.getClass();
        t03.k(4, obj3);
        Object objO = ((bq0) obj3).o(obj, obj2, dr0Var, Integer.valueOf(iV | i));
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha(this, obj, obj2, i);
        }
        return objO;
    }

    public final Object k(String str, Boolean bool, e10 e10Var, Object obj, Object obj2, dr0 dr0Var, int i) {
        dr0Var.W(this.h);
        l(dr0Var);
        int iV = dr0Var.f(this) ? dt.v(2, 6) : dt.v(1, 6);
        Object obj3 = this.j;
        obj3.getClass();
        t03.k(8, obj3);
        Object objN = ((fq0) obj3).n(str, bool, e10Var, obj, obj2, dr0Var, Integer.valueOf(i | iV));
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new kx(this, str, bool, e10Var, obj, obj2, i);
        }
        return objN;
    }

    public final void l(dr0 dr0Var) {
        e72 e72VarW;
        if (!this.i || (e72VarW = dr0Var.w()) == null) {
            return;
        }
        e72VarW.b |= 1;
        e72 e72Var = this.k;
        if (e72Var == null || !e72Var.a() || e72Var == e72VarW || uz0.g(e72Var.c, e72VarW.c)) {
            this.k = e72VarW;
            return;
        }
        ArrayList arrayList = this.l;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.l = arrayList2;
            arrayList2.add(e72VarW);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e72 e72Var2 = (e72) arrayList.get(i);
            if (e72Var2 == null || !e72Var2.a() || e72Var2 == e72VarW || uz0.g(e72Var2.c, e72VarW.c)) {
                arrayList.set(i, e72VarW);
                return;
            }
        }
        arrayList.add(e72VarW);
    }

    @Override // defpackage.fq0
    public final /* bridge */ /* synthetic */ Object n(String str, Boolean bool, e10 e10Var, Object obj, Object obj2, dr0 dr0Var, Integer num) {
        return k(str, bool, e10Var, obj, obj2, dr0Var, num.intValue());
    }

    @Override // defpackage.bq0
    public final /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(obj, obj2, (dr0) obj3, ((Number) obj4).intValue());
    }
}
