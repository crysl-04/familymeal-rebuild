package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qk extends qg1 implements c41, sd0, ug2, c12, tg1, mu1, r31, sr0, vl0, im0, ht1, kp {
    public pg1 v;
    public pk w;
    public HashSet x;

    @Override // defpackage.ht1
    public final boolean B() {
        return this.u;
    }

    @Override // defpackage.qg1
    public final void B0() {
        J0(true);
    }

    @Override // defpackage.qg1
    public final void C0() {
        K0();
    }

    @Override // defpackage.c41
    public final int E(ad1 ad1Var, ue1 ue1Var, int i) {
        pg1 pg1Var = this.v;
        pg1Var.getClass();
        return ((a41) pg1Var).e(new a01(ad1Var, ad1Var.getLayoutDirection()), new i70(ue1Var, df1.h, ef1.i, (byte) 1), l00.b(0, i, 0, 0, 13)).d();
    }

    public final void J0(boolean z) {
        if (!this.u) {
            ax0.b("initializeModifier called on unattached node");
        }
        pg1 pg1Var = this.v;
        if ((this.j & 32) != 0 && (pg1Var instanceof ug1)) {
            ug1 ug1Var = (ug1) pg1Var;
            h42 h42Var = t03.t;
            pk pkVar = this.w;
            if (pkVar == null || !pkVar.q(h42Var)) {
                pk pkVar2 = new pk();
                pkVar2.g = ug1Var;
                this.w = pkVar2;
                cs2 cs2Var = cu.Y(this).L.e;
                cs2Var.getClass();
                if (cs2Var.v) {
                    sg1 modifierLocalManager = cu.Z(this).getModifierLocalManager();
                    fj1 fj1Var = modifierLocalManager.b;
                    if (fj1Var == null) {
                        fj1Var = new fj1();
                        modifierLocalManager.b = fj1Var;
                    }
                    fj1Var.a(this);
                    fj1 fj1Var2 = modifierLocalManager.c;
                    if (fj1Var2 == null) {
                        fj1Var2 = new fj1();
                        modifierLocalManager.c = fj1Var2;
                    }
                    fj1Var2.a(h42Var);
                    modifierLocalManager.a();
                }
            } else {
                pkVar.g = ug1Var;
                sg1 modifierLocalManager2 = cu.Z(this).getModifierLocalManager();
                fj1 fj1Var3 = modifierLocalManager2.b;
                if (fj1Var3 == null) {
                    fj1Var3 = new fj1();
                    modifierLocalManager2.b = fj1Var3;
                }
                fj1Var3.a(this);
                fj1 fj1Var4 = modifierLocalManager2.c;
                if (fj1Var4 == null) {
                    fj1Var4 = new fj1();
                    modifierLocalManager2.c = fj1Var4;
                }
                fj1Var4.a(h42Var);
                modifierLocalManager2.a();
            }
        }
        if ((this.j & 4) != 0 && !z) {
            cu.W(this, 2).d1();
        }
        if ((this.j & 2) != 0) {
            cs2 cs2Var2 = cu.Y(this).L.e;
            cs2Var2.getClass();
            if (cs2Var2.v) {
                pn1 pn1Var = this.o;
                pn1Var.getClass();
                ((e41) pn1Var).y1(this);
                gt1 gt1Var = pn1Var.a0;
                if (gt1Var != null) {
                    ((es0) gt1Var).c();
                }
            }
            if (!z) {
                cu.W(this, 2).d1();
                cu.Y(this).F();
            }
        }
        if (pg1Var instanceof z51) {
            z51 z51Var = (z51) pg1Var;
            l41 l41VarY = cu.Y(this);
            switch (z51Var.h) {
                case 0:
                    ((c61) z51Var.i).j = l41VarY;
                    break;
                default:
                    ((b81) z51Var.i).l = l41VarY;
                    break;
            }
        }
        if ((this.j & 8) != 0) {
            cu.Z(this).y();
        }
    }

    @Override // defpackage.c12
    public final void K(q02 q02Var, s02 s02Var, long j) {
        this.v.getClass();
        throw new ClassCastException();
    }

    public final void K0() {
        if (!this.u) {
            ax0.b("unInitializeModifier called on unattached node");
        }
        pg1 pg1Var = this.v;
        if ((this.j & 32) != 0 && (pg1Var instanceof ug1)) {
            sg1 modifierLocalManager = cu.Z(this).getModifierLocalManager();
            h42 h42Var = t03.t;
            fj1 fj1Var = modifierLocalManager.d;
            if (fj1Var == null) {
                fj1Var = new fj1();
                modifierLocalManager.d = fj1Var;
            }
            fj1Var.a(cu.Y(this));
            fj1 fj1Var2 = modifierLocalManager.e;
            if (fj1Var2 == null) {
                fj1Var2 = new fj1();
                modifierLocalManager.e = fj1Var2;
            }
            fj1Var2.a(h42Var);
            modifierLocalManager.a();
        }
        if ((this.j & 8) != 0) {
            cu.Z(this).y();
        }
    }

    public final void L0() {
        if (this.u) {
            this.x.clear();
            it1 snapshotObserver = cu.Z(this).getSnapshotObserver();
            snapshotObserver.a.d(this, t03.a, new o9((Object) this, (byte) 7));
        }
    }

    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        pg1 pg1Var = this.v;
        pg1Var.getClass();
        n41Var.a();
    }

    @Override // defpackage.c41
    public final int S(ad1 ad1Var, ue1 ue1Var, int i) {
        pg1 pg1Var = this.v;
        pg1Var.getClass();
        return ((a41) pg1Var).e(new a01(ad1Var, ad1Var.getLayoutDirection()), new i70(ue1Var, df1.h, ef1.h, (byte) 1), l00.b(0, 0, 0, i, 7)).g();
    }

    @Override // defpackage.vl0
    public final void W(km0 km0Var) {
        pg1 pg1Var = this.v;
        ax0.b("onFocusEvent called on wrong node");
        pg1Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.c12
    public final boolean a0() {
        this.v.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.kp
    public final e90 b() {
        return cu.Y(this).E;
    }

    @Override // defpackage.kp
    public final long d() {
        return ou.G(cu.W(this, 128).j);
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        pg1 pg1Var = this.v;
        pg1Var.getClass();
        return ((a41) pg1Var).e(bf1Var, ue1Var, j);
    }

    @Override // defpackage.c41
    public final int g(ad1 ad1Var, ue1 ue1Var, int i) {
        pg1 pg1Var = this.v;
        pg1Var.getClass();
        return ((a41) pg1Var).e(new a01(ad1Var, ad1Var.getLayoutDirection()), new i70(ue1Var, df1.i, ef1.h, (byte) 1), l00.b(0, 0, 0, i, 7)).g();
    }

    @Override // defpackage.kp
    public final u31 getLayoutDirection() {
        return cu.Y(this).F;
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        pg1 pg1Var = this.v;
        pg1Var.getClass();
        rg2 rg2VarD = ((sg2) pg1Var).d();
        dh2Var.getClass();
        rg2 rg2Var = (rg2) dh2Var;
        mj1 mj1Var = rg2Var.h;
        if (rg2VarD.j) {
            rg2Var.j = true;
        }
        if (rg2VarD.k) {
            rg2Var.k = true;
        }
        mj1 mj1Var2 = rg2VarD.h;
        Object[] objArr = mj1Var2.b;
        Object[] objArr2 = mj1Var2.c;
        long[] jArr = mj1Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ch2 ch2Var = (ch2) obj;
                        if (!mj1Var.b(ch2Var)) {
                            mj1Var.n(ch2Var, obj2);
                        } else if (obj2 instanceof m1) {
                            Object objG = mj1Var.g(ch2Var);
                            objG.getClass();
                            m1 m1Var = (m1) objG;
                            String str = m1Var.a;
                            if (str == null) {
                                str = ((m1) obj2).a;
                            }
                            hq0 hq0Var = m1Var.b;
                            if (hq0Var == null) {
                                hq0Var = ((m1) obj2).b;
                            }
                            mj1Var.n(ch2Var, new m1(str, hq0Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.c12
    public final void j0() {
        this.v.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.tg1
    public final ou k() {
        pk pkVar = this.w;
        return pkVar != null ? pkVar : cg0.g;
    }

    @Override // defpackage.mu1
    public final Object n0(Object obj) {
        pg1 pg1Var = this.v;
        pg1Var.getClass();
        return (jc) pg1Var;
    }

    @Override // defpackage.sd0
    public final void o0() {
        dt.H(this);
    }

    @Override // defpackage.c41
    public final int p(ad1 ad1Var, ue1 ue1Var, int i) {
        pg1 pg1Var = this.v;
        pg1Var.getClass();
        return ((a41) pg1Var).e(new a01(ad1Var, ad1Var.getLayoutDirection()), new i70(ue1Var, df1.i, ef1.i, (byte) 1), l00.b(0, i, 0, 0, 13)).d();
    }

    @Override // defpackage.c12
    public final boolean p0() {
        this.v.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.v.toString();
    }

    @Override // defpackage.sr0
    public final void v(pn1 pn1Var) {
        this.v.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.j80
    public final void a() {
    }

    @Override // defpackage.r31, defpackage.cf1
    public final void c(long j) {
    }

    @Override // defpackage.r31
    public final void q(t31 t31Var) {
    }
}
