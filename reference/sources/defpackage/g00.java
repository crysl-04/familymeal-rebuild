package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g00 {
    public static final si1 a;

    static {
        s92 s92Var = uv.e;
        int i = s92Var.c;
        d00 d00Var = new d00(s92Var, s92Var, 1);
        int i2 = s92Var.c;
        bq1 bq1Var = uv.x;
        int i3 = (bq1Var.c << 6) | i2;
        f00 f00Var = new f00(s92Var, bq1Var, 0);
        int i4 = bq1Var.c | (i2 << 6);
        f00 f00Var2 = new f00(bq1Var, s92Var, 0);
        si1 si1Var = my0.a;
        si1 si1Var2 = new si1();
        si1Var2.h(i | (i << 6), d00Var);
        si1Var2.h(i3, f00Var);
        si1Var2.h(i4, f00Var2);
        a = si1Var2;
    }
}
