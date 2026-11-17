package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends mq2 implements zp0 {
    public boolean l;
    public final /* synthetic */ je2 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(je2 je2Var, float f, float f2, m10 m10Var) {
        super(2, m10Var);
        this.m = je2Var;
        this.n = f;
        this.o = f2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((q0) p((m10) obj2, (x20) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new q0(this.m, this.n, this.o, m10Var);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        boolean z = this.l;
        if (!z) {
            m02.y(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.n)) << 32) | (((long) Float.floatToRawIntBits(this.o)) & 4294967295L);
            this.l = true;
            Object objB = fe2.b(this.m.Y, jFloatToRawIntBits, this);
            y20 y20Var = y20.h;
            if (objB == y20Var) {
                return y20Var;
            }
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        return j23.a;
    }
}
