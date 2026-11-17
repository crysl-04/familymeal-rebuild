package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x30 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public cz2 m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ga2 p;
    public final /* synthetic */ vu1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x30(ga2 ga2Var, m10 m10Var, vu1 vu1Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.p = ga2Var;
        this.q = vu1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        wu1 wu1Var = (wu1) obj;
        m10 m10Var = (m10) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((x30) p(m10Var, wu1Var)).r(j23Var);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        switch (this.l) {
            case 0:
                x30 x30Var = new x30(this.p, m10Var, this.q, (byte) 0);
                x30Var.o = obj;
                return x30Var;
            default:
                x30 x30Var2 = new x30(this.p, m10Var, this.q, (byte) 1);
                x30Var2.o = obj;
                return x30Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[PHI: r0 r1
  0x0083: PHI (r0v15 cz2) = (r0v14 cz2), (r0v14 cz2), (r0v20 cz2) binds: [B:22:0x0071, B:24:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r1v11 wu1) = (r1v10 wu1), (r1v10 wu1), (r1v16 wu1) binds: [B:22:0x0071, B:24:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[PHI: r0 r14
  0x0096: PHI (r0v17 wu1) = (r0v16 wu1), (r0v22 wu1) binds: [B:26:0x0094, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r14v31 java.lang.Object) = (r14v29 java.lang.Object), (r14v0 java.lang.Object) binds: [B:26:0x0094, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124 A[PHI: r0 r1
  0x0124: PHI (r0v4 cz2) = (r0v3 cz2), (r0v3 cz2), (r0v9 cz2) binds: [B:54:0x0112, B:56:0x0122, B:47:0x00de] A[DONT_GENERATE, DONT_INLINE]
  0x0124: PHI (r1v3 wu1) = (r1v2 wu1), (r1v2 wu1), (r1v8 wu1) binds: [B:54:0x0112, B:56:0x0122, B:47:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0138 A[PHI: r0 r14
  0x0138: PHI (r0v6 wu1) = (r0v5 wu1), (r0v11 wu1) binds: [B:58:0x0136, B:46:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x0138: PHI (r14v12 java.lang.Object) = (r14v10 java.lang.Object), (r14v0 java.lang.Object) binds: [B:58:0x0136, B:46:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0144  */
    /* JADX WARN: Code duplicated, block: B:65:0x014f  */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        cz2 cz2Var;
        wu1 wu1Var;
        cz2 cz2Var2;
        wu1 wu1Var2;
        Boolean boolC;
        Object obj2;
        cz2 cz2Var3;
        wu1 wu1Var3;
        cz2 cz2Var4;
        wu1 wu1Var4;
        Boolean boolC2;
        Object obj3;
        byte b = this.l;
        cz2 cz2Var5 = cz2.i;
        y20 y20Var = y20.h;
        ga2 ga2Var = this.p;
        vu1 vu1Var = this.q;
        switch (b) {
            case 0:
                byte b2 = this.n;
                if (b2 == 0) {
                    m02.y(obj);
                    wu1 wu1Var5 = (wu1) this.o;
                    this.o = wu1Var5;
                    this.m = cz2Var5;
                    this.n = (byte) 1;
                    Boolean boolC3 = wu1Var5.c(this);
                    if (boolC3 != y20Var) {
                        cz2Var = cz2Var5;
                        wu1Var = wu1Var5;
                        obj = boolC3;
                    }
                    return y20Var;
                }
                if (b2 == 1) {
                    cz2 cz2Var6 = this.m;
                    wu1 wu1Var6 = (wu1) this.o;
                    m02.y(obj);
                    cz2Var = cz2Var6;
                    wu1Var = wu1Var6;
                } else {
                    if (b2 == 2) {
                        cz2Var2 = this.m;
                        wu1Var = (wu1) this.o;
                        m02.y(obj);
                        cz2 cz2Var7 = cz2Var2;
                        wu1Var2 = wu1Var;
                        w30 w30Var = new w30(null, vu1Var, (byte) 0);
                        this.o = wu1Var2;
                        this.m = null;
                        this.n = (byte) 3;
                        obj = wu1Var2.e(cz2Var7, w30Var, this);
                        if (obj != y20Var) {
                            this.o = obj;
                            this.n = (byte) 4;
                            boolC = wu1Var2.c(this);
                            if (boolC != y20Var) {
                                Object obj4 = obj;
                                obj = boolC;
                                obj2 = obj4;
                            }
                        }
                        return y20Var;
                    }
                    if (b2 == 3) {
                        wu1Var2 = (wu1) this.o;
                        m02.y(obj);
                        this.o = obj;
                        this.n = (byte) 4;
                        boolC = wu1Var2.c(this);
                        if (boolC != y20Var) {
                            Object obj5 = obj;
                            obj = boolC;
                            obj2 = obj5;
                        }
                        return y20Var;
                    }
                    if (b2 != 4) {
                        if (b2 == 5) {
                            m02.y(obj);
                            return obj;
                        }
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.o;
                    m02.y(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    ga2Var.e().a();
                }
                return obj2;
                cz2Var2 = cz2Var;
                if (((Boolean) obj).booleanValue()) {
                    cz2 cz2Var8 = cz2Var2;
                    wu1Var2 = wu1Var;
                    w30 w30Var2 = new w30(null, vu1Var, (byte) 0);
                    this.o = wu1Var2;
                    this.m = null;
                    this.n = (byte) 3;
                    obj = wu1Var2.e(cz2Var8, w30Var2, this);
                    if (obj != y20Var) {
                        this.o = obj;
                        this.n = (byte) 4;
                        boolC = wu1Var2.c(this);
                        if (boolC != y20Var) {
                            Object obj6 = obj;
                            obj = boolC;
                            obj2 = obj6;
                            if (!((Boolean) obj).booleanValue()) {
                                ga2Var.e().a();
                            }
                            return obj2;
                        }
                    }
                } else {
                    f01 f01VarE = ga2Var.e();
                    this.o = wu1Var;
                    this.m = cz2Var2;
                    this.n = (byte) 2;
                    if (f01VarE.b(this) != y20Var) {
                        cz2 cz2Var9 = cz2Var2;
                        wu1Var2 = wu1Var;
                        w30 w30Var3 = new w30(null, vu1Var, (byte) 0);
                        this.o = wu1Var2;
                        this.m = null;
                        this.n = (byte) 3;
                        obj = wu1Var2.e(cz2Var9, w30Var3, this);
                        if (obj != y20Var) {
                            this.o = obj;
                            this.n = (byte) 4;
                            boolC = wu1Var2.c(this);
                            if (boolC != y20Var) {
                                Object obj7 = obj;
                                obj = boolC;
                                obj2 = obj7;
                                if (!((Boolean) obj).booleanValue()) {
                                    ga2Var.e().a();
                                }
                                return obj2;
                            }
                        }
                    }
                }
                return y20Var;
            default:
                byte b3 = this.n;
                if (b3 == 0) {
                    m02.y(obj);
                    wu1 wu1Var7 = (wu1) this.o;
                    this.o = wu1Var7;
                    this.m = cz2Var5;
                    this.n = (byte) 1;
                    Boolean boolC4 = wu1Var7.c(this);
                    if (boolC4 != y20Var) {
                        cz2Var3 = cz2Var5;
                        wu1Var3 = wu1Var7;
                        obj = boolC4;
                    }
                    return y20Var;
                }
                if (b3 == 1) {
                    cz2 cz2Var10 = this.m;
                    wu1 wu1Var8 = (wu1) this.o;
                    m02.y(obj);
                    cz2Var3 = cz2Var10;
                    wu1Var3 = wu1Var8;
                } else {
                    if (b3 == 2) {
                        cz2Var4 = this.m;
                        wu1Var3 = (wu1) this.o;
                        m02.y(obj);
                        cz2 cz2Var11 = cz2Var4;
                        wu1Var4 = wu1Var3;
                        w30 w30Var4 = new w30(null, vu1Var, (byte) 1);
                        this.o = wu1Var4;
                        this.m = null;
                        this.n = (byte) 3;
                        obj = wu1Var4.e(cz2Var11, w30Var4, this);
                        if (obj != y20Var) {
                            this.o = obj;
                            this.n = (byte) 4;
                            boolC2 = wu1Var4.c(this);
                            if (boolC2 != y20Var) {
                                Object obj8 = obj;
                                obj = boolC2;
                                obj3 = obj8;
                            }
                        }
                        return y20Var;
                    }
                    if (b3 == 3) {
                        wu1Var4 = (wu1) this.o;
                        m02.y(obj);
                        this.o = obj;
                        this.n = (byte) 4;
                        boolC2 = wu1Var4.c(this);
                        if (boolC2 != y20Var) {
                            Object obj9 = obj;
                            obj = boolC2;
                            obj3 = obj9;
                        }
                        return y20Var;
                    }
                    if (b3 != 4) {
                        if (b3 == 5) {
                            m02.y(obj);
                            return obj;
                        }
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = this.o;
                    m02.y(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    ga2Var.e().a();
                }
                return obj3;
                cz2Var4 = cz2Var3;
                if (((Boolean) obj).booleanValue()) {
                    cz2 cz2Var12 = cz2Var4;
                    wu1Var4 = wu1Var3;
                    w30 w30Var5 = new w30(null, vu1Var, (byte) 1);
                    this.o = wu1Var4;
                    this.m = null;
                    this.n = (byte) 3;
                    obj = wu1Var4.e(cz2Var12, w30Var5, this);
                    if (obj != y20Var) {
                        this.o = obj;
                        this.n = (byte) 4;
                        boolC2 = wu1Var4.c(this);
                        if (boolC2 != y20Var) {
                            Object obj10 = obj;
                            obj = boolC2;
                            obj3 = obj10;
                            if (!((Boolean) obj).booleanValue()) {
                                ga2Var.e().a();
                            }
                            return obj3;
                        }
                    }
                } else {
                    f01 f01VarE2 = ga2Var.e();
                    this.o = wu1Var3;
                    this.m = cz2Var4;
                    this.n = (byte) 2;
                    if (f01VarE2.b(this) != y20Var) {
                        cz2 cz2Var13 = cz2Var4;
                        wu1Var4 = wu1Var3;
                        w30 w30Var6 = new w30(null, vu1Var, (byte) 1);
                        this.o = wu1Var4;
                        this.m = null;
                        this.n = (byte) 3;
                        obj = wu1Var4.e(cz2Var13, w30Var6, this);
                        if (obj != y20Var) {
                            this.o = obj;
                            this.n = (byte) 4;
                            boolC2 = wu1Var4.c(this);
                            if (boolC2 != y20Var) {
                                Object obj11 = obj;
                                obj = boolC2;
                                obj3 = obj11;
                                if (!((Boolean) obj).booleanValue()) {
                                    ga2Var.e().a();
                                }
                                return obj3;
                            }
                        }
                    }
                }
                return y20Var;
        }
    }
}
