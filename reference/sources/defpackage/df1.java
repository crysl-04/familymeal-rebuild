package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class df1 {
    public static final df1 h;
    public static final df1 i;
    public static final /* synthetic */ df1[] j;

    static {
        df1 df1Var = new df1("Min", 0);
        h = df1Var;
        df1 df1Var2 = new df1("Max", 1);
        i = df1Var2;
        j = new df1[]{df1Var, df1Var2};
    }

    public static df1 valueOf(String str) {
        return (df1) Enum.valueOf(df1.class, str);
    }

    public static df1[] values() {
        return (df1[]) j.clone();
    }
}
