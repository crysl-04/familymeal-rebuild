package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gn0 {
    public static final hd1 a = new hd1(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final bj2 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new q82());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new bj2();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((an0) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[EDGE_INSN: B:21:0x0040->B:26:0x004a BREAK  A[LOOP:0: B:17:0x0036->B:23:0x0044]] */
    public static fn0 b(String str, Context context, List list, int i) {
        fn0 fn0Var;
        int i2;
        Typeface typefaceA;
        hd1 hd1Var = a;
        p02.s("getFontSync");
        try {
            Typeface typeface = (Typeface) hd1Var.b(str);
            if (typeface != null) {
                fn0Var = new fn0(typeface);
            } else {
                try {
                    az azVarA = zm0.a(context, list);
                    List list2 = (List) azVarA.b;
                    boolean z = azVarA.a;
                    if (!z) {
                        sn0[] sn0VarArr = (sn0[]) list2.get(0);
                        if (sn0VarArr == null || sn0VarArr.length == 0) {
                            i2 = 1;
                        } else {
                            int length = sn0VarArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i2 = 0;
                                    break;
                                }
                                int i4 = sn0VarArr[i3].f;
                                if (i4 != 0) {
                                    if (i4 >= 0) {
                                        i2 = i4;
                                        break;
                                    }
                                    i2 = -3;
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        if (!z) {
                            i2 = -3;
                            break;
                        }
                        i2 = -2;
                    }
                    if (i2 != 0) {
                        fn0Var = new fn0(i2);
                    } else {
                        if (list2.size() > 1) {
                            jy1 jy1Var = v03.a;
                            p02.s("TypefaceCompat.createFromFontInfoWithFallback");
                            try {
                                typefaceA = v03.a.w(context, list2, i);
                                Trace.endSection();
                            } finally {
                            }
                        } else {
                            typefaceA = v03.a(context, (sn0[]) list2.get(0), i);
                        }
                        if (typefaceA != null) {
                            hd1Var.c(str, typefaceA);
                            fn0Var = new fn0(typefaceA);
                        } else {
                            fn0Var = new fn0(-3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    fn0Var = new fn0(-1);
                }
            }
            return fn0Var;
        } finally {
            Trace.endSection();
        }
    }
}
