package defpackage;

import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class rv {
    public static final ie0 a = new ie0(new r3((byte) 23), (byte) 1);
    public static final ie0 b = new ie0(new r3((byte) 24), (byte) 1);

    public static final long a(pv pvVar, long j) {
        long j2 = pvVar.a;
        long j3 = pvVar.U;
        long j4 = pvVar.Q;
        long j5 = pvVar.M;
        long j6 = pvVar.q;
        int i = kv.h;
        if (r13.a(j, j2)) {
            return pvVar.b;
        }
        if (r13.a(j, pvVar.f)) {
            return pvVar.g;
        }
        if (r13.a(j, pvVar.j)) {
            return pvVar.k;
        }
        if (r13.a(j, pvVar.n)) {
            return pvVar.o;
        }
        if (r13.a(j, pvVar.w)) {
            return pvVar.x;
        }
        if (r13.a(j, pvVar.c)) {
            return pvVar.d;
        }
        if (r13.a(j, pvVar.h)) {
            return pvVar.i;
        }
        if (r13.a(j, pvVar.l)) {
            return pvVar.m;
        }
        if (r13.a(j, pvVar.y)) {
            return pvVar.z;
        }
        if (r13.a(j, pvVar.u)) {
            return pvVar.v;
        }
        if (!r13.a(j, pvVar.p)) {
            if (r13.a(j, pvVar.r)) {
                return pvVar.s;
            }
            if (!r13.a(j, pvVar.D) && !r13.a(j, pvVar.F) && !r13.a(j, pvVar.G) && !r13.a(j, pvVar.H) && !r13.a(j, pvVar.I) && !r13.a(j, pvVar.J) && !r13.a(j, pvVar.E)) {
                if (r13.a(j, pvVar.K) || r13.a(j, pvVar.L)) {
                    return j5;
                }
                if (r13.a(j, pvVar.O) || r13.a(j, pvVar.P)) {
                    return j4;
                }
                return (r13.a(j, pvVar.S) || r13.a(j, pvVar.T)) ? j3 : kv.g;
            }
        }
        return j6;
    }

    public static final long b(long j, dr0 dr0Var) {
        dr0Var.V(89374938);
        long jA = a((pv) dr0Var.j(a), j);
        if (jA == 16) {
            jA = ((kv) dr0Var.j(s00.a)).a;
        }
        dr0Var.p(false);
        return jA;
    }

    public static final long c(pv pvVar, qv qvVar) {
        switch (qvVar.ordinal()) {
            case 0:
                return pvVar.n;
            case 1:
                return pvVar.w;
            case 2:
                return pvVar.y;
            case 3:
                return pvVar.v;
            case 4:
                return pvVar.e;
            case 5:
                return pvVar.u;
            case 6:
                return pvVar.o;
            case 7:
                return pvVar.x;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return pvVar.z;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return pvVar.b;
            case 10:
                return pvVar.d;
            case 11:
                return pvVar.M;
            case 12:
                return pvVar.N;
            case 13:
                return pvVar.g;
            case 14:
                return pvVar.i;
            case 15:
                return pvVar.Q;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return pvVar.R;
            case 17:
                return pvVar.q;
            case 18:
                return pvVar.s;
            case 19:
                return pvVar.k;
            case 20:
                return pvVar.m;
            case 21:
                return pvVar.U;
            case 22:
                return pvVar.V;
            case 23:
                return pvVar.A;
            case 24:
                return pvVar.B;
            case 25:
                return pvVar.a;
            case 26:
                return pvVar.c;
            case 27:
                return pvVar.K;
            case 28:
                return pvVar.L;
            case 29:
                return pvVar.C;
            case 30:
                return pvVar.f;
            case 31:
                return pvVar.h;
            case 32:
                return pvVar.O;
            case 33:
                return pvVar.P;
            case 34:
                return pvVar.p;
            case 35:
                return pvVar.D;
            case 36:
                return pvVar.F;
            case 37:
                return pvVar.G;
            case 38:
                return pvVar.H;
            case 39:
                return pvVar.I;
            case 40:
                return pvVar.J;
            case 41:
                return pvVar.E;
            case 42:
                return pvVar.t;
            case 43:
                return pvVar.r;
            case 44:
                return pvVar.j;
            case 45:
                return pvVar.l;
            case 46:
                return pvVar.S;
            case 47:
                return pvVar.T;
            default:
                wg.n();
                return 0L;
        }
    }

    public static final long d(qv qvVar, dr0 dr0Var) {
        return c((pv) dr0Var.j(a), qvVar);
    }

    public static pv e(int i, long j, long j2) {
        long j3 = (i & 1) != 0 ? mv.z : j;
        return new pv(j3, mv.j, mv.A, mv.k, mv.e, (i & 32) != 0 ? mv.E : j2, mv.n, mv.F, mv.o, mv.R, mv.t, mv.S, mv.u, mv.a, mv.g, mv.I, mv.r, mv.Q, mv.s, j3, mv.f, mv.d, mv.b, mv.h, mv.c, mv.i, mv.x, mv.y, mv.D, mv.J, mv.P, mv.K, mv.L, mv.M, mv.N, mv.O, mv.B, mv.C, mv.l, mv.m, mv.G, mv.H, mv.p, mv.q, mv.T, mv.U, mv.v, mv.w);
    }
}
