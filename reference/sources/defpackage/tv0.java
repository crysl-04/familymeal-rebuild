package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 {
    public final uj1 a = new uj1(new rv0[16]);
    public final lu1 b = rz1.x(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final lu1 d = rz1.x(Boolean.TRUE);

    public final void a(int i, dr0 dr0Var) {
        dr0Var.W(-318043801);
        int i2 = (dr0Var.h(this) ? 4 : 2) | i;
        if (dr0Var.N(i2 & 1, (i2 & 3) != 2)) {
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = rz1.x(null);
                dr0Var.f0(objK);
            }
            sj1 sj1Var = (sj1) objK;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                dr0Var.V(-144841960);
                boolean zH = dr0Var.h(this);
                Object objK2 = dr0Var.K();
                if (zH || objK2 == yyVar) {
                    objK2 = new hd0(sj1Var, this, (m10) null);
                    dr0Var.f0(objK2);
                }
                h7.J((zp0) objK2, dr0Var, this);
                dr0Var.p(false);
            } else {
                dr0Var.V(-143455237);
                dr0Var.p(false);
            }
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new s(this, i, (byte) 12);
        }
    }
}
