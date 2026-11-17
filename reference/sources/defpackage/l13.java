package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l13 implements r21 {
    public static final l13 a = new l13();
    public static final ww0 b = ls.e(xp.a, "kotlin.UByte");

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        return new h13(v60Var.x(b).v());
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        bVar.i(b).c(((h13) obj).h);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
