package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c02 extends mq2 implements zp0 {
    public ok1 l;
    public d02 m;
    public long n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ CharSequence q;
    public final /* synthetic */ long r;
    public final /* synthetic */ d02 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c02(CharSequence charSequence, long j, d02 d02Var, m10 m10Var) {
        super(2, m10Var);
        this.q = charSequence;
        this.r = j;
        this.s = d02Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((c02) p((m10) obj2, (TextClassifier) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        c02 c02Var = new c02(this.q, this.r, this.s, m10Var);
        c02Var.p = obj;
        return c02Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        long j;
        ok1 ok1Var;
        ct2 ct2Var;
        d02 d02Var;
        byte b = this.o;
        if (b == 0) {
            m02.y(obj);
            TextClassifier textClassifier = (TextClassifier) this.p;
            long j2 = this.r;
            int iF = qw2.f(j2);
            int iE = qw2.e(j2);
            CharSequence charSequence = this.q;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, iF, iE);
            d02 d02Var2 = this.s;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(d02Var2.c());
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jA = m02.a(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            y20 y20Var = y20.h;
            if (i < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.n = jA;
                this.o = (byte) 2;
                if (this.s.a(this.q, jA, textClassifier, this) != y20Var) {
                    j = jA;
                }
            } else {
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                textClassification.getClass();
                ct2 ct2VarB = d02Var2.b(charSequence, jA, textClassification);
                ok1Var = d02Var2.e;
                this.p = ct2VarB;
                this.l = ok1Var;
                this.m = d02Var2;
                this.n = jA;
                this.o = (byte) 1;
                if (ok1Var.d(this) != y20Var) {
                    ct2Var = ct2VarB;
                    d02Var = d02Var2;
                    j = jA;
                    d02Var.g.setValue(ct2Var);
                }
            }
            return y20Var;
        }
        if (b == 1) {
            j = this.n;
            d02Var = this.m;
            ok1Var = this.l;
            ct2Var = (ct2) this.p;
            m02.y(obj);
            try {
                d02Var.g.setValue(ct2Var);
            } finally {
                ok1Var.f(null);
            }
        } else {
            if (b != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.n;
            m02.y(obj);
        }
        return new qw2(j);
    }
}
