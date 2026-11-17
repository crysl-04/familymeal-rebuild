package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o63 extends mq2 implements zp0 {
    public boolean l;
    public final /* synthetic */ p63 m;
    public final /* synthetic */ ez1 n;
    public final /* synthetic */ ek2 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(p63 p63Var, ez1 ez1Var, ek2 ek2Var, String str, boolean z, m10 m10Var) {
        super(2, m10Var);
        this.m = p63Var;
        this.n = ez1Var;
        this.o = ek2Var;
        this.p = str;
        this.q = z;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((o63) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new o63(this.m, this.n, this.o, this.p, this.q, m10Var);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        ez1 ez1Var = this.n;
        yy1 yy1Var = ez1Var.a;
        boolean z = this.l;
        j23 j23Var = j23.a;
        boolean z2 = this.q;
        p63 p63Var = this.m;
        ek2 ek2Var = this.o;
        if (!z) {
            m02.y(obj);
            kz1 kz1Var = p63Var.b;
            String str = yy1Var.a;
            this.l = true;
            Object objP = cu.P(this, new vk1(!z2, str, ek2Var.a.name(), ek2Var.b.name(), this.p), kz1Var.a.p().a, false, true);
            y20 y20Var = y20.h;
            if (objP != y20Var) {
                objP = j23Var;
            }
            if (objP != y20Var) {
                objP = j23Var;
            }
            if (objP == y20Var) {
                return y20Var;
            }
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        Set set = ez1Var.c;
        String str2 = this.p;
        LinkedHashSet linkedHashSetH = z2 ? ci2.H(set, new wt1(ek2Var, str2)) : ci2.I(set, new wt1(ek2Var, str2));
        c63 c63Var = ez1Var.b;
        Map map = ez1Var.d;
        ed2 ed2Var = ez1Var.e;
        Map map2 = ez1Var.f;
        Map map3 = ez1Var.g;
        List list = ez1Var.h;
        Map map4 = ez1Var.i;
        yy1Var.getClass();
        p63Var.f.setValue(new ez1(yy1Var, c63Var, linkedHashSetH, map, ed2Var, map2, map3, list, map4));
        return j23Var;
    }
}
