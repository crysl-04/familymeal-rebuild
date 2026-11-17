package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wx1 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ ay1 i;

    public /* synthetic */ wx1(ay1 ay1Var, byte b) {
        this.h = b;
        this.i = ay1Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        String str;
        byte b = this.h;
        j23 j23Var = j23.a;
        ay1 ay1Var = this.i;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                str2.getClass();
                h7.M(ay1Var, 0, str2);
                return j23Var;
            case 1:
                ((i91) obj).getClass();
                if (((Boolean) ay1Var.f.getValue()).booleanValue() && (str = ay1Var.d) != null) {
                    ie1.p(h7.h0(ay1Var), null, new zx1(ay1Var, str, null, (byte) 1), 3);
                }
                return new yx1();
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                h7.M(ay1Var, 1, str3);
                return j23Var;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                ay1Var.n.setValue(str4);
                return j23Var;
            case 4:
                lt1 lt1Var = (lt1) obj;
                lt1Var.getClass();
                ay1Var.o.setValue(lt1Var);
                return j23Var;
            case 5:
                String str5 = (String) obj;
                str5.getClass();
                ay1Var.g.setValue(str5);
                return j23Var;
            case 6:
                String str6 = (String) obj;
                str6.getClass();
                h7.M(ay1Var, 2, str6);
                return j23Var;
            case 7:
                ir0 ir0Var = (ir0) obj;
                ir0Var.getClass();
                ay1Var.h.setValue(ir0Var);
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                String str7 = (String) obj;
                str7.getClass();
                ay1Var.j.setValue(str7);
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                String str8 = (String) obj;
                str8.getClass();
                ay1Var.k.setValue(str8);
                return j23Var;
            case 10:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                ay1Var.l.setValue(i3Var);
                return j23Var;
            case 11:
                as0 as0Var = (as0) obj;
                as0Var.getClass();
                ay1Var.m.setValue(as0Var);
                return j23Var;
            case 12:
                String str9 = (String) obj;
                str9.getClass();
                h7.M(ay1Var, 3, str9);
                return j23Var;
            case 13:
                String str10 = (String) obj;
                str10.getClass();
                h7.M(ay1Var, 4, str10);
                return j23Var;
            case 14:
                String str11 = (String) obj;
                str11.getClass();
                h7.M(ay1Var, 5, str11);
                return j23Var;
            case 15:
                String str12 = (String) obj;
                str12.getClass();
                h7.M(ay1Var, 6, str12);
                return j23Var;
            default:
                String str13 = (String) obj;
                str13.getClass();
                h7.M(ay1Var, 7, str13);
                return j23Var;
        }
    }
}
