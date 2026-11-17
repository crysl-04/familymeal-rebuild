package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 implements r21 {
    public static final rc1 a = new rc1();
    public static final j32 b = new j32("kotlin.Long", d32.o);

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        return Long.valueOf(v60Var.b());
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        bVar.l(((Number) obj).longValue());
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
