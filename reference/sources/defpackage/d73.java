package defpackage;

import com.familymeal.app.MealPlannerApp;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d73 extends mq2 implements zp0 {
    public boolean l;
    public final /* synthetic */ MealPlannerApp m;
    public final /* synthetic */ String n;
    public final /* synthetic */ LocalDate o;
    public final /* synthetic */ Double p;
    public final /* synthetic */ iu1 q;
    public final /* synthetic */ sj1 r;
    public final /* synthetic */ sj1 s;
    public final /* synthetic */ sj1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d73(MealPlannerApp mealPlannerApp, String str, LocalDate localDate, Double d, iu1 iu1Var, sj1 sj1Var, sj1 sj1Var2, sj1 sj1Var3, m10 m10Var) {
        super(2, m10Var);
        this.m = mealPlannerApp;
        this.n = str;
        this.o = localDate;
        this.p = d;
        this.q = iu1Var;
        this.r = sj1Var;
        this.s = sj1Var2;
        this.t = sj1Var3;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((d73) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new d73(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, m10Var);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.l;
        if (!z) {
            m02.y(obj);
            tw1 tw1VarC = this.m.c();
            LocalDate localDateMinusDays = this.o.minusDays(this.q.g());
            localDateMinusDays.getClass();
            double dDoubleValue = this.p.doubleValue();
            this.l = true;
            LocalDate localDateNow = LocalDate.now();
            localDateNow.getClass();
            obj = ia2.C(tw1VarC.a, new fw1(localDateMinusDays, dDoubleValue, localDateNow, tw1VarC, this.n, null), this);
            y20 y20Var = y20.h;
            if (obj == y20Var) {
                return y20Var;
            }
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        dw1 dw1Var = (dw1) obj;
        boolean zG = uz0.g(dw1Var, cw1.a);
        sj1 sj1Var = this.s;
        if (zG) {
            this.r.setValue("");
            sj1Var.setValue(null);
            this.t.setValue(null);
        } else {
            if (!(dw1Var instanceof bw1)) {
                wg.n();
                return null;
            }
            sj1Var.setValue(dv.E0(((bw1) dw1Var).a, "；", null, null, new h33((byte) 14), 30));
        }
        return j23.a;
    }
}
