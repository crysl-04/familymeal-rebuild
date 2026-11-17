package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 implements r21 {
    public static final oo1 a = new oo1();
    public static final no1 b = no1.a;

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        throw new wh2("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        ((Void) obj).getClass();
        throw new wh2("'kotlin.Nothing' cannot be serialized");
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return b;
    }
}
