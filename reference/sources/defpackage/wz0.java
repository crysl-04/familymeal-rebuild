package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wz0 extends n10 {
    public byte k;
    public final /* synthetic */ zp0 l;
    public final /* synthetic */ m10 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(m10 m10Var, o20 o20Var, zp0 zp0Var, m10 m10Var2) {
        super(m10Var, o20Var);
        this.l = zp0Var;
        this.m = m10Var2;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.k;
        if (b != 0) {
            if (b != 1) {
                li1.g("This coroutine had already completed");
                return null;
            }
            this.k = (byte) 2;
            m02.y(obj);
            return obj;
        }
        this.k = (byte) 1;
        m02.y(obj);
        zp0 zp0Var = this.l;
        zp0Var.getClass();
        t03.k(2, zp0Var);
        return zp0Var.f(this.m, this);
    }
}
