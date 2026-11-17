package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t9 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ m12 i;

    public /* synthetic */ t9(m12 m12Var, byte b) {
        this.h = b;
        this.i = m12Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        j23 j23Var = j23.a;
        m12 m12Var = this.i;
        switch (b) {
            case 0:
                m12Var.m1setPopupContentSizefhxjrPA((vy0) obj);
                m12Var.r();
                break;
            case 1:
                t31 t31VarM = ((t31) obj).m();
                t31VarM.getClass();
                m12Var.q(t31VarM);
                break;
            default:
                kp0 kp0Var = (kp0) obj;
                Handler handler = m12Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = m12Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new i6(kp0Var, (byte) 2));
                    }
                } else {
                    kp0Var.a();
                }
                break;
        }
        return j23Var;
    }
}
