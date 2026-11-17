package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tu2 {
    public final od a;
    public final long b;
    public final jw2 c;
    public final xp1 d;
    public final pw2 e;
    public long f;
    public final od g;
    public final vv2 h;
    public final kw2 i;

    public tu2(vv2 vv2Var, xp1 xp1Var, kw2 kw2Var, pw2 pw2Var) {
        od odVar = vv2Var.a;
        long j = vv2Var.b;
        jw2 jw2Var = kw2Var != null ? kw2Var.a : null;
        this.a = odVar;
        this.b = j;
        this.c = jw2Var;
        this.d = xp1Var;
        this.e = pw2Var;
        this.f = j;
        this.g = odVar;
        this.h = vv2Var;
        this.i = kw2Var;
    }

    public final List a(vp0 vp0Var) {
        if (!qw2.c(this.f)) {
            return lt.Q(new fw("", 0), new bi2(qw2.f(this.f), qw2.f(this.f)));
        }
        we0 we0Var = (we0) vp0Var.h(this);
        if (we0Var != null) {
            return lt.P(we0Var);
        }
        return null;
    }

    public final Integer b() {
        jw2 jw2Var = this.c;
        if (jw2Var == null) {
            return null;
        }
        uh1 uh1Var = jw2Var.b;
        int iE = qw2.e(this.f);
        xp1 xp1Var = this.d;
        return Integer.valueOf(xp1Var.n(uh1Var.c(uh1Var.d(xp1Var.s(iE)), true)));
    }

    public final Integer c() {
        jw2 jw2Var = this.c;
        if (jw2Var == null) {
            return null;
        }
        int iF = qw2.f(this.f);
        xp1 xp1Var = this.d;
        return Integer.valueOf(xp1Var.n(jw2Var.f(jw2Var.b.d(xp1Var.s(iF)))));
    }

    public final Integer d() {
        int length;
        jw2 jw2Var = this.c;
        if (jw2Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            od odVar = this.a;
            if (iR < odVar.i.length()) {
                int length2 = this.g.i.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jI = jw2Var.i(length2);
                int i = qw2.c;
                int i2 = (int) (jI & 4294967295L);
                if (i2 > iR) {
                    length = this.d.n(i2);
                    break;
                }
                iR++;
            } else {
                length = odVar.i.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iN;
        jw2 jw2Var = this.c;
        if (jw2Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.g.i.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jI = jw2Var.i(length);
            int i = qw2.c;
            int i2 = (int) (jI >> 32);
            if (i2 < iR) {
                iN = this.d.n(i2);
                return Integer.valueOf(iN);
            }
        }
        iN = 0;
        return Integer.valueOf(iN);
    }

    public final boolean f() {
        jw2 jw2Var = this.c;
        return (jw2Var != null ? jw2Var.g(r()) : null) != u82.i;
    }

    public final int g(jw2 jw2Var, int i) {
        int iR = r();
        pw2 pw2Var = this.e;
        if (pw2Var.a == null) {
            pw2Var.a = Float.valueOf(jw2Var.c(iR).a);
        }
        uh1 uh1Var = jw2Var.b;
        int iD = uh1Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= uh1Var.f) {
            return this.g.i.length();
        }
        float fB = uh1Var.b(iD) - 1.0f;
        Float f = pw2Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= jw2Var.e(iD)) || (!f() && fFloatValue <= jw2Var.d(iD))) {
            return uh1Var.c(iD, true);
        }
        return this.d.n(uh1Var.g((((long) Float.floatToRawIntBits(f.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(kw2 kw2Var, int i) {
        r72 r72VarM;
        t31 t31Var = kw2Var.b;
        jw2 jw2Var = kw2Var.a;
        if (t31Var == null) {
            r72VarM = r72.e;
        } else {
            t31 t31Var2 = kw2Var.c;
            r72VarM = t31Var2 != null ? t31Var2.M(t31Var, true) : null;
            if (r72VarM == null) {
                r72VarM = r72.e;
            }
        }
        long j = this.h.b;
        int i2 = qw2.c;
        xp1 xp1Var = this.d;
        r72 r72VarC = jw2Var.c(xp1Var.s((int) (j & 4294967295L)));
        return xp1Var.n(jw2Var.b.g((((long) Float.floatToRawIntBits(r72VarC.a)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (r72VarM.c() & 4294967295L)) * i) + r72VarC.b)) & 4294967295L)));
    }

    public final void i() {
        pw2 pw2Var = this.e;
        pw2Var.a = null;
        od odVar = this.g;
        if (odVar.i.length() > 0) {
            if (f()) {
                k();
                return;
            }
            pw2Var.a = null;
            if (odVar.i.length() > 0) {
                String str = odVar.i;
                long j = this.f;
                int i = qw2.c;
                int iW = p02.w((int) (j & 4294967295L), str);
                if (iW != -1) {
                    q(iW, iW);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        od odVar = this.g;
        String str = odVar.i;
        String str2 = odVar.i;
        if (str.length() > 0) {
            int iG = m02.g(qw2.e(this.f), str2);
            if (iG == qw2.e(this.f) && iG != str2.length()) {
                iG = m02.g(iG + 1, str2);
            }
            q(iG, iG);
        }
    }

    public final void k() {
        this.e.a = null;
        od odVar = this.g;
        if (odVar.i.length() > 0) {
            String str = odVar.i;
            long j = this.f;
            int i = qw2.c;
            int iX = p02.x((int) (j & 4294967295L), str);
            if (iX != -1) {
                q(iX, iX);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        od odVar = this.g;
        String str = odVar.i;
        String str2 = odVar.i;
        if (str.length() > 0) {
            int iH = m02.h(qw2.f(this.f), str2);
            if (iH == qw2.f(this.f) && iH != 0) {
                iH = m02.h(iH - 1, str2);
            }
            q(iH, iH);
        }
    }

    public final void m() {
        pw2 pw2Var = this.e;
        pw2Var.a = null;
        od odVar = this.g;
        if (odVar.i.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            pw2Var.a = null;
            if (odVar.i.length() > 0) {
                String str = odVar.i;
                long j = this.f;
                int i = qw2.c;
                int iW = p02.w((int) (j & 4294967295L), str);
                if (iW != -1) {
                    q(iW, iW);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.i.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.i.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.i.length() > 0) {
            int i = qw2.c;
            this.f = m02.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = m02.a(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = qw2.c;
        return this.d.s((int) (j & 4294967295L));
    }
}
