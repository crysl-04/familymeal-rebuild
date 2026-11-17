package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rb extends mq2 implements vp0 {
    public dd l;
    public t72 m;
    public boolean n;
    public final /* synthetic */ tb o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ os2 q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(tb tbVar, Object obj, os2 os2Var, long j, m10 m10Var) {
        super(1, m10Var);
        this.o = tbVar;
        this.p = obj;
        this.q = os2Var;
        this.r = j;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        os2 os2Var = this.q;
        long j = this.r;
        return new rb(this.o, this.p, os2Var, j, (m10) obj).r(j23.a);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        dd ddVar;
        t72 t72Var;
        os2 os2Var = this.q;
        boolean z = this.n;
        tb tbVar = this.o;
        try {
            if (!z) {
                m02.y(obj);
                tbVar.c.j = (id) tbVar.a.a.h(this.p);
                tbVar.e.setValue(os2Var.c);
                tbVar.d.setValue(Boolean.TRUE);
                dd ddVar2 = tbVar.c;
                dd ddVar3 = new dd(ddVar2.h, ddVar2.i.getValue(), ia2.i(ddVar2.j), ddVar2.k, Long.MIN_VALUE, ddVar2.m);
                t72 t72Var2 = new t72();
                long j = this.r;
                qb qbVar = new qb((Object) tbVar, (Object) ddVar3, (Object) t72Var2, (byte) 0);
                this.l = ddVar3;
                this.m = t72Var2;
                this.n = true;
                Object objD = cy1.d(ddVar3, os2Var, j, qbVar, this);
                y20 y20Var = y20.h;
                if (objD == y20Var) {
                    return y20Var;
                }
                ddVar = ddVar3;
                t72Var = t72Var2;
            } else {
                if (!z) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t72Var = this.m;
                ddVar = this.l;
                m02.y(obj);
            }
            yc ycVar = t72Var.h ? yc.h : yc.i;
            tbVar.c();
            return new ad(ddVar, ycVar);
        } catch (CancellationException e) {
            tbVar.c();
            throw e;
        }
    }
}
