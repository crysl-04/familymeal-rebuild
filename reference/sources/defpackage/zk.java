package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class zk implements a1, mo2, z0, zj1, xj1, yj1 {
    public final xk h;

    public zk(xk xkVar) {
        this.h = xkVar;
    }

    public abstract void A0(long j, a1 a1Var, f32 f32Var);

    public abstract void D0(long j, tm tmVar, a1 a1Var);

    public void F0(dk1 dk1Var) {
        long jMin = Math.min(count(), dk1Var.count());
        for (long j = 0; j < jMin; j++) {
            dk1Var.B(j, G(j));
        }
    }

    public void G1(a1 a1Var, f32 f32Var) {
        A0(Math.min(a1Var.count(), count()), a1Var, f32Var);
    }

    public abstract void M0(long j, long j2, long j3, im imVar);

    public void O1(c23 c23Var) {
        d0(0L, ((ry1) this).i, 1L, c23Var);
    }

    @Override // defpackage.z0
    public final void S1(im imVar) {
        M0(0L, count(), 1L, imVar);
    }

    public final boolean a0() {
        return this.h.j.a();
    }

    public abstract void d0(long j, long j2, long j3, c23 c23Var);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk)) {
            return false;
        }
        xk xkVar = ((zk) obj).h;
        xk xkVar2 = this.h;
        if (xkVar2 == null) {
            if (xkVar != null) {
                return false;
            }
        } else if (!xkVar2.equals(xkVar)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        xk xkVar = this.h;
        return 31 + (xkVar == null ? 0 : xkVar.hashCode());
    }

    public abstract void j(long j, long j2, long j3, long j4);

    public String toString() {
        return a1.V0(this);
    }

    public void v1(tm tmVar, a1 a1Var) {
        D0(Math.min(count(), a1Var.count()), tmVar, a1Var);
    }

    public void w0(long j, im imVar) {
        M0(0L, j, 1L, imVar);
    }
}
