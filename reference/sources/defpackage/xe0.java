package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 {
    public final rf a;
    public int b;
    public int c;
    public int d;
    public int e;

    public xe0(od odVar, long j) {
        String str = odVar.i;
        rf rfVar = new rf();
        rfVar.d = str;
        rfVar.b = -1;
        rfVar.c = -1;
        this.a = rfVar;
        this.b = qw2.f(j);
        this.c = qw2.e(j);
        this.d = -1;
        this.e = -1;
        int iF = qw2.f(j);
        int iE = qw2.e(j);
        if (iF < 0 || iF > str.length()) {
            wg.i(wi0.f(iF, str.length(), "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            wg.i(wi0.f(iE, str.length(), "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        wg.m(wi0.f(iF, iE, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jA = m02.a(i, i2);
        this.a.m("", i, i2);
        long jU = vs.U(m02.a(this.b, this.c), jA);
        h(qw2.f(jU));
        g(qw2.e(jU));
        int i3 = this.d;
        if (i3 != -1) {
            long jU2 = vs.U(m02.a(i3, this.e), jA);
            if (qw2.c(jU2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = qw2.f(jU2);
                this.e = qw2.e(jU2);
            }
        }
    }

    public final char b(int i) {
        rf rfVar = this.a;
        yq0 yq0Var = (yq0) rfVar.e;
        if (yq0Var == null) {
            return ((String) rfVar.d).charAt(i);
        }
        if (i < rfVar.b) {
            return ((String) rfVar.d).charAt(i);
        }
        int iB = yq0Var.b - yq0Var.b();
        int i2 = rfVar.b;
        if (i >= iB + i2) {
            return ((String) rfVar.d).charAt(i - ((iB - rfVar.c) + i2));
        }
        int i3 = i - i2;
        int i4 = yq0Var.c;
        char[] cArr = (char[]) yq0Var.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + yq0Var.d];
    }

    public final qw2 c() {
        int i = this.d;
        if (i != -1) {
            return new qw2(m02.a(i, this.e));
        }
        return null;
    }

    public final void d(String str, int i, int i2) {
        rf rfVar = this.a;
        if (i < 0 || i > rfVar.c()) {
            wg.i(wi0.f(i, rfVar.c(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > rfVar.c()) {
            wg.i(wi0.f(i2, rfVar.c(), "end (", ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            wg.m(wi0.f(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        rfVar.m(str, i, i2);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        rf rfVar = this.a;
        if (i < 0 || i > rfVar.c()) {
            wg.i(wi0.f(i, rfVar.c(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > rfVar.c()) {
            wg.i(wi0.f(i2, rfVar.c(), "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            wg.m(wi0.f(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        rf rfVar = this.a;
        if (i < 0 || i > rfVar.c()) {
            wg.i(wi0.f(i, rfVar.c(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > rfVar.c()) {
            wg.i(wi0.f(i2, rfVar.c(), "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            wg.m(wi0.f(i, i2, "Do not set reversed range: ", " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            bx0.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            bx0.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
