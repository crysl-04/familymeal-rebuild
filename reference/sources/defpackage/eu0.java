package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class eu0 {
    public static final rg1 a = yj2.i(og1.h, ie1.R);

    public static final void a(final iu0 iu0Var, String str, rg1 rg1Var, long j, dr0 dr0Var, final int i, final int i2) {
        int i3;
        String str2;
        dr0 dr0Var2;
        final long j2;
        final rg1 rg1Var2;
        dr0Var.W(-126890956);
        int i4 = (dr0Var.f(iu0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= dr0Var.f(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (dr0Var.f(rg1Var) ? 256 : 128);
        }
        int i6 = i3 | 1024;
        if (dr0Var.N(i6 & 1, (i6 & 1171) != 1170)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                if (i5 != 0) {
                    rg1Var = og1.h;
                }
                j = ((kv) dr0Var.j(s00.a)).a;
            } else {
                dr0Var.Q();
            }
            int i7 = i6 & (-7169);
            rg1 rg1Var3 = rg1Var;
            long j3 = j;
            dr0Var.q();
            str2 = str;
            dr0Var2 = dr0Var;
            b(m02.w(iu0Var, dr0Var), str2, rg1Var3, j3, dr0Var2, 8 | (i7 & 112) | (i7 & 896));
            rg1Var2 = rg1Var3;
            j2 = j3;
        } else {
            str2 = str;
            dr0Var2 = dr0Var;
            dr0Var2.Q();
            j2 = j;
            rg1Var2 = rg1Var;
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            final String str3 = str2;
            e72VarR.d = new zp0() { // from class: cu0
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eu0.a(iu0Var, str3, rg1Var2, j2, (dr0) obj, m02.A(i | 1), i2);
                    return j23.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    public static final void b(final m33 m33Var, final String str, final rg1 rg1Var, final long j, dr0 dr0Var, final int i) {
        int i2;
        rg1 rg1VarA;
        dr0Var.W(-2142239481);
        if ((i & 6) == 0) {
            i2 = (dr0Var.h(m33Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.f(rg1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.e(j) ? 2048 : 1024;
        }
        if (dr0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            dr0Var.S();
            if ((i & 1) != 0 && !dr0Var.x()) {
                dr0Var.Q();
            }
            dr0Var.q();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && dr0Var.e(j)) || (i2 & 3072) == 2048;
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (z || objK == yyVar) {
                objK = r13.a(j, kv.g) ? null : new ln(5, j);
                dr0Var.f0(objK);
            }
            ln lnVar = (ln) objK;
            rg1 rg1Var2 = og1.h;
            if (str != null) {
                dr0Var.V(-536990979);
                boolean z2 = (i2 & 112) == 32;
                Object objK2 = dr0Var.K();
                if (z2 || objK2 == yyVar) {
                    objK2 = new ql(str, (byte) 7);
                    dr0Var.f0(objK2);
                }
                rg1VarA = tg2.a(rg1Var2, false, (vp0) objK2);
                dr0Var.p(false);
            } else {
                dr0Var.V(-536832197);
                dr0Var.p(false);
                rg1VarA = rg1Var2;
            }
            if (wj2.a(m33Var.d(), 9205357640488583168L)) {
                rg1Var2 = a;
            } else {
                long jD = m33Var.d();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jD >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jD & 4294967295L)))) {
                    rg1Var2 = a;
                }
            }
            ho.a(aa3.F(rg1Var.c(rg1Var2), m33Var, lnVar).c(rg1VarA), dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new zp0() { // from class: du0
                @Override // defpackage.zp0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eu0.b(m33Var, str, rg1Var, j, (dr0) obj, m02.A(i | 1));
                    return j23.a;
                }
            };
        }
    }
}
