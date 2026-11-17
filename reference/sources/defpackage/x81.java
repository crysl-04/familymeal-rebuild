package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x81 {
    public static final x81 h;
    public static final x81 i;
    public static final x81 j;
    public static final x81 k;
    public static final x81 l;
    public static final /* synthetic */ x81[] m;

    static {
        x81 x81Var = new x81("DESTROYED", 0);
        h = x81Var;
        x81 x81Var2 = new x81("INITIALIZED", 1);
        i = x81Var2;
        x81 x81Var3 = new x81("CREATED", 2);
        j = x81Var3;
        x81 x81Var4 = new x81("STARTED", 3);
        k = x81Var4;
        x81 x81Var5 = new x81("RESUMED", 4);
        l = x81Var5;
        m = new x81[]{x81Var, x81Var2, x81Var3, x81Var4, x81Var5};
    }

    public static x81 valueOf(String str) {
        return (x81) Enum.valueOf(x81.class, str);
    }

    public static x81[] values() {
        return (x81[]) m.clone();
    }
}
