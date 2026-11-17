package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h33 implements vp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ h33(byte b) {
        this.h = b;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) throws Exception {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                fd fdVar = (fd) obj;
                return new ny0((((long) Math.round(fdVar.a)) << 32) | (((long) Math.round(fdVar.b)) & 4294967295L));
            case 1:
                long j = ((vy0) obj).a;
                return new fd((int) (j >> 32), (int) (j & 4294967295L));
            case 2:
                fd fdVar2 = (fd) obj;
                int iRound = Math.round(fdVar2.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(fdVar2.b);
                return new vy0((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            case 3:
                r72 r72Var = (r72) obj;
                return new hd(r72Var.a, r72Var.b, r72Var.c, r72Var.d);
            case 4:
                hd hdVar = (hd) obj;
                return new r72(hdVar.a, hdVar.b, hdVar.c, hdVar.d);
            case 5:
                return Float.valueOf(((ed) obj).a);
            case 6:
                dh2 dh2Var = (dh2) obj;
                dh2Var.getClass();
                bh2.b(dh2Var);
                return j23Var;
            case 7:
                dh2 dh2Var2 = (dh2) obj;
                dh2Var2.getClass();
                bh2.b(dh2Var2);
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return ((Integer) obj).intValue() == 0 ? "本周" : "下周";
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                nz1 nz1Var = (nz1) obj;
                nz1Var.getClass();
                return nz1Var.b;
            case 10:
                p60 p60Var = (p60) obj;
                p60Var.getClass();
                return p60Var.name();
            case 11:
                p60 p60Var2 = (p60) obj;
                p60Var2.getClass();
                return p60Var2.name();
            case 12:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM weight_entry ORDER BY person_id, date");
                try {
                    int iM = y02.m(sQLiteStatementPrepare, "person_id");
                    int iM2 = y02.m(sQLiteStatementPrepare, "date");
                    int iM3 = y02.m(sQLiteStatementPrepare, "weight_kg");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new s63(sQLiteStatementPrepare.getText(iM), sQLiteStatementPrepare.getText(iM2), sQLiteStatementPrepare.getDouble(iM3)));
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th) {
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            case 13:
                t63 t63Var = (t63) obj;
                t63Var.getClass();
                String string = t63Var.a.toString();
                string.getClass();
                return string;
            case 14:
                return ((m32) obj).b;
            case 15:
                return ((m32) obj).b;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return ((u83) obj).f;
            case 17:
                return ((u83) obj).c;
            default:
                b93 b93Var = (b93) obj;
                b93Var.getClass();
                return b93Var;
        }
    }
}
