package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qx0 extends qg1 implements yz2 {
    public m73 v;
    public m73 w;

    public qx0() {
        qj0 qj0Var = uz0.M;
        this.v = qj0Var;
        this.w = qj0Var;
    }

    @Override // defpackage.qg1
    public void B0() {
        y02.A(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new px0(this, (byte) 1));
        K0();
    }

    @Override // defpackage.qg1
    public void C0() {
        this.w = this.v;
        y02.C(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new px0(this, (byte) 0));
    }

    @Override // defpackage.qg1
    public final void D0() {
        this.v = uz0.M;
    }

    public abstract m73 J0(m73 m73Var);

    public void K0() {
        this.w = J0(this.v);
        y02.C(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new px0(this, (byte) 0));
    }

    @Override // defpackage.yz2
    public final Object r() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
