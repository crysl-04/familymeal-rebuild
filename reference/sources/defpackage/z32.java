package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class z32 {
    public static final t82 a = new t82();
    public static final Object b = new Object();
    public static jy1 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? b2.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static jy1 b() {
        jy1 jy1Var = new jy1((byte) 6);
        c = jy1Var;
        t82 t82Var = a;
        t82Var.getClass();
        if (p0.m.h(t82Var, null, jy1Var)) {
            p0.b(t82Var);
        }
        return c;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    /* JADX WARN: Code duplicated, block: B:32:0x0042 A[Catch: all -> 0x00ff, TryCatch #6 {, blocks: (B:8:0x000b, B:10:0x000f, B:13:0x0015, B:19:0x002a, B:30:0x003c, B:32:0x0042, B:33:0x0045, B:35:0x0048, B:41:0x006b, B:47:0x008e, B:48:0x0092, B:50:0x00a3, B:58:0x00b1, B:60:0x00b7, B:74:0x00d2, B:77:0x00d8, B:80:0x00df, B:82:0x00ea, B:85:0x00f3, B:86:0x00f6, B:84:0x00f0, B:52:0x00a8, B:53:0x00ab, B:88:0x00f8, B:89:0x00fb, B:28:0x003a, B:27:0x0037), top: B:107:0x000b, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0048 A[Catch: all -> 0x00ff, TryCatch #6 {, blocks: (B:8:0x000b, B:10:0x000f, B:13:0x0015, B:19:0x002a, B:30:0x003c, B:32:0x0042, B:33:0x0045, B:35:0x0048, B:41:0x006b, B:47:0x008e, B:48:0x0092, B:50:0x00a3, B:58:0x00b1, B:60:0x00b7, B:74:0x00d2, B:77:0x00d8, B:80:0x00df, B:82:0x00ea, B:85:0x00f3, B:86:0x00f6, B:84:0x00f0, B:52:0x00a8, B:53:0x00ab, B:88:0x00f8, B:89:0x00fb, B:28:0x003a, B:27:0x0037), top: B:107:0x000b, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:98:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void c(Context context, boolean z) {
        int i;
        boolean z2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        y32 y32VarA;
        y32 y32Var;
        int i2;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || c == null) {
            synchronized (b) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    if (Build.VERSION.SDK_INT == 30) {
                        b();
                        return;
                    }
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    long jA = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        y32VarA = y32.a(file3);
                    } else {
                        y32VarA = null;
                    }
                    if (y32VarA == null) {
                        if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z) {
                        i = 2;
                    }
                    if (y32VarA != null) {
                        i = 3;
                    }
                    y32Var = new y32(jA, length, 1, i);
                    if (y32VarA != null) {
                        y32Var.b(file3);
                    } else {
                        y32Var.b(file3);
                    }
                    b();
                    return;
                }
                if (c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                if (Build.VERSION.SDK_INT == 30) {
                    b();
                    return;
                }
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                try {
                    long jA2 = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            y32VarA = y32.a(file3);
                        } catch (IOException unused2) {
                            b();
                            return;
                        }
                    } else {
                        y32VarA = null;
                    }
                    if (y32VarA == null && y32VarA.c == jA2 && (i2 = y32VarA.b) != 2) {
                        i = i2;
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z && z4 && i != 1) {
                        i = 2;
                    }
                    if (y32VarA != null && y32VarA.b == 2 && i == 1 && length3 < y32VarA.d) {
                        i = 3;
                    }
                    y32Var = new y32(jA2, length, 1, i);
                    if (y32VarA != null || !y32VarA.equals(y32Var)) {
                        try {
                            y32Var.b(file3);
                        } catch (IOException unused3) {
                        }
                    }
                    b();
                    return;
                } catch (PackageManager.NameNotFoundException unused4) {
                    b();
                    return;
                }
                throw th;
            }
        }
    }
}
