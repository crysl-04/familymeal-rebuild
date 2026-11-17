package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p81 {
    public final lu1 A;
    public final lu1 B;
    public xt2 a;
    public final e72 b;
    public final ol2 c;
    public final ix0 d;
    public dw2 e;
    public final lu1 f;
    public final lu1 g;
    public t31 h;
    public final lu1 i;
    public od j;
    public final lu1 k;
    public final lu1 l;
    public final lu1 m;
    public final lu1 n;
    public final lu1 o;
    public boolean p;
    public final lu1 q;
    public final eg r;
    public final lu1 s;
    public final lu1 t;
    public vp0 u;
    public final v10 v;
    public final v10 w;
    public final v10 x;
    public final e9 y;
    public long z;

    public p81(xt2 xt2Var, e72 e72Var, ol2 ol2Var) {
        this.a = xt2Var;
        this.b = e72Var;
        this.c = ol2Var;
        ix0 ix0Var = new ix0((byte) 10);
        od odVar = pd.a;
        long j = qw2.b;
        vv2 vv2Var = new vv2(odVar, j, (qw2) null);
        ix0Var.i = vv2Var;
        ix0Var.j = new xe0(odVar, vv2Var.b);
        this.d = ix0Var;
        Boolean bool = Boolean.FALSE;
        this.f = rz1.x(bool);
        this.g = rz1.x(new cc0(0.0f));
        this.i = rz1.x(null);
        this.k = rz1.x(qs0.h);
        this.l = rz1.x(bool);
        this.m = rz1.x(bool);
        this.n = rz1.x(bool);
        this.o = rz1.x(bool);
        this.p = true;
        this.q = rz1.x(Boolean.TRUE);
        this.r = new eg(ol2Var);
        this.s = rz1.x(bool);
        this.t = rz1.x(bool);
        this.u = new vv0((byte) 22);
        this.v = new v10(this, (byte) 1);
        this.w = new v10(this, (byte) 2);
        this.x = new v10(this, (byte) 3);
        this.y = aa3.d();
        this.z = kv.g;
        this.A = rz1.x(new qw2(j));
        this.B = rz1.x(new qw2(j));
    }

    public final qs0 a() {
        return (qs0) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final t31 c() {
        t31 t31Var = this.h;
        if (t31Var == null || !t31Var.C()) {
            return null;
        }
        return t31Var;
    }

    public final kw2 d() {
        return (kw2) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new qw2(j));
    }

    public final void f(long j) {
        this.A.setValue(new qw2(j));
    }
}
