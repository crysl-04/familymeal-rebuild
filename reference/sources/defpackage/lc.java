package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lc extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ nc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc(nc ncVar, byte b) {
        super(1);
        this.i = b;
        this.j = ncVar;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.i;
        j23 j23Var = j23.a;
        nc ncVar = this.j;
        switch (b) {
            case 0:
                ny1 ny1Var = ncVar.z;
                ny1Var.getClass();
                long j = ncVar.B;
                dm dmVar = ncVar.x.b;
                int i = ny1Var.h;
                my1.j((my1) obj, ny1Var, dmVar.a((((long) ny1Var.i) & 4294967295L) | (((long) i) << 32), j, u31.h));
                break;
            default:
                ny1 ny1Var2 = ncVar.y;
                ny1Var2.getClass();
                long j2 = ncVar.A;
                dm dmVar2 = ncVar.x.b;
                int i2 = ny1Var2.h;
                my1.j((my1) obj, ny1Var2, dmVar2.a((((long) ny1Var2.i) & 4294967295L) | (((long) i2) << 32), j2, u31.h));
                break;
        }
        return j23Var;
    }
}
