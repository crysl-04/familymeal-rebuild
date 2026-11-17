package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ay0 implements Comparable, Serializable {
    public static final ay0 j = new ay0(0, -31557014167219200L);
    public static final ay0 k = new ay0(999999999, 31556889864403199L);
    public final long h;
    public final int i;

    public ay0(int i, long j2) {
        this.h = j2;
        this.i = i;
        if (-31557014167219200L > j2 || j2 >= 31556889864403200L) {
            wg.m("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ay0 ay0Var = (ay0) obj;
        ay0Var.getClass();
        int iJ = uz0.j(this.h, ay0Var.h);
        return iJ != 0 ? iJ : uz0.i(this.i, ay0Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay0)) {
            return false;
        }
        ay0 ay0Var = (ay0) obj;
        return this.h == ay0Var.h && this.i == ay0Var.i;
    }

    public final int hashCode() {
        return (this.i * 51) + Long.hashCode(this.h);
    }

    public final String toString() {
        long j2;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j3 = this.h;
        long j4 = j3 / 86400;
        if ((j3 ^ 86400) < 0 && j4 * 86400 != j3) {
            j4--;
        }
        long j5 = j3 % 86400;
        int i = (int) (j5 + ((((j5 ^ 86400) & ((-j5) | j5)) >> 63) & 86400));
        long j6 = 719468 + j4;
        if (j6 < 0) {
            long j7 = ((j4 + 719469) / 146097) - 1;
            j2 = j7 * 400;
            j6 += (-j7) * 146097;
        } else {
            j2 = 0;
        }
        long j8 = ((400 * j6) + 591) / 146097;
        long j9 = j6 - ((j8 / 400) + (((j8 / 4) + (365 * j8)) - (j8 / 100)));
        if (j9 < 0) {
            j8--;
            j9 = j6 - ((j8 / 400) + (((j8 / 4) + (365 * j8)) - (j8 / 100)));
        }
        int i2 = (int) j9;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j8 + j2 + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        tz0.q(sb, sb, i4);
        sb.append('-');
        tz0.q(sb, sb, i5);
        sb.append('T');
        tz0.q(sb, sb, i7);
        sb.append(':');
        tz0.q(sb, sb, i9);
        sb.append(':');
        tz0.q(sb, sb, i10);
        int i12 = this.i;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = tz0.U;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String strValueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
