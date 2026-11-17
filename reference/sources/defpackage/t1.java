package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends r1 {
    public static t1 e;
    public static final u82 f = u82.i;
    public static final u82 g = u82.h;
    public jw2 c;
    public wg2 d;

    @Override // defpackage.r1
    public final int[] e(int i) {
        int iE;
        if (i().length() > 0 && i < i().length()) {
            try {
                wg2 wg2Var = this.d;
                if (wg2Var == null) {
                    uz0.A("node");
                    throw null;
                }
                r72 r72VarG = wg2Var.g();
                int iRound = Math.round(r72VarG.d - r72VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                jw2 jw2Var = this.c;
                if (jw2Var == null) {
                    uz0.A("layoutResult");
                    throw null;
                }
                int iD = jw2Var.b.d(i);
                jw2 jw2Var2 = this.c;
                if (jw2Var2 == null) {
                    uz0.A("layoutResult");
                    throw null;
                }
                float f2 = jw2Var2.b.f(iD) + iRound;
                jw2 jw2Var3 = this.c;
                if (jw2Var3 == null) {
                    uz0.A("layoutResult");
                    throw null;
                }
                uh1 uh1Var = jw2Var3.b;
                float f3 = uh1Var.f(uh1Var.f - 1);
                jw2 jw2Var4 = this.c;
                if (f2 < f3) {
                    if (jw2Var4 == null) {
                        uz0.A("layoutResult");
                        throw null;
                    }
                    iE = jw2Var4.b.e(f2);
                } else {
                    if (jw2Var4 == null) {
                        uz0.A("layoutResult");
                        throw null;
                    }
                    iE = jw2Var4.b.f;
                }
                return h(i, m(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.r1
    public final int[] k(int i) {
        int iE;
        if (i().length() > 0 && i > 0) {
            try {
                wg2 wg2Var = this.d;
                if (wg2Var == null) {
                    uz0.A("node");
                    throw null;
                }
                r72 r72VarG = wg2Var.g();
                int iRound = Math.round(r72VarG.d - r72VarG.b);
                int length = i().length();
                if (length <= i) {
                    i = length;
                }
                jw2 jw2Var = this.c;
                if (jw2Var == null) {
                    uz0.A("layoutResult");
                    throw null;
                }
                int iD = jw2Var.b.d(i);
                jw2 jw2Var2 = this.c;
                if (jw2Var2 == null) {
                    uz0.A("layoutResult");
                    throw null;
                }
                float f2 = jw2Var2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    jw2 jw2Var3 = this.c;
                    if (jw2Var3 == null) {
                        uz0.A("layoutResult");
                        throw null;
                    }
                    iE = jw2Var3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == i().length() && iE < iD) {
                    iE++;
                }
                return h(m(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int m(int i, u82 u82Var) {
        jw2 jw2Var = this.c;
        if (jw2Var == null) {
            uz0.A("layoutResult");
            throw null;
        }
        int iF = jw2Var.f(i);
        jw2 jw2Var2 = this.c;
        if (jw2Var2 == null) {
            uz0.A("layoutResult");
            throw null;
        }
        u82 u82VarG = jw2Var2.g(iF);
        jw2 jw2Var3 = this.c;
        if (u82Var != u82VarG) {
            if (jw2Var3 != null) {
                return jw2Var3.f(i);
            }
            uz0.A("layoutResult");
            throw null;
        }
        if (jw2Var3 != null) {
            return jw2Var3.b.c(i, false) - 1;
        }
        uz0.A("layoutResult");
        throw null;
    }
}
