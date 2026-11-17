package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qc extends m31 implements kp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc(Object obj, byte b) {
        super(0);
        this.i = b;
        this.j = obj;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                ((sj1) obj).setValue(Boolean.FALSE);
                return j23.a;
            default:
                qz2 qz2Var = (qz2) obj;
                Object objG = qz2Var.a.g();
                kg0 kg0Var = kg0.j;
                return Boolean.valueOf(objG == kg0Var && qz2Var.d.getValue() == kg0Var);
        }
    }
}
