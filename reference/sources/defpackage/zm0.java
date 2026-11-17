package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class zm0 {
    public static final hd1 a = new hd1(2);
    public static final da b = new da(1);

    public static az a(Context context, List list) {
        az azVar;
        String str;
        Typeface typefaceE;
        p02.s("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                an0 an0Var = (an0) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceE = v03.e((str = an0Var.e))) == null || v03.f(typefaceE) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), an0Var, context.getResources());
                    if (providerInfoB == null) {
                        azVar = new az();
                        azVar.a = true;
                        azVar.b = Collections.singletonList(null);
                        return azVar;
                    }
                    arrayList.add(c(context, an0Var, providerInfoB.authority));
                } else {
                    arrayList.add(new sn0[]{new sn0(str, an0Var.f)});
                }
            }
            azVar = new az();
            azVar.a = false;
            azVar.b = arrayList;
            return azVar;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, an0 an0Var, Resources resources) {
        da daVar = b;
        hd1 hd1Var = a;
        p02.s("FontProvider.getProvider");
        try {
            List listB0 = an0Var.d;
            String str = an0Var.a;
            String str2 = an0Var.b;
            if (listB0 == null) {
                listB0 = lt.b0(resources, 0);
            }
            ym0 ym0Var = new ym0();
            ym0Var.a = str;
            ym0Var.b = str2;
            ym0Var.c = listB0;
            ProviderInfo providerInfoResolveContentProvider = (ProviderInfo) hd1Var.b(ym0Var);
            if (providerInfoResolveContentProvider == null) {
                providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
                if (providerInfoResolveContentProvider == null) {
                    throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
                }
                if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                    throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
                }
                Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Collections.sort(arrayList, daVar);
                for (int i = 0; i < listB0.size(); i++) {
                    ArrayList arrayList2 = new ArrayList((Collection) listB0.get(i));
                    Collections.sort(arrayList2, daVar);
                    if (arrayList.size() == arrayList2.size()) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                hd1Var.c(ym0Var, providerInfoResolveContentProvider);
                            } else {
                                if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                }
                Trace.endSection();
                return null;
            }
            Trace.endSection();
            return providerInfoResolveContentProvider;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static sn0[] c(Context context, an0 an0Var, String str) {
        String[] strArr;
        p02.s("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                p02.s("ContentQueryWrapper.query");
                try {
                    String str2 = an0Var.f;
                    String str3 = an0Var.c;
                    if (str2 == null) {
                        strArr = new String[]{str3};
                        break;
                    }
                    int length = str2.length();
                    int iCharCount = 0;
                    while (true) {
                        if (iCharCount >= length) {
                            strArr = new String[]{str3};
                            break;
                        }
                        int iCodePointAt = str2.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            strArr = new String[]{str3, "VF"};
                            break;
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                    String[] strArr3 = strArr;
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr2, "query = ?", strArr3, null, null);
                        } catch (RemoteException unused) {
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new sn0(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, an0Var.f, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (sn0[]) arrayList.toArray(new sn0[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
