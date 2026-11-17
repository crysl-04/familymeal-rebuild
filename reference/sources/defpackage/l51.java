package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l51 implements s61 {
    public final c61 a;
    public final j51 b;
    public final u8 c;

    public l51(c61 c61Var, j51 j51Var, u8 u8Var) {
        this.a = c61Var;
        this.b = j51Var;
        this.c = u8Var;
    }

    @Override // defpackage.s61
    public final int a() {
        return this.b.F().a;
    }

    @Override // defpackage.s61
    public final Object b(int i) {
        u8 u8Var = this.c;
        Object[] objArr = (Object[]) u8Var.c;
        int i2 = i - u8Var.a;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.G(i) : obj;
    }

    @Override // defpackage.s61
    public final Object c(int i) {
        return this.b.A(i);
    }

    @Override // defpackage.s61
    public final void d(int i, Object obj, dr0 dr0Var, int i2) {
        int i3;
        Object obj2;
        dr0 dr0Var2;
        dr0Var.W(1493551140);
        int i4 = (dr0Var.d(i) ? 4 : 2) | i2 | (dr0Var.h(obj) ? 32 : 16) | (dr0Var.f(this) ? 256 : 128);
        byte b = 0;
        if (dr0Var.N(i4 & 1, (i4 & 147) != 146)) {
            dr0Var2 = dr0Var;
            ls.f(obj, i, this.a.q, dt.N(726189336, new k51(this, i, b), dr0Var), dr0Var2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
            obj2 = obj;
            i3 = i;
        } else {
            i3 = i;
            obj2 = obj;
            dr0Var2 = dr0Var;
            dr0Var2.Q();
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new lx(this, i3, obj2, i2, (byte) 3);
        }
    }

    @Override // defpackage.s61
    public final int e(Object obj) {
        return this.c.d(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l51)) {
            return false;
        }
        return uz0.g(this.b, ((l51) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
