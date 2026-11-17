package net.zetetic.database.sqlcipher.driver;

import androidx.sqlite.SQLiteConnection;
import defpackage.bb2;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class SQLCipherDriver implements bb2 {
    private final DatabaseErrorHandler handler;
    private final SQLiteDatabaseHook hook;
    private final byte[] passphrase;

    public SQLCipherDriver(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        this.passphrase = bArr;
        this.hook = sQLiteDatabaseHook;
        this.handler = databaseErrorHandler;
    }

    public boolean hasConnectionPool() {
        return true;
    }

    @Override // defpackage.bb2
    public SQLiteConnection open(String str) {
        return new SQLCipherConnection(SQLiteDatabase.openOrCreateDatabase(str, this.passphrase, (SQLiteDatabase.CursorFactory) null, this.handler, this.hook));
    }
}
