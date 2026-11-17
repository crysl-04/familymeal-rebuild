package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h32 {
    public static final f32 A;
    public static final f32 B;
    public static final f32 C;
    public static final e32 D;
    public static final g32 E;
    public static final e32 F;
    public static final e32 G;
    public static final e32 H;
    public static final f32 I;
    public static final double a = om.a.doubleValue();
    public static final double b = om.b.doubleValue();
    public static final double c = om.c.doubleValue();
    public static final double d;
    public static final double e;
    public static final double f;
    public static final double g;
    public static final double h;
    public static final double i;
    public static final double j;
    public static final double k;
    public static final double l;
    public static final double m;
    public static final double n;
    public static final double o;
    public static final double p;
    public static final e32 q;
    public static final e32 r;
    public static final f32 s;
    public static final e32 t;
    public static final e32 u;
    public static final f32 v;
    public static final e32 w;
    public static final f32 x;
    public static final e32 y;
    public static final e32 z;

    /* JADX WARN: Type inference failed for: r0v57, types: [f32] */
    /* JADX WARN: Type inference failed for: r0v60, types: [f32] */
    /* JADX WARN: Type inference failed for: r0v62, types: [f32] */
    /* JADX WARN: Type inference failed for: r0v65, types: [f32] */
    /* JADX WARN: Type inference failed for: r0v66, types: [f32] */
    /* JADX WARN: Type inference failed for: r0v67, types: [f32] */
    /* JADX WARN: Type inference failed for: r0v69, types: [g32] */
    /* JADX WARN: Type inference failed for: r0v73, types: [f32] */
    static {
        om.d.doubleValue();
        om.e.doubleValue();
        om.f.doubleValue();
        om.g.doubleValue();
        om.h.doubleValue();
        om.i.doubleValue();
        om.j.doubleValue();
        d = om.k.doubleValue();
        om.l.doubleValue();
        om.m.doubleValue();
        om.n.doubleValue();
        om.o.doubleValue();
        e = om.p.doubleValue();
        f = om.q.doubleValue();
        om.r.doubleValue();
        g = om.s.doubleValue();
        om.t.doubleValue();
        om.u.doubleValue();
        om.v.doubleValue();
        om.w.doubleValue();
        om.x.doubleValue();
        h = om.y.doubleValue();
        i = om.z.doubleValue();
        om.A.doubleValue();
        om.B.doubleValue();
        om.C.doubleValue();
        om.D.doubleValue();
        om.E.doubleValue();
        j = om.F.doubleValue();
        k = om.G.doubleValue();
        l = om.H.doubleValue();
        om.I.doubleValue();
        m = om.J.doubleValue();
        n = om.K.doubleValue();
        om.L.doubleValue();
        om.M.doubleValue();
        o = 2.220446049250313E-16d;
        p = 1.4901161193847656E-8d;
        q = new e32((byte) 0);
        r = new e32((byte) 1);
        final byte b2 = 4;
        s = new tm() { // from class: f32
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                return Double.valueOf(c(((Double) comparable).doubleValue(), ((Double) comparable2).doubleValue()));
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                switch (b2) {
                    case 0:
                        return Math.max(d2, d3);
                    case 1:
                        return Math.min(d2, d3);
                    case 2:
                        return d2 * d3;
                    case 3:
                        return Math.pow(d2, d3);
                    case 4:
                        return d2 + d3;
                    case 5:
                        return d2 - d3;
                    case 6:
                        return d2 / d3;
                    default:
                        return lg1.c(d2, d3);
                }
            }
        };
        t = new e32((byte) 11);
        u = new e32((byte) 12);
        final byte b3 = 6;
        v = new tm() { // from class: f32
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                return Double.valueOf(c(((Double) comparable).doubleValue(), ((Double) comparable2).doubleValue()));
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                switch (b3) {
                    case 0:
                        return Math.max(d2, d3);
                    case 1:
                        return Math.min(d2, d3);
                    case 2:
                        return d2 * d3;
                    case 3:
                        return Math.pow(d2, d3);
                    case 4:
                        return d2 + d3;
                    case 5:
                        return d2 - d3;
                    case 6:
                        return d2 / d3;
                    default:
                        return lg1.c(d2, d3);
                }
            }
        };
        w = new e32((byte) 13);
        final byte b4 = 7;
        x = new tm() { // from class: f32
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                return Double.valueOf(c(((Double) comparable).doubleValue(), ((Double) comparable2).doubleValue()));
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                switch (b4) {
                    case 0:
                        return Math.max(d2, d3);
                    case 1:
                        return Math.min(d2, d3);
                    case 2:
                        return d2 * d3;
                    case 3:
                        return Math.pow(d2, d3);
                    case 4:
                        return d2 + d3;
                    case 5:
                        return d2 - d3;
                    case 6:
                        return d2 / d3;
                    default:
                        return lg1.c(d2, d3);
                }
            }
        };
        y = new e32((byte) 2);
        z = new e32((byte) 3);
        final byte b5 = 0;
        A = new tm() { // from class: f32
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                return Double.valueOf(c(((Double) comparable).doubleValue(), ((Double) comparable2).doubleValue()));
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                switch (b5) {
                    case 0:
                        return Math.max(d2, d3);
                    case 1:
                        return Math.min(d2, d3);
                    case 2:
                        return d2 * d3;
                    case 3:
                        return Math.pow(d2, d3);
                    case 4:
                        return d2 + d3;
                    case 5:
                        return d2 - d3;
                    case 6:
                        return d2 / d3;
                    default:
                        return lg1.c(d2, d3);
                }
            }
        };
        final byte b6 = 1;
        B = new tm() { // from class: f32
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                return Double.valueOf(c(((Double) comparable).doubleValue(), ((Double) comparable2).doubleValue()));
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                switch (b6) {
                    case 0:
                        return Math.max(d2, d3);
                    case 1:
                        return Math.min(d2, d3);
                    case 2:
                        return d2 * d3;
                    case 3:
                        return Math.pow(d2, d3);
                    case 4:
                        return d2 + d3;
                    case 5:
                        return d2 - d3;
                    case 6:
                        return d2 / d3;
                    default:
                        return lg1.c(d2, d3);
                }
            }
        };
        final byte b7 = 2;
        C = new tm() { // from class: f32
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                return Double.valueOf(c(((Double) comparable).doubleValue(), ((Double) comparable2).doubleValue()));
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                switch (b7) {
                    case 0:
                        return Math.max(d2, d3);
                    case 1:
                        return Math.min(d2, d3);
                    case 2:
                        return d2 * d3;
                    case 3:
                        return Math.pow(d2, d3);
                    case 4:
                        return d2 + d3;
                    case 5:
                        return d2 - d3;
                    case 6:
                        return d2 / d3;
                    default:
                        return lg1.c(d2, d3);
                }
            }
        };
        D = new e32((byte) 5);
        E = new gu1() { // from class: g32
            public final /* synthetic */ byte a = 0;

            @Override // defpackage.gu1
            public final Comparable e(int i2, Comparable comparable) {
                return Double.valueOf(f(i2, ((Double) comparable).doubleValue()));
            }

            @Override // defpackage.gu1
            public final double f(int i2, double d2) {
                switch (this.a) {
                    case 0:
                        return lg1.d(i2, d2);
                    default:
                        BigDecimal[] bigDecimalArr = lg1.a;
                        if (i2 == 0) {
                            return 1.0d;
                        }
                        int i3 = 1;
                        if (i2 < 0) {
                            while (i2 < 0) {
                                i3 *= 10;
                                i2++;
                            }
                            double d3 = i3;
                            return d3 * Math.rint(d3 / d2);
                        }
                        while (i2 > 0) {
                            i3 *= 10;
                            i2--;
                        }
                        double d4 = i3;
                        return Math.rint(d2 * d4) / d4;
                }
            }
        };
        F = new e32((byte) 7);
        G = new e32((byte) 8);
        H = new e32((byte) 9);
        final byte b8 = 5;
        I = new tm() { // from class: f32
            @Override // defpackage.tm
            public final Comparable a(Comparable comparable, Comparable comparable2) {
                return Double.valueOf(c(((Double) comparable).doubleValue(), ((Double) comparable2).doubleValue()));
            }

            @Override // defpackage.tm
            public final double c(double d2, double d3) {
                switch (b8) {
                    case 0:
                        return Math.max(d2, d3);
                    case 1:
                        return Math.min(d2, d3);
                    case 2:
                        return d2 * d3;
                    case 3:
                        return Math.pow(d2, d3);
                    case 4:
                        return d2 + d3;
                    case 5:
                        return d2 - d3;
                    case 6:
                        return d2 / d3;
                    default:
                        return lg1.c(d2, d3);
                }
            }
        };
    }
}
