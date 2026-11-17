package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x90 implements aq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ sj1 i;

    public /* synthetic */ x90(sj1 sj1Var, byte b) {
        this.h = b;
        this.i = sj1Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        byte b = this.h;
        j23 j23Var = j23.a;
        sj1 sj1Var = this.i;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bw) obj).getClass();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dr0Var.Q();
                } else {
                    rg1 rg1VarG = t03.G(og1.h, 16.0f);
                    aw awVarA = yv.a(new ah(4.0f, new wg((byte) 0)), c5.u, dr0Var, 6);
                    int iHashCode = Long.hashCode(dr0Var.T);
                    dx1 dx1VarL = dr0Var.l();
                    rg1 rg1VarU = ls.U(dr0Var, rg1VarG);
                    sy.f.getClass();
                    dr0Var.Y();
                    if (dr0Var.S) {
                        dr0Var.k(l41.W);
                    } else {
                        dr0Var.i0();
                    }
                    h12.y(c5.F, dr0Var, awVarA);
                    h12.y(c5.E, dr0Var, dx1VarL);
                    h12.y(c5.G, dr0Var, Integer.valueOf(iHashCode));
                    h12.t(dr0Var);
                    h12.y(c5.D, dr0Var, rg1VarU);
                    gw2.b("加密数据库", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var.j(e13.a)).h, dr0Var, 6, 0, 131070);
                    dr0 dr0Var2 = dr0Var;
                    t90 t90Var = (t90) sj1Var.getValue();
                    if (t90Var == null) {
                        dr0Var2.V(-1513064370);
                        gw2.b("检查中…", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 6, 0, 262142);
                    } else {
                        dr0Var2.V(339673742);
                        gw2.b("打开成功：".concat(t90Var.a ? "是" : "否"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                        gw2.b("磁盘文件已加密：".concat(t90Var.b ? "是" : "否"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                        gw2.b("密钥保护：".concat(t90Var.c), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                        gw2.b(wi0.g("食材 ", t90Var.d, " 种，菜谱 ", t90Var.e, " 道"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262142);
                        dr0Var2 = dr0Var2;
                        String str = t90Var.f;
                        if (str == null) {
                            dr0Var2.V(339950912);
                        } else {
                            dr0Var2.V(339950913);
                            gw2.b("错误：".concat(str), null, ((pv) dr0Var2.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var2, 0, 0, 262138);
                        }
                        dr0Var2.p(false);
                    }
                    dr0Var2.p(false);
                    dr0Var2.p(true);
                }
                break;
            case 1:
                dr0 dr0Var3 = (dr0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((va2) obj).getClass();
                if (!dr0Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dr0Var3.Q();
                } else {
                    gw2.b(((Boolean) sj1Var.getValue()).booleanValue() ? "求解中…" : "运行求解器", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                }
                break;
            case 2:
                dr0 dr0Var4 = (dr0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (!dr0Var4.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dr0Var4.Q();
                } else {
                    tz0.g((List) sj1Var.getValue(), dr0Var4, 0);
                }
                break;
            default:
                dr0 dr0Var5 = (dr0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((g61) obj).getClass();
                if (!dr0Var5.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dr0Var5.Q();
                } else {
                    gw2.b(jp1.i(((List) sj1Var.getValue()).size(), "记录（", "）"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((c13) dr0Var5.j(e13.a)).i, dr0Var5, 0, 0, 131070);
                }
                break;
        }
        return j23Var;
    }
}
