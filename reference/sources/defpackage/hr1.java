package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hr1 extends zr1 {
    public static final hr1 d;
    public static final hr1 e;
    public static final hr1 f;
    public static final hr1 g;
    public final /* synthetic */ byte c;

    static {
        int i = 1;
        d = new hr1(i, 2, (byte) 0);
        int i2 = 1;
        e = new hr1(i2, i2, (byte) 1);
        f = new hr1(i, 2, (byte) 2);
        int i3 = 1;
        g = new hr1(i3, i3, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr1(int i, int i2, byte b) {
        super(i, i2);
        this.c = b;
    }

    @Override // defpackage.zr1
    public final void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        switch (this.c) {
            case 0:
                Object objA = ((kp0) yq0Var.d(0)).a();
                xq0 xq0Var = (xq0) yq0Var.d(1);
                int iC = yq0Var.c(0);
                xq0Var.getClass();
                ik2Var.T(ik2Var.c(xq0Var), objA);
                rgVar.f(iC, objA);
                rgVar.d(objA);
                break;
            case 1:
                xq0 xq0Var2 = (xq0) yq0Var.d(0);
                int iC2 = yq0Var.c(0);
                rgVar.r();
                xq0Var2.getClass();
                rgVar.c(iC2, ik2Var.C(ik2Var.c(xq0Var2)));
                break;
            case 2:
                Object objD = yq0Var.d(0);
                xq0 xq0Var3 = (xq0) yq0Var.d(1);
                int iC3 = yq0Var.c(0);
                if (objD instanceof hr0) {
                    hr0 hr0Var = (hr0) objD;
                    g82Var.e.b(hr0Var);
                    g82Var.d.a(hr0Var);
                }
                Object objJ = ik2Var.J(ik2Var.c(xq0Var3), iC3, objD);
                if (objJ instanceof hr0) {
                    g82Var.e((hr0) objJ);
                } else if (objJ instanceof e72) {
                    ((e72) objJ).c();
                }
                break;
            default:
                Object objD2 = yq0Var.d(0);
                int iC4 = yq0Var.c(0);
                if (objD2 instanceof hr0) {
                    hr0 hr0Var2 = (hr0) objD2;
                    g82Var.e.b(hr0Var2);
                    g82Var.d.a(hr0Var2);
                }
                Object objJ2 = ik2Var.J(ik2Var.t, iC4, objD2);
                if (objJ2 instanceof hr0) {
                    g82Var.e((hr0) objJ2);
                } else if (objJ2 instanceof e72) {
                    ((e72) objJ2).c();
                }
                break;
        }
    }

    @Override // defpackage.zr1
    public final xq0 b(yq0 yq0Var) {
        switch (this.c) {
            case 0:
                return (xq0) yq0Var.d(1);
            case 1:
                return (xq0) yq0Var.d(0);
            default:
                return super.b(yq0Var);
        }
    }
}
