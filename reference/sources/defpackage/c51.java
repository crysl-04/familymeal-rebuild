package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c51 extends qg1 implements mu1 {
    public float v;
    public boolean w;

    @Override // defpackage.mu1
    public final Object n0(Object obj) {
        sa2 sa2Var = obj instanceof sa2 ? (sa2) obj : null;
        if (sa2Var == null) {
            sa2Var = new sa2();
        }
        sa2Var.a = this.v;
        sa2Var.b = this.w;
        return sa2Var;
    }
}
