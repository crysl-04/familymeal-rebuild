package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eo1 extends w implements s01 {
    public static final eo1 i = new eo1(c5.Z);

    @Override // defpackage.s01
    public final boolean b() {
        return true;
    }

    @Override // defpackage.s01
    public final ht h(z01 z01Var) {
        return fo1.h;
    }

    @Override // defpackage.s01
    public final CancellationException o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.s01
    public final jb0 r(vp0 vp0Var) {
        return fo1.h;
    }

    @Override // defpackage.s01
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.s01
    public final jb0 w(boolean z, boolean z2, i iVar) {
        return fo1.h;
    }

    @Override // defpackage.s01
    public final Object x(m10 m10Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.s01
    public final void a(CancellationException cancellationException) {
    }
}
