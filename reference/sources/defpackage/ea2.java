package defpackage;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 extends t03 {
    public final h40 I;
    public final ja2 J;
    public final List K;
    public final zu1 L;
    public final SupportSQLiteOpenHelper M;
    public SupportSQLiteDatabase N;

    public ea2(h40 h40Var, ja2 ja2Var, om0 om0Var) {
        a aVar = h40Var.b;
        this.I = h40Var;
        this.J = ja2Var;
        this.K = h40Var.d;
        if (aVar == null) {
            wg.m("SQLiteManager was constructed with both null driver and open helper factory!");
            throw null;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperCreate = aVar.create(new SupportSQLiteOpenHelper.Configuration(h40Var.a, "family_meal.db", new p4(this, ja2Var.a)));
        this.M = supportSQLiteOpenHelperCreate;
        this.L = new zu1(new xl1(supportSQLiteOpenHelperCreate), "family_meal.db", om0Var);
        boolean z = h40Var.e == fa2.i;
        if (supportSQLiteOpenHelperCreate != null) {
            supportSQLiteOpenHelperCreate.setWriteAheadLoggingEnabled(z);
        }
    }

    public ea2(h40 h40Var, z82 z82Var, om0 om0Var) {
        this.I = h40Var;
        this.J = new ca2(-1, "", "");
        ArrayList arrayList = h40Var.d;
        this.K = arrayList;
        dv.J0(arrayList, new da2(new z61(this, (byte) 14)));
        throw new mo1(0);
    }
}
