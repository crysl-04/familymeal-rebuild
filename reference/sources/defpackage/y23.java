package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class y23 implements r21 {
    public static final y23 a = new y23();
    public static final j32 b = new j32("kotlin.uuid.Uuid", d32.q);

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        String strB = v60Var.B();
        strB.getClass();
        int length = strB.length();
        int i = 0;
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strB.length() <= 64 ? strB : strB.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strB.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j = 0;
            while (i < 8) {
                long j2 = j << 4;
                char cCharAt = strB.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = et0.b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                pz1.F(i, strB, "a hexadecimal digit");
                throw null;
            }
            if (strB.charAt(8) != '-') {
                pz1.F(8, strB, "'-' (hyphen)");
                throw null;
            }
            int i2 = 9;
            long j4 = 0;
            while (true) {
                int i3 = 13;
                if (i2 >= 13) {
                    if (strB.charAt(13) == '-') {
                        i2 = 14;
                        long j5 = 0;
                        while (true) {
                            i3 = 18;
                            if (i2 < 18) {
                                long j6 = j5 << 4;
                                char cCharAt2 = strB.charAt(i2);
                                if ((cCharAt2 >>> '\b') != 0) {
                                    break;
                                }
                                long j7 = et0.b[cCharAt2];
                                if (j7 < 0) {
                                    break;
                                }
                                j5 = j6 | j7;
                                i2++;
                            } else if (strB.charAt(18) == '-') {
                                i2 = 19;
                                long j8 = 0;
                                while (true) {
                                    i3 = 23;
                                    if (i2 < 23) {
                                        long j9 = j8 << 4;
                                        char cCharAt3 = strB.charAt(i2);
                                        if ((cCharAt3 >>> '\b') != 0) {
                                            break;
                                        }
                                        long j10 = et0.b[cCharAt3];
                                        if (j10 < 0) {
                                            break;
                                        }
                                        j8 = j9 | j10;
                                        i2++;
                                    } else if (strB.charAt(23) == '-') {
                                        i2 = 24;
                                        long j11 = 0;
                                        while (i2 < 36) {
                                            long j12 = j11 << 4;
                                            char cCharAt4 = strB.charAt(i2);
                                            if ((cCharAt4 >>> '\b') != 0) {
                                                break;
                                            }
                                            long j13 = et0.b[cCharAt4];
                                            if (j13 < 0) {
                                                break;
                                            }
                                            j11 = j12 | j13;
                                            i2++;
                                        }
                                        long j14 = (j << 32) | (j4 << 16) | j5;
                                        long j15 = (j8 << 48) | j11;
                                        if (j14 != 0 || j15 != 0) {
                                            return new x23(j14, j15);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    pz1.F(i3, strB, "'-' (hyphen)");
                    throw null;
                }
                long j16 = j4 << 4;
                char cCharAt5 = strB.charAt(i2);
                if ((cCharAt5 >>> '\b') != 0) {
                    break;
                }
                long j17 = et0.b[cCharAt5];
                if (j17 < 0) {
                    break;
                }
                j4 = j16 | j17;
                i2++;
            }
            pz1.F(i2, strB, "a hexadecimal digit");
            throw null;
        }
        long j18 = 0;
        while (i < 16) {
            long j19 = j18 << 4;
            char cCharAt6 = strB.charAt(i);
            if ((cCharAt6 >>> '\b') == 0) {
                long j20 = et0.b[cCharAt6];
                if (j20 >= 0) {
                    j18 = j19 | j20;
                    i++;
                }
            }
            pz1.F(i, strB, "a hexadecimal digit");
            throw null;
        }
        long j21 = 0;
        for (int i4 = 16; i4 < 32; i4++) {
            long j22 = j21 << 4;
            char cCharAt7 = strB.charAt(i4);
            if ((cCharAt7 >>> '\b') == 0) {
                long j23 = et0.b[cCharAt7];
                if (j23 >= 0) {
                    j21 = j22 | j23;
                }
            }
            pz1.F(i4, strB, "a hexadecimal digit");
            throw null;
        }
        if (j18 != 0 || j21 != 0) {
            return new x23(j18, j21);
        }
        return x23.j;
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        x23 x23Var = (x23) obj;
        x23Var.getClass();
        bVar.r(x23Var.toString());
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
