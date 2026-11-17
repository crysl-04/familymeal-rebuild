package defpackage;

import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pj extends mq2 implements zp0 {
    public sj1 l;
    public sj1 m;
    public boolean n;
    public final /* synthetic */ MealPlannerApp o;
    public final /* synthetic */ gk p;
    public final /* synthetic */ sj1 q;
    public final /* synthetic */ sj1 r;
    public final /* synthetic */ sj1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(MealPlannerApp mealPlannerApp, gk gkVar, sj1 sj1Var, sj1 sj1Var2, sj1 sj1Var3, m10 m10Var) {
        super(2, m10Var);
        this.o = mealPlannerApp;
        this.p = gkVar;
        this.q = sj1Var;
        this.r = sj1Var2;
        this.s = sj1Var3;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((pj) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new pj(this.o, this.p, this.q, this.r, this.s, m10Var);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        sj1 sj1Var;
        sj1 sj1Var2;
        String str;
        boolean z = this.n;
        sj1 sj1Var3 = this.r;
        try {
            if (!z) {
                m02.y(obj);
                sj1Var = this.s;
                try {
                    r70 r70Var = ya0.a;
                    j70 j70Var = j70.j;
                    h hVar = new h(this.o, this.p, null, (byte) 5);
                    this.l = sj1Var;
                    this.m = sj1Var;
                    this.n = true;
                    Object objG = ie1.G(j70Var, hVar, this);
                    y20 y20Var = y20.h;
                    if (objG == y20Var) {
                        return y20Var;
                    }
                    sj1Var2 = sj1Var;
                } catch (Exception e) {
                    e = e;
                    sj1Var2 = sj1Var;
                    str = "恢复失败，本机数据未改变（" + e.getClass().getSimpleName() + "）";
                    ia2.e(sj1Var3, false);
                    sj1Var = sj1Var2;
                }
            } else {
                if (!z) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sj1Var = this.m;
                sj1Var2 = this.l;
                try {
                    m02.y(obj);
                } catch (Exception e2) {
                    e = e2;
                    str = "恢复失败，本机数据未改变（" + e.getClass().getSimpleName() + "）";
                    ia2.e(sj1Var3, false);
                    sj1Var = sj1Var2;
                }
            }
            this.q.setValue(Boolean.TRUE);
            str = "恢复完成。";
            ia2.e(sj1Var3, false);
            sj1Var.setValue(str);
            return j23.a;
        } catch (Throwable th) {
            ia2.e(sj1Var3, false);
            throw th;
        }
    }
}
