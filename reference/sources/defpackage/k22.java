package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k22 implements e90 {
    public final /* synthetic */ e90 h;
    public boolean i;
    public boolean j;
    public final ok1 k = new ok1();

    public k22(e90 e90Var) {
        this.h = e90Var;
    }

    @Override // defpackage.e90
    public final float A(float f) {
        return this.h.A(f);
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

    public final void a() {
        this.j = true;
        ok1 ok1Var = this.k;
        if (ok1Var.c()) {
            ok1Var.f(null);
        }
    }

    @Override // defpackage.e90
    public final float b() {
        return this.h.b();
    }

    public final void c() {
        this.i = true;
        ok1 ok1Var = this.k;
        if (ok1Var.c()) {
            ok1Var.f(null);
        }
    }

    @Override // defpackage.e90
    public final long c0(long j) {
        return this.h.c0(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(n10 n10Var) {
        i22 i22Var;
        if (n10Var instanceof i22) {
            i22Var = (i22) n10Var;
            int i = i22Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                i22Var.m = i - Integer.MIN_VALUE;
            } else {
                i22Var = new i22(this, n10Var);
            }
        } else {
            i22Var = new i22(this, n10Var);
        }
        Object obj = i22Var.k;
        int i2 = i22Var.m;
        if (i2 == 0) {
            m02.y(obj);
            i22Var.m = 1;
            Object objD = this.k.d(i22Var);
            y20 y20Var = y20.h;
            if (objD == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        this.i = false;
        this.j = false;
        return j23.a;
    }

    @Override // defpackage.e90
    public final float f0(long j) {
        return this.h.f0(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(n10 n10Var) {
        j22 j22Var;
        if (n10Var instanceof j22) {
            j22Var = (j22) n10Var;
            int i = j22Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                j22Var.m = i - Integer.MIN_VALUE;
            } else {
                j22Var = new j22(this, n10Var);
            }
        } else {
            j22Var = new j22(this, n10Var);
        }
        Object obj = j22Var.k;
        int i2 = j22Var.m;
        ok1 ok1Var = this.k;
        if (i2 == 0) {
            m02.y(obj);
            if (!this.i && !this.j) {
                j22Var.m = 1;
                Object objD = ok1Var.d(j22Var);
                y20 y20Var = y20.h;
                if (objD == y20Var) {
                    return y20Var;
                }
            }
            return Boolean.valueOf(this.i);
        }
        if (i2 != 1) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m02.y(obj);
        ok1Var.f(null);
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.e90
    public final long m0(float f) {
        return this.h.m0(f);
    }

    @Override // defpackage.e90
    public final float n() {
        return this.h.n();
    }

    @Override // defpackage.e90
    public final float r0(int i) {
        return this.h.r0(i);
    }

    @Override // defpackage.e90
    public final float u0(float f) {
        return this.h.u0(f);
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
