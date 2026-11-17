package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tu implements AutoCloseable, x20 {
    public final o20 h;

    public tu(o20 o20Var) {
        o20Var.getClass();
        this.h = o20Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ys.m(this.h, null);
    }

    @Override // defpackage.x20
    public final o20 f() {
        return this.h;
    }
}
