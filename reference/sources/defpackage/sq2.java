package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sq2 implements e90, m10 {
    public final /* synthetic */ tq2 h;
    public final rq i;
    public rq j;
    public s02 k = s02.i;
    public final /* synthetic */ tq2 l;

    public sq2(tq2 tq2Var, rq rqVar) {
        this.l = tq2Var;
        this.h = tq2Var;
        this.i = rqVar;
    }

    @Override // defpackage.e90
    public final float A(float f) {
        return this.h.b() * f;
    }

    @Override // defpackage.e90
    public final int J(long j) {
        return this.h.J(j);
    }

    @Override // defpackage.e90
    public final float L(long j) {
        return this.h.L(j);
    }

    @Override // defpackage.e90
    public final int R(float f) {
        return this.h.R(f);
    }

    public final Object a(s02 s02Var, m10 m10Var) {
        rq rqVar = new rq(1, ls.F(m10Var));
        rqVar.u();
        this.k = s02Var;
        this.j = rqVar;
        return rqVar.t();
    }

    @Override // defpackage.e90
    public final float b() {
        return this.h.b();
    }

    public final long c() {
        tq2 tq2Var = this.l;
        long jC0 = tq2Var.c0(cu.Y(tq2Var).G.g());
        long j = tq2Var.E;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.e90
    public final long c0(long j) {
        return this.h.c0(j);
    }

    @Override // defpackage.m10
    public final o20 e() {
        return xf0.h;
    }

    @Override // defpackage.e90
    public final float f0(long j) {
        return this.h.f0(j);
    }

    @Override // defpackage.m10
    public final void g(Object obj) {
        tq2 tq2Var = this.l;
        synchronized (tq2Var.B) {
            tq2Var.A.j(this);
        }
        this.i.g(obj);
    }

    public final v43 i() {
        return cu.Y(this.l).G;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(long j, zp0 zp0Var, rk rkVar) {
        pq2 pq2Var;
        Throwable th;
        dn2 dn2Var;
        rq rqVar;
        if (rkVar instanceof pq2) {
            pq2Var = (pq2) rkVar;
            int i = pq2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                pq2Var.n = i - Integer.MIN_VALUE;
            } else {
                pq2Var = new pq2(this, rkVar);
            }
        } else {
            pq2Var = new pq2(this, rkVar);
        }
        Object objF = pq2Var.l;
        int i2 = pq2Var.n;
        if (i2 != 0) {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dn2Var = pq2Var.k;
            try {
                m02.y(objF);
                dn2Var.a(pq.i);
                return objF;
            } catch (Throwable th2) {
                th = th2;
                dn2Var.a(pq.i);
                throw th;
            }
        }
        m02.y(objF);
        if (j <= 0 && (rqVar = this.j) != null) {
            rqVar.g(new d92(new t02(j)));
        }
        dn2 dn2VarP = ie1.p(this.l.x0(), null, new qq2(j, this, null), 3);
        try {
            pq2Var.k = dn2VarP;
            pq2Var.n = 1;
            objF = zp0Var.f(this, pq2Var);
            Object obj = y20.h;
            if (objF == obj) {
                return obj;
            }
            dn2Var = dn2VarP;
            dn2Var.a(pq.i);
            return objF;
        } catch (Throwable th3) {
            th = th3;
            dn2Var = dn2VarP;
            dn2Var.a(pq.i);
            throw th;
        }
    }

    @Override // defpackage.e90
    public final long m0(float f) {
        return this.h.m0(f);
    }

    @Override // defpackage.e90
    public final float n() {
        return this.h.n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(long j, zp0 zp0Var, n10 n10Var) {
        rq2 rq2Var;
        if (n10Var instanceof rq2) {
            rq2Var = (rq2) n10Var;
            int i = rq2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rq2Var.m = i - Integer.MIN_VALUE;
            } else {
                rq2Var = new rq2(this, n10Var);
            }
        } else {
            rq2Var = new rq2(this, n10Var);
        }
        Object obj = rq2Var.k;
        int i2 = rq2Var.m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    m02.y(obj);
                    return obj;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
            rq2Var.m = 1;
            Object objM = m(j, zp0Var, rq2Var);
            Object obj2 = y20.h;
            return objM == obj2 ? obj2 : objM;
        } catch (t02 unused) {
            return null;
        }
    }

    @Override // defpackage.e90
    public final float r0(int i) {
        return this.h.r0(i);
    }

    @Override // defpackage.e90
    public final float u0(float f) {
        return f / this.h.b();
    }

    @Override // defpackage.e90
    public final long w(float f) {
        return this.h.w(f);
    }

    @Override // defpackage.e90
    public final long x(long j) {
        return this.h.x(j);
    }
}
