package defpackage;

import android.view.textclassifier.TextClassifier;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b02 extends mq2 implements zp0 {
    public final /* synthetic */ byte l = 0;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Serializable q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b02(d02 d02Var, String str, long j, m10 m10Var) {
        super(2, m10Var);
        this.p = d02Var;
        this.q = str;
        this.o = j;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((b02) p((m10) obj2, (TextClassifier) obj)).r(j23Var);
            default:
                return ((b02) p((m10) obj2, (oe2) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Serializable serializable = this.q;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                b02 b02Var = new b02((d02) obj2, (String) serializable, this.o, m10Var);
                b02Var.n = obj;
                return b02Var;
            default:
                b02 b02Var2 = new b02((qe2) obj2, this.o, (u72) serializable, m10Var);
                b02Var2.n = obj;
                return b02Var2;
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        j23 j23Var = j23.a;
        Serializable serializable = this.q;
        y20 y20Var = y20.h;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    TextClassifier textClassifier = (TextClassifier) this.n;
                    this.m = true;
                    return ((d02) obj2).a((String) serializable, this.o, textClassifier, this) == y20Var ? y20Var : j23Var;
                }
                if (z) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                qe2 qe2Var = (qe2) obj2;
                boolean z2 = this.m;
                if (z2) {
                    if (z2) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                oe2 oe2Var = (oe2) this.n;
                float fH = qe2Var.h(this.o);
                s62 s62Var = new s62(serializable, (Object) qe2Var, (Object) oe2Var, (byte) 13);
                this.m = true;
                return cy1.e(0.0f, fH, null, s62Var, this, 12) == y20Var ? y20Var : j23Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b02(qe2 qe2Var, long j, u72 u72Var, m10 m10Var) {
        super(2, m10Var);
        this.p = qe2Var;
        this.o = j;
        this.q = u72Var;
    }
}
