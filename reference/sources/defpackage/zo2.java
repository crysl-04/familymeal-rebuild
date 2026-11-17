package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zo2 {
    public final cp2 a;
    public z41 b;
    public final xo2 c;
    public final xo2 d;
    public final xo2 e;

    /* JADX WARN: Type inference failed for: r2v1, types: [xo2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xo2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [xo2] */
    public zo2(cp2 cp2Var) {
        this.a = cp2Var;
        final byte b = 0;
        this.c = new zp0(this) { // from class: xo2
            public final /* synthetic */ zo2 i;

            {
                this.i = this;
            }

            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                byte b2 = b;
                j23 j23Var = j23.a;
                zo2 zo2Var = this.i;
                switch (b2) {
                    case 0:
                        cp2 cp2Var2 = zo2Var.a;
                        l41 l41Var = (l41) obj;
                        z41 z41Var = l41Var.N;
                        if (z41Var == null) {
                            z41Var = new z41(l41Var, cp2Var2);
                            l41Var.N = z41Var;
                        }
                        zo2Var.b = z41Var;
                        zo2Var.a().h();
                        z41 z41VarA = zo2Var.a();
                        if (z41VarA.j != cp2Var2) {
                            z41VarA.j = cp2Var2;
                            z41VarA.i(false);
                            l41.W(z41VarA.h, false, 7);
                        }
                        break;
                    case 1:
                        zo2Var.a().i = (jz) obj2;
                        break;
                    default:
                        z41 z41VarA2 = zo2Var.a();
                        ((l41) obj).d0(new v41(z41VarA2, (zp0) obj2, z41VarA2.w));
                        break;
                }
                return j23Var;
            }
        };
        final byte b2 = 1;
        this.d = new zp0(this) { // from class: xo2
            public final /* synthetic */ zo2 i;

            {
                this.i = this;
            }

            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                byte b3 = b2;
                j23 j23Var = j23.a;
                zo2 zo2Var = this.i;
                switch (b3) {
                    case 0:
                        cp2 cp2Var2 = zo2Var.a;
                        l41 l41Var = (l41) obj;
                        z41 z41Var = l41Var.N;
                        if (z41Var == null) {
                            z41Var = new z41(l41Var, cp2Var2);
                            l41Var.N = z41Var;
                        }
                        zo2Var.b = z41Var;
                        zo2Var.a().h();
                        z41 z41VarA = zo2Var.a();
                        if (z41VarA.j != cp2Var2) {
                            z41VarA.j = cp2Var2;
                            z41VarA.i(false);
                            l41.W(z41VarA.h, false, 7);
                        }
                        break;
                    case 1:
                        zo2Var.a().i = (jz) obj2;
                        break;
                    default:
                        z41 z41VarA2 = zo2Var.a();
                        ((l41) obj).d0(new v41(z41VarA2, (zp0) obj2, z41VarA2.w));
                        break;
                }
                return j23Var;
            }
        };
        final byte b3 = 2;
        this.e = new zp0(this) { // from class: xo2
            public final /* synthetic */ zo2 i;

            {
                this.i = this;
            }

            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                byte b4 = b3;
                j23 j23Var = j23.a;
                zo2 zo2Var = this.i;
                switch (b4) {
                    case 0:
                        cp2 cp2Var2 = zo2Var.a;
                        l41 l41Var = (l41) obj;
                        z41 z41Var = l41Var.N;
                        if (z41Var == null) {
                            z41Var = new z41(l41Var, cp2Var2);
                            l41Var.N = z41Var;
                        }
                        zo2Var.b = z41Var;
                        zo2Var.a().h();
                        z41 z41VarA = zo2Var.a();
                        if (z41VarA.j != cp2Var2) {
                            z41VarA.j = cp2Var2;
                            z41VarA.i(false);
                            l41.W(z41VarA.h, false, 7);
                        }
                        break;
                    case 1:
                        zo2Var.a().i = (jz) obj2;
                        break;
                    default:
                        z41 z41VarA2 = zo2Var.a();
                        ((l41) obj).d0(new v41(z41VarA2, (zp0) obj2, z41VarA2.w));
                        break;
                }
                return j23Var;
            }
        };
    }

    public final z41 a() {
        z41 z41Var = this.b;
        if (z41Var != null) {
            return z41Var;
        }
        wg.m("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
