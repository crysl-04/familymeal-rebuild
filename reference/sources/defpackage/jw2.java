package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jw2 {
    public final iw2 a;
    public final uh1 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public jw2(iw2 iw2Var, uh1 uh1Var, long j) {
        this.a = iw2Var;
        this.b = uh1Var;
        this.c = j;
        ArrayList arrayList = uh1Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((yt1) arrayList.get(0)).a.d.d(0) + 0.0f;
        if (!arrayList.isEmpty()) {
            yt1 yt1Var = (yt1) dv.F0(arrayList);
            hw2 hw2Var = yt1Var.a.d;
            fD = hw2Var.d(hw2Var.g - 1) + 0.0f + yt1Var.f;
        }
        this.e = fD;
        this.f = uh1Var.g;
    }

    public final u82 a(int i) {
        uh1 uh1Var = this.b;
        uh1Var.k(i);
        int length = ((od) uh1Var.a.i).i.length();
        ArrayList arrayList = uh1Var.h;
        yt1 yt1Var = (yt1) arrayList.get(i == length ? arrayList.size() - 1 : ys.w(i, arrayList));
        return yt1Var.a.d.f.isRtlCharAt(yt1Var.b(i)) ? u82.i : u82.h;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b  */
    public final r72 b(int i) {
        float fK;
        float fK2;
        float fJ;
        float fJ2;
        uh1 uh1Var = this.b;
        uh1Var.j(i);
        ArrayList arrayList = uh1Var.h;
        yt1 yt1Var = (yt1) arrayList.get(ys.w(i, arrayList));
        g9 g9Var = yt1Var.a;
        int iB = yt1Var.b(i);
        CharSequence charSequence = g9Var.e;
        if (iB < 0 || iB >= charSequence.length()) {
            bx0.a("offset(" + iB + ") is out of bounds [0," + charSequence.length() + ")");
        }
        hw2 hw2Var = g9Var.d;
        int iG = hw2Var.g(iB);
        float fI = hw2Var.i(iG);
        float fE = hw2Var.e(iG);
        Layout layout = hw2Var.f;
        boolean z = layout.getParagraphDirection(iG) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iB);
        if (z) {
            if (zIsRtlCharAt) {
                if (zIsRtlCharAt) {
                    fJ = hw2Var.k(iB, false);
                    fJ2 = hw2Var.k(iB + 1, true);
                } else if (zIsRtlCharAt) {
                    fJ = hw2Var.j(iB, false);
                    fJ2 = hw2Var.j(iB + 1, true);
                } else {
                    fK = hw2Var.k(iB, false);
                    fK2 = hw2Var.k(iB + 1, true);
                }
                float f = fJ;
                fK = fJ2;
                fK2 = f;
            } else {
                fK = hw2Var.j(iB, false);
                fK2 = hw2Var.j(iB + 1, true);
            }
        } else if (zIsRtlCharAt) {
            fJ = hw2Var.j(iB, false);
            fJ2 = hw2Var.j(iB + 1, true);
            float f2 = fJ;
            fK = fJ2;
            fK2 = f2;
        } else {
            fK = hw2Var.k(iB, false);
            fK2 = hw2Var.k(iB + 1, true);
        }
        RectF rectF = new RectF(fK, fI, fK2, fE);
        float f3 = rectF.left;
        float f4 = rectF.top + 0.0f;
        float f5 = rectF.right;
        float f6 = rectF.bottom + 0.0f;
        int iFloatToRawIntBits = (int) (((long) Float.floatToRawIntBits(yt1Var.f)) & 4294967295L);
        return new r72(f3 + 0.0f, Float.intBitsToFloat(iFloatToRawIntBits) + f4, 0.0f + f5, Float.intBitsToFloat(iFloatToRawIntBits) + f6);
    }

    public final r72 c(int i) {
        uh1 uh1Var = this.b;
        uh1Var.k(i);
        int length = ((od) uh1Var.a.i).i.length();
        ArrayList arrayList = uh1Var.h;
        yt1 yt1Var = (yt1) arrayList.get(i == length ? arrayList.size() - 1 : ys.w(i, arrayList));
        g9 g9Var = yt1Var.a;
        int iB = yt1Var.b(i);
        CharSequence charSequence = g9Var.e;
        hw2 hw2Var = g9Var.d;
        if (iB < 0 || iB > charSequence.length()) {
            bx0.a("offset(" + iB + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fJ = hw2Var.j(iB, false);
        int iG = hw2Var.g(iB);
        float fI = hw2Var.i(iG) + 0.0f;
        float fE = hw2Var.e(iG) + 0.0f;
        float f = 0.0f + fJ;
        int iFloatToRawIntBits = (int) (((long) Float.floatToRawIntBits(yt1Var.f)) & 4294967295L);
        return new r72(f, Float.intBitsToFloat(iFloatToRawIntBits) + fI, f, Float.intBitsToFloat(iFloatToRawIntBits) + fE);
    }

    public final float d(int i) {
        uh1 uh1Var = this.b;
        uh1Var.l(i);
        ArrayList arrayList = uh1Var.h;
        yt1 yt1Var = (yt1) arrayList.get(ys.x(i, arrayList));
        g9 g9Var = yt1Var.a;
        int i2 = i - yt1Var.d;
        hw2 hw2Var = g9Var.d;
        return hw2Var.f.getLineLeft(i2) + (i2 == hw2Var.g + (-1) ? hw2Var.j : 0.0f);
    }

    public final float e(int i) {
        uh1 uh1Var = this.b;
        uh1Var.l(i);
        ArrayList arrayList = uh1Var.h;
        yt1 yt1Var = (yt1) arrayList.get(ys.x(i, arrayList));
        g9 g9Var = yt1Var.a;
        int i2 = i - yt1Var.d;
        hw2 hw2Var = g9Var.d;
        return hw2Var.f.getLineRight(i2) + (i2 == hw2Var.g + (-1) ? hw2Var.k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jw2) {
            jw2 jw2Var = (jw2) obj;
            if (this.a.equals(jw2Var.a) && this.b == jw2Var.b && vy0.a(this.c, jw2Var.c) && this.d == jw2Var.d && this.e == jw2Var.e && this.f.equals(jw2Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i) {
        uh1 uh1Var = this.b;
        uh1Var.l(i);
        ArrayList arrayList = uh1Var.h;
        yt1 yt1Var = (yt1) arrayList.get(ys.x(i, arrayList));
        g9 g9Var = yt1Var.a;
        return g9Var.d.f.getLineStart(i - yt1Var.d) + yt1Var.b;
    }

    public final u82 g(int i) {
        uh1 uh1Var = this.b;
        uh1Var.k(i);
        int length = ((od) uh1Var.a.i).i.length();
        ArrayList arrayList = uh1Var.h;
        yt1 yt1Var = (yt1) arrayList.get(i == length ? arrayList.size() - 1 : ys.w(i, arrayList));
        g9 g9Var = yt1Var.a;
        int iB = yt1Var.b(i);
        hw2 hw2Var = g9Var.d;
        return hw2Var.f.getParagraphDirection(hw2Var.g(iB)) == 1 ? u82.h : u82.i;
    }

    public final l9 h(int i, int i2) {
        uh1 uh1Var = this.b;
        od odVar = (od) uh1Var.a.i;
        if (i < 0 || i > i2 || i2 > odVar.i.length()) {
            int length = odVar.i.length();
            StringBuilder sbK = wi0.k("Start(", i, ") or End(", i2, ") is out of range [0..");
            sbK.append(length);
            sbK.append("), or start > end!");
            bx0.a(sbK.toString());
        }
        if (i == i2) {
            return n9.a();
        }
        l9 l9VarA = n9.a();
        ys.z(uh1Var.h, m02.a(i, i2), new ux0(l9VarA, i, i2, (byte) 3));
        return l9VarA;
    }

    public final int hashCode() {
        return this.f.hashCode() + wi0.d(this.e, wi0.d(this.d, jp1.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final long i(int i) {
        int iL;
        int iJ;
        int iJ2;
        uh1 uh1Var = this.b;
        uh1Var.k(i);
        int length = ((od) uh1Var.a.i).i.length();
        ArrayList arrayList = uh1Var.h;
        yt1 yt1Var = (yt1) arrayList.get(i == length ? arrayList.size() - 1 : ys.w(i, arrayList));
        g9 g9Var = yt1Var.a;
        int iB = yt1Var.b(i);
        rf rfVarL = g9Var.d.l();
        if (rfVarL.i(rfVarL.l(iB))) {
            rfVarL.b(iB);
            iL = iB;
            while (iL != -1 && (!rfVarL.i(iL) || rfVarL.e(iL))) {
                iL = rfVarL.l(iL);
            }
        } else {
            rfVarL.b(iB);
            if (rfVarL.h(iB)) {
                iL = (!rfVarL.f(iB) || rfVarL.d(iB)) ? rfVarL.l(iB) : iB;
            } else {
                iL = rfVarL.d(iB) ? rfVarL.l(iB) : -1;
            }
        }
        if (iL == -1) {
            iL = iB;
        }
        if (rfVarL.e(rfVarL.j(iB))) {
            rfVarL.b(iB);
            iJ = iB;
            while (iJ != -1 && (rfVarL.i(iJ) || !rfVarL.e(iJ))) {
                iJ = rfVarL.j(iJ);
            }
        } else {
            rfVarL.b(iB);
            if (rfVarL.d(iB)) {
                if (!rfVarL.f(iB) || rfVarL.h(iB)) {
                    iJ2 = rfVarL.j(iB);
                    iJ = iJ2;
                } else {
                    iJ = iB;
                }
            } else if (rfVarL.h(iB)) {
                iJ2 = rfVarL.j(iB);
                iJ = iJ2;
            } else {
                iJ = -1;
            }
        }
        if (iJ != -1) {
            iB = iJ;
        }
        return yt1Var.a(m02.a(iL, iB), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + vy0.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
