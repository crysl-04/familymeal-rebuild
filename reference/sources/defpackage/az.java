package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class az {
    public boolean a;
    public Object b;

    public az(p4 p4Var) {
        this.b = p4Var;
        this.a = true;
    }

    public void a() {
        this.a = true;
    }

    public void b() {
        this.a = false;
    }

    public void c() {
        this.a = false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, long j2, n10 n10Var) {
        ge2 ge2Var;
        long jD;
        if (n10Var instanceof ge2) {
            ge2Var = (ge2) n10Var;
            int i = ge2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ge2Var.n = i - Integer.MIN_VALUE;
            } else {
                ge2Var = new ge2(this, n10Var);
            }
        } else {
            ge2Var = new ge2(this, n10Var);
        }
        Object objA = ge2Var.l;
        int i2 = ge2Var.n;
        if (i2 == 0) {
            m02.y(objA);
            jD = 0;
            if (this.a) {
                qe2 qe2Var = (qe2) this.b;
                if (!qe2Var.i) {
                    ge2Var.k = j2;
                    ge2Var.n = 1;
                    objA = qe2Var.a(j2, ge2Var);
                    y20 y20Var = y20.h;
                    if (objA == y20Var) {
                        return y20Var;
                    }
                }
                jD = a43.d(j2, jD);
            }
            return new a43(jD);
        }
        if (i2 != 1) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = ge2Var.k;
        m02.y(objA);
        jD = ((a43) objA).a;
        jD = a43.d(j2, jD);
        return new a43(jD);
    }

    public void e(byte b) {
        ((p4) this.b).i(String.valueOf(b));
    }

    public final void f(char c) {
        p4 p4Var = (p4) this.b;
        p4Var.e(p4Var.b, 1);
        char[] cArr = (char[]) p4Var.c;
        int i = p4Var.b;
        p4Var.b = i + 1;
        cArr[i] = c;
    }

    public void g(int i) {
        ((p4) this.b).i(String.valueOf(i));
    }

    public void h(long j) {
        ((p4) this.b).i(String.valueOf(j));
    }

    public void i(short s) {
        ((p4) this.b).i(String.valueOf(s));
    }

    public void j(String str) {
        byte b;
        str.getClass();
        p4 p4Var = (p4) this.b;
        p4Var.e(p4Var.b, str.length() + 2);
        char[] cArr = (char[]) p4Var.c;
        int i = p4Var.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            String[] strArr = ao2.a;
            if (c <= 31 || c == '\"' || c == '\\') {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    p4Var.e(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr = ao2.b;
                    if (cCharAt >= bArr.length || (b = bArr[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) p4Var.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = ao2.a[cCharAt];
                        str2.getClass();
                        p4Var.e(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) p4Var.c, i4);
                        int length3 = str2.length() + i4;
                        p4Var.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) p4Var.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        p4Var.b = i4;
                    }
                }
                p4Var.e(i4, 1);
                ((char[]) p4Var.c)[i4] = '\"';
                p4Var.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        p4Var.b = i3 + 1;
    }

    public az(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public az(e03 e03Var, int i) {
        this.b = e03Var;
        this.a = i;
    }

    public void k() {
    }

    public void l() {
    }
}
