package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vr0 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ vp0 i;

    public /* synthetic */ vr0(vp0 vp0Var, byte b) {
        this.h = b;
        this.i = vp0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        long j;
        switch (this.h) {
            case 0:
                zk2 zk2Var = (zk2) obj;
                synchronized (bl2.c) {
                    j = bl2.e;
                    bl2.e = 1 + j;
                }
                return new h62(j, zk2Var, this.i);
            default:
                return this.i.h(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
