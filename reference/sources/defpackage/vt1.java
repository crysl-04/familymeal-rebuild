package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vt1 extends qg1 implements c41, sd0 {
    public ln A;
    public tt1 v;
    public boolean w;
    public dm x;
    public yy y;
    public float z;

    public static boolean K0(long j) {
        return !wj2.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean L0(long j) {
        return !wj2.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.c41
    public final int E(ad1 ad1Var, ue1 ue1Var, int i) {
        if (!J0()) {
            return ue1Var.d0(i);
        }
        long jM0 = M0(l00.b(0, i, 0, 0, 13));
        return Math.max(k00.j(jM0), ue1Var.d0(i));
    }

    public final boolean J0() {
        return this.w && this.v.d() != 9205357640488583168L;
    }

    public final long M0(long j) {
        boolean z = false;
        boolean z2 = k00.e(j) && k00.d(j);
        if (k00.g(j) && k00.f(j)) {
            z = true;
        }
        if ((!J0() && z2) || z) {
            return k00.b(j, k00.i(j), 0, k00.h(j), 0, 10);
        }
        long jD = this.v.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(l00.g(L0(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : k00.k(j), j))) << 32) | (((long) Float.floatToRawIntBits(l00.f(K0(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : k00.j(j), j))) & 4294967295L);
        if (J0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!L0(this.v.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.v.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!K0(this.v.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.v.d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : pz1.B(jFloatToRawIntBits2, this.y.g(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return k00.b(j, l00.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, l00.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        yq yqVar = n41Var.h;
        long jD = this.v.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(L0(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (yqVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(K0(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (yqVar.d() & 4294967295L)))) & 4294967295L);
        long jB = (Float.intBitsToFloat((int) (yqVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (yqVar.d() & 4294967295L)) == 0.0f) ? 0L : pz1.B(jFloatToRawIntBits, this.y.g(jFloatToRawIntBits, yqVar.d()));
        long jA = this.x.a((((long) Math.round(Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (yqVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (yqVar.d() & 4294967295L)))) & 4294967295L), n41Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((g2) yqVar.i.i).P(f, f2);
        try {
            this.v.c(n41Var, jB, this.z, this.A);
            ((g2) yqVar.i.i).P(-f, -f2);
            n41Var.a();
        } catch (Throwable th) {
            ((g2) yqVar.i.i).P(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.c41
    public final int S(ad1 ad1Var, ue1 ue1Var, int i) {
        if (!J0()) {
            return ue1Var.U(i);
        }
        long jM0 = M0(l00.b(0, 0, 0, i, 7));
        return Math.max(k00.k(jM0), ue1Var.U(i));
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        ny1 ny1VarE = ue1Var.e(M0(j));
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 6));
    }

    @Override // defpackage.c41
    public final int g(ad1 ad1Var, ue1 ue1Var, int i) {
        if (!J0()) {
            return ue1Var.a0(i);
        }
        long jM0 = M0(l00.b(0, 0, 0, i, 7));
        return Math.max(k00.k(jM0), ue1Var.a0(i));
    }

    @Override // defpackage.c41
    public final int p(ad1 ad1Var, ue1 ue1Var, int i) {
        if (!J0()) {
            return ue1Var.g(i);
        }
        long jM0 = M0(l00.b(0, i, 0, 0, 13));
        return Math.max(k00.j(jM0), ue1Var.g(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.v + ", sizeToIntrinsics=" + this.w + ", alignment=" + this.x + ", alpha=" + this.z + ", colorFilter=" + this.A + ")";
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
