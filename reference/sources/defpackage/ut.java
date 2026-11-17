package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ut implements zp0 {
    public final /* synthetic */ float h;
    public final /* synthetic */ rt1 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ nx k;
    public final /* synthetic */ long l;

    public ut(float f, rt1 rt1Var, long j, nx nxVar, long j2) {
        this.h = f;
        this.i = rt1Var;
        this.j = j;
        this.k = nxVar;
        this.l = j2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            zm2 zm2VarA0 = ls.a0(gh1.l, dr0Var);
            zm2 zm2VarA1 = ls.a0(gh1.k, dr0Var);
            zm2 zm2VarA2 = ls.a0(gh1.i, dr0Var);
            zm2 zm2VarA3 = ls.a0(gh1.j, dr0Var);
            float f = this.h;
            og1 og1Var = og1.h;
            rg1 rg1VarF = t03.F(yj2.a(og1Var, Float.NaN, f), this.i);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new yt();
                dr0Var.f0(objK);
            }
            yt ytVar = (yt) objK;
            int iHashCode = Long.hashCode(dr0Var.T);
            dx1 dx1VarL = dr0Var.l();
            rg1 rg1VarU = ls.U(dr0Var, rg1VarF);
            sy.f.getClass();
            dr0Var.Y();
            boolean z = dr0Var.S;
            jw0 jw0Var = l41.W;
            if (z) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            yx yxVar = c5.F;
            h12.y(yxVar, dr0Var, ytVar);
            yx yxVar2 = c5.E;
            h12.y(yxVar2, dr0Var, dx1VarL);
            yx yxVar3 = c5.G;
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode))) {
                wi0.o(iHashCode, dr0Var, iHashCode, yxVar3);
            }
            yx yxVar4 = c5.D;
            h12.y(yxVar4, dr0Var, rg1VarU);
            rg1 rg1VarW = s60.w(og1Var, "leadingIcon");
            bm bmVar = c5.u;
            t03.b(false, rg1VarW, vg0.b(zm2VarA2, bmVar).a(vg0.d(zm2VarA0, 2)), vg0.f(zm2VarA3, bmVar).a(vg0.e(zm2VarA1, 2)), null, dt.N(687705959, new ox(this.j, (byte) 1), dr0Var), dr0Var, 196656);
            rg1 rg1VarW2 = s60.w(og1Var, "label");
            rt1 rt1Var = wt.a;
            rg1 rg1VarH = t03.H(rg1VarW2, 8.0f, 0.0f, 2);
            ua2 ua2VarA = ta2.a(uz0.e, c5.s, dr0Var, 54);
            int iHashCode2 = Long.hashCode(dr0Var.T);
            dx1 dx1VarL2 = dr0Var.l();
            rg1 rg1VarU2 = ls.U(dr0Var, rg1VarH);
            dr0Var.Y();
            if (dr0Var.S) {
                dr0Var.k(jw0Var);
            } else {
                dr0Var.i0();
            }
            h12.y(yxVar, dr0Var, ua2VarA);
            h12.y(yxVar2, dr0Var, dx1VarL2);
            if (dr0Var.S || !uz0.g(dr0Var.K(), Integer.valueOf(iHashCode2))) {
                wi0.o(iHashCode2, dr0Var, iHashCode2, yxVar3);
            }
            h12.y(yxVar4, dr0Var, rg1VarU2);
            wi0.n(0, this.k, dr0Var, true);
            rg1 rg1VarW3 = s60.w(og1Var, "trailingIcon");
            bm bmVar2 = c5.w;
            t03.b(false, rg1VarW3, vg0.b(zm2VarA2, bmVar2).a(vg0.d(zm2VarA0, 2)), vg0.f(zm2VarA3, bmVar2).a(vg0.e(zm2VarA1, 2)), null, dt.N(1905252304, new ox(this.l, (byte) 2), dr0Var), dr0Var, 196656);
            dr0Var.p(true);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
