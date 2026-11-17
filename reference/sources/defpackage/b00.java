package defpackage;

import java.math.MathContext;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b00 implements ul2 {
    public static final wo1 p = wo1.I(MathContext.DECIMAL64);
    public wo1 h;
    public transient g2 i;
    public int j;
    public v12 k;
    public transient l52 l;
    public transient l52 m;
    public transient l52 n;
    public transient l52 o;

    public static l52 a(l52 l52Var, int i) {
        if (l52Var == null || l52Var.i != i) {
            g52 g52Var = l52.q;
            return g52.R(i, 1);
        }
        l52Var.T1(Double.valueOf(h32.a));
        return l52Var;
    }

    @Override // defpackage.ul2
    public final gy1 j(int i, int i2, int i3) {
        if (i3 == 1) {
            g52 g52Var = l52.q;
            return g52.R(i2, i3);
        }
        wg.m("The RHS must have precisely 1 column!");
        return null;
    }
}
