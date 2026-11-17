package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yc1 implements e90 {
    public boolean h;
    public long i = 9223372034707292159L;
    public long j = 0;
    public final /* synthetic */ ad1 k;

    public yc1(ad1 ad1Var) {
        this.k = ad1Var;
    }

    public final t31 a() {
        this.h = true;
        ad1 ad1Var = this.k;
        t31 t31VarZ0 = ad1Var.z0();
        if (ny0.a(this.i, 9223372034707292159L)) {
            this.i = lt.d0(t31VarZ0.c(0L));
            this.j = t31VarZ0.O();
        }
        ad1Var.B0().M.b();
        return t31VarZ0;
    }

    @Override // defpackage.e90
    public final float b() {
        return this.k.b();
    }

    public final void c(pt0 pt0Var, float f) {
        ad1 ad1Var = this.k;
        fe feVar = ad1Var.x;
        if (feVar == null) {
            feVar = new fe();
            ad1Var.x = feVar;
        }
        int iZ = gi.Z((pt0[]) feVar.c, pt0Var);
        if (iZ >= 0) {
            float[] fArr = (float[]) feVar.d;
            if (fArr[iZ] != f) {
                fArr[iZ] = f;
                ((byte[]) feVar.e)[iZ] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) feVar.e;
                if (bArr[iZ] == 2) {
                    bArr[iZ] = 0;
                    return;
                }
                return;
            }
        }
        int i = feVar.b;
        pt0[] pt0VarArr = (pt0[]) feVar.c;
        if (i == pt0VarArr.length) {
            int i2 = i << 1;
            feVar.c = (pt0[]) Arrays.copyOf(pt0VarArr, i2);
            feVar.d = Arrays.copyOf((float[]) feVar.d, i2);
            feVar.e = Arrays.copyOf((byte[]) feVar.e, i2);
        }
        ((pt0[]) feVar.c)[i] = pt0Var;
        ((byte[]) feVar.e)[i] = 3;
        ((float[]) feVar.d)[i] = f;
        feVar.b++;
    }

    @Override // defpackage.e90
    public final float n() {
        return this.k.n();
    }
}
