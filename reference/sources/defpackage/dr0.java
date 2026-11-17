package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 {
    public int A;
    public int B;
    public boolean C;
    public final cr0 D;
    public final ArrayList E;
    public boolean F;
    public dk2 G;
    public fk2 H;
    public ik2 I;
    public boolean J;
    public dx1 K;
    public as L;
    public final bz M;
    public xq0 N;
    public sj0 O;
    public zi2 P;
    public final mz Q;
    public final o20 R;
    public boolean S;
    public long T;
    public er0 U;
    public final b23 a;
    public final jz b;
    public final fk2 c;
    public final pj1 d;
    public final as e;
    public final as f;
    public final g2 g;
    public final oz h;
    public gr0 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public qi1 p;
    public boolean q;
    public boolean r;
    public si1 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final wy0 n = new wy0();
    public final ArrayList s = new ArrayList();
    public final wy0 t = new wy0();
    public dx1 u = dx1.k;
    public final wy0 x = new wy0();
    public int z = -1;

    public dr0(b23 b23Var, jz jzVar, fk2 fk2Var, pj1 pj1Var, as asVar, as asVar2, g2 g2Var, oz ozVar) {
        this.a = b23Var;
        this.b = jzVar;
        this.c = fk2Var;
        this.d = pj1Var;
        this.e = asVar;
        this.f = asVar2;
        this.g = g2Var;
        this.h = ozVar;
        this.C = jzVar.f() || jzVar.d();
        this.D = new cr0(this, (byte) 0);
        this.E = new ArrayList();
        dk2 dk2VarC = fk2Var.c();
        dk2VarC.c();
        this.G = dk2VarC;
        fk2 fk2Var2 = new fk2();
        if (jzVar.f()) {
            fk2Var2.b();
        }
        if (jzVar.d()) {
            fk2Var2.r = new si1();
        }
        this.H = fk2Var2;
        ik2 ik2VarD = fk2Var2.d();
        ik2VarD.e(true);
        this.I = ik2VarD;
        this.M = new bz(this, asVar);
        dk2 dk2VarC2 = this.H.c();
        try {
            xq0 xq0VarA = dk2VarC2.a(0);
            dk2VarC2.c();
            this.N = xq0VarA;
            this.O = new sj0();
            this.Q = new mz(this);
            o20 o20VarJ = jzVar.j();
            o20 o20VarY = y();
            this.R = o20VarJ.i(o20VarY == null ? xf0.h : o20VarY);
        } catch (Throwable th) {
            dk2VarC2.c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0191  */
    /* JADX WARN: Code duplicated, block: B:129:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0186  */
    /* JADX WARN: Code duplicated, block: B:97:0x0188  */
    public static final int M(dr0 dr0Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        boolean z2;
        int i4;
        long[] jArr;
        int i5;
        int i6;
        dk2 dk2Var;
        dk2 dk2Var2 = dr0Var.G;
        int i7 = 0;
        if (dk2Var2.j(i)) {
            int i8 = dk2Var2.i(i);
            Object objP = dk2Var2.p(dk2Var2.b, i);
            if (i8 == 206 && uz0.g(objP, ez.e)) {
                Object objH = dk2Var2.h(i, 0);
                hr0 hr0Var = objH instanceof hr0 ? (hr0) objH : null;
                h82 h82Var = hr0Var != null ? hr0Var.a : null;
                ar0 ar0Var = h82Var instanceof ar0 ? (ar0) h82Var : null;
                if (ar0Var != null) {
                    nj1 nj1Var = ar0Var.h.e;
                    Object[] objArr = nj1Var.b;
                    long[] jArr2 = nj1Var.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr2[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        dr0 dr0Var2 = (dr0) objArr[(i9 << 3) + i12];
                                        fk2 fk2Var = dr0Var2.c;
                                        if (fk2Var.i <= 0 || (fk2Var.h[1] & 67108864) == 0) {
                                            i6 = i7;
                                        } else {
                                            oz ozVar = dr0Var2.h;
                                            synchronized (ozVar.k) {
                                                try {
                                                    ozVar.p();
                                                    mj1 mj1Var = ozVar.u;
                                                    ozVar.u = p02.v();
                                                    try {
                                                        ozVar.C.b0(mj1Var);
                                                    } catch (Throwable th) {
                                                        ozVar.u = mj1Var;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                            as asVar = new as();
                                            dr0Var2.L = asVar;
                                            dk2 dk2VarC = dr0Var2.c.c();
                                            try {
                                                dr0Var2.G = dk2VarC;
                                                bz bzVar = dr0Var2.M;
                                                as asVar2 = bzVar.b;
                                                try {
                                                    bzVar.b = asVar;
                                                    dr0Var2.L(0);
                                                    bz bzVar2 = dr0Var2.M;
                                                    bzVar2.b();
                                                    try {
                                                        if (bzVar2.c) {
                                                            dk2Var = dk2VarC;
                                                            try {
                                                                bzVar2.b.h.r0(sr1.c);
                                                                if (bzVar2.c) {
                                                                    bzVar2.d(false);
                                                                    bzVar2.d(false);
                                                                    bzVar2.b.h.r0(cr1.c);
                                                                    i6 = 0;
                                                                    bzVar2.c = false;
                                                                }
                                                                bzVar.b = asVar2;
                                                                dk2Var.c();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                bzVar.b = asVar2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            dk2Var = dk2VarC;
                                                        }
                                                        bzVar.b = asVar2;
                                                        dk2Var.c();
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        dk2Var.c();
                                                        throw th;
                                                    }
                                                    i6 = 0;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    dk2Var = dk2VarC;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                dk2Var = dk2VarC;
                                            }
                                        }
                                        dr0Var.b.r(dr0Var2.h);
                                    } else {
                                        jArr2 = jArr2;
                                        i6 = i7;
                                        i10 = i10;
                                    }
                                    j >>= i10;
                                    i12++;
                                    i10 = i10;
                                    i7 = i6;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                i5 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                i5 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            i7 = i5;
                            jArr2 = jArr;
                        }
                    }
                }
                return dk2Var2.o(i);
            }
            i3 = 1;
            if (!dk2Var2.l(i)) {
                return dk2Var2.o(i);
            }
        } else {
            i3 = 1;
            if (dk2Var2.d(i)) {
                int i13 = dk2Var2.b[(i * 5) + 3] + i;
                int iM = 0;
                for (int i14 = i + 1; i14 < i13; i14 += dk2Var2.b[(i14 * 5) + 3]) {
                    boolean zL = dk2Var2.l(i14);
                    if (zL) {
                        dr0Var.M.c();
                        bz bzVar3 = dr0Var.M;
                        Object objN = dk2Var2.n(i14);
                        bzVar3.c();
                        bzVar3.h.add(objN);
                    } else {
                        if (!z) {
                            z2 = false;
                        }
                        if (zL) {
                            i4 = 0;
                        } else {
                            i4 = i2 + iM;
                        }
                        iM += M(dr0Var, i14, z2, i4);
                        if (zL) {
                            dr0Var.M.c();
                            dr0Var.M.a();
                        }
                    }
                    z2 = true;
                    if (zL) {
                        i4 = 0;
                    } else {
                        i4 = i2 + iM;
                    }
                    iM += M(dr0Var, i14, z2, i4);
                    if (zL) {
                        dr0Var.M.c();
                        dr0Var.M.a();
                    }
                }
                if (!dk2Var2.l(i)) {
                    return iM;
                }
            } else if (!dk2Var2.l(i)) {
                return dk2Var2.o(i);
            }
        }
        return i3;
    }

    public final void A(ArrayList arrayList) {
        dr0 dr0Var = this;
        as asVar = dr0Var.f;
        bz bzVar = dr0Var.M;
        as asVar2 = bzVar.b;
        try {
            bzVar.b = asVar;
            asVar.h.r0(qr1.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                wt1 wt1Var = (wt1) arrayList.get(i);
                ph1 ph1Var = (ph1) wt1Var.h;
                ph1Var.getClass();
                xq0 xq0VarS = dt.s(null);
                fk2 fk2VarA = hk2.a(null);
                int iA = fk2VarA.a(xq0VarS);
                sy0 sy0Var = new sy0();
                bzVar.b();
                bs1 bs1Var = bzVar.b.h;
                bs1Var.r0(zq1.c);
                dt.R(bs1Var, 0, sy0Var, 1, xq0VarS);
                if (fk2VarA == dr0Var.H) {
                    if (!dr0Var.I.w) {
                        ez.a("Check failed");
                    }
                    dr0Var.u();
                }
                dk2 dk2VarC = fk2VarA.c();
                try {
                    dk2VarC.r(iA);
                    bzVar.f = iA;
                    as asVar3 = new as();
                    dr0Var.F(null, null, null, ag0.h, new zi(dr0Var, asVar3, dk2VarC, ph1Var));
                    as asVar4 = bzVar.b;
                    asVar4.getClass();
                    if (!asVar3.h.q0()) {
                        bs1 bs1Var2 = asVar4.h;
                        bs1Var2.r0(vq1.c);
                        dt.R(bs1Var2, 0, asVar3, 1, sy0Var);
                    }
                    dk2VarC.c();
                    bzVar.b.h.r0(sr1.c);
                    i++;
                    dr0Var = this;
                } catch (Throwable th) {
                    dk2VarC.c();
                    throw th;
                }
            }
            bzVar.b();
            bzVar.b.h.r0(dr1.c);
            bzVar.f = 0;
            bzVar.b = asVar2;
        } catch (Throwable th2) {
            bzVar.b = asVar2;
            throw th2;
        }
    }

    public final void B(dx1 dx1Var, Object obj) {
        R(126665345, 0, null, null);
        C();
        g0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                ik2.y(this.I);
            }
            boolean z = (this.S || uz0.g(this.G.f(), dx1Var)) ? false : true;
            if (z) {
                I(dx1Var);
            }
            R(202, 0, ez.c, dx1Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            ys.L(this, new nx(-59194059, true, new s(obj, (byte) 11)));
            this.w = z2;
            p(false);
            this.K = null;
            this.T = j;
            p(false);
        } catch (Throwable th) {
            try {
                ou.H(th, new zq0(this, (byte) 2));
                throw th;
            } catch (Throwable th2) {
                p(false);
                this.K = null;
                this.T = j;
                p(false);
                throw th2;
            }
        }
    }

    public final Object C() {
        boolean z = this.S;
        yy yyVar = zy.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof i92)) {
                return objM;
            }
        } else if (this.r) {
            ez.a("A call to createNode(), emitNode() or useNode() expected");
            return yyVar;
        }
        return yyVar;
    }

    public final List D() {
        jz jzVar = this.b;
        iz izVarH = jzVar.h();
        oz ozVar = izVarH != null ? (oz) izVarH : null;
        if (ozVar != null) {
            fk2 fk2Var = ozVar.m;
            dk2 dk2VarC = hk2.a(fk2Var).c();
            try {
                Integer numE = cu.E(dk2VarC, jzVar, 0, dk2VarC.c);
                dk2VarC.c();
                if (numE != null) {
                    dk2 dk2VarC2 = hk2.a(fk2Var).c();
                    try {
                        return dv.I0(cu.l0(dk2VarC2, numE.intValue(), 0), ozVar.C.D());
                    } finally {
                        dk2VarC2.c();
                    }
                }
            } catch (Throwable th) {
                dk2VarC.c();
                throw th;
            }
        }
        return ag0.h;
    }

    public final int E(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #1 {all -> 0x005c, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:10:0x0027, B:9:0x0024, B:13:0x002e, B:18:0x003a, B:20:0x0042, B:22:0x0048, B:23:0x004c, B:24:0x004d, B:26:0x0053, B:19:0x003e), top: B:34:0x0005, inners: #0 }] */
    public final Object F(oz ozVar, oz ozVar2, Integer num, List list, kp0 kp0Var) {
        Object objA;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                wt1 wt1Var = (wt1) list.get(i2);
                e72 e72Var = (e72) wt1Var.h;
                Object obj = wt1Var.i;
                if (obj != null) {
                    a0(e72Var, obj);
                } else {
                    a0(e72Var, null);
                }
            }
            if (ozVar == null) {
                objA = kp0Var.a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (ozVar2 == null || ozVar2 == ozVar || iIntValue < 0) {
                    objA = kp0Var.a();
                } else {
                    ozVar.y = ozVar2;
                    ozVar.z = iIntValue;
                    try {
                        objA = kp0Var.a();
                        ozVar.y = null;
                        ozVar.z = 0;
                    } catch (Throwable th) {
                        ozVar.y = null;
                        ozVar.z = 0;
                        throw th;
                    }
                }
                if (objA == null) {
                    objA = kp0Var.a();
                }
            }
            this.F = z;
            this.k = i;
            return objA;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x02e6 A[LOOP:5: B:130:0x02a4->B:143:0x02e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x02ed A[EDGE_INSN: B:187:0x02ed->B:144:0x02ed BREAK  A[LOOP:5: B:130:0x02a4->B:143:0x02e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x011a A[LOOP:7: B:36:0x00c3->B:55:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:67:0x015c  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:9:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:71:0x016e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void G() {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr0.G():void");
    }

    public final void H() throws Throwable {
        int i;
        L(this.G.g);
        bz bzVar = this.M;
        bzVar.d(false);
        wy0 wy0Var = bzVar.d;
        dr0 dr0Var = bzVar.a;
        dk2 dk2Var = dr0Var.G;
        if (dk2Var.c > 0 && wy0Var.a(-2) != (i = dk2Var.i)) {
            if (!bzVar.c && bzVar.e) {
                bzVar.d(false);
                bzVar.b.h.r0(gr1.c);
                bzVar.c = true;
            }
            if (i > 0) {
                xq0 xq0VarA = dk2Var.a(i);
                wy0Var.c(i);
                bzVar.d(false);
                bs1 bs1Var = bzVar.b.h;
                bs1Var.r0(fr1.c);
                dt.Q(bs1Var, 0, xq0VarA);
                bzVar.c = true;
            }
        }
        bzVar.b.h.r0(or1.c);
        int i2 = bzVar.f;
        dk2 dk2Var2 = dr0Var.G;
        bzVar.f = dk2Var2.b[(dk2Var2.g * 5) + 3] + i2;
    }

    public final void I(dx1 dx1Var) {
        si1 si1Var = this.v;
        if (si1Var == null) {
            si1Var = new si1();
            this.v = si1Var;
        }
        si1Var.h(this.G.g, dx1Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    public final void J(int i, int i2, int i3) {
        dk2 dk2Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (dk2Var.q(i) == i2) {
                i3 = i2;
            } else if (dk2Var.q(i2) == i) {
                i3 = i;
            } else if (dk2Var.q(i) == dk2Var.q(i2)) {
                i3 = dk2Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = dk2Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = dk2Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = dk2Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = dk2Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = dk2Var.q(iQ5)) {
                    i3 = dk2Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (dk2Var.l(i)) {
                this.M.a();
            }
            i = dk2Var.q(i);
        }
        o(i2, i3);
    }

    public final Object K() {
        boolean z = this.S;
        yy yyVar = zy.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof i92)) {
                return objM instanceof hr0 ? ((hr0) objM).a : objM;
            }
        } else if (this.r) {
            ez.a("A call to createNode(), emitNode() or useNode() expected");
            return yyVar;
        }
        return yyVar;
    }

    public final void L(int i) throws Throwable {
        boolean zL = this.G.l(i);
        bz bzVar = this.M;
        if (zL) {
            bzVar.c();
            Object objN = this.G.n(i);
            bzVar.c();
            bzVar.h.add(objN);
        }
        M(this, i, zL, 0);
        bzVar.c();
        if (zL) {
            bzVar.a();
        }
    }

    public final boolean N(int i, boolean z) {
        e72 e72VarW;
        if ((i & 1) == 0 && (this.S || this.y)) {
            zi2 zi2Var = this.P;
            if (zi2Var != null && (e72VarW = w()) != null && zi2Var.b()) {
                int i2 = e72VarW.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                e72VarW.b = i3;
                e72VarW.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                bs1 bs1Var = this.M.b.h;
                bs1Var.r0(nr1.c);
                dt.Q(bs1Var, 0, e72VarW);
                this.b.q(e72VarW);
                return false;
            }
        } else if (!z && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    public final void O() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        dk2 dk2Var = this.G;
        int iG = dk2Var.g();
        int[] iArr = dk2Var.b;
        int i = dk2Var.g;
        Object objP = i < dk2Var.h ? dk2Var.p(iArr, i) : null;
        Object objF = dk2Var.f();
        int i2 = this.m;
        yy yyVar = zy.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(yyVar)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            U(null, (iArr[(dk2Var.g * 5) + 1] & 1073741824) != 0);
            G();
            dk2Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(yyVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) iG), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        U(null, (iArr[(dk2Var.g * 5) + 1] & 1073741824) != 0);
        G();
        dk2Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) iG), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void P() {
        dk2 dk2Var = this.G;
        int i = dk2Var.i;
        this.l = i >= 0 ? dk2Var.b[(i * 5) + 1] & 67108863 : 0;
        dk2Var.t();
    }

    public final void Q() {
        if (this.l != 0) {
            ez.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        e72 e72VarW = w();
        if (e72VarW != null) {
            int i = e72VarW.b;
            if ((i & 128) == 0) {
                e72VarW.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x031f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0335  */
    /* JADX WARN: Code duplicated, block: B:177:0x0350  */
    /* JADX WARN: Code duplicated, block: B:178:0x0356 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0358 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x035c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:185:0x0366  */
    /* JADX WARN: Code duplicated, block: B:186:0x0368  */
    /* JADX WARN: Code duplicated, block: B:190:0x0396  */
    /* JADX WARN: Code duplicated, block: B:191:0x0398  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:70:0x0124  */
    /* JADX WARN: Code duplicated, block: B:75:0x0148  */
    /* JADX WARN: Code duplicated, block: B:77:0x0150  */
    /* JADX WARN: Code duplicated, block: B:78:0x015a  */
    /* JADX WARN: Code duplicated, block: B:81:0x016e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0170  */
    /* JADX WARN: Code duplicated, block: B:84:0x0174  */
    /* JADX WARN: Code duplicated, block: B:86:0x0181  */
    /* JADX WARN: Code duplicated, block: B:89:0x0189  */
    /* JADX WARN: Code duplicated, block: B:91:0x0192  */
    public final void R(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        gr0 gr0Var;
        gr0 gr0Var2;
        ArrayList arrayList;
        si1 si1Var;
        int i3;
        Object objValueOf;
        mj1 mj1Var;
        Object objG;
        fj1 fj1Var;
        ik2 ik2Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        dk2 dk2Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        dk2 dk2Var2;
        int i13;
        Object objP;
        ik2 ik2Var2;
        int i14;
        gr0 gr0Var3;
        Object obj4 = obj;
        if (this.r) {
            ez.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.m;
        Object obj5 = zy.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                ik2Var2 = this.I;
                i14 = ik2Var2.t;
                if (z) {
                    ik2Var2.P(i, obj5, true, obj5);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    ik2Var2.P(i, obj4, false, obj2);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    ik2Var2.P(i, obj4, false, obj5);
                }
                gr0Var3 = this.j;
                if (gr0Var3 != null) {
                    int i16 = (-2) - i14;
                    x21 x21Var = new x21(-1, i, i16, -1);
                    gr0Var3.e.h(i16, new ls0(-1, this.k - gr0Var3.b, 0));
                    gr0Var3.d.add(x21Var);
                }
                t(z, null);
                return;
            }
            if (i2 == 1 || !this.y) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    dk2Var2 = this.G;
                    i13 = dk2Var2.g;
                    if (i13 < dk2Var2.h) {
                        objP = dk2Var2.p(dk2Var2.b, i13);
                    } else {
                        objP = null;
                    }
                    if (uz0.g(obj4, objP)) {
                        U(obj2, z);
                        z3 = z2;
                    }
                }
                dk2Var = this.G;
                iArr = dk2Var.b;
                arrayList2 = new ArrayList();
                if (dk2Var.k <= 0) {
                    i10 = dk2Var.g;
                    while (i10 < dk2Var.h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objP2 = dk2Var.p(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new x21(objP2, i18, i10, i12));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new gr0(arrayList2, this.k);
            } else {
                z3 = z2;
            }
            gr0Var = this.j;
            if (gr0Var != null) {
                arrayList = gr0Var.d;
                si1Var = gr0Var.e;
                i3 = gr0Var.b;
                if (obj4 != null) {
                    objValueOf = new a11(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                mj1Var = ((ai1) gr0Var.f.getValue()).a;
                objG = mj1Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof fj1) {
                    fj1Var = (fj1) objG;
                    Object objL = fj1Var.l(0);
                    if (fj1Var.i()) {
                        mj1Var.l(objValueOf);
                    }
                    if (fj1Var.b == 1) {
                        mj1Var.n(objValueOf, fj1Var.f());
                    }
                    objG = objL;
                } else {
                    mj1Var.l(objValueOf);
                }
                x21 x21Var2 = (x21) objG;
                if (!z3 || x21Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        ik2 ik2VarD = this.H.d();
                        this.I = ik2VarD;
                        ik2VarD.L();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    ik2Var = this.I;
                    int i19 = ik2Var.t;
                    if (z) {
                        ik2Var.P(i, obj5, true, obj5);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        ik2Var.P(i, obj5, false, obj2);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        ik2Var.P(i, obj3, false, obj5);
                    }
                    this.N = this.I.b(i19);
                    int i20 = (-2) - i19;
                    x21 x21Var3 = new x21(-1, i, i20, -1);
                    si1Var.h(i20, new ls0(-1, this.k - i3, i4));
                    arrayList.add(x21Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    gr0Var2 = new gr0(arrayList3, i5);
                } else {
                    int i21 = x21Var2.c;
                    arrayList.add(x21Var2);
                    ls0 ls0Var = (ls0) si1Var.b(i21);
                    this.k = (ls0Var != null ? ls0Var.b : -1) + i3;
                    ls0 ls0Var2 = (ls0) si1Var.b(i21);
                    int i22 = ls0Var2 != null ? ls0Var2.a : -1;
                    int i23 = gr0Var.c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = si1Var.c;
                            long[] jArr = si1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                ls0 ls0Var3 = (ls0) objArr3[(i26 << 3) + i28];
                                                int i29 = ls0Var3.a;
                                                if (i29 == i22) {
                                                    ls0Var3.a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        ls0Var3.a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = si1Var.c;
                        long[] jArr2 = si1Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j2 & 255) < 128) {
                                            i9 = i25;
                                            ls0 ls0Var4 = (ls0) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = ls0Var4.a;
                                            if (i33 == i22) {
                                                ls0Var4.a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                ls0Var4.a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j2 >>= i9;
                                        i32++;
                                        i24 = i8;
                                        i25 = i9;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    bz bzVar = this.M;
                    int i34 = bzVar.f;
                    dr0 dr0Var = bzVar.a;
                    bzVar.f = (i21 - dr0Var.G.g) + i34;
                    this.G.r(i21);
                    if (i6 > 0) {
                        bzVar.d(false);
                        wy0 wy0Var = bzVar.d;
                        dk2 dk2Var3 = dr0Var.G;
                        if (dk2Var3.c > 0 && wy0Var.a(-2) != (i7 = dk2Var3.i)) {
                            if (!bzVar.c && bzVar.e) {
                                bzVar.d(false);
                                bzVar.b.h.r0(gr1.c);
                                bzVar.c = true;
                            }
                            if (i7 > 0) {
                                xq0 xq0VarA = dk2Var3.a(i7);
                                wy0Var.c(i7);
                                bzVar.d(false);
                                bs1 bs1Var = bzVar.b.h;
                                bs1Var.r0(fr1.c);
                                dt.Q(bs1Var, 0, xq0VarA);
                                bzVar.c = true;
                            }
                        }
                        bs1 bs1Var2 = bzVar.b.h;
                        bs1Var2.r0(kr1.c);
                        bs1Var2.j[bs1Var2.k - bs1Var2.h[bs1Var2.i - 1].a] = i6;
                    }
                    U(obj2, z);
                    gr0Var2 = null;
                }
            } else {
                gr0Var2 = null;
            }
            t(z, gr0Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            ik2Var2 = this.I;
            i14 = ik2Var2.t;
            if (z) {
                ik2Var2.P(i, obj5, true, obj5);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                ik2Var2.P(i, obj4, false, obj2);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                ik2Var2.P(i, obj4, false, obj5);
            }
            gr0Var3 = this.j;
            if (gr0Var3 != null) {
                int i110 = (-2) - i14;
                x21 x21Var4 = new x21(-1, i, i110, -1);
                gr0Var3.e.h(i110, new ls0(-1, this.k - gr0Var3.b, 0));
                gr0Var3.d.add(x21Var4);
            }
            t(z, null);
            return;
        }
        if (i2 == 1) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                dk2Var2 = this.G;
                i13 = dk2Var2.g;
                if (i13 < dk2Var2.h) {
                    objP = dk2Var2.p(dk2Var2.b, i13);
                } else {
                    objP = null;
                }
                if (uz0.g(obj4, objP)) {
                    U(obj2, z);
                    z3 = z2;
                }
            }
            dk2Var = this.G;
            iArr = dk2Var.b;
            arrayList2 = new ArrayList();
            if (dk2Var.k <= 0) {
                i10 = dk2Var.g;
                while (i10 < dk2Var.h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = dk2Var.p(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new x21(objP3, i112, i10, i12));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new gr0(arrayList2, this.k);
        } else {
            z3 = z2;
        }
        gr0Var = this.j;
        if (gr0Var != null) {
            arrayList = gr0Var.d;
            si1Var = gr0Var.e;
            i3 = gr0Var.b;
            if (obj4 != null) {
                objValueOf = new a11(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            mj1Var = ((ai1) gr0Var.f.getValue()).a;
            objG = mj1Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof fj1) {
                fj1Var = (fj1) objG;
                Object objL2 = fj1Var.l(0);
                if (fj1Var.i()) {
                    mj1Var.l(objValueOf);
                }
                if (fj1Var.b == 1) {
                    mj1Var.n(objValueOf, fj1Var.f());
                }
                objG = objL2;
            } else {
                mj1Var.l(objValueOf);
            }
            x21 x21Var5 = (x21) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                ik2 ik2VarD2 = this.H.d();
                this.I = ik2VarD2;
                ik2VarD2.L();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            ik2Var = this.I;
            int i113 = ik2Var.t;
            if (z) {
                ik2Var.P(i, obj5, true, obj5);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                ik2Var.P(i, obj5, false, obj2);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                ik2Var.P(i, obj3, false, obj5);
            }
            this.N = this.I.b(i113);
            int i210 = (-2) - i113;
            x21 x21Var6 = new x21(-1, i, i210, -1);
            si1Var.h(i210, new ls0(-1, this.k - i3, i4));
            arrayList.add(x21Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            gr0Var2 = new gr0(arrayList4, i5);
        } else {
            gr0Var2 = null;
        }
        t(z, gr0Var2);
    }

    public final void S() {
        R(-127, 0, null, null);
    }

    public final void T(int i, sq1 sq1Var) {
        R(i, 0, sq1Var, null);
    }

    public final void U(Object obj, boolean z) {
        if (z) {
            dk2 dk2Var = this.G;
            if (dk2Var.k <= 0) {
                if ((dk2Var.b[(dk2Var.g * 5) + 1] & 1073741824) == 0) {
                    w12.a("Expected a node group");
                }
                dk2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            bz bzVar = this.M;
            bzVar.getClass();
            bzVar.d(false);
            bs1 bs1Var = bzVar.b.h;
            bs1Var.r0(vr1.c);
            dt.Q(bs1Var, 0, obj);
        }
        this.G.u();
    }

    public final void V(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            R(i, 0, null, null);
            return;
        }
        if (this.r) {
            ez.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        dk2 dk2Var = this.G;
        boolean z = this.S;
        yy yyVar = zy.a;
        if (z) {
            dk2Var.k++;
            this.I.P(i, yyVar, false, yyVar);
            t(false, null);
            return;
        }
        if (dk2Var.g() == i && ((i3 = dk2Var.g) >= dk2Var.h || (dk2Var.b[(i3 * 5) + 1] & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0)) {
            dk2Var.u();
            t(false, null);
            return;
        }
        if (dk2Var.k <= 0 && (i2 = dk2Var.g) != dk2Var.h) {
            int i4 = this.k;
            H();
            this.M.e(i4, dk2Var.s());
            aa3.H(this.s, i2, dk2Var.g);
        }
        dk2Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            ik2 ik2VarD = this.H.d();
            this.I = ik2VarD;
            ik2VarD.L();
            this.J = false;
            this.K = null;
        }
        ik2 ik2Var = this.I;
        ik2Var.d();
        int i5 = ik2Var.t;
        ik2Var.P(i, yyVar, false, yyVar);
        this.N = ik2Var.b(i5);
        t(false, null);
    }

    public final dr0 W(int i) {
        e72 e72Var;
        boolean z;
        V(i);
        boolean z2 = this.S;
        g2 g2Var = this.g;
        ArrayList arrayList = this.E;
        oz ozVar = this.h;
        if (z2) {
            e72 e72Var2 = new e72(ozVar);
            arrayList.add(e72Var2);
            g0(e72Var2);
            e72Var2.e = this.B;
            e72Var2.b &= -17;
            g2Var.A();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iM = aa3.m(arrayList2, i2);
        c01 c01Var = iM >= 0 ? (c01) arrayList2.remove(iM) : null;
        Object objM = this.G.m();
        if (uz0.g(objM, zy.a)) {
            e72Var = new e72(ozVar);
            g0(e72Var);
        } else {
            objM.getClass();
            e72Var = (e72) objM;
        }
        if (c01Var == null) {
            int i3 = e72Var.b;
            if ((i3 & 64) != 0) {
                e72Var.b = i3 & (-65);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = e72Var.b;
        e72Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(e72Var);
        e72Var.e = this.B;
        e72Var.b &= -17;
        g2Var.A();
        int i5 = e72Var.b;
        if ((i5 & 256) != 0) {
            e72Var.b = (i5 & (-257)) | 512;
            bs1 bs1Var = this.M.b.h;
            bs1Var.r0(tr1.c);
            dt.Q(bs1Var, 0, e72Var);
            if (!this.y) {
                int i6 = e72Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    e72Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final void X(Object obj) {
        if (!this.S && this.G.g() == 207 && !uz0.g(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        R(207, 0, null, obj);
    }

    public final void Y() {
        R(125, 2, null, null);
        this.r = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Z() {
        this.m = 0;
        this.G = this.c.c();
        R(100, 0, null, null);
        jz jzVar = this.b;
        jzVar.t();
        dx1 dx1VarI = jzVar.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(dx1VarI);
        this.K = null;
        if (!this.q) {
            this.q = jzVar.e();
        }
        boolean zF = this.C;
        if (!zF) {
            zF = jzVar.f();
            this.C = zF;
        }
        if (zF) {
            ie0 ie0Var = nz.a;
            ie0Var.getClass();
            dx1VarI = dx1VarI.b(ie0Var, new tn2(y()));
        }
        this.u = dx1VarI;
        Set set = (Set) dt.M(dx1VarI, zx0.a);
        if (set != null) {
            set.add(v());
            jzVar.o(set);
        }
        R(Long.hashCode(jzVar.g()), 0, null, null);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        sj0 sj0Var = this.O;
        sj0Var.i.o0();
        sj0Var.h.o0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        dk2 dk2Var = this.G;
        if (!dk2Var.f) {
            dk2Var.c();
        }
        if (this.I.w) {
            return;
        }
        u();
    }

    public final boolean a0(e72 e72Var, Object obj) {
        xq0 xq0Var = e72Var.c;
        if (xq0Var == null) {
            return false;
        }
        int iA = this.G.a.a(dt.s(xq0Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iM = aa3.m(arrayList, iA);
        if (iM < 0) {
            int i = -(iM + 1);
            if (!(obj instanceof o90)) {
                obj = null;
            }
            arrayList.add(i, new c01(e72Var, iA, obj));
            return true;
        }
        c01 c01Var = (c01) arrayList.get(iM);
        if (!(obj instanceof o90)) {
            c01Var.c = null;
            return true;
        }
        Object obj2 = c01Var.c;
        if (obj2 == null) {
            c01Var.c = obj;
            return true;
        }
        if (obj2 instanceof nj1) {
            ((nj1) obj2).a(obj);
            return true;
        }
        nj1 nj1Var = cd2.a;
        nj1 nj1Var2 = new nj1(2);
        nj1Var2.k(obj2);
        nj1Var2.k(obj);
        c01Var.c = nj1Var2;
        return true;
    }

    public final void b(zp0 zp0Var, Object obj) {
        if (this.S) {
            bs1 bs1Var = this.O.h;
            bs1Var.r0(wr1.c);
            dt.Q(bs1Var, 0, obj);
            t03.k(2, zp0Var);
            dt.Q(bs1Var, 1, zp0Var);
            return;
        }
        bz bzVar = this.M;
        bzVar.b();
        bs1 bs1Var2 = bzVar.b.h;
        bs1Var2.r0(wr1.c);
        t03.k(2, zp0Var);
        dt.R(bs1Var2, 0, obj, 1, zp0Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void b0(mj1 mj1Var) {
        ArrayList arrayList = this.s;
        for (int iH = lt.H(arrayList); -1 < iH; iH--) {
            c01 c01Var = (c01) arrayList.get(iH);
            xq0 xq0Var = c01Var.a.c;
            xq0 xq0VarS = xq0Var != null ? dt.s(xq0Var) : null;
            if (xq0VarS == null || !xq0VarS.a()) {
                arrayList.remove(iH);
            } else {
                int i = c01Var.b;
                int i2 = xq0VarS.a;
                if (i != i2) {
                    c01Var.b = i2;
                }
            }
        }
        Object[] objArr = mj1Var.b;
        Object[] objArr2 = mj1Var.c;
        long[] jArr = mj1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            e72 e72Var = (e72) obj;
                            xq0 xq0Var2 = e72Var.c;
                            if (xq0Var2 != null) {
                                int i7 = dt.s(xq0Var2).a;
                                if (obj2 == vz1.l) {
                                    obj2 = null;
                                }
                                arrayList.add(new c01(e72Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        hv.p0(arrayList, aa3.B);
    }

    public final boolean c(float f) {
        Object objC = C();
        if ((objC instanceof Float) && f == ((Number) objC).floatValue()) {
            return false;
        }
        g0(Float.valueOf(f));
        return true;
    }

    public final void c0(int i, int i2) {
        if (h0(i) != i2) {
            if (i < 0) {
                qi1 qi1Var = this.p;
                if (qi1Var == null) {
                    qi1Var = new qi1();
                    this.p = qi1Var;
                }
                qi1Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean d(int i) {
        Object objC = C();
        if ((objC instanceof Integer) && i == ((Number) objC).intValue()) {
            return false;
        }
        g0(Integer.valueOf(i));
        return true;
    }

    public final void d0(int i, int i2) {
        int iH0 = h0(i);
        if (iH0 != i2) {
            int i3 = i2 - iH0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iH1 = h0(i) + i3;
                c0(i, iH1);
                for (int i4 = size; -1 < i4; i4--) {
                    gr0 gr0Var = (gr0) arrayList.get(i4);
                    if (gr0Var != null && gr0Var.a(i, iH1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                dk2 dk2Var = this.G;
                if (i < 0) {
                    i = dk2Var.i;
                } else if (dk2Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean e(long j) {
        Object objC = C();
        if ((objC instanceof Long) && j == ((Number) objC).longValue()) {
            return false;
        }
        g0(Long.valueOf(j));
        return true;
    }

    public final dx1 e0(dx1 dx1Var, dx1 dx1Var2) {
        dx1Var.getClass();
        cx1 cx1Var = new cx1(dx1Var);
        cx1Var.putAll(dx1Var2);
        dx1 dx1VarA = cx1Var.a();
        T(204, ez.d);
        C();
        g0(dx1VarA);
        C();
        g0(dx1Var2);
        p(false);
        return dx1VarA;
    }

    public final boolean f(Object obj) {
        if (uz0.g(C(), obj)) {
            return false;
        }
        g0(obj);
        return true;
    }

    public final void f0(Object obj) {
        if (obj instanceof h82) {
            hr0 hr0Var = new hr0((h82) obj, this.m - 1);
            if (this.S) {
                bs1 bs1Var = this.M.b.h;
                bs1Var.r0(mr1.c);
                dt.Q(bs1Var, 0, hr0Var);
            }
            this.d.add(obj);
            obj = hr0Var;
        }
        g0(obj);
    }

    public final boolean g(boolean z) {
        Object objC = C();
        if ((objC instanceof Boolean) && z == ((Boolean) objC).booleanValue()) {
            return false;
        }
        g0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(Object obj) {
        if (this.S) {
            ik2 ik2Var = this.I;
            if (ik2Var.n <= 0 || ik2Var.i == ik2Var.k) {
                ik2Var.E(obj);
                return;
            }
            si1 si1Var = ik2Var.s;
            if (si1Var == null) {
                si1Var = new si1();
            }
            ik2Var.s = si1Var;
            int i = ik2Var.v;
            Object objB = si1Var.b(i);
            if (objB == null) {
                objB = new fj1();
                si1Var.h(i, objB);
            }
            ((fj1) objB).a(obj);
            return;
        }
        dk2 dk2Var = this.G;
        boolean z = dk2Var.n;
        bz bzVar = this.M;
        if (!z) {
            xq0 xq0VarA = dk2Var.a(dk2Var.i);
            bs1 bs1Var = bzVar.b.h;
            bs1Var.r0(uq1.c);
            dt.R(bs1Var, 0, xq0VarA, 1, obj);
            return;
        }
        int iD = (dk2Var.l - hk2.d(dk2Var.b, dk2Var.i)) - 1;
        if (bzVar.a.G.i - bzVar.f >= 0) {
            bzVar.d(true);
            bs1 bs1Var2 = bzVar.b.h;
            bs1Var2.r0(hr1.g);
            dt.Q(bs1Var2, 0, obj);
            bs1Var2.j[bs1Var2.k - bs1Var2.h[bs1Var2.i - 1].a] = iD;
            return;
        }
        dk2 dk2Var2 = this.G;
        xq0 xq0VarA2 = dk2Var2.a(dk2Var2.i);
        bs1 bs1Var3 = bzVar.b.h;
        bs1Var3.r0(hr1.f);
        dt.R(bs1Var3, 0, obj, 1, xq0VarA2);
        bs1Var3.j[bs1Var3.k - bs1Var3.h[bs1Var3.i - 1].a] = iD;
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        g0(obj);
        return true;
    }

    public final int h0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        qi1 qi1Var = this.p;
        if (qi1Var != null && qi1Var.c(i) >= 0) {
            int iC = qi1Var.c(i);
            if (iC >= 0) {
                return qi1Var.c[iC];
            }
            li1.m(jp1.h(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        bz bzVar = this.M;
        bzVar.c = false;
        bzVar.d.b = 0;
        bzVar.f = 0;
        bzVar.e = true;
        bzVar.g = 0;
        bzVar.h.clear();
        bzVar.i = -1;
        bzVar.j = -1;
        bzVar.k = -1;
        bzVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0() {
        if (!this.r) {
            ez.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            ez.a("useNode() called while inserting");
        }
        dk2 dk2Var = this.G;
        Object objN = dk2Var.n(dk2Var.i);
        bz bzVar = this.M;
        bzVar.c();
        bzVar.h.add(objN);
        if (this.y && (objN instanceof hy)) {
            bzVar.b();
            bzVar.b.h.r0(yr1.c);
        }
    }

    public final Object j(g42 g42Var) {
        return dt.M(l(), g42Var);
    }

    public final void k(kp0 kp0Var) {
        if (!this.r) {
            ez.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            ez.a("createNode() can only be called when inserting");
        }
        wy0 wy0Var = this.n;
        int i = wy0Var.a[wy0Var.b - 1];
        ik2 ik2Var = this.I;
        xq0 xq0VarB = ik2Var.b(ik2Var.v);
        this.l++;
        sj0 sj0Var = this.O;
        bs1 bs1Var = sj0Var.h;
        bs1Var.r0(hr1.d);
        dt.Q(bs1Var, 0, kp0Var);
        bs1Var.j[bs1Var.k - bs1Var.h[bs1Var.i - 1].a] = i;
        dt.Q(bs1Var, 1, xq0VarB);
        bs1 bs1Var2 = sj0Var.i;
        bs1Var2.r0(hr1.e);
        bs1Var2.j[bs1Var2.k - bs1Var2.h[bs1Var2.i - 1].a] = i;
        dt.Q(bs1Var2, 0, xq0VarB);
    }

    public final dx1 l() {
        dx1 dx1Var;
        dx1 dx1Var2 = this.K;
        if (dx1Var2 != null) {
            return dx1Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        sq1 sq1Var = ez.c;
        if (z && this.J) {
            int iD = this.I.v;
            while (iD > 0) {
                if (this.I.r(iD) == 202 && uz0.g(this.I.s(iD), sq1Var)) {
                    Object objP = this.I.p(iD);
                    objP.getClass();
                    dx1 dx1Var3 = (dx1) objP;
                    this.K = dx1Var3;
                    return dx1Var3;
                }
                ik2 ik2Var = this.I;
                iD = ik2Var.D(ik2Var.b, iD);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    dk2 dk2Var = this.G;
                    if (uz0.g(dk2Var.p(dk2Var.b, iQ), sq1Var)) {
                        si1 si1Var = this.v;
                        if (si1Var == null || (dx1Var = (dx1) si1Var.b(iQ)) == null) {
                            dk2 dk2Var2 = this.G;
                            Object objB = dk2Var2.b(dk2Var2.b, iQ);
                            objB.getClass();
                            dx1Var = (dx1) objB;
                        }
                        this.K = dx1Var;
                        return dx1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        dx1 dx1Var4 = this.u;
        this.K = dx1Var4;
        return dx1Var4;
    }

    public final py m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        na1 na1VarQ = lt.q();
        ik2 ik2Var = this.I;
        na1VarQ.addAll(cu.t(ik2Var, null, ik2Var.t, null));
        dk2 dk2Var = this.G;
        boolean z = dk2Var.f;
        int[] iArr = dk2Var.b;
        if (z || dk2Var.c == 0) {
            collection = ag0.h;
        } else {
            f62 f62Var = new f62(dk2Var);
            int iQ = dk2Var.i;
            Object objValueOf = Integer.valueOf(dk2Var.l - hk2.d(iArr, iQ));
            while (iQ >= 0) {
                f62Var.k(dk2Var.i(iQ), dk2Var.k(iQ) ? dk2Var.p(iArr, iQ) : zy.a, dk2Var.a.f(iQ), objValueOf);
                objValueOf = dk2Var.a(iQ);
                iQ = dk2Var.q(iQ);
            }
            collection = (ArrayList) f62Var.a;
        }
        na1VarQ.addAll(collection);
        na1VarQ.addAll(D());
        return new py(lt.e(na1VarQ), this.C);
    }

    public final void n(mj1 mj1Var, zp0 zp0Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            ez.a("Reentrant composition is not supported");
        }
        this.g.A();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(bl2.h().g());
            this.v = null;
            b0(mj1Var);
            this.k = 0;
            this.F = true;
            try {
                Z();
                Object objC = C();
                if (objC != zp0Var && zp0Var != null) {
                    g0(zp0Var);
                }
                cr0 cr0Var = this.D;
                uj1 uj1VarA = il2.a();
                try {
                    uj1VarA.b(cr0Var);
                    sq1 sq1Var = ez.a;
                    if (zp0Var != null) {
                        T(200, sq1Var);
                        ys.L(this, zp0Var);
                        p(false);
                    } else if (!this.w || objC == null || objC.equals(zy.a)) {
                        O();
                    } else {
                        T(200, sq1Var);
                        t03.k(2, objC);
                        ys.L(this, (zp0) objC);
                        p(false);
                    }
                    uj1VarA.k(uj1VarA.j - 1);
                    s();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        ez.a("Check failed");
                    }
                    u();
                    Trace.endSection();
                } catch (Throwable th) {
                    uj1VarA.k(uj1VarA.j - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    ou.H(th2, new zq0(this, (byte) 1));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        ez.a("Check failed");
                    }
                    u();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            bz bzVar = this.M;
            bzVar.c();
            bzVar.h.add(objN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0395  */
    /* JADX WARN: Code duplicated, block: B:197:0x0502  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z) {
        long jRotateRight;
        wy0 wy0Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        wy0 wy0Var2;
        int i7;
        nj1 nj1Var;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        wy0 wy0Var3 = this.n;
        int i15 = wy0Var3.a[wy0Var3.b - 2] - 1;
        boolean z2 = this.S;
        yy yyVar = zy.a;
        if (z2) {
            ik2 ik2Var = this.I;
            int i16 = ik2Var.v;
            int iR = ik2Var.r(i16);
            Object objS = this.I.s(i16);
            Object objP = this.I.p(i16);
            if (objS != null) {
                jRotateRight2 = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) (objS instanceof Enum ? ((Enum) objS).ordinal() : objS.hashCode())), 3);
            } else if (objP == null || iR != 207 || objP.equals(yyVar)) {
                jRotateRight2 = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iR), 3);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objP.hashCode()), 3);
            }
            this.T = jRotateRight2;
        } else {
            dk2 dk2Var = this.G;
            int i17 = dk2Var.i;
            int i18 = dk2Var.i(i17);
            dk2 dk2Var2 = this.G;
            Object objP2 = dk2Var2.p(dk2Var2.b, i17);
            dk2 dk2Var3 = this.G;
            Object objB = dk2Var3.b(dk2Var3.b, i17);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode())), 3);
            } else if (objB == null || i18 != 207 || objB.equals(yyVar)) {
                jRotateRight = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) i18), 3);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = jRotateRight;
        }
        int i19 = this.l;
        gr0 gr0Var = this.j;
        ArrayList arrayList4 = this.s;
        bz bzVar = this.M;
        if (gr0Var != null) {
            si1 si1Var = gr0Var.e;
            int i20 = gr0Var.b;
            ArrayList arrayList5 = gr0Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = gr0Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList6.get(i21));
                }
                i = -1;
                nj1 nj1Var2 = cd2.a;
                nj1 nj1Var3 = new nj1();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    x21 x21Var = (x21) arrayList5.get(i22);
                    if (hashSet2.contains(x21Var)) {
                        wy0Var2 = wy0Var3;
                        i7 = i22;
                        if (!nj1Var3.c(x21Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                x21 x21Var2 = (x21) arrayList6.get(i25);
                                if (x21Var2 != x21Var) {
                                    ls0 ls0Var = (ls0) si1Var.b(x21Var2.c);
                                    int i26 = ls0Var != null ? ls0Var.b : -1;
                                    nj1Var3.a(x21Var2);
                                    i10 = i24;
                                    if (i26 != i10) {
                                        ls0 ls0Var2 = (ls0) si1Var.b(x21Var2.c);
                                        int i27 = ls0Var2 != null ? ls0Var2.c : x21Var2.d;
                                        nj1Var = nj1Var3;
                                        int i28 = i26 + i20;
                                        i8 = size2;
                                        int i29 = i10 + i20;
                                        i9 = i20;
                                        if (i27 > 0) {
                                            int i30 = bzVar.l;
                                            if (i30 > 0) {
                                                arrayList2 = arrayList5;
                                                if (bzVar.j == i28 - i30 && bzVar.k == i29 - i30) {
                                                    bzVar.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            bzVar.c();
                                            bzVar.j = i28;
                                            bzVar.k = i29;
                                            bzVar.l = i27;
                                        } else {
                                            arrayList2 = arrayList5;
                                            bzVar.getClass();
                                        }
                                        if (i26 <= i10) {
                                            int i31 = i27;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i26) {
                                                Object[] objArr5 = si1Var.c;
                                                long[] jArr5 = si1Var.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        long j = jArr5[i32];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i33 = 8 - ((~(i32 - length)) >>> 31);
                                                            int i34 = 0;
                                                            while (i34 < i33) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    ls0 ls0Var3 = (ls0) objArr5[(i32 << 3) + i34];
                                                                    jArr2 = jArr5;
                                                                    int i35 = ls0Var3.b;
                                                                    i13 = i26;
                                                                    if (i26 <= i35 && i35 < i13 + i31) {
                                                                        ls0Var3.b = (i35 - i13) + i10;
                                                                    } else if (i13 + 1 <= i35 && i35 < i10) {
                                                                        ls0Var3.b = i35 - i31;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i26;
                                                                }
                                                                j >>= 8;
                                                                i34++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i26 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                            if (i33 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                        }
                                                        if (i32 == length) {
                                                            break;
                                                        }
                                                        i32++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i26 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = si1Var.c;
                                            long[] jArr6 = si1Var.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i36];
                                                    int i37 = i27;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i39;
                                                                ls0 ls0Var4 = (ls0) objArr6[(i36 << 3) + i39];
                                                                objArr4 = objArr6;
                                                                int i40 = ls0Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i26 <= i40 && i40 < i26 + i37) {
                                                                    ls0Var4.b = (i40 - i26) + i10;
                                                                } else if (i10 <= i40 && i40 < i26) {
                                                                    ls0Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i14 = i39;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i39 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i36 == length2) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList4 = arrayList4;
                                                    i27 = i37;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        nj1Var = nj1Var3;
                                        i8 = size2;
                                        i9 = i20;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    nj1Var = nj1Var3;
                                    i8 = size2;
                                    i9 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i24;
                                    i11 = i7 + 1;
                                }
                                i23 = i25 + 1;
                                ls0 ls0Var5 = (ls0) si1Var.b(x21Var2.c);
                                int i41 = i10 + (ls0Var5 != null ? ls0Var5.c : x21Var2.d);
                                i22 = i11;
                                gr0Var = gr0Var;
                                nj1Var3 = nj1Var;
                                size2 = i8;
                                i20 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i24 = i41;
                                wy0Var3 = wy0Var2;
                            } else {
                                i23 = i25;
                                wy0Var3 = wy0Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        wy0Var2 = wy0Var3;
                        ls0 ls0Var6 = (ls0) si1Var.b(x21Var.c);
                        int i42 = ls0Var6 != null ? ls0Var6.b : -1;
                        int i43 = x21Var.c;
                        i7 = i22;
                        bzVar.e(i42 + i20, x21Var.d);
                        gr0Var.a(i43, 0);
                        bzVar.f = (i43 - bzVar.a.G.g) + bzVar.f;
                        this.G.r(i43);
                        H();
                        this.G.s();
                        aa3.H(arrayList4, i43, this.G.b[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    wy0Var3 = wy0Var2;
                }
                wy0Var = wy0Var3;
                arrayList = arrayList4;
                bzVar.c();
                if (arrayList5.size() > 0) {
                    dk2 dk2Var4 = this.G;
                    bzVar.f = (dk2Var4.h - bzVar.a.G.g) + bzVar.f;
                    dk2Var4.t();
                }
            } else {
                wy0Var = wy0Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            wy0Var = wy0Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            dk2 dk2Var5 = this.G;
            int i44 = dk2Var5.m - dk2Var5.l;
            if (i44 > 0) {
                if (i44 > 0) {
                    bzVar.d(false);
                    wy0 wy0Var4 = bzVar.d;
                    dk2 dk2Var6 = bzVar.a.G;
                    if (dk2Var6.c > 0 && wy0Var4.a(-2) != (i6 = dk2Var6.i)) {
                        if (!bzVar.c && bzVar.e) {
                            bzVar.d(false);
                            bzVar.b.h.r0(gr1.c);
                            bzVar.c = true;
                        }
                        if (i6 > 0) {
                            xq0 xq0VarA = dk2Var6.a(i6);
                            wy0Var4.c(i6);
                            bzVar.d(false);
                            bs1 bs1Var = bzVar.b.h;
                            bs1Var.r0(fr1.c);
                            dt.Q(bs1Var, 0, xq0VarA);
                            bzVar.c = true;
                        }
                    }
                    bs1 bs1Var2 = bzVar.b.h;
                    bs1Var2.r0(ur1.c);
                    bs1Var2.j[bs1Var2.k - bs1Var2.h[bs1Var2.i - 1].a] = i44;
                } else {
                    bzVar.getClass();
                }
            }
        }
        int i45 = this.k;
        while (true) {
            dk2 dk2Var7 = this.G;
            if (dk2Var7.k > 0 || (i5 = dk2Var7.g) == dk2Var7.h) {
                break;
            }
            H();
            bzVar.e(i45, this.G.s());
            aa3.H(arrayList, i5, this.G.g);
        }
        if (z3) {
            if (z) {
                sj0 sj0Var = this.O;
                bs1 bs1Var3 = sj0Var.i;
                if (bs1Var3.i == 0) {
                    ez.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                bs1 bs1Var4 = sj0Var.h;
                zr1[] zr1VarArr = bs1Var3.h;
                int i46 = bs1Var3.i - 1;
                bs1Var3.i = i46;
                zr1 zr1Var = zr1VarArr[i46];
                zr1VarArr[i46] = null;
                bs1Var4.r0(zr1Var);
                Object[] objArr7 = bs1Var3.l;
                Object[] objArr8 = bs1Var4.l;
                int i47 = bs1Var4.m;
                int i48 = zr1Var.b;
                int i49 = bs1Var3.m;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = bs1Var3.l;
                int i51 = bs1Var3.m;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = bs1Var3.j;
                int[] iArr2 = bs1Var4.j;
                int i52 = bs1Var4.k;
                int i53 = zr1Var.a;
                int i54 = bs1Var3.k;
                gi.O(i52 - i53, i54 - i53, i54, iArr, iArr2);
                bs1Var3.m -= i48;
                bs1Var3.k -= i53;
                i19 = 1;
            }
            dk2 dk2Var8 = this.G;
            if (dk2Var8.k <= 0) {
                w12.a("Unbalanced begin/end empty");
            }
            dk2Var8.k--;
            ik2 ik2Var2 = this.I;
            int i55 = ik2Var2.v;
            ik2Var2.i();
            if (this.G.k <= 0) {
                int i56 = (-2) - i55;
                this.I.j();
                this.I.e(true);
                xq0 xq0Var = this.N;
                boolean zQ0 = this.O.h.q0();
                fk2 fk2Var = this.H;
                if (zQ0) {
                    bzVar.b();
                    bzVar.d(false);
                    wy0 wy0Var5 = bzVar.d;
                    dk2 dk2Var9 = bzVar.a.G;
                    if (dk2Var9.c <= 0 || wy0Var5.a(-2) == (i4 = dk2Var9.i)) {
                        i3 = 1;
                    } else {
                        if (!bzVar.c && bzVar.e) {
                            bzVar.d(false);
                            bzVar.b.h.r0(gr1.c);
                            bzVar.c = true;
                        }
                        if (i4 > 0) {
                            xq0 xq0VarA2 = dk2Var9.a(i4);
                            wy0Var5.c(i4);
                            bzVar.d(false);
                            bs1 bs1Var5 = bzVar.b.h;
                            bs1Var5.r0(fr1.c);
                            dt.Q(bs1Var5, 0, xq0VarA2);
                            i3 = 1;
                            bzVar.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    bzVar.c();
                    bs1 bs1Var6 = bzVar.b.h;
                    bs1Var6.r0(ir1.c);
                    dt.R(bs1Var6, 0, xq0Var, i3, fk2Var);
                    r3 = 0;
                } else {
                    sj0 sj0Var2 = this.O;
                    bzVar.b();
                    bzVar.d(false);
                    wy0 wy0Var6 = bzVar.d;
                    dk2 dk2Var10 = bzVar.a.G;
                    if (dk2Var10.c > 0 && wy0Var6.a(-2) != (i2 = dk2Var10.i)) {
                        if (!bzVar.c && bzVar.e) {
                            bzVar.d(false);
                            bzVar.b.h.r0(gr1.c);
                            bzVar.c = true;
                        }
                        if (i2 > 0) {
                            xq0 xq0VarA3 = dk2Var10.a(i2);
                            wy0Var6.c(i2);
                            bzVar.d(false);
                            bs1 bs1Var7 = bzVar.b.h;
                            bs1Var7.r0(fr1.c);
                            dt.Q(bs1Var7, 0, xq0VarA3);
                            bzVar.c = true;
                        }
                    }
                    bzVar.c();
                    bs1 bs1Var8 = bzVar.b.h;
                    bs1Var8.r0(jr1.c);
                    int i57 = bs1Var8.m - bs1Var8.h[bs1Var8.i - 1].b;
                    Object[] objArr10 = bs1Var8.l;
                    objArr10[i57] = xq0Var;
                    objArr10[i57 + 1] = fk2Var;
                    objArr10[i57 + 2] = sj0Var2;
                    this.O = new sj0();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.i != 0) {
                    c0(i56, r3);
                    d0(i56, i19);
                }
            }
        } else {
            if (z) {
                bzVar.a();
            }
            int i58 = bzVar.a.G.i;
            wy0 wy0Var7 = bzVar.d;
            int i59 = i;
            if (wy0Var7.a(i59) > i58) {
                ez.a("Missed recording an endGroup");
            }
            if (wy0Var7.a(i59) == i58) {
                bzVar.d(false);
                wy0Var7.b();
                bzVar.b.h.r0(cr1.c);
            }
            int i60 = this.G.i;
            if (i19 != h0(i60)) {
                d0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.G.e();
            bzVar.c();
        }
        ArrayList arrayList7 = this.i;
        gr0 gr0Var2 = (gr0) arrayList7.remove(arrayList7.size() - 1);
        if (gr0Var2 != null && !z3) {
            gr0Var2.c++;
        }
        this.j = gr0Var2;
        this.k = wy0Var.b() + i19;
        this.m = wy0Var.b();
        this.l = wy0Var.b() + i19;
    }

    public final void q() {
        p(false);
        e72 e72VarW = w();
        if (e72VarW != null) {
            int i = e72VarW.b;
            if ((i & 1) != 0) {
                e72VarW.b = i | 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[LOOP:0: B:14:0x003d->B:26:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[EDGE_INSN: B:27:0x0081->B:28:0x0082 BREAK  A[LOOP:0: B:14:0x003d->B:26:0x007e]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0081 A[SYNTHETIC] */
    public final e72 r() {
        e72 e72Var;
        xq0 xq0VarA;
        ww1 ww1Var;
        ArrayList arrayList = this.E;
        byte b = 1;
        e72 e72Var2 = !arrayList.isEmpty() ? (e72) arrayList.remove(arrayList.size() - 1) : null;
        if (e72Var2 != null) {
            e72Var2.b &= -9;
            this.g.A();
            int i = this.B;
            bj1 bj1Var = e72Var2.f;
            if (bj1Var == null || (e72Var2.b & 16) != 0) {
                ww1Var = null;
                break;
            }
            Object[] objArr = bj1Var.b;
            int[] iArr = bj1Var.c;
            long[] jArr = bj1Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                ww1Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                ww1Var = new ww1(b, i, e72Var2, bj1Var);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    ww1Var = null;
                    break;
                }
                if (i2 == length) {
                    ww1Var = null;
                    break;
                }
                i2++;
            }
            bz bzVar = this.M;
            if (ww1Var != null) {
                bs1 bs1Var = bzVar.b.h;
                bs1Var.r0(br1.c);
                dt.R(bs1Var, 0, ww1Var, 1, this.h);
            }
            int i6 = e72Var2.b;
            if ((i6 & 512) != 0) {
                e72Var2.b = i6 & (-513);
                bs1 bs1Var2 = bzVar.b.h;
                bs1Var2.r0(er1.c);
                dt.Q(bs1Var2, 0, e72Var2);
                int i7 = e72Var2.b;
                e72Var2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    e72Var2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (e72Var2 != null) {
            int i8 = e72Var2.b;
            if ((i8 & 16) != 0 || ((i8 & 1) == 0 && !this.q)) {
                e72Var = null;
            } else {
                if (e72Var2.c == null) {
                    if (this.S) {
                        ik2 ik2Var = this.I;
                        xq0VarA = ik2Var.b(ik2Var.v);
                    } else {
                        dk2 dk2Var = this.G;
                        xq0VarA = dk2Var.a(dk2Var.i);
                    }
                    e72Var2.c = xq0VarA;
                }
                e72Var2.b &= -5;
                e72Var = e72Var2;
            }
        } else {
            e72Var = null;
        }
        p(false);
        return e72Var;
    }

    public final void s() {
        p(false);
        this.b.c();
        p(false);
        bz bzVar = this.M;
        if (bzVar.c) {
            bzVar.d(false);
            bzVar.d(false);
            bzVar.b.h.r0(cr1.c);
            bzVar.c = false;
        }
        bzVar.b();
        if (bzVar.d.b != 0) {
            ez.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            ez.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void t(boolean z, gr0 gr0Var) {
        this.i.add(this.j);
        this.j = gr0Var;
        int i = this.l;
        wy0 wy0Var = this.n;
        wy0Var.c(i);
        wy0Var.c(this.m);
        wy0Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void u() {
        fk2 fk2Var = new fk2();
        if (this.C) {
            fk2Var.b();
        }
        if (this.b.d()) {
            fk2Var.r = new si1();
        }
        this.H = fk2Var;
        ik2 ik2VarD = fk2Var.d();
        ik2VarD.e(true);
        this.I = ik2VarD;
    }

    public final lz v() {
        er0 er0Var = this.U;
        if (er0Var != null) {
            return er0Var;
        }
        er0 er0Var2 = new er0(this.h);
        this.U = er0Var2;
        return er0Var2;
    }

    public final e72 w() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (e72) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (!z() || this.w) {
            return true;
        }
        e72 e72VarW = w();
        return (e72VarW == null || (e72VarW.b & 4) == 0) ? false : true;
    }

    public final mz y() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean z() {
        e72 e72VarW;
        return (this.S || this.y || this.w || (e72VarW = w()) == null || (e72VarW.b & 8) != 0) ? false : true;
    }
}
