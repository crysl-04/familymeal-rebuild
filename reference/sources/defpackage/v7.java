package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ float i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ v7(t23 t23Var, float f, vp0 vp0Var) {
        this.h = (byte) 4;
        this.j = t23Var;
        this.i = f;
        this.k = vp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb A[PHI: r0
  0x00cb: PHI (r0v14 float) = (r0v11 float), (r0v18 float) binds: [B:30:0x00c7, B:25:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        float fFloatValue;
        byte b = this.h;
        float f = 0.0f;
        j23 j23Var = j23.a;
        Object obj2 = this.k;
        float f2 = this.i;
        Object obj3 = this.j;
        switch (b) {
            case 0:
                t8 t8Var = (t8) obj3;
                ln lnVar = (ln) obj2;
                n41 n41Var = (n41) obj;
                n41Var.a();
                eg egVar = n41Var.h.i;
                long jQ = egVar.q();
                egVar.g().l();
                try {
                    g2 g2Var = (g2) egVar.i;
                    g2Var.P(f2, 0.0f);
                    g2Var.L(45.0f, 0L);
                    td0.N(n41Var, t8Var, lnVar);
                    return j23Var;
                } finally {
                    wi0.r(egVar, jQ);
                }
            case 1:
                u72 u72Var = (u72) obj3;
                w71 w71Var = (w71) obj2;
                bd bdVar = (bd) obj;
                if (f2 > 0.0f) {
                    fFloatValue = ((Number) bdVar.e.getValue()).floatValue();
                    if (fFloatValue > f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                } else if (f2 < 0.0f) {
                    fFloatValue = ((Number) bdVar.e.getValue()).floatValue();
                    if (fFloatValue < f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                }
                float f3 = f - u72Var.h;
                if (f3 != ((wd2) w71Var.b).a(f3) || f != ((Number) bdVar.e.getValue()).floatValue()) {
                    bdVar.a();
                }
                u72Var.h += f3;
                return j23Var;
            case 2:
                my1.i((my1) obj, (ny1) obj3, ((bf1) obj2).R(f2), 0);
                return j23Var;
            case 3:
                ny1 ny1Var = (ny1) obj3;
                my1 my1Var = (my1) obj;
                tb tbVar = ((rx2) obj2).z;
                my1.k(my1Var, ny1Var, tbVar != null ? (int) ((Number) tbVar.d()).floatValue() : (int) f2, 0);
                return j23Var;
            default:
                t23 t23Var = (t23) obj3;
                vp0 vp0Var = (vp0) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = t23Var.b;
                if (j == Long.MIN_VALUE) {
                    t23Var.b = jLongValue;
                    j = jLongValue;
                }
                float f4 = t23Var.e;
                ed edVar = new ed(f4);
                ed edVar2 = t23.f;
                long jB = f2 == 0.0f ? t23Var.a.b(new ed(f4), edVar2, t23Var.c) : ie1.y((jLongValue - j) / f2);
                float f5 = ((ed) t23Var.a.p(jB, edVar, edVar2, t23Var.c)).a;
                t23Var.c = (ed) t23Var.a.l(jB, edVar, edVar2, t23Var.c);
                t23Var.b = jLongValue;
                float f6 = t23Var.e - f5;
                t23Var.e = f5;
                vp0Var.h(Float.valueOf(f6));
                return j23Var;
        }
    }

    public /* synthetic */ v7(ny1 ny1Var, Object obj, float f, byte b) {
        this.h = b;
        this.j = ny1Var;
        this.k = obj;
        this.i = f;
    }

    public /* synthetic */ v7(float f, Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = f;
        this.j = obj;
        this.k = obj2;
    }
}
