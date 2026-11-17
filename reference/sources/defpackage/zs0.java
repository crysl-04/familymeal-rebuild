package defpackage;

import java.lang.management.ManagementFactory;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zs0 extends iw implements Comparable {
    public final dl[] n;

    public zs0(ys0 ys0Var, dl[] dlVarArr) {
        super(ys0Var, dlVarArr);
        if (dlVarArr.length < 2) {
            wg.f();
            throw null;
        }
        int length = dlVarArr.length;
        Object[] objArr = (Object[]) Array.newInstance(dlVarArr.getClass().getComponentType(), length);
        System.arraycopy(dlVarArr, 0, objArr, 0, length);
        this.n = (dl[]) objArr;
    }

    public static ys0 a() {
        String property = System.getProperty("os.arch", "unknown");
        if (property != null) {
            String lowerCase = property.toLowerCase();
            lowerCase.getClass();
            switch (lowerCase) {
                case "aarch64":
                    return ys0.h;
                case "x86_64":
                case "amd64":
                    return ys0.m;
                case "arm":
                    return ys0.i;
                case "ppc":
                case "ppc64":
                    return ys0.k;
                case "x86":
                case "i386":
                    return ys0.l;
            }
        }
        return ys0.j;
    }

    public static long b() {
        try {
            long totalPhysicalMemorySize = ManagementFactory.getOperatingSystemMXBean().getTotalPhysicalMemorySize();
            if (totalPhysicalMemorySize > 0) {
                return totalPhysicalMemorySize;
            }
        } catch (Throwable unused) {
        }
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        if (jMaxMemory <= 0) {
            return 2147483648L;
        }
        long j = jMaxMemory << 2;
        return j >= jMaxMemory ? j : jMaxMemory;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0157  */
    /* JADX WARN: Code duplicated, block: B:105:0x0163  */
    /* JADX WARN: Code duplicated, block: B:110:0x0177  */
    /* JADX WARN: Code duplicated, block: B:111:0x0181  */
    /* JADX WARN: Code duplicated, block: B:113:0x0187  */
    /* JADX WARN: Code duplicated, block: B:115:0x018b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0197  */
    /* JADX WARN: Code duplicated, block: B:118:0x019c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:125:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01db  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:136:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:139:0x0206  */
    /* JADX WARN: Code duplicated, block: B:141:0x020b  */
    /* JADX WARN: Code duplicated, block: B:143:0x020e  */
    /* JADX WARN: Code duplicated, block: B:145:0x021a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0220  */
    /* JADX WARN: Code duplicated, block: B:148:0x0224  */
    /* JADX WARN: Code duplicated, block: B:150:0x0228  */
    /* JADX WARN: Code duplicated, block: B:152:0x023d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0242  */
    /* JADX WARN: Code duplicated, block: B:155:0x0252  */
    /* JADX WARN: Code duplicated, block: B:157:0x0255  */
    /* JADX WARN: Code duplicated, block: B:158:0x025f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0265  */
    /* JADX WARN: Code duplicated, block: B:161:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0271  */
    /* JADX WARN: Code duplicated, block: B:163:0x027b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0282 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0284  */
    /* JADX WARN: Code duplicated, block: B:168:0x0292  */
    /* JADX WARN: Code duplicated, block: B:169:0x029c  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:178:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e3 A[PHI: r11
  0x02e3: PHI (r11v3 int) = (r11v2 int), (r11v5 int), (r11v6 int), (r11v7 int), (r11v8 int) binds: [B:172:0x02b4, B:161:0x026f, B:156:0x0253, B:112:0x0185, B:75:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0105  */
    /* JADX WARN: Code duplicated, block: B:84:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x013c A[PHI: r6
  0x013c: PHI (r6v22 int) = (r6v21 int), (r6v21 int), (r6v23 int) binds: [B:87:0x0114, B:88:0x0116, B:95:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0140 A[ADDED_TO_REGION] */
    public static zs0 c(ys0 ys0Var, long j, int i) {
        int i2;
        long j2;
        long j3;
        int i3;
        int i4;
        dl[] dlVarArr;
        int i5;
        int iMax;
        int iMax2;
        int iOrdinal;
        int i6;
        int i7;
        int i8;
        dl dlVar;
        long j4;
        long jMax;
        long jMax2;
        long jMax3;
        long jMax4;
        long jMax5;
        int i9;
        long j5;
        int i10;
        int iOrdinal2 = ys0Var.ordinal();
        int i11 = 2;
        int i12 = 1;
        if (iOrdinal2 == 0) {
            i2 = 1;
            j2 = 65536;
        } else {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 3) {
                    if (i >= 16) {
                        i2 = 8;
                    } else if (i >= 8) {
                        i2 = 4;
                    } else if (i >= 4) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    j2 = 65536;
                } else if (iOrdinal2 != 4 && iOrdinal2 != 5) {
                    if (i >= 64) {
                        i10 = 8;
                    } else if (i >= 32) {
                        i10 = 4;
                    } else {
                        i10 = (i < 4 || i % 2 != 0) ? 1 : 2;
                    }
                    i2 = i10;
                } else if (i == 4) {
                    long jMax6 = Math.max(1L, j / 1073741824);
                    if (jMax6 < 4 || jMax6 > 11) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                } else if (i == 2 || i < 4 || i % 2 != 0) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
            } else if (i >= 8) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            j2 = 32768;
        }
        dl dlVar2 = new dl(i2, j2);
        int iOrdinal3 = ys0Var.ordinal();
        if (iOrdinal3 != 0) {
            j3 = 3;
            i3 = (iOrdinal3 == 3 ? i < 16 : !(iOrdinal3 == 4 || iOrdinal3 == 5) || i <= 2 || (i == 4 && Math.max(1L, j / 1073741824) <= 3)) ? 2 : 3;
            i4 = i3 + 1;
            dlVarArr = new dl[i4];
            dlVarArr[0] = new dl(i, j);
            dlVarArr[i3] = dlVar2;
            i5 = 2;
            while (i5 <= i3) {
                int i13 = i4 - i5;
                iMax = Math.max(i12, dlVar2.i);
                iMax2 = Math.max(i12, i / iMax);
                iOrdinal = ys0Var.ordinal();
                i6 = i5;
                int i14 = i4;
                if (iOrdinal != 0) {
                    i7 = i6;
                    if (i7 == i11) {
                        if (i == 8) {
                            dlVar = new dl(iMax, 262144L);
                        } else if (Math.max(1L, j / 1073741824) <= 18) {
                            dlVar = new dl(8, 29360128L);
                        } else {
                            dlVar = new dl(4, 4194304L);
                        }
                        i8 = i7;
                    } else if (i7 == 3) {
                        i8 = i7;
                        dlVar = new dl(iMax, 262144L);
                    } else if (i == 8) {
                        i8 = i7;
                        if (Math.max(1L, j / 1073741824) <= 18) {
                            dlVar = new dl(8, 25165824L);
                        } else {
                            dlVar = new dl(8, 8388608L);
                        }
                    } else {
                        i8 = i7;
                        dlVar = new dl(i, 2097152L);
                    }
                } else if (iOrdinal != i12) {
                    i7 = i6;
                    if (i7 == i11) {
                        dlVar = new dl(iMax, 262144L);
                    } else if (i7 == 3) {
                        dlVar = new dl(i, 2097152L);
                    } else {
                        i8 = i7;
                        dlVar = new dl(iMax, 262144L);
                    }
                    i8 = i7;
                } else if (iOrdinal != 3) {
                    j4 = 3145728;
                    if (iOrdinal != 4 || iOrdinal == 5) {
                        i7 = i6;
                        if (i7 == i11) {
                            if (i != 4) {
                                i9 = i11;
                            } else if (Math.max(1L, j / 1073741824) <= j3) {
                                dlVar = new dl(2, 3145728L);
                            } else {
                                i9 = 2;
                            }
                            if (ys0Var == ys0.l || i > i9) {
                                if (ys0Var == ys0.m || i != i9) {
                                    j5 = 1;
                                } else {
                                    j5 = 1;
                                    if (Math.max(1L, j / 1073741824) <= 4) {
                                        dlVar = new dl(i9, 4194304L);
                                    }
                                }
                                long jMax7 = Math.max(j5, j / 1073741824);
                                if (i >= 8 || i > 16 || jMax7 < 24) {
                                    dlVar = new dl(iMax, 262144L);
                                } else {
                                    dlVar = new dl(iMax, 1048576L);
                                }
                            } else {
                                long jMax8 = Math.max(1L, j / 1073741824);
                                if (jMax8 <= 2) {
                                    dlVar = new dl(1, 1048576L);
                                } else if (jMax8 <= 4) {
                                    dlVar = new dl(2, 6291456L);
                                } else {
                                    i9 = 2;
                                    if (ys0Var == ys0.m) {
                                        j5 = 1;
                                        long jMax9 = Math.max(j5, j / 1073741824);
                                        if (i >= 8) {
                                            dlVar = new dl(iMax, 262144L);
                                        } else {
                                            dlVar = new dl(iMax, 262144L);
                                        }
                                    } else {
                                        j5 = 1;
                                        long jMax10 = Math.max(j5, j / 1073741824);
                                        if (i >= 8) {
                                            dlVar = new dl(iMax, 262144L);
                                        } else {
                                            dlVar = new dl(iMax, 262144L);
                                        }
                                    }
                                }
                            }
                        } else if (i7 == 3) {
                            if (i >= 96) {
                                iMax2 = Math.max(1, i / 4);
                                jMax = 31457280;
                            } else if (i >= 64) {
                                iMax2 = Math.max(1, i / 2);
                                jMax = 20971520;
                            } else {
                                if (iMax2 == 6) {
                                    jMax = 12582912;
                                } else {
                                    if (iMax2 >= 8) {
                                        jMax5 = Math.max(1L, j / 1073741824);
                                        if (jMax5 >= 32) {
                                            jMax4 = Math.min(33554432L, ((long) iMax2) << 21);
                                        } else {
                                            if (jMax5 <= 16) {
                                                jMax4 = 8388608;
                                            } else {
                                                jMax4 = Math.max(8388608L, Math.min(33554432L, ((long) iMax2) << 21));
                                            }
                                            jMax = jMax4;
                                        }
                                    } else if (i == 8) {
                                        jMax3 = Math.max(1L, j / 1073741824);
                                        if (jMax3 >= 28 || jMax3 > 31) {
                                            jMax4 = 8388608;
                                        } else {
                                            jMax4 = 8448000;
                                        }
                                    } else if (i == 4) {
                                        jMax2 = Math.max(1L, j / 1073741824);
                                        if (jMax2 > 4) {
                                            if (jMax2 <= 8) {
                                                j4 = 4194304;
                                            } else {
                                                j4 = 6291456;
                                            }
                                        }
                                        iMax2 = i;
                                        jMax = j4;
                                    } else {
                                        jMax = Math.max(3145728L, Math.min(33554432L, ((long) iMax2) << 21));
                                    }
                                    iMax2 = i;
                                    jMax = jMax4;
                                }
                                iMax2 = i;
                            }
                            dlVar = new dl(iMax2, jMax);
                        } else {
                            i8 = i7;
                            dlVar = new dl(iMax, 262144L);
                        }
                        i8 = i7;
                    } else {
                        i7 = i6;
                        if (i7 == i11) {
                            dlVar = new dl(iMax, 262144L);
                        } else if (i7 == 3) {
                            dlVar = new dl(i, 3145728L);
                        } else {
                            i8 = i7;
                            dlVar = new dl(iMax, 262144L);
                        }
                        i8 = i7;
                    }
                } else {
                    i7 = i6;
                    if (i7 == i11) {
                        dlVar = new dl(Math.min(8, iMax), 524288L);
                    } else if (i7 == 3) {
                        dlVar = new dl(i, 8388608L);
                    } else {
                        i8 = i7;
                        dlVar = new dl(iMax, 262144L);
                    }
                    i8 = i7;
                }
                dlVarArr[i13] = dlVar;
                i5 = i8 + 1;
                i4 = i14;
                i11 = 2;
                i12 = 1;
            }
            return new zs0(ys0Var, dlVarArr);
        }
        j3 = 3;
        i4 = i3 + 1;
        dlVarArr = new dl[i4];
        dlVarArr[0] = new dl(i, j);
        dlVarArr[i3] = dlVar2;
        i5 = 2;
        while (i5 <= i3) {
            int i15 = i4 - i5;
            iMax = Math.max(i12, dlVar2.i);
            iMax2 = Math.max(i12, i / iMax);
            iOrdinal = ys0Var.ordinal();
            i6 = i5;
            int i16 = i4;
            if (iOrdinal != 0) {
                i7 = i6;
                if (i7 == i11) {
                    if (i == 8) {
                        dlVar = new dl(iMax, 262144L);
                    } else if (Math.max(1L, j / 1073741824) <= 18) {
                        dlVar = new dl(8, 29360128L);
                    } else {
                        dlVar = new dl(4, 4194304L);
                    }
                    i8 = i7;
                } else if (i7 == 3) {
                    i8 = i7;
                    dlVar = new dl(iMax, 262144L);
                } else if (i == 8) {
                    i8 = i7;
                    if (Math.max(1L, j / 1073741824) <= 18) {
                        dlVar = new dl(8, 25165824L);
                    } else {
                        dlVar = new dl(8, 8388608L);
                    }
                } else {
                    i8 = i7;
                    dlVar = new dl(i, 2097152L);
                }
            } else if (iOrdinal != i12) {
                i7 = i6;
                if (i7 == i11) {
                    dlVar = new dl(iMax, 262144L);
                } else if (i7 == 3) {
                    dlVar = new dl(i, 2097152L);
                } else {
                    i8 = i7;
                    dlVar = new dl(iMax, 262144L);
                }
                i8 = i7;
            } else if (iOrdinal != 3) {
                j4 = 3145728;
                if (iOrdinal != 4) {
                    i7 = i6;
                    if (i7 == i11) {
                        if (i != 4) {
                            i9 = i11;
                        } else if (Math.max(1L, j / 1073741824) <= j3) {
                            dlVar = new dl(2, 3145728L);
                        } else {
                            i9 = 2;
                        }
                        if (ys0Var == ys0.l) {
                            if (ys0Var == ys0.m) {
                                j5 = 1;
                                long jMax11 = Math.max(j5, j / 1073741824);
                                if (i >= 8) {
                                    dlVar = new dl(iMax, 262144L);
                                } else {
                                    dlVar = new dl(iMax, 262144L);
                                }
                            } else {
                                j5 = 1;
                                long jMax12 = Math.max(j5, j / 1073741824);
                                if (i >= 8) {
                                    dlVar = new dl(iMax, 262144L);
                                } else {
                                    dlVar = new dl(iMax, 262144L);
                                }
                            }
                        } else if (ys0Var == ys0.m) {
                            j5 = 1;
                            long jMax13 = Math.max(j5, j / 1073741824);
                            if (i >= 8) {
                                dlVar = new dl(iMax, 262144L);
                            } else {
                                dlVar = new dl(iMax, 262144L);
                            }
                        } else {
                            j5 = 1;
                            long jMax14 = Math.max(j5, j / 1073741824);
                            if (i >= 8) {
                                dlVar = new dl(iMax, 262144L);
                            } else {
                                dlVar = new dl(iMax, 262144L);
                            }
                        }
                    } else if (i7 == 3) {
                        if (i >= 96) {
                            iMax2 = Math.max(1, i / 4);
                            jMax = 31457280;
                        } else if (i >= 64) {
                            iMax2 = Math.max(1, i / 2);
                            jMax = 20971520;
                        } else {
                            if (iMax2 == 6) {
                                jMax = 12582912;
                            } else {
                                if (iMax2 >= 8) {
                                    jMax5 = Math.max(1L, j / 1073741824);
                                    if (jMax5 >= 32) {
                                        jMax4 = Math.min(33554432L, ((long) iMax2) << 21);
                                    } else {
                                        if (jMax5 <= 16) {
                                            jMax4 = 8388608;
                                        } else {
                                            jMax4 = Math.max(8388608L, Math.min(33554432L, ((long) iMax2) << 21));
                                        }
                                        jMax = jMax4;
                                    }
                                } else if (i == 8) {
                                    jMax3 = Math.max(1L, j / 1073741824);
                                    if (jMax3 >= 28) {
                                        jMax4 = 8388608;
                                    } else {
                                        jMax4 = 8388608;
                                    }
                                } else if (i == 4) {
                                    jMax2 = Math.max(1L, j / 1073741824);
                                    if (jMax2 > 4) {
                                        if (jMax2 <= 8) {
                                            j4 = 4194304;
                                        } else {
                                            j4 = 6291456;
                                        }
                                    }
                                    iMax2 = i;
                                    jMax = j4;
                                } else {
                                    jMax = Math.max(3145728L, Math.min(33554432L, ((long) iMax2) << 21));
                                }
                                iMax2 = i;
                                jMax = jMax4;
                            }
                            iMax2 = i;
                        }
                        dlVar = new dl(iMax2, jMax);
                    } else {
                        i8 = i7;
                        dlVar = new dl(iMax, 262144L);
                    }
                    i8 = i7;
                } else {
                    i7 = i6;
                    if (i7 == i11) {
                        if (i != 4) {
                            i9 = i11;
                        } else if (Math.max(1L, j / 1073741824) <= j3) {
                            dlVar = new dl(2, 3145728L);
                        } else {
                            i9 = 2;
                        }
                        if (ys0Var == ys0.l) {
                            if (ys0Var == ys0.m) {
                                j5 = 1;
                                long jMax15 = Math.max(j5, j / 1073741824);
                                if (i >= 8) {
                                    dlVar = new dl(iMax, 262144L);
                                } else {
                                    dlVar = new dl(iMax, 262144L);
                                }
                            } else {
                                j5 = 1;
                                long jMax16 = Math.max(j5, j / 1073741824);
                                if (i >= 8) {
                                    dlVar = new dl(iMax, 262144L);
                                } else {
                                    dlVar = new dl(iMax, 262144L);
                                }
                            }
                        } else if (ys0Var == ys0.m) {
                            j5 = 1;
                            long jMax17 = Math.max(j5, j / 1073741824);
                            if (i >= 8) {
                                dlVar = new dl(iMax, 262144L);
                            } else {
                                dlVar = new dl(iMax, 262144L);
                            }
                        } else {
                            j5 = 1;
                            long jMax18 = Math.max(j5, j / 1073741824);
                            if (i >= 8) {
                                dlVar = new dl(iMax, 262144L);
                            } else {
                                dlVar = new dl(iMax, 262144L);
                            }
                        }
                    } else if (i7 == 3) {
                        if (i >= 96) {
                            iMax2 = Math.max(1, i / 4);
                            jMax = 31457280;
                        } else if (i >= 64) {
                            iMax2 = Math.max(1, i / 2);
                            jMax = 20971520;
                        } else {
                            if (iMax2 == 6) {
                                jMax = 12582912;
                            } else {
                                if (iMax2 >= 8) {
                                    jMax5 = Math.max(1L, j / 1073741824);
                                    if (jMax5 >= 32) {
                                        jMax4 = Math.min(33554432L, ((long) iMax2) << 21);
                                    } else {
                                        if (jMax5 <= 16) {
                                            jMax4 = 8388608;
                                        } else {
                                            jMax4 = Math.max(8388608L, Math.min(33554432L, ((long) iMax2) << 21));
                                        }
                                        jMax = jMax4;
                                    }
                                } else if (i == 8) {
                                    jMax3 = Math.max(1L, j / 1073741824);
                                    if (jMax3 >= 28) {
                                        jMax4 = 8388608;
                                    } else {
                                        jMax4 = 8388608;
                                    }
                                } else if (i == 4) {
                                    jMax2 = Math.max(1L, j / 1073741824);
                                    if (jMax2 > 4) {
                                        if (jMax2 <= 8) {
                                            j4 = 4194304;
                                        } else {
                                            j4 = 6291456;
                                        }
                                    }
                                    iMax2 = i;
                                    jMax = j4;
                                } else {
                                    jMax = Math.max(3145728L, Math.min(33554432L, ((long) iMax2) << 21));
                                }
                                iMax2 = i;
                                jMax = jMax4;
                            }
                            iMax2 = i;
                        }
                        dlVar = new dl(iMax2, jMax);
                    } else {
                        i8 = i7;
                        dlVar = new dl(iMax, 262144L);
                    }
                    i8 = i7;
                }
            } else {
                i7 = i6;
                if (i7 == i11) {
                    dlVar = new dl(Math.min(8, iMax), 524288L);
                } else if (i7 == 3) {
                    dlVar = new dl(i, 8388608L);
                } else {
                    i8 = i7;
                    dlVar = new dl(iMax, 262144L);
                }
                i8 = i7;
            }
            dlVarArr[i15] = dlVar;
            i5 = i8 + 1;
            i4 = i16;
            i11 = 2;
            i12 = 1;
        }
        return new zs0(ys0Var, dlVarArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zs0 zs0Var = (zs0) obj;
        int i = zs0Var.l;
        int i2 = this.l;
        if (i2 == i && (i2 = this.i) == (i = zs0Var.i)) {
            long j = zs0Var.k;
            long j2 = this.k;
            if (j2 == j) {
                i = zs0Var.m;
                i2 = this.m;
                if (i2 == i) {
                    j = zs0Var.h;
                    j2 = this.h;
                    if (j2 == j) {
                        ys0 ys0Var = zs0Var.j;
                        ys0 ys0Var2 = this.j;
                        if (ys0Var2 != ys0Var) {
                            return ys0Var2.compareTo(ys0Var);
                        }
                        return 0;
                    }
                }
            }
            return (int) (j2 - j);
        }
        return i2 - i;
    }

    @Override // defpackage.iw, defpackage.dl
    public final boolean equals(Object obj) {
        if (this != obj) {
            return super.equals(obj) && (obj instanceof zs0) && Arrays.equals(this.n, ((zs0) obj).n);
        }
        return true;
    }

    @Override // defpackage.iw, defpackage.dl
    public final int hashCode() {
        return Arrays.hashCode(this.n) + (super.hashCode() * 31);
    }

    @Override // defpackage.dl
    public final String toString() {
        return wi0.h(String.valueOf(this.j), " ", Arrays.toString(this.n));
    }
}
