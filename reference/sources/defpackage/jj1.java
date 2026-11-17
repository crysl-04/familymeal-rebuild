package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jj1 extends kj1 implements q21, vp0 {
    public jj1(String str, String str2) {
        super(jq.h, bh2.class, str, str2, 1);
    }

    @Override // defpackage.kq
    public final k21 d() {
        z72.a.getClass();
        return this;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        j();
        throw null;
    }

    public final void j() {
        if (this.n) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        k21 k21VarG = g();
        if (k21VarG == this) {
            throw new b30("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((jj1) ((q21) k21VarG)).j();
    }
}
