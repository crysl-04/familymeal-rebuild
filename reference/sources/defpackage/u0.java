package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    public v0[] h;
    public int i;
    public int j;
    public kp2 k;

    public final v0 c() {
        v0 v0VarD;
        kp2 kp2Var;
        synchronized (this) {
            v0[] v0VarArrE = this.h;
            if (v0VarArrE == null) {
                v0VarArrE = e();
                this.h = v0VarArrE;
            } else if (this.i >= v0VarArrE.length) {
                Object[] objArrCopyOf = Arrays.copyOf(v0VarArrE, v0VarArrE.length << 1);
                this.h = (v0[]) objArrCopyOf;
                v0VarArrE = (v0[]) objArrCopyOf;
            }
            int i = this.j;
            do {
                v0VarD = v0VarArrE[i];
                if (v0VarD == null) {
                    v0VarD = d();
                    v0VarArrE[i] = v0VarD;
                }
                i++;
                if (i >= v0VarArrE.length) {
                    i = 0;
                }
            } while (!v0VarD.a(this));
            this.j = i;
            this.i++;
            kp2Var = this.k;
        }
        if (kp2Var != null) {
            kp2Var.w(1);
        }
        return v0VarD;
    }

    public v0 d() {
        ri2 ri2Var = new ri2();
        ri2Var.a = -1L;
        return ri2Var;
    }

    public v0[] e() {
        return new ri2[2];
    }

    public final void f(v0 v0Var) {
        kp2 kp2Var;
        int i;
        m10[] m10VarArrB;
        synchronized (this) {
            int i2 = this.i - 1;
            this.i = i2;
            kp2Var = this.k;
            if (i2 == 0) {
                this.j = 0;
            }
            v0Var.getClass();
            m10VarArrB = v0Var.b(this);
        }
        for (m10 m10Var : m10VarArrB) {
            if (m10Var != null) {
                m10Var.g(j23.a);
            }
        }
        if (kp2Var != null) {
            kp2Var.w(-1);
        }
    }

    public final kp2 g() {
        kp2 kp2Var;
        synchronized (this) {
            kp2Var = this.k;
            if (kp2Var == null) {
                int i = this.i;
                kp2Var = new kp2(1, Integer.MAX_VALUE, dp.i);
                kp2Var.q(Integer.valueOf(i));
                this.k = kp2Var;
            }
        }
        return kp2Var;
    }
}
