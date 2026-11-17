package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xs2 extends ws2 {
    public final Runnable j;

    public xs2(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.j;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(s60.o(runnable));
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
