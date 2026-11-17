package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class mn0 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile dm2 b = new dm2(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new nn0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new nn0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new nn0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new nn0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new nn0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        cx0.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static ln0 a(float f) {
        float fB;
        ln0 nn0Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        dm2 dm2Var = b;
        int i = (int) (f * 100.0f);
        dm2Var.getClass();
        ln0 ln0Var = (ln0) aa3.g(dm2Var, i);
        if (ln0Var != null) {
            return ln0Var;
        }
        dm2 dm2Var2 = b;
        if (dm2Var2.h) {
            aa3.o(dm2Var2);
        }
        int iH = s60.h(dm2Var2.k, i, dm2Var2.i);
        dm2 dm2Var3 = b;
        if (iH >= 0) {
            return (ln0) dm2Var3.e(iH);
        }
        int i2 = -(iH + 1);
        int i3 = i2 - 1;
        if (i2 >= dm2Var3.d()) {
            nn0 nn0Var2 = new nn0(new float[]{1.0f}, new float[]{f});
            b(f, nn0Var2);
            return nn0Var2;
        }
        if (i3 < 0) {
            nn0Var = new nn0(fArr, fArr);
            fB = 1.0f;
        } else {
            fB = b.b(i3) / 100.0f;
            nn0Var = (ln0) b.e(i3);
        }
        float fB2 = b.b(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fB == fB2 ? 0.0f : (f - fB) / (fB2 - fB))) * 1.0f) + 0.0f;
        ln0 ln0Var2 = (ln0) b.e(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB3 = nn0Var.b(f2);
            fArr2[i4] = ((ln0Var2.b(f2) - fB3) * fMax) + fB3;
        }
        nn0 nn0Var3 = new nn0(fArr, fArr2);
        b(f, nn0Var3);
        return nn0Var3;
    }

    public static void b(float f, nn0 nn0Var) {
        synchronized (c) {
            dm2 dm2VarA = b.clone();
            dm2VarA.c((int) (f * 100.0f), nn0Var);
            b = dm2VarA;
        }
    }
}
