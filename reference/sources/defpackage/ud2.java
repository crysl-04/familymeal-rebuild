package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ud2 extends qg1 implements c41, ug2 {
    public yd2 v;
    public boolean w;

    @Override // defpackage.c41
    public final int E(ad1 ad1Var, ue1 ue1Var, int i) {
        if (!this.w) {
            i = Integer.MAX_VALUE;
        }
        return ue1Var.d0(i);
    }

    @Override // defpackage.c41
    public final int S(ad1 ad1Var, ue1 ue1Var, int i) {
        if (this.w) {
            i = Integer.MAX_VALUE;
        }
        return ue1Var.U(i);
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        ys.p(j, this.w ? ks1.h : ks1.i);
        ny1 ny1VarE = ue1Var.e(k00.b(j, 0, this.w ? k00.i(j) : Integer.MAX_VALUE, 0, this.w ? Integer.MAX_VALUE : k00.h(j), 5));
        int i = ny1VarE.h;
        int i2 = k00.i(j);
        if (i > i2) {
            i = i2;
        }
        int i3 = ny1VarE.i;
        int iH = k00.h(j);
        if (i3 > iH) {
            i3 = iH;
        }
        int i4 = ny1VarE.i - i3;
        int i5 = ny1VarE.h - i;
        if (!this.w) {
            i4 = i5;
        }
        yd2 yd2Var = this.v;
        iu1 iu1Var = yd2Var.f;
        iu1 iu1Var2 = yd2Var.a;
        iu1Var.h(i4);
        uk2 uk2VarN = y02.n();
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            if (iu1Var2.g() > i4) {
                iu1Var2.h(i4);
            }
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            this.v.b.h(this.w ? i3 : i);
            this.v.c.h(this.w ? ny1VarE.i : ny1VarE.h);
            this.v.d.setValue(Boolean.FALSE);
            return bf1Var.g0(i, i3, bg0.h, new ww1((byte) 2, i4, this, ny1VarE));
        } catch (Throwable th) {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            throw th;
        }
    }

    @Override // defpackage.c41
    public final int g(ad1 ad1Var, ue1 ue1Var, int i) {
        if (this.w) {
            i = Integer.MAX_VALUE;
        }
        return ue1Var.a0(i);
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        bh2.n(dh2Var);
        final byte b = 0;
        final byte b2 = 1;
        md2 md2Var = new md2(new kp0(this) { // from class: td2
            public final /* synthetic */ ud2 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                int iG;
                byte b3 = b;
                ud2 ud2Var = this.i;
                switch (b3) {
                    case 0:
                        iG = ud2Var.v.a.g();
                        break;
                    default:
                        iG = ud2Var.v.f.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new kp0(this) { // from class: td2
            public final /* synthetic */ ud2 i;

            {
                this.i = this;
            }

            @Override // defpackage.kp0
            public final Object a() {
                int iG;
                byte b3 = b2;
                ud2 ud2Var = this.i;
                switch (b3) {
                    case 0:
                        iG = ud2Var.v.a.g();
                        break;
                    default:
                        iG = ud2Var.v.f.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (!this.w) {
            bh2.i(dh2Var, md2Var);
            return;
        }
        ch2 ch2Var = ah2.w;
        q21 q21Var = bh2.a[13];
        ch2Var.getClass();
        dh2Var.a(ch2Var, md2Var);
    }

    @Override // defpackage.c41
    public final int p(ad1 ad1Var, ue1 ue1Var, int i) {
        if (!this.w) {
            i = Integer.MAX_VALUE;
        }
        return ue1Var.g(i);
    }
}
