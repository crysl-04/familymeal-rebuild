package defpackage;

import com.familymeal.app.data.db.AppDatabase;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 extends mq2 implements vp0 {
    public sx1 l;
    public dy1 m;
    public byte n;
    public final /* synthetic */ tw1 o;
    public final /* synthetic */ dy1 p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(tw1 tw1Var, dy1 dy1Var, boolean z, m10 m10Var) {
        super(1, m10Var);
        this.o = tw1Var;
        this.p = dy1Var;
        this.q = z;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        dy1 dy1Var = this.p;
        boolean z = this.q;
        return new nw1(this.o, dy1Var, z, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object objA;
        byte b;
        y20 y20Var;
        sx1 sx1VarO;
        Object objP;
        y20 y20Var2;
        sx1 sx1Var;
        dy1 dy1Var;
        int iIntValue;
        by1 by1VarF0;
        tw1 tw1Var = this.o;
        AppDatabase appDatabase = tw1Var.a;
        byte b2 = this.n;
        dy1 dy1VarA = this.p;
        y20 y20Var3 = y20.h;
        if (b2 != 0) {
            if (b2 == 1) {
                m02.y(obj);
                objA = obj;
            } else if (b2 == 2) {
                dy1Var = this.m;
                sx1 sx1Var2 = this.l;
                m02.y(obj);
                sx1Var = sx1Var2;
                y20Var2 = y20Var3;
                objP = obj;
                iIntValue = ((Number) objP).intValue();
                sx1 sx1Var3 = sx1Var;
                dy1VarA = dy1Var;
                sx1VarO = sx1Var3;
                by1VarF0 = cu.f0(dy1VarA, iIntValue);
                this.l = null;
                this.m = null;
                this.n = (byte) 3;
                if (sx1VarO.c(by1VarF0, this) == y20Var2) {
                    return y20Var2;
                }
            } else {
                if (b2 != 3) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
            }
            return cw1.a;
        }
        m02.y(obj);
        sx1 sx1VarO2 = appDatabase.o();
        String str = dy1VarA.a;
        this.n = (byte) 1;
        objA = sx1VarO2.a(str, this);
        if (objA == y20Var3) {
            return y20Var3;
        }
        by1 by1Var = (by1) objA;
        boolean z = this.q;
        if (!z || by1Var == null) {
            b = 2;
            y20Var = y20Var3;
            if (z) {
                dy1VarA = dy1.a(dy1VarA, null, null, null, null, null, null, 0.0d, null, 4095);
            }
        } else {
            double d = by1Var.u;
            String str2 = by1Var.v;
            y20Var = y20Var3;
            b = 2;
            dy1VarA = dy1.a(dy1VarA, null, null, null, null, null, null, d, str2 != null ? LocalDate.parse(str2) : null, 4095);
        }
        b82 b82Var = bh0.a;
        na1 na1VarF = bh0.f(dy1VarA, ((Number) tw1Var.c.a()).intValue());
        if (!na1VarF.isEmpty()) {
            return new bw1(na1VarF);
        }
        sx1VarO = appDatabase.o();
        if (by1Var != null) {
            iIntValue = by1Var.l;
            y20Var2 = y20Var;
        } else {
            sx1 sx1VarO3 = appDatabase.o();
            this.l = sx1VarO;
            this.m = dy1VarA;
            this.n = b;
            objP = cu.P(this, new vw1((byte) 1), sx1VarO3.a, true, false);
            y20Var2 = y20Var;
            if (objP == y20Var2) {
                return y20Var2;
            }
            dy1 dy1Var2 = dy1VarA;
            sx1Var = sx1VarO;
            dy1Var = dy1Var2;
            iIntValue = ((Number) objP).intValue();
            sx1 sx1Var4 = sx1Var;
            dy1VarA = dy1Var;
            sx1VarO = sx1Var4;
        }
        by1VarF0 = cu.f0(dy1VarA, iIntValue);
        this.l = null;
        this.m = null;
        this.n = (byte) 3;
        if (sx1VarO.c(by1VarF0, this) == y20Var2) {
            return y20Var2;
        }
        return cw1.a;
    }
}
