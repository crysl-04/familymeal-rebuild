package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class de1 implements vp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ de1(byte b) {
        this.h = b;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                te1 te1Var = (te1) obj;
                te1Var.getClass();
                return te1Var.name();
            case 1:
                yt1 yt1Var = (yt1) obj;
                return wi0.g("[", yt1Var.b, ", ", yt1Var.c, ")");
            case 2:
                e30 e30Var = (e30) obj;
                e30Var.getClass();
                return new ec2(h7.a0(e30Var));
            case 3:
                return new dj(h7.a0((e30) obj));
            case 4:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 5:
                dl1 dl1Var = (dl1) obj;
                dl1Var.getClass();
                return Integer.valueOf(dl1Var.i.b);
            case 6:
                dl1 dl1Var2 = (dl1) obj;
                dl1Var2.getClass();
                gl1 gl1Var = dl1Var2.j;
                if (gl1Var == null || gl1Var.m.b != dl1Var2.i.b) {
                    return null;
                }
                return gl1Var;
            case 7:
                dl1 dl1Var3 = (dl1) obj;
                dl1Var3.getClass();
                gl1 gl1Var2 = dl1Var3.j;
                if (gl1Var2 == null || gl1Var2.m.b != dl1Var3.i.b) {
                    return null;
                }
                return gl1Var2;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                dl1 dl1Var4 = (dl1) obj;
                dl1Var4.getClass();
                return dl1Var4.j;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                dl1 dl1Var5 = (dl1) obj;
                dl1Var5.getClass();
                if (!(dl1Var5 instanceof gl1)) {
                    return null;
                }
                u30 u30Var = ((gl1) dl1Var5).m;
                return u30Var.b(u30Var.b);
            case 10:
                dl1 dl1Var6 = ((pk1) ((ic) obj).d()).i;
                dl1Var6.getClass();
                int i = dl1.l;
                for (dl1 dl1Var7 : es.L((ey) dl1Var6)) {
                }
                return null;
            case 11:
                return ((pk1) obj).m;
            case 12:
            case 18:
            case 19:
                return j23Var;
            case 13:
                o9 o9Var = ((hn1) obj).a;
                if (o9Var != null) {
                    o9Var.a();
                }
                return j23Var;
            case 14:
                pn1 pn1Var = (pn1) obj;
                l41 l41Var = pn1Var.B;
                try {
                    if (pn1Var.B()) {
                        pn1Var.w1(true);
                        break;
                    }
                    return j23Var;
                } catch (Throwable th) {
                    l41Var.Z(th);
                    throw null;
                }
            case 15:
                gt1 gt1Var = ((pn1) obj).a0;
                if (gt1Var != null) {
                    ((es0) gt1Var).c();
                }
                return j23Var;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                ((Long) obj).getClass();
                return j23Var;
            case 17:
                sp1 sp1Var = (sp1) obj;
                if (sp1Var.B()) {
                    sp1Var.h.M();
                }
                return j23Var;
            case 20:
                dx1 dx1Var = (dx1) obj;
                int i2 = d9.a;
                ie0 ie0Var = i7.b;
                dx1Var.getClass();
                Context context2 = (Context) dt.M(dx1Var, ie0Var);
                e90 e90Var = (e90) dt.M(dx1Var, uz.h);
                bt1 bt1Var = (bt1) dt.M(dx1Var, ct1.a);
                if (bt1Var != null) {
                    return new k8(context2, e90Var, bt1Var.a, bt1Var.b);
                }
                return null;
            case 21:
                l41 l41Var2 = (l41) obj;
                if (l41Var2.I()) {
                    l41.U(l41Var2, false, 7);
                }
                return j23Var;
            case 22:
                l41 l41Var3 = (l41) obj;
                if (l41Var3.I()) {
                    l41.W(l41Var3, false, 7);
                }
                return j23Var;
            case 23:
                l41 l41Var4 = (l41) obj;
                if (l41Var4.I()) {
                    l41Var4.G();
                }
                return j23Var;
            case 24:
                l41 l41Var5 = (l41) obj;
                if (l41Var5.I()) {
                    l41Var5.V(false);
                }
                return j23Var;
            case 25:
                l41 l41Var6 = (l41) obj;
                if (l41Var6.I()) {
                    l41Var6.V(false);
                }
                return j23Var;
            case 26:
                l41 l41Var7 = (l41) obj;
                if (l41Var7.I()) {
                    l41Var7.T(false);
                }
                return j23Var;
            case 27:
                l41 l41Var8 = (l41) obj;
                if (l41Var8.I()) {
                    l41Var8.T(false);
                }
                return j23Var;
            case 28:
                obj.getClass();
                return Boolean.valueOf(!((ht1) obj).B());
            default:
                dy1 dy1Var = (dy1) obj;
                dy1Var.getClass();
                return dy1Var.a;
        }
    }
}
