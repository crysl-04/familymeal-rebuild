package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.familymeal.app.data.db.AppDatabase_Impl;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dg extends ja2 {
    public final /* synthetic */ AppDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(AppDatabase_Impl appDatabase_Impl) {
        super(5, "a55c5770ca4efcc445dd20c83eb6024f", "88312c4a2e1fa656249ca9fc4b49b574");
        this.d = appDatabase_Impl;
    }

    @Override // defpackage.ja2
    public final void d(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        pz1.k(sQLiteConnection, "PRAGMA foreign_keys = ON");
        f01 f01VarE = this.d.e();
        p03 p03Var = f01VarE.b;
        p03Var.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA query_only");
        try {
            sQLiteStatementPrepare.step();
            boolean z = sQLiteStatementPrepare.getBoolean(0);
            ie1.j(sQLiteStatementPrepare, null);
            if (!z) {
                pz1.k(sQLiteConnection, "PRAGMA temp_store = MEMORY");
                pz1.k(sQLiteConnection, "PRAGMA recursive_triggers = 1");
                pz1.k(sQLiteConnection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (p03Var.d) {
                    pz1.k(sQLiteConnection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    pz1.k(sQLiteConnection, jo2.M("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                op1 op1Var = p03Var.h;
                ReentrantLock reentrantLock = op1Var.a;
                reentrantLock.lock();
                try {
                    op1Var.d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (f01VarE.h) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ie1.j(sQLiteStatementPrepare, th2);
                throw th3;
            }
        }
    }

    @Override // defpackage.ja2
    public final void f(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        na1 na1VarQ = lt.q();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (sQLiteStatementPrepare.step()) {
            try {
                na1VarQ.add(sQLiteStatementPrepare.getText(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ie1.j(sQLiteStatementPrepare, th);
                    throw th2;
                }
            }
        }
        ie1.j(sQLiteStatementPrepare, null);
        ListIterator listIterator = lt.e(na1VarQ).listIterator(0);
        while (true) {
            ht0 ht0Var = (ht0) listIterator;
            if (!ht0Var.hasNext()) {
                return;
            }
            String str = (String) ht0Var.next();
            if (jo2.N(str, "room_fts_content_sync_")) {
                pz1.k(sQLiteConnection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }
}
