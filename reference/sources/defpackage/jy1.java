package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class jy1 implements zz1, uc2, d30, rd2, oi0, ni0, e3, n20 {
    public static jy1 i;
    public final /* synthetic */ byte h;

    public jy1() {
        this.h = (byte) 28;
    }

    public static int B(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Typeface v(String str, qn0 qn0Var, int i2) {
        if (i2 == 0 && uz0.g(qn0Var, qn0.j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i2 == 0 && uz0.g(qn0Var, qn0.l) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), qn0Var.h, i2 == 1);
    }

    public static Font x(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iB = B(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int iB2 = B(fontStyle, font2.getStyle());
            if (iB2 < iB) {
                font = font2;
                iB = iB2;
            }
        }
        return font;
    }

    public static cf2 y(String str) {
        Object next;
        str.getClass();
        lh0 lh0Var = cf2.n;
        lh0Var.getClass();
        z zVar = new z(lh0Var, (byte) 0);
        do {
            if (!zVar.hasNext()) {
                next = null;
                break;
            }
            next = zVar.next();
        } while (!((cf2) next).h.equals(str));
        cf2 cf2Var = (cf2) next;
        if (cf2Var != null) {
            return cf2Var;
        }
        wg.m("Unknown season: ".concat(str));
        return null;
    }

    public Font A(sn0 sn0Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    public void C(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // defpackage.ni0
    public final mi0 a(long j, long j2) {
        g52 g52Var = l52.q;
        return new qm2(Math.toIntExact(j), Math.toIntExact(j2));
    }

    @Override // defpackage.uc2
    public final vc2 c() {
        return l42.n;
    }

    @Override // defpackage.uc2
    public final vc2 e(Comparable comparable) {
        if (comparable == null) {
            return l42.p;
        }
        return comparable instanceof l42 ? (l42) comparable : l42.s(pz1.C(comparable));
    }

    @Override // defpackage.uc2
    public final Comparable f(double d) {
        return l42.r(d);
    }

    @Override // defpackage.uc2
    public final double g() {
        return 4.930380657631324E-32d;
    }

    @Override // defpackage.uc2
    public final vc2 k() {
        return l42.p;
    }

    @Override // defpackage.qi0
    public final je1 l() {
        g52 g52Var = l52.q;
        return je1.n;
    }

    @Override // defpackage.uc2
    public final Comparable n(Comparable comparable) {
        if (comparable == null) {
            return l42.p;
        }
        return comparable instanceof l42 ? (l42) comparable : l42.s(pz1.C(comparable));
    }

    @Override // defpackage.uc2
    public final vc2 s(double d) {
        return l42.r(d);
    }

    public final String toString() {
        switch (this.h) {
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                int iHashCode = hashCode();
                vs.r(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return jp1.k("CreationExtras.Key@", string, "<", z72.a(dc2.class).c(), ">");
            case 10:
                int iHashCode2 = hashCode();
                vs.r(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return jp1.k("CreationExtras.Key@", string2, "<", z72.a(h53.class).c(), ">");
            case 11:
                int iHashCode3 = hashCode();
                vs.r(16);
                String string3 = Integer.toString(iHashCode3, 16);
                string3.getClass();
                return jp1.k("CreationExtras.Key@", string3, "<", z72.a(Bundle.class).c(), ">");
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            default:
                return super.toString();
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return "SharingStarted.Eagerly";
            case 17:
                return "SharingStarted.Lazily";
            case 19:
                return "ReusedSlotId";
        }
    }

    public final Typeface w(Context context, List list, int i2) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyZ = z((sn0[]) list.get(0), contentResolver);
            if (fontFamilyZ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyZ);
            for (int i3 = 1; i3 < list.size(); i3++) {
                FontFamily fontFamilyZ2 = z((sn0[]) list.get(i3), contentResolver);
                if (fontFamilyZ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyZ2);
                }
            }
            return customFallbackBuilder.setStyle(x(fontFamilyZ, i2).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final FontFamily z(sn0[] sn0VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (sn0 sn0Var : sn0VarArr) {
            if (Objects.equals(sn0Var.a.getScheme(), "systemfont")) {
                fontBuild = A(sn0Var);
            } else {
                try {
                    Uri uri = sn0Var.a;
                    String str = sn0Var.e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(sn0Var.c).setSlant(sn0Var.d ? 1 : 0).setTtcIndex(sn0Var.b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public /* synthetic */ jy1(Object obj, byte b) {
        this.h = b;
    }

    public /* synthetic */ jy1(byte b) {
        this.h = b;
    }

    @Override // defpackage.rd2
    public final void onScrollLimit(int i2, int i3, int i4, boolean z) {
    }

    @Override // defpackage.rd2
    public final void onScrollProgress(int i2, int i3, int i4, int i5) {
    }
}
