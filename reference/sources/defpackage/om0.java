package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om0 extends kq0 implements zp0 {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.o = b;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        boolean zA;
        byte b = this.o;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                km0 km0Var = (km0) obj;
                km0 km0Var2 = (km0) obj2;
                pm0 pm0Var = (pm0) obj3;
                if (pm0Var.u && (zA = km0Var2.a()) != km0Var.a()) {
                    i iVar = pm0Var.y;
                    if (iVar != null) {
                        iVar.h(Boolean.valueOf(zA));
                    }
                    m10 m10Var = null;
                    if (zA) {
                        ie1.p(pm0Var.x0(), null, new qj(pm0Var, m10Var, (byte) 3), 1);
                        x72 x72Var = new x72();
                        ou.D(pm0Var, new h6((Object) x72Var, (Object) pm0Var, (byte) 16));
                        y61 y61Var = (y61) x72Var.h;
                        if (y61Var != null) {
                            y61Var.a();
                        } else {
                            y61Var = null;
                        }
                        pm0Var.A = y61Var;
                        pn1 pn1Var = pm0Var.B;
                        if (pn1Var != null && pn1Var.V0().u) {
                            pm0Var.N0();
                        }
                    } else {
                        y61 y61Var2 = pm0Var.A;
                        if (y61Var2 != null) {
                            y61Var2.b();
                        }
                        pm0Var.A = null;
                        pm0Var.N0();
                    }
                    y02.p(pm0Var);
                    ui1 ui1Var = pm0Var.x;
                    if (ui1Var != null) {
                        wl0 wl0Var = pm0Var.z;
                        if (zA) {
                            if (wl0Var != null) {
                                pm0Var.M0(ui1Var, new xl0(wl0Var));
                                pm0Var.z = null;
                            }
                            wl0 wl0Var2 = new wl0();
                            pm0Var.M0(ui1Var, wl0Var2);
                            pm0Var.z = wl0Var2;
                        } else if (wl0Var != null) {
                            pm0Var.M0(ui1Var, new xl0(wl0Var));
                            pm0Var.z = null;
                        }
                    }
                }
                return j23.a;
            case 1:
                rh2 rh2Var = (rh2) obj;
                int iIntValue = ((Number) obj2).intValue();
                rh2Var.getClass();
                p11 p11Var = (p11) obj3;
                p11Var.getClass();
                boolean z = !rh2Var.k(iIntValue) && rh2Var.j(iIntValue).h();
                p11Var.b = z;
                return Boolean.valueOf(z);
            case 2:
                return ia2.h((ga2) obj3, (vp0) obj, (m10) obj2);
            default:
                return ia2.h((ga2) obj3, (vp0) obj, (m10) obj2);
        }
    }
}
