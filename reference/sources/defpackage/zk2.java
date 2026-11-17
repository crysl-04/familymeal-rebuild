package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zk2 implements Iterable, l21 {
    public static final zk2 l = new zk2(0, 0, 0, null);
    public final long h;
    public final long i;
    public final long j;
    public final long[] k;

    public zk2(long j, long j2, long j3, long[] jArr) {
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = jArr;
    }

    public final zk2 a(zk2 zk2Var) {
        long[] jArr;
        zk2 zk2VarB = this;
        zk2 zk2Var2 = l;
        if (zk2Var == zk2Var2) {
            return zk2VarB;
        }
        if (zk2VarB == zk2Var2) {
            return zk2Var2;
        }
        long j = zk2Var.j;
        long j2 = zk2Var.j;
        long[] jArr2 = zk2Var.k;
        long j3 = zk2Var.i;
        long j4 = zk2Var.h;
        long j5 = zk2VarB.j;
        if (j == j5 && jArr2 == (jArr = zk2VarB.k)) {
            return new zk2(zk2VarB.h & (~j4), zk2VarB.i & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                zk2VarB = zk2VarB.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    zk2VarB = zk2VarB.b(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    zk2VarB = zk2VarB.b(((long) i2) + j2 + 64);
                }
            }
        }
        return zk2VarB;
    }

    public final zk2 b(long j) {
        long[] jArr;
        int iK;
        long[] jArr2;
        long j2 = j - this.j;
        if (uz0.j(j2, 0L) >= 0 && uz0.j(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.i;
            if ((j4 & j3) != 0) {
                return new zk2(this.h, j4 & (~j3), this.j, this.k);
            }
        } else if (uz0.j(j2, 64L) >= 0 && uz0.j(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.h;
            if ((j6 & j5) != 0) {
                return new zk2(j6 & (~j5), this.i, this.j, this.k);
            }
        } else if (uz0.j(j2, 0L) < 0 && (jArr = this.k) != null && (iK = cy1.k(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iK > 0) {
                    gi.P(jArr, jArr3, 0, 0, iK);
                }
                if (iK < i) {
                    gi.P(jArr, jArr3, iK, iK + 1, length);
                }
                jArr2 = jArr3;
            }
            return new zk2(this.h, this.i, this.j, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.j;
        if (uz0.j(j2, 0L) >= 0 && uz0.j(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.i) != 0;
        }
        if (uz0.j(j2, 64L) < 0 || uz0.j(j2, 128L) >= 0) {
            return uz0.j(j2, 0L) <= 0 && (jArr = this.k) != null && cy1.k(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.h) != 0;
    }

    public final zk2 d(zk2 zk2Var) {
        zk2 zk2VarE;
        long[] jArr;
        zk2 zk2VarE2 = this;
        zk2 zk2Var2 = l;
        if (zk2Var == zk2Var2) {
            return zk2VarE2;
        }
        if (zk2VarE2 == zk2Var2) {
            return zk2Var;
        }
        long j = zk2Var.j;
        long j2 = zk2Var.j;
        long[] jArr2 = zk2Var.k;
        long j3 = zk2Var.i;
        long j4 = zk2Var.h;
        long j5 = zk2VarE2.j;
        long j6 = zk2VarE2.i;
        long j7 = zk2VarE2.h;
        if (j == j5 && jArr2 == (jArr = zk2VarE2.k)) {
            return new zk2(j7 | j4, j6 | j3, j5, jArr);
        }
        long[] jArr3 = zk2VarE2.k;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    zk2VarE2 = zk2VarE2.e(j8);
                }
            }
            if (j3 != 0) {
                for (int i = 0; i < 64; i++) {
                    if (((1 << i) & j3) != 0) {
                        zk2VarE2 = zk2VarE2.e(((long) i) + j2);
                    }
                }
            }
            if (j4 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j4) != 0) {
                        zk2VarE2 = zk2VarE2.e(((long) i2) + j2 + 64);
                    }
                }
            }
            return zk2VarE2;
        }
        if (jArr3 != null) {
            zk2VarE = zk2Var;
            for (long j9 : jArr3) {
                zk2VarE = zk2VarE.e(j9);
            }
        } else {
            zk2VarE = zk2Var;
        }
        long j10 = zk2VarE2.j;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    zk2VarE = zk2VarE.e(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j7) != 0) {
                    zk2VarE = zk2VarE.e(((long) i4) + j10 + 64);
                }
            }
        }
        return zk2VarE;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    public final zk2 e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4 = this.j;
        long j5 = j - j4;
        long j6 = 0;
        int iJ = uz0.j(j5, 0L);
        long j7 = this.i;
        if (iJ < 0 || uz0.j(j5, 64L) >= 0) {
            int iJ2 = uz0.j(j5, 64L);
            long j8 = this.h;
            int i2 = 64;
            if (iJ2 < 0 || uz0.j(j5, 128L) >= 0) {
                int iJ3 = uz0.j(j5, 128L);
                long[] jArr3 = this.k;
                if (iJ3 < 0) {
                    if (jArr3 == null) {
                        return new zk2(this.h, this.i, this.j, new long[]{j});
                    }
                    int iK = cy1.k(jArr3, j);
                    if (iK < 0) {
                        int i3 = -(iK + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        gi.P(jArr3, jArr4, 0, 0, i3);
                        gi.P(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new zk2(this.h, this.i, this.j, jArr4);
                    }
                } else if (!c(j)) {
                    long j9 = ((j + 1) / 64) << 6;
                    if (uz0.j(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    xl1 xl1Var = null;
                    while (true) {
                        if (uz0.j(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (xl1Var == null) {
                                xl1Var = new xl1(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j7 & (1 << i4)) != j6) {
                                    ((wi1) xl1Var.i).a(((long) i4) + j4);
                                }
                                i4++;
                                j6 = j6;
                            }
                        } else {
                            i = i2;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i2 = i;
                        j10 = j6;
                    }
                    if (xl1Var == null) {
                        jArr = jArr3;
                    } else {
                        wi1 wi1Var = (wi1) xl1Var.i;
                        int i5 = wi1Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = wi1Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                        } else {
                            jArr = jArr3;
                        }
                    }
                    return new zk2(j10, j3, j2, jArr).e(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new zk2(j8 | j12, this.i, this.j, this.k);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new zk2(this.h, j7 | j13, this.j, this.k);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return rz1.u(new yk2(this, null));
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(ev.o0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
