package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v03 {
    public static final jy1 a;
    public static final hd1 b;
    public static Paint c;

    static {
        p02.s("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            a = new w03();
        } else {
            a = new jy1();
        }
        b = new hd1(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, sn0[] sn0VarArr, int i) {
        p02.s("TypefaceCompat.createFromFontInfo");
        try {
            jy1 jy1Var = a;
            jy1Var.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyZ = jy1Var.z(sn0VarArr, context.getContentResolver());
                if (fontFamilyZ != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyZ).setStyle(jy1.x(fontFamilyZ, i).getStyle()).build();
                }
            } catch (Exception unused) {
            }
            return typefaceBuild;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface b(Context context, hn0 hn0Var, Resources resources, int i, String str, int i2, int i3, rf rfVar, boolean z) {
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        byte b2 = 2;
        Typeface typefaceBuild2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (hn0Var instanceof kn0) {
            kn0 kn0Var = (kn0) hn0Var;
            String str2 = kn0Var.d;
            byte b3 = 1;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = e(str2)) == null) {
                ArrayList arrayList = kn0Var.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT < 31) {
                        typefaceBuild = null;
                        break;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList.size()) {
                            int i5 = 0;
                            Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                            while (true) {
                                if (i5 < arrayList.size()) {
                                    an0 an0Var = (an0) arrayList.get(i5);
                                    if (i5 == arrayList.size() - 1 && TextUtils.isEmpty(an0Var.f)) {
                                        customFallbackBuilder.setSystemFallback(an0Var.e);
                                    } else {
                                        String str3 = an0Var.e;
                                        String str4 = an0Var.f;
                                        Font fontF = f(e(str3));
                                        if (fontF != null) {
                                            if (TextUtils.isEmpty(str4)) {
                                                fontFamilyBuild = new FontFamily.Builder(fontF).build();
                                            } else {
                                                try {
                                                    fontFamilyBuild = new FontFamily.Builder(d7.f(fontF).setFontVariationSettings(str4).build()).build();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            if (customFallbackBuilder == null) {
                                                customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                            } else {
                                                customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                            }
                                            i5++;
                                        }
                                    }
                                }
                                typefaceBuild = customFallbackBuilder.build();
                                break;
                            }
                        }
                        if (e(((an0) arrayList.get(i4)).e) != null) {
                            i4++;
                        }
                        typefaceBuild = null;
                        break;
                    }
                }
                typefaceBuild = e(((an0) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (rfVar != null) {
                    new Handler(Looper.getMainLooper()).post(new l7(rfVar, typefaceBuild, b2));
                }
                b.c(d(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr6 = !z ? rfVar != null : kn0Var.c != 0;
            int i6 = z ? kn0Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            xl1 xl1Var = new xl1((byte) 18, (boolean) (objArr5 == true ? 1 : 0));
            xl1Var.i = rfVar;
            ArrayList arrayList2 = kn0Var.a;
            zm zmVar = new zm(handler);
            ix0 ix0Var = new ix0(xl1Var, zmVar, (byte) 6, objArr4 == true ? 1 : 0);
            byte b4 = 3;
            if (objArr6 != true) {
                String strA = gn0.a(i3, arrayList2);
                Typeface typeface = (Typeface) gn0.a.b(strA);
                if (typeface != null) {
                    zmVar.execute(new z2(xl1Var, typeface, b4, objArr2 == true ? 1 : 0));
                    typefaceBuild2 = typeface;
                } else {
                    en0 en0Var = new en0(ix0Var, objArr == true ? 1 : 0);
                    synchronized (gn0.c) {
                        bj2 bj2Var = gn0.d;
                        ArrayList arrayList3 = (ArrayList) bj2Var.get(strA);
                        if (arrayList3 != null) {
                            arrayList3.add(en0Var);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(en0Var);
                            bj2Var.put(strA, arrayList4);
                            dn0 dn0Var = new dn0(strA, context, arrayList2, i3, (byte) 1);
                            ThreadPoolExecutor threadPoolExecutor = gn0.b;
                            en0 en0Var2 = new en0(strA, b3);
                            Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                            r82 r82Var = new r82();
                            r82Var.i = dn0Var;
                            r82Var.j = en0Var2;
                            r82Var.k = handler2;
                            threadPoolExecutor.execute(r82Var);
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    wg.m("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                an0 an0Var2 = (an0) arrayList2.get(0);
                hd1 hd1Var = gn0.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{an0Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = gn0.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) gn0.a.b(strA2);
                if (typeface2 != null) {
                    zmVar.execute(new z2(xl1Var, typeface2, b4, objArr3 == true ? 1 : 0));
                    typefaceBuild2 = typeface2;
                } else if (i6 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{an0Var2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    fn0 fn0VarB = gn0.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    ix0Var.N(fn0VarB);
                    typefaceBuild2 = fn0VarB.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    fn0 fn0Var = (fn0) gn0.b.submit(new dn0(strA2, context, an0Var2, i3, (byte) 0)).get(i6, TimeUnit.MILLISECONDS);
                                    ix0Var.N(fn0Var);
                                    typefaceBuild2 = fn0Var.a;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused3) {
                        ((zm) ix0Var.j).execute(new lq((xl1) ix0Var.i, -3));
                    }
                }
            }
        } else {
            in0 in0Var = (in0) hn0Var;
            a.getClass();
            try {
                FontFamily.Builder builder = null;
                for (jn0 jn0Var : in0Var.a) {
                    try {
                        try {
                            Font fontBuild = new Font.Builder(resources, jn0Var.e).setWeight(jn0Var.a).setSlant(jn0Var.b ? 1 : 0).setTtcIndex(jn0Var.d).setFontVariationSettings(jn0Var.c).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Exception unused4) {
                        }
                    } catch (IOException unused5) {
                    }
                }
                if (builder != null) {
                    FontFamily fontFamilyBuild2 = builder.build();
                    typefaceBuild2 = new Typeface.CustomFallbackBuilder(fontFamilyBuild2).setStyle(jy1.x(fontFamilyBuild2, i3).getStyle()).build();
                }
            } catch (Exception unused6) {
            }
            if (rfVar != null) {
                if (typefaceBuild2 != null) {
                    new Handler(Looper.getMainLooper()).post(new l7(rfVar, typefaceBuild2, b2));
                } else {
                    rfVar.a(-3);
                }
            }
        }
        if (typefaceBuild2 != null) {
            b.c(d(resources, i, str, i2, i3), typefaceBuild2);
        }
        return typefaceBuild2;
    }

    public static Typeface c(Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceBuild;
        a.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            b.c(d(resources, i, str, i2, i3), typefaceBuild);
        }
        return typefaceBuild;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface e(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font f(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
