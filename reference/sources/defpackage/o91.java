package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class o91 implements m73 {
    public final i23 a;
    public final int b;

    public o91(i23 i23Var, int i) {
        this.a = i23Var;
        this.b = i;
    }

    @Override // defpackage.m73
    public final int a(e90 e90Var) {
        if ((this.b & 32) != 0) {
            return this.a.a(e90Var);
        }
        return 0;
    }

    @Override // defpackage.m73
    public final int b(e90 e90Var) {
        if ((this.b & 16) != 0) {
            return this.a.b(e90Var);
        }
        return 0;
    }

    @Override // defpackage.m73
    public final int c(e90 e90Var, u31 u31Var) {
        if ((this.b & (u31Var == u31.h ? 4 : 1)) != 0) {
            return this.a.c(e90Var, u31Var);
        }
        return 0;
    }

    @Override // defpackage.m73
    public final int d(e90 e90Var, u31 u31Var) {
        if ((this.b & (u31Var == u31.h ? 8 : 2)) != 0) {
            return this.a.d(e90Var, u31Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o91)) {
            return false;
        }
        o91 o91Var = (o91) obj;
        return this.a.equals(o91Var.a) && this.b == o91Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        if ((i & 9) == 9) {
            m02.B(sb, "Start");
        }
        if ((i & 10) == 10) {
            m02.B(sb, "Left");
        }
        if ((i & 16) == 16) {
            m02.B(sb, "Top");
        }
        if ((i & 6) == 6) {
            m02.B(sb, "End");
        }
        if ((i & 5) == 5) {
            m02.B(sb, "Right");
        }
        if ((i & 32) == 32) {
            m02.B(sb, "Bottom");
        }
        return "(" + this.a + " only " + wi0.h("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
