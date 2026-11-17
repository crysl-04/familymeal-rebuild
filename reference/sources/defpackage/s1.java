package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends r1 {
    public static s1 e;
    public static s1 f;
    public static s1 g;
    public static final u82 h = u82.i;
    public static final u82 i = u82.h;
    public final /* synthetic */ byte c;
    public Object d;

    @Override // defpackage.r1
    public final int[] e(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        uz0.A("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            uz0.A("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing != -1) {
                            return h(i2, iFollowing);
                        }
                        return null;
                    }
                    if (breakIterator2 == null) {
                        uz0.A("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!p(i2) && (!p(i2) || (i2 != 0 && p(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        uz0.A("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    uz0.A("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !o(iFollowing2)) {
                    return null;
                }
                return h(i2, iFollowing2);
            default:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                jw2 jw2Var = (jw2) this.d;
                u82 u82Var = h;
                if (i2 < 0) {
                    if (jw2Var == null) {
                        uz0.A("layoutResult");
                        throw null;
                    }
                    iD = jw2Var.b.d(0);
                } else {
                    if (jw2Var == null) {
                        uz0.A("layoutResult");
                        throw null;
                    }
                    int iD2 = jw2Var.b.d(i2);
                    iD = m(iD2, u82Var) == i2 ? iD2 : iD2 + 1;
                }
                jw2 jw2Var2 = (jw2) this.d;
                if (jw2Var2 == null) {
                    uz0.A("layoutResult");
                    throw null;
                }
                if (iD < jw2Var2.b.f) {
                    return h(m(iD, u82Var), m(iD, i) + 1);
                }
                return null;
        }
    }

    @Override // defpackage.r1
    public final int[] k(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        uz0.A("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            uz0.A("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding != -1) {
                            return h(iPreceding, i2);
                        }
                        return null;
                    }
                    if (breakIterator2 == null) {
                        uz0.A("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = i().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !p(i2 - 1) && !o(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        uz0.A("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    uz0.A("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !p(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !p(iPreceding2 - 1)) {
                    return h(iPreceding2, i2);
                }
                return null;
            default:
                if (i().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = i().length();
                jw2 jw2Var = (jw2) this.d;
                u82 u82Var = i;
                if (i2 > length3) {
                    if (jw2Var == null) {
                        uz0.A("layoutResult");
                        throw null;
                    }
                    iD = jw2Var.b.d(i().length());
                } else {
                    if (jw2Var == null) {
                        uz0.A("layoutResult");
                        throw null;
                    }
                    int iD2 = jw2Var.b.d(i2);
                    iD = m(iD2, u82Var) + 1 == i2 ? iD2 : iD2 - 1;
                }
                if (iD >= 0) {
                    return h(m(iD, h), m(iD, u82Var) + 1);
                }
                return null;
        }
    }

    public final int m(int i2, u82 u82Var) {
        jw2 jw2Var = (jw2) this.d;
        if (jw2Var == null) {
            uz0.A("layoutResult");
            throw null;
        }
        int iF = jw2Var.f(i2);
        jw2 jw2Var2 = (jw2) this.d;
        if (jw2Var2 == null) {
            uz0.A("layoutResult");
            throw null;
        }
        u82 u82VarG = jw2Var2.g(iF);
        jw2 jw2Var3 = (jw2) this.d;
        if (u82Var != u82VarG) {
            if (jw2Var3 != null) {
                return jw2Var3.f(i2);
            }
            uz0.A("layoutResult");
            throw null;
        }
        if (jw2Var3 != null) {
            return jw2Var3.b.c(i2, false) - 1;
        }
        uz0.A("layoutResult");
        throw null;
    }

    public final void n(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    uz0.A("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    uz0.A("impl");
                    throw null;
                }
        }
    }

    public final boolean o(int i2) {
        if (i2 <= 0 || !p(i2 - 1)) {
            return false;
        }
        return i2 == i().length() || !p(i2);
    }

    public final boolean p(int i2) {
        if (i2 < 0 || i2 >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i2));
    }
}
