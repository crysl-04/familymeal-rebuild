package defpackage;

import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rt implements vp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ rt(int i) {
        this.h = (byte) 27;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        switch (this.h) {
            case 0:
                bh2.k((dh2) obj, 1);
                return j23.a;
            case 1:
                ((Long) obj).getClass();
                return j23.a;
            case 2:
                sy syVar = (sy) obj;
                l41 l41Var = syVar instanceof l41 ? (l41) syVar : null;
                if (l41Var != null && l41Var.U) {
                    ax0.b("Apply is called on deactivated node " + syVar);
                }
                return j23.a;
            case 3:
                return Boolean.valueOf(!(((pg1) obj) instanceof xy));
            case 4:
                return j23.a;
            case 5:
                m20 m20Var = (m20) obj;
                if (m20Var instanceof q20) {
                    return (q20) m20Var;
                }
                return null;
            case 6:
                return j23.a;
            case 7:
                bh2.d((dh2) obj);
                return j23.a;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                bh2.d((dh2) obj);
                return j23.a;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 10:
                return j23.a;
            case 11:
                bh2.i((dh2) obj, new md2(new sz((byte) 23), new sz((byte) 24)));
                return j23.a;
            case 12:
                return j23.a;
            case 13:
                return vg0.d(uz0.B(700, null, 6), 2);
            case 14:
                return vg0.e(uz0.B(700, null, 6), 2);
            case 15:
                bh2.n((dh2) obj);
                return j23.a;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                dh2 dh2Var = (dh2) obj;
                dh2Var.getClass();
                bh2.b(dh2Var);
                return j23.a;
            case 17:
                dh2 dh2Var2 = (dh2) obj;
                dh2Var2.getClass();
                bh2.b(dh2Var2);
                return j23.a;
            case 18:
                return Boolean.valueOf(uz0.h(obj));
            case 19:
                return j23.a;
            case 20:
                return Boolean.FALSE;
            case 21:
                bh2.k((dh2) obj, 0);
                return j23.a;
            case 22:
                return obj;
            case 23:
                return j23.a;
            case 24:
                return j23.a;
            case 25:
                return j23.a;
            case 26:
                return j23.a;
            case 27:
                return Boolean.valueOf(((lm0) obj).J0());
            case 28:
                synchronized (bl2.c) {
                    List list = bl2.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((vp0) list.get(i)).h(obj);
                    }
                }
                return j23.a;
            default:
                ((tt0) obj).getClass();
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ rt(byte b) {
        this.h = b;
    }

    public /* synthetic */ rt(x72 x72Var) {
        this.h = (byte) 29;
    }
}
