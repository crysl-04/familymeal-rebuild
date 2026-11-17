package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vz0 extends b92 {
    public byte i;
    public final /* synthetic */ zp0 j;
    public final /* synthetic */ m10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(m10 m10Var, m10 m10Var2, zp0 zp0Var) {
        super(m10Var);
        this.j = zp0Var;
        this.k = m10Var2;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.i;
        if (b != 0) {
            if (b != 1) {
                li1.g("This coroutine had already completed");
                return null;
            }
            this.i = (byte) 2;
            m02.y(obj);
            return obj;
        }
        this.i = (byte) 1;
        m02.y(obj);
        zp0 zp0Var = this.j;
        zp0Var.getClass();
        t03.k(2, zp0Var);
        return zp0Var.f(this.k, this);
    }
}
