package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l71 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ m71 i;

    public /* synthetic */ l71(m71 m71Var, byte b) {
        this.h = b;
        this.i = m71Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        m71 m71Var = this.i;
        switch (b) {
            case 0:
                return Float.valueOf(m71Var.w.c());
            case 1:
                return Float.valueOf(m71Var.w.f());
            default:
                return Float.valueOf(m71Var.w.a() - m71Var.w.e());
        }
    }
}
