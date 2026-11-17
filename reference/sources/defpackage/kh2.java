package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kh2 extends qf2 {
    public final /* synthetic */ AtomicReferenceArray g;

    public kh2(long j, kh2 kh2Var, int i) {
        super(j, kh2Var, i);
        this.g = new AtomicReferenceArray(jh2.f);
    }

    @Override // defpackage.qf2
    public final int f() {
        return jh2.f;
    }

    @Override // defpackage.qf2
    public final void g(int i, o20 o20Var) {
        this.g.set(i, jh2.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
