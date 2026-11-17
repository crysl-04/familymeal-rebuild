package defpackage;

import java.util.LinkedHashMap;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n62 implements kp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ n62(byte b) {
        this.h = b;
    }

    @Override // defpackage.kp0
    public final Object a() {
        switch (this.h) {
            case 0:
                return new lh(bo2.a);
            case 1:
                return new lh(a72.a);
            case 2:
                return new lh(bo2.a);
            case 3:
                return rz1.x(Boolean.FALSE);
            case 4:
                return rz1.x(Boolean.FALSE);
            case 5:
                return rz1.x("");
            case 6:
                return rz1.x("");
            case 7:
                return rz1.x(null);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return new v92();
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return new pb2(new LinkedHashMap());
            case 10:
                return null;
            case 11:
                return new yd2(0);
            case 12:
                return null;
            case 13:
                return new li2();
            case 14:
                return new cc0(0.0f);
            case 15:
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return null;
            case 17:
                return g13.a;
            case 18:
                return f80.a;
            case 19:
                return new c13();
            case 20:
                return j23.a;
            case 21:
                return new iu1(0);
            case 22:
                return rz1.x("");
            case 23:
                return new iu1(0);
            default:
                return rz1.x(Boolean.FALSE);
        }
    }
}
