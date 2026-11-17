package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gb extends ThreadLocal {
    public final /* synthetic */ byte a;

    public /* synthetic */ gb(byte b) {
        this.a = b;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        byte b = 3;
        byte b2 = 4;
        byte b3 = 5;
        byte b4 = 6;
        byte b5 = 2;
        byte b6 = 1;
        byte b7 = 0;
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    ib ibVar = new ib(choreographer, Handler.createAsync(looperMyLooper));
                    return cu.Q(ibVar, ibVar.s);
                }
                li1.g("no Looper on this thread");
                return null;
            case 1:
                fm fmVar = new fm(b7);
                fmVar.j = om.O;
                fmVar.k = false;
                return fmVar;
            case 2:
                gm gmVar = new gm(b7);
                gmVar.j = om.a;
                return gmVar;
            case 3:
                gm gmVar2 = new gm(b6);
                gmVar2.j = om.a;
                return gmVar2;
            case 4:
                em emVar = new em((byte) 0);
                emVar.i = 0;
                emVar.j = om.a;
                return emVar;
            case 5:
                hm hmVar = new hm((byte) 0);
                hmVar.i = 0;
                return hmVar;
            case 6:
                gm gmVar3 = new gm(b5);
                gmVar3.j = om.a;
                return gmVar3;
            case 7:
                fm fmVar2 = new fm(b6);
                fmVar2.j = om.N;
                fmVar2.k = false;
                return fmVar2;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                fm fmVar3 = new fm(b5);
                fmVar3.j = om.O;
                fmVar3.k = false;
                return fmVar3;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                gm gmVar4 = new gm(b);
                gmVar4.j = om.a;
                return gmVar4;
            case 10:
                gm gmVar5 = new gm(b2);
                gmVar5.j = om.a;
                return gmVar5;
            case 11:
                gm gmVar6 = new gm(b3);
                gmVar6.j = om.b;
                return gmVar6;
            case 12:
                gm gmVar7 = new gm(b4);
                gmVar7.j = om.b;
                return gmVar7;
            case 13:
                ow owVar = new ow(b7);
                owVar.j = uw.l;
                owVar.k = false;
                return owVar;
            case 14:
                pw pwVar = new pw(b7);
                pwVar.j = uw.n;
                return pwVar;
            case 15:
                pw pwVar2 = new pw(b6);
                pwVar2.j = uw.n;
                return pwVar2;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                nw nwVar = new nw((byte) 1);
                nwVar.i = 0;
                nwVar.j = uw.n;
                return nwVar;
            case 17:
                qw qwVar = new qw((byte) 1);
                qwVar.i = 0;
                return qwVar;
            case 18:
                pw pwVar3 = new pw(b5);
                pwVar3.j = uw.n;
                return pwVar3;
            case 19:
                pw pwVar4 = new pw(b);
                pwVar4.j = uw.n;
                return pwVar4;
            case 20:
                ow owVar2 = new ow(b6);
                owVar2.j = uw.l;
                owVar2.k = false;
                return owVar2;
            case 21:
                pw pwVar5 = new pw(b2);
                pwVar5.j = uw.n;
                return pwVar5;
            case 22:
                pw pwVar6 = new pw(b3);
                pwVar6.j = uw.n;
                return pwVar6;
            case 23:
                pw pwVar7 = new pw(b4);
                pwVar7.j = uw.m;
                return pwVar7;
            case 24:
                pw pwVar8 = new pw((byte) 7);
                pwVar8.j = uw.m;
                return pwVar8;
            case 25:
                return new Random();
            case 26:
                t22 t22Var = new t22(b7);
                t22Var.j = Double.POSITIVE_INFINITY;
                t22Var.k = false;
                return t22Var;
            case 27:
                u22 u22Var = new u22(b7);
                u22Var.j = h32.a;
                return u22Var;
            case 28:
                u22 u22Var2 = new u22(b6);
                u22Var2.j = h32.a;
                return u22Var2;
            default:
                s22 s22Var = new s22((byte) 2);
                s22Var.i = 0;
                s22Var.j = h32.a;
                return s22Var;
        }
    }
}
