package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x71 {
    public final /* synthetic */ b81 a;

    public /* synthetic */ x71(b81 b81Var) {
        this.a = b81Var;
    }

    public static c71 a(x71 x71Var, int i) {
        b81 b81Var = x71Var.a;
        uk2 uk2VarN = y02.n();
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            u71 u71Var = (u71) b81Var.f.getValue();
            return b81Var.q.a(i, u71Var.j, b81Var.d, new vv0(i, u71Var));
        } finally {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
        }
    }
}
