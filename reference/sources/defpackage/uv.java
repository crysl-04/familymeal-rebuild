package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uv {
    public static final float[] a;
    public static final float[] b;
    public static final dz2 c;
    public static final dz2 d;
    public static final s92 e;
    public static final s92 f;
    public static final s92 g;
    public static final s92 h;
    public static final s92 i;
    public static final s92 j;
    public static final s92 k;
    public static final s92 l;
    public static final s92 m;
    public static final s92 n;
    public static final s92 o;
    public static final s92 p;
    public static final s92 q;
    public static final s92 r;
    public static final l31 s;
    public static final l31 t;
    public static final s92 u;
    public static final s92 v;
    public static final s92 w;
    public static final bq1 x;
    public static final sv[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        dz2 dz2Var = new dz2(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        dz2 dz2Var2 = new dz2(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        dz2 dz2Var3 = new dz2(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = dz2Var3;
        dz2 dz2Var4 = new dz2(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = dz2Var4;
        g73 g73Var = s60.W;
        s92 s92Var = new s92("sRGB IEC61966-2.1", fArr, g73Var, dz2Var, 0);
        e = s92Var;
        s92 s92Var2 = new s92("sRGB IEC61966-2.1 (Linear)", fArr, g73Var, 1.0d, 0.0f, 1.0f, 1);
        f = s92Var2;
        s92 s92Var3 = new s92("scRGB-nl IEC 61966-2-2:2003", fArr, g73Var, null, new wg((byte) 3), new wg((byte) 4), -0.799f, 2.399f, dz2Var, 2);
        g = s92Var3;
        s92 s92Var4 = new s92("scRGB IEC 61966-2-2:2003", fArr, g73Var, 1.0d, -0.5f, 7.499f, 3);
        h = s92Var4;
        s92 s92Var5 = new s92("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, g73Var, new dz2(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = s92Var5;
        s92 s92Var6 = new s92("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, g73Var, new dz2(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = s92Var6;
        s92 s92Var7 = new s92("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new g73(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = s92Var7;
        s92 s92Var8 = new s92("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, g73Var, dz2Var, 7);
        l = s92Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        s92 s92Var9 = new s92("NTSC (1953)", fArr2, s60.T, new dz2(d4, d5, d6, d2, d3), 8);
        m = s92Var9;
        s92 s92Var10 = new s92("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, g73Var, new dz2(d4, d5, d6, d2, d3), 9);
        n = s92Var10;
        s92 s92Var11 = new s92("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, g73Var, 2.2d, 0.0f, 1.0f, 10);
        o = s92Var11;
        s92 s92Var12 = new s92("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, s60.U, new dz2(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = s92Var12;
        g73 g73Var2 = s60.V;
        s92 s92Var13 = new s92("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, g73Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = s92Var13;
        s92 s92Var14 = new s92("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, g73Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = s92Var14;
        l31 l31Var = new l31("Generic XYZ", 12884901889L, 14, (byte) 1);
        s = l31Var;
        l31 l31Var2 = new l31("Generic L*a*b*", 12884901890L, 15, (byte) 0);
        t = l31Var2;
        s92 s92Var15 = new s92("None", fArr, g73Var, dz2Var2, 16);
        u = s92Var15;
        s92 s92Var16 = new s92("Hybrid Log Gamma encoding", fArr3, g73Var, null, new wg((byte) 5), new wg((byte) 6), 0.0f, 1.0f, dz2Var3, 17);
        v = s92Var16;
        s92 s92Var17 = new s92("Perceptual Quantizer encoding", fArr3, g73Var, null, new wg((byte) 7), new wg((byte) 8), 0.0f, 1.0f, dz2Var4, 18);
        w = s92Var17;
        bq1 bq1Var = new bq1("Oklab", 12884901890L, 19);
        x = bq1Var;
        y = new sv[]{s92Var, s92Var2, s92Var3, s92Var4, s92Var5, s92Var6, s92Var7, s92Var8, s92Var9, s92Var10, s92Var11, s92Var12, s92Var13, s92Var14, l31Var, l31Var2, s92Var15, s92Var16, s92Var17, bq1Var};
    }

    public static double a(dz2 dz2Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = dz2Var.b;
        double d6 = dz2Var.c;
        double d7 = dz2Var.d;
        double d8 = dz2Var.e;
        double d9 = dz2Var.f;
        double d10 = d5 * d4;
        return (dz2Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(dz2 dz2Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / dz2Var.b;
        double d5 = 1.0d / dz2Var.c;
        double d6 = 1.0d / dz2Var.d;
        double d7 = dz2Var.e;
        double d8 = dz2Var.f;
        double d9 = (d2 * d3) / (dz2Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(dz2 dz2Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = dz2Var.b;
        double d6 = dz2Var.d;
        double dPow = (Math.pow(d4, d6) * dz2Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * dz2Var.f) + dz2Var.e), dz2Var.g) * d3;
    }

    public static double d(dz2 dz2Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -dz2Var.b;
        double d6 = dz2Var.e;
        double d7 = 1.0d / dz2Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-dz2Var.f)) + dz2Var.c), 1.0d / dz2Var.d) * d3;
    }
}
