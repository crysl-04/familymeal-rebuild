package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j60 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ j60(int i, iu1 iu1Var) {
        this.h = (byte) 3;
        this.i = i;
        this.j = iu1Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj = this.j;
        int i = this.i;
        switch (b) {
            case 0:
                ((vp0) obj).h(Integer.valueOf(i));
                return j23Var;
            case 1:
                x62 x62Var = (x62) obj;
                ArrayList arrayListS0 = dv.S0(x62Var.e());
                arrayListS0.remove(i);
                x62Var.n.setValue(arrayListS0);
                return j23Var;
            case 2:
                return Integer.valueOf(((jw2) ((yq0) obj).e).b.d(i));
            default:
                ((iu1) obj).h(i);
                return j23Var;
        }
    }

    public /* synthetic */ j60(Object obj, int i, byte b) {
        this.h = b;
        this.j = obj;
        this.i = i;
    }
}
