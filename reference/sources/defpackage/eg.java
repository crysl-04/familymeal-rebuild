package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eg implements ci1 {
    public static volatile eg l;
    public static final Object m = new Object();
    public static eg n;
    public final /* synthetic */ byte h;
    public Object i;
    public Object j;
    public Object k;

    public eg(byte b) {
        this.h = b;
        switch (b) {
            case 6:
                this.i = new g2((byte) 13);
                this.j = new g2((byte) 13);
                this.k = new g2((byte) 13);
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                this.i = new mj1();
                break;
            case 17:
                long[] jArr = bd2.a;
                this.i = new mj1();
                break;
            case 19:
                this.i = new AtomicReference(t03.E);
                this.j = new Object();
                break;
            case 23:
                this.i = new WeakHashMap();
                this.j = new WeakHashMap();
                this.k = new WeakHashMap();
                break;
            default:
                this.k = new jy1((byte) 23);
                break;
        }
    }

    public static void B(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            file2.toString();
        }
        if (file.renameTo(file2)) {
            return;
        }
        file.toString();
        file2.toString();
    }

    public static eg n(Context context) {
        if (l == null) {
            synchronized (m) {
                if (l == null) {
                    l = new eg(context);
                }
            }
        }
        return l;
    }

    public static eg w(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new eg(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final void A() {
        ((TypedArray) this.i).recycle();
    }

    public final boolean C(int i) {
        ol2 ol2Var;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            o();
        } else if (i != 1 && i != 0) {
            li1.g("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            bm0 bm0Var = (bm0) this.k;
            if (bm0Var != null) {
                ((em0) bm0Var).g(1, true);
                return true;
            }
            uz0.A("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (ol2Var = (ol2) this.i) == null) {
                return false;
            }
            ((m80) ol2Var).a();
            return true;
        }
        bm0 bm0Var2 = (bm0) this.k;
        if (bm0Var2 != null) {
            ((em0) bm0Var2).g(2, true);
            return true;
        }
        uz0.A("focusManager");
        throw null;
    }

    public final void D(Object obj) {
        long jI = y02.i();
        if (jI == lx2.a) {
            this.k = obj;
            return;
        }
        synchronized (this.j) {
            hx2 hx2Var = (hx2) ((AtomicReference) this.i).get();
            int iA = hx2Var.a(jI);
            if (iA < 0) {
                ((AtomicReference) this.i).set(hx2Var.b(jI, obj));
            } else {
                hx2Var.c[iA] = obj;
            }
        }
    }

    public final void E(wq wqVar) {
        ((yq) this.k).h.c = wqVar;
    }

    public final void F(e90 e90Var) {
        ((yq) this.k).h.a = e90Var;
    }

    public final void G(u31 u31Var) {
        ((yq) this.k).h.b = u31Var;
    }

    public final void H(long j) {
        ((yq) this.k).h.d = j;
    }

    public final FileOutputStream I() throws IOException {
        File file = (File) this.j;
        File file2 = (File) this.k;
        if (file2.exists()) {
            B(file2, (File) this.i);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + file, e);
            }
        }
    }

    public final void J() {
        synchronized (this) {
            ((AtomicInteger) this.i).decrementAndGet();
            if (((AtomicInteger) this.i).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final void K() {
        mj1 mj1Var = (mj1) this.i;
        String str = (String) this.j;
        List list = (List) mj1Var.l(str);
        if (list != null) {
            list.remove((kp0) this.k);
            if (list.isEmpty()) {
                return;
            }
            mj1Var.n(str, list);
        }
    }

    public final void a(l41 l41Var, b01 b01Var) {
        g2 g2Var = (g2) this.i;
        g2 g2Var2 = (g2) this.j;
        g2 g2Var3 = (g2) this.k;
        int iOrdinal = b01Var.ordinal();
        if (iOrdinal == 0) {
            g2Var.x(l41Var);
            g2Var3.x(l41Var);
            return;
        }
        if (iOrdinal == 1) {
            g2Var2.x(l41Var);
            g2Var3.x(l41Var);
            return;
        }
        if (iOrdinal == 2) {
            if (l41Var.o != null) {
                g2Var3.x(l41Var);
                return;
            } else {
                g2Var.x(l41Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            wg.n();
        } else if (l41Var.o != null) {
            g2Var3.x(l41Var);
        } else {
            g2Var2.x(l41Var);
        }
    }

    public final boolean b() {
        synchronized (this) {
            if (((AtomicBoolean) this.j).get()) {
                return false;
            }
            ((AtomicInteger) this.i).incrementAndGet();
            return true;
        }
    }

    public final boolean c(l41 l41Var) {
        return !(l41Var.o == null) && (((vl2) ((g2) this.i).i).contains(l41Var) || ((vl2) ((g2) this.j).i).contains(l41Var));
    }

    public final void d(Bundle bundle) {
        HashSet hashSet = (HashSet) this.j;
        String string = ((Context) this.k).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (tw0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    e((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new a42(e, (byte) 6);
            }
        }
    }

    public final Object e(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.i;
        if (Trace.isEnabled()) {
            try {
                p02.s(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                tw0 tw0Var = (tw0) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = tw0Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            e(cls2, hashSet);
                        }
                    }
                }
                objB = tw0Var.b((Context) this.k);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new a42(th2, (byte) 6);
            }
        }
        Trace.endSection();
        return objB;
    }

    public final Object f() {
        long jI = y02.i();
        if (jI == lx2.a) {
            return this.k;
        }
        hx2 hx2Var = (hx2) ((AtomicReference) this.i).get();
        int iA = hx2Var.a(jI);
        if (iA >= 0) {
            return hx2Var.c[iA];
        }
        return null;
    }

    public final wq g() {
        return ((yq) this.k).h.c;
    }

    public final ColorStateList h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.i;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            Context context = (Context) this.k;
            int i2 = df.a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i);
    }

    public final ub1 i() {
        ub1 ub1Var;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((jy1) this.k)) {
            ub1Var = (ub1) this.j;
            if (ub1Var == null || localeList != ((LocaleList) this.i)) {
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new tb1(localeList.get(i)));
                }
                ub1Var = new ub1(arrayList);
                this.i = localeList;
                this.j = ub1Var;
            }
        }
        return ub1Var;
    }

    @Override // defpackage.ci1
    public final Comparable j(q22 q22Var) {
        uc2 uc2Var = (uc2) this.k;
        vc2 vc2VarK = uc2Var.k();
        vc2 vc2VarC = uc2Var.c();
        vc2 vc2VarZ1 = vc2VarC.z1(vc2VarC);
        j4 j4Var = (j4) this.j;
        vc2 vc2Var = (vc2) ((vc2) vc2VarK.i0(j4Var.j(q22Var))).I1(vc2VarZ1).R(((g2) this.i).j(q22Var));
        ix0 ix0Var = j4Var.j;
        vc2 vc2VarK2 = (vc2) ix0Var.i;
        if (vc2VarK2 == null) {
            vc2VarK2 = ((fy1) ix0Var.j).h().k();
        }
        vc2Var.i0((Comparable) vc2VarK2.get());
        return (Comparable) vc2Var.get();
    }

    public final Drawable k(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.i;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : df.a((Context) this.k, resourceId);
    }

    public final Drawable l(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.i).hasValue(i) || (resourceId = ((TypedArray) this.i).getResourceId(i, 0)) == 0) {
            return null;
        }
        ve veVarA = ve.a();
        Context context = (Context) this.k;
        synchronized (veVarA) {
            drawableE = veVarA.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, rf] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r9v3, types: [rf] */
    public final Typeface m(int i, int i2, rf rfVar) {
        ?? r9;
        ?? r14;
        int resourceId = ((TypedArray) this.i).getResourceId(i, 0);
        Typeface typefaceB = null;
        if (resourceId != 0) {
            TypedValue typedValue = (TypedValue) this.j;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.j = typedValue;
            }
            Context context = (Context) this.k;
            int i3 = y82.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (string.startsWith("res/")) {
                    Typeface typefaceC = (Typeface) v03.b.b(v03.d(resources, resourceId, string, typedValue.assetCookie, i2));
                    byte b = 2;
                    if (typefaceC != null) {
                        new Handler(Looper.getMainLooper()).post(new l7(rfVar, typefaceC, b));
                        r14 = rfVar;
                    } else {
                        try {
                            try {
                                if (string.toLowerCase().endsWith(".xml")) {
                                    hn0 hn0VarW = lt.W(resources.getXml(resourceId), resources);
                                    if (hn0VarW == null) {
                                        rfVar.a(-3);
                                        rfVar = rfVar;
                                    } else {
                                        typefaceB = v03.b(context, hn0VarW, resources, resourceId, string, typedValue.assetCookie, i2, rfVar, true);
                                        rfVar = rfVar;
                                    }
                                } else {
                                    typefaceC = v03.c(resources, resourceId, string, typedValue.assetCookie, i2);
                                    if (typefaceC != null) {
                                        Handler handler = new Handler(Looper.getMainLooper());
                                        l7 l7Var = new l7(rfVar, typefaceC, b);
                                        handler.post(l7Var);
                                        r14 = l7Var;
                                    } else {
                                        rfVar.a(-3);
                                        r14 = rfVar;
                                    }
                                }
                            } catch (IOException | XmlPullParserException unused) {
                                r9.a(-3);
                            }
                        } catch (IOException | XmlPullParserException unused2) {
                            r9 = rfVar;
                        }
                    }
                    typefaceB = typefaceC;
                    rfVar = r14;
                } else {
                    rfVar.a(-3);
                }
                return typefaceB;
            }
        }
        return null;
    }

    public final b31 o() {
        b31 b31Var = (b31) this.j;
        if (b31Var != null) {
            return b31Var;
        }
        uz0.A("keyboardActions");
        throw null;
    }

    public final qy0 p() {
        Matcher matcher = (Matcher) this.i;
        return cy1.S(matcher.start(), matcher.end());
    }

    public final long q() {
        return ((yq) this.k).h.d;
    }

    public final boolean r(CharSequence charSequence, int i, int i2, x03 x03Var) {
        if ((x03Var.c & 3) == 0) {
            g70 g70Var = (g70) this.k;
            cg1 cg1VarB = x03Var.b();
            int iA = cg1VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) cg1VarB.k).getShort(iA + cg1VarB.h);
            }
            g70Var.getClass();
            ThreadLocal threadLocal = g70.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = g70Var.a.hasGlyph(sb.toString());
            int i3 = x03Var.c & 4;
            x03Var.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (x03Var.c & 3) == 2;
    }

    public final boolean s() {
        return !(((vl2) ((g2) this.i).i).isEmpty() && ((vl2) ((g2) this.k).i).isEmpty() && ((vl2) ((g2) this.j).i).isEmpty());
    }

    public final boolean t() {
        if (((a13) this.i).h != this.k) {
            return true;
        }
        eg egVar = (eg) this.j;
        return egVar != null && egVar.t();
    }

    public final String toString() {
        switch (this.h) {
            case 15:
                String str = (String) this.k;
                String str2 = (String) this.j;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.i;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final gy1 u() {
        return (gy1) ((re1) ((g2) this.i).i);
    }

    public final eg v() {
        CharSequence charSequence = (CharSequence) this.j;
        Matcher matcher = (Matcher) this.i;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return pz1.l(matcher2, iEnd, charSequence);
    }

    public final Object x(CharSequence charSequence, int i, int i2, int i3, boolean z, of0 of0Var) {
        int i4;
        char c;
        rf0 rf0Var = new rf0((eg1) ((wk) this.j).k);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zG = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zG) {
                    eg1 eg1Var = (eg1) rf0Var.c.a.get(iCodePointAt);
                    if (rf0Var.a == 2) {
                        if (eg1Var != null) {
                            rf0Var.c = eg1Var;
                            rf0Var.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                rf0Var.a();
                            } else if (iCodePointAt != 65039) {
                                eg1 eg1Var2 = rf0Var.c;
                                if (eg1Var2.b != null) {
                                    if (rf0Var.f != 1) {
                                        rf0Var.d = eg1Var2;
                                        rf0Var.a();
                                    } else if (rf0Var.b()) {
                                        rf0Var.d = rf0Var.c;
                                        rf0Var.a();
                                    } else {
                                        rf0Var.a();
                                    }
                                    c = 3;
                                } else {
                                    rf0Var.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (eg1Var == null) {
                        rf0Var.a();
                        c = 1;
                    } else {
                        rf0Var.a = (byte) 2;
                        rf0Var.c = eg1Var;
                        rf0Var.f = 1;
                        c = 2;
                    }
                    rf0Var.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && r(charSequence, i4, iCharCount, rf0Var.d.b)) {
                            break;
                        }
                        zG = of0Var.g(charSequence, i4, iCharCount, rf0Var.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (rf0Var.a == 2 && rf0Var.c.b != null && ((rf0Var.f > 1 || rf0Var.b()) && i5 < i3 && zG && (z || !r(charSequence, i4, iCharCount, rf0Var.c.b)))) {
            of0Var.g(charSequence, i4, iCharCount, rf0Var.c.b);
        }
        return of0Var.a();
    }

    public final gy1 y() {
        return (gy1) ((j4) this.j).i;
    }

    public final byte[] z() throws IOException {
        File file = (File) this.j;
        File file2 = (File) this.i;
        File file3 = (File) this.k;
        if (file3.exists()) {
            B(file3, file2);
        }
        if (file.exists() && file2.exists() && !file.delete()) {
            Objects.toString(file);
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStream.read(bArr, i, bArr.length - i);
                if (i2 <= 0) {
                    fileInputStream.close();
                    return bArr;
                }
                i += i2;
                int iAvailable = fileInputStream.available();
                if (iAvailable > bArr.length - i) {
                    byte[] bArr2 = new byte[iAvailable + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public eg(f72 f72Var) {
        this.h = (byte) 16;
        this.i = new ji(0);
        this.j = new bj();
        this.k = new h6((Object) this, (Object) f72Var, (byte) 25);
    }

    public /* synthetic */ eg(Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    public eg(ol2 ol2Var) {
        this.h = (byte) 11;
        this.i = ol2Var;
    }

    public eg(o6 o6Var) {
        this.h = (byte) 4;
        this.i = new AtomicInteger(0);
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
    }

    public eg(int i, kj2 kj2Var) {
        this.h = (byte) 8;
        byte[] bArr = new byte[i];
        this.k = bArr;
        Enum[] enumArr = (Enum[]) kj2Var.getDeclaringClass().getEnumConstants();
        this.i = enumArr;
        int[] iArr = new int[enumArr.length];
        this.j = iArr;
        int iOrdinal = kj2Var.ordinal();
        Arrays.fill(bArr, (byte) iOrdinal);
        iArr[iOrdinal] = i;
    }

    public eg(View view) {
        this.h = (byte) 10;
        this.i = view;
        this.j = vs.N(g81.i, new o9((Object) this, (byte) 15));
        this.k = new xl1(view);
    }

    public eg(File file) {
        this.h = (byte) 2;
        this.i = file;
        this.j = new File(file.getPath() + ".new");
        this.k = new File(file.getPath() + ".bak");
    }

    public eg(yq yqVar) {
        this.h = (byte) 3;
        this.k = yqVar;
        this.i = new g2((Object) this, (byte) 5);
    }

    public eg(vw vwVar) {
        this.h = (byte) 13;
        this.k = new CopyOnWriteArrayList();
        this.i = new HashMap();
        this.j = vwVar;
    }

    public eg(Context context, TypedArray typedArray) {
        this.h = (byte) 20;
        this.k = context;
        this.i = typedArray;
    }

    public eg(Context context, LocationManager locationManager) {
        this.h = (byte) 21;
        this.j = new ea();
        this.k = context;
        this.i = locationManager;
    }

    public eg(Context context) {
        this.h = (byte) 0;
        this.k = context.getApplicationContext();
        this.j = new HashSet();
        this.i = new HashMap();
    }

    public eg(int i) {
        this.h = (byte) 5;
        g52 g52Var = l52.q;
        l52 l52VarR = g52.R(i, i);
        l52 l52VarR2 = g52.R(i, 1);
        this.k = l52VarR.C0().h();
        j4 j4Var = new j4(l52VarR, (byte) 1);
        this.j = j4Var;
        g2 g2Var = new g2(l52VarR2);
        this.i = g2Var;
        if (((int) j4Var.i.B1()) == Math.toIntExact(((re1) g2Var.i).count())) {
            return;
        }
        wg.m("Must have the same arity!");
        throw null;
    }

    public eg(wk wkVar, yy yyVar, g70 g70Var, Set set) {
        this.h = (byte) 7;
        this.i = yyVar;
        this.j = wkVar;
        this.k = g70Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            x(str, 0, str.length(), 1, true, new qf0(str, (byte) 0));
        }
    }

    public eg(a13 a13Var, eg egVar) {
        this.h = (byte) 22;
        this.i = a13Var;
        this.j = egVar;
        this.k = a13Var.h;
    }

    public eg(g53 g53Var) {
        this.h = (byte) 24;
        t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
        c30.b.getClass();
        this.i = g53Var;
        this.j = "androidx.navigation.NavControllerViewModel";
        this.k = new yq2(new xu1(this, (byte) 20));
    }

    public eg(Matcher matcher, CharSequence charSequence) {
        this.h = (byte) 12;
        this.i = matcher;
        this.j = charSequence;
        this.k = new ge1(this, (byte) 0);
    }
}
