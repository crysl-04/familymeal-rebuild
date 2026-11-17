package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d02 {
    public final o20 a;
    public final Context b;
    public final zf2 c;
    public final ub1 d;
    public TextClassifier f;
    public final ok1 e = new ok1();
    public final lu1 g = rz1.x(null);
    public final Object h = new Object();

    public d02(o20 o20Var, Context context, zf2 zf2Var, ub1 ub1Var) {
        this.a = o20Var;
        this.b = context;
        this.c = zf2Var;
        this.d = ub1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(CharSequence charSequence, long j, TextClassifier textClassifier, n10 n10Var) throws Throwable {
        a02 a02Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        ok1 ok1Var;
        Object obj;
        Object obj2;
        ct2 ct2VarB;
        Object obj3;
        if (n10Var instanceof a02) {
            a02Var = (a02) n10Var;
            int i = a02Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                a02Var.q = i - Integer.MIN_VALUE;
            } else {
                a02Var = new a02(this, n10Var);
            }
        } else {
            a02Var = new a02(this, n10Var);
        }
        Object obj4 = a02Var.o;
        int i2 = a02Var.q;
        lu1 lu1Var = this.g;
        j23 j23Var = j23.a;
        ok1 ok1Var2 = this.e;
        y20 y20Var = y20.h;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        j2 = a02Var.n;
                        ok1Var = a02Var.m;
                        textClassifier2 = (TextClassifier) a02Var.l;
                        charSequence2 = (CharSequence) a02Var.k;
                        m02.y(obj4);
                    } else {
                        if (i2 != 2) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ok1Var2 = (ok1) a02Var.l;
                        ct2VarB = (ct2) a02Var.k;
                        m02.y(obj4);
                        obj3 = null;
                    }
                    lu1Var.setValue(ct2VarB);
                    return j23Var;
                }
                m02.y(obj4);
                a02Var.k = charSequence;
                a02Var.l = textClassifier;
                a02Var.m = ok1Var2;
                j2 = j;
                a02Var.n = j2;
                a02Var.q = 1;
                if (ok1Var2.d(a02Var) == y20Var) {
                    return y20Var;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                ok1Var = ok1Var2;
                lu1Var.setValue(ct2VarB);
                return j23Var;
            } finally {
                ok1Var2.f(obj3);
            }
            ct2 ct2Var = (ct2) lu1Var.getValue();
            if (ct2Var != null) {
                try {
                    if (qw2.b(j2, ct2Var.b) && uz0.g(charSequence2, ct2Var.a)) {
                        ok1Var.f(null);
                        return j23Var;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    ok1Var.f(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            ok1Var.f(obj2);
            ct2VarB = b(charSequence2, j2, textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, qw2.f(j2), qw2.e(j2)).setDefaultLocales(c()).build()));
            a02Var.k = ct2VarB;
            a02Var.l = ok1Var2;
            obj3 = null;
            a02Var.m = null;
            a02Var.q = 2;
            if (ok1Var2.d(a02Var) == y20Var) {
                return y20Var;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final ct2 b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction remoteAction2 = remoteAction;
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteAction2.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction remoteAction3 = remoteAction;
            if (remoteAction3 != null && (icon = remoteAction3.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new ct2(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList c() {
        ub1 ub1Var = this.d;
        if (ub1Var == null) {
            return new LocaleList(((tb1) uz1.a.i().h.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(ev.o0(ub1Var, 10));
        Iterator it = ub1Var.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((tb1) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
