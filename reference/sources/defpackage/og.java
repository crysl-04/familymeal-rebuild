package defpackage;

import com.familymeal.app.MealPlannerApp;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class og extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public byte m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        x20 x20Var = (x20) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                return ((og) p(m10Var, x20Var)).r(j23Var);
            case 1:
                ((og) p(m10Var, x20Var)).r(j23Var);
                return y20.h;
            default:
                return ((og) p(m10Var, x20Var)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new og((MealPlannerApp) obj2, m10Var, (byte) 0);
            case 1:
                return new og((md1) obj2, m10Var, (byte) 1);
            default:
                return new og((tq2) obj2, m10Var, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005a -> B:22:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0077 -> B:32:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.r(java.lang.Object):java.lang.Object");
    }
}
