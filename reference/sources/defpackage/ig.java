package defpackage;

import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ig implements zp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ ig(byte b) {
        this.h = b;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                pg.a(m02.A(1), (dr0) obj);
                return j23Var;
            case 1:
                ((Integer) obj2).getClass();
                pg.a(m02.A(1), (dr0) obj);
                return j23Var;
            case 2:
                ((Integer) obj2).getClass();
                ia2.d(m02.A(1), (dr0) obj);
                return j23Var;
            case 3:
                String str = (String) obj;
                m20 m20Var = (m20) obj2;
                str.getClass();
                m20Var.getClass();
                if (str.length() == 0) {
                    return m20Var.toString();
                }
                return str + ", " + m20Var;
            case 4:
                StringBuilder sb = (StringBuilder) obj;
                pg1 pg1Var = (pg1) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(pg1Var);
                return sb;
            case 5:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                }
                return j23Var;
            case 6:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dr0Var2.Q();
                }
                return j23Var;
            case 7:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    gw2.b("恢复这份备份？", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 6, 0, 262142);
                } else {
                    dr0Var3.Q();
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    gw2.b("撤销上次恢复？", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 6, 0, 262142);
                } else {
                    dr0Var4.Q();
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    gw2.b("数据会回到上次恢复之前的状态。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var5, 6, 0, 262142);
                } else {
                    dr0Var5.Q();
                }
                return j23Var;
            case 10:
                dr0 dr0Var6 = (dr0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (dr0Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    gw2.b("文件未加密", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 6, 0, 262142);
                } else {
                    dr0Var6.Q();
                }
                return j23Var;
            case 11:
                dr0 dr0Var7 = (dr0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (dr0Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    eu0.a(tz0.u(), "返回", null, 0L, dr0Var7, 48, 12);
                } else {
                    dr0Var7.Q();
                }
                return j23Var;
            case 12:
                dr0 dr0Var8 = (dr0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (dr0Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    eu0.a(es.J(), "删除食材", null, 0L, dr0Var8, 48, 12);
                } else {
                    dr0Var8.Q();
                }
                return j23Var;
            case 13:
                dr0 dr0Var9 = (dr0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (dr0Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    gw2.b("删除后无法恢复。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var9, 6, 0, 262142);
                } else {
                    dr0Var9.Q();
                }
                return j23Var;
            case 14:
                dr0 dr0Var10 = (dr0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (dr0Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    gw2.b("不能删除", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var10, 6, 0, 262142);
                } else {
                    dr0Var10.Q();
                }
                return j23Var;
            case 15:
                dr0 dr0Var11 = (dr0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (dr0Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    eu0.a(h7.f0(), "添加食材", null, 0L, dr0Var11, 48, 12);
                } else {
                    dr0Var11.Q();
                }
                return j23Var;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                dr0 dr0Var12 = (dr0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (dr0Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    gw2.b("搜索名称或类别", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var12, 6, 0, 262142);
                } else {
                    dr0Var12.Q();
                }
                return j23Var;
            case 17:
                dr0 dr0Var13 = (dr0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (dr0Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    eu0.a(h12.k(), null, null, 0L, dr0Var13, 48, 12);
                } else {
                    dr0Var13.Q();
                }
                return j23Var;
            case 18:
                dr0 dr0Var14 = (dr0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (dr0Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    eu0.a(h7.f0(), "添加家人", null, 0L, dr0Var14, 48, 12);
                } else {
                    dr0Var14.Q();
                }
                return j23Var;
            case 19:
                dr0 dr0Var15 = (dr0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (dr0Var15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    eu0.a(tz0.u(), "返回", null, 0L, dr0Var15, 48, 12);
                } else {
                    dr0Var15.Q();
                }
                return j23Var;
            case 20:
                dr0 dr0Var16 = (dr0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (dr0Var16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    eu0.a(es.J(), "删除家人", null, 0L, dr0Var16, 48, 12);
                } else {
                    dr0Var16.Q();
                }
                return j23Var;
            case 21:
                dr0 dr0Var17 = (dr0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (dr0Var17.N(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    gw2.b("同时会从用餐时间表中移除，删除后无法恢复。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var17, 6, 0, 262142);
                } else {
                    dr0Var17.Q();
                }
                return j23Var;
            case 22:
                dr0 dr0Var18 = (dr0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (dr0Var18.N(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    eu0.a(tz0.u(), "返回", null, 0L, dr0Var18, 48, 12);
                } else {
                    dr0Var18.Q();
                }
                return j23Var;
            case 23:
                dr0 dr0Var19 = (dr0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (dr0Var19.N(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    gw2.b("搜索", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var19, 6, 0, 262142);
                } else {
                    dr0Var19.Q();
                }
                return j23Var;
            case 24:
                dr0 dr0Var20 = (dr0) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (dr0Var20.N(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    eu0.a(es.J(), "删除菜谱", null, 0L, dr0Var20, 48, 12);
                } else {
                    dr0Var20.Q();
                }
                return j23Var;
            case 25:
                dr0 dr0Var21 = (dr0) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (dr0Var21.N(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    gw2.b("删除后无法恢复。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var21, 6, 0, 262142);
                } else {
                    dr0Var21.Q();
                }
                return j23Var;
            case 26:
                dr0 dr0Var22 = (dr0) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (dr0Var22.N(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    gw2.b("选择食材", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var22, 6, 0, 262142);
                } else {
                    dr0Var22.Q();
                }
                return j23Var;
            case 27:
                dr0 dr0Var23 = (dr0) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (dr0Var23.N(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    eu0.a(h7.f0(), "添加菜谱", null, 0L, dr0Var23, 48, 12);
                } else {
                    dr0Var23.Q();
                }
                return j23Var;
            case 28:
                dr0 dr0Var24 = (dr0) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (dr0Var24.N(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    gw2.b("搜索菜名", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var24, 6, 0, 262142);
                } else {
                    dr0Var24.Q();
                }
                return j23Var;
            default:
                dr0 dr0Var25 = (dr0) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (dr0Var25.N(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    eu0.a(h12.k(), null, null, 0L, dr0Var25, 48, 12);
                } else {
                    dr0Var25.Q();
                }
                return j23Var;
        }
    }
}
