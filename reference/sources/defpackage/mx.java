package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mx extends z3 implements zp0 {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mx(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.o = b;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.o;
        j23 j23Var = j23.a;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                nx nxVar = (nx) obj3;
                nxVar.d(((Number) obj2).intValue(), (dr0) obj);
                break;
            case 1:
                je2 je2Var = (je2) obj3;
                ie1.p(je2Var.Q.u(), null, new r0(je2Var, ((a43) obj).a, null, (byte) 2), 3);
                break;
            default:
                je2 je2Var2 = (je2) obj3;
                ie1.p(je2Var2.Q.u(), null, new r0(je2Var2, ((a43) obj).a, null, (byte) 3), 3);
                break;
        }
        return j23Var;
    }
}
