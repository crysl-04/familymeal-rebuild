package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wx implements aq0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ wx(byte b) {
        this.h = b;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dr0Var.Q();
                } else {
                    gw2.b("没有匹配的菜谱", t03.G(og1.h, 16.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 54, 0, 262140);
                }
                break;
            case 1:
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (!dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dr0Var2.Q();
                } else {
                    gw2.b("点亮名字表示这一餐在家吃。没有人吃的餐不会安排菜。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var2.j(e13.a)).k, dr0Var2, 6, 0, 131070);
                }
                break;
            case 2:
                dr0 dr0Var3 = (dr0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dr0Var3.Q();
                } else {
                    eu0.a(cy1.w(), null, null, 0L, dr0Var3, 48, 12);
                    gw2.b(" 重新生成", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 6, 0, 262142);
                }
                break;
            case 3:
                dr0 dr0Var4 = (dr0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dr0Var4.Q();
                } else {
                    gw2.b("取消", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 6, 0, 262142);
                }
                break;
            case 4:
                dr0 dr0Var5 = (dr0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dr0Var5.Q();
                } else {
                    gw2.b("生成食谱", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var5, 6, 0, 262142);
                }
                break;
            case 5:
                dr0 dr0Var6 = (dr0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    dr0Var6.Q();
                } else {
                    gw2.b("关闭", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var6, 6, 0, 262142);
                }
                break;
            case 6:
                dr0 dr0Var7 = (dr0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    dr0Var7.Q();
                } else {
                    gw2.b("更改日期", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var7, 6, 0, 262142);
                }
                break;
            case 7:
                dr0 dr0Var8 = (dr0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    dr0Var8.Q();
                } else {
                    gw2.b("保存", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var8, 6, 0, 262142);
                }
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                dr0 dr0Var9 = (dr0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    dr0Var9.Q();
                } else {
                    gw2.b("确定", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var9, 6, 0, 262142);
                }
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                dr0 dr0Var10 = (dr0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    dr0Var10.Q();
                } else {
                    gw2.b("取消", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var10, 6, 0, 262142);
                }
                break;
            default:
                dr0 dr0Var11 = (dr0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    dr0Var11.Q();
                } else {
                    gw2.b("采纳建议", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var11, 6, 0, 262142);
                }
                break;
        }
        return j23Var;
    }
}
