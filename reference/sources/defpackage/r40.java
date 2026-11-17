package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r40 {
    public final qy0 a;
    public final vf2 b;
    public final k40 c;
    public final y40 d;
    public final String e;
    public final String f;
    public final String g;

    public r40(qy0 qy0Var, vf2 vf2Var, k40 k40Var, y40 y40Var, String str, String str2, String str3) {
        this.a = qy0Var;
        this.b = vf2Var;
        this.c = k40Var;
        this.d = y40Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final String a(dq dqVar, Locale locale) {
        if (dqVar == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.e, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        int i = dqVar.h;
        long j = dqVar.k;
        qy0 qy0Var = this.a;
        if (!qy0Var.c(i)) {
            Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{fq.a(qy0Var.h, locale), fq.a(qy0Var.i, locale)}, 2);
            return String.format(this.f, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
        vf2 vf2Var = this.b;
        if (vf2Var.a(i) && vf2Var.b(j)) {
            return "";
        }
        Object[] objArrCopyOf3 = Arrays.copyOf(new Object[]{this.d.a(Long.valueOf(j), locale, false)}, 1);
        return String.format(this.g, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
    }
}
