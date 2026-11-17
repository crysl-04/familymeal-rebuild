package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d60 implements aq0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ d60(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj4 = this.i;
        switch (b) {
            case 0:
                py2 py2Var = (py2) obj;
                dr0 dr0Var = (dr0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? dr0Var.f(py2Var) : dr0Var.h(py2Var) ? 4 : 2;
                }
                if (dr0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ny2.a(py2Var, null, 0.0f, null, 0L, 0L, dt.N(1905952188, new p40((String) obj4, 1 == true ? 1 : 0), dr0Var), dr0Var, (iIntValue & 14) | 805306368);
                } else {
                    dr0Var.Q();
                }
                return j23Var;
            case 1:
                long j = ((kv) obj).a;
                dr0 dr0Var2 = (dr0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dr0Var2.e(j) ? 4 : 2;
                }
                if (dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e80.b(((mt2) obj4).c, j, dr0Var2, (iIntValue2 << 3) & 112);
                } else {
                    dr0Var2.Q();
                }
                return j23Var;
            case 2:
                dr0 dr0Var3 = (dr0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ((zp0) obj4).f(dr0Var3, 0);
                } else {
                    dr0Var3.Q();
                }
                return j23Var;
            case 3:
                dr0 dr0Var4 = (dr0) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    pr2.c((nx) obj4, dr0Var4, 0);
                } else {
                    dr0Var4.Q();
                }
                return j23Var;
            default:
                rg1 rg1Var = (rg1) obj;
                dr0 dr0Var5 = (dr0) obj2;
                ((Number) obj3).intValue();
                dr0Var5.V(-1498516085);
                zm2 zm2VarA0 = ls.a0(gh1.i, dr0Var5);
                zm2 zm2VarA1 = ls.a0(gh1.k, dr0Var5);
                qz2 qz2Var = (qz2) obj4;
                s03 s03Var = aa3.Q;
                qy qyVar = qz2Var.a;
                lu1 lu1Var = qz2Var.d;
                boolean zBooleanValue = ((Boolean) qyVar.g()).booleanValue();
                dr0Var5.V(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                dr0Var5.p(false);
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = ((Boolean) lu1Var.getValue()).booleanValue();
                dr0Var5.V(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                dr0Var5.p(false);
                Float fValueOf2 = Float.valueOf(f2);
                qz2Var.f();
                dr0Var5.V(386845748);
                dr0Var5.p(false);
                oz2 oz2VarS = t03.s(qz2Var, fValueOf, fValueOf2, zm2VarA0, s03Var, dr0Var5, 196608);
                boolean zBooleanValue3 = ((Boolean) qz2Var.a.g()).booleanValue();
                dr0Var5.V(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                dr0Var5.p(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) lu1Var.getValue()).booleanValue();
                dr0Var5.V(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                dr0Var5.p(false);
                Float fValueOf4 = Float.valueOf(f4);
                qz2Var.f();
                dr0Var5.V(-281714272);
                dr0Var5.p(false);
                rg1 rg1VarK0 = h7.k0(rg1Var, ((Number) oz2VarS.q.getValue()).floatValue(), ((Number) oz2VarS.q.getValue()).floatValue(), ((Number) t03.s(qz2Var, fValueOf3, fValueOf4, zm2VarA1, s03Var, dr0Var5, 196608).q.getValue()).floatValue(), 0.0f, null, 131064);
                dr0Var5.p(false);
                return rg1VarK0;
        }
    }
}
