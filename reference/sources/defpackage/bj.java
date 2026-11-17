package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bj {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public bj(Map map) {
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new lb0(this, (byte) 2);
    }

    public final sq a(aj ajVar, kp0 kp0Var) {
        int i;
        int i2;
        int i3;
        v72 v72Var = new v72();
        v72Var.h = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                ajVar.b(th);
                return c5.A;
            }
            ji jiVar = (ji) this.c;
            do {
                i = jiVar.get();
                i2 = i + 1;
            } while (!jiVar.compareAndSet(i, i2));
            byte b = 0;
            boolean z = (134217727 & i2) == 1;
            v72Var.h = (i2 >>> 27) & 15;
            ((fj1) this.d).a(ajVar);
            if (z) {
                try {
                    kp0Var.a();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        if (((Throwable) this.b) == null) {
                            this.b = th2;
                            fj1 fj1Var = (fj1) this.d;
                            Object[] objArr = fj1Var.a;
                            int i4 = fj1Var.b;
                            for (int i5 = 0; i5 < i4; i5++) {
                                ((aj) objArr[i5]).b(th2);
                            }
                            ((fj1) this.d).d();
                            ji jiVar2 = (ji) this.c;
                            do {
                                i3 = jiVar2.get();
                            } while (!jiVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                        }
                    }
                }
            }
            return new ix0(new zi(ajVar, this, v72Var, b));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    public final Bidi b(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(g(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.e = cArr2;
        return bidi;
    }

    public final void c(vp0 vp0Var) {
        int i;
        synchronized (this.a) {
            fj1 fj1Var = (fj1) this.d;
            this.d = (fj1) this.e;
            this.e = fj1Var;
            ji jiVar = (ji) this.c;
            do {
                i = jiVar.get();
            } while (!jiVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            int i2 = fj1Var.b;
            for (int i3 = 0; i3 < i2; i3++) {
                vp0Var.h(fj1Var.g(i3));
            }
            fj1Var.d();
        }
    }

    public final float d(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public final float e(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return d(i, z);
        }
        int iA = ou.A(layout, i, z2);
        int lineStart = layout.getLineStart(iA);
        int lineEnd = layout.getLineEnd(iA);
        if (i != lineStart && i != lineEnd) {
            return d(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return d(i, z);
        }
        int iF = f(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(g(iF))) == -1;
        int iH = h(lineEnd, lineStart);
        int iG = g(iF);
        int i4 = lineStart - iG;
        int i5 = iH - iG;
        Bidi bidiB = b(iF);
        Bidi bidiCreateLineBidi = bidiB != null ? bidiB.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        w31[] w31VarArr = new w31[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            w31VarArr[i6] = new w31(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, w31VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (w31VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == w31VarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iA);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(w31VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(w31VarArr[i3 + 1].a);
            }
            return layout.getLineRight(iA);
        }
        int iH2 = i > iH ? h(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (w31VarArr[i9].b == iH2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == w31VarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iA);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(w31VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(w31VarArr[i2 + 1].b);
        }
        return layout.getLineRight(iA);
    }

    public final int f(int i, boolean z) {
        int i2;
        ArrayList arrayList = (ArrayList) this.b;
        Integer numValueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            wg.m(jp1.i(size, "fromIndex (0) is greater than toIndex (", ")."));
        } else if (size > size2) {
            wg.i(wi0.g("toIndex (", size, ") is greater than size (", size2, ")."));
        }
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int iU = vs.u((Comparable) arrayList.get(i2), numValueOf);
            if (iU >= 0) {
                if (iU <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        int i5 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z && i5 > 0) {
            int i6 = i5 - 1;
            if (i == ((Number) arrayList.get(i6)).intValue()) {
                return i6;
            }
        }
        return i5;
    }

    public final int g(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    public final int h(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.a).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((uz0.i(cCharAt, 8192) < 0 || uz0.i(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public final void i(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        nn2 nn2Var = (nn2) ((LinkedHashMap) this.c).get(str);
        if (nn2Var != null) {
            nn2Var.h(obj);
        }
        nn2 nn2Var2 = (nn2) ((LinkedHashMap) this.d).get(str);
        if (nn2Var2 != null) {
            nn2Var2.h(obj);
        }
    }

    public bj() {
        this.a = new Object();
        this.c = new ji(0);
        this.d = new fj1();
        this.e = new fj1();
    }
}
