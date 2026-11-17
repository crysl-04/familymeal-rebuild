package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ww2 extends qg1 implements c41, sd0, ug2 {
    public int A;
    public int B;
    public HashMap C;
    public bu1 D;
    public uw2 E;
    public vw2 F;
    public String v;
    public xw2 w;
    public sm0 x;
    public int y;
    public boolean z;

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    @Override // defpackage.c41
    public final int E(ad1 ad1Var, ue1 ue1Var, int i) {
        bu1 bu1VarJ0;
        vw2 vw2Var = this.F;
        if (vw2Var == null) {
            bu1VarJ0 = J0();
        } else {
            if (!vw2Var.c) {
                vw2Var = null;
            }
            if (vw2Var == null || (bu1VarJ0 = vw2Var.d) == null) {
                bu1VarJ0 = J0();
            }
        }
        bu1VarJ0.c(ad1Var);
        return bu1VarJ0.a(i, ad1Var.getLayoutDirection());
    }

    public final bu1 J0() {
        xw2 xw2Var = this.w;
        bu1 bu1Var = this.D;
        if (bu1Var != null) {
            return bu1Var;
        }
        bu1 bu1Var2 = new bu1(this.v, xw2Var, this.x, this.y, this.z, this.A, this.B);
        this.D = bu1Var2;
        return bu1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0013  */
    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        bu1 bu1VarJ0;
        if (this.u) {
            vw2 vw2Var = this.F;
            if (vw2Var == null) {
                bu1VarJ0 = J0();
            } else {
                if (!vw2Var.c) {
                    vw2Var = null;
                }
                if (vw2Var == null || (bu1VarJ0 = vw2Var.d) == null) {
                    bu1VarJ0 = J0();
                }
            }
            g9 g9Var = bu1VarJ0.j;
            if (g9Var == null) {
                dx0.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.D + ", textSubstitution=" + this.F + ")");
                wg.k();
                return;
            }
            wq wqVarG = n41Var.h.i.g();
            boolean z = bu1VarJ0.k;
            if (z) {
                long j = bu1VarJ0.l;
                wqVarG.l();
                wqVarG.f(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                xw2 xw2Var = this.w;
                yl2 yl2Var = xw2Var.a;
                vt2 vt2Var = yl2Var.m;
                if (vt2Var == null) {
                    vt2Var = vt2.b;
                }
                vt2 vt2Var2 = vt2Var;
                ei2 ei2Var = yl2Var.n;
                if (ei2Var == null) {
                    ei2Var = ei2.d;
                }
                ei2 ei2Var2 = ei2Var;
                ud0 ud0Var = yl2Var.p;
                if (ud0Var == null) {
                    ud0Var = xi0.a;
                }
                ud0 ud0Var2 = ud0Var;
                zo zoVarB = yl2Var.a.b();
                if (zoVarB != null) {
                    g9Var.f(wqVarG, zoVarB, xw2Var.a.a.c(), ei2Var2, vt2Var2, ud0Var2);
                } else {
                    long jB = kv.g;
                    if (jB == 16) {
                        jB = xw2Var.b() != 16 ? xw2Var.b() : kv.b;
                    }
                    g9Var.e(wqVarG, jB, ei2Var2, vt2Var2, ud0Var2);
                }
            } finally {
                if (z) {
                    wqVarG.i();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    @Override // defpackage.c41
    public final int S(ad1 ad1Var, ue1 ue1Var, int i) {
        bu1 bu1VarJ0;
        vw2 vw2Var = this.F;
        if (vw2Var == null) {
            bu1VarJ0 = J0();
        } else {
            if (!vw2Var.c) {
                vw2Var = null;
            }
            if (vw2Var == null || (bu1VarJ0 = vw2Var.d) == null) {
                bu1VarJ0 = J0();
            }
        }
        bu1VarJ0.c(ad1Var);
        return rz1.g(((k9) bu1VarJ0.d(ad1Var.getLayoutDirection())).b());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x0005, B:5:0x0009, B:9:0x0010, B:12:0x0018, B:14:0x0027, B:15:0x002a, B:17:0x0035, B:19:0x0041, B:20:0x0048, B:21:0x0072, B:11:0x0014), top: B:27:0x0005 }] */
    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        bu1 bu1VarJ0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            vw2 vw2Var = this.F;
            if (vw2Var == null) {
                bu1VarJ0 = J0();
            } else {
                if (!vw2Var.c) {
                    vw2Var = null;
                }
                if (vw2Var == null || (bu1VarJ0 = vw2Var.d) == null) {
                    bu1VarJ0 = J0();
                }
            }
            bu1VarJ0.c(bf1Var);
            boolean zB = bu1VarJ0.b(j, bf1Var.getLayoutDirection());
            k9 k9Var = bu1VarJ0.n;
            if (k9Var != null) {
                k9Var.a();
            }
            g9 g9Var = bu1VarJ0.j;
            g9Var.getClass();
            hw2 hw2Var = g9Var.d;
            long j2 = bu1VarJ0.l;
            if (zB) {
                cu.W(this, 2).d1();
                HashMap map = this.C;
                if (map == null) {
                    map = new HashMap(2);
                    this.C = map;
                }
                map.put(h5.a, Integer.valueOf(Math.round(hw2Var.d(0) + 0.0f)));
                map.put(h5.b, Integer.valueOf(Math.round(hw2Var.d(hw2Var.g - 1) + 0.0f)));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            ny1 ny1VarE = ue1Var.e(lt.y(i, i, i2, i2));
            HashMap map2 = this.C;
            map2.getClass();
            return bf1Var.g0(i, i2, map2, new m6(ny1VarE, (byte) 12));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    @Override // defpackage.c41
    public final int g(ad1 ad1Var, ue1 ue1Var, int i) {
        bu1 bu1VarJ0;
        vw2 vw2Var = this.F;
        if (vw2Var == null) {
            bu1VarJ0 = J0();
        } else {
            if (!vw2Var.c) {
                vw2Var = null;
            }
            if (vw2Var == null || (bu1VarJ0 = vw2Var.d) == null) {
                bu1VarJ0 = J0();
            }
        }
        bu1VarJ0.c(ad1Var);
        return rz1.g(((k9) bu1VarJ0.d(ad1Var.getLayoutDirection())).p.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [vp0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [uw2] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        uw2 uw2Var = this.E;
        ?? r0 = uw2Var;
        if (uw2Var == null) {
            final byte b = 0;
            ?? r1 = new vp0(this) { // from class: uw2
                public final /* synthetic */ ww2 i;

                {
                    this.i = this;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x00db  */
                /* JADX WARN: Code duplicated, block: B:30:0x0130  */
                @Override // defpackage.vp0
                public final Object h(Object obj) {
                    jw2 jw2Var;
                    bf1 bf1Var;
                    byte b2 = b;
                    jw2 jw2Var2 = null;
                    boolean z = true;
                    ww2 ww2Var = this.i;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            bu1 bu1VarJ0 = ww2Var.J0();
                            xw2 xw2VarE = xw2.e(ww2Var.w, kv.g, 0L, null, 0L, 0, 0L, 16777214);
                            u31 u31Var = bu1VarJ0.o;
                            if (u31Var == null || (bf1Var = bu1VarJ0.i) == null) {
                                jw2Var = null;
                            } else {
                                od odVar = new od(bu1VarJ0.a);
                                if (bu1VarJ0.j == null || bu1VarJ0.n == null) {
                                    jw2Var = null;
                                } else {
                                    long j = bu1VarJ0.p & (-8589934589L);
                                    int i = bu1VarJ0.f;
                                    boolean z2 = bu1VarJ0.e;
                                    int i2 = bu1VarJ0.d;
                                    sm0 sm0Var = bu1VarJ0.c;
                                    ag0 ag0Var = ag0.h;
                                    jw2Var = new jw2(new iw2(odVar, xw2VarE, ag0Var, i, z2, i2, bf1Var, u31Var, sm0Var, j), new uh1(new wk(odVar, xw2VarE, ag0Var, bf1Var, sm0Var, z2), j, bu1VarJ0.f, bu1VarJ0.d), bu1VarJ0.l);
                                }
                            }
                            if (jw2Var != null) {
                                list.add(jw2Var);
                                jw2Var2 = jw2Var;
                            }
                            if (jw2Var2 == null) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        case 1:
                            String str = ((od) obj).i;
                            vw2 vw2Var = ww2Var.F;
                            if (vw2Var == null) {
                                vw2 vw2Var2 = new vw2(ww2Var.v, str);
                                bu1 bu1Var = new bu1(str, ww2Var.w, ww2Var.x, ww2Var.y, ww2Var.z, ww2Var.A, ww2Var.B);
                                bu1Var.c(ww2Var.J0().i);
                                vw2Var2.d = bu1Var;
                                ww2Var.F = vw2Var2;
                            } else if (!uz0.g(str, vw2Var.b)) {
                                vw2Var.b = str;
                                bu1 bu1Var2 = vw2Var.d;
                                if (bu1Var2 != null) {
                                    xw2 xw2Var = ww2Var.w;
                                    sm0 sm0Var2 = ww2Var.x;
                                    int i3 = ww2Var.y;
                                    boolean z3 = ww2Var.z;
                                    int i4 = ww2Var.A;
                                    int i5 = ww2Var.B;
                                    bu1Var2.a = str;
                                    bu1Var2.b = xw2Var;
                                    bu1Var2.c = sm0Var2;
                                    bu1Var2.d = i3;
                                    bu1Var2.e = z3;
                                    bu1Var2.f = i4;
                                    bu1Var2.g = i5;
                                    bu1Var2.s = (bu1Var2.s << 2) | 2;
                                    bu1Var2.j = null;
                                    bu1Var2.n = null;
                                    bu1Var2.o = null;
                                    bu1Var2.q = -1;
                                    bu1Var2.r = -1;
                                    bu1Var2.p = l00.h(0, 0, 0, 0);
                                    bu1Var2.l = 0L;
                                    bu1Var2.k = false;
                                }
                            }
                            y02.p(ww2Var);
                            vs.E(ww2Var);
                            dt.H(ww2Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            vw2 vw2Var3 = ww2Var.F;
                            if (vw2Var3 != null) {
                                vw2Var3.c = zBooleanValue;
                                y02.p(ww2Var);
                                vs.E(ww2Var);
                                dt.H(ww2Var);
                            } else {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.E = r1;
            r0 = r1;
        }
        od odVar = new od(this.v);
        q21[] q21VarArr = bh2.a;
        dh2Var.a(ah2.C, lt.P(odVar));
        vw2 vw2Var = this.F;
        if (vw2Var != null) {
            boolean z = vw2Var.c;
            ch2 ch2Var = ah2.E;
            q21[] q21VarArr2 = bh2.a;
            q21 q21Var = q21VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            ch2Var.getClass();
            dh2Var.a(ch2Var, boolValueOf);
            od odVar2 = new od(vw2Var.b);
            ch2 ch2Var2 = ah2.D;
            q21 q21Var2 = q21VarArr2[16];
            ch2Var2.getClass();
            dh2Var.a(ch2Var2, odVar2);
        }
        final byte b2 = 1;
        dh2Var.a(qg2.l, new m1(null, new vp0(this) { // from class: uw2
            public final /* synthetic */ ww2 i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00db  */
            /* JADX WARN: Code duplicated, block: B:30:0x0130  */
            @Override // defpackage.vp0
            public final Object h(Object obj) {
                jw2 jw2Var;
                bf1 bf1Var;
                byte b3 = b2;
                jw2 jw2Var2 = null;
                boolean z2 = true;
                ww2 ww2Var = this.i;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        bu1 bu1VarJ0 = ww2Var.J0();
                        xw2 xw2VarE = xw2.e(ww2Var.w, kv.g, 0L, null, 0L, 0, 0L, 16777214);
                        u31 u31Var = bu1VarJ0.o;
                        if (u31Var == null || (bf1Var = bu1VarJ0.i) == null) {
                            jw2Var = null;
                        } else {
                            od odVar3 = new od(bu1VarJ0.a);
                            if (bu1VarJ0.j == null || bu1VarJ0.n == null) {
                                jw2Var = null;
                            } else {
                                long j = bu1VarJ0.p & (-8589934589L);
                                int i = bu1VarJ0.f;
                                boolean z3 = bu1VarJ0.e;
                                int i2 = bu1VarJ0.d;
                                sm0 sm0Var = bu1VarJ0.c;
                                ag0 ag0Var = ag0.h;
                                jw2Var = new jw2(new iw2(odVar3, xw2VarE, ag0Var, i, z3, i2, bf1Var, u31Var, sm0Var, j), new uh1(new wk(odVar3, xw2VarE, ag0Var, bf1Var, sm0Var, z3), j, bu1VarJ0.f, bu1VarJ0.d), bu1VarJ0.l);
                            }
                        }
                        if (jw2Var != null) {
                            list.add(jw2Var);
                            jw2Var2 = jw2Var;
                        }
                        if (jw2Var2 == null) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        String str = ((od) obj).i;
                        vw2 vw2Var2 = ww2Var.F;
                        if (vw2Var2 == null) {
                            vw2 vw2Var3 = new vw2(ww2Var.v, str);
                            bu1 bu1Var = new bu1(str, ww2Var.w, ww2Var.x, ww2Var.y, ww2Var.z, ww2Var.A, ww2Var.B);
                            bu1Var.c(ww2Var.J0().i);
                            vw2Var3.d = bu1Var;
                            ww2Var.F = vw2Var3;
                        } else if (!uz0.g(str, vw2Var2.b)) {
                            vw2Var2.b = str;
                            bu1 bu1Var2 = vw2Var2.d;
                            if (bu1Var2 != null) {
                                xw2 xw2Var = ww2Var.w;
                                sm0 sm0Var2 = ww2Var.x;
                                int i3 = ww2Var.y;
                                boolean z4 = ww2Var.z;
                                int i4 = ww2Var.A;
                                int i5 = ww2Var.B;
                                bu1Var2.a = str;
                                bu1Var2.b = xw2Var;
                                bu1Var2.c = sm0Var2;
                                bu1Var2.d = i3;
                                bu1Var2.e = z4;
                                bu1Var2.f = i4;
                                bu1Var2.g = i5;
                                bu1Var2.s = (bu1Var2.s << 2) | 2;
                                bu1Var2.j = null;
                                bu1Var2.n = null;
                                bu1Var2.o = null;
                                bu1Var2.q = -1;
                                bu1Var2.r = -1;
                                bu1Var2.p = l00.h(0, 0, 0, 0);
                                bu1Var2.l = 0L;
                                bu1Var2.k = false;
                            }
                        }
                        y02.p(ww2Var);
                        vs.E(ww2Var);
                        dt.H(ww2Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        vw2 vw2Var4 = ww2Var.F;
                        if (vw2Var4 != null) {
                            vw2Var4.c = zBooleanValue;
                            y02.p(ww2Var);
                            vs.E(ww2Var);
                            dt.H(ww2Var);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final byte b3 = 2;
        dh2Var.a(qg2.m, new m1(null, new vp0(this) { // from class: uw2
            public final /* synthetic */ ww2 i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00db  */
            /* JADX WARN: Code duplicated, block: B:30:0x0130  */
            @Override // defpackage.vp0
            public final Object h(Object obj) {
                jw2 jw2Var;
                bf1 bf1Var;
                byte b4 = b3;
                jw2 jw2Var2 = null;
                boolean z2 = true;
                ww2 ww2Var = this.i;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        bu1 bu1VarJ0 = ww2Var.J0();
                        xw2 xw2VarE = xw2.e(ww2Var.w, kv.g, 0L, null, 0L, 0, 0L, 16777214);
                        u31 u31Var = bu1VarJ0.o;
                        if (u31Var == null || (bf1Var = bu1VarJ0.i) == null) {
                            jw2Var = null;
                        } else {
                            od odVar3 = new od(bu1VarJ0.a);
                            if (bu1VarJ0.j == null || bu1VarJ0.n == null) {
                                jw2Var = null;
                            } else {
                                long j = bu1VarJ0.p & (-8589934589L);
                                int i = bu1VarJ0.f;
                                boolean z3 = bu1VarJ0.e;
                                int i2 = bu1VarJ0.d;
                                sm0 sm0Var = bu1VarJ0.c;
                                ag0 ag0Var = ag0.h;
                                jw2Var = new jw2(new iw2(odVar3, xw2VarE, ag0Var, i, z3, i2, bf1Var, u31Var, sm0Var, j), new uh1(new wk(odVar3, xw2VarE, ag0Var, bf1Var, sm0Var, z3), j, bu1VarJ0.f, bu1VarJ0.d), bu1VarJ0.l);
                            }
                        }
                        if (jw2Var != null) {
                            list.add(jw2Var);
                            jw2Var2 = jw2Var;
                        }
                        if (jw2Var2 == null) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        String str = ((od) obj).i;
                        vw2 vw2Var2 = ww2Var.F;
                        if (vw2Var2 == null) {
                            vw2 vw2Var3 = new vw2(ww2Var.v, str);
                            bu1 bu1Var = new bu1(str, ww2Var.w, ww2Var.x, ww2Var.y, ww2Var.z, ww2Var.A, ww2Var.B);
                            bu1Var.c(ww2Var.J0().i);
                            vw2Var3.d = bu1Var;
                            ww2Var.F = vw2Var3;
                        } else if (!uz0.g(str, vw2Var2.b)) {
                            vw2Var2.b = str;
                            bu1 bu1Var2 = vw2Var2.d;
                            if (bu1Var2 != null) {
                                xw2 xw2Var = ww2Var.w;
                                sm0 sm0Var2 = ww2Var.x;
                                int i3 = ww2Var.y;
                                boolean z4 = ww2Var.z;
                                int i4 = ww2Var.A;
                                int i5 = ww2Var.B;
                                bu1Var2.a = str;
                                bu1Var2.b = xw2Var;
                                bu1Var2.c = sm0Var2;
                                bu1Var2.d = i3;
                                bu1Var2.e = z4;
                                bu1Var2.f = i4;
                                bu1Var2.g = i5;
                                bu1Var2.s = (bu1Var2.s << 2) | 2;
                                bu1Var2.j = null;
                                bu1Var2.n = null;
                                bu1Var2.o = null;
                                bu1Var2.q = -1;
                                bu1Var2.r = -1;
                                bu1Var2.p = l00.h(0, 0, 0, 0);
                                bu1Var2.l = 0L;
                                bu1Var2.k = false;
                            }
                        }
                        y02.p(ww2Var);
                        vs.E(ww2Var);
                        dt.H(ww2Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        vw2 vw2Var4 = ww2Var.F;
                        if (vw2Var4 != null) {
                            vw2Var4.c = zBooleanValue;
                            y02.p(ww2Var);
                            vs.E(ww2Var);
                            dt.H(ww2Var);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        dh2Var.a(qg2.n, new m1(null, new xu1(this, (byte) 17)));
        bh2.a(dh2Var, r0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    @Override // defpackage.c41
    public final int p(ad1 ad1Var, ue1 ue1Var, int i) {
        bu1 bu1VarJ0;
        vw2 vw2Var = this.F;
        if (vw2Var == null) {
            bu1VarJ0 = J0();
        } else {
            if (!vw2Var.c) {
                vw2Var = null;
            }
            if (vw2Var == null || (bu1VarJ0 = vw2Var.d) == null) {
                bu1VarJ0 = J0();
            }
        }
        bu1VarJ0.c(ad1Var);
        return bu1VarJ0.a(i, ad1Var.getLayoutDirection());
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
