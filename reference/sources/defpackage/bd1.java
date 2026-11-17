package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bd1 extends my1 {
    public final /* synthetic */ byte i;
    public final Object j;

    public /* synthetic */ bd1(Object obj, byte b) {
        this.i = b;
        this.j = obj;
    }

    @Override // defpackage.my1
    public final float a(pt0 pt0Var) {
        vp0 vp0Var;
        int iZ;
        it1 snapshotObserver;
        int iZ2;
        switch (this.i) {
            case 0:
                zp0 zp0Var = pt0Var.a;
                if (zp0Var != null) {
                    return ((Number) zp0Var.f(this, Float.valueOf(Float.NaN))).floatValue();
                }
                ad1 ad1Var = (ad1) this.j;
                if (ad1Var.v) {
                    return Float.NaN;
                }
                x72 x72Var = new x72();
                x72Var.h = ad1Var;
                while (true) {
                    fe feVar = ((ad1) x72Var.h).x;
                    float f = (feVar == null || (iZ2 = gi.Z((pt0[]) feVar.c, pt0Var)) < 0) ? Float.NaN : ((float[]) feVar.d)[iZ2];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = x72Var.h;
                    if (!zIsNaN) {
                        ((ad1) obj).q0(ad1Var.B0(), pt0Var);
                        return pt0Var.a(f, ((ad1) x72Var.h).z0(), ad1Var.z0());
                    }
                    ad1 ad1Var2 = (ad1) obj;
                    zp0 zp0Var2 = ad1Var2.o;
                    if (zp0Var2 != null && (vp0Var = ad1Var2.p) != null && ((Boolean) vp0Var.h(pt0Var)).booleanValue()) {
                        ad1 ad1Var3 = (ad1) x72Var.h;
                        mj1 mj1Var = ad1Var3.r;
                        if (mj1Var == null) {
                            long[] jArr = bd2.a;
                            mj1Var = new mj1();
                            ad1Var3.r = mj1Var;
                        }
                        Object objG = mj1Var.g(pt0Var);
                        if (objG == null) {
                            objG = new py1(ad1Var3.C0(), ad1Var3, pt0Var);
                            mj1Var.n(pt0Var, objG);
                        }
                        py1 py1Var = (py1) objG;
                        py1Var.h = ad1Var3.C0();
                        t6 t6Var = ad1Var.B0().u;
                        if (t6Var != null && (snapshotObserver = t6Var.getSnapshotObserver()) != null) {
                            snapshotObserver.a.d(py1Var, ad1.A, new zi((Object) zp0Var2, (Object) x72Var, (Object) pt0Var, (byte) 6));
                        }
                        ((ad1) x72Var.h).q0(ad1Var.B0(), pt0Var);
                        fe feVar2 = ((ad1) x72Var.h).x;
                        float f2 = (feVar2 == null || (iZ = gi.Z((pt0[]) feVar2.c, pt0Var)) < 0) ? Float.NaN : ((float[]) feVar2.d)[iZ];
                        if (!Float.isNaN(f2)) {
                            return pt0Var.a(f2, ((ad1) x72Var.h).z0(), ad1Var.z0());
                        }
                    }
                    ad1 ad1VarD0 = ((ad1) x72Var.h).D0();
                    if (ad1VarD0 == null) {
                        ((ad1) x72Var.h).q0(ad1Var.B0(), pt0Var);
                        return Float.NaN;
                    }
                    x72Var.h = ad1VarD0;
                }
                break;
            default:
                return super.a(pt0Var);
        }
    }

    @Override // defpackage.e90
    public final float b() {
        byte b = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                return ((ad1) obj).b();
            default:
                return ((t6) obj).getDensity().b();
        }
    }

    @Override // defpackage.my1
    public final u31 c() {
        byte b = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                return ((ad1) obj).getLayoutDirection();
            default:
                return ((t6) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.my1
    public final int e() {
        byte b = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                return ((ad1) obj).k0();
            default:
                return ((t6) obj).getRoot().M.p.h;
        }
    }

    @Override // defpackage.e90
    public final float n() {
        byte b = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                return ((ad1) obj).n();
            default:
                return ((t6) obj).getDensity().n();
        }
    }
}
