package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qg1 implements j80 {
    public k10 i;
    public int j;
    public qg1 l;
    public qg1 m;
    public sp1 n;
    public pn1 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public h6 t;
    public boolean u;
    public qg1 h = this;
    public int k = -1;

    public void A0() {
        if (!this.u) {
            ax0.b("Cannot detach a node that is not attached");
        }
        if (this.r) {
            ax0.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.s) {
            ax0.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.u = false;
        k10 k10Var = this.i;
        if (k10Var != null) {
            vs.q(k10Var, new vg1("The Modifier.Node was detached", (byte) 2));
            this.i = null;
        }
    }

    public void E0() {
        if (!this.u) {
            ax0.b("reset() called on an unattached node");
        }
        D0();
    }

    public void F0() {
        if (!this.u) {
            ax0.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.r) {
            ax0.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.r = false;
        B0();
        this.s = true;
    }

    public void G0() {
        if (!this.u) {
            ax0.b("node detached multiple times");
        }
        if (this.o == null) {
            ax0.b("detach invoked on a node without a coordinator");
        }
        if (!this.s) {
            ax0.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.s = false;
        h6 h6Var = this.t;
        if (h6Var != null) {
            h6Var.a();
        }
        C0();
    }

    public void H0(qg1 qg1Var) {
        this.h = qg1Var;
    }

    public void I0(pn1 pn1Var) {
        this.o = pn1Var;
    }

    public final x20 x0() {
        k10 k10Var = this.i;
        if (k10Var != null) {
            return k10Var;
        }
        k10 k10VarB = vs.b(cu.Z(this).getCoroutineContext().i(new u01((s01) cu.Z(this).getCoroutineContext().m(c5.Z))));
        this.i = k10VarB;
        return k10VarB;
    }

    public boolean y0() {
        return !(this instanceof ij);
    }

    public void z0() {
        if (this.u) {
            ax0.b("node attached multiple times");
        }
        if (this.o == null) {
            ax0.b("attach invoked on a node without a coordinator");
        }
        this.u = true;
        this.r = true;
    }

    public void B0() {
    }

    public void C0() {
    }

    public void D0() {
    }
}
