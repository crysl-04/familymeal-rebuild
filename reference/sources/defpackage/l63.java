package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l63 implements kp0 {
    public final /* synthetic */ p63 h;
    public final /* synthetic */ nz1 i;
    public final /* synthetic */ boolean j;

    public l63(p63 p63Var, nz1 nz1Var, boolean z) {
        this.h = p63Var;
        this.i = nz1Var;
        this.j = z;
    }

    @Override // defpackage.kp0
    public final Object a() {
        String str = this.i.b;
        boolean z = !this.j;
        str.getClass();
        p63 p63Var = this.h;
        ez1 ez1Var = (ez1) p63Var.f.getValue();
        if (ez1Var != null) {
            ie1.p(h7.h0(p63Var), null, new uu2(p63Var, ez1Var, str, z, null), 3);
        }
        return j23.a;
    }
}
