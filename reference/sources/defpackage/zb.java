package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zb extends m31 implements vp0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb(Object obj, byte b) {
        super(1);
        this.i = b;
        this.j = obj;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.i;
        j23 j23Var = j23.a;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return Boolean.valueOf(uz0.g(obj, obj2));
            case 1:
                my1 my1Var = (my1) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    my1.i(my1Var, (ny1) arrayList.get(i), 0, 0);
                }
                return j23Var;
            case 2:
                hd hdVar = (hd) obj;
                float f = hdVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = hdVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = hdVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = hdVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new kv(kv.a(cu.a(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, uv.x), (sv) obj2));
            default:
                td0 td0Var = (td0) obj;
                cs0 cs0Var = (cs0) obj2;
                l9 l9Var = cs0Var.l;
                if (cs0Var.n && cs0Var.A && l9Var != null) {
                    eg egVarF = td0Var.F();
                    long jQ = egVarF.q();
                    egVarF.g().l();
                    try {
                        ((eg) ((g2) egVarF.i).i).g().s(l9Var);
                        cs0Var.c(td0Var);
                    } finally {
                        wi0.r(egVarF, jQ);
                    }
                } else {
                    cs0Var.c(td0Var);
                }
                return j23Var;
        }
    }
}
