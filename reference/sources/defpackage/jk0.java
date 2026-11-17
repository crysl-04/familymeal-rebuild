package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jk0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final tb e;
    public gz0 f;
    public gz0 g;

    public jk0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new tb(new cc0(f), aa3.S, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [j23, java.lang.Object] */
    public final Object a(gz0 gz0Var, n10 n10Var) {
        hk0 hk0Var;
        float f;
        tb tbVar = this.e;
        if (n10Var instanceof hk0) {
            hk0Var = (hk0) n10Var;
            int i = hk0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                hk0Var.n = i - Integer.MIN_VALUE;
            } else {
                hk0Var = new hk0(this, n10Var);
            }
        } else {
            hk0Var = new hk0(this, n10Var);
        }
        Object obj = hk0Var.l;
        int i2 = hk0Var.n;
        try {
            if (i2 == 0) {
                m02.y(obj);
                if (gz0Var instanceof m22) {
                    f = this.b;
                } else if (gz0Var instanceof ut0) {
                    f = this.c;
                } else {
                    f = gz0Var instanceof wl0 ? this.d : this.a;
                }
                this.g = gz0Var;
                if (!cc0.b(((cc0) tbVar.e.getValue()).h, f)) {
                    gz0 gz0Var2 = this.f;
                    hk0Var.k = gz0Var;
                    hk0Var.n = 1;
                    Object objA = df0.a(tbVar, f, gz0Var2, gz0Var, hk0Var);
                    y20 y20Var = y20.h;
                    if (objA == y20Var) {
                        return y20Var;
                    }
                }
            } else {
                if (i2 != 1) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gz0Var = hk0Var.k;
                m02.y(obj);
            }
            this.f = gz0Var;
            this = j23.a;
            return this;
        } catch (Throwable th) {
            this.f = gz0Var;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(n10 n10Var) {
        ik0 ik0Var;
        float f;
        if (n10Var instanceof ik0) {
            ik0Var = (ik0) n10Var;
            int i = ik0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ik0Var.m = i - Integer.MIN_VALUE;
            } else {
                ik0Var = new ik0(this, n10Var);
            }
        } else {
            ik0Var = new ik0(this, n10Var);
        }
        Object obj = ik0Var.k;
        int i2 = ik0Var.m;
        try {
            if (i2 == 0) {
                m02.y(obj);
                gz0 gz0Var = this.g;
                if (gz0Var instanceof m22) {
                    f = this.b;
                } else if (gz0Var instanceof ut0) {
                    f = this.c;
                } else {
                    f = gz0Var instanceof wl0 ? this.d : this.a;
                }
                tb tbVar = this.e;
                if (!cc0.b(((cc0) tbVar.e.getValue()).h, f)) {
                    cc0 cc0Var = new cc0(f);
                    ik0Var.m = 1;
                    Object objE = tbVar.e(ik0Var, cc0Var);
                    y20 y20Var = y20.h;
                    if (objE == y20Var) {
                        return y20Var;
                    }
                }
                return j23.a;
            }
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
            this.f = this.g;
            return j23.a;
        } catch (Throwable th) {
            this.f = this.g;
            throw th;
        }
    }
}
