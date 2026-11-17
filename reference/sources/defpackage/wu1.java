package defpackage;

import android.database.SQLException;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wu1 implements b62, j12 {
    public final zp0 a;
    public final SQLiteConnection b;
    public final AtomicInteger c;
    public cz2 d;

    public wu1(zp0 zp0Var, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        this.a = zp0Var;
        this.b = sQLiteConnection;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.b62
    public final SQLiteConnection a() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.j12
    public final Object b(String str, vp0 vp0Var, n10 n10Var) {
        tu1 tu1Var;
        if (n10Var instanceof tu1) {
            tu1Var = (tu1) n10Var;
            int i = tu1Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                tu1Var.o = i - Integer.MIN_VALUE;
            } else {
                tu1Var = new tu1(this, n10Var);
            }
        } else {
            tu1Var = new tu1(this, n10Var);
        }
        Object objC = tu1Var.m;
        int i2 = tu1Var.o;
        Object obj = y20.h;
        if (i2 == 0) {
            m02.y(objC);
            tu1Var.k = str;
            tu1Var.l = vp0Var;
            tu1Var.o = 1;
            objC = c(tu1Var);
            if (objC != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                m02.y(objC);
                return objC;
            }
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vp0Var = tu1Var.l;
        str = tu1Var.k;
        m02.y(objC);
        if (((Boolean) objC).booleanValue()) {
            uu1 uu1Var = new uu1(this, str, vp0Var, null);
            tu1Var.k = null;
            tu1Var.l = null;
            tu1Var.o = 2;
            Object objF = this.a.f(uu1Var, tu1Var);
            return objF == obj ? obj : objF;
        }
        SQLiteStatement sQLiteStatementPrepare = this.b.prepare(str);
        try {
            Object objH = vp0Var.h(sQLiteStatementPrepare);
            ie1.j(sQLiteStatementPrepare, null);
            return objH;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ie1.j(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final Boolean c(m10 m10Var) {
        return Boolean.valueOf(this.d != null || this.b.inTransaction());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(cz2 cz2Var, zp0 zp0Var, n10 n10Var) {
        su1 su1Var;
        if (n10Var instanceof su1) {
            su1Var = (su1) n10Var;
            int i = su1Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                su1Var.n = i - Integer.MIN_VALUE;
            } else {
                su1Var = new su1(this, n10Var);
            }
        } else {
            su1Var = new su1(this, n10Var);
        }
        Object objF = su1Var.l;
        int i2 = su1Var.n;
        AtomicInteger atomicInteger = this.c;
        boolean z = true;
        SQLiteConnection sQLiteConnection = this.b;
        try {
            if (i2 == 0) {
                m02.y(objF);
                int iOrdinal = cz2Var.ordinal();
                if (iOrdinal == 0) {
                    pz1.k(sQLiteConnection, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    pz1.k(sQLiteConnection, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        wg.n();
                        return null;
                    }
                    pz1.k(sQLiteConnection, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = cz2Var;
                }
                Object ru1Var = new ru1(this);
                su1Var.k = true;
                su1Var.n = 1;
                objF = zp0Var.f(ru1Var, su1Var);
                Object obj = y20.h;
                if (objF == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = su1Var.k;
                m02.y(objF);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (z) {
                pz1.k(sQLiteConnection, "END TRANSACTION");
                return objF;
            }
            pz1.k(sQLiteConnection, "ROLLBACK TRANSACTION");
            return objF;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    pz1.k(sQLiteConnection, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    vs.l(th, e);
                }
                throw th2;
            }
        }
    }

    public final Object e(cz2 cz2Var, zp0 zp0Var, mq2 mq2Var) {
        return this.a.f(new vu1(this, cz2Var, zp0Var, null, (byte) 0), mq2Var);
    }
}
