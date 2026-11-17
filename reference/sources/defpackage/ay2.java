package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ay2 extends lu {
    public boolean T;
    public vp0 U;
    public final xu1 V;

    public ay2(boolean z, ui1 ui1Var, boolean z2, ba2 ba2Var, vp0 vp0Var) {
        super(ui1Var, null, false, z2, null, ba2Var, new i10(vp0Var, z));
        this.T = z;
        this.U = vp0Var;
        this.V = new xu1(this, (byte) 18);
    }

    @Override // defpackage.lu
    public final void M0(dh2 dh2Var) {
        bh2.m(dh2Var, this.T ? by2.h : by2.i);
        bh2.e(dh2Var, c5.K);
        bh2.h(dh2Var, new m8(AutofillValue.forToggle(this.T)));
        bh2.c(dh2Var, new mt(dh2Var, (byte) 1));
    }
}
