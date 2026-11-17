package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ug0 extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ vp0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug0(vp0 vp0Var, byte b) {
        super(1);
        this.i = b;
        this.j = vp0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.i;
        vp0 vp0Var = this.j;
        switch (b) {
            case 0:
                break;
        }
        return new ny0(((long) ((Number) vp0Var.h(Integer.valueOf((int) (((vy0) obj).a & 4294967295L)))).intValue()) & 4294967295L);
    }
}
