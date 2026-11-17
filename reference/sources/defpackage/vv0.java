package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv0 implements vp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ vv0(int i, u71 u71Var) {
        this.h = (byte) 21;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01bc  */
    @Override // defpackage.vp0
    public final Object h(Object obj) throws Exception {
        pt0 pt0Var;
        byte b = this.h;
        boolean z = true;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM ingredient ORDER BY category, name");
                try {
                    int iM = y02.m(sQLiteStatementPrepare, "id");
                    int iM2 = y02.m(sQLiteStatementPrepare, "name");
                    int iM3 = y02.m(sQLiteStatementPrepare, "category");
                    int iM4 = y02.m(sQLiteStatementPrepare, "kcal");
                    int iM5 = y02.m(sQLiteStatementPrepare, "protein");
                    int iM6 = y02.m(sQLiteStatementPrepare, "fat");
                    int iM7 = y02.m(sQLiteStatementPrepare, "carb");
                    int iM8 = y02.m(sQLiteStatementPrepare, "fiber");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new mw0(sQLiteStatementPrepare.getText(iM), sQLiteStatementPrepare.getText(iM2), sQLiteStatementPrepare.getText(iM3), sQLiteStatementPrepare.getDouble(iM4), sQLiteStatementPrepare.getDouble(iM5), sQLiteStatementPrepare.getDouble(iM6), sQLiteStatementPrepare.getDouble(iM7), sQLiteStatementPrepare.getDouble(iM8)));
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th) {
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            case 1:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection2.prepare("SELECT * FROM ingredient");
                try {
                    int iM9 = y02.m(sQLiteStatementPrepare2, "id");
                    int iM10 = y02.m(sQLiteStatementPrepare2, "name");
                    int iM11 = y02.m(sQLiteStatementPrepare2, "category");
                    int iM12 = y02.m(sQLiteStatementPrepare2, "kcal");
                    int iM13 = y02.m(sQLiteStatementPrepare2, "protein");
                    int iM14 = y02.m(sQLiteStatementPrepare2, "fat");
                    int iM15 = y02.m(sQLiteStatementPrepare2, "carb");
                    int iM16 = y02.m(sQLiteStatementPrepare2, "fiber");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList2.add(new mw0(sQLiteStatementPrepare2.getText(iM9), sQLiteStatementPrepare2.getText(iM10), sQLiteStatementPrepare2.getText(iM11), sQLiteStatementPrepare2.getDouble(iM12), sQLiteStatementPrepare2.getDouble(iM13), sQLiteStatementPrepare2.getDouble(iM14), sQLiteStatementPrepare2.getDouble(iM15), sQLiteStatementPrepare2.getDouble(iM16)));
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    sQLiteStatementPrepare2.close();
                    throw th2;
                }
            case 2:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                SQLiteStatement sQLiteStatementPrepare3 = sQLiteConnection3.prepare("SELECT DISTINCT category FROM ingredient ORDER BY category");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare3.step()) {
                        arrayList3.add(sQLiteStatementPrepare3.getText(0));
                    }
                    sQLiteStatementPrepare3.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    sQLiteStatementPrepare3.close();
                    throw th3;
                }
            case 3:
                String str = (String) obj;
                str.getClass();
                return str;
            case 4:
                uv0 uv0Var = (uv0) obj;
                uv0Var.getClass();
                return uv0Var.a;
            case 5:
                dh2 dh2Var = (dh2) obj;
                dh2Var.getClass();
                bh2.b(dh2Var);
                return j23Var;
            case 6:
                dh2 dh2Var2 = (dh2) obj;
                dh2Var2.getClass();
                bh2.b(dh2Var2);
                return j23Var;
            case 7:
                if (((Character) obj).charValue() != '-') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                if (((Character) obj).charValue() != '-') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (((Character) obj).charValue() != ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (((Character) obj).charValue() != ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' > cCharValue2 || cCharValue2 >= ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                eu euVar = (eu) obj;
                euVar.getClass();
                eu.a(euVar, "JsonPrimitive", new r11(new jw0((byte) 6)));
                eu.a(euVar, "JsonNull", new r11(new jw0((byte) 7)));
                eu.a(euVar, "JsonLiteral", new r11(new jw0((byte) 8)));
                eu.a(euVar, "JsonObject", new r11(new jw0((byte) 9)));
                eu.a(euVar, "JsonArray", new r11(new jw0((byte) 10)));
                return j23Var;
            case 14:
            case 19:
                return j23Var;
            case 15:
                List list = (List) obj;
                return new c61(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                ((Integer) obj).getClass();
                return ag0.h;
            case 17:
                ((Integer) obj).getClass();
                return -1;
            case 18:
                ((Integer) obj).getClass();
                return null;
            case 20:
                List list2 = (List) obj;
                return new b81(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 21:
                return j23Var;
            case 22:
                return j23Var;
            case 23:
                return j23Var;
            case 24:
                return j23Var;
            case 25:
                return j23Var;
            case 26:
                dh2 dh2Var3 = (dh2) obj;
                dh2Var3.getClass();
                bh2.b(dh2Var3);
                return j23Var;
            case 27:
                py1 py1Var = (py1) obj;
                if (py1Var.B()) {
                    ad1 ad1Var = py1Var.i;
                    if (!ad1Var.v) {
                        vp0 vp0VarE = py1Var.h.e();
                        if (py1Var.h.c() != null) {
                            ad1Var.J0();
                        } else if (vp0VarE == null) {
                            ad1Var.o = null;
                            ad1Var.p = null;
                            ad1Var.n = null;
                            ad1Var.J0();
                        } else {
                            ad1Var.o = null;
                            ad1Var.p = null;
                            ad1Var.t0(py1Var, 9223372034707292159L, 0L);
                            ad1Var.n = vp0VarE;
                        }
                    }
                }
                return j23Var;
            case 28:
                py1 py1Var2 = (py1) obj;
                if (py1Var2.B() && (pt0Var = py1Var2.j) != null) {
                    ad1 ad1Var2 = py1Var2.i;
                    mj1 mj1Var = ad1Var2.y;
                    nj1 nj1Var = mj1Var != null ? (nj1) mj1Var.g(pt0Var) : null;
                    if (nj1Var != null) {
                        fe feVar = ad1Var2.x;
                        if (feVar != null) {
                            feVar.A(pt0Var);
                        }
                        ad1Var2.H0(nj1Var);
                        nj1Var.b();
                    }
                }
                return j23Var;
            default:
                ((Long) obj).getClass();
                return j23Var;
        }
    }

    public /* synthetic */ vv0(byte b) {
        this.h = b;
    }
}
