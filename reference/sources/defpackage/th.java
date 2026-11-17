package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class th {
    public static final int a;

    static {
        Object d92Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            d92Var = property != null ? jo2.O(property) : null;
        } catch (Throwable th) {
            d92Var = new d92(th);
        }
        Integer num = (Integer) (d92Var instanceof d92 ? null : d92Var);
        a = num != null ? num.intValue() : 2097152;
    }
}
