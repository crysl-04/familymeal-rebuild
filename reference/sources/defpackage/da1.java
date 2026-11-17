package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class da1 extends nr0 implements u23 {
    public static final sk h = new sk(3);
    public static final sk i = new sk(4);
    public transient double[] f;
    public transient double[] g;

    public da1(ds1 ds1Var) {
        super(ds1Var);
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.u23
    public final double b(int i2) {
        double[] dArrN = this.g;
        if (dArrN == null) {
            dArrN = n();
            this.g = dArrN;
        }
        return dArrN[i2];
    }

    public abstract double[] m();

    public abstract double[] n();

    public final double o(int i2) {
        double[] dArrM = this.f;
        if (dArrM == null) {
            dArrM = m();
            this.f = dArrM;
        }
        return dArrM[i2];
    }
}
