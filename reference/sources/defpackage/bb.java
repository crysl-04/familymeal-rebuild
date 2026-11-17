package defpackage;

import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ sj1 i;

    public /* synthetic */ bb(sj1 sj1Var, byte b) {
        this.h = b;
        this.i = sj1Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        sj1 sj1Var = this.i;
        switch (b) {
            case 0:
                t31 t31Var = (t31) sj1Var.getValue();
                if (t31Var != null) {
                    return t31Var;
                }
                dx0.d("Required value was null.");
                wg.k();
                return null;
            case 1:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 2:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 3:
                sj1Var.setValue(null);
                return j23Var;
            case 4:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 5:
                sj1Var.setValue(null);
                return j23Var;
            case 6:
                sj1Var.setValue(Boolean.TRUE);
                return j23Var;
            case 7:
                sj1Var.setValue(Boolean.TRUE);
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                t31 t31Var2 = (t31) sj1Var.getValue();
                if (t31Var2 != null) {
                    return t31Var2;
                }
                dx0.d("Required value was null.");
                wg.k();
                return null;
            case 10:
                Boolean bool = (Boolean) sj1Var.getValue();
                bool.booleanValue();
                return bool;
            case 11:
                sj1Var.setValue(Boolean.valueOf(!((Boolean) sj1Var.getValue()).booleanValue()));
                return j23Var;
            case 12:
                sj1Var.setValue(Boolean.TRUE);
                return j23Var;
            case 13:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 14:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 15:
                return new j51((vp0) sj1Var.getValue());
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return (s61) ((kp0) sj1Var.getValue()).a();
            case 17:
                return new p71((vp0) sj1Var.getValue());
            case 18:
                List list = (List) sj1Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (uz0.g(((pk1) obj).i.h, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 19:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 20:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 21:
                sj1Var.setValue(Boolean.TRUE);
                return j23Var;
            case 22:
                t31 t31Var3 = (t31) sj1Var.getValue();
                if (t31Var3 != null) {
                    return t31Var3;
                }
                dx0.d("Required value was null.");
                wg.k();
                return null;
            case 23:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 24:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 25:
                sj1Var.setValue(Boolean.FALSE);
                return j23Var;
            case 26:
                sj1Var.setValue(Boolean.TRUE);
                return j23Var;
            case 27:
                sj1Var.setValue(Boolean.TRUE);
                return j23Var;
            case 28:
                return (t31) sj1Var.getValue();
            default:
                sj1Var.setValue(null);
                return j23Var;
        }
    }
}
