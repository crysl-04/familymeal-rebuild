package defpackage;

import android.content.Context;
import com.familymeal.app.MealPlannerApp;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ui1 ui1Var, jk0 jk0Var, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 8;
        this.n = ui1Var;
        this.p = jk0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                return ((j) p((m10) obj2, (u32) obj)).r(j23Var);
            case 2:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 3:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 4:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 5:
                return ((j) p((m10) obj2, (wd2) obj)).r(j23Var);
            case 6:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 7:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 10:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 11:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 12:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 13:
                return ((j) p((m10) obj2, (oe2) obj)).r(j23Var);
            case 14:
                return ((j) p((m10) obj2, (wd2) obj)).r(j23Var);
            case 15:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            case 17:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((j) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new j((ui1) this.n, (l22) this.o, (jb0) obj2, m10Var, (byte) 0);
            case 1:
                j jVar = new j((qz2) this.o, (sj1) obj2, m10Var, (byte) 1);
                jVar.n = obj;
                return jVar;
            case 2:
                return new j((MealPlannerApp) this.n, (sj1) this.o, (sj1) obj2, m10Var, (byte) 2);
            case 3:
                return new j((so) this.n, (pn1) this.o, (h6) obj2, m10Var, (byte) 3);
            case 4:
                j jVar2 = new j((qk0) this.o, (fs) obj2, m10Var, (byte) 4);
                jVar2.n = obj;
                return jVar2;
            case 5:
                j jVar3 = new j((t70) this.o, (zp0) obj2, m10Var, (byte) 5);
                jVar3.n = obj;
                return jVar3;
            case 6:
                return new j((t70) this.n, (ek1) this.o, (zp0) obj2, m10Var, (byte) 6);
            case 7:
                return new j((Context) this.o, (sj1) obj2, m10Var, (byte) 7);
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                j jVar4 = new j((ui1) this.n, (jk0) obj2, m10Var);
                jVar4.o = obj;
                return jVar4;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                return new j((ui1) this.n, (gz0) this.o, (jb0) obj2, m10Var, (byte) 9);
            case 10:
                return new j(obj2, m10Var, (byte) 10);
            case 11:
                j jVar5 = new j((k72) this.o, (kb) obj2, m10Var, (byte) 11);
                jVar5.n = obj;
                return jVar5;
            case 12:
                j jVar6 = new j((jw) this.o, (zp0) obj2, m10Var, (byte) 12);
                jVar6.n = obj;
                return jVar6;
            case 13:
                j jVar7 = new j((b9) this.o, (qe2) obj2, m10Var, (byte) 13);
                jVar7.n = obj;
                return jVar7;
            case 14:
                j jVar8 = new j((qe2) this.o, (zp0) obj2, m10Var, (byte) 14);
                jVar8.n = obj;
                return jVar8;
            case 15:
                j jVar9 = new j((kn2) this.o, (tb) obj2, m10Var, (byte) 15);
                jVar9.n = obj;
                return jVar9;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return new j((vu2) this.n, (k22) this.o, (z02) obj2, m10Var, (byte) 16);
            case 17:
                return new j(obj2, m10Var, (byte) 17);
            default:
                return new j((MealPlannerApp) this.n, (String) this.o, (t63) obj2, m10Var, (byte) 18);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x028a */
    /* JADX WARN: Code duplicated, block: B:116:0x0252  */
    /* JADX WARN: Code duplicated, block: B:119:0x025c A[Catch: all -> 0x028a, TryCatch #5 {, blocks: (B:109:0x022e, B:117:0x0254, B:119:0x025c, B:120:0x0269, B:127:0x0279, B:114:0x0246, B:129:0x027c, B:132:0x0282, B:133:0x0283, B:113:0x0241, B:121:0x026a, B:123:0x0270), top: B:311:0x0222, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0270 A[Catch: all -> 0x0280, TRY_LEAVE, TryCatch #0 {all -> 0x0280, blocks: (B:121:0x026a, B:123:0x0270), top: B:301:0x026a, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x027c A[Catch: all -> 0x028a, TryCatch #5 {, blocks: (B:109:0x022e, B:117:0x0254, B:119:0x025c, B:120:0x0269, B:127:0x0279, B:114:0x0246, B:129:0x027c, B:132:0x0282, B:133:0x0283, B:113:0x0241, B:121:0x026a, B:123:0x0270), top: B:311:0x0222, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x050c  */
    /* JADX WARN: Code duplicated, block: B:301:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:123:0x0270, B:126:0x0278], limit reached: 354 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v21, types: [ds] */
    /* JADX WARN: Type inference failed for: r2v23, types: [fp] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [ds] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r5v15, types: [ds, v, v32] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0250 -> B:117:0x0254). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.p = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }
}
