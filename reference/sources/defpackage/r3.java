package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r3 implements kp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ r3(byte b) {
        this.h = b;
    }

    @Override // defpackage.kp0
    public final Object a() {
        Choreographer choreographer;
        switch (this.h) {
            case 0:
                i0 i0Var = n52.h;
                return Integer.valueOf(n52.h.a().nextInt(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                rt1 rt1Var = b5.a;
                return y60.a;
            case 3:
                i7.a("LocalConfiguration");
                throw null;
            case 4:
                i7.a("LocalContext");
                throw null;
            case 5:
                i7.a("LocalImageVectorCache");
                throw null;
            case 6:
                i7.a("LocalResourceIdCache");
                throw null;
            case 7:
                i7.a("LocalView");
                throw null;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return UUID.randomUUID();
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return "DEFAULT_TEST_TAG";
            case 10:
                return UUID.randomUUID();
            case 11:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    r70 r70Var = ya0.a;
                    choreographer = (Choreographer) uz0.w(pd1.a, new fb(2, null));
                }
                ib ibVar = new ib(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return cu.Q(ibVar, ibVar.s);
            case 12:
                ie0 ie0Var = de.a;
                return y70.a;
            case 13:
                ie0 ie0Var2 = de.a;
                return c5.N;
            case 14:
                return new rl2(cu.b(1308617531));
            case 15:
                return rz1.x(Boolean.FALSE);
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return new lh(bo2.a);
            case 17:
                return new lh(zv0.a);
            case 18:
                return new lh(o62.a);
            case 19:
                return new lh(tj.a);
            case 20:
                return new lh(ck.a);
            case 21:
                return new ka1(new ka1(new lh(bo2.a)));
            case 22:
                return null;
            case 23:
                return rv.e(-1, 0L, 0L);
            case 24:
                return Boolean.TRUE;
            case 25:
                return new l41(2);
            case 26:
            case 27:
            case 28:
                return null;
            default:
                uz.b("LocalViewConfiguration");
                throw null;
        }
    }
}
