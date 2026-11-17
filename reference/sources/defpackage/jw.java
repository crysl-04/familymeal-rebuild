package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jw extends z01 {
    public final Object g0(n10 n10Var) throws Throwable {
        Object objN;
        do {
            objN = N();
            if (!(objN instanceof tu0)) {
                if (objN instanceof mw) {
                    throw ((mw) objN).a;
                }
                return ie1.D(objN);
            }
        } while (c0(objN) < 0);
        w01 w01Var = new w01(ls.F(n10Var), this);
        w01Var.u();
        w01Var.x(new nq(ys.M(this, true, new f92(w01Var)), (byte) 2));
        return w01Var.t();
    }
}
