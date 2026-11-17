package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class iu2 implements zp0 {
    public final /* synthetic */ xw2 h;
    public final /* synthetic */ xw2 i;
    public final /* synthetic */ oz2 j;
    public final /* synthetic */ oz2 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ oz2 m;
    public final /* synthetic */ nx n;
    public final /* synthetic */ nu2 o;

    public iu2(xw2 xw2Var, xw2 xw2Var2, oz2 oz2Var, oz2 oz2Var2, boolean z, oz2 oz2Var3, nx nxVar, nu2 nu2Var) {
        this.h = xw2Var;
        this.i = xw2Var2;
        this.j = oz2Var;
        this.k = oz2Var2;
        this.l = z;
        this.m = oz2Var3;
        this.n = nxVar;
        this.o = nu2Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c A[PHI: r39 r40
  0x009c: PHI (r39v3 ei2) = (r39v1 ei2), (r39v1 ei2), (r39v6 ei2) binds: [B:19:0x0083, B:23:0x0093, B:13:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r40v2 wv2) = (r40v1 wv2), (r40v1 wv2), (r40v3 wv2) binds: [B:19:0x0083, B:23:0x0093, B:13:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c5 A[PHI: r5
  0x01c5: PHI (r5v11 f02) = (r5v10 f02), (r5v21 f02) binds: [B:63:0x01bc, B:66:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0221  */
    /* JADX WARN: Code duplicated, block: B:73:0x0227  */
    /* JADX WARN: Code duplicated, block: B:76:0x0246 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0248  */
    /* JADX WARN: Code duplicated, block: B:78:0x024b  */
    /* JADX WARN: Code duplicated, block: B:79:0x024d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0252  */
    /* JADX WARN: Code duplicated, block: B:85:0x0257  */
    /* JADX WARN: Code duplicated, block: B:86:0x025a  */
    /* JADX WARN: Code duplicated, block: B:89:0x02e3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        xw2 xw2Var;
        wv2 wv2Var;
        ei2 ei2Var;
        xv2 bpVar;
        ei2 ei2VarR;
        ei2 ei2Var2;
        f02 f02Var;
        f02 f02Var2;
        f02 f02Var3;
        zv2 zv2Var;
        zv2 zv2Var2;
        xz1 xz1Var;
        xz1 xz1Var2;
        xz1 xz1Var3;
        xz1 xz1Var4;
        boolean z;
        boolean z2;
        xz1 xz1Var5;
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            float fFloatValue = ((Number) this.j.q.getValue()).floatValue();
            xw2 xw2Var2 = this.h;
            yl2 yl2Var = xw2Var2.a;
            xw2 xw2Var3 = this.i;
            yl2 yl2Var2 = xw2Var3.a;
            xv2 xv2Var = zl2.d;
            xv2 xv2Var2 = yl2Var.a;
            xv2 xv2Var3 = yl2Var2.a;
            boolean z3 = xv2Var2 instanceof bp;
            wv2 wv2Var2 = wv2.a;
            if (z3) {
                wv2Var = wv2Var2;
                ei2Var = null;
                if (xv2Var3 instanceof bp) {
                    bp bpVar2 = (bp) xv2Var2;
                    bp bpVar3 = (bp) xv2Var3;
                    zo zoVar = (zo) zl2.b(bpVar2.a, bpVar3.a, fFloatValue);
                    float fR = ls.R(bpVar2.b, bpVar3.b, fFloatValue);
                    if (zoVar == null) {
                        bpVar = wv2Var;
                    } else if (zoVar instanceof rl2) {
                        long jR = m02.r(fR, ((rl2) zoVar).a);
                        if (jR != 16) {
                            bpVar = new wv(jR);
                        } else {
                            bpVar = wv2Var;
                        }
                    } else {
                        if (!(zoVar instanceof ap)) {
                            wg.n();
                            return null;
                        }
                        bpVar = new bp((ap) zoVar, fR);
                    }
                } else {
                    bpVar = (xv2) zl2.b(xv2Var2, xv2Var3, fFloatValue);
                }
            } else if (xv2Var3 instanceof bp) {
                ei2Var = null;
                bpVar = (xv2) zl2.b(xv2Var2, xv2Var3, fFloatValue);
            } else {
                wv2Var = wv2Var2;
                ei2Var = null;
                long jK = cu.K(fFloatValue, xv2Var2.a(), xv2Var3.a());
                if (jK != 16) {
                    bpVar = new wv(jK);
                } else {
                    bpVar = wv2Var;
                }
            }
            xv2 xv2Var4 = bpVar;
            ar2 ar2Var = (ar2) zl2.b(yl2Var.f, yl2Var2.f, fFloatValue);
            long jC = zl2.c(fFloatValue, yl2Var.b, yl2Var2.b);
            qn0 qn0Var = yl2Var.c;
            if (qn0Var == null) {
                qn0Var = qn0.j;
            }
            qn0 qn0Var2 = yl2Var2.c;
            if (qn0Var2 == null) {
                qn0Var2 = qn0.j;
            }
            qn0 qn0Var3 = new qn0(cy1.n(ls.S(fFloatValue, qn0Var.h, qn0Var2.h), 1, 1000));
            on0 on0Var = (on0) zl2.b(yl2Var.d, yl2Var2.d, fFloatValue);
            pn0 pn0Var = (pn0) zl2.b(yl2Var.e, yl2Var2.e, fFloatValue);
            String str = (String) zl2.b(yl2Var.g, yl2Var2.g, fFloatValue);
            long jC2 = zl2.c(fFloatValue, yl2Var.h, yl2Var2.h);
            uk ukVar = yl2Var.i;
            float f = ukVar != null ? ukVar.a : 0.0f;
            uk ukVar2 = yl2Var2.i;
            float fR2 = ls.R(f, ukVar2 != null ? ukVar2.a : 0.0f, fFloatValue);
            yv2 yv2Var = yl2Var.j;
            yv2 yv2Var2 = yv2.c;
            if (yv2Var == null) {
                yv2Var = yv2Var2;
            }
            yv2 yv2Var3 = yl2Var2.j;
            if (yv2Var3 != null) {
                yv2Var2 = yv2Var3;
            }
            yv2 yv2Var4 = new yv2(ls.R(yv2Var.a, yv2Var2.a, fFloatValue), ls.R(yv2Var.b, yv2Var2.b, fFloatValue));
            ub1 ub1Var = (ub1) zl2.b(yl2Var.k, yl2Var2.k, fFloatValue);
            long jK2 = cu.K(fFloatValue, yl2Var.l, yl2Var2.l);
            vt2 vt2Var = (vt2) zl2.b(yl2Var.m, yl2Var2.m, fFloatValue);
            ei2 ei2Var3 = yl2Var.n;
            ei2 ei2Var4 = yl2Var2.n;
            if (ei2Var3 == null) {
                if (ei2Var4 == null) {
                    ei2Var2 = ei2Var;
                } else {
                    ei2VarR = h12.r(new ei2(ei2Var4.c, kv.b(0.0f, ei2Var4.a), ei2Var4.b), ei2Var4, fFloatValue);
                }
                f02Var = yl2Var.o;
                f02Var2 = yl2Var2.o;
                if (f02Var != null) {
                    f02Var3 = f02Var;
                } else if (f02Var2 == null) {
                    f02Var3 = ei2Var;
                } else {
                    f02Var = f02.a;
                    f02Var3 = f02Var;
                }
                yl2 yl2Var3 = new yl2(xv2Var4, jC, qn0Var3, on0Var, pn0Var, ar2Var, str, jC2, new uk(fR2), yv2Var4, ub1Var, jK2, vt2Var, ei2Var2, f02Var3, (ud0) zl2.b(yl2Var.p, yl2Var2.p, fFloatValue));
                cu1 cu1Var = xw2Var2.b;
                cu1 cu1Var2 = xw2Var3.b;
                int i = du1.b;
                int i2 = ((zs2) zl2.b(new zs2(cu1Var.a), new zs2(cu1Var2.a), fFloatValue)).a;
                int i3 = ((yt2) zl2.b(new yt2(cu1Var.b), new yt2(cu1Var2.b), fFloatValue)).a;
                long jC3 = zl2.c(fFloatValue, cu1Var.c, cu1Var2.c);
                zv2Var = cu1Var.d;
                if (zv2Var == null) {
                    zv2Var = zv2.c;
                }
                zv2Var2 = cu1Var2.d;
                if (zv2Var2 == null) {
                    zv2Var2 = zv2.c;
                }
                zv2 zv2Var3 = new zv2(zl2.c(fFloatValue, zv2Var.a, zv2Var2.a), zl2.c(fFloatValue, zv2Var.b, zv2Var2.b));
                xz1Var = cu1Var.e;
                xz1Var2 = cu1Var2.e;
                xz1Var3 = xz1.c;
                if (xz1Var == null) {
                    if (xz1Var2 == null) {
                        xz1Var5 = ei2Var;
                    } else {
                        xz1Var4 = xz1Var3;
                    }
                    xw2Var = new xw2(yl2Var3, new cu1(i2, i3, jC3, zv2Var3, xz1Var5, (w91) zl2.b(cu1Var.f, cu1Var2.f, fFloatValue), ((r91) zl2.b(new r91(cu1Var.g), new r91(cu1Var2.g), fFloatValue)).a, ((wt0) zl2.b(new wt0(cu1Var.h), new wt0(cu1Var2.h), fFloatValue)).a, (ow2) zl2.b(cu1Var.i, cu1Var2.i, fFloatValue)));
                    if (this.l) {
                        xw2Var = xw2.a(xw2Var, ((kv) this.m.q.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
                    }
                    y02.b(((kv) this.k.q.getValue()).a, xw2Var, dt.N(1157484991, new rl(this.n, this.o, (byte) 11, false), dr0Var), dr0Var, 384);
                } else {
                    xz1Var4 = xz1Var;
                }
                z = xz1Var4.a;
                if (xz1Var2 == null) {
                    xz1Var2 = xz1Var3;
                }
                z2 = xz1Var2.a;
                if (z == z2) {
                    xz1Var5 = xz1Var4;
                } else {
                    xz1Var5 = new xz1(((sf0) zl2.b(new sf0(xz1Var4.b), new sf0(xz1Var2.b), fFloatValue)).a, ((Boolean) zl2.b(Boolean.valueOf(z), Boolean.valueOf(z2), fFloatValue)).booleanValue());
                }
                xw2Var = new xw2(yl2Var3, new cu1(i2, i3, jC3, zv2Var3, xz1Var5, (w91) zl2.b(cu1Var.f, cu1Var2.f, fFloatValue), ((r91) zl2.b(new r91(cu1Var.g), new r91(cu1Var2.g), fFloatValue)).a, ((wt0) zl2.b(new wt0(cu1Var.h), new wt0(cu1Var2.h), fFloatValue)).a, (ow2) zl2.b(cu1Var.i, cu1Var2.i, fFloatValue)));
                if (this.l) {
                    xw2Var = xw2.a(xw2Var, ((kv) this.m.q.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
                }
                y02.b(((kv) this.k.q.getValue()).a, xw2Var, dt.N(1157484991, new rl(this.n, this.o, (byte) 11, false), dr0Var), dr0Var, 384);
            } else if (ei2Var4 == null) {
                ei2VarR = h12.r(ei2Var3, new ei2(ei2Var3.c, kv.b(0.0f, ei2Var3.a), ei2Var3.b), fFloatValue);
            } else {
                ei2VarR = h12.r(ei2Var3, ei2Var4, fFloatValue);
            }
            ei2Var2 = ei2VarR;
            f02Var = yl2Var.o;
            f02Var2 = yl2Var2.o;
            if (f02Var != null) {
                f02Var3 = f02Var;
            } else if (f02Var2 == null) {
                f02Var3 = ei2Var;
            } else {
                f02Var = f02.a;
                f02Var3 = f02Var;
            }
            yl2 yl2Var4 = new yl2(xv2Var4, jC, qn0Var3, on0Var, pn0Var, ar2Var, str, jC2, new uk(fR2), yv2Var4, ub1Var, jK2, vt2Var, ei2Var2, f02Var3, (ud0) zl2.b(yl2Var.p, yl2Var2.p, fFloatValue));
            cu1 cu1Var3 = xw2Var2.b;
            cu1 cu1Var4 = xw2Var3.b;
            int i4 = du1.b;
            int i5 = ((zs2) zl2.b(new zs2(cu1Var3.a), new zs2(cu1Var4.a), fFloatValue)).a;
            int i6 = ((yt2) zl2.b(new yt2(cu1Var3.b), new yt2(cu1Var4.b), fFloatValue)).a;
            long jC4 = zl2.c(fFloatValue, cu1Var3.c, cu1Var4.c);
            zv2Var = cu1Var3.d;
            if (zv2Var == null) {
                zv2Var = zv2.c;
            }
            zv2Var2 = cu1Var4.d;
            if (zv2Var2 == null) {
                zv2Var2 = zv2.c;
            }
            zv2 zv2Var4 = new zv2(zl2.c(fFloatValue, zv2Var.a, zv2Var2.a), zl2.c(fFloatValue, zv2Var.b, zv2Var2.b));
            xz1Var = cu1Var3.e;
            xz1Var2 = cu1Var4.e;
            xz1Var3 = xz1.c;
            if (xz1Var == null) {
                if (xz1Var2 == null) {
                    xz1Var5 = ei2Var;
                } else {
                    xz1Var4 = xz1Var3;
                }
                xw2Var = new xw2(yl2Var4, new cu1(i5, i6, jC4, zv2Var4, xz1Var5, (w91) zl2.b(cu1Var3.f, cu1Var4.f, fFloatValue), ((r91) zl2.b(new r91(cu1Var3.g), new r91(cu1Var4.g), fFloatValue)).a, ((wt0) zl2.b(new wt0(cu1Var3.h), new wt0(cu1Var4.h), fFloatValue)).a, (ow2) zl2.b(cu1Var3.i, cu1Var4.i, fFloatValue)));
                if (this.l) {
                    xw2Var = xw2.a(xw2Var, ((kv) this.m.q.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
                }
                y02.b(((kv) this.k.q.getValue()).a, xw2Var, dt.N(1157484991, new rl(this.n, this.o, (byte) 11, false), dr0Var), dr0Var, 384);
            } else {
                xz1Var4 = xz1Var;
            }
            z = xz1Var4.a;
            if (xz1Var2 == null) {
                xz1Var2 = xz1Var3;
            }
            z2 = xz1Var2.a;
            if (z == z2) {
                xz1Var5 = xz1Var4;
            } else {
                xz1Var5 = new xz1(((sf0) zl2.b(new sf0(xz1Var4.b), new sf0(xz1Var2.b), fFloatValue)).a, ((Boolean) zl2.b(Boolean.valueOf(z), Boolean.valueOf(z2), fFloatValue)).booleanValue());
            }
            xw2Var = new xw2(yl2Var4, new cu1(i5, i6, jC4, zv2Var4, xz1Var5, (w91) zl2.b(cu1Var3.f, cu1Var4.f, fFloatValue), ((r91) zl2.b(new r91(cu1Var3.g), new r91(cu1Var4.g), fFloatValue)).a, ((wt0) zl2.b(new wt0(cu1Var3.h), new wt0(cu1Var4.h), fFloatValue)).a, (ow2) zl2.b(cu1Var3.i, cu1Var4.i, fFloatValue)));
            if (this.l) {
                xw2Var = xw2.a(xw2Var, ((kv) this.m.q.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
            }
            y02.b(((kv) this.k.q.getValue()).a, xw2Var, dt.N(1157484991, new rl(this.n, this.o, (byte) 11, false), dr0Var), dr0Var, 384);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
