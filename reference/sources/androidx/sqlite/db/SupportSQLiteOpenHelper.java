package androidx.sqlite.db;

import android.content.Context;
import defpackage.p4;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
    public static final class Configuration {
        public final Context a;
        public final String b;
        public final p4 c;

        public Configuration(Context context, String str, p4 p4Var) {
            p4Var.getClass();
            this.a = context;
            this.b = str;
            this.c = p4Var;
        }
    }

    String getDatabaseName();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
