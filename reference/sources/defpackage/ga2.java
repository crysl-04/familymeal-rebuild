package defpackage;

import android.os.Looper;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ga2 {
    public k10 a;
    public o20 b;
    public Executor c;
    public bz2 d;
    public ea2 e;
    public f01 f;
    public final eg g = new eg(new o6(0, this, ga2.class, "onClosed", "onClosed()V", 0, 7));
    public final ThreadLocal h = new ThreadLocal();
    public final LinkedHashMap i = new LinkedHashMap();
    public boolean j = true;

    public final void a() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        li1.g("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public List b(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ee1.K(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            du duVar = (du) entry.getKey();
            duVar.getClass();
            Class clsA = duVar.a();
            clsA.getClass();
            linkedHashMap2.put(clsA, entry.getValue());
        }
        return ag0.h;
    }

    public abstract f01 c();

    public ja2 d() {
        throw new mo1(0);
    }

    public final f01 e() {
        f01 f01Var = this.f;
        if (f01Var != null) {
            return f01Var;
        }
        uz0.A("internalTracker");
        throw null;
    }

    public final SupportSQLiteOpenHelper f() {
        ea2 ea2Var = this.e;
        if (ea2Var == null) {
            uz0.A("connectionManager");
            throw null;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = ea2Var.M;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        li1.g("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set g() {
        return dv.U0(new ArrayList(ev.o0(gg0.h, 10)));
    }

    public LinkedHashMap h() {
        int iK = ee1.K(ev.o0(gg0.h, 10));
        if (iK < 16) {
            iK = 16;
        }
        return new LinkedHashMap(iK);
    }

    public final boolean i() {
        ea2 ea2Var = this.e;
        if (ea2Var != null) {
            return ea2Var.M != null;
        }
        uz0.A("connectionManager");
        throw null;
    }

    public final boolean j() {
        return k() && f().getWritableDatabase().inTransaction();
    }

    public final boolean k() {
        ea2 ea2Var = this.e;
        if (ea2Var == null) {
            uz0.A("connectionManager");
            throw null;
        }
        SupportSQLiteDatabase supportSQLiteDatabase = ea2Var.N;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    public final Object l(boolean z, zp0 zp0Var, m10 m10Var) {
        y02.v(this);
        ea2 ea2Var = this.e;
        m10 m10Var2 = null;
        if (ea2Var == null) {
            uz0.A("connectionManager");
            throw null;
        }
        zu1 zu1Var = ea2Var.L;
        zu1Var.getClass();
        yu1 yu1Var = (yu1) m10Var.e().m(yu1.i);
        wu1 wu1Var = yu1Var != null ? yu1Var.h : null;
        if (wu1Var != null) {
            return zp0Var.f(wu1Var, m10Var);
        }
        wu1 wu1Var2 = new wu1(zu1Var.j, (SQLiteConnection) zu1Var.k.getValue());
        return ie1.G(new yu1(wu1Var2), new h(zp0Var, wu1Var2, m10Var2, (byte) 24), m10Var);
    }
}
