package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 implements r21 {
    public static final ey0 a = new ey0();
    public static final j32 b = new j32("kotlin.time.Instant", d32.q);

    /* JADX WARN: Code duplicated, block: B:188:0x0474  */
    /* JADX WARN: Code duplicated, block: B:189:0x048a  */
    /* JADX WARN: Instruction removed from duplicated block: B:189:0x048a, please report this as an issue */
    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        int i;
        dy0 dy0VarW;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char cCharAt2;
        ay0 ay0Var = ay0.j;
        String strB = v60Var.B();
        strB.getClass();
        if (strB.length() == 0) {
            dy0VarW = new ix0("An empty string is not a valid Instant", strB, (byte) 16, false);
        } else {
            char cCharAt3 = strB.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strB.length() && '0' <= (cCharAt2 = strB.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strB.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                dy0VarW = tz0.x(strB, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && strB.charAt(i) >= '2') {
                dy0VarW = tz0.x(strB, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                dy0VarW = tz0.x(strB, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                dy0VarW = tz0.x(strB, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strB.length() < i7) {
                    dy0VarW = tz0.x(strB, "The input string is too short");
                } else {
                    dy0VarW = tz0.w(strB, "'-'", i5, new vv0((byte) 7));
                    if (dy0VarW == null && (dy0VarW = tz0.w(strB, "'-'", i5 + 3, new vv0((byte) 8))) == null) {
                        int i8 = 9;
                        dy0VarW = tz0.w(strB, "'T' or 't'", i5 + 6, new vv0((byte) 9));
                        if (dy0VarW == null && (dy0VarW = tz0.w(strB, "':'", i5 + 9, new vv0((byte) 10))) == null && (dy0VarW = tz0.w(strB, "':'", i5 + 12, new vv0((byte) 11))) == null) {
                            int[] iArr = tz0.V;
                            int i9 = 0;
                            while (i9 < 10) {
                                int i10 = i8;
                                ix0 ix0VarW = tz0.w(strB, "an ASCII digit", i5 + iArr[i9], new vv0((byte) 12));
                                if (ix0VarW != null) {
                                    dy0VarW = ix0VarW;
                                } else {
                                    i9++;
                                    i8 = i10;
                                }
                            }
                            int i11 = i8;
                            int iY = tz0.y(i5 + 1, strB);
                            int iY2 = tz0.y(i5 + 4, strB);
                            int iY3 = tz0.y(i5 + 7, strB);
                            int iY4 = tz0.y(i5 + 10, strB);
                            int iY5 = tz0.y(i5 + 13, strB);
                            int i12 = i5 + 15;
                            if (strB.charAt(i12) == '.') {
                                i12 = i7;
                                int iCharAt2 = 0;
                                while (i12 < strB.length() && '0' <= (cCharAt = strB.charAt(i12)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strB.charAt(i12) - '0');
                                    i12++;
                                }
                                int i13 = i12 - i7;
                                if (1 > i13 || i13 >= 10) {
                                    dy0VarW = tz0.x(strB, "1..9 digits are supported for the fraction of the second, got " + i13 + " digits");
                                } else {
                                    i2 = iCharAt2 * tz0.U[9 - i13];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i12 >= strB.length()) {
                                dy0VarW = tz0.x(strB, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strB.charAt(i12);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strB.length() - i12;
                                    if (length > i11) {
                                        dy0VarW = tz0.x(strB, "The UTC offset string \"" + tz0.L(16, strB.subSequence(i12, strB.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        dy0VarW = tz0.x(strB, "Invalid UTC offset string \"" + strB.subSequence(i12, strB.length()).toString() + '\"');
                                    } else {
                                        int[] iArr2 = tz0.W;
                                        int i14 = 0;
                                        for (int i15 = 2; i14 < i15; i15 = 2) {
                                            int i16 = i12 + iArr2[i14];
                                            if (i16 >= strB.length()) {
                                                break;
                                            }
                                            int[] iArr3 = iArr2;
                                            if (strB.charAt(i16) != ':') {
                                                dy0VarW = tz0.x(strB, "Expected ':' at index " + i16 + ", got '" + strB.charAt(i16) + '\'');
                                            } else {
                                                i14++;
                                                iArr2 = iArr3;
                                            }
                                        }
                                        int[] iArr4 = tz0.X;
                                        int i17 = 0;
                                        while (i17 < 6 && (i4 = iArr4[i17] + i12) < strB.length()) {
                                            char cCharAt5 = strB.charAt(i4);
                                            int[] iArr5 = iArr4;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                dy0VarW = tz0.x(strB, "Expected an ASCII digit at index " + i4 + ", got '" + strB.charAt(i4) + '\'');
                                            } else {
                                                i17++;
                                                iArr4 = iArr5;
                                            }
                                        }
                                        int iY6 = tz0.y(i12 + 1, strB);
                                        int iY7 = length > 3 ? tz0.y(i12 + 4, strB) : 0;
                                        int iY8 = length > 6 ? tz0.y(i12 + 7, strB) : 0;
                                        if (iY7 > 59) {
                                            dy0VarW = tz0.x(strB, "Expected offset-minute-of-hour in 0..59, got " + iY7);
                                        } else if (iY8 > 59) {
                                            dy0VarW = tz0.x(strB, "Expected offset-second-of-minute in 0..59, got " + iY8);
                                        } else if (iY6 <= 17 || (iY6 == 18 && iY7 == 0 && iY8 == 0)) {
                                            i3 = ((iY7 * 60) + (iY6 * 3600) + iY8) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iY || iY >= 13) {
                                                dy0VarW = tz0.x(strB, "Expected a month number in 1..12, got " + iY);
                                            } else if (1 > iY2) {
                                                StringBuilder sbK = wi0.k("Expected a valid day-of-month for month ", iY, " of year ", iCharAt, ", got ");
                                                sbK.append(iY2);
                                                dy0VarW = tz0.x(strB, sbK.toString());
                                            } else {
                                                int i18 = iCharAt & 3;
                                                if (iY2 > (iY != 2 ? (iY == 4 || iY == 6 || iY == 9 || iY == 11) ? 30 : 31 : i18 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    StringBuilder sbK2 = wi0.k("Expected a valid day-of-month for month ", iY, " of year ", iCharAt, ", got ");
                                                    sbK2.append(iY2);
                                                    dy0VarW = tz0.x(strB, sbK2.toString());
                                                } else if (iY3 > 23) {
                                                    dy0VarW = tz0.x(strB, "Expected hour in 0..23, got " + iY3);
                                                } else if (iY4 > 59) {
                                                    dy0VarW = tz0.x(strB, "Expected minute-of-hour in 0..59, got " + iY4);
                                                } else if (iY5 > 59) {
                                                    dy0VarW = tz0.x(strB, "Expected second-of-minute in 0..59, got " + iY5);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = 365 * j;
                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iY * 367) - 362) / 12)) + ((long) (iY2 - 1));
                                                    if (iY > 2) {
                                                        j3 = (i18 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                    }
                                                    dy0VarW = new cy0(i2, (((j3 - 719528) * 86400) + ((long) (((iY4 * 60) + (iY3 * 3600)) + iY5))) - ((long) i3));
                                                }
                                            }
                                        } else {
                                            dy0VarW = tz0.x(strB, "Expected an offset in -18:00..+18:00, got " + strB.subSequence(i12, strB.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i19 = i12 + 1;
                                    if (strB.length() == i19) {
                                        i3 = 0;
                                        if (1 <= iY) {
                                            dy0VarW = tz0.x(strB, "Expected a month number in 1..12, got " + iY);
                                        } else {
                                            dy0VarW = tz0.x(strB, "Expected a month number in 1..12, got " + iY);
                                        }
                                    } else {
                                        dy0VarW = tz0.x(strB, "Extra text after the instant at position " + i19);
                                    }
                                } else {
                                    dy0VarW = tz0.x(strB, "Expected the UTC offset at position " + i12 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    }
                }
            } else {
                dy0VarW = tz0.x(strB, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return dy0VarW.toInstant();
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        ay0 ay0Var = (ay0) obj;
        ay0Var.getClass();
        bVar.r(ay0Var.toString());
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
