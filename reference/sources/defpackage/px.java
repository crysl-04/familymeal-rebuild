package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class px implements zp0 {
    public static final px i = new px(0);
    public static final px j = new px(1);
    public static final px k = new px(2);
    public static final px l = new px(3);
    public static final px m = new px(4);
    public static final px n = new px(5);
    public static final px o = new px(6);
    public static final px p = new px(7);
    public static final px q = new px(8);
    public static final px r = new px(9);
    public static final px s = new px(10);
    public static final px t = new px(11);
    public final /* synthetic */ byte h;

    public /* synthetic */ px(byte b) {
        this.h = b;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        String str;
        hq0 hq0Var;
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                }
                return j23Var;
            case 1:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                }
                return j23Var;
            case 2:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                }
                return j23Var;
            case 3:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dr0Var4.Q();
                }
                return j23Var;
            case 4:
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dr0Var5.Q();
                }
                return j23Var;
            case 5:
                dr0 dr0Var6 = (dr0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!dr0Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    dr0Var6.Q();
                }
                return j23Var;
            case 6:
                dr0 dr0Var7 = (dr0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!dr0Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dr0Var7.Q();
                }
                return j23Var;
            case 7:
                dr0 dr0Var8 = (dr0) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!dr0Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    dr0Var8.Q();
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                dr0 dr0Var9 = (dr0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!dr0Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    dr0Var9.Q();
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                dr0 dr0Var10 = (dr0) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (dr0Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ie1.c(null, 0.0f, 0L, dr0Var10, 0, 7);
                } else {
                    dr0Var10.Q();
                }
                return j23Var;
            case 10:
                long j2 = ((kv) obj2).a;
                return j2 == 16 ? Boolean.FALSE : Integer.valueOf(cu.c0(j2));
            default:
                m1 m1Var = (m1) obj;
                m1 m1Var2 = (m1) obj2;
                if (m1Var == null || (str = m1Var.a) == null) {
                    str = m1Var2.a;
                }
                if (m1Var == null || (hq0Var = m1Var.b) == null) {
                    hq0Var = m1Var2.b;
                }
                return new m1(str, hq0Var);
        }
    }
}
