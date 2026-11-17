package defpackage;

import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface cl {
    public static final bl a = new bl(System.out);
    public static final bl b = new bl(System.err);
    public static final al c = new al();

    static void b(Throwable th, String str, Object... objArr) {
        bl blVar = b;
        if (blVar != null) {
            PrintWriter printWriter = blVar.h;
            printWriter.append((CharSequence) pz1.m(str, objArr).toString());
            blVar.a();
            th.printStackTrace(printWriter);
        }
    }

    void a();

    void c(String str);

    default void println(String str) {
        c(str);
        a();
    }
}
