package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fc extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ gc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc(gc gcVar, byte b) {
        super(1);
        this.i = b;
        this.j = gcVar;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.i;
        j23 j23Var = j23.a;
        int i = 0;
        gc gcVar = this.j;
        switch (b) {
            case 0:
                my1 my1Var = (my1) obj;
                ny1[] ny1VarArr = gcVar.c;
                ny1VarArr.getClass();
                int i2 = gcVar.e;
                int i3 = gcVar.g;
                int length = ny1VarArr.length;
                while (i < length) {
                    ny1 ny1Var = ny1VarArr[i];
                    if (ny1Var != null) {
                        long jA = gcVar.a.b.a((((long) ny1Var.h) << 32) | (((long) ny1Var.i) & 4294967295L), (((long) i2) << 32) | (((long) i3) & 4294967295L), u31.h);
                        my1.i(my1Var, ny1Var, (int) (jA >> 32), (int) (jA & 4294967295L));
                    }
                    i++;
                    ny1VarArr = ny1VarArr;
                }
                break;
            default:
                my1 my1Var2 = (my1) obj;
                ny1[] ny1VarArr2 = gcVar.b;
                ny1VarArr2.getClass();
                int i4 = gcVar.d;
                int i5 = gcVar.f;
                int length2 = ny1VarArr2.length;
                while (i < length2) {
                    ny1 ny1Var2 = ny1VarArr2[i];
                    if (ny1Var2 != null) {
                        dm dmVar = gcVar.a.b;
                        int i6 = ny1Var2.h;
                        long jA2 = dmVar.a((((long) ny1Var2.i) & 4294967295L) | (((long) i6) << 32), (((long) i4) << 32) | (((long) i5) & 4294967295L), u31.h);
                        my1.i(my1Var2, ny1Var2, (int) (jA2 >> 32), (int) (jA2 & 4294967295L));
                    }
                    i++;
                    j23Var = j23Var;
                }
                break;
        }
        return j23Var;
    }
}
