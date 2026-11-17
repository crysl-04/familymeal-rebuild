package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 extends qh0 {
    public final Runnable j;

    public ph0(long j, Runnable runnable) {
        super(j);
        this.j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.run();
    }

    @Override // defpackage.qh0
    public final String toString() {
        return super.toString() + this.j;
    }
}
