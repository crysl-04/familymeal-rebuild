package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k71 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ m71 i;

    public /* synthetic */ k71(m71 m71Var, byte b) {
        this.h = b;
        this.i = m71Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        m71 m71Var = this.i;
        switch (b) {
            case 0:
                s61 s61Var = (s61) m71Var.v.a();
                int iA = s61Var.a();
                int i = 0;
                while (i < iA) {
                    if (s61Var.b(i).equals(obj)) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                s61 s61Var2 = (s61) m71Var.v.a();
                if (iIntValue < 0 || iIntValue >= s61Var2.a()) {
                    dx0.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + s61Var2.a() + ")");
                }
                ie1.p(m71Var.x0(), null, new u50(m71Var, iIntValue, null, (byte) 1), 3);
                return Boolean.TRUE;
        }
    }
}
