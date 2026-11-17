package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jl2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ zp0 o;
    public final /* synthetic */ sj1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl2(zp0 zp0Var, sj1 sj1Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = zp0Var;
        this.p = sj1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((jl2) p(m10Var, x20Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                jl2 jl2Var = new jl2(this.o, this.p, m10Var, (byte) 0);
                jl2Var.n = obj;
                return jl2Var;
            default:
                jl2 jl2Var2 = new jl2(this.o, this.p, m10Var, (byte) 1);
                jl2Var2.n = obj;
                return jl2Var2;
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        sj1 sj1Var = this.p;
        zp0 zp0Var = this.o;
        y20 y20Var = y20.h;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    u32 u32Var = new u32(sj1Var, ((x20) this.n).f());
                    this.m = true;
                    return zp0Var.f(u32Var, this) == y20Var ? y20Var : j23Var;
                }
                if (z) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    u32 u32Var2 = new u32(sj1Var, ((x20) this.n).f());
                    this.m = true;
                    return zp0Var.f(u32Var2, this) == y20Var ? y20Var : j23Var;
                }
                if (z2) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
