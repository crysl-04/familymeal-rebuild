package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zg2 {
    public final l41 a;
    public final eg0 b;
    public final si1 c;
    public final fj1 d = new fj1(2);

    public zg2(l41 l41Var, eg0 eg0Var, si1 si1Var) {
        this.a = l41Var;
        this.b = eg0Var;
        this.c = si1Var;
    }

    public final wg2 a() {
        return new wg2(this.b, false, this.a, new rg2());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    public final void b(l41 l41Var, rg2 rg2Var) {
        p7 p7Var;
        p7 p7Var2;
        String str;
        String str2;
        by2 by2Var;
        by2 by2Var2;
        m8 m8Var;
        m8 m8Var2;
        fj1 fj1Var = this.d;
        Object[] objArr = fj1Var.a;
        int i = fj1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            z5 z5Var = (z5) objArr[i2];
            z5Var.getClass();
            rg2 rg2VarW = l41Var.w();
            int i3 = l41Var.i;
            ix0 ix0Var = z5Var.h;
            t6 t6Var = z5Var.j;
            if (rg2Var != null) {
                Object objG = rg2Var.h.g(ah2.s);
                if (objG == null) {
                    objG = null;
                }
                p7Var = (p7) objG;
            } else {
                p7Var = null;
            }
            if (rg2VarW != null) {
                Object objG2 = rg2VarW.h.g(ah2.s);
                if (objG2 == null) {
                    objG2 = null;
                }
                p7Var2 = (p7) objG2;
            } else {
                p7Var2 = null;
            }
            p7 p7Var3 = c5.I;
            if (!uz0.g(p7Var2, p7Var3)) {
                if (uz0.g(p7Var, p7Var3) && !uz0.g(p7Var2, p7Var3)) {
                    ix0Var.K(t6Var, i3, true);
                }
                if (rg2Var != null) {
                    Object objG3 = rg2Var.h.g(ah2.F);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    od odVar = (od) objG3;
                    if (odVar != null) {
                        str = odVar.i;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (rg2VarW != null) {
                    Object objG4 = rg2VarW.h.g(ah2.F);
                    if (objG4 == null) {
                        objG4 = null;
                    }
                    od odVar2 = (od) objG4;
                    if (odVar2 != null) {
                        str2 = odVar2.i;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        ix0Var.K(t6Var, i3, true);
                    } else if (str2 == null) {
                        ix0Var.K(t6Var, i3, false);
                    } else if (uz0.g(p7Var2, c5.J)) {
                        ix0Var.H().notifyValueChanged(t6Var, i3, AutofillValue.forText(ia2.A(str2)));
                    }
                }
                if (rg2Var != null) {
                    Object objG5 = rg2Var.h.g(ah2.L);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    by2Var = (by2) objG5;
                } else {
                    by2Var = null;
                }
                if (rg2VarW != null) {
                    Object objG6 = rg2VarW.h.g(ah2.L);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    by2Var2 = (by2) objG6;
                } else {
                    by2Var2 = null;
                }
                if (by2Var != by2Var2) {
                    if (by2Var == null) {
                        ix0Var.K(t6Var, i3, true);
                    } else if (by2Var2 == null) {
                        ix0Var.K(t6Var, i3, false);
                    } else if (uz0.g(p7Var2, c5.K)) {
                        int iOrdinal = by2Var2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            ix0Var.H().notifyValueChanged(t6Var, i3, AutofillValue.forToggle(bool.booleanValue()));
                        }
                    }
                }
                if (rg2Var != null) {
                    Object objG7 = rg2Var.h.g(ah2.t);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    m8Var = (m8) objG7;
                } else {
                    m8Var = null;
                }
                if (rg2VarW != null) {
                    Object objG8 = rg2VarW.h.g(ah2.t);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    m8Var2 = (m8) objG8;
                } else {
                    m8Var2 = null;
                }
                if (!uz0.g(m8Var, m8Var2)) {
                    if (m8Var == null) {
                        ix0Var.K(t6Var, i3, true);
                    } else if (m8Var2 == null) {
                        ix0Var.K(t6Var, i3, false);
                    } else {
                        ix0Var.H().notifyValueChanged(t6Var, i3, m8Var2.a);
                    }
                }
            } else if (!uz0.g(p7Var, p7Var3)) {
                ix0Var.K(t6Var, i3, false);
            }
            boolean z = rg2Var != null && rg2Var.h.b(ah2.r);
            boolean z2 = rg2VarW != null && rg2VarW.h.b(ah2.r);
            if (z != z2) {
                ti1 ti1Var = z5Var.o;
                if (z2) {
                    ti1Var.a(i3);
                } else {
                    ti1Var.e(i3);
                }
            }
        }
    }
}
