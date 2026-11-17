package defpackage;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dq2 extends eq2 {
    public int[] k;
    public long[] l;
    public double[] m;
    public String[] n;
    public byte[][] o;
    public Cursor p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        super(supportSQLiteDatabase, str);
        supportSQLiteDatabase.getClass();
        str.getClass();
        this.k = new int[0];
        this.l = new long[0];
        this.m = new double[0];
        this.n = new String[0];
        this.o = new byte[0][];
    }

    public static void d(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            cy1.Q(25, "column index out of range");
            throw null;
        }
    }

    public final void b(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.k;
        if (iArr.length < i3) {
            this.k = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.l;
            if (jArr.length < i3) {
                this.l = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.m;
            if (dArr.length < i3) {
                this.m = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.n;
            if (strArr.length < i3) {
                this.n = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i == 4) {
            byte[][] bArr = this.o;
            if (bArr.length < i3) {
                this.o = (byte[][]) Arrays.copyOf(bArr, i3);
            }
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindBlob(int i, byte[] bArr) {
        bArr.getClass();
        a();
        b(4, i);
        this.k[i] = 4;
        this.o[i] = bArr;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindDouble(int i, double d) {
        a();
        b(2, i);
        this.k[i] = 2;
        this.m[i] = d;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindLong(int i, long j) {
        a();
        b(1, i);
        this.k[i] = 1;
        this.l[i] = j;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindNull(int i) {
        a();
        b(5, i);
        this.k[i] = 5;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindText(int i, String str) {
        str.getClass();
        a();
        b(3, i);
        this.k[i] = 3;
        this.n[i] = str;
    }

    public final void c() {
        if (this.p == null) {
            this.p = this.h.query(new xl1(this, (byte) 14));
        }
    }

    @Override // defpackage.eq2, androidx.sqlite.SQLiteStatement
    public final void clearBindings() {
        a();
        this.k = new int[0];
        this.l = new long[0];
        this.m = new double[0];
        this.n = new String[0];
        this.o = new byte[0][];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.j) {
            clearBindings();
            reset();
        }
        this.j = true;
    }

    public final Cursor e() {
        Cursor cursor = this.p;
        if (cursor != null) {
            return cursor;
        }
        cy1.Q(21, "no row");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final byte[] getBlob(int i) {
        a();
        Cursor cursorE = e();
        d(cursorE, i);
        byte[] blob = cursorE.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnCount() {
        a();
        c();
        Cursor cursor = this.p;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getColumnName(int i) {
        a();
        c();
        Cursor cursor = this.p;
        if (cursor == null) {
            li1.g("Required value was null.");
            return null;
        }
        d(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnType(int i) {
        a();
        c();
        Cursor cursor = this.p;
        if (cursor == null) {
            li1.g("Required value was null.");
            return 0;
        }
        d(cursor, i);
        int type = cursor.getType(i);
        int type2 = cursor.getType(i);
        if (type2 == 0) {
            return 5;
        }
        int i2 = 1;
        if (type2 != 1) {
            i2 = 2;
            if (type2 != 2) {
                i2 = 3;
                if (type2 != 3) {
                    if (type2 == 4) {
                        return 4;
                    }
                    throw new IllegalStateException(("Unknown field type: " + type).toString());
                }
            }
        }
        return i2;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final double getDouble(int i) {
        a();
        Cursor cursorE = e();
        d(cursorE, i);
        return cursorE.getDouble(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final long getLong(int i) {
        a();
        Cursor cursorE = e();
        d(cursorE, i);
        return cursorE.getLong(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getText(int i) {
        a();
        Cursor cursorE = e();
        d(cursorE, i);
        String string = cursorE.getString(i);
        string.getClass();
        return string;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean isNull(int i) {
        a();
        Cursor cursorE = e();
        d(cursorE, i);
        return cursorE.isNull(i);
    }

    @Override // defpackage.eq2, androidx.sqlite.SQLiteStatement
    public final void reset() {
        a();
        Cursor cursor = this.p;
        if (cursor != null) {
            cursor.close();
        }
        this.p = null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean step() {
        a();
        c();
        Cursor cursor = this.p;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        li1.g("Required value was null.");
        return false;
    }
}
