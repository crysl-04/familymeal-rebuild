package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k7 {
    public static final k7 h;
    public static final k7 i;
    public static final /* synthetic */ k7[] j;

    static {
        k7 k7Var = new k7("SHOW_ORIGINAL", 0);
        h = k7Var;
        k7 k7Var2 = new k7("SHOW_TRANSLATED", 1);
        i = k7Var2;
        j = new k7[]{k7Var, k7Var2};
    }

    public static k7 valueOf(String str) {
        return (k7) Enum.valueOf(k7.class, str);
    }

    public static k7[] values() {
        return (k7[]) j.clone();
    }
}
