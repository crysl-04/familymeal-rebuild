package androidx.sqlite.db;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    default void beginTransactionReadOnly() {
        beginTransaction();
    }

    SupportSQLiteStatement compileStatement(String str);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    boolean inTransaction();

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    Cursor query(SupportSQLiteQuery supportSQLiteQuery);

    void setTransactionSuccessful();
}
