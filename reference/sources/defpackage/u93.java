package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u93 implements j91, iq0 {
    public final /* synthetic */ jz a;

    public u93(jz jzVar) {
        this.a = jzVar;
    }

    @Override // defpackage.iq0
    public final hq0 b() {
        return new kq0(1, this.a, jz.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j91) && (obj instanceof iq0)) {
            return b().equals(((iq0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
