package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z5 extends ui implements am0 {
    public final ix0 h;
    public final zg2 i;
    public final t6 j;
    public final s72 k;
    public final String l;
    public final Rect m = new Rect();
    public final AutofillId n;
    public final ti1 o;
    public boolean p;

    public z5(ix0 ix0Var, zg2 zg2Var, t6 t6Var, s72 s72Var, String str) {
        this.h = ix0Var;
        this.i = zg2Var;
        this.j = t6Var;
        this.k = s72Var;
        this.l = str;
        t6Var.setImportantForAutofill(1);
        AutofillId autofillId = t6Var.getAutofillId();
        if (autofillId == null) {
            throw wi0.e("Required value was null.");
        }
        this.n = autofillId;
        this.o = new ti1();
    }

    @Override // defpackage.am0
    public final void d(lm0 lm0Var, lm0 lm0Var2) {
        l41 l41VarY;
        rg2 rg2VarW;
        l41 l41VarY2;
        rg2 rg2VarW2;
        t6 t6Var = this.j;
        ix0 ix0Var = this.h;
        if (lm0Var != null && (l41VarY2 = cu.Y(lm0Var)) != null && (rg2VarW2 = l41VarY2.w()) != null && ie1.n(rg2VarW2)) {
            ix0Var.H().notifyViewExited(t6Var, l41VarY2.i);
        }
        if (lm0Var2 == null || (l41VarY = cu.Y(lm0Var2)) == null || (rg2VarW = l41VarY.w()) == null || !ie1.n(rg2VarW)) {
            return;
        }
        int i = l41VarY.i;
        s72 s72Var = this.k;
        l41 l41Var = (l41) s72Var.a.b(i);
        if (l41Var == null || l41Var.n == -4) {
            return;
        }
        u8 u8Var = s72Var.c;
        int iD = s72Var.d(l41Var);
        long[] jArr = (long[]) u8Var.b;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        ix0Var.H().notifyViewEntered(t6Var, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
