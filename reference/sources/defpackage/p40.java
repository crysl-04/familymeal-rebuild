package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p40 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ String i;

    public /* synthetic */ p40(String str, byte b) {
        this.h = b;
        this.i = str;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    Object objK = dr0Var.K();
                    if (objK == zy.a) {
                        objK = new rt((byte) 6);
                        dr0Var.f0(objK);
                    }
                    AtomicInteger atomicInteger = tg2.a;
                    gw2.b(this.i, new iu((vp0) objK), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 0, 0, 262140);
                }
                break;
            default:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                } else {
                    gw2.b(this.i, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                }
                break;
        }
        return j23Var;
    }
}
