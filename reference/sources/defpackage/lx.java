package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lx implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ lx(int i, s61 s61Var, Object obj) {
        this.h = (byte) 4;
        this.j = s61Var;
        this.i = i;
        this.k = obj;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        int i = this.i;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ((nx) obj4).g(obj3, (dr0) obj, m02.A(i) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ys.b((i42[]) obj4, (zp0) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ys.a((i42) obj4, (zp0) obj3, (dr0) obj, m02.A(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((l51) obj4).d(i, obj3, (dr0) obj, m02.A(1));
                break;
            case 4:
                s61 s61Var = (s61) obj4;
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    s61Var.d(i, obj3, dr0Var, 0);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((q71) obj4).d(i, obj3, (dr0) obj, m02.A(1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((qz2) obj4).a(obj3, (dr0) obj, m02.A(i | 1));
                break;
        }
        return j23Var;
    }

    public /* synthetic */ lx(byte b, int i, Object obj, Object obj2) {
        this.h = b;
        this.j = obj;
        this.k = obj2;
        this.i = i;
    }

    public /* synthetic */ lx(s61 s61Var, int i, Object obj, int i2, byte b) {
        this.h = b;
        this.j = s61Var;
        this.i = i;
        this.k = obj;
    }
}
