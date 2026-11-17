package kotlinx.serialization.json.internal;

import defpackage.a21;
import defpackage.c11;
import defpackage.c5;
import defpackage.co2;
import defpackage.cy1;
import defpackage.d21;
import defpackage.dv;
import defpackage.f21;
import defpackage.fe;
import defpackage.h12;
import defpackage.h7;
import defpackage.hz;
import defpackage.i12;
import defpackage.ia2;
import defpackage.iv;
import defpackage.j21;
import defpackage.jy1;
import defpackage.k11;
import defpackage.kg1;
import defpackage.l11;
import defpackage.ls;
import defpackage.lt;
import defpackage.n11;
import defpackage.o11;
import defpackage.om0;
import defpackage.ou;
import defpackage.p11;
import defpackage.r21;
import defpackage.rh2;
import defpackage.s60;
import defpackage.t81;
import defpackage.v60;
import defpackage.wh2;
import defpackage.wn2;
import defpackage.x11;
import defpackage.z72;
import defpackage.ze0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7 implements v60, hz {
    public final c11 f0;
    public final t81 g0;
    public final fe h0;
    public final jy1 i0;
    public int j0;
    public final p11 k0;

    public a(c11 c11Var, t81 t81Var, fe feVar, rh2 rh2Var) {
        rh2Var.getClass();
        this.f0 = c11Var;
        this.g0 = t81Var;
        this.h0 = feVar;
        this.i0 = c11Var.b;
        this.j0 = -1;
        this.k0 = c11Var.a.c ? null : new p11(rh2Var);
    }

    @Override // defpackage.h7, defpackage.v60
    public final short A() {
        fe feVar = this.h0;
        long jI = feVar.i();
        short s = (short) jI;
        if (jI == s) {
            return s;
        }
        fe.m(feVar, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.h7, defpackage.v60
    public final String B() {
        return this.h0.j();
    }

    @Override // defpackage.h7, defpackage.v60
    public final float C() {
        fe feVar = this.h0;
        String strK = feVar.k();
        try {
            float f = Float.parseFloat(strK);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            fe.m(feVar, lt.U(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            fe.m(feVar, "Failed to parse type 'float' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.h7, defpackage.v60
    public final hz D(rh2 rh2Var) {
        rh2Var.getClass();
        c11 c11Var = this.f0;
        t81 t81VarV = ls.V(c11Var, rh2Var);
        fe feVar = this.h0;
        d21 d21Var = (d21) feVar.d;
        int i = d21Var.e + 1;
        d21Var.e = i;
        short s = d21Var.a;
        if (i >= s) {
            ou.C(s);
            throw null;
        }
        if (i == d21Var.c.length) {
            d21Var.b();
        }
        d21Var.c[i] = rh2Var;
        feVar.h(t81VarV.h);
        if (feVar.v() == 4) {
            fe.m(feVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = t81VarV.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new a(c11Var, t81VarV, feVar, rh2Var);
        }
        return (this.g0 == t81VarV && c11Var.a.c) ? this : new a(c11Var, t81VarV, feVar, rh2Var);
    }

    @Override // defpackage.h7, defpackage.v60
    public final double E() {
        fe feVar = this.h0;
        String strK = feVar.k();
        try {
            double d = Double.parseDouble(strK);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            fe.m(feVar, lt.U(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            fe.m(feVar, "Failed to parse type 'double' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x013b  */
    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x013c, please report this as an issue */
    @Override // defpackage.v60
    public final Object a(r21 r21Var) {
        String message;
        String strB;
        c11 c11Var = this.f0;
        fe feVar = this.h0;
        d21 d21Var = (d21) feVar.d;
        r21Var.getClass();
        try {
            if (!(r21Var instanceof i12)) {
                return r21Var.a(this);
            }
            String strU = feVar.u(h12.f(c11Var, ((i12) r21Var).d()));
            if (strU != null) {
                try {
                    cy1.t((i12) r21Var, this, strU);
                    throw null;
                } catch (wh2 e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    int iU = co2.U(message2, '\n', 0, 6);
                    if (iU != -1) {
                        message2 = message2.substring(0, iU);
                    }
                    if (co2.S(message2, ".")) {
                        message2 = message2.substring(0, message2.length() - 1);
                    }
                    String message3 = e.getMessage();
                    message3.getClass();
                    int iU2 = co2.U(message3, '\n', 0, 6);
                    fe.m(feVar, message2, 0, iU2 != -1 ? message3.substring(iU2 + 1, message3.length()) : "", 2);
                    throw null;
                }
            }
            String strF = h12.f(c11Var, ((i12) r21Var).d());
            n11 n11VarQ0 = q0();
            String strB2 = ((i12) r21Var).d().b();
            if (!(n11VarQ0 instanceof a21)) {
                throw new l11(lt.z(-1, "Expected " + z72.a(a21.class).c() + ", but had " + z72.a(n11VarQ0.getClass()).c() + " as the serialized body of " + strB2, d21Var.a(), null, c11Var.a.h ? lt.R(-1, n11VarQ0.toString()).toString() : null));
            }
            a21 a21Var = (a21) n11VarQ0;
            n11 n11Var = (n11) a21Var.get(strF);
            if (n11Var != null) {
                f21 f21VarA = o11.a(n11Var);
                if (f21VarA instanceof x11) {
                    strB = null;
                } else {
                    strB = f21VarA.b();
                }
            } else {
                strB = null;
            }
            try {
                cy1.t((i12) r21Var, this, strB);
                throw null;
            } catch (wh2 e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw new l11(lt.z(-1, message4, null, null, c11Var.a.h ? lt.R(-1, a21Var.toString()).toString() : null));
            }
            message = e.getMessage();
            message.getClass();
            if (co2.Q(message, "at path", false)) {
                throw e;
            }
            throw new kg1(e.getMessage() + " at path: " + d21Var.a(), e, e.h, e.i);
        } catch (kg1 e3) {
            message = e3.getMessage();
            message.getClass();
            if (co2.Q(message, "at path", false)) {
                throw e3;
            }
            throw new kg1(e3.getMessage() + " at path: " + d21Var.a(), e3, e3.h, e3.i);
        }
    }

    @Override // defpackage.h7, defpackage.v60
    public final long b() {
        return this.h0.i();
    }

    @Override // defpackage.h7, defpackage.v60
    public final boolean d() {
        boolean z;
        boolean z2;
        fe feVar = this.h0;
        int iE = feVar.E();
        String str = (String) feVar.g;
        if (iE == str.length()) {
            fe.m(feVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iE) == '\"') {
            iE++;
            z = true;
        } else {
            z = false;
        }
        int iX = feVar.x(iE);
        if (iX >= str.length() || iX == -1) {
            fe.m(feVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iX + 1;
        int iCharAt = str.charAt(iX) | ' ';
        if (iCharAt == 102) {
            feVar.d(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                fe.m(feVar, "Expected valid boolean literal prefix, but had '" + feVar.k() + '\'', 0, null, 6);
                throw null;
            }
            feVar.d(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (feVar.b == str.length()) {
            fe.m(feVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(feVar.b) == '\"') {
            feVar.b++;
            return z2;
        }
        fe.m(feVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.h7, defpackage.v60
    public final boolean e() {
        boolean z;
        p11 p11Var = this.k0;
        if (!(p11Var != null ? p11Var.b : false)) {
            fe feVar = this.h0;
            int iX = feVar.x(feVar.E());
            String str = (String) feVar.g;
            int length = str.length() - iX;
            if (length >= 4 && iX != -1) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        if (length <= 4 || s60.k(str.charAt(iX + 4)) != 0) {
                            feVar.b = iX + 4;
                            z = true;
                            break;
                        }
                    } else if ("null".charAt(i) == str.charAt(iX + i)) {
                        i++;
                    }
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h7, defpackage.v60
    public final char f() {
        fe feVar = this.h0;
        String strK = feVar.k();
        if (strK.length() == 1) {
            return strK.charAt(0);
        }
        fe.m(feVar, "Expected single char, but got '" + strK + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String, java.lang.Throwable] */
    @Override // defpackage.hz
    public final int h(rh2 rh2Var) throws Throwable {
        fe feVar = this.h0;
        d21 d21Var = (d21) feVar.d;
        rh2Var.getClass();
        t81 t81Var = this.g0;
        int iOrdinal = t81Var.ordinal();
        Throwable th = null;
        char c = ':';
        int i = 0;
        zF = false;
        boolean zF = false;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zF2 = feVar.F();
            while (true) {
                boolean zC = feVar.c();
                p11 p11Var = this.k0;
                if (zC) {
                    String strE = feVar.e();
                    feVar.h(c);
                    c11 c11Var = this.f0;
                    int iK = ia2.k(rh2Var, c11Var, strE);
                    Throwable th2 = th;
                    if (iK != -3) {
                        if (p11Var != null) {
                            ze0 ze0Var = p11Var.a;
                            if (iK < 64) {
                                ze0Var.c |= 1 << iK;
                            } else {
                                int i3 = (iK >>> 6) - 1;
                                long[] jArr = ze0Var.d;
                                jArr[i3] = jArr[i3] | (1 << (iK & 63));
                            }
                        }
                        i2 = iK;
                        break;
                    }
                    if (!ia2.o(c11Var, rh2Var)) {
                        int i4 = d21Var.e;
                        int[] iArr = d21Var.d;
                        if (iArr[i4] == -2) {
                            iArr[i4] = -1;
                            i4--;
                            d21Var.e = i4;
                        }
                        if (i4 != -1) {
                            d21Var.e = i4 - 1;
                        }
                        String string = ((String) feVar.g).subSequence(0, feVar.b).toString();
                        string.getClass();
                        feVar.l(string.lastIndexOf(strE, string.length() - 1), "Encountered an unknown key '" + strE + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                        throw th2;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bV = feVar.v();
                    if (bV == 8 || bV == 6) {
                        while (true) {
                            byte bV2 = feVar.v();
                            if (bV2 == 1) {
                                feVar.e();
                            } else {
                                if (bV2 == 8 || bV2 == 6) {
                                    arrayList.add(Byte.valueOf(bV2));
                                } else if (bV2 != 9) {
                                    ?? r13 = th2;
                                    if (bV2 == 7) {
                                        if (((Number) dv.F0(arrayList)).byteValue() != 6) {
                                            fe.m(feVar, "found } instead of ]", 0, r13, 6);
                                            throw r13;
                                        }
                                        iv.s0(arrayList);
                                    } else if (bV2 == 10) {
                                        fe.m(feVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, r13, 6);
                                        throw r13;
                                    }
                                } else {
                                    if (((Number) dv.F0(arrayList)).byteValue() != 8) {
                                        ?? r14 = th2;
                                        fe.m(feVar, "found ] instead of }", 0, r14, 6);
                                        throw r14;
                                    }
                                    iv.s0(arrayList);
                                }
                                feVar.f();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                                th2 = null;
                            }
                        }
                    } else {
                        feVar.k();
                    }
                    zF2 = feVar.F();
                    th = null;
                    c = ':';
                } else if (!zF2) {
                    if (p11Var == null) {
                        break;
                    }
                    ze0 ze0Var2 = p11Var.a;
                    om0 om0Var = ze0Var2.b;
                    rh2 rh2Var2 = ze0Var2.a;
                    int iD = rh2Var2.d();
                    while (true) {
                        long j = ze0Var2.c;
                        long j2 = -1;
                        if (j == -1) {
                            if (iD <= 64) {
                                break;
                            }
                            long[] jArr2 = ze0Var2.d;
                            int length = jArr2.length;
                            loop3: while (i < length) {
                                int i5 = i + 1;
                                int i6 = i5 << 6;
                                long j3 = jArr2[i];
                                while (true) {
                                    if (j3 != j2) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros;
                                        int i7 = iNumberOfTrailingZeros + i6;
                                        if (((Boolean) om0Var.f(rh2Var2, Integer.valueOf(i7))).booleanValue()) {
                                            jArr2[i] = j3;
                                            i2 = i7;
                                            break;
                                        }
                                        j2 = -1;
                                    } else {
                                        jArr2[i] = j3;
                                        i = i5;
                                        j2 = -1;
                                    }
                                }
                            }
                            break;
                        }
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                        ze0Var2.c |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) om0Var.f(rh2Var2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            i2 = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                } else {
                    lt.I(feVar, "object");
                    throw null;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zF3 = feVar.F();
            if (feVar.c()) {
                int i8 = this.j0;
                if (i8 != -1 && !zF3) {
                    fe.m(feVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i8 + 1;
                this.j0 = i2;
            } else if (zF3) {
                lt.I(feVar, "array");
                throw null;
            }
        } else {
            int i9 = this.j0;
            Object[] objArr = i9 % 2 != 0;
            if (objArr != true) {
                feVar.h(':');
            } else if (i9 != -1) {
                zF = feVar.F();
            }
            if (feVar.c()) {
                if (objArr != false) {
                    int i10 = this.j0;
                    int i11 = feVar.b;
                    if (i10 == -1) {
                        if (zF) {
                            fe.m(feVar, "Unexpected leading comma", i11, null, 4);
                            throw null;
                        }
                    } else if (!zF) {
                        fe.m(feVar, "Expected comma after the key-value pair", i11, null, 4);
                        throw null;
                    }
                }
                i2 = this.j0 + 1;
                this.j0 = i2;
            } else if (zF) {
                lt.I(feVar, "object");
                throw null;
            }
        }
        if (t81Var != t81.MAP) {
            d21Var.d[d21Var.e] = i2;
        }
        return i2;
    }

    @Override // defpackage.h7, defpackage.v60
    public final int q() {
        fe feVar = this.h0;
        long jI = feVar.i();
        int i = (int) jI;
        if (jI == i) {
            return i;
        }
        fe.m(feVar, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    public final n11 q0() {
        return new j21(this.f0.a, this.h0).a();
    }

    public final c11 r0() {
        return this.f0;
    }

    @Override // defpackage.h7, defpackage.hz
    public final void s(rh2 rh2Var) {
        rh2Var.getClass();
        if (rh2Var.d() == 0 && ia2.o(this.f0, rh2Var)) {
            while (h(rh2Var) != -1) {
            }
        }
        fe feVar = this.h0;
        if (feVar.F()) {
            lt.I(feVar, "");
            throw null;
        }
        feVar.h(this.g0.i);
        d21 d21Var = (d21) feVar.d;
        int i = d21Var.e;
        int[] iArr = d21Var.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            d21Var.e = i;
        }
        if (i != -1) {
            d21Var.e = i - 1;
        }
    }

    @Override // defpackage.hz
    public final jy1 t() {
        return this.i0;
    }

    @Override // defpackage.h7, defpackage.v60
    public final byte v() {
        fe feVar = this.h0;
        long jI = feVar.i();
        byte b = (byte) jI;
        if (jI == b) {
            return b;
        }
        fe.m(feVar, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.h7, defpackage.v60
    public final v60 x(rh2 rh2Var) {
        rh2Var.getClass();
        return wn2.a(rh2Var) ? new k11(this.h0, this.f0) : this;
    }

    @Override // defpackage.h7, defpackage.hz
    public final Object y(rh2 rh2Var, int i, r21 r21Var, Object obj) {
        d21 d21Var = (d21) this.h0.d;
        rh2Var.getClass();
        r21Var.getClass();
        boolean z = this.g0 == t81.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = d21Var.d;
            int i2 = d21Var.e;
            if (iArr[i2] == -2) {
                d21Var.c[i2] = c5.b0;
            }
        }
        r21Var.getClass();
        Object objA = a(r21Var);
        if (z) {
            int[] iArr2 = d21Var.d;
            int i3 = d21Var.e;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                d21Var.e = i4;
                if (i4 == d21Var.c.length) {
                    d21Var.b();
                }
            }
            Object[] objArr = d21Var.c;
            int i5 = d21Var.e;
            objArr[i5] = d21Var.b ? objA : c5.a0;
            d21Var.d[i5] = -2;
        }
        return objA;
    }
}
