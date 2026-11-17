package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb0 implements kp0 {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ k42 i;
    public final /* synthetic */ String j;

    public /* synthetic */ mb0(boolean z, k42 k42Var, String str) {
        this.h = z;
        this.i = k42Var;
        this.j = str;
    }

    @Override // defpackage.kp0
    public final Object a() {
        boolean z = this.h;
        k42 k42Var = this.i;
        String str = this.j;
        if (z) {
            cc2 cc2Var = (cc2) k42Var.i;
            synchronized (cc2Var.c) {
            }
        }
        return j23.a;
    }
}
