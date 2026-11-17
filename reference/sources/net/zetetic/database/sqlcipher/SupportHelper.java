package net.zetetic.database.sqlcipher;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import defpackage.aq2;
import defpackage.az;
import defpackage.d92;
import defpackage.da2;
import defpackage.e92;
import defpackage.ea2;
import defpackage.ie1;
import defpackage.j23;
import defpackage.ja2;
import defpackage.p4;
import defpackage.pz1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class SupportHelper implements SupportSQLiteOpenHelper {
    private SQLiteOpenHelper openHelper;

    public SupportHelper(final SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.openHelper = new SQLiteOpenHelper(configuration.a, configuration.b, bArr, null, configuration.c.b, i, null, sQLiteDatabaseHook, z) { // from class: net.zetetic.database.sqlcipher.SupportHelper.1
            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onConfigure(SQLiteDatabase sQLiteDatabase) {
                configuration.c.getClass();
                sQLiteDatabase.getClass();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                p4 p4Var = configuration.c;
                p4Var.getClass();
                sQLiteDatabase.getClass();
                ea2 ea2Var = (ea2) p4Var.c;
                aq2 aq2Var = new aq2(sQLiteDatabase);
                androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = aq2Var.prepare("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
                try {
                    boolean z2 = false;
                    if (sQLiteStatementPrepare.step() && sQLiteStatementPrepare.getLong(0) == 0) {
                        z2 = true;
                    }
                    ie1.j(sQLiteStatementPrepare, null);
                    ja2 ja2Var = ea2Var.J;
                    ja2Var.a(aq2Var);
                    if (!z2) {
                        az azVarG = ja2Var.g(aq2Var);
                        if (!azVarG.a) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) azVarG.b)).toString());
                        }
                    }
                    ea2Var.R(aq2Var);
                    ja2Var.c(aq2Var);
                    Iterator it = ea2Var.K.iterator();
                    while (it.hasNext()) {
                        ((da2) it.next()).getClass();
                        if (aq2Var instanceof aq2) {
                            aq2Var.h.getClass();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ie1.j(sQLiteStatementPrepare, th);
                        throw th2;
                    }
                }
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                p4 p4Var = configuration.c;
                p4Var.getClass();
                sQLiteDatabase.getClass();
                p4Var.f(sQLiteDatabase, i2, i3);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
                Object d92Var;
                p4 p4Var = configuration.c;
                p4Var.getClass();
                sQLiteDatabase.getClass();
                ea2 ea2Var = (ea2) p4Var.c;
                aq2 aq2Var = new aq2(sQLiteDatabase);
                androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = aq2Var.prepare("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
                try {
                    boolean z2 = sQLiteStatementPrepare.step() && sQLiteStatementPrepare.getLong(0) != 0;
                    ie1.j(sQLiteStatementPrepare, null);
                    if (z2) {
                        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare2 = aq2Var.prepare("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String text = sQLiteStatementPrepare2.step() ? sQLiteStatementPrepare2.getText(0) : null;
                            ie1.j(sQLiteStatementPrepare2, null);
                            ja2 ja2Var = ea2Var.J;
                            if (!ja2Var.b.equals(text) && !ja2Var.c.equals(text)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ja2Var.b + ", found: " + text).toString());
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ie1.j(sQLiteStatementPrepare2, th);
                                throw th2;
                            }
                        }
                    } else {
                        pz1.k(aq2Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            az azVarG = ea2Var.J.g(aq2Var);
                            if (!azVarG.a) {
                                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) azVarG.b)).toString());
                            }
                            ea2Var.J.e(aq2Var);
                            ea2Var.R(aq2Var);
                            d92Var = j23.a;
                            if (!(d92Var instanceof d92)) {
                                pz1.k(aq2Var, "END TRANSACTION");
                            }
                            Throwable thA = e92.a(d92Var);
                            if (thA != null) {
                                pz1.k(aq2Var, "ROLLBACK TRANSACTION");
                                throw thA;
                            }
                        } catch (Throwable th3) {
                            d92Var = new d92(th3);
                        }
                    }
                    ea2Var.J.d(aq2Var);
                    for (da2 da2Var : ea2Var.K) {
                        da2Var.getClass();
                        if (aq2Var instanceof aq2) {
                            SupportSQLiteDatabase supportSQLiteDatabase = aq2Var.h;
                            supportSQLiteDatabase.getClass();
                            da2Var.a.h(supportSQLiteDatabase);
                        }
                    }
                    ea2Var.N = sQLiteDatabase;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ie1.j(sQLiteStatementPrepare, th4);
                        throw th5;
                    }
                }
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                configuration.c.f(sQLiteDatabase, i2, i3);
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.openHelper.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.openHelper.getDatabaseName();
    }

    public SupportSQLiteDatabase getReadableDatabase() {
        return this.openHelper.getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return this.openHelper.getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.openHelper.setWriteAheadLoggingEnabled(z);
    }

    public SupportHelper(SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(configuration, bArr, sQLiteDatabaseHook, z, 0);
    }
}
