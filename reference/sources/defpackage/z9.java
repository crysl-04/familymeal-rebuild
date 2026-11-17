package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z9 implements vp0 {
    public static final z9 i = new z9(0);
    public static final z9 j = new z9(1);
    public static final z9 k = new z9(2);
    public static final z9 l = new z9(3);
    public static final z9 m = new z9(4);
    public static final z9 n = new z9(5);
    public static final z9 o = new z9(6);
    public static final z9 p = new z9(7);
    public static final z9 q = new z9(8);
    public static final z9 r = new z9(9);
    public final /* synthetic */ byte h;

    public /* synthetic */ z9(byte b) {
        this.h = b;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return j23Var;
            case 1:
                float[] fArr = ((ke1) obj).a;
                return j23Var;
            case 2:
                float[] fArr2 = ((ke1) obj).a;
                return j23Var;
            case 3:
                ((Number) obj).intValue();
                return null;
            case 4:
                ((Number) obj).intValue();
                return null;
            case 5:
                if (uz0.g(obj, Boolean.FALSE)) {
                    return new kv(kv.g);
                }
                obj.getClass();
                return new kv(cu.b(((Integer) obj).intValue()));
            case 6:
                dh2 dh2Var = (dh2) obj;
                dh2Var.getClass();
                bh2.b(dh2Var);
                return j23Var;
            case 7:
                dh2 dh2Var2 = (dh2) obj;
                dh2Var2.getClass();
                bh2.b(dh2Var2);
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                te1 te1Var = (te1) obj;
                te1Var.getClass();
                return te1Var.i;
            default:
                dh2 dh2Var3 = (dh2) obj;
                dh2Var3.getClass();
                bh2.b(dh2Var3);
                return j23Var;
        }
    }
}
