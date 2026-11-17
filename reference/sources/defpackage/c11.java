package defpackage;

import kotlinx.serialization.json.internal.a;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c11 {
    public static final b11 d = new b11(new j11(false, false, true, "    ", "type", true, bu.j, true, 400), s60.z0);
    public final j11 a;
    public final jy1 b;
    public final g2 c = new g2((byte) 14);

    public c11(j11 j11Var, jy1 jy1Var) {
        this.a = j11Var;
        this.b = jy1Var;
    }

    public final Object a(r21 r21Var, String str) {
        r21Var.getClass();
        str.getClass();
        str.getClass();
        fe feVar = new fe(str, this.a);
        Object objA = new a(this, t81.OBJ, feVar, r21Var.d()).a(r21Var);
        if (feVar.f() == 10) {
            return objA;
        }
        fe.m(feVar, "Expected EOF after parsing, but had " + ((String) feVar.g).charAt(feVar.b - 1) + " instead", 0, null, 6);
        throw null;
    }
}
