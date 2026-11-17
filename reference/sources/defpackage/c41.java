package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface c41 extends j80 {
    default int E(ad1 ad1Var, ue1 ue1Var, int i) {
        return e(new a01(ad1Var, ad1Var.getLayoutDirection()), new i70(ue1Var, xn1.h, yn1.i, (byte) 2), l00.b(0, i, 0, 0, 13)).d();
    }

    default int S(ad1 ad1Var, ue1 ue1Var, int i) {
        return e(new a01(ad1Var, ad1Var.getLayoutDirection()), new i70(ue1Var, xn1.h, yn1.h, (byte) 2), l00.b(0, 0, 0, i, 7)).g();
    }

    af1 e(bf1 bf1Var, ue1 ue1Var, long j);

    default int g(ad1 ad1Var, ue1 ue1Var, int i) {
        return e(new a01(ad1Var, ad1Var.getLayoutDirection()), new i70(ue1Var, xn1.i, yn1.h, (byte) 2), l00.b(0, 0, 0, i, 7)).g();
    }

    default int p(ad1 ad1Var, ue1 ue1Var, int i) {
        return e(new a01(ad1Var, ad1Var.getLayoutDirection()), new i70(ue1Var, xn1.i, yn1.i, (byte) 2), l00.b(0, i, 0, 0, 13)).d();
    }
}
