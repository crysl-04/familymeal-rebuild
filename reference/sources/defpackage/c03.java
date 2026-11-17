package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c03 extends lu {
    public by2 T;

    @Override // defpackage.lu
    public final void M0(dh2 dh2Var) {
        bh2.m(dh2Var, this.T);
        bh2.e(dh2Var, c5.K);
        bh2.h(dh2Var, new m8(AutofillValue.forToggle(this.T != by2.j)));
        bh2.c(dh2Var, new mt(dh2Var, (byte) 2));
    }
}
