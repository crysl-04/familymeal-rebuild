package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lb {
    public int a;
    public int[] b;
    public int c;
    public Object d;
    public Object e;

    public final int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.d;
        int length = jArr.length;
        if (i > length) {
            int i2 = length << 1;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            gi.P(jArr, jArr2, 0, 0, jArr.length);
            gi.R(0, 0, 14, this.b, iArr);
            this.d = jArr2;
            this.b = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int[] iArr2 = (int[]) this.e;
        int length2 = iArr2.length;
        if (this.c >= length2) {
            int i4 = length2 << 1;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            gi.R(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.c;
        this.c = iArr2[i7];
        long[] jArr3 = (long[]) this.d;
        jArr3[i3] = j;
        this.b[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (uz0.j(jArr3[i8], j) <= 0) {
                break;
            }
            d(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    public final p4 b(TypedArray typedArray, Resources.Theme theme, String str, int i) throws XmlPullParserException, IOException {
        p4 p4Var;
        if (rz1.r((XmlResourceParser) this.d, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    p4Var = p4.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception unused) {
                    p4Var = null;
                }
                if (p4Var == null) {
                    p4Var = new p4((Shader) null, 0);
                }
            } else {
                p4Var = new p4((Shader) null, typedValue.data);
            }
        } else {
            p4Var = new p4((Shader) null, 0);
        }
        e(typedArray.getChangingConfigurations());
        return p4Var;
    }

    public final float c(TypedArray typedArray, String str, int i, float f) {
        if (rz1.r((XmlResourceParser) this.d, str)) {
            f = typedArray.getFloat(i, f);
        }
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final void d(int i, int i2) {
        long[] jArr = (long[]) this.d;
        int[] iArr = this.b;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public final void e(int i) {
        this.a |= i;
    }
}
