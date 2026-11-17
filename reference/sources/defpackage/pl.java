package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pl extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.m = obj;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                ((pl) p((m10) obj2, (x20) obj)).r(j23Var);
                return j23Var;
            case 1:
                ((pl) p((m10) obj2, (qk0) obj)).r(j23Var);
                return j23Var;
            case 2:
                return ((pl) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                ((pl) p((m10) obj2, (x20) obj)).r(j23Var);
                return j23Var;
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new pl((ry2) obj2, m10Var, (byte) 0);
            case 1:
                return new pl((f01) obj2, m10Var, (byte) 1);
            case 2:
                return new pl((d02) obj2, m10Var, (byte) 2);
            default:
                return new pl((kp0) obj2, m10Var, (byte) 3);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        String str;
        byte b = this.l;
        j23 j23Var = j23.a;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                m02.y(obj);
                ((ry2) obj2).a();
                return j23Var;
            case 1:
                m02.y(obj);
                ((f01) obj2).e.incrementAndGet();
                return j23Var;
            case 2:
                m02.y(obj);
                d02 d02Var = (d02) obj2;
                Context context = d02Var.b;
                zf2 zf2Var = d02Var.c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = zf2Var.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        wg.n();
                        return null;
                    }
                    str = "textview";
                }
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
                d02Var.f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            default:
                m02.y(obj);
                ((kp0) obj2).a();
                return j23Var;
        }
    }
}
