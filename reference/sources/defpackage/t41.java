package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class t41 implements ap2 {
    public u31 h = u31.i;
    public float i;
    public float j;
    public final /* synthetic */ z41 k;

    public t41(z41 z41Var) {
        this.k = z41Var;
    }

    @Override // defpackage.ap2
    public final List I(zp0 zp0Var, Object obj) {
        z41 z41Var = this.k;
        z41Var.h();
        l41 l41Var = z41Var.h;
        h41 h41Var = l41Var.M.d;
        h41 h41Var2 = h41.j;
        h41 h41Var3 = h41.h;
        if (h41Var != h41Var3 && h41Var != h41Var2 && h41Var != h41.i && h41Var != h41.k) {
            ax0.b("subcompose can only be used inside the measure or layout blocks");
        }
        mj1 mj1Var = z41Var.n;
        Object objG = mj1Var.g(obj);
        if (objG == null) {
            objG = (l41) z41Var.q.l(obj);
            if (objG != null) {
                if (z41Var.v <= 0) {
                    ax0.b("Check failed.");
                }
                z41Var.v--;
            } else {
                objG = z41Var.n(obj);
                if (objG == null) {
                    int i = z41Var.k;
                    l41 l41Var2 = new l41(2);
                    l41Var.w = true;
                    l41Var.C(i, l41Var2);
                    l41Var.w = false;
                    objG = l41Var2;
                }
            }
            mj1Var.n(obj, objG);
        }
        l41 l41Var3 = (l41) objG;
        if (dv.z0(z41Var.k, l41Var.o()) != l41Var3) {
            int i2 = ((uj1) ((dj1) l41Var.o()).i).i(l41Var3);
            if (i2 < z41Var.k) {
                ax0.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = z41Var.k;
            if (i3 != i2) {
                z41Var.j(i2, i3);
            }
        }
        z41Var.k++;
        z41Var.m(l41Var3, obj, false, zp0Var);
        return (h41Var == h41Var3 || h41Var == h41Var2) ? l41Var3.m() : l41Var3.l();
    }

    @Override // defpackage.bf1
    public final af1 Q(int i, int i2, Map map, vp0 vp0Var, vp0 vp0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ax0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new s41(i, i2, map, vp0Var, this, this.k, vp0Var2);
    }

    @Override // defpackage.e90
    public final float b() {
        return this.i;
    }

    @Override // defpackage.nz0
    public final u31 getLayoutDirection() {
        return this.h;
    }

    @Override // defpackage.e90
    public final float n() {
        return this.j;
    }

    @Override // defpackage.nz0
    public final boolean u() {
        h41 h41Var = this.k.h.M.d;
        return h41Var == h41.k || h41Var == h41.i;
    }
}
