package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a23 implements r21 {
    public static final a23 a = new a23();
    public static final ww0 b = ls.e(yi2.a, "kotlin.UShort");

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        return new w13(v60Var.x(b).A());
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        bVar.i(b).q(((w13) obj).h);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
