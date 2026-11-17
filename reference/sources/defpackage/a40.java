package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a40 extends mq2 implements zp0 {
    public cz2 l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ ga2 q;
    public final /* synthetic */ vp0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(m10 m10Var, vp0 vp0Var, ga2 ga2Var, boolean z, boolean z2) {
        super(2, m10Var);
        this.o = z;
        this.p = z2;
        this.q = ga2Var;
        this.r = vp0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((a40) p((m10) obj2, (wu1) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        a40 a40Var = new a40(m10Var, this.r, this.q, this.o, this.p);
        a40Var.n = obj;
        return a40Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0099 A[DONT_INVERT, PHI: r0 r12
  0x0099: PHI (r0v11 wu1) = (r0v8 wu1), (r0v15 wu1) binds: [B:32:0x0097, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r12v15 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:32:0x0097, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9 A[RETURN] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        cz2 cz2Var;
        wu1 wu1Var;
        cz2 cz2Var2;
        wu1 wu1Var2;
        wu1 wu1Var3;
        Boolean boolC;
        Object obj2;
        byte b = this.m;
        vp0 vp0Var = this.r;
        ga2 ga2Var = this.q;
        boolean z = this.p;
        y20 y20Var = y20.h;
        if (b == 0) {
            m02.y(obj);
            wu1 wu1Var4 = (wu1) this.n;
            if (!this.o) {
                wu1Var4.getClass();
                return vp0Var.h(wu1Var4.a());
            }
            cz2Var = z ? cz2.h : cz2.i;
            if (z) {
                cz2 cz2Var3 = cz2Var;
                wu1Var = wu1Var4;
                cz2Var2 = cz2Var3;
                rj rjVar = new rj(null, vp0Var);
                this.n = wu1Var;
                this.l = null;
                this.m = (byte) 3;
                obj = wu1Var.e(cz2Var2, rjVar, this);
                if (obj != y20Var) {
                    if (z) {
                        return obj;
                    }
                    this.n = obj;
                    this.m = (byte) 4;
                    boolC = wu1Var.c(this);
                    if (boolC != y20Var) {
                        Object obj3 = obj;
                        obj = boolC;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            ga2Var.e().a();
                        }
                        return obj2;
                    }
                }
            } else {
                this.n = wu1Var4;
                this.l = cz2Var;
                this.m = (byte) 1;
                Boolean boolC2 = wu1Var4.c(this);
                if (boolC2 != y20Var) {
                    wu1Var2 = wu1Var4;
                    obj = boolC2;
                }
            }
            return y20Var;
        }
        if (b == 1) {
            cz2Var = this.l;
            wu1Var2 = (wu1) this.n;
            m02.y(obj);
        } else {
            if (b == 2) {
                cz2Var = this.l;
                wu1Var3 = (wu1) this.n;
                m02.y(obj);
                cz2Var2 = cz2Var;
                wu1Var = wu1Var3;
                rj rjVar2 = new rj(null, vp0Var);
                this.n = wu1Var;
                this.l = null;
                this.m = (byte) 3;
                obj = wu1Var.e(cz2Var2, rjVar2, this);
                if (obj != y20Var) {
                    if (z) {
                        return obj;
                    }
                    this.n = obj;
                    this.m = (byte) 4;
                    boolC = wu1Var.c(this);
                    if (boolC != y20Var) {
                        Object obj4 = obj;
                        obj = boolC;
                        obj2 = obj4;
                    }
                }
                return y20Var;
            }
            if (b == 3) {
                wu1Var = (wu1) this.n;
                m02.y(obj);
                if (z) {
                    return obj;
                }
                this.n = obj;
                this.m = (byte) 4;
                boolC = wu1Var.c(this);
                if (boolC != y20Var) {
                    Object obj5 = obj;
                    obj = boolC;
                    obj2 = obj5;
                }
                return y20Var;
            }
            if (b != 4) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.n;
            m02.y(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            ga2Var.e().a();
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            cz2Var2 = cz2Var;
            wu1Var = wu1Var2;
            rj rjVar3 = new rj(null, vp0Var);
            this.n = wu1Var;
            this.l = null;
            this.m = (byte) 3;
            obj = wu1Var.e(cz2Var2, rjVar3, this);
            if (obj != y20Var) {
                if (z) {
                    return obj;
                }
                this.n = obj;
                this.m = (byte) 4;
                boolC = wu1Var.c(this);
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
            this.n = wu1Var2;
            this.l = cz2Var;
            this.m = (byte) 2;
            if (f01VarE.b(this) != y20Var) {
                wu1Var3 = wu1Var2;
                cz2Var2 = cz2Var;
                wu1Var = wu1Var3;
                rj rjVar4 = new rj(null, vp0Var);
                this.n = wu1Var;
                this.l = null;
                this.m = (byte) 3;
                obj = wu1Var.e(cz2Var2, rjVar4, this);
                if (obj != y20Var) {
                    if (z) {
                        return obj;
                    }
                    this.n = obj;
                    this.m = (byte) 4;
                    boolC = wu1Var.c(this);
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
    }
}
