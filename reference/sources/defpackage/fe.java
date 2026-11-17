package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fe {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public fe() {
        this.a = (byte) 2;
        this.c = new pt0[32];
        this.d = new float[32];
        this.e = new byte[32];
        nj1 nj1Var = cd2.a;
        this.f = new nj1();
        this.g = new nj1();
    }

    public static /* synthetic */ void m(fe feVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = feVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        feVar.l(i, str, str2);
        throw null;
    }

    public final void A(pt0 pt0Var) {
        int iZ = gi.Z((pt0[]) this.c, pt0Var);
        if (iZ >= 0) {
            pt0[] pt0VarArr = (pt0[]) this.c;
            int i = iZ + 1;
            gi.Q(pt0VarArr, pt0VarArr, iZ, i, this.b);
            pt0[] pt0VarArr2 = (pt0[]) this.c;
            int i2 = this.b;
            pt0VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.d;
            System.arraycopy(fArr, i, fArr, iZ, i2 - i);
            byte[] bArr = (byte[]) this.e;
            System.arraycopy(bArr, i, bArr, iZ, this.b - i);
            this.b--;
        }
    }

    public final void B(ColorStateList colorStateList) {
        if (colorStateList != null) {
            wx2 wx2Var = (wx2) this.e;
            if (wx2Var == null) {
                wx2Var = new wx2();
                this.e = wx2Var;
            }
            wx2Var.a = colorStateList;
            wx2Var.d = true;
        } else {
            this.e = null;
        }
        b();
    }

    public final void C(ColorStateList colorStateList) {
        wx2 wx2Var = (wx2) this.f;
        if (wx2Var == null) {
            wx2Var = new wx2();
            this.f = wx2Var;
        }
        wx2Var.a = colorStateList;
        wx2Var.d = true;
        b();
    }

    public final void D(PorterDuff.Mode mode) {
        wx2 wx2Var = (wx2) this.f;
        if (wx2Var == null) {
            wx2Var = new wx2();
            this.f = wx2Var;
        }
        wx2Var.b = mode;
        wx2Var.c = true;
        b();
    }

    public final int E() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public final boolean F() {
        int iE = E();
        String str = (String) this.g;
        if (iE >= str.length() || iE == -1 || str.charAt(iE) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public final void G(char c) {
        String str = (String) this.g;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strK = k();
                this.b = i;
                if (uz0.g(strK, "null")) {
                    l(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strL = s60.L(s60.k(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m(this, jp1.k("Expected ", strL, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public final boolean H(int i) {
        int[] iArr = (int[]) this.f;
        int i2 = iArr[i];
        int i3 = this.b;
        if (i2 == i3) {
            return false;
        }
        iArr[i] = i3;
        return true;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (n(i + 3, charSequence) + (n(i, charSequence) << 12) + (n(i + 1, charSequence) << 8) + (n(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public final void b() {
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((wx2) this.e) != null) {
                wx2 wx2Var = (wx2) this.g;
                if (wx2Var == null) {
                    wx2Var = new wx2();
                    this.g = wx2Var;
                }
                wx2Var.a = null;
                wx2Var.d = false;
                wx2Var.b = null;
                wx2Var.c = false;
                WeakHashMap weakHashMap = t43.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    wx2Var.d = true;
                    wx2Var.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    wx2Var.c = true;
                    wx2Var.b = backgroundTintMode;
                }
                if (wx2Var.d || wx2Var.c) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = ve.b;
                    x82.i(background, wx2Var, drawableState);
                    return;
                }
            }
            wx2 wx2Var2 = (wx2) this.f;
            if (wx2Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = ve.b;
                x82.i(background, wx2Var2, drawableState2);
            } else {
                wx2 wx2Var3 = (wx2) this.e;
                if (wx2Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = ve.b;
                    x82.i(background, wx2Var3, drawableState3);
                }
            }
        }
    }

    public final boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public final void d(int i, String str) {
        String str2 = (String) this.g;
        if (str2.length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public final String e() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        h('\"');
        int i = this.b;
        int iU = co2.U(str, '\"', i, 4);
        if (iU == -1) {
            k();
            int i2 = this.b;
            m(this, wi0.h("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iU) {
            if (str.charAt(i3) == '\\') {
                int iX = this.b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iX, i3);
                        int iX2 = x(i3 + 1);
                        if (iX2 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iX2 + 1;
                        char cCharAt2 = str.charAt(iX2);
                        if (cCharAt2 == 'u') {
                            iA = a(iA, str);
                        } else {
                            char c = cCharAt2 < 'u' ? ss.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iX = x(iA);
                        if (iX == -1) {
                            m(this, "Unexpected EOF", iX, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iX, i3);
                            iX = x(i3);
                            if (iX == -1) {
                                m(this, "Unexpected EOF", iX, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iX;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iX, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iX, i3).toString();
                }
                this.b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.b = iU + 1;
        return str.substring(i, iU);
    }

    public final byte f() {
        String str = (String) this.g;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return s60.k(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public final byte g(byte b) {
        String str = (String) this.g;
        byte bF = f();
        if (bF == b) {
            return bF;
        }
        String strL = s60.L(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        m(this, jp1.k("Expected ", strL, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public final void h(char c) {
        int i = this.b;
        if (i == -1) {
            G(c);
            throw null;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                G(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        G(c);
        throw null;
    }

    public final long i() {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        double dPow;
        int iX = x(E());
        String str = (String) this.g;
        if (iX >= str.length() || iX == -1) {
            m(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iX) == '\"') {
            iX++;
            if (iX == str.length()) {
                m(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iX;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                z3 = z5;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z;
                if (cCharAt == '-' && z5) {
                    if (i == iX) {
                        m(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z5) {
                    z3 = z5;
                    if (cCharAt != '-') {
                        if (s60.k(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z3) {
                            j2 = (j2 * 10) + ((long) i3);
                        } else {
                            j3 = (j3 * 10) - ((long) i3);
                            if (j3 > 0) {
                                m(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z = z2;
                        z5 = z3;
                    } else {
                        if (i != iX) {
                            m(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = z3;
                        z6 = true;
                    }
                } else {
                    if (i == iX) {
                        m(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = true;
                }
            } else {
                if (i == iX) {
                    m(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iX;
        if (iX == i || (z6 && iX == i - 1)) {
            m(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z2) {
            if (!z7) {
                m(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                m(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.b = i;
        long j4 = j3;
        if (z3) {
            double d = j4;
            if (!z4) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z4) {
                    wg.n();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z6) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        m(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String j() {
        String str = (String) this.e;
        if (str == null) {
            return e();
        }
        str.getClass();
        this.e = null;
        return str;
    }

    public final String k() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        String str2 = (String) this.e;
        if (str2 != null) {
            str2.getClass();
            this.e = null;
            return str2;
        }
        int iE = E();
        if (iE >= str.length() || iE == -1) {
            m(this, "EOF", iE, null, 4);
            throw null;
        }
        byte bK = s60.k(str.charAt(iE));
        if (bK == 1) {
            return j();
        }
        if (bK != 0) {
            m(this, "Expected beginning of the string, but got " + str.charAt(iE), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (s60.k(str.charAt(iE)) == 0) {
            iE++;
            if (iE >= str.length()) {
                sb.append((CharSequence) str, this.b, iE);
                int iX = x(iE);
                if (iX == -1) {
                    this.b = iE;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iE = iX;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iE);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iE).toString();
        }
        this.b = iE;
        return string;
    }

    public final void l(int i, String str, String str2) {
        String strA = ((d21) this.d).a();
        String str3 = (String) this.g;
        str3.getClass();
        throw new l11(lt.z(i, str, strA, str2, ((j11) this.c).h ? lt.R(i, str3).toString() : null));
    }

    public final int n(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final ColorStateList o() {
        wx2 wx2Var = (wx2) this.f;
        if (wx2Var != null) {
            return wx2Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode p() {
        wx2 wx2Var = (wx2) this.f;
        if (wx2Var != null) {
            return wx2Var.b;
        }
        return null;
    }

    public final void q(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.c;
        Context context = view.getContext();
        int[] iArr = f52.z;
        eg egVarW = eg.w(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) egVarW.i;
        View view2 = (View) this.c;
        Context context2 = view2.getContext();
        TypedArray typedArray2 = (TypedArray) egVarW.i;
        WeakHashMap weakHashMap = t43.a;
        r43.b(view2, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.b = typedArray.getResourceId(0, -1);
                ve veVar = (ve) this.d;
                Context context3 = view.getContext();
                int i2 = this.b;
                synchronized (veVar) {
                    try {
                        colorStateListG = veVar.a.g(context3, i2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (colorStateListG != null) {
                    B(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(egVarW.h(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(zd0.b(typedArray.getInt(2, -1), null));
            }
            egVarW.A();
        } catch (Throwable th2) {
            egVarW.A();
            throw th2;
        }
    }

    public final cl1 r(String str) {
        bl1 bl1Var;
        str.getClass();
        yq2 yq2Var = (yq2) this.g;
        if (yq2Var == null || (bl1Var = (bl1) yq2Var.getValue()) == null) {
            return null;
        }
        int i = dl1.l;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleD = bl1Var.d(uri, (LinkedHashMap) this.e);
        if (bundleD != null) {
            return new cl1((dl1) this.c, bundleD, bl1Var.l, bl1Var.b(uri), false);
        }
        return null;
    }

    public final void s() {
        this.b = -1;
        B(null);
        b();
    }

    public final void t(int i) {
        ColorStateList colorStateListG;
        this.b = i;
        ve veVar = (ve) this.d;
        if (veVar != null) {
            Context context = ((View) this.c).getContext();
            synchronized (veVar) {
                colorStateListG = veVar.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        B(colorStateListG);
        b();
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.g);
                sb.append("', currentPosition=");
                sb.append(this.b);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final String u(String str) {
        str.getClass();
        int i = this.b;
        try {
            if (f() == 6 && uz0.g(w(), str)) {
                this.e = null;
                if (f() == 5) {
                    return w();
                }
            }
            return null;
        } finally {
            this.b = i;
            this.e = null;
        }
    }

    public final byte v() {
        String str = (String) this.g;
        int i = this.b;
        while (true) {
            int iX = x(i);
            if (iX == -1) {
                this.b = iX;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iX);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iX;
                return s60.k(cCharAt);
            }
            i = iX + 1;
        }
    }

    public final String w() {
        if (v() != 1) {
            return null;
        }
        String strJ = j();
        this.e = strJ;
        return strJ;
    }

    public final int x(int i) {
        if (i < ((String) this.g).length()) {
            return i;
        }
        return -1;
    }

    public final void y(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = (int[]) this.d;
        ((int[]) this.e)[i] = i2;
        if (iArr != null) {
            i2 = iArr[i2];
        }
        int[] iArr5 = (int[]) this.c;
        if (i2 >= 0) {
            iArr5[i] = iArr2[i2];
            iArr4[i] = iArr3 != null ? iArr3[i2] : iArr2[i2 + 1];
        } else {
            iArr5[i] = 0;
            iArr4[i] = 0;
        }
    }

    public final int z(int[] iArr, int i, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, double[] dArr) {
        int i2;
        int[] iArr6 = (int[]) this.c;
        int i3 = this.b;
        if (i3 == Integer.MAX_VALUE) {
            Arrays.fill((int[]) this.f, 0);
            this.b = 0;
            i3 = 0;
        }
        this.b = i3 + 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            if (H(iArr[i5])) {
                int i6 = 0;
                y(0, iArr[i5], iArr2, iArr3, iArr4);
                while (i6 >= 0) {
                    int i7 = iArr6[i6];
                    int i8 = ((int[]) this.d)[i6];
                    while (true) {
                        if (i7 >= i8) {
                            i2 = -1;
                            break;
                        }
                        i2 = iArr5[i7];
                        boolean z = dArr == null || dArr[i7] != h32.a;
                        i7++;
                        if (z && H(i2)) {
                            break;
                        }
                    }
                    if (i2 >= 0) {
                        iArr6[i6] = i7;
                        i6++;
                        y(i6, i2, iArr2, iArr3, iArr4);
                    } else {
                        ((int[]) this.g)[i4] = ((int[]) this.e)[i6];
                        i4++;
                        i6--;
                    }
                }
            }
        }
        return i4;
    }

    public fe(View view) {
        this.a = (byte) 0;
        this.b = -1;
        this.c = view;
        this.d = ve.a();
    }

    public fe(int i) {
        this.a = (byte) 3;
        this.b = 0;
        this.g = new int[i];
        this.c = new int[i];
        this.d = new int[i];
        this.e = new int[i];
        this.f = new int[i];
    }

    public fe(String str, j11 j11Var) {
        this.a = (byte) 4;
        str.getClass();
        this.c = j11Var;
        this.d = new d21(j11Var);
        this.f = new StringBuilder();
        this.g = str;
    }

    public fe(dl1 dl1Var) {
        this.a = (byte) 1;
        this.c = dl1Var;
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
    }
}
