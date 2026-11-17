package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gs2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ k22 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs2(k22 k22Var, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.m = k22Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                ((gs2) p(m10Var, x20Var)).r(j23Var);
                break;
            case 1:
                ((gs2) p(m10Var, x20Var)).r(j23Var);
                break;
            case 2:
                ((gs2) p(m10Var, x20Var)).r(j23Var);
                break;
            case 3:
                ((gs2) p(m10Var, x20Var)).r(j23Var);
                break;
            case 4:
                ((gs2) p(m10Var, x20Var)).r(j23Var);
                break;
            case 5:
                ((gs2) p(m10Var, x20Var)).r(j23Var);
                break;
            case 6:
                ((gs2) p(m10Var, x20Var)).r(j23Var);
                break;
            default:
                ((gs2) p(m10Var, x20Var)).r(j23Var);
                break;
        }
        return j23Var;
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        k22 k22Var = this.m;
        switch (b) {
            case 0:
                return new gs2(k22Var, m10Var, (byte) 0);
            case 1:
                return new gs2(k22Var, m10Var, (byte) 1);
            case 2:
                return new gs2(k22Var, m10Var, (byte) 2);
            case 3:
                return new gs2(k22Var, m10Var, (byte) 3);
            case 4:
                return new gs2(k22Var, m10Var, (byte) 4);
            case 5:
                return new gs2(k22Var, m10Var, (byte) 5);
            case 6:
                return new gs2(k22Var, m10Var, (byte) 6);
            default:
                return new gs2(k22Var, m10Var, (byte) 7);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        k22 k22Var = this.m;
        switch (b) {
            case 0:
                m02.y(obj);
                k22Var.a();
                break;
            case 1:
                m02.y(obj);
                k22Var.c();
                break;
            case 2:
                m02.y(obj);
                k22Var.c();
                break;
            case 3:
                m02.y(obj);
                k22Var.a();
                break;
            case 4:
                m02.y(obj);
                k22Var.c();
                break;
            case 5:
                m02.y(obj);
                k22Var.c();
                break;
            case 6:
                m02.y(obj);
                k22Var.a();
                break;
            default:
                m02.y(obj);
                k22Var.c();
                break;
        }
        return j23Var;
    }
}
