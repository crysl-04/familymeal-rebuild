package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qx2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public final /* synthetic */ Object n;
    public /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qx2(rx2 rx2Var, float f, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = rx2Var;
        this.o = f;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((qx2) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                return ((qx2) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((qx2) p((m10) obj2, Float.valueOf(((Number) obj).floatValue()))).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new qx2((rx2) obj2, this.o, m10Var, (byte) 0);
            case 1:
                return new qx2((rx2) obj2, this.o, m10Var, (byte) 1);
            default:
                qx2 qx2Var = new qx2((ny) obj2, m10Var);
                qx2Var.o = ((Number) obj).floatValue();
                return qx2Var;
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                rx2 rx2Var = (rx2) obj2;
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    tb tbVar = rx2Var.A;
                    if (tbVar == null) {
                        return j23Var;
                    }
                    Float f = new Float(this.o);
                    cd cdVar = rx2Var.y ? xq2.f : rx2Var.x;
                    this.m = true;
                    obj = tb.a(tbVar, f, cdVar, this);
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
                return j23Var;
            case 1:
                rx2 rx2Var2 = (rx2) obj2;
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    tb tbVar2 = rx2Var2.z;
                    if (tbVar2 == null) {
                        return j23Var;
                    }
                    Float f2 = new Float(this.o);
                    cd cdVar2 = rx2Var2.y ? xq2.f : rx2Var2.x;
                    this.m = true;
                    obj = tb.a(tbVar2, f2, cdVar2, this);
                    if (obj == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z2) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                return j23Var;
            default:
                ny nyVar = (ny) obj2;
                boolean z3 = this.m;
                if (!z3) {
                    m02.y(obj);
                    float f3 = this.o;
                    Object objG = nyVar.a.d.h.g(qg2.e);
                    zp0 zp0Var = (zp0) (objG != null ? objG : null);
                    if (zp0Var == null) {
                        throw wi0.e("Required value was null.");
                    }
                    up1 up1Var = new up1(((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                    this.m = true;
                    obj = zp0Var.f(up1Var, this);
                    if (obj == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z3) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((up1) obj).a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx2(ny nyVar, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 2;
        this.n = nyVar;
    }
}
