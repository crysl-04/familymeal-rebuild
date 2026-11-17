package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a50 implements vp0 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ int i;

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        int i = this.i;
        switch (b) {
            case 0:
                ((Integer) obj).getClass();
                return Integer.valueOf(i);
            default:
                b71 b71Var = (b71) obj;
                uk2 uk2VarN = y02.n();
                y02.u(uk2VarN, y02.q(uk2VarN), uk2VarN != null ? uk2VarN.e() : null);
                int i2 = b71Var.a;
                if (i2 == -1) {
                    i2 = 2;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    b71Var.a(i + i3);
                }
                return j23.a;
        }
    }

    public /* synthetic */ a50(b81 b81Var, int i) {
        this.i = i;
    }
}
