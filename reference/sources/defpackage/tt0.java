package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class tt0 extends qg1 implements yz2, c12, pz {
    public gc0 v;
    public s9 w;
    public boolean x;

    public tt0(s9 s9Var, gc0 gc0Var) {
        this.v = gc0Var;
        this.w = s9Var;
    }

    @Override // defpackage.qg1
    public final void C0() {
        N0();
    }

    public final void J0() {
        s9 s9Var;
        x72 x72Var = new x72();
        y02.B(this, new rt(x72Var));
        tt0 tt0Var = (tt0) x72Var.h;
        if (tt0Var == null || (s9Var = tt0Var.w) == null) {
            s9Var = this.w;
        }
        K0(s9Var);
    }

    @Override // defpackage.c12
    public final void K(q02 q02Var, s02 s02Var, long j) {
        if (s02Var == s02.i) {
            List list = q02Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (M0(((z02) list.get(i)).i)) {
                    byte b = q02Var.f;
                    if (b == 4) {
                        this.x = true;
                        L0();
                        return;
                    } else {
                        if (b == 5) {
                            N0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public void K0(s9 s9Var) {
        x02 x02Var = (x02) vs.z(this, uz.w);
        if (x02Var != null) {
            ((p6) x02Var).a = s9Var;
        }
    }

    public final void L0() {
        t72 t72Var = new t72();
        t72Var.h = true;
        y02.D(this, new ic0(t72Var));
        if (t72Var.h) {
            J0();
        }
    }

    public boolean M0(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    public final void N0() {
        if (this.x) {
            this.x = false;
            if (this.u) {
                x72 x72Var = new x72();
                y02.B(this, new f6(x72Var, (byte) 2));
                tt0 tt0Var = (tt0) x72Var.h;
                if (tt0Var != null) {
                    tt0Var.J0();
                } else {
                    K0(null);
                }
            }
        }
    }

    @Override // defpackage.c12
    public final void j0() {
        N0();
    }

    @Override // defpackage.c12
    public final long t() {
        if (this.v == null) {
            return vy2.a;
        }
        e90 e90Var = cu.Y(this).E;
        int i = vy2.b;
        return m02.s(e90Var.R(10.0f), e90Var.R(40.0f), e90Var.R(10.0f), e90Var.R(40.0f));
    }
}
