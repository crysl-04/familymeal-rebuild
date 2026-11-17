package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bn1 extends qg1 implements yz2 {
    public final az v;
    public final wk w;
    public bn1 x;
    public final String y;

    public bn1(az azVar, wk wkVar) {
        this.v = azVar;
        this.w = wkVar == null ? new wk((byte) 9) : wkVar;
        this.y = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.qg1
    public final void B0() {
        wk wkVar = this.w;
        wkVar.j = this;
        wkVar.k = null;
        this.x = null;
        wkVar.i = new o9((Object) this, (byte) 27);
        wkVar.l = x0();
    }

    @Override // defpackage.qg1
    public final void C0() {
        x72 x72Var = new x72();
        y02.B(this, new f6(x72Var, (byte) 4));
        bn1 bn1Var = (bn1) ((yz2) x72Var.h);
        this.x = bn1Var;
        wk wkVar = this.w;
        wkVar.k = bn1Var;
        if (((bn1) wkVar.j) == this) {
            wkVar.j = null;
            wkVar.l = null;
            wkVar.i = h7.N;
        }
    }

    public final x20 J0() {
        bn1 bn1VarK0 = K0();
        x20 x20VarJ0 = bn1VarK0 != null ? bn1VarK0.J0() : null;
        if (x20VarJ0 != null && vs.I(x20VarJ0)) {
            return x20VarJ0;
        }
        x20 x20Var = (x20) this.w.l;
        if (x20Var != null) {
            return x20Var;
        }
        li1.g("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final bn1 K0() {
        ln1 ln1Var;
        yz2 yz2Var = null;
        if (!this.u) {
            return null;
        }
        if (!this.h.u) {
            ax0.b("visitAncestors called on an unattached node");
        }
        qg1 qg1Var = this.h.l;
        l41 l41VarY = cu.Y(this);
        loop0: while (l41VarY != null) {
            if ((l41VarY.L.f.k & 262144) != 0) {
                while (qg1Var != null) {
                    if ((qg1Var.j & 262144) != 0) {
                        qg1 qg1VarR = qg1Var;
                        uj1 uj1Var = null;
                        while (qg1VarR != null) {
                            if (qg1VarR instanceof yz2) {
                                yz2 yz2Var2 = (yz2) qg1VarR;
                                if (uz0.g(this.y, yz2Var2.r()) && bn1.class == yz2Var2.getClass()) {
                                    yz2Var = yz2Var2;
                                    break loop0;
                                }
                            }
                            if ((qg1VarR.j & 262144) != 0 && (qg1VarR instanceof k80)) {
                                int i = 0;
                                for (qg1 qg1Var2 = ((k80) qg1VarR).w; qg1Var2 != null; qg1Var2 = qg1Var2.m) {
                                    if ((qg1Var2.j & 262144) != 0) {
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
        return (bn1) yz2Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object L0(long j, long j2, n10 n10Var) {
        zm1 zm1Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (n10Var instanceof zm1) {
            zm1Var = (zm1) n10Var;
            int i = zm1Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                zm1Var.o = i - Integer.MIN_VALUE;
            } else {
                zm1Var = new zm1(this, n10Var);
            }
        } else {
            zm1Var = new zm1(this, n10Var);
        }
        zm1 zm1Var2 = zm1Var;
        Object objD = zm1Var2.m;
        int i2 = zm1Var2.o;
        bn1 bn1VarK0 = null;
        y20 y20Var = y20.h;
        if (i2 == 0) {
            m02.y(objD);
            zm1Var2.k = j;
            zm1Var2.l = j2;
            zm1Var2.o = 1;
            objD = this.v.d(j, j2, zm1Var2);
            if (objD != y20Var) {
                j3 = j;
                j4 = j2;
            }
            return y20Var;
        }
        if (i2 == 1) {
            j4 = zm1Var2.l;
            j3 = zm1Var2.k;
            m02.y(objD);
        } else {
            if (i2 != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = zm1Var2.k;
            m02.y(objD);
        }
        j6 = ((a43) objD).a;
        j5 = j7;
        return new a43(a43.e(j5, j6));
        j5 = ((a43) objD).a;
        boolean z = this.u;
        if (!z) {
            bn1VarK0 = this.x;
        } else if (z) {
            bn1VarK0 = K0();
        }
        if (bn1VarK0 != null) {
            long jE = a43.e(j3, j5);
            long jD = a43.d(j4, j5);
            zm1Var2.k = j5;
            zm1Var2.o = 2;
            objD = bn1VarK0.L0(jE, jD, zm1Var2);
            if (objD != y20Var) {
                j7 = j5;
                j6 = ((a43) objD).a;
                j5 = j7;
            }
            return y20Var;
        }
        j6 = 0;
        return new a43(a43.e(j5, j6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public final long M0(int i, long j, long j2) {
        long jI;
        az azVar = this.v;
        if (azVar.a) {
            qe2 qe2Var = (qe2) azVar.b;
            if (qe2Var.a.b()) {
                jI = 0;
            } else {
                jI = qe2Var.i(qe2Var.e(qe2Var.a.e(qe2Var.e(qe2Var.h(j2)))));
            }
        } else {
            jI = 0;
        }
        bn1 bn1VarK0 = this.u ? K0() : null;
        return up1.e(jI, bn1VarK0 != null ? bn1VarK0.M0(i, up1.e(j, jI), up1.d(j2, jI)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r11 != r7) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(long r9, defpackage.m10 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.an1
            if (r0 == 0) goto L13
            r0 = r11
            an1 r0 = (defpackage.an1) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L1a
        L13:
            an1 r0 = new an1
            n10 r11 = (defpackage.n10) r11
            r0.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r0.l
            int r1 = r0.n
            r2 = 0
            r3 = 0
            r5 = 2
            r6 = 1
            y20 r7 = defpackage.y20.h
            if (r1 == 0) goto L3b
            if (r1 == r6) goto L37
            if (r1 != r5) goto L31
            long r8 = r0.k
            defpackage.m02.y(r11)
            goto L6a
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r8)
            return r2
        L37:
            defpackage.m02.y(r11)
            goto L52
        L3b:
            defpackage.m02.y(r11)
            boolean r11 = r8.u
            if (r11 == 0) goto L46
            bn1 r2 = r8.K0()
        L46:
            if (r2 == 0) goto L57
            r0.k = r9
            r0.n = r6
            java.lang.Object r11 = r2.N0(r9, r0)
            if (r11 == r7) goto L68
        L52:
            a43 r11 = (defpackage.a43) r11
            long r9 = r11.a
            goto L58
        L57:
            r9 = r3
        L58:
            r0.k = r9
            r0.n = r5
            az r8 = r8.v
            r8.getClass()
            a43 r11 = new a43
            r11.<init>(r3)
            if (r11 != r7) goto L69
        L68:
            return r7
        L69:
            r8 = r9
        L6a:
            a43 r11 = (defpackage.a43) r11
            long r10 = r11.a
            long r8 = defpackage.a43.e(r8, r10)
            a43 r10 = new a43
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn1.N0(long, m10):java.lang.Object");
    }

    public final long O0(int i, long j) {
        bn1 bn1VarK0 = this.u ? K0() : null;
        long jO0 = bn1VarK0 != null ? bn1VarK0.O0(i, j) : 0L;
        this.v.getClass();
        return up1.e(jO0, 0L);
    }

    @Override // defpackage.yz2
    public final Object r() {
        return this.y;
    }
}
