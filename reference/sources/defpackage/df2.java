package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class df2 {
    public static final df2 h;
    public static final /* synthetic */ df2[] i;

    static {
        df2 df2Var = new df2("Inherit", 0);
        h = df2Var;
        i = new df2[]{df2Var, new df2("SecureOn", 1), new df2("SecureOff", 2)};
    }

    public static df2 valueOf(String str) {
        return (df2) Enum.valueOf(df2.class, str);
    }

    public static df2[] values() {
        return (df2[]) i.clone();
    }
}
