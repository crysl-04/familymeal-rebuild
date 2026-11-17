package defpackage;

import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class eq2 implements SQLiteStatement {
    public final SupportSQLiteDatabase h;
    public final String i;
    public boolean j;

    public eq2(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        this.h = supportSQLiteDatabase;
        this.i = str;
    }

    public final void a() {
        if (this.j) {
            cy1.Q(21, "statement is closed");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void clearBindings() {
        a();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        a();
    }
}
