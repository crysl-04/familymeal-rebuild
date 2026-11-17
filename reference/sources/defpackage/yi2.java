package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yi2 implements r21 {
    public static final yi2 a = new yi2();
    public static final j32 b = new j32("kotlin.Short", d32.p);

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        return Short.valueOf(v60Var.A());
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        bVar.q(((Number) obj).shortValue());
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
