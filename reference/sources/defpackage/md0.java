package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class md0 extends mq2 implements aq0 {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md0(int i, m10 m10Var, byte b) {
        super(i, m10Var);
        this.l = b;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        byte b = this.l;
        j23 j23Var = j23.a;
        int i = 3;
        switch (b) {
            case 0:
                long j = ((up1) obj2).a;
                new md0(i, (m10) obj3, (byte) 0).r(j23Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new md0(i, (m10) obj3, (byte) 1).r(j23Var);
                break;
            default:
                long j2 = ((up1) obj2).a;
                new md0(i, (m10) obj3, (byte) 2).r(j23Var);
                break;
        }
        return j23Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                m02.y(obj);
                break;
            case 1:
                m02.y(obj);
                break;
            default:
                m02.y(obj);
                break;
        }
        return j23Var;
    }
}
