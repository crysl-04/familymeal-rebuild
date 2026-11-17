package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lm0 extends qg1 implements pz, rp1, tg1, j80 {
    public final zp0 v;
    public boolean w;
    public boolean x;
    public final byte y;
    public eg z;

    /* JADX WARN: Multi-variable type inference failed */
    public lm0(int i, om0 om0Var, int i2) {
        this.v = (i2 & 4) != 0 ? null : om0Var;
        this.y = i;
    }

    public static boolean S0(lm0 lm0Var) {
        return lm0Var.R0(7);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    @Override // defpackage.qg1
    public final void C0() {
        int iOrdinal = O0().ordinal();
        if (iOrdinal == 0) {
            em0 em0Var = (em0) cu.Z(this).getFocusOwner();
            em0Var.b(8, true, false);
            em0Var.d.a();
        } else if (iOrdinal == 1) {
            cu.Z(this).getFocusOwner();
            ys.v(this);
        } else if (iOrdinal == 2) {
            em0 em0Var2 = (em0) cu.Z(this).getFocusOwner();
            em0Var2.b(8, true, false);
            em0Var2.d.a();
        } else if (iOrdinal != 3) {
            wg.n();
            return;
        }
        eg egVar = this.z;
        if (egVar != null) {
            egVar.K();
        }
        this.z = null;
    }

    @Override // defpackage.qg1
    public final void D0() {
        if (O0().a()) {
            ((em0) cu.Z(this).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01bc A[PHI: r16
  0x01bc: PHI (r16v2 uj1) = (r16v1 uj1), (r16v1 uj1), (r16v1 uj1), (r16v4 uj1) binds: [B:95:0x0170, B:97:0x0176, B:99:0x017a, B:116:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x0247  */
    /* JADX WARN: Code duplicated, block: B:157:0x024e A[ADDED_TO_REGION, LOOP:9: B:157:0x024e->B:163:0x025f, LOOP_START, PHI: r14
  0x024e: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:156:0x024c, B:163:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0250  */
    /* JADX WARN: Code duplicated, block: B:160:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x025c  */
    /* JADX WARN: Code duplicated, block: B:162:0x025e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0265  */
    /* JADX WARN: Code duplicated, block: B:166:0x026b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0277 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:207:0x0274 A[SYNTHETIC] */
    public final boolean J0() {
        uj1 uj1Var;
        int i;
        lm0 lm0Var;
        km0 km0Var;
        ln1 ln1Var;
        boolean z;
        ln1 ln1Var2;
        int iOrdinal = vs.Q(this).ordinal();
        if (iOrdinal == 0) {
            em0 em0Var = (em0) cu.Z(this).getFocusOwner();
            lm0 lm0VarF = em0Var.f();
            km0 km0VarO0 = O0();
            if (lm0VarF == this) {
                K0(km0VarO0, km0VarO0);
                return true;
            }
            if (lm0VarF != null) {
                uj1Var = new uj1(new lm0[16]);
                if (!lm0VarF.h.u) {
                    ax0.b("visitAncestors called on an unattached node");
                }
                qg1 qg1Var = lm0VarF.h.l;
                l41 l41VarY = cu.Y(lm0VarF);
                while (l41VarY != null) {
                    if ((l41VarY.L.f.k & 1024) != 0) {
                        while (qg1Var != null) {
                            if ((qg1Var.j & 1024) != 0) {
                                qg1 qg1VarR = qg1Var;
                                uj1 uj1Var2 = null;
                                while (qg1VarR != null) {
                                    if (qg1VarR instanceof lm0) {
                                        uj1Var.b((lm0) qg1VarR);
                                    } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                        int i2 = 0;
                                        for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                            if ((qg1Var2.j & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    qg1VarR = qg1Var2;
                                                } else {
                                                    if (uj1Var2 == null) {
                                                        uj1Var2 = new uj1(new qg1[16]);
                                                    }
                                                    if (qg1VarR != null) {
                                                        uj1Var2.b(qg1VarR);
                                                        qg1VarR = null;
                                                    }
                                                    uj1Var2.b(qg1Var2);
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    qg1VarR = cu.R(uj1Var2);
                                }
                            }
                            qg1Var = qg1Var.l;
                        }
                    }
                    l41VarY = l41VarY.u();
                    qg1Var = (l41VarY == null || (ln1Var2 = l41VarY.L) == null) ? null : ln1Var2.e;
                }
            } else if (((em0) cu.Z(this).getFocusOwner()).a.C()) {
                uj1Var = null;
            }
            Object[] objArr = new lm0[16];
            Object[] objArr2 = new lm0[16];
            if (!this.h.u) {
                ax0.b("visitAncestors called on an unattached node");
            }
            qg1 qg1Var3 = this.h.l;
            l41 l41VarY2 = cu.Y(this);
            int i3 = 0;
            int i4 = 0;
            boolean z2 = true;
            while (l41VarY2 != null) {
                if ((l41VarY2.L.f.k & 1024) != 0) {
                    while (qg1Var3 != null) {
                        if ((qg1Var3.j & 1024) != 0) {
                            qg1 qg1VarR2 = qg1Var3;
                            uj1 uj1Var3 = null;
                            while (qg1VarR2 != null) {
                                if (qg1VarR2 instanceof lm0) {
                                    lm0 lm0Var2 = (lm0) qg1VarR2;
                                    if (uz0.g(uj1Var != null ? Boolean.valueOf(uj1Var.j(lm0Var2)) : null, Boolean.TRUE)) {
                                        int i5 = i3 + 1;
                                        if (objArr.length < i5) {
                                            int length = objArr.length;
                                            Object[] objArr3 = new Object[Math.max(i5, length << 1)];
                                            System.arraycopy(objArr, 0, objArr3, 0, length);
                                            objArr = objArr3;
                                        }
                                        objArr[i3] = lm0Var2;
                                        i3 = i5;
                                    } else {
                                        em0Var = em0Var;
                                        int i6 = i4 + 1;
                                        if (objArr2.length < i6) {
                                            int length2 = objArr2.length;
                                            Object[] objArr4 = new Object[Math.max(i6, length2 << 1)];
                                            System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                            objArr2 = objArr4;
                                        }
                                        objArr2[i4] = lm0Var2;
                                        i4 = i6;
                                    }
                                    if (lm0Var2 == lm0VarF) {
                                        z2 = false;
                                    }
                                    z = false;
                                } else {
                                    em0Var = em0Var;
                                    z = true;
                                }
                                if (z && (qg1VarR2.j & 1024) != 0 && (qg1VarR2 instanceof k80)) {
                                    int i7 = 0;
                                    for (qg1 qg1Var4 = ((k80) qg1VarR2).w; qg1Var4 != null; qg1Var4 = qg1Var4.m) {
                                        if ((qg1Var4.j & 1024) != 0) {
                                            int i8 = i7 + 1;
                                            if (i8 == 1) {
                                                qg1VarR2 = qg1Var4;
                                                i8 = i8;
                                            } else {
                                                uj1 uj1Var4 = uj1Var3 == null ? new uj1(new qg1[16]) : uj1Var3;
                                                if (qg1VarR2 != null) {
                                                    uj1Var4.b(qg1VarR2);
                                                    qg1VarR2 = null;
                                                }
                                                uj1Var4.b(qg1Var4);
                                                uj1Var3 = uj1Var4;
                                            }
                                            i7 = i8;
                                        }
                                    }
                                    if (i7 != 1) {
                                        qg1VarR2 = cu.R(uj1Var3);
                                    }
                                } else {
                                    qg1VarR2 = cu.R(uj1Var3);
                                }
                                em0Var = em0Var;
                            }
                        }
                        qg1Var3 = qg1Var3.l;
                        em0Var = em0Var;
                    }
                }
                em0 em0Var2 = em0Var;
                l41VarY2 = l41VarY2.u();
                qg1Var3 = (l41VarY2 == null || (ln1Var = l41VarY2.L) == null) ? null : ln1Var.e;
                em0Var = em0Var2;
            }
            em0 em0Var3 = em0Var;
            if (!z2 || lm0VarF == null || vs.T(lm0VarF, false)) {
                ou.D(this, new o9((Object) this, (byte) 13));
                int iOrdinal2 = O0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        ((em0) cu.Z(this).getFocusOwner()).i(this);
                    } else if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            wg.n();
                            return false;
                        }
                        ((em0) cu.Z(this).getFocusOwner()).i(this);
                    }
                }
                km0 km0Var2 = km0.j;
                km0 km0Var3 = km0.h;
                if (z2 && lm0VarF != null) {
                    lm0VarF.K0(km0Var3, km0Var2);
                }
                km0 km0Var4 = km0.i;
                if (uj1Var != null) {
                    int i9 = uj1Var.j - 1;
                    Object[] objArr5 = uj1Var.h;
                    if (i9 < objArr5.length) {
                        while (i9 >= 0) {
                            lm0 lm0Var3 = (lm0) objArr5[i9];
                            if (em0Var3.f() == this) {
                                lm0Var3.K0(km0Var4, km0Var2);
                                i9--;
                            }
                        }
                        i = i4 - 1;
                        if (i < objArr2.length) {
                            while (i >= 0) {
                                lm0Var = (lm0) objArr2[i];
                                if (em0Var3.f() == this) {
                                    if (lm0Var == lm0VarF) {
                                        km0Var = km0Var3;
                                    } else {
                                        km0Var = km0Var2;
                                    }
                                    lm0Var.K0(km0Var, km0Var4);
                                    i--;
                                }
                            }
                            if (em0Var3.f() == this) {
                                K0(km0VarO0, km0Var3);
                                if (em0Var3.f() != this) {
                                    return true;
                                }
                            }
                        } else if (em0Var3.f() == this) {
                            K0(km0VarO0, km0Var3);
                            if (em0Var3.f() != this) {
                                return true;
                            }
                        }
                    } else {
                        i = i4 - 1;
                        if (i < objArr2.length) {
                            while (i >= 0) {
                                lm0Var = (lm0) objArr2[i];
                                if (em0Var3.f() == this) {
                                    if (lm0Var == lm0VarF) {
                                        km0Var = km0Var3;
                                    } else {
                                        km0Var = km0Var2;
                                    }
                                    lm0Var.K0(km0Var, km0Var4);
                                    i--;
                                }
                            }
                            if (em0Var3.f() == this) {
                                K0(km0VarO0, km0Var3);
                                if (em0Var3.f() != this) {
                                    return true;
                                }
                            }
                        } else if (em0Var3.f() == this) {
                            K0(km0VarO0, km0Var3);
                            if (em0Var3.f() != this) {
                                return true;
                            }
                        }
                    }
                } else {
                    i = i4 - 1;
                    if (i < objArr2.length) {
                        while (i >= 0) {
                            lm0Var = (lm0) objArr2[i];
                            if (em0Var3.f() == this) {
                                if (lm0Var == lm0VarF) {
                                    km0Var = km0Var3;
                                } else {
                                    km0Var = km0Var2;
                                }
                                lm0Var.K0(km0Var, km0Var4);
                                i--;
                            }
                        }
                        if (em0Var3.f() == this) {
                            K0(km0VarO0, km0Var3);
                            if (em0Var3.f() != this) {
                                return true;
                            }
                        }
                    } else if (em0Var3.f() == this) {
                        K0(km0VarO0, km0Var3);
                        if (em0Var3.f() != this) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                wg.n();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [qg1] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [qg1] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [uj1] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void K0(km0 km0Var, km0 km0Var2) {
        ln1 ln1Var;
        zp0 zp0Var;
        em0 em0Var = (em0) cu.Z(this).getFocusOwner();
        lm0 lm0VarF = em0Var.f();
        if (!km0Var.equals(km0Var2) && (zp0Var = this.v) != null) {
            zp0Var.f(km0Var, km0Var2);
        }
        qg1 qg1Var = this.h;
        if (!qg1Var.u) {
            ax0.b("visitAncestors called on an unattached node");
        }
        qg1 qg1Var2 = this.h;
        l41 l41VarY = cu.Y(this);
        while (l41VarY != null) {
            if ((l41VarY.L.f.k & 5120) != 0) {
                while (qg1Var2 != null) {
                    int i = qg1Var2.j;
                    if ((i & 5120) != 0) {
                        if (qg1Var2 != qg1Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? R = qg1Var2;
                            ?? uj1Var = 0;
                            while (R != 0) {
                                if (R instanceof vl0) {
                                    vl0 vl0Var = (vl0) R;
                                    if (lm0VarF == em0Var.f()) {
                                        vl0Var.W(km0Var2);
                                    }
                                } else if ((R.j & 4096) != 0 && (R instanceof k80)) {
                                    qg1 qg1Var3 = ((k80) R).w;
                                    int i2 = 0;
                                    R = R;
                                    uj1Var = uj1Var;
                                    while (qg1Var3 != null) {
                                        if ((qg1Var3.j & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uj1Var = uj1Var;
                                                R = qg1Var3;
                                            } else {
                                                if (uj1Var == 0) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (R != 0) {
                                                    uj1Var.b(R);
                                                    R = 0;
                                                }
                                                uj1Var.b(qg1Var3);
                                            }
                                        }
                                        qg1Var3 = qg1Var3.m;
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                R = cu.R(uj1Var);
                            }
                        }
                    }
                    qg1Var2 = qg1Var2.l;
                }
            }
            l41VarY = l41VarY.u();
            qg1Var2 = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
        }
    }

    public final fm0 L0() {
        boolean z;
        ln1 ln1Var;
        fm0 fm0Var = new fm0();
        fm0Var.a = true;
        gm0 gm0Var = gm0.b;
        fm0Var.b = gm0Var;
        fm0Var.c = gm0Var;
        fm0Var.d = gm0Var;
        fm0Var.e = gm0Var;
        fm0Var.f = gm0Var;
        fm0Var.g = gm0Var;
        fm0Var.h = gm0Var;
        fm0Var.i = gm0Var;
        fm0Var.j = new rt((byte) 25);
        fm0Var.k = new rt((byte) 26);
        fm0Var.l = c5.W;
        byte b = this.y;
        if (b == 1) {
            z = true;
        } else if (b == 0) {
            z = !(((kx0) ((mx0) ((lx0) vs.z(this, uz.m))).a.getValue()).a == 1);
        } else {
            if (b != 2) {
                li1.g("Unknown Focusability");
                return null;
            }
            z = false;
        }
        fm0Var.a = z;
        qg1 qg1Var = this.h;
        if (!qg1Var.u) {
            ax0.b("visitAncestors called on an unattached node");
        }
        qg1 qg1Var2 = this.h;
        l41 l41VarY = cu.Y(this);
        loop0: while (l41VarY != null) {
            if ((l41VarY.L.f.k & 3072) != 0) {
                while (qg1Var2 != null) {
                    int i = qg1Var2.j;
                    if ((i & 3072) != 0) {
                        if (qg1Var2 != qg1Var && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 2048) != 0) {
                            uj1 uj1Var = null;
                            qg1 qg1VarR = qg1Var2;
                            while (qg1VarR != null) {
                                if (qg1VarR instanceof qk) {
                                    pg1 pg1Var = ((qk) qg1VarR).v;
                                    ax0.b("applyFocusProperties called on wrong node");
                                    pg1Var.getClass();
                                    li1.c();
                                    return null;
                                }
                                if ((qg1VarR.j & 2048) != 0 && (qg1VarR instanceof k80)) {
                                    int i2 = 0;
                                    for (qg1 qg1Var3 = ((k80) qg1VarR).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                        if ((qg1Var3.j & 2048) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                qg1VarR = qg1Var3;
                                            } else {
                                                if (uj1Var == null) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (qg1VarR != null) {
                                                    uj1Var.b(qg1VarR);
                                                    qg1VarR = null;
                                                }
                                                uj1Var.b(qg1Var3);
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                qg1VarR = cu.R(uj1Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    qg1Var2 = qg1Var2.l;
                }
            }
            l41VarY = l41VarY.u();
            qg1Var2 = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
        }
        return fm0Var;
    }

    @Override // defpackage.rp1
    public final void M() {
        P0();
    }

    public final r72 M0(t31 t31Var) {
        r72 r72Var = L0().l;
        if (r72Var != c5.W) {
            return t31Var == null ? r72Var : r72Var.i(t31Var.G(cu.X(this), 0L));
        }
        return t31Var != null ? t31Var.M(cu.X(this), false) : h12.b(0L, ou.G(cu.X(this).j));
    }

    public final l61 N0() {
        ln1 ln1Var;
        Object obj;
        if (!this.h.u) {
            ax0.b("visitAncestors called on an unattached node");
        }
        qg1 qg1Var = this.h.l;
        l41 l41VarY = cu.Y(this);
        loop0: while (l41VarY != null) {
            if ((l41VarY.L.f.k & 8388640) != 0) {
                while (qg1Var != null) {
                    int i = qg1Var.j;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(qg1Var instanceof l61)) {
                                if (qg1Var instanceof k80) {
                                    qg1Var = null;
                                    for (qg1 qg1Var2 = ((k80) qg1Var).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                        if (qg1Var2 instanceof l61) {
                                            qg1Var = qg1Var2;
                                        }
                                    }
                                } else {
                                    qg1Var = null;
                                }
                            }
                            l61 l61Var = (l61) qg1Var;
                            if (l61Var != null) {
                                return l61Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (qg1Var instanceof tg1) {
                                obj = qg1Var;
                            } else if (qg1Var instanceof k80) {
                                obj = null;
                                for (qg1 qg1Var3 = ((k80) qg1Var).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                    if (qg1Var3 instanceof tg1) {
                                        obj = qg1Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            tg1 tg1Var = (tg1) obj;
                            if (tg1Var != null && tg1Var.k().q(h7.p)) {
                                return (l61) tg1Var.k().w();
                            }
                        }
                    }
                    qg1Var = qg1Var.l;
                }
            }
            l41VarY = l41VarY.u();
            qg1Var = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
        }
        return null;
    }

    public final km0 O0() {
        lm0 lm0VarF;
        ln1 ln1Var;
        boolean z = this.u;
        km0 km0Var = km0.j;
        if (!z || (lm0VarF = ((em0) cu.Z(this).getFocusOwner()).f()) == null) {
            return km0Var;
        }
        if (this == lm0VarF) {
            return km0.h;
        }
        if (lm0VarF.u) {
            if (!lm0VarF.h.u) {
                ax0.b("visitAncestors called on an unattached node");
            }
            qg1 qg1Var = lm0VarF.h.l;
            l41 l41VarY = cu.Y(lm0VarF);
            while (l41VarY != null) {
                if ((l41VarY.L.f.k & 1024) != 0) {
                    while (qg1Var != null) {
                        if ((qg1Var.j & 1024) != 0) {
                            qg1 qg1VarR = qg1Var;
                            uj1 uj1Var = null;
                            while (qg1VarR != null) {
                                if (qg1VarR instanceof lm0) {
                                    if (this == ((lm0) qg1VarR)) {
                                        return km0.i;
                                    }
                                } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                    int i = 0;
                                    for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                        if ((qg1Var2.j & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qg1VarR = qg1Var2;
                                            } else {
                                                if (uj1Var == null) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (qg1VarR != null) {
                                                    uj1Var.b(qg1VarR);
                                                    qg1VarR = null;
                                                }
                                                uj1Var.b(qg1Var2);
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                qg1VarR = cu.R(uj1Var);
                            }
                        }
                        qg1Var = qg1Var.l;
                    }
                }
                l41VarY = l41VarY.u();
                qg1Var = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
            }
        }
        return km0Var;
    }

    public final void P0() {
        int iOrdinal = O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    wg.n();
                    return;
                }
                return;
            }
        }
        x72 x72Var = new x72();
        ou.D(this, new h6((Object) x72Var, (Object) this, (byte) 15));
        Object obj = x72Var.h;
        if (obj == null) {
            uz0.A("focusProperties");
            throw null;
        }
        if (((fm0) obj).a) {
            return;
        }
        ((em0) cu.Z(this).getFocusOwner()).b(8, true, true);
    }

    public final boolean R0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return L0().a ? J0() : cy1.s(this, i, new rt(i));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }

    @Override // defpackage.qg1
    public final void B0() {
    }

    public final void Q0() {
    }
}
