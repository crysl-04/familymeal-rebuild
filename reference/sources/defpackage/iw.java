package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class iw extends dl {
    public final ys0 j;
    public final long k;
    public final int l;
    public final int m;

    public iw(zs0 zs0Var, Runtime runtime) {
        super(Math.min(zs0Var.i, runtime.availableProcessors()), Math.min(zs0Var.h, runtime.maxMemory()));
        this.j = zs0Var.j;
        this.k = zs0Var.k;
        this.l = zs0Var.l;
        this.m = zs0Var.m;
    }

    @Override // defpackage.dl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof iw)) {
            return false;
        }
        iw iwVar = (iw) obj;
        return this.j.equals(iwVar.j) && this.k == iwVar.k && this.l == iwVar.l && this.m == iwVar.m;
    }

    @Override // defpackage.dl
    public int hashCode() {
        int iHashCode = (this.j.hashCode() + (super.hashCode() * 31)) * 31;
        long j = this.k;
        return ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.l) * 31) + this.m;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public iw(ys0 ys0Var, dl[] dlVarArr) {
        dl dlVar = dlVarArr[0];
        long j = dlVar.h;
        int i = dlVar.i;
        super(i, j);
        this.j = ys0Var;
        this.l = i / dlVarArr[dlVarArr.length - 1].i;
        dl dlVar2 = dlVarArr[1];
        this.k = dlVar2.h;
        this.m = i / dlVar2.i;
    }
}
