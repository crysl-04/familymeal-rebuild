package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lt2 implements aq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Drawable i;

    public /* synthetic */ lt2(Drawable drawable, byte b) {
        this.h = b;
        this.i = drawable;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Drawable drawable = this.i;
        switch (b) {
            case 0:
                long j = ((kv) obj).a;
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dr0Var.Q();
                } else {
                    vz1.v.i(drawable, dr0Var, 48);
                }
                break;
            default:
                long j2 = ((kv) obj).a;
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dr0Var2.Q();
                } else {
                    vz1.v.i(drawable, dr0Var2, 48);
                }
                break;
        }
        return j23Var;
    }
}
