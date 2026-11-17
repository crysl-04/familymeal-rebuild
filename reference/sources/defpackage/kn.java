package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kn extends tt1 {
    public final t8 e;
    public final long f;
    public final boolean g;
    public final long h;
    public float i;
    public ln j;

    public kn(t8 t8Var) {
        int i;
        long width = (((long) t8Var.a.getWidth()) << 32) | (((long) t8Var.a.getHeight()) & 4294967295L);
        this.e = t8Var;
        this.f = width;
        this.g = true;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & width)) < 0 || i2 > t8Var.a.getWidth() || i > t8Var.a.getHeight()) {
            wg.m("Failed requirement.");
            throw null;
        }
        this.h = width;
        this.i = 1.0f;
    }

    @Override // defpackage.tt1
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.tt1
    public final void b(ln lnVar) {
        this.j = lnVar;
    }

    @Override // defpackage.tt1
    public final long d() {
        return ou.G(this.h);
    }

    @Override // defpackage.tt1
    public final void e(td0 td0Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (td0Var.d() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (td0Var.d() & 4294967295L)));
        float f = this.i;
        ln lnVar = this.j;
        boolean z = this.g;
        td0.T(td0Var, this.e, this.f, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, lnVar, z ? 1 : 0, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        return uz0.g(this.e, knVar.e) && ny0.a(0L, 0L) && vy0.a(this.f, knVar.f) && this.g == knVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g ? 1 : 0) + jp1.d(this.f, this.e.hashCode() * 961, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String strD = ny0.d(0L);
        String strB = vy0.b(this.f);
        boolean z = this.g;
        if (z == 0) {
            str = "None";
        } else if (z == 1) {
            str = "Low";
        } else if (z == 2) {
            str = "Medium";
        } else {
            str = z == 3 ? "High" : "Unknown";
        }
        return "BitmapPainter(image=" + this.e + ", srcOffset=" + strD + ", srcSize=" + strB + ", filterQuality=" + str + ")";
    }
}
