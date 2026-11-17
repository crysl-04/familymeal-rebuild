package defpackage;

import java.util.ArrayList;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx implements aq0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ tx(byte b) {
        this.h = b;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        byte b = this.h;
        og1 og1Var = og1.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                e10 e10Var = (e10) obj;
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dr0Var.f(e10Var) ? 4 : 2;
                }
                if (dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ho.a(ie1.e(yj2.b(t03.H(og1Var, 0.0f, g10.g, 1).c(yj2.a), g10.f), e10Var.c, t03.A), dr0Var, 0);
                } else {
                    dr0Var.Q();
                }
                return j23Var;
            case 1:
                ny1 ny1VarE = ((ue1) obj2).e(((k00) obj3).a);
                return ((bf1) obj).Q(ny1VarE.h, ny1VarE.i, bg0.h, new s0((byte) 20), new m6(ny1VarE, (byte) 1));
            case 2:
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    gw2.b("导出备份并分享", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 6, 0, 262142);
                } else {
                    dr0Var2.Q();
                }
                return j23Var;
            case 3:
                dr0 dr0Var3 = (dr0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    gw2.b("取消", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 6, 0, 262142);
                } else {
                    dr0Var3.Q();
                }
                return j23Var;
            case 4:
                dr0 dr0Var4 = (dr0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    gw2.b("撤销", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 6, 0, 262142);
                } else {
                    dr0Var4.Q();
                }
                return j23Var;
            case 5:
                dr0 dr0Var5 = (dr0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    gw2.b("取消", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var5, 6, 0, 262142);
                } else {
                    dr0Var5.Q();
                }
                return j23Var;
            case 6:
                dr0 dr0Var6 = (dr0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    gw2.b("从备份文件恢复", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 6, 0, 262142);
                } else {
                    dr0Var6.Q();
                }
                return j23Var;
            case 7:
                dr0 dr0Var7 = (dr0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    gw2.b("撤销上次恢复", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var7, 6, 0, 262142);
                } else {
                    dr0Var7.Q();
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                dr0 dr0Var8 = (dr0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    gw2.b("继续导出", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var8, 6, 0, 262142);
                } else {
                    dr0Var8.Q();
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                dr0 dr0Var9 = (dr0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    gw2.b("取消", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var9, 6, 0, 262142);
                } else {
                    dr0Var9.Q();
                }
                return j23Var;
            case 10:
                dr0 dr0Var10 = (dr0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    gw2.b("覆盖并恢复", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var10, 6, 0, 262142);
                } else {
                    dr0Var10.Q();
                }
                return j23Var;
            case 11:
                ((Integer) obj3).getClass();
                return j23Var;
            case 12:
                dr0 dr0Var11 = (dr0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    gw2.b("保存", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var11, 6, 0, 262142);
                } else {
                    dr0Var11.Q();
                }
                return j23Var;
            case 13:
                dr0 dr0Var12 = (dr0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var12.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    gw2.b("删除", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var12, 6, 0, 262142);
                } else {
                    dr0Var12.Q();
                }
                return j23Var;
            case 14:
                dr0 dr0Var13 = (dr0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var13.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    gw2.b("取消", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var13, 6, 0, 262142);
                } else {
                    dr0Var13.Q();
                }
                return j23Var;
            case 15:
                dr0 dr0Var14 = (dr0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var14.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    gw2.b("知道了", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var14, 6, 0, 262142);
                } else {
                    dr0Var14.Q();
                }
                return j23Var;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                dr0 dr0Var15 = (dr0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (dr0Var15.N(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    gw2.b("没有匹配的食材", t03.G(og1Var, 16.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var15, 54, 0, 262140);
                } else {
                    dr0Var15.Q();
                }
                return j23Var;
            case 17:
                dr0 dr0Var16 = (dr0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var16.N(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    gw2.b("解锁", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var16, 6, 0, 262142);
                } else {
                    dr0Var16.Q();
                }
                return j23Var;
            case 18:
                dr0 dr0Var17 = (dr0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var17.N(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    iu0 iu0VarB = ls.i;
                    if (iu0VarB == null) {
                        hu0 hu0Var = new hu0("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = k33.a;
                        rl2 rl2Var = new rl2(kv.b);
                        xl1 xl1Var = new xl1((byte) 3);
                        xl1Var.A(9.0f, 11.0f);
                        xl1Var.y(7.0f, 11.0f);
                        xl1Var.I(2.0f);
                        xl1Var.x(2.0f);
                        xl1Var.I(-2.0f);
                        xl1Var.m();
                        xl1Var.A(13.0f, 11.0f);
                        xl1Var.x(-2.0f);
                        xl1Var.I(2.0f);
                        xl1Var.x(2.0f);
                        xl1Var.I(-2.0f);
                        xl1Var.m();
                        xl1Var.A(17.0f, 11.0f);
                        xl1Var.x(-2.0f);
                        xl1Var.I(2.0f);
                        xl1Var.x(2.0f);
                        xl1Var.I(-2.0f);
                        xl1Var.m();
                        xl1Var.A(19.0f, 4.0f);
                        xl1Var.x(-1.0f);
                        xl1Var.y(18.0f, 2.0f);
                        xl1Var.x(-2.0f);
                        xl1Var.I(2.0f);
                        xl1Var.y(8.0f, 4.0f);
                        xl1Var.y(8.0f, 2.0f);
                        xl1Var.y(6.0f, 2.0f);
                        xl1Var.I(2.0f);
                        xl1Var.y(5.0f, 4.0f);
                        xl1Var.s(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        xl1Var.y(3.0f, 20.0f);
                        xl1Var.s(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        xl1Var.x(14.0f);
                        xl1Var.s(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        xl1Var.y(21.0f, 6.0f);
                        xl1Var.s(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        xl1Var.m();
                        xl1Var.A(19.0f, 20.0f);
                        xl1Var.y(5.0f, 20.0f);
                        xl1Var.y(5.0f, 9.0f);
                        xl1Var.x(14.0f);
                        xl1Var.I(11.0f);
                        xl1Var.m();
                        hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
                        iu0VarB = hu0Var.b();
                        ls.i = iu0VarB;
                    }
                    eu0.a(iu0VarB, null, null, 0L, dr0Var17, 48, 12);
                    gw2.b("  用餐时间表", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var17, 6, 0, 262142);
                } else {
                    dr0Var17.Q();
                }
                return j23Var;
            case 19:
                dr0 dr0Var18 = (dr0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (dr0Var18.N(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    gw2.b("还没有家人，点右下角添加。", t03.G(og1Var, 16.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var18, 54, 0, 262140);
                } else {
                    dr0Var18.Q();
                }
                return j23Var;
            case 20:
                dr0 dr0Var19 = (dr0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var19.N(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    gw2.b("体重记录与智能调整", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var19, 6, 0, 262142);
                } else {
                    dr0Var19.Q();
                }
                return j23Var;
            case 21:
                dr0 dr0Var20 = (dr0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var20.N(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    gw2.b("保存", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var20, 6, 0, 262142);
                } else {
                    dr0Var20.Q();
                }
                return j23Var;
            case 22:
                dr0 dr0Var21 = (dr0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var21.N(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    gw2.b("删除", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var21, 6, 0, 262142);
                } else {
                    dr0Var21.Q();
                }
                return j23Var;
            case 23:
                dr0 dr0Var22 = (dr0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var22.N(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    gw2.b("取消", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var22, 6, 0, 262142);
                } else {
                    dr0Var22.Q();
                }
                return j23Var;
            case 24:
                dr0 dr0Var23 = (dr0) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (dr0Var23.N(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    gw2.b("没有匹配的食材，可先到「食材」页添加。", t03.G(og1Var, 8.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var23, 54, 0, 262140);
                } else {
                    dr0Var23.Q();
                }
                return j23Var;
            case 25:
                dr0 dr0Var24 = (dr0) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var24.N(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    eu0.a(h7.f0(), null, null, 0L, dr0Var24, 48, 12);
                    gw2.b("添加食材", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var24, 6, 0, 262142);
                } else {
                    dr0Var24.Q();
                }
                return j23Var;
            case 26:
                dr0 dr0Var25 = (dr0) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var25.N(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    gw2.b("保存", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var25, 6, 0, 262142);
                } else {
                    dr0Var25.Q();
                }
                return j23Var;
            case 27:
                dr0 dr0Var26 = (dr0) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var26.N(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    gw2.b("删除", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var26, 6, 0, 262142);
                } else {
                    dr0Var26.Q();
                }
                return j23Var;
            case 28:
                dr0 dr0Var27 = (dr0) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var27.N(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    gw2.b("取消", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var27, 6, 0, 262142);
                } else {
                    dr0Var27.Q();
                }
                return j23Var;
            default:
                dr0 dr0Var28 = (dr0) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (dr0Var28.N(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    gw2.b("取消", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var28, 6, 0, 262142);
                } else {
                    dr0Var28.Q();
                }
                return j23Var;
        }
    }
}
