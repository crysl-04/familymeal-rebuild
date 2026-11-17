package defpackage;

import com.familymeal.app.MealPlannerApp;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qj extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) throws Throwable {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 1:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 2:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 3:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 4:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 5:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 6:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 7:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 10:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 11:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 12:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 13:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 14:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
            case 15:
                ((qj) p(m10Var, x20Var)).r(j23Var);
                return y20.h;
            default:
                return ((qj) p(m10Var, x20Var)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = 2;
        switch (this.l) {
            case 0:
                return new qj((MealPlannerApp) this.n, m10Var, (byte) 0);
            case 1:
                return new qj((gm0) this.n, m10Var, (byte) 1);
            case 2:
                return new qj((z60) this.n, m10Var, b);
            case 3:
                return new qj((pm0) this.n, m10Var, (byte) 3);
            case 4:
                return new qj((f01) this.n, m10Var, (byte) 4);
            case 5:
                return new qj((ix0) this.n, m10Var, (byte) 5);
            case 6:
                return new qj((nh1) this.n, m10Var, (byte) 6);
            case 7:
                qj qjVar = new qj(b, m10Var);
                qjVar.n = obj;
                return qjVar;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return new qj((jw) this.n, m10Var, (byte) 8);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return new qj((pf2) this.n, m10Var, (byte) 9);
            case 10:
                return new qj((q30) this.n, m10Var, (byte) 10);
            case 11:
                return new qj((kv2) this.n, m10Var, (byte) 11);
            case 12:
                return new qj((rx2) this.n, m10Var, (byte) 12);
            case 13:
                return new qj((qy2) this.n, m10Var, (byte) 13);
            case 14:
                return new qj((p03) this.n, m10Var, (byte) 14);
            case 15:
                return new qj((iu1) this.n, m10Var, (byte) 15);
            default:
                return new qj((p63) this.n, m10Var, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [m10] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005d -> B:22:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x003f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj(int i, m10 m10Var) {
        super(i, m10Var);
        this.l = (byte) 7;
    }
}
