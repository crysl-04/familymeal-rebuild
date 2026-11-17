package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class y83 {
    public static final si1 a;
    public static final w83[] b;

    static {
        si1 si1Var = new si1(8);
        w83.a.getClass();
        x83 x83Var = v83.g;
        si1Var.h(1, x83Var);
        x83 x83Var2 = v83.f;
        si1Var.h(2, x83Var2);
        x83 x83Var3 = v83.b;
        si1Var.h(4, x83Var3);
        x83 x83Var4 = v83.d;
        si1Var.h(8, x83Var4);
        x83 x83Var5 = v83.h;
        si1Var.h(16, x83Var5);
        x83 x83Var6 = v83.e;
        si1Var.h(32, x83Var6);
        x83 x83Var7 = v83.i;
        si1Var.h(64, x83Var7);
        x83 x83Var8 = v83.c;
        si1Var.h(128, x83Var8);
        a = si1Var;
        b = new w83[]{x83Var, x83Var2, x83Var3, x83Var7, x83Var5, x83Var6, x83Var4, v83.j, x83Var8};
    }

    public static final void a(yc1 yc1Var, hx0 hx0Var, long j, int i, int i2) {
        if (rz1.l(j, -1L)) {
            return;
        }
        yc1Var.c(hx0Var.b, (int) ((j >>> 48) & 65535));
        yc1Var.c(hx0Var.c, (int) ((j >>> 32) & 65535));
        yc1Var.c(hx0Var.d, i - ((int) ((j >>> 16) & 65535)));
        yc1Var.c(hx0Var.e, i2 - ((int) (j & 65535)));
    }
}
