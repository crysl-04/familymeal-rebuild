package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l81 {
    public final z8 a;
    public final ix0 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public vv2 j;
    public jw2 k;
    public xp1 l;
    public r72 m;
    public r72 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = ke1.a();
    public final Matrix q = new Matrix();

    public l81(z8 z8Var, ix0 ix0Var) {
        this.a = z8Var;
        this.b = ix0Var;
    }

    public final void a() {
        int iF;
        int iE;
        ix0 ix0Var = this.b;
        InputMethodManager inputMethodManagerF = ix0Var.F();
        View view = (View) ix0Var.i;
        if (!inputMethodManagerF.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        ke1.d(fArr);
        t31 t31Var = (t31) this.a.o.y.getValue();
        if (t31Var != null) {
            if (!t31Var.C()) {
                t31Var = null;
            }
            if (t31Var != null) {
                t31Var.E(fArr);
            }
        }
        r72 r72Var = this.n;
        r72Var.getClass();
        float f = -r72Var.a;
        r72 r72Var2 = this.n;
        r72Var2.getClass();
        ke1.f(fArr, f, -r72Var2.b);
        Matrix matrix = this.q;
        ia2.u(matrix, fArr);
        vv2 vv2Var = this.j;
        vv2Var.getClass();
        long j = vv2Var.b;
        xp1 xp1Var = this.l;
        xp1Var.getClass();
        jw2 jw2Var = this.k;
        jw2Var.getClass();
        uh1 uh1Var = jw2Var.b;
        r72 r72Var3 = this.m;
        r72Var3.getClass();
        float f2 = r72Var3.d;
        float f3 = r72Var3.b;
        r72 r72Var4 = this.n;
        r72Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        qw2 qw2Var = vv2Var.c;
        int iF2 = qw2.f(j);
        builder.setSelectionRange(iF2, qw2.e(j));
        u82 u82Var = u82.i;
        if (z && iF2 >= 0) {
            int iS = xp1Var.s(iF2);
            r72 r72VarC = jw2Var.c(iS);
            float fM = cy1.m(r72VarC.a, 0.0f, (int) (jw2Var.c >> 32));
            boolean zR = ou.r(r72Var3, fM, r72VarC.b);
            boolean zR2 = ou.r(r72Var3, fM, r72VarC.d);
            boolean z5 = jw2Var.a(iS) == u82Var;
            int i = (zR || zR2) ? 1 : 0;
            if (!zR || !zR2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f4 = r72VarC.b;
            float f5 = r72VarC.d;
            builder.setInsertionMarkerLocation(fM, f4, f5, f5, i);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z2) {
            if (qw2Var != null) {
                long j2 = qw2Var.a;
                iF = qw2.f(j2);
                iE = qw2.e(j2);
            } else {
                iF = -1;
                iE = -1;
            }
            if (iF >= 0 && iF < iE) {
                builder2.setComposingText(iF, vv2Var.a.i.subSequence(iF, iE));
                int iS2 = xp1Var.s(iF);
                int iS3 = xp1Var.s(iE);
                float[] fArr2 = new float[(iS3 - iS2) << 2];
                uh1Var.a(m02.a(iS2, iS3), fArr2);
                while (iF < iE) {
                    int iS4 = xp1Var.s(iF);
                    int i2 = (iS4 - iS2) << 2;
                    float f6 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f7 = fArr2[i2 + 1];
                    int i3 = iS2;
                    float f8 = fArr2[i2 + 2];
                    float f9 = fArr2[i2 + 3];
                    int i4 = iE;
                    int i5 = (r72Var3.a < f8 ? 1 : 0) & (f6 < r72Var3.c ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!ou.r(r72Var3, f6, f7) || !ou.r(r72Var3, f8, f9)) {
                        i5 |= 2;
                    }
                    if (jw2Var.a(iS4) == u82Var) {
                        i5 |= 4;
                    }
                    int i6 = iF;
                    builder3.addCharacterBounds(i6, f6, f7, f8, f9, i5);
                    builder2 = builder3;
                    iF = i6 + 1;
                    iS2 = i3;
                    iE = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            b2.i(builder2, r72Var4);
        }
        if (i7 >= 34 && z4 && !r72Var3.f()) {
            int i8 = uh1Var.f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iN = cy1.n(uh1Var.e(f3), 0, i8);
            int iN2 = cy1.n(uh1Var.e(f2), 0, i8);
            if (iN <= iN2) {
                while (true) {
                    builder2.addVisibleLineBounds(jw2Var.d(iN), uh1Var.f(iN), jw2Var.e(iN), uh1Var.b(iN));
                    if (iN == iN2) {
                        break;
                    } else {
                        iN++;
                    }
                }
            }
        }
        ix0Var.F().updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}
