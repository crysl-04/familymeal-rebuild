package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends mq2 implements zp0 {
    public final /* synthetic */ byte l = 1;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(sj1 sj1Var, ka0 ka0Var, ll2 ll2Var, m10 m10Var) {
        super(2, m10Var);
        this.m = sj1Var;
        this.n = ka0Var;
        this.o = ll2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                ((fa0) p(m10Var, x20Var)).r(j23Var);
                return j23Var;
            default:
                return ((fa0) p(m10Var, x20Var)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                return new fa0((sj1) this.m, (ka0) obj3, (ll2) obj2, m10Var);
            default:
                fa0 fa0Var = new fa0((d12) obj3, (zt2) obj2, m10Var);
                fa0Var.m = obj;
                return fa0Var;
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                m02.y(obj);
                ka0 ka0Var = (ka0) obj3;
                ll2 ll2Var = (ll2) obj2;
                for (pk1 pk1Var : (Set) ((sj1) this.m).getValue()) {
                    if (!((List) ka0Var.b().e.h.getValue()).contains(pk1Var) && !ll2Var.contains(pk1Var)) {
                        ka0Var.b().c(pk1Var);
                    }
                }
                return j23.a;
            default:
                m02.y(obj);
                x20 x20Var = (x20) this.m;
                d12 d12Var = (d12) obj3;
                zt2 zt2Var = (zt2) obj2;
                m10 m10Var = null;
                ie1.p(x20Var, null, new e20(d12Var, zt2Var, m10Var, (byte) 1), 1);
                return ie1.p(x20Var, null, new e20(d12Var, zt2Var, m10Var, (byte) 2), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(d12 d12Var, zt2 zt2Var, m10 m10Var) {
        super(2, m10Var);
        this.n = d12Var;
        this.o = zt2Var;
    }
}
