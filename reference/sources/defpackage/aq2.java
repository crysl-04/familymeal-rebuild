package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class aq2 implements SQLiteConnection {
    public final SupportSQLiteDatabase h;

    public aq2(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        this.h = supportSQLiteDatabase;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.h.close();
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final boolean inTransaction() {
        return this.h.inTransaction();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.sqlite.SQLiteConnection
    public final SQLiteStatement prepare(String str) {
        bq2 bq2Var;
        int i;
        str.getClass();
        SupportSQLiteDatabase supportSQLiteDatabase = this.h;
        vz1 vz1Var = null;
        if (!supportSQLiteDatabase.isOpen()) {
            cy1.Q(21, "connection is closed");
            throw null;
        }
        String upperCase = co2.g0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iU = 0;
            loop0: while (iU < length) {
                char cCharAt = upperCase.charAt(iU);
                if (uz0.i(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iU2 = iU + 1;
                            if (upperCase.charAt(iU2) == '*') {
                                do {
                                    iU2 = co2.U(upperCase, '*', iU2 + 1, 4);
                                    if (iU2 < 0) {
                                        break loop0;
                                    }
                                    i = iU2 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iU = iU2 + 2;
                            }
                        }
                        i2 = iU;
                        break;
                    }
                    if (upperCase.charAt(iU + 1) != '-') {
                        i2 = iU;
                        break;
                    }
                    iU = co2.U(upperCase, '\n', iU + 2, 4);
                    if (iU < 0) {
                        break;
                    }
                }
                iU++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new cq2(supportSQLiteDatabase, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    bq2Var = null;
                } else if (!co2.Q(upperCase, "EXCLUSIVE", false)) {
                    bq2Var = !co2.Q(upperCase, "IMMEDIATE", false) ? bq2.l : bq2.k;
                } else {
                    bq2Var = bq2.j;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    bq2Var = null;
                } else {
                    bq2Var = bq2.h;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    bq2Var = null;
                } else {
                    bq2Var = bq2.h;
                }
                break;
            case 81327:
                bq2Var = (strSubstring.equals("ROL") && !co2.Q(upperCase, " TO ", false)) ? bq2.i : null;
                break;
            default:
                bq2Var = null;
                break;
        }
        if (bq2Var != null) {
            return new cq2(supportSQLiteDatabase, str, bq2Var);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (co2.Q(co2.c0(lowerCase, "journal_mode", ""), "=", false)) {
                vz1Var = vz1.t;
            }
        }
        if (vz1Var != null) {
            return new cq2(supportSQLiteDatabase, str, new dq2(supportSQLiteDatabase, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new cq2(supportSQLiteDatabase, str) : new dq2(supportSQLiteDatabase, str);
    }
}
