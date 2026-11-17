package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rf {
    public final /* synthetic */ byte a = 1;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public rf(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            bx0.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            bx0.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = 0;
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new ts(i, charSequence));
    }

    public final void a(int i) {
        new Handler(Looper.getMainLooper()).post(new l6(this, i));
    }

    public final void b(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbK = wi0.k("Invalid offset: ", i, ". Valid range is [", i2, " , ");
        sbK.append(i3);
        sbK.append("]");
        bx0.a(sbK.toString());
    }

    public final int c() {
        yq0 yq0Var = (yq0) this.e;
        String str = (String) this.d;
        if (yq0Var == null) {
            return str.length();
        }
        return (yq0Var.b - yq0Var.b()) + (str.length() - (this.c - this.b));
    }

    public final boolean d(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!if0.d()) {
                    return false;
                }
                if0 if0VarA = if0.a();
                if (if0VarA.c() != 1 || if0VarA.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return r02.x(Character.codePointBefore((CharSequence) this.d, i));
    }

    public final boolean f(int i) {
        b(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (h(i) && h(i - 1) && h(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(g(i) || g(i + 1));
    }

    public final boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (uz0.g(unicodeBlockOf, unicodeBlock) && uz0.g(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return uz0.g(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && uz0.g(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public final boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!if0.d()) {
                return false;
            }
            if0 if0VarA = if0.a();
            if (if0VarA.c() != 1 || if0VarA.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return r02.x(Character.codePointAt((CharSequence) this.d, i));
    }

    public final int j(int i) {
        b(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (h(iFollowing + (-1)) && h(iFollowing) && !g(iFollowing)) ? j(iFollowing) : iFollowing;
    }

    public final void k(Typeface typeface) {
        int i = this.b;
        if (i != -1) {
            typeface = Typeface.create(typeface, i, (this.c & 2) != 0);
        }
        sf sfVar = (sf) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (sfVar.m) {
            sfVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, sfVar.j);
            }
        }
    }

    public final int l(int i) {
        b(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (h(iPreceding) && d(iPreceding) && !g(iPreceding)) ? l(iPreceding) : iPreceding;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0102  */
    public final void m(String str, int i, int i2) {
        if (i > i2) {
            bx0.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            bx0.a("start must be non-negative, but was " + i);
        }
        yq0 yq0Var = (yq0) this.e;
        if (yq0Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            yq0 yq0Var2 = new yq0();
            yq0Var2.b = iMax;
            yq0Var2.e = cArr;
            yq0Var2.c = length;
            yq0Var2.d = i4;
            this.e = yq0Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > yq0Var.b - yq0Var.b()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            m(str, i, i2);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > yq0Var.b()) {
            int iB = length2 - yq0Var.b();
            int i9 = yq0Var.b;
            do {
                i9 <<= 1;
            } while (i9 - yq0Var.b < iB);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) yq0Var.e, 0, cArr2, 0, yq0Var.c);
            int i10 = yq0Var.b;
            int i11 = yq0Var.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) yq0Var.e, i11, cArr2, i13, (i12 + i11) - i11);
            yq0Var.e = cArr2;
            yq0Var.b = i9;
            yq0Var.d = i13;
        }
        int i14 = yq0Var.c;
        if (i7 >= i14) {
            int iB2 = yq0Var.b() + i7;
            int iB3 = yq0Var.b() + i8;
            int i15 = yq0Var.d;
            int i16 = iB2 - i15;
            char[] cArr3 = (char[]) yq0Var.e;
            System.arraycopy(cArr3, i15, cArr3, yq0Var.c, i16);
            i7 = yq0Var.c + i16;
            yq0Var.c = i7;
            yq0Var.d = iB3;
        } else if (i8 <= i14) {
            int i17 = i14 - i8;
            char[] cArr4 = (char[]) yq0Var.e;
            System.arraycopy(cArr4, i8, cArr4, yq0Var.d - i17, i17);
            yq0Var.c = i7;
            yq0Var.d -= i17;
        } else if (i8 >= i14) {
            yq0Var.d = yq0Var.b() + i8;
            yq0Var.c = i7;
        } else {
            int iB4 = yq0Var.b() + i7;
            int iB5 = yq0Var.b() + i8;
            int i18 = yq0Var.d;
            int i19 = iB4 - i18;
            char[] cArr5 = (char[]) yq0Var.e;
            System.arraycopy(cArr5, i18, cArr5, yq0Var.c, i19);
            i7 = yq0Var.c + i19;
            yq0Var.c = i7;
            yq0Var.d = iB5;
        }
        str.getChars(0, str.length(), (char[]) yq0Var.e, i7);
        yq0Var.c = str.length() + yq0Var.c;
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                yq0 yq0Var = (yq0) this.e;
                String str = (String) this.d;
                if (yq0Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) yq0Var.e, 0, yq0Var.c);
                char[] cArr = (char[]) yq0Var.e;
                int i = yq0Var.d;
                sb.append(cArr, i, yq0Var.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ rf() {
    }

    public rf(sf sfVar, int i, int i2, WeakReference weakReference) {
        this.e = sfVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }
}
