package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j72 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j72(int i, m10 m10Var, byte b) {
        super(i, m10Var);
        this.l = b;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((j72) p((m10) obj2, (i72) obj)).r(j23Var);
            default:
                return ((j72) p((m10) obj2, (ti2) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                j72 j72Var = new j72(2, m10Var, (byte) 0);
                j72Var.m = obj;
                return j72Var;
            default:
                j72 j72Var2 = new j72(2, m10Var, (byte) 1);
                j72Var2.m = obj;
                return j72Var2;
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        switch (this.l) {
            case 0:
                m02.y(obj);
                return Boolean.valueOf(((i72) this.m) == i72.h);
            default:
                m02.y(obj);
                return Boolean.valueOf(((ti2) this.m) != ti2.h);
        }
    }
}
