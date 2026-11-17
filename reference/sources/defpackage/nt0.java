package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 {
    public int a;
    public float b;
    public final Object c;

    public nt0(hw2 hw2Var) {
        this.c = hw2Var;
        this.a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        hw2 hw2Var = (hw2) this.c;
        int i2 = 1;
        if (z) {
            int iA = ou.A(hw2Var.f, i, z);
            int lineStart = hw2Var.f.getLineStart(iA);
            int iF = hw2Var.f(iA);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i << 2;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fJ = z3 ? hw2Var.j(i, z) : hw2Var.k(i, z);
        if (z2) {
            this.a = i4;
            this.b = fJ;
        }
        return fJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(float f, n10 n10Var) {
        f82 f82Var;
        if (n10Var instanceof f82) {
            f82Var = (f82) n10Var;
            int i = f82Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                f82Var.m = i - Integer.MIN_VALUE;
            } else {
                f82Var = new f82(this, n10Var);
            }
        } else {
            f82Var = new f82(this, n10Var);
        }
        Object objF = f82Var.k;
        int i2 = f82Var.m;
        if (i2 == 0) {
            m02.y(objF);
            qx2 qx2Var = (qx2) this.c;
            Float f2 = new Float(f);
            f82Var.m = 1;
            objF = qx2Var.f(f2, f82Var);
            y20 y20Var = y20.h;
            if (objF == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(objF);
        }
        this.b += ((Number) objF).floatValue();
        return j23.a;
    }

    public nt0(int i, qx2 qx2Var) {
        this.a = i;
        this.c = qx2Var;
    }
}
