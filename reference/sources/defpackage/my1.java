package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class my1 implements e90 {
    public boolean h;

    public static void i(my1 my1Var, ny1 ny1Var, int i, int i2) {
        my1Var.g(ny1Var);
        ny1Var.n0(ny0.c((((long) i) << 32) | (((long) i2) & 4294967295L), ny1Var.l), 0.0f, null);
    }

    public static void j(my1 my1Var, ny1 ny1Var, long j) {
        my1Var.g(ny1Var);
        ny1Var.n0(ny0.c(j, ny1Var.l), 0.0f, null);
    }

    public static void k(my1 my1Var, ny1 ny1Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (my1Var.c() == u31.h || my1Var.e() == 0) {
            my1Var.g(ny1Var);
            ny1Var.n0(ny0.c(j, ny1Var.l), 0.0f, null);
        } else {
            int iE = (my1Var.e() - ny1Var.h) - ((int) (j >> 32));
            my1Var.g(ny1Var);
            ny1Var.n0(ny0.c((((long) iE) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), ny1Var.l), 0.0f, null);
        }
    }

    public static void l(my1 my1Var, ny1 ny1Var, int i, int i2) {
        vw1 vw1Var = oy1.a;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (my1Var.c() == u31.h || my1Var.e() == 0) {
            my1Var.g(ny1Var);
            ny1Var.n0(ny0.c(j, ny1Var.l), 0.0f, vw1Var);
        } else {
            int iE = (my1Var.e() - ny1Var.h) - ((int) (j >> 32));
            my1Var.g(ny1Var);
            ny1Var.n0(ny0.c((((long) iE) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), ny1Var.l), 0.0f, vw1Var);
        }
    }

    public static void m(my1 my1Var, ny1 ny1Var, vp0 vp0Var) {
        my1Var.g(ny1Var);
        ny1Var.n0(ny0.c(0L, ny1Var.l), 0.0f, vp0Var);
    }

    public static void o(my1 my1Var, ny1 ny1Var, long j) {
        vw1 vw1Var = oy1.a;
        my1Var.g(ny1Var);
        ny1Var.n0(ny0.c(j, ny1Var.l), 0.0f, vw1Var);
    }

    public float a(pt0 pt0Var) {
        return Float.NaN;
    }

    public abstract u31 c();

    public abstract int e();

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ny1 ny1Var) {
        if (ny1Var instanceof eh1) {
            ((eh1) ny1Var).o(this.h);
        }
    }
}
