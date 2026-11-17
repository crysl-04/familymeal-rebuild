package defpackage;

import android.content.res.TypedArray;
import androidx.sqlite.SQLiteStatement;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wi0 {
    public static final DateFormat a(int i, int i2, Locale locale) {
        if (i2 == 0) {
            i2 = 4;
        }
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            i3 = 3;
            if (i2 == 3) {
                i3 = 2;
            } else if (i2 != 4) {
                if (i2 != 5) {
                    throw null;
                }
                i3 = Integer.MAX_VALUE;
            }
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        if (x(i2) != 4) {
            int iX = x(i);
            if (iX != 0) {
                return iX != 2 ? DateFormat.getDateTimeInstance(i3, i3, locale) : DateFormat.getTimeInstance(i3, locale);
            }
            return DateFormat.getDateInstance(i3, locale);
        }
        int iX2 = x(i);
        if (iX2 != 0) {
            return iX2 != 2 ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") : new SimpleDateFormat("HH:mm:ss");
        }
        return new SimpleDateFormat("yyyy-MM-dd");
    }

    public static final NumberFormat b(int i, Locale locale) {
        int iX = x(i);
        if (iX == 0) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            return NumberFormat.getCurrencyInstance(locale);
        }
        if (iX == 2) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            return NumberFormat.getIntegerInstance(locale);
        }
        if (iX != 3) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            return NumberFormat.getInstance(locale);
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return NumberFormat.getPercentInstance(locale);
    }

    public static double c(k1 k1Var, int i, int i2, double d, double d2) {
        return (k1Var.J(i, i2) * d) + d2;
    }

    public static int d(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static a42 e(String str) {
        ax0.c(str);
        return new a42((byte) 3);
    }

    public static String f(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String g(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder j(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder k(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void m(int i, int i2, int i3, int i4, int i5) {
        lt.a(i);
        lt.a(i2);
        lt.a(i3);
        lt.a(i4);
        lt.a(i5);
    }

    public static void n(int i, nx nxVar, dr0 dr0Var, boolean z) {
        nxVar.f(dr0Var, Integer.valueOf(i));
        dr0Var.p(z);
    }

    public static void o(int i, dr0 dr0Var, int i2, yx yxVar) {
        dr0Var.f0(Integer.valueOf(i));
        dr0Var.b(yxVar, Integer.valueOf(i2));
    }

    public static void p(int i, dr0 dr0Var, yx yxVar, dr0 dr0Var2) {
        h12.y(yxVar, dr0Var, Integer.valueOf(i));
        h12.t(dr0Var2);
    }

    public static void q(long j, StringBuilder sb, String str) {
        sb.append((Object) kv.h(j));
        sb.append(str);
    }

    public static void r(eg egVar, long j) {
        egVar.g().i();
        egVar.H(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(SQLiteStatement sQLiteStatement) throws Exception {
        boolean zIsTerminated;
        if (sQLiteStatement instanceof AutoCloseable) {
            sQLiteStatement.close();
            return;
        }
        if (!(sQLiteStatement instanceof ExecutorService)) {
            if (sQLiteStatement instanceof TypedArray) {
                ((TypedArray) sQLiteStatement).recycle();
                return;
            } else {
                wg.f();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) sQLiteStatement;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj == null) {
            return;
        }
        li1.c();
    }

    public static void u(String str, String str2, na1 na1Var) {
        na1Var.add(new m32(str, str2));
    }

    public static void v(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static a42 w(String str) {
        dx0.b(str);
        return new a42((byte) 3);
    }

    public static /* synthetic */ int x(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }
}
