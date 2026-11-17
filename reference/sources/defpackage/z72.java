package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class z72 {
    public static final a82 a;

    static {
        a82 a82Var = null;
        try {
            a82Var = (a82) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (a82Var == null) {
            a82Var = new a82();
        }
        a = a82Var;
    }

    public static du a(Class cls) {
        a.getClass();
        return new du(cls);
    }
}
