package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class o11 {
    public static final ww0 a = ls.e(bo2.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final f21 a(n11 n11Var) {
        f21 f21Var = n11Var instanceof f21 ? (f21) n11Var : null;
        if (f21Var != null) {
            return f21Var;
        }
        throw new IllegalArgumentException("Element " + z72.a(n11Var.getClass()) + " is not a JsonPrimitive");
    }
}
