package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ sj1 i;

    public /* synthetic */ cb(sj1 sj1Var, byte b) {
        this.h = b;
        this.i = sj1Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        sj1 sj1Var = this.i;
        switch (b) {
            case 0:
                sj1Var.setValue((t31) obj);
                return j23Var;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                sj1Var.setValue(bool);
                return j23Var;
            case 2:
                sj1Var.setValue((t31) obj);
                return j23Var;
            case 3:
                dh2 dh2Var = (dh2) obj;
                if (!co2.X((CharSequence) sj1Var.getValue())) {
                    String str = (String) sj1Var.getValue();
                    q21[] q21VarArr = bh2.a;
                    dh2Var.a(ah2.O, str);
                }
                return j23Var;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() <= 20) {
                    sj1Var.setValue(str2);
                }
                return j23Var;
            case 5:
                sj1Var.setValue((t31) obj);
                return j23Var;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                if (str3.length() <= 20) {
                    sj1Var.setValue(str3);
                }
                return j23Var;
            case 7:
                String str4 = (String) obj;
                str4.getClass();
                if (str4.length() <= 20) {
                    sj1Var.setValue(str4);
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                sj1Var.setValue((zr) obj);
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((vp0) sj1Var.getValue()).h(f)).floatValue());
            case 10:
                ((vp0) sj1Var.getValue()).h((up1) obj);
                return j23Var;
            case 11:
                sj1Var.setValue((t31) obj);
                return j23Var;
            default:
                String str5 = (String) obj;
                str5.getClass();
                sj1Var.setValue(str5);
                return j23Var;
        }
    }
}
