package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k10 implements x20 {
    public final o20 h;

    public k10(o20 o20Var) {
        this.h = o20Var;
    }

    @Override // defpackage.x20
    public final o20 f() {
        return this.h;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.h + ')';
    }
}
