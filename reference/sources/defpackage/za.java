package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class za implements ot2 {
    public final View a;
    public final vp0 b;
    public final kp0 c;
    public final lk1 d = new lk1();
    public final nl2 e = new nl2(new sa(this, 0));
    public final sa f = new sa(this, 1);
    public final sa g = new sa(this, 2);
    public ActionMode h;
    public xa i;
    public Runnable j;

    public za(View view, vp0 vp0Var, kp0 kp0Var) {
        this.a = view;
        this.b = vp0Var;
        this.c = kp0Var;
    }

    @Override // defpackage.ot2
    public final Object a(gt2 gt2Var, mq2 mq2Var) {
        ya yaVar = new ya(this, gt2Var, null, (byte) 0);
        lk1 lk1Var = this.d;
        lk1Var.getClass();
        Object objX = vs.x(new ik1(ek1.h, lk1Var, yaVar, null), mq2Var);
        return objX == y20.h ? objX : j23.a;
    }
}
