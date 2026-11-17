package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fi2 extends wg1 {
    public final hi2 h;
    public final boolean i;
    public final long j;
    public final long k;

    public fi2(hi2 hi2Var, boolean z, long j, long j2) {
        this.h = hi2Var;
        this.i = z;
        this.j = j;
        this.k = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi2)) {
            return false;
        }
        fi2 fi2Var = (fi2) obj;
        if (!cc0.b(3.0f, 3.0f) || !this.h.equals(fi2Var.h) || this.i != fi2Var.i) {
            return false;
        }
        long j = fi2Var.j;
        int i = kv.h;
        return r13.a(this.j, j) && r13.a(this.k, fi2Var.k);
    }

    @Override // defpackage.wg1
    public final qg1 f() {
        return new nn(new z61(this, (byte) 22));
    }

    @Override // defpackage.wg1
    public final void g(qg1 qg1Var) {
        pn1 pn1Var;
        nn nnVar = (nn) qg1Var;
        z61 z61Var = new z61(this, (byte) 22);
        nnVar.v = z61Var;
        if (!nnVar.h.u || (pn1Var = cu.W(nnVar, 2).C) == null) {
            return;
        }
        pn1Var.v1(z61Var, true);
    }

    public final int hashCode() {
        int iC = jp1.c((this.h.hashCode() - 943718400) * 31, 31, this.i);
        int i = kv.h;
        return Long.hashCode(this.k) + jp1.d(this.j, iC, 31);
    }

    public final String toString() {
        String strC = cc0.c(3.0f);
        String strH = kv.h(this.j);
        String strH2 = kv.h(this.k);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strC);
        sb.append(", shape=");
        sb.append(this.h);
        sb.append(", clip=");
        sb.append(this.i);
        sb.append(", ambientColor=");
        sb.append(strH);
        sb.append(", spotColor=");
        return wi0.i(sb, strH2, ")");
    }
}
