package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tj2 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final Object d;

    public tj2(boolean z, bg2 bg2Var, yq0 yq0Var) {
        this.a = (byte) 0;
        this.b = z;
        this.c = bg2Var;
        this.d = yq0Var;
    }

    public final h30 a() {
        yq0 yq0Var = (yq0) this.d;
        int i = yq0Var.b;
        int i2 = yq0Var.c;
        if (i < i2) {
            return h30.i;
        }
        return i > i2 ? h30.h : h30.j;
    }

    public final void b() {
        if (this.b) {
            ((kv2) this.d).n((qw2) this.c);
        }
    }

    public final long c(vv2 vv2Var, long j, boolean z, li1 li1Var) {
        kv2 kv2Var = (kv2) this.d;
        long jV = kv2Var.v(vv2Var, j, z, false, li1Var, false, null);
        if (!qw2.a(jV, (qw2) this.c)) {
            this.b = false;
        }
        kv2Var.r(qw2.c(jV) ? qs0.j : qs0.i);
        return jV;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + a() + ", info=\n\t" + ((yq0) this.d) + ")";
            default:
                return super.toString();
        }
    }

    public tj2(kv2 kv2Var) {
        this.a = (byte) 1;
        this.d = kv2Var;
        this.b = true;
    }
}
