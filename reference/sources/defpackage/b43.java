package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b43 {
    public static final b43 h;
    public static final b43 i;
    public static final /* synthetic */ b43[] j;

    static {
        b43 b43Var = new b43("Lsq2", 0);
        h = b43Var;
        b43 b43Var2 = new b43("Impulse", 1);
        i = b43Var2;
        j = new b43[]{b43Var, b43Var2};
    }

    public static b43 valueOf(String str) {
        return (b43) Enum.valueOf(b43.class, str);
    }

    public static b43[] values() {
        return (b43[]) j.clone();
    }
}
