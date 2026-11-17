package defpackage;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bl extends Writer implements cl {
    public final PrintWriter h;

    public bl(PrintStream printStream) {
        this.h = new PrintWriter((OutputStream) printStream, true);
    }

    @Override // defpackage.cl
    public final void a() {
        this.h.println();
    }

    @Override // defpackage.cl
    public final void c(String str) {
        this.h.append((CharSequence) str.toString());
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.h.flush();
    }

    @Override // defpackage.cl
    public final void println(String str) {
        this.h.println((Object) str);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        this.h.write(cArr, i, i2);
    }
}
