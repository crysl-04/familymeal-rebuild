package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h01 extends v01 {
    public static final /* synthetic */ long m = hi.a.objectFieldOffset(h01.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final i l;

    public h01(i iVar) {
        this.l = iVar;
    }

    @Override // defpackage.v01
    public final boolean m() {
        return true;
    }

    @Override // defpackage.v01
    public final void n(Throwable th) {
        if (hi.a.compareAndSwapInt(this, m, 0, 1)) {
            this.l.h(th);
        }
    }
}
