package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ Object n;
    public /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, long j, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
        this.o = j;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                long j = ((up1) obj).a;
                r0 r0Var = new r0((je2) this.n, (m10) obj2);
                r0Var.o = j;
                return r0Var.r(j23Var);
            case 1:
                return ((r0) p((m10) obj2, (x20) obj)).r(j23Var);
            case 2:
                return ((r0) p((m10) obj2, (x20) obj)).r(j23Var);
            case 3:
                return ((r0) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((r0) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                r0 r0Var = new r0((je2) obj2, m10Var);
                r0Var.o = ((up1) obj).a;
                return r0Var;
            case 1:
                return new r0((je2) obj2, this.o, m10Var, (byte) 1);
            case 2:
                return new r0((je2) obj2, this.o, m10Var, (byte) 2);
            case 3:
                return new r0((je2) obj2, this.o, m10Var, (byte) 3);
            default:
                return new r0((tb) obj2, this.o, m10Var, (byte) 4);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        Object obj2 = this.n;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (z) {
                    if (z) {
                        m02.y(obj);
                        return obj;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                long j = this.o;
                this.m = true;
                Object objB = fe2.b(((je2) obj2).Y, j, this);
                return objB == y20Var ? y20Var : objB;
            case 1:
                boolean z2 = this.m;
                if (z2) {
                    if (z2) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                qe2 qe2Var = ((je2) obj2).Y;
                ie2 ie2Var = new ie2(this.o, null);
                this.m = true;
                return qe2Var.g(ek1.i, ie2Var, this) == y20Var ? y20Var : j23Var;
            case 2:
                boolean z3 = this.m;
                if (z3) {
                    if (z3) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                qe2 qe2Var2 = ((je2) obj2).Y;
                long j2 = this.o;
                this.m = true;
                return qe2Var2.c(j2, true, this) == y20Var ? y20Var : j23Var;
            case 3:
                boolean z4 = this.m;
                if (z4) {
                    if (z4) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                qe2 qe2Var3 = ((je2) obj2).Y;
                long j3 = this.o;
                this.m = true;
                return qe2Var3.c(j3, false, this) == y20Var ? y20Var : j23Var;
            default:
                boolean z5 = this.m;
                if (z5) {
                    if (z5) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                up1 up1Var = new up1(this.o);
                zm2 zm2Var = t03.D;
                this.m = true;
                return tb.a((tb) obj2, up1Var, zm2Var, this) == y20Var ? y20Var : j23Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(je2 je2Var, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 0;
        this.n = je2Var;
    }
}
