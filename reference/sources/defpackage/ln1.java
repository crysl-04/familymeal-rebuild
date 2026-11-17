package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ln1 {
    public final l41 a;
    public final kn1 b;
    public final gx0 c;
    public pn1 d;
    public final cs2 e;
    public qg1 f;
    public fj1 g;
    public fj1 h;
    public fj1 i;
    public jn1 j;

    public ln1(l41 l41Var) {
        this.a = l41Var;
        kn1 kn1Var = new kn1();
        kn1Var.k = -1;
        this.b = kn1Var;
        gx0 gx0Var = new gx0(l41Var);
        this.c = gx0Var;
        this.d = gx0Var;
        cs2 cs2Var = gx0Var.i0;
        this.e = cs2Var;
        this.f = cs2Var;
        this.g = new fj1();
    }

    public static qg1 a(pg1 pg1Var, qg1 qg1Var) {
        qg1 qg1VarF;
        if (pg1Var instanceof wg1) {
            qg1VarF = ((wg1) pg1Var).f();
            qg1VarF.j = vn1.f(qg1VarF);
        } else {
            qk qkVar = new qk();
            qkVar.j = vn1.d(pg1Var);
            qkVar.v = pg1Var;
            qkVar.x = new HashSet();
            qg1VarF = qkVar;
        }
        if (qg1VarF.u) {
            ax0.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        qg1VarF.p = true;
        qg1 qg1Var2 = qg1Var.m;
        if (qg1Var2 != null) {
            qg1Var2.l = qg1VarF;
            qg1VarF.m = qg1Var2;
        }
        qg1Var.m = qg1VarF;
        qg1VarF.l = qg1Var;
        return qg1VarF;
    }

    public static qg1 b(qg1 qg1Var) {
        boolean z = qg1Var.u;
        if (z) {
            bj1 bj1Var = vn1.a;
            if (!z) {
                ax0.b("autoInvalidateRemovedNode called on unattached node");
            }
            vn1.a(qg1Var, -1, 2);
            qg1Var.G0();
            qg1Var.A0();
        }
        qg1 qg1Var2 = qg1Var.m;
        qg1 qg1Var3 = qg1Var.l;
        if (qg1Var2 != null) {
            qg1Var2.l = qg1Var3;
            qg1Var.m = null;
        }
        if (qg1Var3 != null) {
            qg1Var3.m = qg1Var2;
            qg1Var.l = null;
        }
        qg1Var3.getClass();
        return qg1Var3;
    }

    public static void h(pg1 pg1Var, pg1 pg1Var2, qg1 qg1Var) {
        if ((pg1Var instanceof wg1) && (pg1Var2 instanceof wg1)) {
            qg1Var.getClass();
            ((wg1) pg1Var2).g(qg1Var);
            if (qg1Var.u) {
                vn1.c(qg1Var);
                return;
            } else {
                qg1Var.q = true;
                return;
            }
        }
        if (!(qg1Var instanceof qk)) {
            ax0.b("Unknown Modifier.Node type");
            return;
        }
        qk qkVar = (qk) qg1Var;
        if (qkVar.u) {
            qkVar.K0();
        }
        qkVar.v = pg1Var2;
        qkVar.j = vn1.d(pg1Var2);
        if (qkVar.u) {
            qkVar.J0(false);
        }
        if (qg1Var.u) {
            vn1.c(qg1Var);
        } else {
            qg1Var.q = true;
        }
    }

    public final boolean c(int i) {
        return (this.f.k & i) != 0;
    }

    public final void d(qg1 qg1Var, pn1 pn1Var) {
        for (qg1 qg1Var2 = qg1Var.l; qg1Var2 != null; qg1Var2 = qg1Var2.l) {
            if (qg1Var2 == this.b) {
                l41 l41VarU = this.a.u();
                pn1Var.D = l41VarU != null ? l41VarU.L.c : null;
                this.d = pn1Var;
                return;
            } else {
                if ((qg1Var2.j & 2) != 0) {
                    return;
                }
                qg1Var2.I0(pn1Var);
            }
        }
    }

    public final void e() {
        for (qg1 qg1Var = this.f; qg1Var != null; qg1Var = qg1Var.m) {
            qg1Var.F0();
            if (qg1Var.p) {
                bj1 bj1Var = vn1.a;
                if (!qg1Var.u) {
                    ax0.b("autoInvalidateInsertedNode called on unattached node");
                }
                vn1.a(qg1Var, -1, 1);
            }
            if (qg1Var.q) {
                vn1.c(qg1Var);
            }
            qg1Var.p = false;
            qg1Var.q = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0141 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x011d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:52:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0189  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0190  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:77:0x019f
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
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void f(int r32, defpackage.fj1 r33, defpackage.fj1 r34, defpackage.qg1 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln1.f(int, fj1, fj1, qg1, boolean):void");
    }

    public final void g() {
        l41 l41Var;
        e41 e41Var;
        gt1 gt1Var;
        qg1 qg1Var = this.e.l;
        pn1 pn1Var = this.c;
        while (true) {
            l41Var = this.a;
            if (qg1Var == null) {
                break;
            }
            c41 c41VarS = cu.s(qg1Var);
            if (c41VarS != null) {
                pn1 pn1Var2 = qg1Var.o;
                if (pn1Var2 != null) {
                    e41Var = (e41) pn1Var2;
                    c41 c41Var = e41Var.i0;
                    e41Var.y1(c41VarS);
                    if (c41Var != qg1Var && (gt1Var = e41Var.a0) != null) {
                        ((es0) gt1Var).c();
                    }
                } else {
                    e41Var = new e41(l41Var, c41VarS);
                    qg1Var.I0(e41Var);
                }
                pn1Var.D = e41Var;
                e41Var.C = pn1Var;
                pn1Var = e41Var;
            } else {
                qg1Var.I0(pn1Var);
            }
            qg1Var = qg1Var.l;
        }
        l41 l41VarU = l41Var.u();
        pn1Var.D = l41VarU != null ? l41VarU.L.c : null;
        this.d = pn1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        qg1 qg1Var = this.f;
        cs2 cs2Var = this.e;
        if (qg1Var == cs2Var) {
            sb.append("]");
        } else {
            while (qg1Var != null && qg1Var != cs2Var) {
                sb.append(String.valueOf(qg1Var));
                if (qg1Var.m == cs2Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                qg1Var = qg1Var.m;
            }
        }
        return sb.toString();
    }
}
