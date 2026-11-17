package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pe2 extends mq2 implements zp0 {
    public long l;
    public byte m;
    public /* synthetic */ long n;
    public final /* synthetic */ qe2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe2(qe2 qe2Var, m10 m10Var) {
        super(2, m10Var);
        this.o = qe2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        long j = ((a43) obj).a;
        pe2 pe2Var = new pe2(this.o, (m10) obj2);
        pe2Var.n = j;
        return pe2Var.r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        pe2 pe2Var = new pe2(this.o, m10Var);
        pe2Var.n = ((a43) obj).a;
        return pe2Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        byte b = this.m;
        qe2 qe2Var = this.o;
        y20 y20Var = y20.h;
        if (b == 0) {
            m02.y(obj);
            j = this.n;
            wk wkVar = qe2Var.f;
            this.n = j;
            this.m = (byte) 1;
            obj = wkVar.j(j, this);
            if (obj != y20Var) {
            }
            return y20Var;
        }
        if (b == 1) {
            j = this.n;
            m02.y(obj);
        } else {
            if (b == 2) {
                j2 = this.l;
                j = this.n;
                m02.y(obj);
                j3 = ((a43) obj).a;
                wk wkVar2 = qe2Var.f;
                long jD = a43.d(j2, j3);
                this.n = j;
                this.l = j3;
                this.m = (byte) 3;
                obj = wkVar2.i(jD, j3, this);
                if (obj != y20Var) {
                    j4 = j;
                    j5 = j3;
                }
                return y20Var;
            }
            if (b != 3) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.l;
            j4 = this.n;
            m02.y(obj);
        }
        return new a43(a43.d(j4, a43.d(j5, ((a43) obj).a)));
        long jD2 = a43.d(j, ((a43) obj).a);
        this.n = j;
        this.l = jD2;
        this.m = (byte) 2;
        obj = qe2Var.a(jD2, this);
        if (obj != y20Var) {
            j2 = jD2;
            j3 = ((a43) obj).a;
            wk wkVar3 = qe2Var.f;
            long jD3 = a43.d(j2, j3);
            this.n = j;
            this.l = j3;
            this.m = (byte) 3;
            obj = wkVar3.i(jD3, j3, this);
            if (obj != y20Var) {
                j4 = j;
                j5 = j3;
                return new a43(a43.d(j4, a43.d(j5, ((a43) obj).a)));
            }
        }
        return y20Var;
    }
}
