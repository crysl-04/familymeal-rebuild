package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p30 {
    public final t6 a;
    public final eg b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public vv2 j;
    public jw2 k;
    public xp1 l;
    public r72 n;
    public r72 o;
    public final Object c = new Object();
    public vp0 m = z9.k;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = ke1.a();
    public final Matrix r = new Matrix();

    public p30(t6 t6Var, eg egVar) {
        this.a = t6Var;
        this.b = egVar;
    }

    public final void a() {
        int iF;
        int iE;
        eg egVar = this.b;
        d51 d51Var = (d51) egVar.j;
        InputMethodManager inputMethodManager = (InputMethodManager) d51Var.getValue();
        View view = (View) egVar.i;
        if (inputMethodManager.isActive(view)) {
            vp0 vp0Var = this.m;
            float[] fArr = this.q;
            vp0Var.h(new ke1(fArr));
            this.a.q(fArr);
            Matrix matrix = this.r;
            ia2.u(matrix, fArr);
            vv2 vv2Var = this.j;
            vv2Var.getClass();
            long j = vv2Var.b;
            xp1 xp1Var = this.l;
            xp1Var.getClass();
            jw2 jw2Var = this.k;
            jw2Var.getClass();
            uh1 uh1Var = jw2Var.b;
            r72 r72Var = this.n;
            r72Var.getClass();
            float f = r72Var.d;
            float f2 = r72Var.b;
            r72 r72Var2 = this.o;
            r72Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
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
                boolean zP = lt.p(r72Var, fM, r72VarC.b);
                boolean zP2 = lt.p(r72Var, fM, r72VarC.d);
                boolean z5 = jw2Var.a(iS) == u82Var;
                int i = (zP || zP2) ? 1 : 0;
                if (!zP || !zP2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = r72VarC.b;
                float f4 = r72VarC.d;
                builder.setInsertionMarkerLocation(fM, f3, f4, f4, i);
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
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iE;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iS2;
                        int i5 = (r72Var.a < f7 ? 1 : 0) & (f5 < r72Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!lt.p(r72Var, f5, f6) || !lt.p(r72Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (jw2Var.a(iS4) == u82Var) {
                            i5 |= 4;
                        }
                        int i6 = iF;
                        builder3.addCharacterBounds(i6, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iF = i6 + 1;
                        iE = i3;
                        iS2 = i4;
                    }
                }
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33 && z3) {
                b2.h(builder2, r72Var2);
            }
            if (i7 >= 34 && z4 && !r72Var.f()) {
                int i8 = uh1Var.f - 1;
                if (i8 < 0) {
                    i8 = 0;
                }
                int iN = cy1.n(uh1Var.e(f2), 0, i8);
                int iN2 = cy1.n(uh1Var.e(f), 0, i8);
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
            ((InputMethodManager) d51Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
