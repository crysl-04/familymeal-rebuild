package defpackage;

import java.util.ArrayList;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z50 implements zp0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ vp0 i;
    public final /* synthetic */ rg1 j;

    public z50(int i, vp0 vp0Var, rg1 rg1Var) {
        this.h = i;
        this.i = vp0Var;
        this.j = rg1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        final byte b = 0;
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i = this.h;
            yy yyVar = zy.a;
            final vp0 vp0Var = this.i;
            if (i == 0) {
                dr0Var.V(-101264927);
                iu0 iu0VarB = es.i;
                if (iu0VarB == null) {
                    hu0 hu0Var = new hu0("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    int i2 = k33.a;
                    rl2 rl2Var = new rl2(kv.b);
                    xl1 xl1Var = new xl1((byte) 3);
                    xl1Var.A(3.0f, 17.25f);
                    xl1Var.H(21.0f);
                    xl1Var.x(3.75f);
                    xl1Var.y(17.81f, 9.94f);
                    xl1Var.z(-3.75f, -3.75f);
                    xl1Var.y(3.0f, 17.25f);
                    xl1Var.m();
                    xl1Var.A(20.71f, 7.04f);
                    xl1Var.s(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                    xl1Var.z(-2.34f, -2.34f);
                    xl1Var.s(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                    xl1Var.z(-1.83f, 1.83f);
                    xl1Var.z(3.75f, 3.75f);
                    xl1Var.z(1.83f, -1.83f);
                    xl1Var.m();
                    hu0.a(hu0Var, (ArrayList) xl1Var.i, rl2Var);
                    iu0VarB = hu0Var.b();
                    es.i = iu0VarB;
                }
                String strL = h12.l(R.string.m3c_date_picker_switch_to_input_mode, dr0Var);
                boolean zF = dr0Var.f(vp0Var);
                Object objK = dr0Var.K();
                if (zF || objK == yyVar) {
                    objK = new kp0() { // from class: y50
                        @Override // defpackage.kp0
                        public final Object a() {
                            byte b2 = b;
                            j23 j23Var = j23.a;
                            vp0 vp0Var2 = vp0Var;
                            switch (b2) {
                                case 0:
                                    vp0Var2.h(new ab0(1));
                                    break;
                                default:
                                    vp0Var2.h(new ab0(0));
                                    break;
                            }
                            return j23Var;
                        }
                    };
                    dr0Var.f0(objK);
                }
                n60.h((kp0) objK, iu0VarB, strL, this.j, false, dr0Var, 0, 16);
                dr0Var.p(false);
            } else {
                dr0Var.V(-100967048);
                iu0 iu0VarB2 = es.j;
                if (iu0VarB2 == null) {
                    hu0 hu0Var2 = new hu0("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    int i3 = k33.a;
                    rl2 rl2Var2 = new rl2(kv.b);
                    xl1 xl1Var2 = new xl1((byte) 3);
                    xl1Var2.A(9.0f, 11.0f);
                    xl1Var2.y(7.0f, 11.0f);
                    xl1Var2.I(2.0f);
                    xl1Var2.x(2.0f);
                    xl1Var2.I(-2.0f);
                    xl1Var2.m();
                    xl1Var2.A(13.0f, 11.0f);
                    xl1Var2.x(-2.0f);
                    xl1Var2.I(2.0f);
                    xl1Var2.x(2.0f);
                    xl1Var2.I(-2.0f);
                    xl1Var2.m();
                    xl1Var2.A(17.0f, 11.0f);
                    xl1Var2.x(-2.0f);
                    xl1Var2.I(2.0f);
                    xl1Var2.x(2.0f);
                    xl1Var2.I(-2.0f);
                    xl1Var2.m();
                    xl1Var2.A(19.0f, 4.0f);
                    xl1Var2.x(-1.0f);
                    xl1Var2.y(18.0f, 2.0f);
                    xl1Var2.x(-2.0f);
                    xl1Var2.I(2.0f);
                    xl1Var2.y(8.0f, 4.0f);
                    xl1Var2.y(8.0f, 2.0f);
                    xl1Var2.y(6.0f, 2.0f);
                    xl1Var2.I(2.0f);
                    xl1Var2.y(5.0f, 4.0f);
                    xl1Var2.s(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                    xl1Var2.y(3.0f, 20.0f);
                    xl1Var2.s(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    xl1Var2.x(14.0f);
                    xl1Var2.s(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    xl1Var2.y(21.0f, 6.0f);
                    xl1Var2.s(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    xl1Var2.m();
                    xl1Var2.A(19.0f, 20.0f);
                    xl1Var2.y(5.0f, 20.0f);
                    xl1Var2.y(5.0f, 9.0f);
                    xl1Var2.x(14.0f);
                    xl1Var2.I(11.0f);
                    xl1Var2.m();
                    hu0.a(hu0Var2, (ArrayList) xl1Var2.i, rl2Var2);
                    iu0VarB2 = hu0Var2.b();
                    es.j = iu0VarB2;
                }
                String strL2 = h12.l(R.string.m3c_date_picker_switch_to_calendar_mode, dr0Var);
                boolean zF2 = dr0Var.f(vp0Var);
                Object objK2 = dr0Var.K();
                if (zF2 || objK2 == yyVar) {
                    final byte b2 = 1;
                    objK2 = new kp0() { // from class: y50
                        @Override // defpackage.kp0
                        public final Object a() {
                            byte b3 = b2;
                            j23 j23Var = j23.a;
                            vp0 vp0Var2 = vp0Var;
                            switch (b3) {
                                case 0:
                                    vp0Var2.h(new ab0(1));
                                    break;
                                default:
                                    vp0Var2.h(new ab0(0));
                                    break;
                            }
                            return j23Var;
                        }
                    };
                    dr0Var.f0(objK2);
                }
                n60.h((kp0) objK2, iu0VarB2, strL2, this.j, false, dr0Var, 0, 16);
                dr0Var.p(false);
            }
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
