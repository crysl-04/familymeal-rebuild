package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o70 implements c91 {
    public final /* synthetic */ byte h;
    public final Object i;
    public final Object j;

    public o70(d91 d91Var) {
        this.h = (byte) 3;
        this.i = d91Var;
        hu huVar = hu.c;
        Class<?> cls = d91Var.getClass();
        fu fuVar = (fu) huVar.a.get(cls);
        this.j = fuVar == null ? huVar.a(cls, null) : fuVar;
    }

    @Override // defpackage.c91
    public final void e(e91 e91Var, w81 w81Var) {
        byte b = this.h;
        Object obj = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                m70 m70Var = (m70) obj;
                switch (n70.a[w81Var.ordinal()]) {
                    case 1:
                    case 4:
                    case 6:
                        break;
                    case 2:
                        m70Var.b(e91Var);
                        break;
                    case 3:
                        m70Var.c(e91Var);
                        break;
                    case 5:
                        m70Var.a(e91Var);
                        break;
                    case 7:
                        wg.m("ON_ANY must not been send by anybody");
                        break;
                    default:
                        wg.n();
                        break;
                }
                c91 c91Var = (c91) obj2;
                if (c91Var != null) {
                    c91Var.e(e91Var, w81Var);
                }
                break;
            case 1:
                if (w81Var == w81.ON_START) {
                    ((h91) obj).f(this);
                    ((k42) obj2).l();
                }
                break;
            case 2:
                fq1 fq1Var = (fq1) obj;
                int i = jq1.a[w81Var.ordinal()];
                if (i == 1) {
                    fq1Var.g(true);
                } else if (i == 2) {
                    fq1Var.g(false);
                } else if (i == 3) {
                    fq1Var.e();
                    ((h91) obj2).f(this);
                }
                break;
            default:
                d91 d91Var = (d91) obj;
                HashMap map = ((fu) obj2).a;
                fu.a((List) map.get(w81Var), e91Var, w81Var, d91Var);
                fu.a((List) map.get(w81.ON_ANY), e91Var, w81Var, d91Var);
                break;
        }
    }

    public /* synthetic */ o70(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    public o70(fq1 fq1Var, kq1 kq1Var, h91 h91Var) {
        this.h = (byte) 2;
        this.i = fq1Var;
        this.j = h91Var;
    }
}
