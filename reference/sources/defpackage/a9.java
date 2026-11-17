package defpackage;

import android.content.Context;
import com.familymeal.app.MealPlannerApp;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a9 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
        this.r = obj5;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                ((a9) p((m10) obj2, (x20) obj)).r(j23Var);
                return y20.h;
            case 1:
                return ((a9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 2:
                return ((a9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 3:
                return ((a9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 4:
                return ((a9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 5:
                return ((a9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 6:
                return ((a9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 7:
                return ((a9) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((a9) p((m10) obj2, (oe2) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (b) {
            case 0:
                a9 a9Var = new a9((r9) this.o, (u3) obj4, (c9) obj3, (k81) obj2, m10Var, (byte) 0);
                a9Var.n = obj;
                return a9Var;
            case 1:
                return new a9((Context) this.n, (MealPlannerApp) this.o, (sj1) obj4, (sj1) obj3, (sj1) obj2, m10Var, (byte) 1);
            case 2:
                return new a9((p81) this.n, (sj1) this.o, (aw2) obj4, (kv2) obj3, (nu0) obj2, m10Var, (byte) 2);
            case 3:
                return new a9((oo) this.n, (vv2) this.o, (p81) obj4, (kw2) obj3, (xp1) obj2, m10Var, (byte) 3);
            case 4:
                return new a9((Context) this.o, (sj1) obj4, (sj1) obj3, (sj1) obj2, m10Var, (byte) 4);
            case 5:
                a9 a9Var2 = new a9((l72) obj4, (k72) obj3, (kb) obj2, m10Var, (byte) 5);
                a9Var2.n = obj;
                return a9Var2;
            case 6:
                return new a9((MealPlannerApp) this.n, (p60) this.o, (te1) obj4, (String) obj3, (Set) obj2, m10Var, (byte) 6);
            case 7:
                a9 a9Var3 = new a9((d12) this.o, (vu2) obj4, (cb) obj3, (k22) obj2, m10Var, (byte) 7);
                a9Var3.n = obj;
                return a9Var3;
            default:
                a9 a9Var4 = new a9((zy2) obj4, (qe2) obj3, (x72) obj2, m10Var, (byte) 8);
                a9Var4.n = obj;
                return a9Var4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0302  */
    /* JADX WARN: Code duplicated, block: B:12:0x0068  */
    /* JADX WARN: Code duplicated, block: B:14:0x007d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0080  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:254:0x02b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:93:0x02bd A[Catch: all -> 0x0335, TryCatch #4 {all -> 0x0335, blocks: (B:57:0x01e1, B:87:0x02aa, B:88:0x02b0, B:90:0x02b5, B:91:0x02b6, B:93:0x02bd, B:95:0x02cb, B:97:0x02d1, B:100:0x02d7, B:102:0x02db, B:103:0x02df, B:104:0x02e2, B:105:0x02e5, B:123:0x0333, B:124:0x0334, B:89:0x02b1), top: B:260:0x01d2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02cb A[Catch: all -> 0x0335, TryCatch #4 {all -> 0x0335, blocks: (B:57:0x01e1, B:87:0x02aa, B:88:0x02b0, B:90:0x02b5, B:91:0x02b6, B:93:0x02bd, B:95:0x02cb, B:97:0x02d1, B:100:0x02d7, B:102:0x02db, B:103:0x02df, B:104:0x02e2, B:105:0x02e5, B:123:0x0333, B:124:0x0334, B:89:0x02b1), top: B:260:0x01d2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02d1 A[Catch: all -> 0x0335, TryCatch #4 {all -> 0x0335, blocks: (B:57:0x01e1, B:87:0x02aa, B:88:0x02b0, B:90:0x02b5, B:91:0x02b6, B:93:0x02bd, B:95:0x02cb, B:97:0x02d1, B:100:0x02d7, B:102:0x02db, B:103:0x02df, B:104:0x02e2, B:105:0x02e5, B:123:0x0333, B:124:0x0334, B:89:0x02b1), top: B:260:0x01d2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, v3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:16:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a9.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9(Object obj, Object obj2, Object obj3, Object obj4, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9(Object obj, Object obj2, Object obj3, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
    }
}
