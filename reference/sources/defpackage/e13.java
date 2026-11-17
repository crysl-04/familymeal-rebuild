package defpackage;

import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e13 {
    public static final ie0 a = new ie0(new n62((byte) 19), (byte) 1);

    public static final xw2 a(d13 d13Var, dr0 dr0Var) {
        c13 c13Var = (c13) dr0Var.j(a);
        switch (d13Var.ordinal()) {
            case 0:
                return c13Var.j;
            case 1:
                return c13Var.k;
            case 2:
                return c13Var.l;
            case 3:
                return c13Var.a;
            case 4:
                return c13Var.b;
            case 5:
                return c13Var.c;
            case 6:
                return c13Var.d;
            case 7:
                return c13Var.e;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return c13Var.f;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return c13Var.m;
            case 10:
                return c13Var.n;
            case 11:
                return c13Var.o;
            case 12:
                return c13Var.g;
            case 13:
                return c13Var.h;
            case 14:
                return c13Var.i;
            case 15:
                return c13Var.y;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return c13Var.z;
            case 17:
                return c13Var.A;
            case 18:
                return c13Var.p;
            case 19:
                return c13Var.q;
            case 20:
                return c13Var.r;
            case 21:
                return c13Var.s;
            case 22:
                return c13Var.t;
            case 23:
                return c13Var.u;
            case 24:
                return c13Var.B;
            case 25:
                return c13Var.C;
            case 26:
                return c13Var.D;
            case 27:
                return c13Var.v;
            case 28:
                return c13Var.w;
            case 29:
                return c13Var.x;
            default:
                wg.n();
                return null;
        }
    }
}
