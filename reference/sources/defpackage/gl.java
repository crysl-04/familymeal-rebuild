package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gl implements ot2 {
    public final nx a;
    public final lk1 b = new lk1();
    public final lu1 c = rz1.x(null);

    public gl(nx nxVar) {
        this.a = nxVar;
    }

    @Override // defpackage.ot2
    public final Object a(gt2 gt2Var, mq2 mq2Var) {
        Object objX = vs.x(new ik1(ek1.h, this.b, new ya(this, new fl(gt2Var), null, (byte) 1), null), mq2Var);
        return objX == y20.h ? objX : j23.a;
    }

    public final void b(final kp0 kp0Var, dr0 dr0Var, final int i) {
        final kp0 kp0Var2;
        dr0 dr0Var2;
        dr0Var.W(723898654);
        int i2 = (dr0Var.f(this) ? 32 : 16) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            fl flVar = (fl) this.c.getValue();
            if (flVar == null) {
                e72 e72VarR = dr0Var.r();
                if (e72VarR != null) {
                    e72VarR.d = new zp0(this, kp0Var, i, b) { // from class: el
                        public final /* synthetic */ byte h;
                        public final /* synthetic */ gl i;
                        public final /* synthetic */ kp0 j;

                        {
                            this.h = b;
                            this.i = this;
                        }

                        @Override // defpackage.zp0
                        public final Object f(Object obj, Object obj2) {
                            byte b3 = this.h;
                            j23 j23Var = j23.a;
                            kp0 kp0Var3 = this.j;
                            gl glVar = this.i;
                            dr0 dr0Var3 = (dr0) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    glVar.b(kp0Var3, dr0Var3, m02.A(7));
                                    break;
                                default:
                                    glVar.b(kp0Var3, dr0Var3, m02.A(7));
                                    break;
                            }
                            return j23Var;
                        }
                    };
                    return;
                }
                return;
            }
            kp0Var2 = kp0Var;
            dr0Var2 = dr0Var;
            this.a.i(flVar, flVar.a, kp0Var2, dr0Var2, 384);
        } else {
            kp0Var2 = kp0Var;
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR2 = dr0Var2.r();
        if (e72VarR2 != null) {
            e72VarR2.d = new zp0(this, kp0Var2, i, b2) { // from class: el
                public final /* synthetic */ byte h;
                public final /* synthetic */ gl i;
                public final /* synthetic */ kp0 j;

                {
                    this.h = b2;
                    this.i = this;
                }

                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    byte b3 = this.h;
                    j23 j23Var = j23.a;
                    kp0 kp0Var3 = this.j;
                    gl glVar = this.i;
                    dr0 dr0Var3 = (dr0) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            glVar.b(kp0Var3, dr0Var3, m02.A(7));
                            break;
                        default:
                            glVar.b(kp0Var3, dr0Var3, m02.A(7));
                            break;
                    }
                    return j23Var;
                }
            };
        }
    }
}
