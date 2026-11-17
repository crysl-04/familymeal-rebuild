package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m6 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ ny1 i;

    public /* synthetic */ m6(ny1 ny1Var, byte b) {
        this.h = b;
        this.i = ny1Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        ny1 ny1Var = this.i;
        my1 my1Var = (my1) obj;
        switch (b) {
            case 0:
                my1.i(my1Var, ny1Var, 0, 0);
                break;
            case 1:
                my1.i(my1Var, ny1Var, 0, 0);
                break;
            case 2:
                my1.k(my1Var, ny1Var, 0, 0);
                break;
            case 3:
                my1.k(my1Var, ny1Var, 0, 0);
                break;
            case 4:
                if (my1Var.c() == u31.h || my1Var.e() == 0) {
                    my1Var.g(ny1Var);
                    ny1Var.n0(ny0.c(0L, ny1Var.l), 0.0f, null);
                } else {
                    long jE = ((long) (my1Var.e() - ny1Var.h)) << 32;
                    my1Var.g(ny1Var);
                    ny1Var.n0(ny0.c(jE, ny1Var.l), 0.0f, null);
                }
                break;
            case 5:
                my1.i(my1Var, ny1Var, 0, 0);
                break;
            case 6:
                my1.k(my1Var, ny1Var, 0, 0);
                break;
            case 7:
                my1.i(my1Var, ny1Var, 0, 0);
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                my1.l(my1Var, ny1Var, 0, 0);
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                my1.k(my1Var, ny1Var, 0, 0);
                break;
            case 10:
                my1.i(my1Var, ny1Var, 0, 0);
                break;
            case 11:
                my1.k(my1Var, ny1Var, 0, 0);
                break;
            case 12:
                my1.i(my1Var, ny1Var, 0, 0);
                break;
            default:
                my1.k(my1Var, ny1Var, 0, 0);
                break;
        }
        return j23Var;
    }
}
