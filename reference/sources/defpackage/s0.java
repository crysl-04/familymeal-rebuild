package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements vp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ s0(byte b) {
        this.h = b;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        boolean z = false;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                f12 f12Var = (f12) obj;
                if (f12Var != null && f12Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 1:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 2:
                return Boolean.TRUE;
            case 3:
                return Boolean.valueOf(cy1.F((wg2) obj));
            case 4:
                return (j02) obj;
            case 5:
                dx1 dx1Var = (dx1) obj;
                ie0 ie0Var = i7.a;
                dx1Var.getClass();
                dt.M(dx1Var, ie0Var);
                return ((Context) dt.M(dx1Var, i7.b)).getResources();
            case 6:
                return Boolean.valueOf(cy1.F((wg2) obj));
            case 7:
                q21[] q21VarArr = bh2.a;
                ((dh2) obj).a(ah2.y, j23Var);
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
            case 10:
                ((Long) obj).getClass();
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                q21[] q21VarArr2 = bh2.a;
                ((dh2) obj).a(ah2.x, j23Var);
                return j23Var;
            case 11:
            case 24:
            case 25:
                return j23Var;
            case 12:
                return Boolean.valueOf(!(((kd) obj) instanceof cu1));
            case 13:
                h11 h11Var = (h11) obj;
                h11Var.getClass();
                h11Var.b = false;
                h11Var.a = false;
                return j23Var;
            case 14:
                h11 h11Var2 = (h11) obj;
                h11Var2.getClass();
                h11Var2.c = true;
                return j23Var;
            case 15:
                h11 h11Var3 = (h11) obj;
                h11Var3.getClass();
                h11Var3.b = true;
                return j23Var;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                u63 u63Var = (u63) obj;
                u63Var.getClass();
                return u63Var.a;
            case 17:
                u63 u63Var2 = (u63) obj;
                u63Var2.getClass();
                return u63Var2.b;
            case 18:
                qk qkVar = (qk) obj;
                qkVar.getClass();
                dt.H(qkVar);
                return j23Var;
            case 19:
                ((qk) obj).L0();
                return j23Var;
            case 20:
                yc1 yc1Var = (yc1) obj;
                yc1Var.c(aa3.j, (int) (yc1Var.a().O() >> 32));
                yc1Var.c(aa3.i, 0.0f);
                return j23Var;
            case 21:
            case 22:
                return j23Var;
            case 23:
                ((n41) obj).a();
                return j23Var;
            case 26:
                dx1 dx1Var2 = (dx1) obj;
                ie0 ie0Var2 = i7.b;
                dx1Var2.getClass();
                if (((Context) dt.M(dx1Var2, ie0Var2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return xo.b;
                }
                vo.a.getClass();
                return uo.c;
            case 27:
                bh2.k((dh2) obj, 0);
                return j23Var;
            case 28:
                return j23Var;
            default:
                yz2 yz2Var = (yz2) obj;
                yz2Var.getClass();
                nu1 nu1Var = (nu1) yz2Var;
                nu1Var.w = false;
                y02.p(nu1Var);
                return Boolean.FALSE;
        }
    }
}
