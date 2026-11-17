package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g52 extends p02 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g52(byte b) {
        super((byte) 1);
        this.i = b;
    }

    public static l52 R(int i, int i2) {
        return new l52(i, i2, new double[i * i2]);
    }

    public final no2 Q(k1 k1Var) {
        int length;
        int iZ1 = k1Var.Z1();
        l52 l52VarR = R(iZ1, k1Var.T());
        double[] dArr = l52VarR.j;
        if (iZ1 > 0) {
            u8 u8Var = gj0.h;
            length = dArr.length / iZ1;
        } else {
            length = 0;
        }
        if (length > 256) {
            u8 u8Var2 = gj0.h;
            u8Var2.a = 256;
            u8Var2.b(0, length, new ej0(dArr, iZ1, (re1) k1Var, (byte) 1));
            return l52VarR;
        }
        re1 re1Var = (re1) k1Var;
        u8 u8Var3 = gj0.h;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = 0;
            while (i3 < iZ1) {
                dArr[i] = re1Var.J(i3, i2);
                i3++;
                i++;
            }
        }
        return l52VarR;
    }

    @Override // defpackage.ni0, defpackage.oi0
    public final no2 b(long j, long j2) {
        switch (this.i) {
            case 2:
                return new e62(Math.toIntExact(j), Math.toIntExact(j2));
            default:
                return super.b(j, j2);
        }
    }

    @Override // defpackage.p02
    /* JADX INFO: renamed from: g */
    public final y22 r() {
        switch (this.i) {
            case 0:
                return wh.k;
            default:
                return super.r();
        }
    }

    @Override // defpackage.qi0
    public final je1 l() {
        switch (this.i) {
            case 0:
                return je1.m;
            case 1:
                return je1.n;
            default:
                return je1.n;
        }
    }

    @Override // defpackage.ni0
    public final no2 q(int i, int i2) {
        switch (this.i) {
            case 0:
                return new h52(i, i2, new float[i * i2]);
            case 1:
                return R(i, i2);
            default:
                return new e62(i, i2);
        }
    }

    @Override // defpackage.p02, defpackage.fy1
    public final y22 r() {
        switch (this.i) {
            case 0:
                return wh.k;
            default:
                return super.r();
        }
    }
}
