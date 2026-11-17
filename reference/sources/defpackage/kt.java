package defpackage;

import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kt {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentB;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (this.a && (viewParentB = b(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = (int[]) this.e;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.e = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentB instanceof gn1) {
                    ((gn1) viewParentB).c(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentB instanceof fn1) {
                        ((fn1) viewParentB).d(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentB.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                            nestedScrollView = nestedScrollView;
                        } catch (AbstractMethodError unused) {
                            nestedScrollView = nestedScrollView;
                            Objects.toString(viewParentB);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent b(int i) {
        if (i == 0) {
            return (ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c(ix0 ix0Var, t6 t6Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        gt0 gt0Var = (gt0) this.c;
        jt0 jt0Var = (jt0) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            ix0 ix0VarB = ((xl1) this.d).B(ix0Var, t6Var);
            tc1 tc1Var = (tc1) ix0VarB.i;
            int iE = tc1Var.e();
            int i3 = 0;
            while (true) {
                if (i3 >= iE) {
                    objArr = true;
                    break;
                }
                z02 z02Var = (z02) tc1Var.f(i3);
                if (z02Var.d || z02Var.h) {
                    objArr = false;
                    break;
                }
                i3++;
            }
            int iE2 = tc1Var.e();
            for (int i4 = 0; i4 < iE2; i4++) {
                z02 z02Var2 = (z02) tc1Var.f(i4);
                if (objArr != false || r02.k(z02Var2)) {
                    ((l41) this.b).A(z02Var2.c, jt0Var, z02Var2.i, true);
                    if (!jt0Var.h.i()) {
                        gt0Var.a(z02Var2.a, jt0Var, r02.k(z02Var2));
                        jt0Var.clear();
                    }
                }
            }
            boolean zB = gt0Var.b(ix0VarB, z);
            int iE3 = tc1Var.e();
            int i5 = 0;
            while (true) {
                if (i5 >= iE3) {
                    i = 0;
                    break;
                }
                z02 z02Var3 = (z02) tc1Var.f(i5);
                if (!up1.b(r02.B(z02Var3, true), 0L) && z02Var3.c()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int iE4 = tc1Var.e();
            for (int i6 = 0; i6 < iE4; i6++) {
                if (((z02) tc1Var.f(i6)).c()) {
                    i2 = 1;
                    return (zB ? 1 : 0) | (i << 1) | (i2 << 2);
                }
            }
            i2 = 0;
            return (zB ? 1 : 0) | (i << 1) | (i2 << 2);
        } finally {
            this.a = false;
        }
    }
}
