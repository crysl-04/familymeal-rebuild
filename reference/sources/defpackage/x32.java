package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x32 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Context i;

    public /* synthetic */ x32(Context context, byte b) {
        this.h = b;
        this.i = context;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0174  */
    /* JADX WARN: Code duplicated, block: B:106:0x017d  */
    /* JADX WARN: Code duplicated, block: B:115:0x019d A[Catch: all -> 0x01e2, TryCatch #4 {all -> 0x01e2, blocks: (B:113:0x0197, B:115:0x019d, B:116:0x01a1, B:118:0x01a7, B:119:0x01ab, B:138:0x01e5, B:139:0x01ec), top: B:195:0x0197, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a7 A[Catch: all -> 0x01e2, LOOP:0: B:116:0x01a1->B:118:0x01a7, LOOP_END, TryCatch #4 {all -> 0x01e2, blocks: (B:113:0x0197, B:115:0x019d, B:116:0x01a1, B:118:0x01a7, B:119:0x01ab, B:138:0x01e5, B:139:0x01ec), top: B:195:0x0197, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0232  */
    /* JADX WARN: Code duplicated, block: B:192:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb A[Catch: all -> 0x00df, IOException | IllegalStateException -> 0x00e5, TRY_LEAVE, TryCatch #19 {IOException | IllegalStateException -> 0x00e5, blocks: (B:39:0x00c1, B:41:0x00cb, B:44:0x00d9, B:44:0x00d9, B:45:0x00de, B:45:0x00de), top: B:216:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9 A[Catch: all -> 0x00df, IOException | IllegalStateException -> 0x00e5, IOException | IllegalStateException -> 0x00e5, TRY_ENTER, TryCatch #19 {IOException | IllegalStateException -> 0x00e5, blocks: (B:39:0x00c1, B:41:0x00cb, B:44:0x00d9, B:44:0x00d9, B:45:0x00de, B:45:0x00de), top: B:216:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #1 {all -> 0x0120, blocks: (B:59:0x00fd, B:61:0x0109, B:64:0x0118, B:65:0x011d), top: B:192:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0118 A[Catch: all -> 0x0120, TRY_ENTER, TryCatch #1 {all -> 0x0120, blocks: (B:59:0x00fd, B:61:0x0109, B:64:0x0118, B:65:0x011d), top: B:192:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:74:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x012d A[Catch: IllegalStateException -> 0x0131, FileNotFoundException | IOException -> 0x0133, FileNotFoundException | IOException -> 0x0133, TRY_LEAVE, TryCatch #5 {IllegalStateException -> 0x0131, blocks: (B:57:0x00f5, B:62:0x0113, B:75:0x012d, B:73:0x012a, B:72:0x0127), top: B:196:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0136  */
    /* JADX WARN: Code duplicated, block: B:83:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0156 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #7 {all -> 0x0166, blocks: (B:87:0x014a, B:89:0x0156, B:92:0x015c), top: B:199:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:92:0x015c A[Catch: all -> 0x0166, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0166, blocks: (B:87:0x014a, B:89:0x0156, B:92:0x015c), top: B:199:0x014a }] */
    @Override // java.lang.Runnable
    public final void run() {
        FileInputStream fileInputStreamA;
        q90[] q90VarArrD;
        q90[] q90VarArr;
        q90[] q90VarArr2;
        byte[] bArr;
        byte[] bArr2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i;
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        p90 p90Var;
        FileInputStream fileInputStreamA2;
        byte b = this.h;
        Context context = this.i;
        byte b2 = 1;
        switch (b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new x32(context, b2));
                return;
            default:
                ug ugVar = new ug((byte) 1);
                Context applicationContext = context.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
                AssetManager assets = applicationContext.getAssets();
                String name = new File(applicationInfo.sourceDir).getName();
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                    File filesDir = context.getFilesDir();
                    File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                    if (file.exists()) {
                        try {
                            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                            try {
                                long j = dataInputStream.readLong();
                                dataInputStream.close();
                                if (j == packageInfo.lastUpdateTime) {
                                    context.getPackageName();
                                    z32.c(context, false);
                                    return;
                                }
                            } catch (Throwable th) {
                                try {
                                    dataInputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (IOException unused) {
                        }
                    }
                    context.getPackageName();
                    byte[] bArr4 = tz0.b0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
                    p90 p90Var2 = new p90(assets, ugVar, name, file2);
                    byte[] bArr5 = p90Var2.a;
                    if (bArr5 == null) {
                        p90Var2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
                    } else if (!file2.exists()) {
                        try {
                            if (!file2.createNewFile()) {
                                p90Var2.b(4, null);
                            } else {
                                p90Var2.d = true;
                                fileInputStreamA = p90Var2.a(assets, "dexopt/baseline.prof");
                                if (fileInputStreamA != null) {
                                    if (Arrays.equals(bArr4, cu.S(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    q90VarArrD = tz0.D(fileInputStreamA, cu.S(fileInputStreamA, 4), p90Var2.c);
                                    fileInputStreamA.close();
                                    p90Var2.e = q90VarArrD;
                                }
                                q90VarArr = p90Var2.e;
                                if (q90VarArr != null) {
                                    fileInputStreamA2 = p90Var2.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA2 != null) {
                                        if (fileInputStreamA2 != null) {
                                            fileInputStreamA2.close();
                                        }
                                        p90Var = null;
                                    } else {
                                        if (!Arrays.equals(tz0.c0, cu.S(fileInputStreamA2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        p90Var2.e = tz0.A(fileInputStreamA2, cu.S(fileInputStreamA2, 4), bArr5, q90VarArr);
                                        fileInputStreamA2.close();
                                        p90Var = p90Var2;
                                    }
                                    if (p90Var != null) {
                                        p90Var2 = p90Var;
                                    }
                                }
                                q90VarArr2 = p90Var2.e;
                                bArr = p90Var2.a;
                                if (q90VarArr2 != null) {
                                    if (!p90Var2.d) {
                                        li1.g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        return;
                                    }
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (tz0.K(byteArrayOutputStream, bArr, q90VarArr2)) {
                                        p90Var2.f = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        p90Var2.e = null;
                                    } else {
                                        p90Var2.e = null;
                                        byteArrayOutputStream.close();
                                    }
                                }
                                bArr2 = p90Var2.f;
                                if (bArr2 != null) {
                                    if (!p90Var2.d) {
                                        li1.g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        return;
                                    }
                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    fileOutputStream = new FileOutputStream(p90Var2.b);
                                    channel = fileOutputStream.getChannel();
                                    fileLockTryLock = channel.tryLock();
                                    if (fileLockTryLock != null) {
                                        if (fileLockTryLock.isValid()) {
                                            bArr3 = new byte[512];
                                            while (true) {
                                                i = byteArrayInputStream.read(bArr3);
                                                if (i > 0) {
                                                    fileOutputStream.write(bArr3, 0, i);
                                                } else {
                                                    p90Var2.b(1, null);
                                                    fileLockTryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    p90Var2.f = null;
                                                    p90Var2.e = null;
                                                    dataOutputStream = new DataOutputStream(new FileOutputStream(new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
                                                    dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                                                    dataOutputStream.close();
                                                }
                                            }
                                        }
                                    }
                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                }
                            }
                        } catch (IOException unused2) {
                            p90Var2.b(4, null);
                        }
                        break;
                    } else if (file2.canWrite()) {
                        p90Var2.d = true;
                        try {
                            fileInputStreamA = p90Var2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException | IOException unused3) {
                            fileInputStreamA = null;
                        }
                        if (fileInputStreamA != null) {
                            try {
                                try {
                                    try {
                                        if (Arrays.equals(bArr4, cu.S(fileInputStreamA, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        q90VarArrD = tz0.D(fileInputStreamA, cu.S(fileInputStreamA, 4), p90Var2.c);
                                        try {
                                            fileInputStreamA.close();
                                            break;
                                        } catch (IOException unused4) {
                                        }
                                        p90Var2.e = q90VarArrD;
                                    } catch (IOException | IllegalStateException unused5) {
                                        fileInputStreamA.close();
                                        q90VarArrD = null;
                                        p90Var2.e = q90VarArrD;
                                        q90VarArr = p90Var2.e;
                                        if (q90VarArr != null) {
                                            try {
                                                try {
                                                    fileInputStreamA2 = p90Var2.a(assets, "dexopt/baseline.profm");
                                                    if (fileInputStreamA2 != null) {
                                                        try {
                                                            if (!Arrays.equals(tz0.c0, cu.S(fileInputStreamA2, 4))) {
                                                                throw new IllegalStateException("Invalid magic");
                                                            }
                                                            p90Var2.e = tz0.A(fileInputStreamA2, cu.S(fileInputStreamA2, 4), bArr5, q90VarArr);
                                                            fileInputStreamA2.close();
                                                            p90Var = p90Var2;
                                                        } catch (Throwable th3) {
                                                            try {
                                                                fileInputStreamA2.close();
                                                                throw th3;
                                                            } catch (Throwable th4) {
                                                                th3.addSuppressed(th4);
                                                                throw th3;
                                                            }
                                                        }
                                                    } else {
                                                        if (fileInputStreamA2 != null) {
                                                            fileInputStreamA2.close();
                                                        }
                                                        p90Var = null;
                                                    }
                                                } catch (IllegalStateException unused6) {
                                                    p90Var2.e = null;
                                                }
                                            } catch (FileNotFoundException | IOException unused7) {
                                            }
                                            if (p90Var != null) {
                                                p90Var2 = p90Var;
                                            }
                                        }
                                        q90VarArr2 = p90Var2.e;
                                        bArr = p90Var2.a;
                                        if (q90VarArr2 != null) {
                                            if (!p90Var2.d) {
                                                li1.g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                                return;
                                            }
                                            try {
                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                try {
                                                    byteArrayOutputStream.write(bArr4);
                                                    byteArrayOutputStream.write(bArr);
                                                    if (tz0.K(byteArrayOutputStream, bArr, q90VarArr2)) {
                                                        p90Var2.e = null;
                                                        byteArrayOutputStream.close();
                                                    } else {
                                                        p90Var2.f = byteArrayOutputStream.toByteArray();
                                                        byteArrayOutputStream.close();
                                                        p90Var2.e = null;
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        byteArrayOutputStream.close();
                                                        throw th5;
                                                    } catch (Throwable th6) {
                                                        th5.addSuppressed(th6);
                                                        throw th5;
                                                    }
                                                }
                                            } catch (IOException | IllegalStateException unused8) {
                                            }
                                        }
                                        bArr2 = p90Var2.f;
                                        if (bArr2 != null) {
                                            try {
                                                if (!p90Var2.d) {
                                                    li1.g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                                    return;
                                                }
                                                try {
                                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                    try {
                                                        fileOutputStream = new FileOutputStream(p90Var2.b);
                                                        try {
                                                            channel = fileOutputStream.getChannel();
                                                            try {
                                                                fileLockTryLock = channel.tryLock();
                                                                if (fileLockTryLock != null) {
                                                                    try {
                                                                        if (fileLockTryLock.isValid()) {
                                                                            bArr3 = new byte[512];
                                                                            while (true) {
                                                                                i = byteArrayInputStream.read(bArr3);
                                                                                if (i > 0) {
                                                                                    fileOutputStream.write(bArr3, 0, i);
                                                                                } else {
                                                                                    p90Var2.b(1, null);
                                                                                    fileLockTryLock.close();
                                                                                    channel.close();
                                                                                    fileOutputStream.close();
                                                                                    byteArrayInputStream.close();
                                                                                    p90Var2.f = null;
                                                                                    p90Var2.e = null;
                                                                                    try {
                                                                                        dataOutputStream = new DataOutputStream(new FileOutputStream(new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
                                                                                        try {
                                                                                            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                                                                                            dataOutputStream.close();
                                                                                        } catch (Throwable th7) {
                                                                                            try {
                                                                                                dataOutputStream.close();
                                                                                                throw th7;
                                                                                            } catch (Throwable th8) {
                                                                                                th7.addSuppressed(th8);
                                                                                                throw th7;
                                                                                            }
                                                                                        }
                                                                                    } catch (IOException unused9) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (Throwable th9) {
                                                                        if (fileLockTryLock == null) {
                                                                            throw th9;
                                                                        }
                                                                        try {
                                                                            fileLockTryLock.close();
                                                                            throw th9;
                                                                        } catch (Throwable th10) {
                                                                            th9.addSuppressed(th10);
                                                                            throw th9;
                                                                        }
                                                                        try {
                                                                            fileOutputStream.close();
                                                                            throw th;
                                                                        } catch (Throwable th11) {
                                                                            th.addSuppressed(th11);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                }
                                                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                            } catch (Throwable th12) {
                                                                if (channel == null) {
                                                                    throw th12;
                                                                }
                                                                try {
                                                                    channel.close();
                                                                    throw th12;
                                                                } catch (Throwable th13) {
                                                                    th12.addSuppressed(th13);
                                                                    throw th12;
                                                                }
                                                                try {
                                                                    byteArrayInputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th14) {
                                                                    th.addSuppressed(th14);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th15) {
                                                            fileOutputStream.close();
                                                            throw th15;
                                                        }
                                                    } catch (Throwable th16) {
                                                        byteArrayInputStream.close();
                                                        throw th16;
                                                    }
                                                } catch (FileNotFoundException e) {
                                                    p90Var2.b(6, e);
                                                    p90Var2.f = null;
                                                    p90Var2.e = null;
                                                } catch (IOException e2) {
                                                    p90Var2.b(7, e2);
                                                    p90Var2.f = null;
                                                    p90Var2.e = null;
                                                }
                                            } catch (Throwable th17) {
                                                p90Var2.f = null;
                                                p90Var2.e = null;
                                                throw th17;
                                            }
                                        }
                                        z32.c(context, false);
                                        return;
                                    }
                                } catch (IOException unused10) {
                                    q90VarArrD = null;
                                }
                            } catch (Throwable th18) {
                                try {
                                    fileInputStreamA.close();
                                    throw th18;
                                } catch (IOException unused11) {
                                    throw th18;
                                }
                            }
                        }
                        q90VarArr = p90Var2.e;
                        if (q90VarArr != null && Build.VERSION.SDK_INT >= 31) {
                            fileInputStreamA2 = p90Var2.a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamA2 != null) {
                                if (fileInputStreamA2 != null) {
                                    fileInputStreamA2.close();
                                }
                                p90Var = null;
                            } else {
                                if (!Arrays.equals(tz0.c0, cu.S(fileInputStreamA2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                p90Var2.e = tz0.A(fileInputStreamA2, cu.S(fileInputStreamA2, 4), bArr5, q90VarArr);
                                fileInputStreamA2.close();
                                p90Var = p90Var2;
                            }
                            if (p90Var != null) {
                                p90Var2 = p90Var;
                            }
                        }
                        q90VarArr2 = p90Var2.e;
                        bArr = p90Var2.a;
                        if (q90VarArr2 != null && bArr != null) {
                            if (!p90Var2.d) {
                                li1.g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr4);
                            byteArrayOutputStream.write(bArr);
                            if (tz0.K(byteArrayOutputStream, bArr, q90VarArr2)) {
                                p90Var2.e = null;
                                byteArrayOutputStream.close();
                            } else {
                                p90Var2.f = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                p90Var2.e = null;
                            }
                        }
                        bArr2 = p90Var2.f;
                        if (bArr2 != null) {
                            if (!p90Var2.d) {
                                li1.g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                            fileOutputStream = new FileOutputStream(p90Var2.b);
                            channel = fileOutputStream.getChannel();
                            fileLockTryLock = channel.tryLock();
                            if (fileLockTryLock != null) {
                                if (fileLockTryLock.isValid()) {
                                    bArr3 = new byte[512];
                                    while (true) {
                                        i = byteArrayInputStream.read(bArr3);
                                        if (i > 0) {
                                            fileOutputStream.write(bArr3, 0, i);
                                        } else {
                                            p90Var2.b(1, null);
                                            fileLockTryLock.close();
                                            channel.close();
                                            fileOutputStream.close();
                                            byteArrayInputStream.close();
                                            p90Var2.f = null;
                                            p90Var2.e = null;
                                            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
                                            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                                            dataOutputStream.close();
                                        }
                                    }
                                }
                            }
                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                        }
                    } else {
                        p90Var2.b(4, null);
                    }
                    z32.c(context, false);
                    return;
                } catch (PackageManager.NameNotFoundException unused12) {
                    z32.c(context, false);
                    return;
                }
        }
    }
}
