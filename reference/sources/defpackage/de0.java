package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class de0 implements Comparable {
    public static final yy i = new yy((byte) 7);
    public static final long j = lt.t(4611686018427387903L);
    public static final long k = lt.t(-4611686018427387903L);
    public static final long l = 9223372036854759646L;
    public final long h;

    public static final long a(long j2, long j3) {
        long j4 = j3 / 1000000;
        long jB = lt.b(j2, j4);
        if (-4611686018426L > jB || jB >= 4611686018427L) {
            return lt.t(jB);
        }
        long j5 = ((jB * 1000000) + (j3 - (j4 * 1000000))) << 1;
        int i2 = fe0.a;
        return j5;
    }

    public static final void b(StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i3);
            strValueOf.getClass();
            if (i4 < 0) {
                wg.m(jp1.i(i4, "Desired length ", " is less than zero."));
                return;
            }
            if (i4 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i4);
                int length = i4 - strValueOf.length();
                int i5 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i6 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i7 = length2 - 1;
                    if (string.charAt(length2) == '0') {
                        if (i7 < 0) {
                            break;
                        } else {
                            length2 = i7;
                        }
                    } else {
                        i6 = length2;
                        break;
                    }
                }
            }
            int i8 = i6 + 1;
            if (z || i8 >= 3) {
                sb.append((CharSequence) string, 0, ((i6 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i8);
            }
        }
        sb.append(str);
    }

    public static final int c(long j2) {
        if (d(j2)) {
            return 0;
        }
        int i2 = ((int) j2) & 1;
        long j3 = j2 >> 1;
        return (int) (i2 == 1 ? (j3 % 1000) * 1000000 : j3 % 1000000000);
    }

    public static final boolean d(long j2) {
        return j2 == j || j2 == k;
    }

    public static final long e(long j2, long j3) {
        int i2 = ((int) j2) & 1;
        if (i2 != (((int) j3) & 1)) {
            return i2 == 1 ? a(j2 >> 1, j3 >> 1) : a(j3 >> 1, j2 >> 1);
        }
        long j4 = j2 >> 1;
        long j5 = j3 >> 1;
        if (i2 == 0) {
            long j6 = j4 + j5;
            if (-4611686018426999999L > j6 || j6 >= 4611686018427000000L) {
                return lt.t(j6 / 1000000);
            }
            long j7 = j6 << 1;
            int i3 = fe0.a;
            return j7;
        }
        long jB = lt.b(j4, j5);
        if (jB == 9223372036854759646L) {
            wg.m("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jB == 4611686018427387903L || jB == -4611686018427387903L) {
            return lt.t(jB);
        }
        if (-4611686018426L > jB || jB >= 4611686018427L) {
            return lt.t(cy1.o(jB));
        }
        long j8 = (jB * 1000000) << 1;
        int i4 = fe0.a;
        return j8;
    }

    public static final long f(long j2, he0 he0Var) {
        if (j2 == j) {
            return Long.MAX_VALUE;
        }
        if (j2 == k) {
            return Long.MIN_VALUE;
        }
        return he0Var.h.convert(j2 >> 1, ((((int) j2) & 1) == 0 ? he0.NANOSECONDS : he0.MILLISECONDS).h);
    }

    public static final long g(long j2) {
        long j3 = ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
        int i2 = fe0.a;
        return j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j2 = ((de0) obj).h;
        long j3 = this.h;
        long j4 = j3 ^ j2;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return uz0.j(j3, j2);
        }
        int i2 = (((int) j3) & 1) - (((int) j2) & 1);
        return j3 < 0 ? -i2 : i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof de0) {
            return this.h == ((de0) obj).h;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.h);
    }

    public final String toString() {
        long jG = this.h;
        if (jG == 0) {
            return "0s";
        }
        if (jG == j) {
            return "Infinity";
        }
        if (jG == k) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z = jG < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jG < 0) {
            jG = g(jG);
        }
        long jF = f(jG, he0.DAYS);
        int iF = d(jG) ? 0 : (int) (f(jG, he0.HOURS) % 24);
        int iF2 = d(jG) ? 0 : (int) (f(jG, he0.MINUTES) % 60);
        int iF3 = d(jG) ? 0 : (int) (f(jG, he0.SECONDS) % 60);
        int iC = c(jG);
        boolean z2 = jF != 0;
        boolean z3 = iF != 0;
        boolean z4 = iF2 != 0;
        boolean z5 = (iF3 == 0 && iC == 0) ? false : true;
        if (z2) {
            sb.append(jF);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iF);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iF2);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iF3 != 0 || z2 || z3 || z4) {
                b(sb, iF3, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                b(sb, iC / 1000000, iC % 1000000, 6, "ms", false);
            } else if (iC >= 1000) {
                b(sb, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb.append(iC);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
