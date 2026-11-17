package defpackage;

import android.view.textclassifier.TextClassifier;
import com.familymeal.app.MealPlannerApp;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m10 m10Var, ga2 ga2Var, vu1 vu1Var) {
        super(2, m10Var);
        this.l = (byte) 14;
        this.n = ga2Var;
        this.o = vu1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        y20 y20Var = y20.h;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 2:
                ((h) p((m10) obj2, (jx0) obj)).r(j23Var);
                return y20Var;
            case 3:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 4:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 5:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 6:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 7:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return ((h) p((m10) obj2, (v32) obj)).r(j23Var);
            case 10:
                return ((h) p((m10) obj2, (qk0) obj)).r(j23Var);
            case 11:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 12:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 13:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 14:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 15:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 17:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 18:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 19:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 20:
                ((h) p((m10) obj2, (x20) obj)).r(j23Var);
                return y20Var;
            case 21:
                ((h) p((m10) obj2, (x20) obj)).r(j23Var);
                return y20Var;
            case 22:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 23:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 24:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 25:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 26:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 27:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            case 28:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((h) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new h((ui1) this.n, (ut0) obj2, m10Var, (byte) 0);
            case 1:
                return new h((ui1) this.n, (vt0) obj2, m10Var, (byte) 1);
            case 2:
                h hVar = new h(obj2, m10Var, (byte) 2);
                hVar.n = obj;
                return hVar;
            case 3:
                h hVar2 = new h(obj2, m10Var, (byte) 3);
                hVar2.n = obj;
                return hVar2;
            case 4:
                return new h((MealPlannerApp) this.n, (sj1) obj2, m10Var, (byte) 4);
            case 5:
                return new h((MealPlannerApp) this.n, (gk) obj2, m10Var, (byte) 5);
            case 6:
                return new h((MealPlannerApp) this.n, (hk) obj2, m10Var, (byte) 6);
            case 7:
                return new h((km0) this.n, (ry2) obj2, m10Var, (byte) 7);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return new h((so) this.n, (zi) obj2, m10Var, (byte) 8);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                h hVar3 = new h(obj2, m10Var, (byte) 9);
                hVar3.n = (m10) obj;
                return hVar3;
            case 10:
                h hVar4 = new h(obj2, m10Var, (byte) 10);
                hVar4.n = obj;
                return hVar4;
            case 11:
                return new h((ny) this.n, (Runnable) obj2, m10Var, (byte) 11);
            case 12:
                return new h((kv2) this.n, (oo) obj2, m10Var, (byte) 12);
            case 13:
                return new h((d12) this.n, (kv2) obj2, m10Var, (byte) 13);
            case 14:
                return new h(m10Var, (ga2) this.n, (vu1) obj2);
            case 15:
                return new h((jk0) this.n, (gk0) obj2, m10Var, (byte) 15);
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return new h((jk0) this.n, (gz0) obj2, m10Var, (byte) 16);
            case 17:
                return new h((hz0) this.n, (sj1) obj2, m10Var, (byte) 17);
            case 18:
                return new h((lw0) this.n, (String) obj2, m10Var, (byte) 18);
            case 19:
                return new h((lw0) this.n, (uv0) obj2, m10Var, (byte) 19);
            case 20:
                return new h((k81) this.n, (b9) obj2, m10Var, (byte) 20);
            case 21:
                return new h((ln2) this.n, (ah1) obj2, m10Var, (byte) 21);
            case 22:
                return new h((ho1) this.n, (zp0) obj2, m10Var, (byte) 22);
            case 23:
                h hVar5 = new h(obj2, m10Var, (byte) 23);
                hVar5.n = obj;
                return hVar5;
            case 24:
                return new h((zp0) this.n, (wu1) obj2, m10Var, (byte) 24);
            case 25:
                return new h((ay1) this.n, (dy1) obj2, m10Var, (byte) 25);
            case 26:
                return new h((TextClassifier) this.n, (zp0) obj2, m10Var, (byte) 26);
            case 27:
                return new h((x62) this.n, (String) obj2, m10Var, (byte) 27);
            case 28:
                return new h((x62) this.n, (j62) obj2, m10Var, (byte) 28);
            default:
                h hVar6 = new h(obj2, m10Var, (byte) 29);
                hVar6.n = obj;
                return hVar6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:343:0x0685  */
    /* JADX WARN: Code duplicated, block: B:345:0x069b  */
    /* JADX WARN: Code duplicated, block: B:347:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:350:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:352:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:354:0x06c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v81, types: [s01] */
    /* JADX WARN: Type inference failed for: r1v85, types: [s01] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:346:0x06a6 -> B:348:0x06aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
    }
}
