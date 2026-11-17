package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c20 implements ze1 {
    public final /* synthetic */ p81 a;
    public final /* synthetic */ kv2 b;
    public final /* synthetic */ k73 c;
    public final /* synthetic */ x20 d;
    public final /* synthetic */ vp0 e;
    public final /* synthetic */ vv2 f;
    public final /* synthetic */ xp1 g;
    public final /* synthetic */ e90 h;
    public final /* synthetic */ oo i;
    public final /* synthetic */ int j;

    public c20(p81 p81Var, kv2 kv2Var, k73 k73Var, x20 x20Var, vp0 vp0Var, vv2 vv2Var, xp1 xp1Var, e90 e90Var, oo ooVar, int i) {
        this.a = p81Var;
        this.b = kv2Var;
        this.c = k73Var;
        this.d = x20Var;
        this.e = vp0Var;
        this.f = vv2Var;
        this.g = xp1Var;
        this.h = e90Var;
        this.i = ooVar;
        this.j = i;
    }

    @Override // defpackage.ze1
    public final int b(nz0 nz0Var, List list, int i) {
        p81 p81Var = this.a;
        p81Var.a.a(nz0Var.getLayoutDirection());
        wk wkVar = p81Var.a.f;
        if (wkVar != null) {
            return rz1.g(wkVar.x());
        }
        li1.g("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:89:0x0281  */
    /* JADX WARN: Code duplicated, block: B:91:0x0287  */
    @Override // defpackage.ze1
    public final af1 c(bf1 bf1Var, List list, long j) {
        jw2 jw2Var;
        int iK;
        wk wkVar;
        jw2 jw2Var2;
        jw2 jw2Var3;
        wk wkVar2;
        c20 c20Var;
        p81 p81Var;
        p81 p81Var2 = this.a;
        uk2 uk2VarN = y02.n();
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            kw2 kw2VarD = p81Var2.d();
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            jw2 jw2Var4 = kw2VarD != null ? kw2VarD.a : null;
            xt2 xt2Var = p81Var2.a;
            u31 layoutDirection = bf1Var.getLayoutDirection();
            boolean z = xt2Var.c;
            ag0 ag0Var = ag0.h;
            int iN = Integer.MAX_VALUE;
            if (jw2Var4 != null) {
                uh1 uh1Var = jw2Var4.b;
                iw2 iw2Var = jw2Var4.a;
                od odVar = xt2Var.a;
                xw2 xw2Var = xt2Var.b;
                e90 e90Var = xt2Var.d;
                sm0 sm0Var = xt2Var.e;
                if (uh1Var.a.w()) {
                    jw2Var = jw2Var4;
                } else {
                    od odVar2 = iw2Var.a;
                    jw2 jw2Var5 = jw2Var4;
                    long j2 = iw2Var.j;
                    if (uz0.g(odVar2, odVar) && iw2Var.b.c(xw2Var) && uz0.g(iw2Var.c, ag0Var) && iw2Var.d == Integer.MAX_VALUE && iw2Var.e == z && iw2Var.f == 1 && uz0.g(iw2Var.g, e90Var) && iw2Var.h == layoutDirection && uz0.g(iw2Var.i, sm0Var) && k00.k(j) == k00.k(j2) && (!z || (k00.i(j) == k00.i(j2) && k00.h(j) == k00.h(j2)))) {
                        jw2Var3 = new jw2(new iw2(iw2Var.a, xt2Var.b, iw2Var.c, iw2Var.d, iw2Var.e, iw2Var.f, iw2Var.g, iw2Var.h, iw2Var.i, j), uh1Var, l00.d(j, (((long) rz1.g(uh1Var.d)) << 32) | (((long) rz1.g(uh1Var.e)) & 4294967295L)));
                        jw2Var2 = jw2Var5;
                    } else {
                        jw2Var = jw2Var5;
                    }
                }
                xt2Var.a(layoutDirection);
                iK = k00.k(j);
                if (z && k00.e(j)) {
                    iN = k00.i(j);
                }
                if (iK != iN) {
                    wkVar2 = xt2Var.f;
                    if (wkVar2 != null) {
                        li1.g("layoutIntrinsics must be called first");
                        return null;
                    }
                    iN = cy1.n(rz1.g(wkVar2.x()), iK, iN);
                }
                wkVar = xt2Var.f;
                if (wkVar != null) {
                    li1.g("layoutIntrinsics must be called first");
                    return null;
                }
                uh1 uh1Var2 = new uh1(wkVar, lt.y(0, iN, 0, k00.h(j)), Integer.MAX_VALUE, 1);
                jw2Var2 = jw2Var;
                jw2Var3 = new jw2(new iw2(xt2Var.a, xt2Var.b, ag0Var, Integer.MAX_VALUE, xt2Var.c, 1, xt2Var.d, layoutDirection, xt2Var.e, j), uh1Var2, l00.d(j, (((long) rz1.g(uh1Var2.d)) << 32) | (((long) rz1.g(uh1Var2.e)) & 4294967295L)));
            } else {
                jw2Var = jw2Var4;
                xt2Var.a(layoutDirection);
                iK = k00.k(j);
                if (z) {
                    iN = k00.i(j);
                }
                if (iK != iN) {
                    wkVar2 = xt2Var.f;
                    if (wkVar2 != null) {
                        li1.g("layoutIntrinsics must be called first");
                        return null;
                    }
                    iN = cy1.n(rz1.g(wkVar2.x()), iK, iN);
                }
                wkVar = xt2Var.f;
                if (wkVar != null) {
                    li1.g("layoutIntrinsics must be called first");
                    return null;
                }
                uh1 uh1Var3 = new uh1(wkVar, lt.y(0, iN, 0, k00.h(j)), Integer.MAX_VALUE, 1);
                jw2Var2 = jw2Var;
                jw2Var3 = new jw2(new iw2(xt2Var.a, xt2Var.b, ag0Var, Integer.MAX_VALUE, xt2Var.c, 1, xt2Var.d, layoutDirection, xt2Var.e, j), uh1Var3, l00.d(j, (((long) rz1.g(uh1Var3.d)) << 32) | (((long) rz1.g(uh1Var3.e)) & 4294967295L)));
            }
            long j3 = jw2Var3.c;
            Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
            Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            uh1 uh1Var4 = jw2Var3.b;
            uh1Var4.a.w();
            jw2 jw2Var6 = jw2Var2;
            if (uz0.g(jw2Var6, jw2Var3)) {
                c20Var = this;
                p81Var = p81Var2;
            } else {
                p81Var = p81Var2;
                p81Var.i.setValue(new kw2(jw2Var3, kw2VarD != 0 ? kw2VarD.c : null));
                p81Var.p = false;
                c20Var = this;
                kv2 kv2Var = c20Var.b;
                if (kv2Var.i() && kv2Var.h() && ((i81) c20Var.c).a() && qw2.c(((qw2) p81Var.A.getValue()).a) && qw2.c(((qw2) p81Var.B.getValue()).a) && p81Var.b()) {
                    if (!uz0.g(jw2Var6 != null ? jw2Var6.a.a : null, jw2Var3.a.a)) {
                        ie1.p(c20Var.d, null, new h(kv2Var, c20Var.i, null, (byte) 12), 3);
                    }
                }
                c20Var.e.h(jw2Var3);
                dt.I(p81Var, c20Var.f, c20Var.g);
            }
            p81Var.g.setValue(new cc0(c20Var.h.r0(c20Var.j == 1 ? rz1.g(uh1Var4.b(0)) : 0)));
            return bf1Var.g0(iIntValue, iIntValue2, ee1.L(new wt1(h5.a, Integer.valueOf(Math.round(jw2Var3.d))), new wt1(h5.b, Integer.valueOf(Math.round(jw2Var3.e)))), new rt((byte) 4));
        } catch (Throwable th) {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            throw th;
        }
    }
}
