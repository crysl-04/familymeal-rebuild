package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class nh0 extends q20 {
    public static final /* synthetic */ int m = 0;
    public long j;
    public boolean k;
    public ih l;

    public final void j(boolean z) {
        long j = this.j - (z ? 4294967296L : 1L);
        this.j = j;
        if (j > 0 || !this.k) {
            return;
        }
        shutdown();
    }

    public final void k(va0 va0Var) {
        ih ihVar = this.l;
        if (ihVar == null) {
            ihVar = new ih();
            this.l = ihVar;
        }
        ihVar.addLast(va0Var);
    }

    public final void l(boolean z) {
        this.j = (z ? 4294967296L : 1L) + this.j;
        if (z) {
            return;
        }
        this.k = true;
    }

    public abstract long q();

    public final boolean s() {
        ih ihVar = this.l;
        if (ihVar == null) {
            return false;
        }
        va0 va0Var = (va0) (ihVar.isEmpty() ? null : ihVar.removeFirst());
        if (va0Var == null) {
            return false;
        }
        va0Var.run();
        return true;
    }

    public abstract void shutdown();
}
