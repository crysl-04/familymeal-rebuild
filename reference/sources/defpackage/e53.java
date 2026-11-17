package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface e53 {
    default z43 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default z43 b(Class cls, pi1 pi1Var) {
        return a(cls);
    }

    default z43 c(du duVar, pi1 pi1Var) {
        Class cls = duVar.a;
        cls.getClass();
        return b(cls, pi1Var);
    }
}
