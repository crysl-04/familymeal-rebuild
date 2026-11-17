package defpackage;

import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class if2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l = 2;
    public Object m;
    public byte n;
    public Object o;
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if2(MealPlannerApp mealPlannerApp, String str, sj1 sj1Var, sj1 sj1Var2, m10 m10Var) {
        super(2, m10Var);
        this.p = mealPlannerApp;
        this.q = str;
        this.m = sj1Var;
        this.r = sj1Var2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((if2) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                ((if2) p((m10) obj2, (qk0) obj)).r(j23Var);
                return y20.h;
            default:
                return ((if2) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                return new if2((pf2) this.q, this.m, (qz2) obj2, m10Var);
            case 1:
                if2 if2Var = new if2((kp0) obj2, m10Var);
                if2Var.q = obj;
                return if2Var;
            default:
                return new if2((MealPlannerApp) this.p, (String) this.q, (sj1) this.m, (sj1) obj2, m10Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:103:0x024f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:106:0x025a  */
    /* JADX WARN: Code duplicated, block: B:108:0x026a  */
    /* JADX WARN: Code duplicated, block: B:109:0x026c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0278  */
    /* JADX WARN: Code duplicated, block: B:116:0x0283  */
    /* JADX WARN: Code duplicated, block: B:118:0x028b  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d0 A[PHI: r6 r25
  0x02d0: PHI (r6v5 pf2) = (r6v4 pf2), (r6v11 pf2) binds: [B:123:0x02ce, B:67:0x0188] A[DONT_GENERATE, DONT_INLINE]
  0x02d0: PHI (r25v3 float) = (r25v1 float), (r25v4 float) binds: [B:123:0x02ce, B:67:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0130 A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #0 {all -> 0x0143, blocks: (B:33:0x00d1, B:43:0x0126, B:41:0x0116, B:45:0x0130, B:36:0x00e3, B:39:0x0102), top: B:131:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x0212  */
    /* JADX WARN: Code duplicated, block: B:91:0x021d A[PHI: r6
  0x021d: PHI (r6v4 pf2) = (r6v2 pf2), (r6v3 pf2), (r6v10 pf2) binds: [B:79:0x01ed, B:90:0x021b, B:68:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0235  */
    /* JADX WARN: Code duplicated, block: B:97:0x0239  */
    /* JADX WARN: Code duplicated, block: B:99:0x0242  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [j23, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3, types: [xl1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, xl1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x012e -> B:41:0x0116). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0141 -> B:41:0x0116). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:26:0x00b1
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if2.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if2(pf2 pf2Var, Object obj, qz2 qz2Var, m10 m10Var) {
        super(2, m10Var);
        this.q = pf2Var;
        this.m = obj;
        this.r = qz2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if2(kp0 kp0Var, m10 m10Var) {
        super(2, m10Var);
        this.r = kp0Var;
    }
}
