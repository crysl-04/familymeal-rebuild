package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ev2 extends mq2 implements vp0 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ kv2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ev2(kv2 kv2Var, m10 m10Var, byte b) {
        super(1, m10Var);
        this.l = b;
        this.m = kv2Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        kv2 kv2Var = this.m;
        m10 m10Var = (m10) obj;
        switch (b) {
            case 0:
                new ev2(kv2Var, m10Var, (byte) 0).r(j23Var);
                break;
            case 1:
                new ev2(kv2Var, m10Var, (byte) 1).r(j23Var);
                break;
            case 2:
                new ev2(kv2Var, m10Var, (byte) 2).r(j23Var);
                break;
            default:
                new ev2(kv2Var, m10Var, (byte) 3).r(j23Var);
                break;
        }
        return j23Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        kv2 kv2Var = this.m;
        switch (b) {
            case 0:
                m02.y(obj);
                kv2Var.A = false;
                break;
            case 1:
                m02.y(obj);
                kv2Var.c();
                break;
            case 2:
                m02.y(obj);
                kv2Var.a(kv2Var.A);
                break;
            default:
                m02.y(obj);
                kv2Var.o();
                break;
        }
        return j23Var;
    }
}
