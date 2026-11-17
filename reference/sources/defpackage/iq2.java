package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class iq2 {
    public static final ie0 a = new ie0(new n62((byte) 14), (byte) 0);

    public static final void a(rg1 rg1Var, hi2 hi2Var, long j, long j2, float f, nx nxVar, dr0 dr0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            hi2Var = t03.A;
        }
        hi2 hi2Var2 = hi2Var;
        long jB = (i2 & 8) != 0 ? rv.b(j, dr0Var) : j2;
        float f2 = (i2 & 32) != 0 ? 0.0f : f;
        ie0 ie0Var = a;
        float f3 = ((cc0) dr0Var.j(ie0Var)).h + 0.0f;
        ys.b(new i42[]{s00.a.a(new kv(jB)), ie0Var.a(new cc0(f3))}, dt.N(421772006, new fq2(rg1Var, hi2Var2, j, f3, null, f2, nxVar), dr0Var), dr0Var, 56);
    }

    public static final void b(boolean z, kp0 kp0Var, rg1 rg1Var, boolean z2, hi2 hi2Var, long j, float f, zn znVar, ui1 ui1Var, nx nxVar, dr0 dr0Var, int i, int i2) {
        long jB = rv.b(j, dr0Var);
        float f2 = (i2 & 256) != 0 ? 0.0f : f;
        ui1 ui1Var2 = (i2 & 1024) != 0 ? null : ui1Var;
        if (ui1Var2 == null) {
            dr0Var.V(1528143336);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            ui1Var2 = (ui1) objK;
        } else {
            dr0Var.V(-227800369);
        }
        dr0Var.p(false);
        ui1 ui1Var3 = ui1Var2;
        ie0 ie0Var = a;
        float f3 = ((cc0) dr0Var.j(ie0Var)).h + 0.0f;
        ys.b(new i42[]{s00.a.a(new kv(jB)), ie0Var.a(new cc0(f3))}, dt.N(1508735219, new hq2(rg1Var, hi2Var, j, f3, znVar, z, ui1Var3, z2, kp0Var, f2, nxVar), dr0Var), dr0Var, 56);
    }

    public static final void c(kp0 kp0Var, rg1 rg1Var, boolean z, hi2 hi2Var, long j, long j2, float f, float f2, zn znVar, ui1 ui1Var, nx nxVar, dr0 dr0Var, int i, int i2) {
        ui1 ui1Var2;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        zn znVar2 = (i2 & 256) != 0 ? null : znVar;
        if (ui1Var == null) {
            dr0Var.V(-1701037204);
            Object objK = dr0Var.K();
            if (objK == zy.a) {
                objK = new ui1();
                dr0Var.f0(objK);
            }
            dr0Var.p(false);
            ui1Var2 = (ui1) objK;
        } else {
            dr0Var.V(2023337163);
            dr0Var.p(false);
            ui1Var2 = ui1Var;
        }
        ie0 ie0Var = a;
        float f4 = ((cc0) dr0Var.j(ie0Var)).h + f3;
        ys.b(new i42[]{s00.a.a(new kv(j2)), ie0Var.a(new cc0(f4))}, dt.N(849208527, new gq2(rg1Var, hi2Var, j, f4, znVar2, ui1Var2, z2, kp0Var, f2, nxVar), dr0Var), dr0Var, 56);
    }

    public static final rg1 d(rg1 rg1Var, hi2 hi2Var, long j, zn znVar, float f) {
        hi2 hi2Var2;
        rg1 rg1VarK0;
        rg1 ynVar = og1.h;
        if (f > 0.0f) {
            hi2Var2 = hi2Var;
            rg1VarK0 = h7.k0(ynVar, 0.0f, 0.0f, 0.0f, f, hi2Var2, 124895);
        } else {
            hi2Var2 = hi2Var;
            rg1VarK0 = ynVar;
        }
        rg1 rg1VarC = rg1Var.c(rg1VarK0);
        if (znVar != null) {
            ynVar = new yn(znVar.a, znVar.b, hi2Var2);
        }
        return ou.o(ie1.e(rg1VarC.c(ynVar), j, hi2Var2), hi2Var2);
    }

    public static final long e(long j, float f, dr0 dr0Var) {
        pv pvVar = (pv) dr0Var.j(rv.a);
        boolean zBooleanValue = ((Boolean) dr0Var.j(rv.b)).booleanValue();
        long j2 = pvVar.p;
        int i = kv.h;
        if (r13.a(j, j2) && zBooleanValue) {
            return cc0.b(f, 0.0f) ? j2 : cu.x(kv.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, pvVar.t), j2);
        }
        return j;
    }
}
