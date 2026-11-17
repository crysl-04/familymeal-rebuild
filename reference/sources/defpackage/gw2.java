package defpackage;

import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gw2 {
    public static final ie0 a = new ie0(new n62((byte) 17), (byte) 0);

    public static final void a(final xw2 xw2Var, final zp0 zp0Var, dr0 dr0Var, final int i) {
        dr0Var.W(15327438);
        int i2 = (dr0Var.f(xw2Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(zp0Var) ? 32 : 16;
        }
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            ie0 ie0Var = a;
            ys.a(ie0Var.a(((xw2) dr0Var.j(ie0Var)).d(xw2Var)), zp0Var, dr0Var, 8 | (i2 & 112));
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: fw2
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(i | 1);
                    gw2.a(xw2Var, zp0Var, (dr0) obj, iA);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0170  */
    /* JADX WARN: Code duplicated, block: B:105:0x0174  */
    /* JADX WARN: Code duplicated, block: B:108:0x0184  */
    /* JADX WARN: Code duplicated, block: B:112:0x0199  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:117:0x0215  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x012c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0140  */
    /* JADX WARN: Code duplicated, block: B:99:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    public static final void b(final String str, rg1 rg1Var, long j, long j2, qn0 qn0Var, long j3, zs2 zs2Var, long j4, int i, boolean z, int i2, int i3, xw2 xw2Var, dr0 dr0Var, final int i4, final int i5, final int i6) {
        int i7;
        rg1 rg1Var2;
        int i8;
        long j5;
        int i9;
        int i10;
        int i11;
        final qn0 qn0Var2;
        int i12;
        int i13;
        int i14;
        zs2 zs2Var2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z2;
        final boolean z3;
        final int i24;
        final xw2 xw2Var2;
        final zs2 zs2Var3;
        final rg1 rg1Var3;
        final long j6;
        final int i25;
        final long j7;
        final long j8;
        final long j9;
        final int i26;
        e72 e72VarR;
        rg1 rg1Var4;
        long j10;
        xw2 xw2Var3;
        zs2 zs2Var4;
        long j11;
        int i27;
        boolean z4;
        int i28;
        long j12;
        long jB;
        boolean z5;
        ?? r3;
        dr0Var.W(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (dr0Var.f(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i29 = i6 & 2;
        if (i29 == 0) {
            if ((i4 & 48) == 0) {
                rg1Var2 = rg1Var;
                i7 |= dr0Var.f(rg1Var2) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 != 0) {
                if ((i4 & 384) == 0) {
                    j5 = j;
                    if (dr0Var.e(j5)) {
                        i9 = 256;
                    } else {
                        i9 = 128;
                    }
                    i7 |= i9;
                }
                i10 = i7 | 224256;
                i11 = i6 & 64;
                if (i11 != 0) {
                    if ((1572864 & i4) == 0) {
                        qn0Var2 = qn0Var;
                        if (dr0Var.f(qn0Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i10 |= i12;
                    }
                    i13 = i10 | 918552576;
                    i14 = i6 & 1024;
                    if (i14 != 0) {
                        i16 = i5 | 6;
                        zs2Var2 = zs2Var;
                    } else {
                        zs2Var2 = zs2Var;
                        if (dr0Var.f(zs2Var2)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i16 = i5 | i15;
                    }
                    i17 = i16 | 3504;
                    i18 = i6 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                    if (i18 != 0) {
                        if ((i5 & 24576) == 0) {
                            i19 = i2;
                            if (dr0Var.d(i19)) {
                                i20 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                            } else {
                                i20 = 8192;
                            }
                            i17 |= i20;
                        }
                        int i30 = i17 | 1769472;
                        if ((i6 & 131072) == 0) {
                            i21 = i18;
                            int i31 = dr0Var.f(xw2Var) ? 8388608 : 4194304;
                            i22 = i30 | i31;
                            i23 = 1;
                            if ((i13 & 306783379) == 306783378 || (i22 & 4793491) != 4793490) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (dr0Var.N(i13 & 1, z2)) {
                                dr0Var.S();
                                if ((i4 & 1) != 0 || dr0Var.x()) {
                                    if (i29 != 0) {
                                        rg1Var4 = og1.h;
                                    } else {
                                        rg1Var4 = rg1Var2;
                                    }
                                    if (i8 != 0) {
                                        j5 = kv.g;
                                    }
                                    j10 = ax2.c;
                                    if (i11 != 0) {
                                        qn0Var2 = null;
                                    }
                                    if (i14 != 0) {
                                        zs2Var2 = null;
                                    }
                                    if (i21 != 0) {
                                        i19 = Integer.MAX_VALUE;
                                    }
                                    if ((i6 & 131072) != 0) {
                                        i22 &= -29360129;
                                        xw2Var3 = (xw2) dr0Var.j(a);
                                    } else {
                                        xw2Var3 = xw2Var;
                                    }
                                    zs2Var4 = zs2Var2;
                                    j11 = j10;
                                    i27 = i22;
                                    z4 = true;
                                    i28 = 1;
                                    j12 = j11;
                                } else {
                                    dr0Var.Q();
                                    if ((i6 & 131072) != 0) {
                                        i22 &= -29360129;
                                    }
                                    i23 = i;
                                    z4 = z;
                                    i28 = i3;
                                    xw2Var3 = xw2Var;
                                    zs2Var4 = zs2Var2;
                                    rg1Var4 = rg1Var2;
                                    i27 = i22;
                                    j10 = j2;
                                    j11 = j3;
                                    j12 = j4;
                                }
                                dr0Var.q();
                                dr0Var.V(-565217106);
                                if (j5 != 16) {
                                    jB = j5;
                                    z5 = false;
                                } else {
                                    dr0Var.V(-565216333);
                                    jB = xw2Var3.b();
                                    if (jB == 16) {
                                        jB = ((kv) dr0Var.j(s00.a)).a;
                                    }
                                    z5 = false;
                                    dr0Var.p(false);
                                }
                                dr0Var.p(z5);
                                r3 = z5;
                                if (zs2Var4 != null) {
                                    r3 = zs2Var4.a;
                                }
                                long j13 = j11;
                                long j14 = j12;
                                xw2 xw2Var4 = xw2Var3;
                                boolean z6 = z4;
                                int i32 = i28;
                                int i33 = i23;
                                tz0.b(str, rg1Var4, xw2.e(xw2Var4, jB, j10, qn0Var2, j13, r3 == true ? 1 : 0, j14, 16609104), i33, z6, i19, i32, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                                z3 = z6;
                                zs2Var3 = zs2Var4;
                                xw2Var2 = xw2Var4;
                                j7 = j10;
                                j8 = j13;
                                rg1Var3 = rg1Var4;
                                i24 = i32;
                                j6 = j5;
                                i25 = i19;
                                i26 = i23;
                                j9 = j14;
                            } else {
                                dr0Var.Q();
                                z3 = z;
                                i24 = i3;
                                xw2Var2 = xw2Var;
                                zs2Var3 = zs2Var2;
                                rg1Var3 = rg1Var2;
                                j6 = j5;
                                i25 = i19;
                                j7 = j2;
                                j8 = j3;
                                j9 = j4;
                                i26 = i;
                            }
                            e72VarR = dr0Var.r();
                            if (e72VarR != null) {
                                e72VarR.d = new zp0() { // from class: ew2
                                    @Override // defpackage.zp0
                                    public final Object f(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int iA = m02.A(i4 | 1);
                                        int iA2 = m02.A(i5);
                                        String str2 = str;
                                        rg1 rg1Var5 = rg1Var3;
                                        long j15 = j6;
                                        long j16 = j7;
                                        qn0 qn0Var3 = qn0Var2;
                                        long j17 = j8;
                                        zs2 zs2Var5 = zs2Var3;
                                        long j18 = j9;
                                        boolean z7 = i26;
                                        boolean z8 = z3;
                                        int i34 = i25;
                                        boolean z9 = i24;
                                        xw2 xw2Var5 = xw2Var2;
                                        int i35 = i6;
                                        gw2.b(str2, rg1Var5, j15, j16, qn0Var3, j17, zs2Var5, j18, z7 ? 1 : 0, z8, i34, z9 ? 1 : 0, xw2Var5, (dr0) obj, iA, iA2, i35);
                                        return j23.a;
                                    }
                                };
                            }
                        }
                        i21 = i18;
                        i22 = i30 | i31;
                        i23 = 1;
                        if ((i13 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (dr0Var.N(i13 & 1, z2)) {
                            dr0Var.S();
                            if ((i4 & 1) != 0) {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            } else {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            }
                            dr0Var.q();
                            dr0Var.V(-565217106);
                            if (j5 != 16) {
                                jB = j5;
                                z5 = false;
                            } else {
                                dr0Var.V(-565216333);
                                jB = xw2Var3.b();
                                if (jB == 16) {
                                    jB = ((kv) dr0Var.j(s00.a)).a;
                                }
                                z5 = false;
                                dr0Var.p(false);
                            }
                            dr0Var.p(z5);
                            r3 = z5;
                            if (zs2Var4 != null) {
                                r3 = zs2Var4.a;
                            }
                            long j15 = j11;
                            long j16 = j12;
                            xw2 xw2Var5 = xw2Var3;
                            boolean z7 = z4;
                            int i34 = i28;
                            int i35 = i23;
                            tz0.b(str, rg1Var4, xw2.e(xw2Var5, jB, j10, qn0Var2, j15, r3 == true ? 1 : 0, j16, 16609104), i35, z7, i19, i34, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                            z3 = z7;
                            zs2Var3 = zs2Var4;
                            xw2Var2 = xw2Var5;
                            j7 = j10;
                            j8 = j15;
                            rg1Var3 = rg1Var4;
                            i24 = i34;
                            j6 = j5;
                            i25 = i19;
                            i26 = i23;
                            j9 = j16;
                        } else {
                            dr0Var.Q();
                            z3 = z;
                            i24 = i3;
                            xw2Var2 = xw2Var;
                            zs2Var3 = zs2Var2;
                            rg1Var3 = rg1Var2;
                            j6 = j5;
                            i25 = i19;
                            j7 = j2;
                            j8 = j3;
                            j9 = j4;
                            i26 = i;
                        }
                        e72VarR = dr0Var.r();
                        if (e72VarR != null) {
                            e72VarR.d = new zp0() { // from class: ew2
                                @Override // defpackage.zp0
                                public final Object f(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = m02.A(i4 | 1);
                                    int iA2 = m02.A(i5);
                                    String str2 = str;
                                    rg1 rg1Var5 = rg1Var3;
                                    long j17 = j6;
                                    long j18 = j7;
                                    qn0 qn0Var3 = qn0Var2;
                                    long j19 = j8;
                                    zs2 zs2Var5 = zs2Var3;
                                    long j110 = j9;
                                    boolean z8 = i26;
                                    boolean z9 = z3;
                                    int i36 = i25;
                                    boolean z10 = i24;
                                    xw2 xw2Var6 = xw2Var2;
                                    int i37 = i6;
                                    gw2.b(str2, rg1Var5, j17, j18, qn0Var3, j19, zs2Var5, j110, z8 ? 1 : 0, z9, i36, z10 ? 1 : 0, xw2Var6, (dr0) obj, iA, iA2, i37);
                                    return j23.a;
                                }
                            };
                        }
                    }
                    i17 = i16 | 28080;
                    i19 = i2;
                    int i36 = i17 | 1769472;
                    if ((i6 & 131072) == 0) {
                        i21 = i18;
                        if (dr0Var.f(xw2Var)) {
                        }
                        i22 = i36 | i31;
                        i23 = 1;
                        if ((i13 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (dr0Var.N(i13 & 1, z2)) {
                            dr0Var.S();
                            if ((i4 & 1) != 0) {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            } else {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            }
                            dr0Var.q();
                            dr0Var.V(-565217106);
                            if (j5 != 16) {
                                jB = j5;
                                z5 = false;
                            } else {
                                dr0Var.V(-565216333);
                                jB = xw2Var3.b();
                                if (jB == 16) {
                                    jB = ((kv) dr0Var.j(s00.a)).a;
                                }
                                z5 = false;
                                dr0Var.p(false);
                            }
                            dr0Var.p(z5);
                            r3 = z5;
                            if (zs2Var4 != null) {
                                r3 = zs2Var4.a;
                            }
                            long j17 = j11;
                            long j18 = j12;
                            xw2 xw2Var6 = xw2Var3;
                            boolean z8 = z4;
                            int i37 = i28;
                            int i38 = i23;
                            tz0.b(str, rg1Var4, xw2.e(xw2Var6, jB, j10, qn0Var2, j17, r3 == true ? 1 : 0, j18, 16609104), i38, z8, i19, i37, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                            z3 = z8;
                            zs2Var3 = zs2Var4;
                            xw2Var2 = xw2Var6;
                            j7 = j10;
                            j8 = j17;
                            rg1Var3 = rg1Var4;
                            i24 = i37;
                            j6 = j5;
                            i25 = i19;
                            i26 = i23;
                            j9 = j18;
                        } else {
                            dr0Var.Q();
                            z3 = z;
                            i24 = i3;
                            xw2Var2 = xw2Var;
                            zs2Var3 = zs2Var2;
                            rg1Var3 = rg1Var2;
                            j6 = j5;
                            i25 = i19;
                            j7 = j2;
                            j8 = j3;
                            j9 = j4;
                            i26 = i;
                        }
                        e72VarR = dr0Var.r();
                        if (e72VarR != null) {
                            e72VarR.d = new zp0() { // from class: ew2
                                @Override // defpackage.zp0
                                public final Object f(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = m02.A(i4 | 1);
                                    int iA2 = m02.A(i5);
                                    String str2 = str;
                                    rg1 rg1Var5 = rg1Var3;
                                    long j19 = j6;
                                    long j110 = j7;
                                    qn0 qn0Var3 = qn0Var2;
                                    long j111 = j8;
                                    zs2 zs2Var5 = zs2Var3;
                                    long j112 = j9;
                                    boolean z9 = i26;
                                    boolean z10 = z3;
                                    int i39 = i25;
                                    boolean z11 = i24;
                                    xw2 xw2Var7 = xw2Var2;
                                    int i310 = i6;
                                    gw2.b(str2, rg1Var5, j19, j110, qn0Var3, j111, zs2Var5, j112, z9 ? 1 : 0, z10, i39, z11 ? 1 : 0, xw2Var7, (dr0) obj, iA, iA2, i310);
                                    return j23.a;
                                }
                            };
                        }
                    }
                    i21 = i18;
                    i22 = i36 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j19 = j11;
                        long j110 = j12;
                        xw2 xw2Var7 = xw2Var3;
                        boolean z9 = z4;
                        int i39 = i28;
                        int i310 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var7, jB, j10, qn0Var2, j19, r3 == true ? 1 : 0, j110, 16609104), i310, z9, i19, i39, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z9;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var7;
                        j7 = j10;
                        j8 = j19;
                        rg1Var3 = rg1Var4;
                        i24 = i39;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j110;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j111 = j6;
                                long j112 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j113 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j114 = j9;
                                boolean z10 = i26;
                                boolean z11 = z3;
                                int i311 = i25;
                                boolean z12 = i24;
                                xw2 xw2Var8 = xw2Var2;
                                int i312 = i6;
                                gw2.b(str2, rg1Var5, j111, j112, qn0Var3, j113, zs2Var5, j114, z10 ? 1 : 0, z11, i311, z12 ? 1 : 0, xw2Var8, (dr0) obj, iA, iA2, i312);
                                return j23.a;
                            }
                        };
                    }
                }
                i10 = 1797120 | i7;
                qn0Var2 = qn0Var;
                i13 = i10 | 918552576;
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i16 = i5 | 6;
                    zs2Var2 = zs2Var;
                } else {
                    zs2Var2 = zs2Var;
                    if (dr0Var.f(zs2Var2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i16 = i5 | i15;
                }
                i17 = i16 | 3504;
                i18 = i6 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                if (i18 != 0) {
                    if ((i5 & 24576) == 0) {
                        i19 = i2;
                        if (dr0Var.d(i19)) {
                            i20 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                        } else {
                            i20 = 8192;
                        }
                        i17 |= i20;
                    }
                    int i311 = i17 | 1769472;
                    if ((i6 & 131072) == 0) {
                        i21 = i18;
                        if (dr0Var.f(xw2Var)) {
                        }
                        i22 = i311 | i31;
                        i23 = 1;
                        if ((i13 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (dr0Var.N(i13 & 1, z2)) {
                            dr0Var.S();
                            if ((i4 & 1) != 0) {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            } else {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            }
                            dr0Var.q();
                            dr0Var.V(-565217106);
                            if (j5 != 16) {
                                jB = j5;
                                z5 = false;
                            } else {
                                dr0Var.V(-565216333);
                                jB = xw2Var3.b();
                                if (jB == 16) {
                                    jB = ((kv) dr0Var.j(s00.a)).a;
                                }
                                z5 = false;
                                dr0Var.p(false);
                            }
                            dr0Var.p(z5);
                            r3 = z5;
                            if (zs2Var4 != null) {
                                r3 = zs2Var4.a;
                            }
                            long j111 = j11;
                            long j112 = j12;
                            xw2 xw2Var8 = xw2Var3;
                            boolean z10 = z4;
                            int i312 = i28;
                            int i313 = i23;
                            tz0.b(str, rg1Var4, xw2.e(xw2Var8, jB, j10, qn0Var2, j111, r3 == true ? 1 : 0, j112, 16609104), i313, z10, i19, i312, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                            z3 = z10;
                            zs2Var3 = zs2Var4;
                            xw2Var2 = xw2Var8;
                            j7 = j10;
                            j8 = j111;
                            rg1Var3 = rg1Var4;
                            i24 = i312;
                            j6 = j5;
                            i25 = i19;
                            i26 = i23;
                            j9 = j112;
                        } else {
                            dr0Var.Q();
                            z3 = z;
                            i24 = i3;
                            xw2Var2 = xw2Var;
                            zs2Var3 = zs2Var2;
                            rg1Var3 = rg1Var2;
                            j6 = j5;
                            i25 = i19;
                            j7 = j2;
                            j8 = j3;
                            j9 = j4;
                            i26 = i;
                        }
                        e72VarR = dr0Var.r();
                        if (e72VarR != null) {
                            e72VarR.d = new zp0() { // from class: ew2
                                @Override // defpackage.zp0
                                public final Object f(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = m02.A(i4 | 1);
                                    int iA2 = m02.A(i5);
                                    String str2 = str;
                                    rg1 rg1Var5 = rg1Var3;
                                    long j113 = j6;
                                    long j114 = j7;
                                    qn0 qn0Var3 = qn0Var2;
                                    long j115 = j8;
                                    zs2 zs2Var5 = zs2Var3;
                                    long j116 = j9;
                                    boolean z11 = i26;
                                    boolean z12 = z3;
                                    int i314 = i25;
                                    boolean z13 = i24;
                                    xw2 xw2Var9 = xw2Var2;
                                    int i315 = i6;
                                    gw2.b(str2, rg1Var5, j113, j114, qn0Var3, j115, zs2Var5, j116, z11 ? 1 : 0, z12, i314, z13 ? 1 : 0, xw2Var9, (dr0) obj, iA, iA2, i315);
                                    return j23.a;
                                }
                            };
                        }
                    }
                    i21 = i18;
                    i22 = i311 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j113 = j11;
                        long j114 = j12;
                        xw2 xw2Var9 = xw2Var3;
                        boolean z11 = z4;
                        int i314 = i28;
                        int i315 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var9, jB, j10, qn0Var2, j113, r3 == true ? 1 : 0, j114, 16609104), i315, z11, i19, i314, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z11;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var9;
                        j7 = j10;
                        j8 = j113;
                        rg1Var3 = rg1Var4;
                        i24 = i314;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j114;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j115 = j6;
                                long j116 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j117 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j118 = j9;
                                boolean z12 = i26;
                                boolean z13 = z3;
                                int i316 = i25;
                                boolean z14 = i24;
                                xw2 xw2Var10 = xw2Var2;
                                int i317 = i6;
                                gw2.b(str2, rg1Var5, j115, j116, qn0Var3, j117, zs2Var5, j118, z12 ? 1 : 0, z13, i316, z14 ? 1 : 0, xw2Var10, (dr0) obj, iA, iA2, i317);
                                return j23.a;
                            }
                        };
                    }
                }
                i17 = i16 | 28080;
                i19 = i2;
                int i316 = i17 | 1769472;
                if ((i6 & 131072) == 0) {
                    i21 = i18;
                    if (dr0Var.f(xw2Var)) {
                    }
                    i22 = i316 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j115 = j11;
                        long j116 = j12;
                        xw2 xw2Var10 = xw2Var3;
                        boolean z12 = z4;
                        int i317 = i28;
                        int i318 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var10, jB, j10, qn0Var2, j115, r3 == true ? 1 : 0, j116, 16609104), i318, z12, i19, i317, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z12;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var10;
                        j7 = j10;
                        j8 = j115;
                        rg1Var3 = rg1Var4;
                        i24 = i317;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j116;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j117 = j6;
                                long j118 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j119 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j1110 = j9;
                                boolean z13 = i26;
                                boolean z14 = z3;
                                int i319 = i25;
                                boolean z15 = i24;
                                xw2 xw2Var11 = xw2Var2;
                                int i3110 = i6;
                                gw2.b(str2, rg1Var5, j117, j118, qn0Var3, j119, zs2Var5, j1110, z13 ? 1 : 0, z14, i319, z15 ? 1 : 0, xw2Var11, (dr0) obj, iA, iA2, i3110);
                                return j23.a;
                            }
                        };
                    }
                }
                i21 = i18;
                i22 = i316 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j117 = j11;
                    long j118 = j12;
                    xw2 xw2Var11 = xw2Var3;
                    boolean z13 = z4;
                    int i319 = i28;
                    int i3110 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var11, jB, j10, qn0Var2, j117, r3 == true ? 1 : 0, j118, 16609104), i3110, z13, i19, i319, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z13;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var11;
                    j7 = j10;
                    j8 = j117;
                    rg1Var3 = rg1Var4;
                    i24 = i319;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j118;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j119 = j6;
                            long j1110 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j1111 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j1112 = j9;
                            boolean z14 = i26;
                            boolean z15 = z3;
                            int i3111 = i25;
                            boolean z16 = i24;
                            xw2 xw2Var12 = xw2Var2;
                            int i3112 = i6;
                            gw2.b(str2, rg1Var5, j119, j1110, qn0Var3, j1111, zs2Var5, j1112, z14 ? 1 : 0, z15, i3111, z16 ? 1 : 0, xw2Var12, (dr0) obj, iA, iA2, i3112);
                            return j23.a;
                        }
                    };
                }
            }
            i7 |= 384;
            j5 = j;
            i10 = i7 | 224256;
            i11 = i6 & 64;
            if (i11 != 0) {
                if ((1572864 & i4) == 0) {
                    qn0Var2 = qn0Var;
                    if (dr0Var.f(qn0Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i10 |= i12;
                }
                i13 = i10 | 918552576;
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i16 = i5 | 6;
                    zs2Var2 = zs2Var;
                } else {
                    zs2Var2 = zs2Var;
                    if (dr0Var.f(zs2Var2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i16 = i5 | i15;
                }
                i17 = i16 | 3504;
                i18 = i6 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                if (i18 != 0) {
                    if ((i5 & 24576) == 0) {
                        i19 = i2;
                        if (dr0Var.d(i19)) {
                            i20 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                        } else {
                            i20 = 8192;
                        }
                        i17 |= i20;
                    }
                    int i3111 = i17 | 1769472;
                    if ((i6 & 131072) == 0) {
                        i21 = i18;
                        if (dr0Var.f(xw2Var)) {
                        }
                        i22 = i3111 | i31;
                        i23 = 1;
                        if ((i13 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (dr0Var.N(i13 & 1, z2)) {
                            dr0Var.S();
                            if ((i4 & 1) != 0) {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            } else {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            }
                            dr0Var.q();
                            dr0Var.V(-565217106);
                            if (j5 != 16) {
                                jB = j5;
                                z5 = false;
                            } else {
                                dr0Var.V(-565216333);
                                jB = xw2Var3.b();
                                if (jB == 16) {
                                    jB = ((kv) dr0Var.j(s00.a)).a;
                                }
                                z5 = false;
                                dr0Var.p(false);
                            }
                            dr0Var.p(z5);
                            r3 = z5;
                            if (zs2Var4 != null) {
                                r3 = zs2Var4.a;
                            }
                            long j119 = j11;
                            long j1110 = j12;
                            xw2 xw2Var12 = xw2Var3;
                            boolean z14 = z4;
                            int i3112 = i28;
                            int i3113 = i23;
                            tz0.b(str, rg1Var4, xw2.e(xw2Var12, jB, j10, qn0Var2, j119, r3 == true ? 1 : 0, j1110, 16609104), i3113, z14, i19, i3112, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                            z3 = z14;
                            zs2Var3 = zs2Var4;
                            xw2Var2 = xw2Var12;
                            j7 = j10;
                            j8 = j119;
                            rg1Var3 = rg1Var4;
                            i24 = i3112;
                            j6 = j5;
                            i25 = i19;
                            i26 = i23;
                            j9 = j1110;
                        } else {
                            dr0Var.Q();
                            z3 = z;
                            i24 = i3;
                            xw2Var2 = xw2Var;
                            zs2Var3 = zs2Var2;
                            rg1Var3 = rg1Var2;
                            j6 = j5;
                            i25 = i19;
                            j7 = j2;
                            j8 = j3;
                            j9 = j4;
                            i26 = i;
                        }
                        e72VarR = dr0Var.r();
                        if (e72VarR != null) {
                            e72VarR.d = new zp0() { // from class: ew2
                                @Override // defpackage.zp0
                                public final Object f(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = m02.A(i4 | 1);
                                    int iA2 = m02.A(i5);
                                    String str2 = str;
                                    rg1 rg1Var5 = rg1Var3;
                                    long j1111 = j6;
                                    long j1112 = j7;
                                    qn0 qn0Var3 = qn0Var2;
                                    long j1113 = j8;
                                    zs2 zs2Var5 = zs2Var3;
                                    long j1114 = j9;
                                    boolean z15 = i26;
                                    boolean z16 = z3;
                                    int i3114 = i25;
                                    boolean z17 = i24;
                                    xw2 xw2Var13 = xw2Var2;
                                    int i3115 = i6;
                                    gw2.b(str2, rg1Var5, j1111, j1112, qn0Var3, j1113, zs2Var5, j1114, z15 ? 1 : 0, z16, i3114, z17 ? 1 : 0, xw2Var13, (dr0) obj, iA, iA2, i3115);
                                    return j23.a;
                                }
                            };
                        }
                    }
                    i21 = i18;
                    i22 = i3111 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j1111 = j11;
                        long j1112 = j12;
                        xw2 xw2Var13 = xw2Var3;
                        boolean z15 = z4;
                        int i3114 = i28;
                        int i3115 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var13, jB, j10, qn0Var2, j1111, r3 == true ? 1 : 0, j1112, 16609104), i3115, z15, i19, i3114, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z15;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var13;
                        j7 = j10;
                        j8 = j1111;
                        rg1Var3 = rg1Var4;
                        i24 = i3114;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j1112;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j1113 = j6;
                                long j1114 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j1115 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j1116 = j9;
                                boolean z16 = i26;
                                boolean z17 = z3;
                                int i3116 = i25;
                                boolean z18 = i24;
                                xw2 xw2Var14 = xw2Var2;
                                int i3117 = i6;
                                gw2.b(str2, rg1Var5, j1113, j1114, qn0Var3, j1115, zs2Var5, j1116, z16 ? 1 : 0, z17, i3116, z18 ? 1 : 0, xw2Var14, (dr0) obj, iA, iA2, i3117);
                                return j23.a;
                            }
                        };
                    }
                }
                i17 = i16 | 28080;
                i19 = i2;
                int i3116 = i17 | 1769472;
                if ((i6 & 131072) == 0) {
                    i21 = i18;
                    if (dr0Var.f(xw2Var)) {
                    }
                    i22 = i3116 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j1113 = j11;
                        long j1114 = j12;
                        xw2 xw2Var14 = xw2Var3;
                        boolean z16 = z4;
                        int i3117 = i28;
                        int i3118 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var14, jB, j10, qn0Var2, j1113, r3 == true ? 1 : 0, j1114, 16609104), i3118, z16, i19, i3117, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z16;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var14;
                        j7 = j10;
                        j8 = j1113;
                        rg1Var3 = rg1Var4;
                        i24 = i3117;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j1114;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j1115 = j6;
                                long j1116 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j1117 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j1118 = j9;
                                boolean z17 = i26;
                                boolean z18 = z3;
                                int i3119 = i25;
                                boolean z19 = i24;
                                xw2 xw2Var15 = xw2Var2;
                                int i31110 = i6;
                                gw2.b(str2, rg1Var5, j1115, j1116, qn0Var3, j1117, zs2Var5, j1118, z17 ? 1 : 0, z18, i3119, z19 ? 1 : 0, xw2Var15, (dr0) obj, iA, iA2, i31110);
                                return j23.a;
                            }
                        };
                    }
                }
                i21 = i18;
                i22 = i3116 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j1115 = j11;
                    long j1116 = j12;
                    xw2 xw2Var15 = xw2Var3;
                    boolean z17 = z4;
                    int i3119 = i28;
                    int i31110 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var15, jB, j10, qn0Var2, j1115, r3 == true ? 1 : 0, j1116, 16609104), i31110, z17, i19, i3119, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z17;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var15;
                    j7 = j10;
                    j8 = j1115;
                    rg1Var3 = rg1Var4;
                    i24 = i3119;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j1116;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j1117 = j6;
                            long j1118 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j1119 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j11110 = j9;
                            boolean z18 = i26;
                            boolean z19 = z3;
                            int i31111 = i25;
                            boolean z110 = i24;
                            xw2 xw2Var16 = xw2Var2;
                            int i31112 = i6;
                            gw2.b(str2, rg1Var5, j1117, j1118, qn0Var3, j1119, zs2Var5, j11110, z18 ? 1 : 0, z19, i31111, z110 ? 1 : 0, xw2Var16, (dr0) obj, iA, iA2, i31112);
                            return j23.a;
                        }
                    };
                }
            }
            i10 = 1797120 | i7;
            qn0Var2 = qn0Var;
            i13 = i10 | 918552576;
            i14 = i6 & 1024;
            if (i14 != 0) {
                i16 = i5 | 6;
                zs2Var2 = zs2Var;
            } else {
                zs2Var2 = zs2Var;
                if (dr0Var.f(zs2Var2)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i16 = i5 | i15;
            }
            i17 = i16 | 3504;
            i18 = i6 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            if (i18 != 0) {
                if ((i5 & 24576) == 0) {
                    i19 = i2;
                    if (dr0Var.d(i19)) {
                        i20 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                    } else {
                        i20 = 8192;
                    }
                    i17 |= i20;
                }
                int i31111 = i17 | 1769472;
                if ((i6 & 131072) == 0) {
                    i21 = i18;
                    if (dr0Var.f(xw2Var)) {
                    }
                    i22 = i31111 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j1117 = j11;
                        long j1118 = j12;
                        xw2 xw2Var16 = xw2Var3;
                        boolean z18 = z4;
                        int i31112 = i28;
                        int i31113 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var16, jB, j10, qn0Var2, j1117, r3 == true ? 1 : 0, j1118, 16609104), i31113, z18, i19, i31112, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z18;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var16;
                        j7 = j10;
                        j8 = j1117;
                        rg1Var3 = rg1Var4;
                        i24 = i31112;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j1118;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j1119 = j6;
                                long j11110 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j11111 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j11112 = j9;
                                boolean z19 = i26;
                                boolean z110 = z3;
                                int i31114 = i25;
                                boolean z111 = i24;
                                xw2 xw2Var17 = xw2Var2;
                                int i31115 = i6;
                                gw2.b(str2, rg1Var5, j1119, j11110, qn0Var3, j11111, zs2Var5, j11112, z19 ? 1 : 0, z110, i31114, z111 ? 1 : 0, xw2Var17, (dr0) obj, iA, iA2, i31115);
                                return j23.a;
                            }
                        };
                    }
                }
                i21 = i18;
                i22 = i31111 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j1119 = j11;
                    long j11110 = j12;
                    xw2 xw2Var17 = xw2Var3;
                    boolean z19 = z4;
                    int i31114 = i28;
                    int i31115 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var17, jB, j10, qn0Var2, j1119, r3 == true ? 1 : 0, j11110, 16609104), i31115, z19, i19, i31114, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z19;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var17;
                    j7 = j10;
                    j8 = j1119;
                    rg1Var3 = rg1Var4;
                    i24 = i31114;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j11110;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j11111 = j6;
                            long j11112 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j11113 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j11114 = j9;
                            boolean z110 = i26;
                            boolean z111 = z3;
                            int i31116 = i25;
                            boolean z112 = i24;
                            xw2 xw2Var18 = xw2Var2;
                            int i31117 = i6;
                            gw2.b(str2, rg1Var5, j11111, j11112, qn0Var3, j11113, zs2Var5, j11114, z110 ? 1 : 0, z111, i31116, z112 ? 1 : 0, xw2Var18, (dr0) obj, iA, iA2, i31117);
                            return j23.a;
                        }
                    };
                }
            }
            i17 = i16 | 28080;
            i19 = i2;
            int i31116 = i17 | 1769472;
            if ((i6 & 131072) == 0) {
                i21 = i18;
                if (dr0Var.f(xw2Var)) {
                }
                i22 = i31116 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j11111 = j11;
                    long j11112 = j12;
                    xw2 xw2Var18 = xw2Var3;
                    boolean z110 = z4;
                    int i31117 = i28;
                    int i31118 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var18, jB, j10, qn0Var2, j11111, r3 == true ? 1 : 0, j11112, 16609104), i31118, z110, i19, i31117, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z110;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var18;
                    j7 = j10;
                    j8 = j11111;
                    rg1Var3 = rg1Var4;
                    i24 = i31117;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j11112;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j11113 = j6;
                            long j11114 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j11115 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j11116 = j9;
                            boolean z111 = i26;
                            boolean z112 = z3;
                            int i31119 = i25;
                            boolean z113 = i24;
                            xw2 xw2Var19 = xw2Var2;
                            int i311110 = i6;
                            gw2.b(str2, rg1Var5, j11113, j11114, qn0Var3, j11115, zs2Var5, j11116, z111 ? 1 : 0, z112, i31119, z113 ? 1 : 0, xw2Var19, (dr0) obj, iA, iA2, i311110);
                            return j23.a;
                        }
                    };
                }
            }
            i21 = i18;
            i22 = i31116 | i31;
            i23 = 1;
            if ((i13 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dr0Var.N(i13 & 1, z2)) {
                dr0Var.S();
                if ((i4 & 1) != 0) {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                } else {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                }
                dr0Var.q();
                dr0Var.V(-565217106);
                if (j5 != 16) {
                    jB = j5;
                    z5 = false;
                } else {
                    dr0Var.V(-565216333);
                    jB = xw2Var3.b();
                    if (jB == 16) {
                        jB = ((kv) dr0Var.j(s00.a)).a;
                    }
                    z5 = false;
                    dr0Var.p(false);
                }
                dr0Var.p(z5);
                r3 = z5;
                if (zs2Var4 != null) {
                    r3 = zs2Var4.a;
                }
                long j11113 = j11;
                long j11114 = j12;
                xw2 xw2Var19 = xw2Var3;
                boolean z111 = z4;
                int i31119 = i28;
                int i311110 = i23;
                tz0.b(str, rg1Var4, xw2.e(xw2Var19, jB, j10, qn0Var2, j11113, r3 == true ? 1 : 0, j11114, 16609104), i311110, z111, i19, i31119, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                z3 = z111;
                zs2Var3 = zs2Var4;
                xw2Var2 = xw2Var19;
                j7 = j10;
                j8 = j11113;
                rg1Var3 = rg1Var4;
                i24 = i31119;
                j6 = j5;
                i25 = i19;
                i26 = i23;
                j9 = j11114;
            } else {
                dr0Var.Q();
                z3 = z;
                i24 = i3;
                xw2Var2 = xw2Var;
                zs2Var3 = zs2Var2;
                rg1Var3 = rg1Var2;
                j6 = j5;
                i25 = i19;
                j7 = j2;
                j8 = j3;
                j9 = j4;
                i26 = i;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: ew2
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i4 | 1);
                        int iA2 = m02.A(i5);
                        String str2 = str;
                        rg1 rg1Var5 = rg1Var3;
                        long j11115 = j6;
                        long j11116 = j7;
                        qn0 qn0Var3 = qn0Var2;
                        long j11117 = j8;
                        zs2 zs2Var5 = zs2Var3;
                        long j11118 = j9;
                        boolean z112 = i26;
                        boolean z113 = z3;
                        int i311111 = i25;
                        boolean z114 = i24;
                        xw2 xw2Var110 = xw2Var2;
                        int i311112 = i6;
                        gw2.b(str2, rg1Var5, j11115, j11116, qn0Var3, j11117, zs2Var5, j11118, z112 ? 1 : 0, z113, i311111, z114 ? 1 : 0, xw2Var110, (dr0) obj, iA, iA2, i311112);
                        return j23.a;
                    }
                };
            }
        }
        i7 |= 48;
        rg1Var2 = rg1Var;
        i8 = i6 & 4;
        if (i8 != 0) {
            if ((i4 & 384) == 0) {
                j5 = j;
                if (dr0Var.e(j5)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i7 |= i9;
            }
            i10 = i7 | 224256;
            i11 = i6 & 64;
            if (i11 != 0) {
                if ((1572864 & i4) == 0) {
                    qn0Var2 = qn0Var;
                    if (dr0Var.f(qn0Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i10 |= i12;
                }
                i13 = i10 | 918552576;
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i16 = i5 | 6;
                    zs2Var2 = zs2Var;
                } else {
                    zs2Var2 = zs2Var;
                    if (dr0Var.f(zs2Var2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i16 = i5 | i15;
                }
                i17 = i16 | 3504;
                i18 = i6 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                if (i18 != 0) {
                    if ((i5 & 24576) == 0) {
                        i19 = i2;
                        if (dr0Var.d(i19)) {
                            i20 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                        } else {
                            i20 = 8192;
                        }
                        i17 |= i20;
                    }
                    int i311111 = i17 | 1769472;
                    if ((i6 & 131072) == 0) {
                        i21 = i18;
                        if (dr0Var.f(xw2Var)) {
                        }
                        i22 = i311111 | i31;
                        i23 = 1;
                        if ((i13 & 306783379) == 306783378) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (dr0Var.N(i13 & 1, z2)) {
                            dr0Var.S();
                            if ((i4 & 1) != 0) {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            } else {
                                if (i29 != 0) {
                                    rg1Var4 = og1.h;
                                } else {
                                    rg1Var4 = rg1Var2;
                                }
                                if (i8 != 0) {
                                    j5 = kv.g;
                                }
                                j10 = ax2.c;
                                if (i11 != 0) {
                                    qn0Var2 = null;
                                }
                                if (i14 != 0) {
                                    zs2Var2 = null;
                                }
                                if (i21 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                }
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                    xw2Var3 = (xw2) dr0Var.j(a);
                                } else {
                                    xw2Var3 = xw2Var;
                                }
                                zs2Var4 = zs2Var2;
                                j11 = j10;
                                i27 = i22;
                                z4 = true;
                                i28 = 1;
                                j12 = j11;
                            }
                            dr0Var.q();
                            dr0Var.V(-565217106);
                            if (j5 != 16) {
                                jB = j5;
                                z5 = false;
                            } else {
                                dr0Var.V(-565216333);
                                jB = xw2Var3.b();
                                if (jB == 16) {
                                    jB = ((kv) dr0Var.j(s00.a)).a;
                                }
                                z5 = false;
                                dr0Var.p(false);
                            }
                            dr0Var.p(z5);
                            r3 = z5;
                            if (zs2Var4 != null) {
                                r3 = zs2Var4.a;
                            }
                            long j11115 = j11;
                            long j11116 = j12;
                            xw2 xw2Var110 = xw2Var3;
                            boolean z112 = z4;
                            int i311112 = i28;
                            int i311113 = i23;
                            tz0.b(str, rg1Var4, xw2.e(xw2Var110, jB, j10, qn0Var2, j11115, r3 == true ? 1 : 0, j11116, 16609104), i311113, z112, i19, i311112, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                            z3 = z112;
                            zs2Var3 = zs2Var4;
                            xw2Var2 = xw2Var110;
                            j7 = j10;
                            j8 = j11115;
                            rg1Var3 = rg1Var4;
                            i24 = i311112;
                            j6 = j5;
                            i25 = i19;
                            i26 = i23;
                            j9 = j11116;
                        } else {
                            dr0Var.Q();
                            z3 = z;
                            i24 = i3;
                            xw2Var2 = xw2Var;
                            zs2Var3 = zs2Var2;
                            rg1Var3 = rg1Var2;
                            j6 = j5;
                            i25 = i19;
                            j7 = j2;
                            j8 = j3;
                            j9 = j4;
                            i26 = i;
                        }
                        e72VarR = dr0Var.r();
                        if (e72VarR != null) {
                            e72VarR.d = new zp0() { // from class: ew2
                                @Override // defpackage.zp0
                                public final Object f(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = m02.A(i4 | 1);
                                    int iA2 = m02.A(i5);
                                    String str2 = str;
                                    rg1 rg1Var5 = rg1Var3;
                                    long j11117 = j6;
                                    long j11118 = j7;
                                    qn0 qn0Var3 = qn0Var2;
                                    long j11119 = j8;
                                    zs2 zs2Var5 = zs2Var3;
                                    long j111110 = j9;
                                    boolean z113 = i26;
                                    boolean z114 = z3;
                                    int i311114 = i25;
                                    boolean z115 = i24;
                                    xw2 xw2Var111 = xw2Var2;
                                    int i311115 = i6;
                                    gw2.b(str2, rg1Var5, j11117, j11118, qn0Var3, j11119, zs2Var5, j111110, z113 ? 1 : 0, z114, i311114, z115 ? 1 : 0, xw2Var111, (dr0) obj, iA, iA2, i311115);
                                    return j23.a;
                                }
                            };
                        }
                    }
                    i21 = i18;
                    i22 = i311111 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j11117 = j11;
                        long j11118 = j12;
                        xw2 xw2Var111 = xw2Var3;
                        boolean z113 = z4;
                        int i311114 = i28;
                        int i311115 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var111, jB, j10, qn0Var2, j11117, r3 == true ? 1 : 0, j11118, 16609104), i311115, z113, i19, i311114, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z113;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var111;
                        j7 = j10;
                        j8 = j11117;
                        rg1Var3 = rg1Var4;
                        i24 = i311114;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j11118;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j11119 = j6;
                                long j111110 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j111111 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j111112 = j9;
                                boolean z114 = i26;
                                boolean z115 = z3;
                                int i311116 = i25;
                                boolean z116 = i24;
                                xw2 xw2Var112 = xw2Var2;
                                int i311117 = i6;
                                gw2.b(str2, rg1Var5, j11119, j111110, qn0Var3, j111111, zs2Var5, j111112, z114 ? 1 : 0, z115, i311116, z116 ? 1 : 0, xw2Var112, (dr0) obj, iA, iA2, i311117);
                                return j23.a;
                            }
                        };
                    }
                }
                i17 = i16 | 28080;
                i19 = i2;
                int i311116 = i17 | 1769472;
                if ((i6 & 131072) == 0) {
                    i21 = i18;
                    if (dr0Var.f(xw2Var)) {
                    }
                    i22 = i311116 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j11119 = j11;
                        long j111110 = j12;
                        xw2 xw2Var112 = xw2Var3;
                        boolean z114 = z4;
                        int i311117 = i28;
                        int i311118 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var112, jB, j10, qn0Var2, j11119, r3 == true ? 1 : 0, j111110, 16609104), i311118, z114, i19, i311117, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z114;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var112;
                        j7 = j10;
                        j8 = j11119;
                        rg1Var3 = rg1Var4;
                        i24 = i311117;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j111110;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j111111 = j6;
                                long j111112 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j111113 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j111114 = j9;
                                boolean z115 = i26;
                                boolean z116 = z3;
                                int i311119 = i25;
                                boolean z117 = i24;
                                xw2 xw2Var113 = xw2Var2;
                                int i3111110 = i6;
                                gw2.b(str2, rg1Var5, j111111, j111112, qn0Var3, j111113, zs2Var5, j111114, z115 ? 1 : 0, z116, i311119, z117 ? 1 : 0, xw2Var113, (dr0) obj, iA, iA2, i3111110);
                                return j23.a;
                            }
                        };
                    }
                }
                i21 = i18;
                i22 = i311116 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j111111 = j11;
                    long j111112 = j12;
                    xw2 xw2Var113 = xw2Var3;
                    boolean z115 = z4;
                    int i311119 = i28;
                    int i3111110 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var113, jB, j10, qn0Var2, j111111, r3 == true ? 1 : 0, j111112, 16609104), i3111110, z115, i19, i311119, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z115;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var113;
                    j7 = j10;
                    j8 = j111111;
                    rg1Var3 = rg1Var4;
                    i24 = i311119;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j111112;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j111113 = j6;
                            long j111114 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j111115 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j111116 = j9;
                            boolean z116 = i26;
                            boolean z117 = z3;
                            int i3111111 = i25;
                            boolean z118 = i24;
                            xw2 xw2Var114 = xw2Var2;
                            int i3111112 = i6;
                            gw2.b(str2, rg1Var5, j111113, j111114, qn0Var3, j111115, zs2Var5, j111116, z116 ? 1 : 0, z117, i3111111, z118 ? 1 : 0, xw2Var114, (dr0) obj, iA, iA2, i3111112);
                            return j23.a;
                        }
                    };
                }
            }
            i10 = 1797120 | i7;
            qn0Var2 = qn0Var;
            i13 = i10 | 918552576;
            i14 = i6 & 1024;
            if (i14 != 0) {
                i16 = i5 | 6;
                zs2Var2 = zs2Var;
            } else {
                zs2Var2 = zs2Var;
                if (dr0Var.f(zs2Var2)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i16 = i5 | i15;
            }
            i17 = i16 | 3504;
            i18 = i6 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            if (i18 != 0) {
                if ((i5 & 24576) == 0) {
                    i19 = i2;
                    if (dr0Var.d(i19)) {
                        i20 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                    } else {
                        i20 = 8192;
                    }
                    i17 |= i20;
                }
                int i3111111 = i17 | 1769472;
                if ((i6 & 131072) == 0) {
                    i21 = i18;
                    if (dr0Var.f(xw2Var)) {
                    }
                    i22 = i3111111 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j111113 = j11;
                        long j111114 = j12;
                        xw2 xw2Var114 = xw2Var3;
                        boolean z116 = z4;
                        int i3111112 = i28;
                        int i3111113 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var114, jB, j10, qn0Var2, j111113, r3 == true ? 1 : 0, j111114, 16609104), i3111113, z116, i19, i3111112, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z116;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var114;
                        j7 = j10;
                        j8 = j111113;
                        rg1Var3 = rg1Var4;
                        i24 = i3111112;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j111114;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j111115 = j6;
                                long j111116 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j111117 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j111118 = j9;
                                boolean z117 = i26;
                                boolean z118 = z3;
                                int i3111114 = i25;
                                boolean z119 = i24;
                                xw2 xw2Var115 = xw2Var2;
                                int i3111115 = i6;
                                gw2.b(str2, rg1Var5, j111115, j111116, qn0Var3, j111117, zs2Var5, j111118, z117 ? 1 : 0, z118, i3111114, z119 ? 1 : 0, xw2Var115, (dr0) obj, iA, iA2, i3111115);
                                return j23.a;
                            }
                        };
                    }
                }
                i21 = i18;
                i22 = i3111111 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j111115 = j11;
                    long j111116 = j12;
                    xw2 xw2Var115 = xw2Var3;
                    boolean z117 = z4;
                    int i3111114 = i28;
                    int i3111115 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var115, jB, j10, qn0Var2, j111115, r3 == true ? 1 : 0, j111116, 16609104), i3111115, z117, i19, i3111114, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z117;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var115;
                    j7 = j10;
                    j8 = j111115;
                    rg1Var3 = rg1Var4;
                    i24 = i3111114;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j111116;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j111117 = j6;
                            long j111118 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j111119 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j1111110 = j9;
                            boolean z118 = i26;
                            boolean z119 = z3;
                            int i3111116 = i25;
                            boolean z1110 = i24;
                            xw2 xw2Var116 = xw2Var2;
                            int i3111117 = i6;
                            gw2.b(str2, rg1Var5, j111117, j111118, qn0Var3, j111119, zs2Var5, j1111110, z118 ? 1 : 0, z119, i3111116, z1110 ? 1 : 0, xw2Var116, (dr0) obj, iA, iA2, i3111117);
                            return j23.a;
                        }
                    };
                }
            }
            i17 = i16 | 28080;
            i19 = i2;
            int i3111116 = i17 | 1769472;
            if ((i6 & 131072) == 0) {
                i21 = i18;
                if (dr0Var.f(xw2Var)) {
                }
                i22 = i3111116 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j111117 = j11;
                    long j111118 = j12;
                    xw2 xw2Var116 = xw2Var3;
                    boolean z118 = z4;
                    int i3111117 = i28;
                    int i3111118 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var116, jB, j10, qn0Var2, j111117, r3 == true ? 1 : 0, j111118, 16609104), i3111118, z118, i19, i3111117, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z118;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var116;
                    j7 = j10;
                    j8 = j111117;
                    rg1Var3 = rg1Var4;
                    i24 = i3111117;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j111118;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j111119 = j6;
                            long j1111110 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j1111111 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j1111112 = j9;
                            boolean z119 = i26;
                            boolean z1110 = z3;
                            int i3111119 = i25;
                            boolean z1111 = i24;
                            xw2 xw2Var117 = xw2Var2;
                            int i31111110 = i6;
                            gw2.b(str2, rg1Var5, j111119, j1111110, qn0Var3, j1111111, zs2Var5, j1111112, z119 ? 1 : 0, z1110, i3111119, z1111 ? 1 : 0, xw2Var117, (dr0) obj, iA, iA2, i31111110);
                            return j23.a;
                        }
                    };
                }
            }
            i21 = i18;
            i22 = i3111116 | i31;
            i23 = 1;
            if ((i13 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dr0Var.N(i13 & 1, z2)) {
                dr0Var.S();
                if ((i4 & 1) != 0) {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                } else {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                }
                dr0Var.q();
                dr0Var.V(-565217106);
                if (j5 != 16) {
                    jB = j5;
                    z5 = false;
                } else {
                    dr0Var.V(-565216333);
                    jB = xw2Var3.b();
                    if (jB == 16) {
                        jB = ((kv) dr0Var.j(s00.a)).a;
                    }
                    z5 = false;
                    dr0Var.p(false);
                }
                dr0Var.p(z5);
                r3 = z5;
                if (zs2Var4 != null) {
                    r3 = zs2Var4.a;
                }
                long j111119 = j11;
                long j1111110 = j12;
                xw2 xw2Var117 = xw2Var3;
                boolean z119 = z4;
                int i3111119 = i28;
                int i31111110 = i23;
                tz0.b(str, rg1Var4, xw2.e(xw2Var117, jB, j10, qn0Var2, j111119, r3 == true ? 1 : 0, j1111110, 16609104), i31111110, z119, i19, i3111119, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                z3 = z119;
                zs2Var3 = zs2Var4;
                xw2Var2 = xw2Var117;
                j7 = j10;
                j8 = j111119;
                rg1Var3 = rg1Var4;
                i24 = i3111119;
                j6 = j5;
                i25 = i19;
                i26 = i23;
                j9 = j1111110;
            } else {
                dr0Var.Q();
                z3 = z;
                i24 = i3;
                xw2Var2 = xw2Var;
                zs2Var3 = zs2Var2;
                rg1Var3 = rg1Var2;
                j6 = j5;
                i25 = i19;
                j7 = j2;
                j8 = j3;
                j9 = j4;
                i26 = i;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: ew2
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i4 | 1);
                        int iA2 = m02.A(i5);
                        String str2 = str;
                        rg1 rg1Var5 = rg1Var3;
                        long j1111111 = j6;
                        long j1111112 = j7;
                        qn0 qn0Var3 = qn0Var2;
                        long j1111113 = j8;
                        zs2 zs2Var5 = zs2Var3;
                        long j1111114 = j9;
                        boolean z1110 = i26;
                        boolean z1111 = z3;
                        int i31111111 = i25;
                        boolean z1112 = i24;
                        xw2 xw2Var118 = xw2Var2;
                        int i31111112 = i6;
                        gw2.b(str2, rg1Var5, j1111111, j1111112, qn0Var3, j1111113, zs2Var5, j1111114, z1110 ? 1 : 0, z1111, i31111111, z1112 ? 1 : 0, xw2Var118, (dr0) obj, iA, iA2, i31111112);
                        return j23.a;
                    }
                };
            }
        }
        i7 |= 384;
        j5 = j;
        i10 = i7 | 224256;
        i11 = i6 & 64;
        if (i11 != 0) {
            if ((1572864 & i4) == 0) {
                qn0Var2 = qn0Var;
                if (dr0Var.f(qn0Var2)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i10 |= i12;
            }
            i13 = i10 | 918552576;
            i14 = i6 & 1024;
            if (i14 != 0) {
                i16 = i5 | 6;
                zs2Var2 = zs2Var;
            } else {
                zs2Var2 = zs2Var;
                if (dr0Var.f(zs2Var2)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i16 = i5 | i15;
            }
            i17 = i16 | 3504;
            i18 = i6 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            if (i18 != 0) {
                if ((i5 & 24576) == 0) {
                    i19 = i2;
                    if (dr0Var.d(i19)) {
                        i20 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                    } else {
                        i20 = 8192;
                    }
                    i17 |= i20;
                }
                int i31111111 = i17 | 1769472;
                if ((i6 & 131072) == 0) {
                    i21 = i18;
                    if (dr0Var.f(xw2Var)) {
                    }
                    i22 = i31111111 | i31;
                    i23 = 1;
                    if ((i13 & 306783379) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (dr0Var.N(i13 & 1, z2)) {
                        dr0Var.S();
                        if ((i4 & 1) != 0) {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        } else {
                            if (i29 != 0) {
                                rg1Var4 = og1.h;
                            } else {
                                rg1Var4 = rg1Var2;
                            }
                            if (i8 != 0) {
                                j5 = kv.g;
                            }
                            j10 = ax2.c;
                            if (i11 != 0) {
                                qn0Var2 = null;
                            }
                            if (i14 != 0) {
                                zs2Var2 = null;
                            }
                            if (i21 != 0) {
                                i19 = Integer.MAX_VALUE;
                            }
                            if ((i6 & 131072) != 0) {
                                i22 &= -29360129;
                                xw2Var3 = (xw2) dr0Var.j(a);
                            } else {
                                xw2Var3 = xw2Var;
                            }
                            zs2Var4 = zs2Var2;
                            j11 = j10;
                            i27 = i22;
                            z4 = true;
                            i28 = 1;
                            j12 = j11;
                        }
                        dr0Var.q();
                        dr0Var.V(-565217106);
                        if (j5 != 16) {
                            jB = j5;
                            z5 = false;
                        } else {
                            dr0Var.V(-565216333);
                            jB = xw2Var3.b();
                            if (jB == 16) {
                                jB = ((kv) dr0Var.j(s00.a)).a;
                            }
                            z5 = false;
                            dr0Var.p(false);
                        }
                        dr0Var.p(z5);
                        r3 = z5;
                        if (zs2Var4 != null) {
                            r3 = zs2Var4.a;
                        }
                        long j1111111 = j11;
                        long j1111112 = j12;
                        xw2 xw2Var118 = xw2Var3;
                        boolean z1110 = z4;
                        int i31111112 = i28;
                        int i31111113 = i23;
                        tz0.b(str, rg1Var4, xw2.e(xw2Var118, jB, j10, qn0Var2, j1111111, r3 == true ? 1 : 0, j1111112, 16609104), i31111113, z1110, i19, i31111112, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                        z3 = z1110;
                        zs2Var3 = zs2Var4;
                        xw2Var2 = xw2Var118;
                        j7 = j10;
                        j8 = j1111111;
                        rg1Var3 = rg1Var4;
                        i24 = i31111112;
                        j6 = j5;
                        i25 = i19;
                        i26 = i23;
                        j9 = j1111112;
                    } else {
                        dr0Var.Q();
                        z3 = z;
                        i24 = i3;
                        xw2Var2 = xw2Var;
                        zs2Var3 = zs2Var2;
                        rg1Var3 = rg1Var2;
                        j6 = j5;
                        i25 = i19;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                        i26 = i;
                    }
                    e72VarR = dr0Var.r();
                    if (e72VarR != null) {
                        e72VarR.d = new zp0() { // from class: ew2
                            @Override // defpackage.zp0
                            public final Object f(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = m02.A(i4 | 1);
                                int iA2 = m02.A(i5);
                                String str2 = str;
                                rg1 rg1Var5 = rg1Var3;
                                long j1111113 = j6;
                                long j1111114 = j7;
                                qn0 qn0Var3 = qn0Var2;
                                long j1111115 = j8;
                                zs2 zs2Var5 = zs2Var3;
                                long j1111116 = j9;
                                boolean z1111 = i26;
                                boolean z1112 = z3;
                                int i31111114 = i25;
                                boolean z1113 = i24;
                                xw2 xw2Var119 = xw2Var2;
                                int i31111115 = i6;
                                gw2.b(str2, rg1Var5, j1111113, j1111114, qn0Var3, j1111115, zs2Var5, j1111116, z1111 ? 1 : 0, z1112, i31111114, z1113 ? 1 : 0, xw2Var119, (dr0) obj, iA, iA2, i31111115);
                                return j23.a;
                            }
                        };
                    }
                }
                i21 = i18;
                i22 = i31111111 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j1111113 = j11;
                    long j1111114 = j12;
                    xw2 xw2Var119 = xw2Var3;
                    boolean z1111 = z4;
                    int i31111114 = i28;
                    int i31111115 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var119, jB, j10, qn0Var2, j1111113, r3 == true ? 1 : 0, j1111114, 16609104), i31111115, z1111, i19, i31111114, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z1111;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var119;
                    j7 = j10;
                    j8 = j1111113;
                    rg1Var3 = rg1Var4;
                    i24 = i31111114;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j1111114;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j1111115 = j6;
                            long j1111116 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j1111117 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j1111118 = j9;
                            boolean z1112 = i26;
                            boolean z1113 = z3;
                            int i31111116 = i25;
                            boolean z1114 = i24;
                            xw2 xw2Var1110 = xw2Var2;
                            int i31111117 = i6;
                            gw2.b(str2, rg1Var5, j1111115, j1111116, qn0Var3, j1111117, zs2Var5, j1111118, z1112 ? 1 : 0, z1113, i31111116, z1114 ? 1 : 0, xw2Var1110, (dr0) obj, iA, iA2, i31111117);
                            return j23.a;
                        }
                    };
                }
            }
            i17 = i16 | 28080;
            i19 = i2;
            int i31111116 = i17 | 1769472;
            if ((i6 & 131072) == 0) {
                i21 = i18;
                if (dr0Var.f(xw2Var)) {
                }
                i22 = i31111116 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j1111115 = j11;
                    long j1111116 = j12;
                    xw2 xw2Var1110 = xw2Var3;
                    boolean z1112 = z4;
                    int i31111117 = i28;
                    int i31111118 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var1110, jB, j10, qn0Var2, j1111115, r3 == true ? 1 : 0, j1111116, 16609104), i31111118, z1112, i19, i31111117, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z1112;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var1110;
                    j7 = j10;
                    j8 = j1111115;
                    rg1Var3 = rg1Var4;
                    i24 = i31111117;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j1111116;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j1111117 = j6;
                            long j1111118 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j1111119 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j11111110 = j9;
                            boolean z1113 = i26;
                            boolean z1114 = z3;
                            int i31111119 = i25;
                            boolean z1115 = i24;
                            xw2 xw2Var1111 = xw2Var2;
                            int i311111110 = i6;
                            gw2.b(str2, rg1Var5, j1111117, j1111118, qn0Var3, j1111119, zs2Var5, j11111110, z1113 ? 1 : 0, z1114, i31111119, z1115 ? 1 : 0, xw2Var1111, (dr0) obj, iA, iA2, i311111110);
                            return j23.a;
                        }
                    };
                }
            }
            i21 = i18;
            i22 = i31111116 | i31;
            i23 = 1;
            if ((i13 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dr0Var.N(i13 & 1, z2)) {
                dr0Var.S();
                if ((i4 & 1) != 0) {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                } else {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                }
                dr0Var.q();
                dr0Var.V(-565217106);
                if (j5 != 16) {
                    jB = j5;
                    z5 = false;
                } else {
                    dr0Var.V(-565216333);
                    jB = xw2Var3.b();
                    if (jB == 16) {
                        jB = ((kv) dr0Var.j(s00.a)).a;
                    }
                    z5 = false;
                    dr0Var.p(false);
                }
                dr0Var.p(z5);
                r3 = z5;
                if (zs2Var4 != null) {
                    r3 = zs2Var4.a;
                }
                long j1111117 = j11;
                long j1111118 = j12;
                xw2 xw2Var1111 = xw2Var3;
                boolean z1113 = z4;
                int i31111119 = i28;
                int i311111110 = i23;
                tz0.b(str, rg1Var4, xw2.e(xw2Var1111, jB, j10, qn0Var2, j1111117, r3 == true ? 1 : 0, j1111118, 16609104), i311111110, z1113, i19, i31111119, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                z3 = z1113;
                zs2Var3 = zs2Var4;
                xw2Var2 = xw2Var1111;
                j7 = j10;
                j8 = j1111117;
                rg1Var3 = rg1Var4;
                i24 = i31111119;
                j6 = j5;
                i25 = i19;
                i26 = i23;
                j9 = j1111118;
            } else {
                dr0Var.Q();
                z3 = z;
                i24 = i3;
                xw2Var2 = xw2Var;
                zs2Var3 = zs2Var2;
                rg1Var3 = rg1Var2;
                j6 = j5;
                i25 = i19;
                j7 = j2;
                j8 = j3;
                j9 = j4;
                i26 = i;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: ew2
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i4 | 1);
                        int iA2 = m02.A(i5);
                        String str2 = str;
                        rg1 rg1Var5 = rg1Var3;
                        long j1111119 = j6;
                        long j11111110 = j7;
                        qn0 qn0Var3 = qn0Var2;
                        long j11111111 = j8;
                        zs2 zs2Var5 = zs2Var3;
                        long j11111112 = j9;
                        boolean z1114 = i26;
                        boolean z1115 = z3;
                        int i311111111 = i25;
                        boolean z1116 = i24;
                        xw2 xw2Var1112 = xw2Var2;
                        int i311111112 = i6;
                        gw2.b(str2, rg1Var5, j1111119, j11111110, qn0Var3, j11111111, zs2Var5, j11111112, z1114 ? 1 : 0, z1115, i311111111, z1116 ? 1 : 0, xw2Var1112, (dr0) obj, iA, iA2, i311111112);
                        return j23.a;
                    }
                };
            }
        }
        i10 = 1797120 | i7;
        qn0Var2 = qn0Var;
        i13 = i10 | 918552576;
        i14 = i6 & 1024;
        if (i14 != 0) {
            i16 = i5 | 6;
            zs2Var2 = zs2Var;
        } else {
            zs2Var2 = zs2Var;
            if (dr0Var.f(zs2Var2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i16 = i5 | i15;
        }
        i17 = i16 | 3504;
        i18 = i6 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
        if (i18 != 0) {
            if ((i5 & 24576) == 0) {
                i19 = i2;
                if (dr0Var.d(i19)) {
                    i20 = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
                } else {
                    i20 = 8192;
                }
                i17 |= i20;
            }
            int i311111111 = i17 | 1769472;
            if ((i6 & 131072) == 0) {
                i21 = i18;
                if (dr0Var.f(xw2Var)) {
                }
                i22 = i311111111 | i31;
                i23 = 1;
                if ((i13 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dr0Var.N(i13 & 1, z2)) {
                    dr0Var.S();
                    if ((i4 & 1) != 0) {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    } else {
                        if (i29 != 0) {
                            rg1Var4 = og1.h;
                        } else {
                            rg1Var4 = rg1Var2;
                        }
                        if (i8 != 0) {
                            j5 = kv.g;
                        }
                        j10 = ax2.c;
                        if (i11 != 0) {
                            qn0Var2 = null;
                        }
                        if (i14 != 0) {
                            zs2Var2 = null;
                        }
                        if (i21 != 0) {
                            i19 = Integer.MAX_VALUE;
                        }
                        if ((i6 & 131072) != 0) {
                            i22 &= -29360129;
                            xw2Var3 = (xw2) dr0Var.j(a);
                        } else {
                            xw2Var3 = xw2Var;
                        }
                        zs2Var4 = zs2Var2;
                        j11 = j10;
                        i27 = i22;
                        z4 = true;
                        i28 = 1;
                        j12 = j11;
                    }
                    dr0Var.q();
                    dr0Var.V(-565217106);
                    if (j5 != 16) {
                        jB = j5;
                        z5 = false;
                    } else {
                        dr0Var.V(-565216333);
                        jB = xw2Var3.b();
                        if (jB == 16) {
                            jB = ((kv) dr0Var.j(s00.a)).a;
                        }
                        z5 = false;
                        dr0Var.p(false);
                    }
                    dr0Var.p(z5);
                    r3 = z5;
                    if (zs2Var4 != null) {
                        r3 = zs2Var4.a;
                    }
                    long j1111119 = j11;
                    long j11111110 = j12;
                    xw2 xw2Var1112 = xw2Var3;
                    boolean z1114 = z4;
                    int i311111112 = i28;
                    int i311111113 = i23;
                    tz0.b(str, rg1Var4, xw2.e(xw2Var1112, jB, j10, qn0Var2, j1111119, r3 == true ? 1 : 0, j11111110, 16609104), i311111113, z1114, i19, i311111112, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                    z3 = z1114;
                    zs2Var3 = zs2Var4;
                    xw2Var2 = xw2Var1112;
                    j7 = j10;
                    j8 = j1111119;
                    rg1Var3 = rg1Var4;
                    i24 = i311111112;
                    j6 = j5;
                    i25 = i19;
                    i26 = i23;
                    j9 = j11111110;
                } else {
                    dr0Var.Q();
                    z3 = z;
                    i24 = i3;
                    xw2Var2 = xw2Var;
                    zs2Var3 = zs2Var2;
                    rg1Var3 = rg1Var2;
                    j6 = j5;
                    i25 = i19;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                    i26 = i;
                }
                e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0() { // from class: ew2
                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = m02.A(i4 | 1);
                            int iA2 = m02.A(i5);
                            String str2 = str;
                            rg1 rg1Var5 = rg1Var3;
                            long j11111111 = j6;
                            long j11111112 = j7;
                            qn0 qn0Var3 = qn0Var2;
                            long j11111113 = j8;
                            zs2 zs2Var5 = zs2Var3;
                            long j11111114 = j9;
                            boolean z1115 = i26;
                            boolean z1116 = z3;
                            int i311111114 = i25;
                            boolean z1117 = i24;
                            xw2 xw2Var1113 = xw2Var2;
                            int i311111115 = i6;
                            gw2.b(str2, rg1Var5, j11111111, j11111112, qn0Var3, j11111113, zs2Var5, j11111114, z1115 ? 1 : 0, z1116, i311111114, z1117 ? 1 : 0, xw2Var1113, (dr0) obj, iA, iA2, i311111115);
                            return j23.a;
                        }
                    };
                }
            }
            i21 = i18;
            i22 = i311111111 | i31;
            i23 = 1;
            if ((i13 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dr0Var.N(i13 & 1, z2)) {
                dr0Var.S();
                if ((i4 & 1) != 0) {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                } else {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                }
                dr0Var.q();
                dr0Var.V(-565217106);
                if (j5 != 16) {
                    jB = j5;
                    z5 = false;
                } else {
                    dr0Var.V(-565216333);
                    jB = xw2Var3.b();
                    if (jB == 16) {
                        jB = ((kv) dr0Var.j(s00.a)).a;
                    }
                    z5 = false;
                    dr0Var.p(false);
                }
                dr0Var.p(z5);
                r3 = z5;
                if (zs2Var4 != null) {
                    r3 = zs2Var4.a;
                }
                long j11111111 = j11;
                long j11111112 = j12;
                xw2 xw2Var1113 = xw2Var3;
                boolean z1115 = z4;
                int i311111114 = i28;
                int i311111115 = i23;
                tz0.b(str, rg1Var4, xw2.e(xw2Var1113, jB, j10, qn0Var2, j11111111, r3 == true ? 1 : 0, j11111112, 16609104), i311111115, z1115, i19, i311111114, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                z3 = z1115;
                zs2Var3 = zs2Var4;
                xw2Var2 = xw2Var1113;
                j7 = j10;
                j8 = j11111111;
                rg1Var3 = rg1Var4;
                i24 = i311111114;
                j6 = j5;
                i25 = i19;
                i26 = i23;
                j9 = j11111112;
            } else {
                dr0Var.Q();
                z3 = z;
                i24 = i3;
                xw2Var2 = xw2Var;
                zs2Var3 = zs2Var2;
                rg1Var3 = rg1Var2;
                j6 = j5;
                i25 = i19;
                j7 = j2;
                j8 = j3;
                j9 = j4;
                i26 = i;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: ew2
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i4 | 1);
                        int iA2 = m02.A(i5);
                        String str2 = str;
                        rg1 rg1Var5 = rg1Var3;
                        long j11111113 = j6;
                        long j11111114 = j7;
                        qn0 qn0Var3 = qn0Var2;
                        long j11111115 = j8;
                        zs2 zs2Var5 = zs2Var3;
                        long j11111116 = j9;
                        boolean z1116 = i26;
                        boolean z1117 = z3;
                        int i311111116 = i25;
                        boolean z1118 = i24;
                        xw2 xw2Var1114 = xw2Var2;
                        int i311111117 = i6;
                        gw2.b(str2, rg1Var5, j11111113, j11111114, qn0Var3, j11111115, zs2Var5, j11111116, z1116 ? 1 : 0, z1117, i311111116, z1118 ? 1 : 0, xw2Var1114, (dr0) obj, iA, iA2, i311111117);
                        return j23.a;
                    }
                };
            }
        }
        i17 = i16 | 28080;
        i19 = i2;
        int i311111116 = i17 | 1769472;
        if ((i6 & 131072) == 0) {
            i21 = i18;
            if (dr0Var.f(xw2Var)) {
            }
            i22 = i311111116 | i31;
            i23 = 1;
            if ((i13 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dr0Var.N(i13 & 1, z2)) {
                dr0Var.S();
                if ((i4 & 1) != 0) {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                } else {
                    if (i29 != 0) {
                        rg1Var4 = og1.h;
                    } else {
                        rg1Var4 = rg1Var2;
                    }
                    if (i8 != 0) {
                        j5 = kv.g;
                    }
                    j10 = ax2.c;
                    if (i11 != 0) {
                        qn0Var2 = null;
                    }
                    if (i14 != 0) {
                        zs2Var2 = null;
                    }
                    if (i21 != 0) {
                        i19 = Integer.MAX_VALUE;
                    }
                    if ((i6 & 131072) != 0) {
                        i22 &= -29360129;
                        xw2Var3 = (xw2) dr0Var.j(a);
                    } else {
                        xw2Var3 = xw2Var;
                    }
                    zs2Var4 = zs2Var2;
                    j11 = j10;
                    i27 = i22;
                    z4 = true;
                    i28 = 1;
                    j12 = j11;
                }
                dr0Var.q();
                dr0Var.V(-565217106);
                if (j5 != 16) {
                    jB = j5;
                    z5 = false;
                } else {
                    dr0Var.V(-565216333);
                    jB = xw2Var3.b();
                    if (jB == 16) {
                        jB = ((kv) dr0Var.j(s00.a)).a;
                    }
                    z5 = false;
                    dr0Var.p(false);
                }
                dr0Var.p(z5);
                r3 = z5;
                if (zs2Var4 != null) {
                    r3 = zs2Var4.a;
                }
                long j11111113 = j11;
                long j11111114 = j12;
                xw2 xw2Var1114 = xw2Var3;
                boolean z1116 = z4;
                int i311111117 = i28;
                int i311111118 = i23;
                tz0.b(str, rg1Var4, xw2.e(xw2Var1114, jB, j10, qn0Var2, j11111113, r3 == true ? 1 : 0, j11111114, 16609104), i311111118, z1116, i19, i311111117, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
                z3 = z1116;
                zs2Var3 = zs2Var4;
                xw2Var2 = xw2Var1114;
                j7 = j10;
                j8 = j11111113;
                rg1Var3 = rg1Var4;
                i24 = i311111117;
                j6 = j5;
                i25 = i19;
                i26 = i23;
                j9 = j11111114;
            } else {
                dr0Var.Q();
                z3 = z;
                i24 = i3;
                xw2Var2 = xw2Var;
                zs2Var3 = zs2Var2;
                rg1Var3 = rg1Var2;
                j6 = j5;
                i25 = i19;
                j7 = j2;
                j8 = j3;
                j9 = j4;
                i26 = i;
            }
            e72VarR = dr0Var.r();
            if (e72VarR != null) {
                e72VarR.d = new zp0() { // from class: ew2
                    @Override // defpackage.zp0
                    public final Object f(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = m02.A(i4 | 1);
                        int iA2 = m02.A(i5);
                        String str2 = str;
                        rg1 rg1Var5 = rg1Var3;
                        long j11111115 = j6;
                        long j11111116 = j7;
                        qn0 qn0Var3 = qn0Var2;
                        long j11111117 = j8;
                        zs2 zs2Var5 = zs2Var3;
                        long j11111118 = j9;
                        boolean z1117 = i26;
                        boolean z1118 = z3;
                        int i311111119 = i25;
                        boolean z1119 = i24;
                        xw2 xw2Var1115 = xw2Var2;
                        int i3111111110 = i6;
                        gw2.b(str2, rg1Var5, j11111115, j11111116, qn0Var3, j11111117, zs2Var5, j11111118, z1117 ? 1 : 0, z1118, i311111119, z1119 ? 1 : 0, xw2Var1115, (dr0) obj, iA, iA2, i3111111110);
                        return j23.a;
                    }
                };
            }
        }
        i21 = i18;
        i22 = i311111116 | i31;
        i23 = 1;
        if ((i13 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (dr0Var.N(i13 & 1, z2)) {
            dr0Var.S();
            if ((i4 & 1) != 0) {
                if (i29 != 0) {
                    rg1Var4 = og1.h;
                } else {
                    rg1Var4 = rg1Var2;
                }
                if (i8 != 0) {
                    j5 = kv.g;
                }
                j10 = ax2.c;
                if (i11 != 0) {
                    qn0Var2 = null;
                }
                if (i14 != 0) {
                    zs2Var2 = null;
                }
                if (i21 != 0) {
                    i19 = Integer.MAX_VALUE;
                }
                if ((i6 & 131072) != 0) {
                    i22 &= -29360129;
                    xw2Var3 = (xw2) dr0Var.j(a);
                } else {
                    xw2Var3 = xw2Var;
                }
                zs2Var4 = zs2Var2;
                j11 = j10;
                i27 = i22;
                z4 = true;
                i28 = 1;
                j12 = j11;
            } else {
                if (i29 != 0) {
                    rg1Var4 = og1.h;
                } else {
                    rg1Var4 = rg1Var2;
                }
                if (i8 != 0) {
                    j5 = kv.g;
                }
                j10 = ax2.c;
                if (i11 != 0) {
                    qn0Var2 = null;
                }
                if (i14 != 0) {
                    zs2Var2 = null;
                }
                if (i21 != 0) {
                    i19 = Integer.MAX_VALUE;
                }
                if ((i6 & 131072) != 0) {
                    i22 &= -29360129;
                    xw2Var3 = (xw2) dr0Var.j(a);
                } else {
                    xw2Var3 = xw2Var;
                }
                zs2Var4 = zs2Var2;
                j11 = j10;
                i27 = i22;
                z4 = true;
                i28 = 1;
                j12 = j11;
            }
            dr0Var.q();
            dr0Var.V(-565217106);
            if (j5 != 16) {
                jB = j5;
                z5 = false;
            } else {
                dr0Var.V(-565216333);
                jB = xw2Var3.b();
                if (jB == 16) {
                    jB = ((kv) dr0Var.j(s00.a)).a;
                }
                z5 = false;
                dr0Var.p(false);
            }
            dr0Var.p(z5);
            r3 = z5;
            if (zs2Var4 != null) {
                r3 = zs2Var4.a;
            }
            long j11111115 = j11;
            long j11111116 = j12;
            xw2 xw2Var1115 = xw2Var3;
            boolean z1117 = z4;
            int i311111119 = i28;
            int i3111111110 = i23;
            tz0.b(str, rg1Var4, xw2.e(xw2Var1115, jB, j10, qn0Var2, j11111115, r3 == true ? 1 : 0, j11111116, 16609104), i3111111110, z1117, i19, i311111119, dr0Var, (i13 & 126) | 224256 | ((i27 << 6) & 3670016) | 12582912 | ((i13 << 18) & 1879048192), 256);
            z3 = z1117;
            zs2Var3 = zs2Var4;
            xw2Var2 = xw2Var1115;
            j7 = j10;
            j8 = j11111115;
            rg1Var3 = rg1Var4;
            i24 = i311111119;
            j6 = j5;
            i25 = i19;
            i26 = i23;
            j9 = j11111116;
        } else {
            dr0Var.Q();
            z3 = z;
            i24 = i3;
            xw2Var2 = xw2Var;
            zs2Var3 = zs2Var2;
            rg1Var3 = rg1Var2;
            j6 = j5;
            i25 = i19;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            i26 = i;
        }
        e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: ew2
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = m02.A(i4 | 1);
                    int iA2 = m02.A(i5);
                    String str2 = str;
                    rg1 rg1Var5 = rg1Var3;
                    long j11111117 = j6;
                    long j11111118 = j7;
                    qn0 qn0Var3 = qn0Var2;
                    long j11111119 = j8;
                    zs2 zs2Var5 = zs2Var3;
                    long j111111110 = j9;
                    boolean z1118 = i26;
                    boolean z1119 = z3;
                    int i3111111111 = i25;
                    boolean z11110 = i24;
                    xw2 xw2Var1116 = xw2Var2;
                    int i3111111112 = i6;
                    gw2.b(str2, rg1Var5, j11111117, j11111118, qn0Var3, j11111119, zs2Var5, j111111110, z1118 ? 1 : 0, z1119, i3111111111, z11110 ? 1 : 0, xw2Var1116, (dr0) obj, iA, iA2, i3111111112);
                    return j23.a;
                }
            };
        }
    }
}
