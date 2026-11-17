package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fa2 {
    public static final fa2 h;
    public static final fa2 i;
    public static final /* synthetic */ fa2[] j;

    /* JADX INFO: Fake field, exist only in values array */
    fa2 EF0;

    static {
        fa2 fa2Var = new fa2("AUTOMATIC", 0);
        fa2 fa2Var2 = new fa2("TRUNCATE", 1);
        h = fa2Var2;
        fa2 fa2Var3 = new fa2("WRITE_AHEAD_LOGGING", 2);
        i = fa2Var3;
        j = new fa2[]{fa2Var, fa2Var2, fa2Var3};
    }

    public static fa2 valueOf(String str) {
        return (fa2) Enum.valueOf(fa2.class, str);
    }

    public static fa2[] values() {
        return (fa2[]) j.clone();
    }
}
