package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uh1 {
    public final wk a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public uh1(wk wkVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iH;
        int i5;
        this.a = wkVar;
        this.b = i;
        if (k00.k(j) != 0 || k00.j(j) != 0) {
            bx0.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) wkVar.l;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            zt1 zt1Var = (zt1) arrayList2.get(i6);
            k9 k9Var = zt1Var.a;
            int i8 = k00.i(j);
            if (k00.d(j)) {
                i4 = i6;
                iH = k00.h(j) - ((int) Math.ceil(f));
                if (iH < 0) {
                    iH = 0;
                }
            } else {
                i4 = i6;
                iH = k00.h(j);
            }
            i3 = 0;
            g9 g9Var = new g9(k9Var, this.b - i7, i2, l00.b(0, i8, 0, iH, 5));
            float f2 = g9Var.f + f;
            hw2 hw2Var = g9Var.d;
            int i9 = i7 + hw2Var.g;
            arrayList.add(new yt1(g9Var, zt1Var.b, zt1Var.c, i7, i9, f, f2));
            if (!hw2Var.d) {
                if (i9 == this.b) {
                    i5 = i4;
                    if (i5 != lt.H((ArrayList) this.a.l)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i9;
                f = f2;
            }
            z = true;
            i7 = i9;
            f = f2;
            break;
        }
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = k00.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            yt1 yt1Var = (yt1) arrayList.get(i10);
            List list = yt1Var.a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = i3; i11 < size3; i11++) {
                r72 r72Var = (r72) list.get(i11);
                arrayList4.add(r72Var != null ? r72Var.i(((long) Float.floatToRawIntBits(yt1Var.f)) & 4294967295L) : null);
            }
            iv.q0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.j).size()) {
            int size4 = ((List) this.a.j).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = dv.I0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(uh1 uh1Var, wq wqVar, zo zoVar, float f, ei2 ei2Var, vt2 vt2Var, ud0 ud0Var) {
        wqVar.l();
        ArrayList arrayList = uh1Var.h;
        if (arrayList.size() <= 1 || (zoVar instanceof rl2)) {
            t03.u(uh1Var, wqVar, zoVar, f, ei2Var, vt2Var, ud0Var);
        } else {
            if (!(zoVar instanceof ap)) {
                wg.n();
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                g9 g9Var = ((yt1) arrayList.get(i)).a;
            }
            Shader shader = ((ap) zoVar).c;
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                g9 g9Var2 = ((yt1) arrayList.get(i2)).a;
                g9Var2.f(wqVar, new ap(shader), f, ei2Var, vt2Var, ud0Var);
                wqVar.g(0.0f, g9Var2.f);
                matrix.setTranslate(0.0f, -g9Var2.f);
                shader.setLocalMatrix(matrix);
            }
        }
        wqVar.i();
    }

    public final void a(long j, float[] fArr) {
        j(qw2.f(j));
        k(qw2.e(j));
        v72 v72Var = new v72();
        v72Var.h = 0;
        ys.z(this.h, j, new wn(j, fArr, v72Var, new u72()));
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        yt1 yt1Var = (yt1) arrayList.get(ys.x(i, arrayList));
        g9 g9Var = yt1Var.a;
        return g9Var.d.e(i - yt1Var.d) + yt1Var.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        l(i);
        ArrayList arrayList = this.h;
        yt1 yt1Var = (yt1) arrayList.get(ys.x(i, arrayList));
        g9 g9Var = yt1Var.a;
        int i2 = i - yt1Var.d;
        hw2 hw2Var = g9Var.d;
        if (z) {
            Layout layout = hw2Var.f;
            ThreadLocal threadLocal = lw2.a;
            if (layout.getEllipsisCount(i2) <= 0 || hw2Var.b != TextUtils.TruncateAt.END) {
                bj bjVarC = hw2Var.c();
                Layout layout2 = (Layout) bjVarC.a;
                iF = bjVarC.h(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = hw2Var.f(i2);
        }
        return iF + yt1Var.b;
    }

    public final int d(int i) {
        int iW;
        int length = ((od) this.a.i).i.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iW = arrayList.size() - 1;
        } else {
            iW = i < 0 ? 0 : ys.w(i, arrayList);
        }
        yt1 yt1Var = (yt1) arrayList.get(iW);
        return yt1Var.a.d.g(yt1Var.b(i)) + yt1Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        yt1 yt1Var = (yt1) arrayList.get(ys.y(arrayList, f));
        int i = yt1Var.c - yt1Var.b;
        int i2 = yt1Var.d;
        if (i == 0) {
            return i2;
        }
        g9 g9Var = yt1Var.a;
        float f2 = f - yt1Var.f;
        hw2 hw2Var = g9Var.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = hw2Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = hw2Var.f.getLineForVertical(i3 - hw2Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        yt1 yt1Var = (yt1) arrayList.get(ys.x(i, arrayList));
        g9 g9Var = yt1Var.a;
        return g9Var.d.i(i - yt1Var.d) + yt1Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        yt1 yt1Var = (yt1) arrayList.get(ys.y(arrayList, fIntBitsToFloat));
        int i2 = yt1Var.c;
        int i3 = yt1Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        g9 g9Var = yt1Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - yt1Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        hw2 hw2Var = g9Var.d;
        int lineForVertical = hw2Var.f.getLineForVertical(((int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f)) - hw2Var.h);
        int i4 = hw2Var.g;
        Layout layout = hw2Var.f;
        if (lineForVertical >= i4) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (hw2Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(r72 r72Var, int i, li1 li1Var) {
        long jA;
        long j;
        float f = r72Var.b;
        ArrayList arrayList = this.h;
        int iY = ys.y(arrayList, f);
        float f2 = ((yt1) arrayList.get(iY)).g;
        float f3 = r72Var.d;
        if (f2 >= f3 || iY == arrayList.size() - 1) {
            yt1 yt1Var = (yt1) arrayList.get(iY);
            return yt1Var.a(yt1Var.a.b(r72Var.i(((long) Float.floatToRawIntBits(-yt1Var.f)) & 4294967295L), i, li1Var), true);
        }
        int iY2 = ys.y(arrayList, f3);
        long jA2 = qw2.b;
        while (true) {
            jA = qw2.b;
            if (!qw2.b(jA2, jA) || iY > iY2) {
                break;
            }
            yt1 yt1Var2 = (yt1) arrayList.get(iY);
            jA2 = yt1Var2.a(yt1Var2.a.b(r72Var.i(((long) Float.floatToRawIntBits(-yt1Var2.f)) & 4294967295L), i, li1Var), true);
            iY++;
        }
        if (qw2.b(jA2, jA)) {
            return jA;
        }
        while (true) {
            j = qw2.b;
            if (!qw2.b(jA, j) || iY > iY2) {
                break;
            }
            yt1 yt1Var3 = (yt1) arrayList.get(iY2);
            jA = yt1Var3.a(yt1Var3.a.b(r72Var.i(((long) Float.floatToRawIntBits(-yt1Var3.f)) & 4294967295L), i, li1Var), true);
            iY2--;
        }
        return qw2.b(jA, j) ? jA2 : m02.a((int) (jA2 >> 32), (int) (jA & 4294967295L));
    }

    public final void j(int i) {
        od odVar = (od) this.a.i;
        if (i < 0 || i >= odVar.i.length()) {
            bx0.a("offset(" + i + ") is out of bounds [0, " + odVar.i.length() + ")");
        }
    }

    public final void k(int i) {
        od odVar = (od) this.a.i;
        if (i < 0 || i > odVar.i.length()) {
            bx0.a("offset(" + i + ") is out of bounds [0, " + odVar.i.length() + "]");
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        bx0.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
