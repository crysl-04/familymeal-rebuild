package defpackage;

import java.time.LocalDate;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vu1 extends mq2 implements vp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu1(Object obj, Object obj2, Object obj3, m10 m10Var, byte b) {
        super(1, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                return new vu1((wu1) obj4, (cz2) obj3, (zp0) obj2, (m10) obj, (byte) 0).r(j23Var);
            case 1:
                return new vu1((m62) obj4, (y62) obj3, (ArrayList) obj2, (m10) obj, (byte) 1).r(j23Var);
            default:
                return new vu1((p63) obj4, (ek2) obj3, (String) obj2, (m10) obj, (byte) 2).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    this.m = true;
                    Object objD = ((wu1) obj4).d((cz2) obj3, (zp0) obj2, this);
                    return objD == y20Var ? y20Var : objD;
                }
                if (z) {
                    m02.y(obj);
                    return obj;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    this.m = true;
                    if (m62.b((m62) obj4, (y62) obj3, (ArrayList) obj2, this) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z2) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                return j23.a;
            default:
                boolean z3 = this.m;
                if (z3) {
                    if (z3) {
                        m02.y(obj);
                        return obj;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                p63 p63Var = (p63) obj4;
                kz1 kz1Var = p63Var.b;
                LocalDate localDateE = p63Var.e();
                localDateE.getClass();
                this.m = true;
                Object objB = kz1Var.b(localDateE, (ek2) obj3, (String) obj2, this);
                return objB == y20Var ? y20Var : objB;
        }
    }
}
