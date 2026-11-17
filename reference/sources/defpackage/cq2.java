package defpackage;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cq2 extends eq2 {
    public final /* synthetic */ byte k = 1;
    public final Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq2(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        super(supportSQLiteDatabase, str);
        supportSQLiteDatabase.getClass();
        str.getClass();
        this.l = supportSQLiteDatabase.compileStatement(str);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindBlob(int i, byte[] bArr) {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                bArr.getClass();
                ((dq2) obj).bindBlob(i, bArr);
                return;
            case 1:
                bArr.getClass();
                a();
                ((SupportSQLiteStatement) obj).bindBlob(i, bArr);
                return;
            default:
                bArr.getClass();
                a();
                cy1.Q(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindDouble(int i, double d) {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((dq2) obj).bindDouble(i, d);
                return;
            case 1:
                a();
                ((SupportSQLiteStatement) obj).bindDouble(i, d);
                return;
            default:
                a();
                cy1.Q(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindLong(int i, long j) {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((dq2) obj).bindLong(i, j);
                return;
            case 1:
                a();
                ((SupportSQLiteStatement) obj).bindLong(i, j);
                return;
            default:
                a();
                cy1.Q(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindNull(int i) {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((dq2) obj).bindNull(i);
                return;
            case 1:
                a();
                ((SupportSQLiteStatement) obj).bindNull(i);
                return;
            default:
                a();
                cy1.Q(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindText(int i, String str) {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                str.getClass();
                ((dq2) obj).bindText(i, str);
                return;
            case 1:
                str.getClass();
                a();
                ((SupportSQLiteStatement) obj).bindString(i, str);
                return;
            default:
                str.getClass();
                a();
                cy1.Q(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.eq2, androidx.sqlite.SQLiteStatement
    public final void clearBindings() {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((dq2) obj).clearBindings();
                break;
            case 1:
                a();
                ((SupportSQLiteStatement) obj).clearBindings();
                break;
            default:
                super.clearBindings();
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((dq2) obj).close();
                break;
            case 1:
                ((SupportSQLiteStatement) obj).close();
                this.j = true;
                break;
            default:
                this.j = true;
                break;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final byte[] getBlob(int i) {
        switch (this.k) {
            case 0:
                return ((dq2) this.l).getBlob(i);
            case 1:
                a();
                cy1.Q(21, "no row");
                throw null;
            default:
                a();
                cy1.Q(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean getBoolean(int i) {
        switch (this.k) {
            case 0:
                return ((dq2) this.l).getBoolean(0);
            default:
                return super.getBoolean(i);
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnCount() {
        switch (this.k) {
            case 0:
                return ((dq2) this.l).getColumnCount();
            case 1:
                a();
                return 0;
            default:
                a();
                return 0;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getColumnName(int i) {
        switch (this.k) {
            case 0:
                return ((dq2) this.l).getColumnName(i);
            case 1:
                a();
                cy1.Q(21, "no row");
                throw null;
            default:
                a();
                cy1.Q(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnType(int i) {
        switch (this.k) {
            case 0:
                return ((dq2) this.l).getColumnType(i);
            case 1:
                a();
                cy1.Q(21, "no row");
                throw null;
            default:
                a();
                cy1.Q(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final double getDouble(int i) {
        switch (this.k) {
            case 0:
                return ((dq2) this.l).getDouble(i);
            case 1:
                a();
                cy1.Q(21, "no row");
                throw null;
            default:
                a();
                cy1.Q(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final long getLong(int i) {
        switch (this.k) {
            case 0:
                return ((dq2) this.l).getLong(i);
            case 1:
                a();
                cy1.Q(21, "no row");
                throw null;
            default:
                a();
                cy1.Q(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getText(int i) {
        switch (this.k) {
            case 0:
                return ((dq2) this.l).getText(i);
            case 1:
                a();
                cy1.Q(21, "no row");
                throw null;
            default:
                a();
                cy1.Q(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean isNull(int i) {
        switch (this.k) {
            case 0:
                return ((dq2) this.l).isNull(i);
            case 1:
                a();
                cy1.Q(21, "no row");
                throw null;
            default:
                a();
                cy1.Q(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.eq2, androidx.sqlite.SQLiteStatement
    public final void reset() {
        switch (this.k) {
            case 0:
                ((dq2) this.l).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean step() {
        byte b = this.k;
        SupportSQLiteDatabase supportSQLiteDatabase = this.h;
        Object obj = this.l;
        switch (b) {
            case 0:
                dq2 dq2Var = (dq2) obj;
                boolean zStep = dq2Var.step();
                if (dq2Var.getText(0).equalsIgnoreCase("wal")) {
                    supportSQLiteDatabase.enableWriteAheadLogging();
                } else {
                    supportSQLiteDatabase.disableWriteAheadLogging();
                }
                return zStep;
            case 1:
                a();
                ((SupportSQLiteStatement) obj).execute();
                return false;
            default:
                int iOrdinal = ((bq2) obj).ordinal();
                if (iOrdinal == 0) {
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                } else if (iOrdinal == 1) {
                    supportSQLiteDatabase.endTransaction();
                } else if (iOrdinal == 2) {
                    supportSQLiteDatabase.beginTransaction();
                } else if (iOrdinal == 3) {
                    supportSQLiteDatabase.beginTransactionNonExclusive();
                } else if (iOrdinal == 4) {
                    supportSQLiteDatabase.beginTransactionReadOnly();
                } else {
                    wg.n();
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq2(SupportSQLiteDatabase supportSQLiteDatabase, String str, bq2 bq2Var) {
        super(supportSQLiteDatabase, str);
        supportSQLiteDatabase.getClass();
        str.getClass();
        this.l = bq2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq2(SupportSQLiteDatabase supportSQLiteDatabase, String str, dq2 dq2Var) {
        super(supportSQLiteDatabase, str);
        supportSQLiteDatabase.getClass();
        str.getClass();
        this.l = dq2Var;
    }
}
