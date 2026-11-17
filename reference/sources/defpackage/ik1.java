package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ik1 extends mq2 implements zp0 {
    public final /* synthetic */ byte l = 1;
    public byte m;
    public Object n;
    public Object o;
    public /* synthetic */ Object p;
    public Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik1(ContentResolver contentResolver, Uri uri, m30 m30Var, fp fpVar, Context context, m10 m10Var) {
        super(2, m10Var);
        this.p = contentResolver;
        this.q = uri;
        this.r = m30Var;
        this.s = fpVar;
        this.t = context;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((ik1) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((ik1) p((m10) obj2, (qk0) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.t;
        Object obj3 = this.s;
        Object obj4 = this.r;
        switch (b) {
            case 0:
                ik1 ik1Var = new ik1((ek1) obj3, (lk1) obj4, (vp0) obj2, m10Var);
                ik1Var.p = obj;
                return ik1Var;
            default:
                ik1 ik1Var2 = new ik1((ContentResolver) this.p, (Uri) this.q, (m30) obj4, (fp) obj3, (Context) obj2, m10Var);
                ik1Var2.n = obj;
                return ik1Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #3 {all -> 0x0099, blocks: (B:9:0x0028, B:17:0x0053, B:20:0x0063, B:22:0x006b, B:13:0x0039, B:16:0x004c), top: B:69:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ok1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008e -> B:24:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rk
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik1.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik1(ek1 ek1Var, lk1 lk1Var, vp0 vp0Var, m10 m10Var) {
        super(2, m10Var);
        this.s = ek1Var;
        this.r = lk1Var;
        this.t = vp0Var;
    }
}
