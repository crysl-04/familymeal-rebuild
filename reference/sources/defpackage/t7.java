package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t7 implements zp0 {
    public final /* synthetic */ byte h = 2;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t7(rg1 rg1Var, int i, int i2) {
        this.j = rg1Var;
        this.i = i2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.h;
        j23 j23Var = j23.a;
        boolean z = this.i;
        Object obj3 = this.j;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                w7.b((rg1) obj3, (dr0) obj, m02.A(1), z ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dt.p((kv2) obj3, z, (dr0) obj, m02.A(1));
                break;
            default:
                String str = (String) obj3;
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dr0Var.Q();
                } else {
                    iu0 iu0VarB = ls.k;
                    if (iu0VarB == null) {
                        hu0 hu0Var = new hu0("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = k33.a;
                        rl2 rl2Var = new rl2(kv.b);
                        xl1 xl1Var = new xl1((byte) 3);
                        xl1Var.A(18.0f, 8.0f);
                        xl1Var.x(-1.0f);
                        xl1Var.y(17.0f, 6.0f);
                        xl1Var.s(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                        xl1Var.C(7.0f, 3.24f, 7.0f, 6.0f);
                        xl1Var.I(2.0f);
                        xl1Var.y(6.0f, 8.0f);
                        xl1Var.s(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        xl1Var.I(10.0f);
                        xl1Var.s(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        xl1Var.x(12.0f);
                        xl1Var.s(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        xl1Var.y(20.0f, 10.0f);
                        xl1Var.s(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        xl1Var.m();
                        xl1Var.A(12.0f, 17.0f);
                        xl1Var.s(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                        xl1Var.D(0.9f, -2.0f, 2.0f, -2.0f);
                        xl1Var.D(2.0f, 0.9f, 2.0f, 2.0f);
                        xl1Var.D(-0.9f, 2.0f, -2.0f, 2.0f);
                        xl1Var.m();
                        xl1Var.A(15.1f, 8.0f);
                        xl1Var.y(8.9f, 8.0f);
                        xl1Var.y(8.9f, 6.0f);
                        xl1Var.s(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                        xl1Var.s(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
                        xl1Var.I(2.0f);
                        xl1Var.m();
                        hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
                        iu0VarB = hu0Var.b();
                        ls.k = iu0VarB;
                    }
                    eu0.a(iu0VarB, jp1.j("锁定", str), tz0.k(og1.h, z ? 1.0f : 0.3f), 0L, dr0Var, 0, 8);
                }
                break;
        }
        return j23Var;
    }

    public /* synthetic */ t7(kv2 kv2Var, boolean z, int i) {
        this.j = kv2Var;
        this.i = z;
    }

    public /* synthetic */ t7(String str, boolean z) {
        this.j = str;
        this.i = z;
    }
}
